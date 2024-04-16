package com.digitalnomads.api.api.demo.controllers;

import com.digitalnomads.api.api.demo.ApiRequest;
import io.restassured.response.Response;

import static com.digitalnomads.api.api.demo.application.TalentLMSBaseEndPoints.*;

public class UserController extends ApiRequest {
    public UserController(String url) {
        super(url, API_KEY);
    }
   public Response getAllUser(){
       return this.response = super.get(getEndpoint(API,V1,USERS));
    }
    public Response getUserBYEmail(String email){
        return this.response = super.getWithParams(getEndpoint(API,V1,USERS)
                  , generateParams(EMAIL,email));
    }
    public  Response isUserOnline(String id ) {
       return this.response = super.getWithParams(getEndpoint(API,V1),generateParams("user_id",id));
    }
}
