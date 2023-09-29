package util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Resources {
    LIST_USER ("/api/users?page=2");
    private final String resource;

}
