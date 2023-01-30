package com.sid.gl.mappers;

import com.sid.gl.dto.ElectionDTO;
import com.sid.gl.dto.UserDTO;
import com.sid.gl.models.Election;
import com.sid.gl.models.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class VotingMapper {

    public Election convertElection(ElectionDTO electionDTO){
        Election election = new Election();
        BeanUtils.copyProperties(electionDTO,election);
        return election;
    }

    public User convertUser(UserDTO userDTO){
        User user = new User();
        BeanUtils.copyProperties(userDTO,user);
        return user;
    }


}
