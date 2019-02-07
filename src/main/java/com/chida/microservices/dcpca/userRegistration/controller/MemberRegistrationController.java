package com.chida.microservices.dcpca.userRegistration.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user-registration")
public class MemberRegistrationController {


    /////// Method to get all Members/////////////////////////
    @GetMapping
    public String getAllMembers(){

        return "All Members";
    }

    ///////// End of method /////////////////////////////////

    ///////// Method to get a particular user /////////////////////////////

    @GetMapping
    public String getUser() {
        return "a Member";
    }

    ///////////// End of Method //////////////////////////////////////////

    ///////////// Method to create a Member //////////////////////////////

    @PostMapping
    public String createMember(@RequestBody MemberDetailsRequestModel memberDetails ) {

        return "Create MEmbers was called";
    }

    //////////////////// End of Method //////////////////////////////////

    /////////////////// Method to Update a Member information ///////////
    @PutMapping
    public String updateMember() {

        return "Update Member was called";
    }

    /////////////////// End of Method ///////////////////////////////////

    ///////////////// Method to Delete a member //////////////////////////
    @DeleteMapping
    public String deleteMember () {

        return "delete a member was called";
    }
}
