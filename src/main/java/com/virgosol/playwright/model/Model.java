package com.virgosol.playwright.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

public class Model {

        @JsonProperty("key")
        private String key;
        @JsonProperty("value")
        private String value;
        @JsonProperty("type")
        private String type;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("key")
        public String getKey() {
            return key;
        }

        @JsonProperty("key")
        public void setKey(String key) {
            this.key = key;
        }

        @JsonProperty("value")
        public String getValue() {
            return value;
        }

        @JsonProperty("value")
        public void setValue(String value) {
            this.value = value;
        }

        @JsonProperty("type")
        public String getType() {
            return type;
        }

        @JsonProperty("type")
        public void setType(String type) {
            this.type = type;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

