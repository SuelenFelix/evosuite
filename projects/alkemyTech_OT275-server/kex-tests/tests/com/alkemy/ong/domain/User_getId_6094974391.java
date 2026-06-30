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

public class User_getId_6094974391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19635;

    public User_getId_6094974391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19636 = new Long(-6325201865655646423L);
        Long term19699 = new Long(-9093996849713569099L);
        term19635 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term19698 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term19635, term19635.getClass(), "id", term19636);
        setField(term19635, term19635.getClass(), "firstName", "OEeAVwVwuj");
        setField(term19635, term19635.getClass(), "lastName", "WEgFuDZsxi");
        setField(term19635, term19635.getClass(), "email", "kvcaSGNTHd");
        setField(term19635, term19635.getClass(), "password", "opXkGeBDoI");
        setField(term19635, term19635.getClass(), "imageUrl", "UHxidCtatV");
        setField(term19698, term19698.getClass(), "id", term19699);
        setField(term19698, term19698.getClass(), "name", "LRzADDSjVT");
        setField(term19698, term19698.getClass(), "description", "lpFCMaAYxj");
        setField(term19635, term19635.getClass(), "role", term19698);
        setField(term19635, term19635.getClass(), "token", "fzHVMNSLii");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term19635, args);
    }

};


