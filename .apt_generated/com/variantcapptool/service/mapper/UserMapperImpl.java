package com.variantcapptool.service.mapper;

import com.variantcapptool.domain.Authority;
import com.variantcapptool.domain.User;
import com.variantcapptool.service.dto.UserDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-05-30T17:07:55+0530",
    comments = "version: 1.1.0.Final, compiler: Eclipse JDT (IDE) 3.12.0.v20160516-2131, environment: Java 1.8.0_77 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public List<UserDTO> usersToUserDTOs(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>();
        for ( User user : users ) {
            list.add( userToUserDTO( user ) );
        }

        return list;
    }

    @Override
    public User userDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDTO.getId() );
        user.setLogin( userDTO.getLogin() );
        user.setFirstName( userDTO.getFirstName() );
        user.setLastName( userDTO.getLastName() );
        user.setEmail( userDTO.getEmail() );
        user.setImageUrl( userDTO.getImageUrl() );
        user.setActivated( userDTO.isActivated() );
        user.setLangKey( userDTO.getLangKey() );
        Set<Authority> set = authoritiesFromStrings( userDTO.getAuthorities() );
        if ( set != null ) {
            user.setAuthorities( set );
        }

        return user;
    }

    @Override
    public List<User> userDTOsToUsers(List<UserDTO> userDTOs) {
        if ( userDTOs == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>();
        for ( UserDTO userDTO : userDTOs ) {
            list.add( userDTOToUser( userDTO ) );
        }

        return list;
    }
}
