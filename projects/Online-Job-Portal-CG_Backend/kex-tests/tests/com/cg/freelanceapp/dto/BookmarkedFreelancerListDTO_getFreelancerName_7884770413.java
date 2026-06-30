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

public class BookmarkedFreelancerListDTO_getFreelancerName_7884770413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12907;

    public BookmarkedFreelancerListDTO_getFreelancerName_7884770413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12908 = new Long(6636235983121346803L);
        term12907 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO"));
        setField(term12907, term12907.getClass(), "id", term12908);
        setField(term12907, term12907.getClass(), "freelancerName", "sEphiduvkv");
        setField(term12907, term12907.getClass(), "freelancerUName", "PbLgCSAHce");
        setField(term12907, term12907.getClass(), "recruiterName", "NWldOLAbqk");
        setField(term12907, term12907.getClass(), "recruiterUName", "qnYaYSpDwO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerName", argTypes, term12907, args);
    }

};


