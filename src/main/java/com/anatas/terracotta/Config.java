package com.anatas.terracotta;

public enum Config {
    GATEWAY("terracotta"), AUTH_TOKEN("auth_token"), PORT("port"), HOST("host");

    private String description;

    private Config(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
