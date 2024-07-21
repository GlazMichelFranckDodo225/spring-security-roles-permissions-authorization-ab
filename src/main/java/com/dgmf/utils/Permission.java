package com.dgmf.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {
    ADMIN_READ("Admin:Read"),
    ADMIN_UPDATE("Admin:Update"),
    ADMIN_CREATE("Admin:Create"),
    ADMIN_DELETE("Admin:Delete"),
    MANAGER_READ("Manager:Read"),
    MANAGER_UPDATE("Manager:Update"),
    MANAGER_CREATE("Manager:Create"),
    MANAGER_DELETE("Manager:Delete");

    @Getter
    private final String permission;
}
