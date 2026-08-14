package com.karankumar.booksapi.service;

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
import static com.karankumar.booksapi.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class AwardService_save_6032249570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public AwardService_save_6032249570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Class<? extends Object> term420 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term419 = ((Class) term420).getDeclaredField((String) "ORWELL_PRIZE");
        ((Field) term419).setAccessible(true);
        Object enum0 = ((Field) term419).get((Object) null);
        HashMap term53 = new HashMap();
        Set<Object> term697 =  ((Map) term53).keySet();
        HashSet term52 = new HashSet((Collection<? extends Object>) term697);
        term1 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "awardName", enum0);
        setField(term1, term1.getClass(), "category", "PAEBtnZtTD");
        setIntField(term1, term1.getClass(), "year", 568599855);
        setField(term1, term1.getClass(), "books", term52);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.service.AwardService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.award.Award");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "save", argTypes, null, args);
    }

};


