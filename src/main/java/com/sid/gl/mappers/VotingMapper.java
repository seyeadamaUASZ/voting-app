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
        election.setTitle_election(electionDTO.title_election());
        election.setDateEndElection(electionDTO.dateEnd());
        return election;
    }

    public ElectionDTO convertElectionDTO(Election election){
        return new ElectionDTO(election.getTitle_election(),election.getDateEndElection());
    }

    public User convertUser(UserDTO userDTO){
        User user = new User();
        BeanUtils.copyProperties(userDTO,user);
        return user;
    }


}
