package ntou.soselab.chatops4msa.Entity.Capability.MicroserviceSystem;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;

public class Service {

    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private URL url;
    @JsonProperty("repository")
    private URL repository;
    @JsonProperty("description")
    private String description;

    public String verify() {
        StringBuilder sb = new StringBuilder();
        if (name == null) sb.append("    name is null").append("\n");
        if (url == null) sb.append("    url is null").append("\n");
        if (repository == null) sb.append("    repository is null").append("\n");
        if (description == null) sb.append("    description is null").append("\n");
        return sb.toString();
    }
}
