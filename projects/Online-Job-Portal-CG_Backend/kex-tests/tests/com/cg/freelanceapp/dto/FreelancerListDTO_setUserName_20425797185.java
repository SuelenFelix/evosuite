package com.cg.freelanceapp.dto;

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
import static com.cg.freelanceapp.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class FreelancerListDTO_setUserName_20425797185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11394;

    public FreelancerListDTO_setUserName_20425797185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11395 = new Long(-7129626484175473918L);
        term11394 = newInstance(Class.forName("com.cg.freelanceapp.dto.FreelancerListDTO"));
        setField(term11394, term11394.getClass(), "id", term11395);
        setField(term11394, term11394.getClass(), "userName", "tjqgiPrtgj");
        setField(term11394, term11394.getClass(), "firstName", "atajdBiCpk");
        setField(term11394, term11394.getClass(), "lastName", "iZkNHOfNWw");
        setField(term11394, term11394.getClass(), "password", "SxvlCppquX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FreelancerListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KXtTCHHVWr";
        callMethod(klass, "setUserName", argTypes, term11394, args);
    }

};


