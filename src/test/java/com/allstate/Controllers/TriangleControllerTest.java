package com.allstate.controllers;

import com.allstate.Controllers.TriangleController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(TriangleController.class)
public class TriangleControllerTest {
    @Autowired
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldComputeTheAreaForAListOfTriangles() throws Exception {
        MockHttpServletRequestBuilder request = post("/triangle/area")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[{\"width\":3, \"height\":4},{\"width\":5, \"height\":6}]");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.area", is(closeTo(21, 0.1))));
    }

    @Test
    public void shouldComputeTheDistance() throws Exception {
        MockHttpServletRequestBuilder request = post("/triangle/distance")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[{\"x\":3, \"y\":4},{\"x\":5, \"y\":6}]");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.distance", is(closeTo(2.83,0.1))));
    }
}