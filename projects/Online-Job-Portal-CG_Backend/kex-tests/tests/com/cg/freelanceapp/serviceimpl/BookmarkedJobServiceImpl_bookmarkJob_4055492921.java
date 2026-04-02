package com.cg.freelanceapp.serviceimpl;

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
import static com.cg.freelanceapp.serviceimpl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class BookmarkedJobServiceImpl_bookmarkJob_4055492921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term756;

    public BookmarkedJobServiceImpl_bookmarkJob_4055492921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term757 = new Long(6855071767938501807L);
        Long term759 = new Long(-5892135042702373494L);
        Long term761 = new Long(5262507301787091109L);
        term756 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobDTO"));
        setField(term756, term756.getClass(), "skillId", term757);
        setField(term756, term756.getClass(), "freelancerId", term759);
        setField(term756, term756.getClass(), "jobId", term761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.serviceimpl.BookmarkedJobServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobDTO");
        Object[] args = new Object[1];
        args[0] = term756;
        callMethod(klass, "bookmarkJob", argTypes, null, args);
    }

};


