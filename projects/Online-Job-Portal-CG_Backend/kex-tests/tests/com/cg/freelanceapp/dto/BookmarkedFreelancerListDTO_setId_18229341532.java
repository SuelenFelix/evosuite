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

public class BookmarkedFreelancerListDTO_setId_18229341532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12814;
     Object term12865;

    public BookmarkedFreelancerListDTO_setId_18229341532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12815 = new Long(4742108233936970770L);
        term12814 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO"));
        setField(term12814, term12814.getClass(), "id", term12815);
        setField(term12814, term12814.getClass(), "freelancerName", "DGRqjjdhzy");
        setField(term12814, term12814.getClass(), "freelancerUName", "lQFkjJUPAR");
        setField(term12814, term12814.getClass(), "recruiterName", "BsuVlGUUjV");
        setField(term12814, term12814.getClass(), "recruiterUName", "bHHjfDCntT");
        term12865 = new Long(2722004046017350471L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12865;
        callMethod(klass, "setId", argTypes, term12814, args);
    }

};


