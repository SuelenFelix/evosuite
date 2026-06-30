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

public class BookmarkedFreelancerListDTO_getFreelancerUName_14266597945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13111;

    public BookmarkedFreelancerListDTO_getFreelancerUName_14266597945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13112 = new Long(-1279670138064751276L);
        term13111 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO"));
        setField(term13111, term13111.getClass(), "id", term13112);
        setField(term13111, term13111.getClass(), "freelancerName", "coJPjrBZNe");
        setField(term13111, term13111.getClass(), "freelancerUName", "vMsWjuPTnO");
        setField(term13111, term13111.getClass(), "recruiterName", "zHvfKaOstO");
        setField(term13111, term13111.getClass(), "recruiterUName", "tOszriqETr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerUName", argTypes, term13111, args);
    }

};


