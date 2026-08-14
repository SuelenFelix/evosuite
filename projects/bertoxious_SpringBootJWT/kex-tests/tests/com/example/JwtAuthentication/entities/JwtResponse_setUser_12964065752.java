package com.example.JwtAuthentication.entities;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.example.JwtAuthentication.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JwtResponse_setUser_12964065752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283;
     Object term363;

    public JwtResponse_setUser_12964065752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term346 = new HashMap();
        Set<Object> term480 =  ((Map) term346).keySet();
        HashSet term345 = new HashSet((Collection<? extends Object>) term480);
        term283 = newInstance(Class.forName("com.example.JwtAuthentication.entities.JwtResponse"));
        Object term284 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term284, term284.getClass(), "userName", "MxlszYVzRf");
        setField(term284, term284.getClass(), "userFirstName", "LQFpaHEwXR");
        setField(term284, term284.getClass(), "userLastName", "oVcInYnLWB");
        setField(term284, term284.getClass(), "userPassword", "aJlieCFVtF");
        setField(term284, term284.getClass(), "confirmPassword", "ZiaGIbnzTs");
        setField(term284, term284.getClass(), "roles", term345);
        setField(term283, term283.getClass(), "user", term284);
        setField(term283, term283.getClass(), "jwtToken", "tbcdzjIfER");
        HashMap term425 = new HashMap();
        Set<Object> term541 =  ((Map) term425).keySet();
        HashSet term424 = new HashSet((Collection<? extends Object>) term541);
        term363 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term363, term363.getClass(), "userName", "HyxfbSQYBe");
        setField(term363, term363.getClass(), "userFirstName", "pCTimMblYc");
        setField(term363, term363.getClass(), "userLastName", "hNxWaHcfhY");
        setField(term363, term363.getClass(), "userPassword", "RkybSrpybU");
        setField(term363, term363.getClass(), "confirmPassword", "xOEqzGAmDU");
        setField(term363, term363.getClass(), "roles", term424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.JwtResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.JwtAuthentication.entities.User");
        Object[] args = new Object[1];
        args[0] = term363;
        callMethod(klass, "setUser", argTypes, term283, args);
    }

};


