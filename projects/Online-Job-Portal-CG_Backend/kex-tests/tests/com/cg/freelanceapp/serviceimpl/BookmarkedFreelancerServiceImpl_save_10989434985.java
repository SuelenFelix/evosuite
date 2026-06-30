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

public class BookmarkedFreelancerServiceImpl_save_10989434985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675;

    public BookmarkedFreelancerServiceImpl_save_10989434985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term676 = new Long(-4920224193275732920L);
        Long term678 = new Long(8428634514691209827L);
        term675 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerDTO"));
        setField(term675, term675.getClass(), "recruiterId", term676);
        setField(term675, term675.getClass(), "freelancerId", term678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.serviceimpl.BookmarkedFreelancerServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerDTO");
        Object[] args = new Object[1];
        args[0] = term675;
        callMethod(klass, "save", argTypes, null, args);
    }

};


