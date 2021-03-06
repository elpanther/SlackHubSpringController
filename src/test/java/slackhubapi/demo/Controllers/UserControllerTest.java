package slackhubapi.demo.Controllers;

import slackhubapi.demo.Models.*;
import slackhubapi.demo.Repositories.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import java.util.Arrays;
import static org.junit.Assert.*;


public class UserControllerTest {
    @Test
    public void listAllUsers() throws Exception {
    }

    @Test
    public void createUser() throws Exception {
    }

    @Test
    public void getUserById() throws Exception {
    }

    @Test
    public void updateUserById() throws Exception {
    }

    @Test
    public void deleteUserById() throws Exception {
    }

}