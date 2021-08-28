package org.stol.employees.layers.api.exceptions;

import lombok.NonNull;

public class NotFoundException extends RuntimeException {
    public NotFoundException(@NonNull String message) { super(message); }
}