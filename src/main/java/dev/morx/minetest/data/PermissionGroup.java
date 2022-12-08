package dev.morx.minetest.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class PermissionGroup {

    @Getter
    @Setter
    private String name;
    @Getter
    private int id;

    @Getter
    @Setter
    private String prefix;

}
