package com.sid.gl.controllers;

import com.sid.gl.dto.ElectionDTO;
import com.sid.gl.services.IVoting;
import com.sid.gl.utils.BasicResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/election")
public class ElectionControler {
    private IVoting iVoting;

    @PostMapping("/save")
    public ResponseEntity<BasicResponse> addElection(@Valid @RequestBody ElectionDTO electionDTO){
        BasicResponse basicResponse = new BasicResponse(200);
        basicResponse.setData(iVoting.addElection(electionDTO));
        return ResponseEntity.ok(basicResponse);
    }


    @GetMapping("/all")
    public ResponseEntity<BasicResponse> allElections(){
        BasicResponse basicResponse = new BasicResponse(200);
        basicResponse.setData(iVoting.listElections());
        return ResponseEntity.ok(basicResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BasicResponse> getElection(@PathVariable Long id){
        BasicResponse basicResponse = new BasicResponse(200);
        basicResponse.setData(iVoting.getElection(id));
        return ResponseEntity.ok(basicResponse);
    }



}
