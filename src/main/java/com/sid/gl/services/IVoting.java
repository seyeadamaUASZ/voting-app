package com.sid.gl.services;

import com.sid.gl.dto.ElectionDTO;
import com.sid.gl.models.Election;

import java.util.List;

public interface IVoting {
    // Manage Election
     List<ElectionDTO> listElections();
     Election addElection(ElectionDTO electionDTO);
     ElectionDTO getElection(Long id);




}
