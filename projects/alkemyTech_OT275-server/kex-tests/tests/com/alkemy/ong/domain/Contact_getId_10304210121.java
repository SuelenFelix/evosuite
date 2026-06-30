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

public class Contact_getId_10304210121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10732;

    public Contact_getId_10304210121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10733 = new Long(-7400951017937830861L);
        term10732 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term10732, term10732.getClass(), "id", term10733);
        setField(term10732, term10732.getClass(), "name", "loHiudJxbt");
        setField(term10732, term10732.getClass(), "phone", "lRbxbybNew");
        setField(term10732, term10732.getClass(), "email", "WzGudiEARD");
        setField(term10732, term10732.getClass(), "message", "IoefPqGtaj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Contact");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term10732, args);
    }

};


