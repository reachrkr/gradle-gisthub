package com.github.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Tree {

private String sha;
private String url;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getSha() {
return sha;
}

public void setSha(String sha) {
this.sha = sha;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}