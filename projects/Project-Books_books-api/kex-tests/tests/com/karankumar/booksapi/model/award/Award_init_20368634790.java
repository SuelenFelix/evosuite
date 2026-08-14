package com.karankumar.booksapi.model.award;

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
import static com.karankumar.booksapi.model.award.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Award_init_20368634790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;
     Object term48;
     Object term50;

    public Award_init_20368634790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term427 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term426 = ((Class) term427).getDeclaredField((String) "ORWELL_PRIZE");
        ((Field) term426).setAccessible(true);
        enum0 = ((Field) term426).get((Object) null);
        term48 = new Integer(568599855);
        HashMap term51 = new HashMap();
        Set<Object> term704 =  ((Map) term51).keySet();
        term50 = new HashSet((Collection<? extends Object>) term704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.award.Award");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.award.AwardName");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.util.Set");
        Object[] args = new Object[4];
        args[0] = enum0;
        args[1] = "PAEBtnZtTD";
        args[2] = term48;
        args[3] = term50;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


