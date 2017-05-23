package com.yummy.bakery.utilities;

import com.yummy.bakery.model.dto.UserDto;
import com.yummy.bakery.model.entity.User;

public class Converter {

    public static User toUserEntity(UserDto userDto) {
        return new User(userDto.getEmail(), userDto.getUsername(),
                userDto.getPassword(), userDto.isEnabled());
    }
}
