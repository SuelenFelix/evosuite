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

public class BookmarkedFreelancerDTO_setFreelancerId_13306932304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13747;
     Object term13752;

    public BookmarkedFreelancerDTO_setFreelancerId_13306932304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13748 = new Long(-7001094993638840490L);
        Long term13750 = new Long(3077284143733577490L);
        term13747 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerDTO"));
        setField(term13747, term13747.getClass(), "recruiterId", term13748);
        setField(term13747, term13747.getClass(), "freelancerId", term13750);
        term13752 = new Long(4458302820344896046L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term13752;
        callMethod(klass, "setFreelancerId", argTypes, term13747, args);
    }

};


