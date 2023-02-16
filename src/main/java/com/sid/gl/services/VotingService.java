package com.sid.gl.services;

import com.sid.gl.dto.ElectionDTO;
import com.sid.gl.mappers.VotingMapper;
import com.sid.gl.models.Election;
import com.sid.gl.repositories.ElectionRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@AllArgsConstructor
public class VotingService implements IVoting {
    private ElectionRepository electionRepository;
    private VotingMapper votingMapper;

    @Override
    public List<ElectionDTO> listElections() {
        log.info("get all elections ");
       return  this.electionRepository.findAll()
                .stream()
                .map(election -> this.votingMapper.convertElectionDTO(election))
                .collect(Collectors.toList());
    }

    @Override
    public Election addElection(ElectionDTO electionDTO) {
        log.info("body election to save {} ",electionDTO);
        return this.electionRepository.save(this.votingMapper.convertElection(electionDTO));
    }

    @Override
    public ElectionDTO getElection(Long id) {
        log.info("try to get one election with id {} ",id);
       Election election = this.electionRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Not found election with id"));
        return this.votingMapper.convertElectionDTO(election);
    }
}
