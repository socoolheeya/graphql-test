package com.socoolheeya.graphqltest.experience.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Property {

    @Getter
    @AllArgsConstructor
    public enum Facility {
        TV("1", "TV"),
        SOFA("2", "Sofa"),
        GYM("3", "Gym");
        private final String code;
        private final String description;

        public static Facility get(Facility code) {
            for (Facility facility : values()) {
                if (facility.equals(code)) {
                    return code;
                }
            }
            return null;
        }
    }

    @Getter
    @AllArgsConstructor
    public enum Service {
        BABY_SITTER("1", "Baby_sitter"),
        WELCOME_TEA("2", "Welcome tea");
        private final String code;
        private final String description;

    }
}
