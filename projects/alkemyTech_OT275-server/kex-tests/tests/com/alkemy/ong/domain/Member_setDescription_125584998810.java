package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Member_setDescription_125584998810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14959;

    public Member_setDescription_125584998810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14960 = new Long(-3753621038448351550L);
        term14959 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        Object term14974 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term14959, term14959.getClass(), "memberId", term14960);
        setField(term14959, term14959.getClass(), "name", "SEldZGJyvX");
        setField(term14974, term14974.getClass(), "facebookUrl", "vyvpqcHTQN");
        setField(term14974, term14974.getClass(), "linkedInUrl", "QQcpNMSHvA");
        setField(term14974, term14974.getClass(), "instagramUrl", "FLLklaMZvg");
        setField(term14959, term14959.getClass(), "socialMedia", term14974);
        setField(term14959, term14959.getClass(), "imageUrl", "jRDZpkFkoD");
        setField(term14959, term14959.getClass(), "description", "wwSknqIBIO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zQPAxUFaeX";
        callMethod(klass, "setDescription", argTypes, term14959, args);
    }

};


