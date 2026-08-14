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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Award_setBooks_6724524912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5379;
     Object term5459;

    public Award_setBooks_6724524912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5380 = new Long(4044358158040652353L);
        Class<? extends Object> term5475 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term5474 = ((Class) term5475).getDeclaredField((String) "BOOKER_INTER_PRIZE");
        ((Field) term5474).setAccessible(true);
        Object enum13 = ((Field) term5474).get((Object) null);
        HashMap term5454 = new HashMap();
        Set<Object> term5770 =  ((Map) term5454).keySet();
        HashSet term5453 = new HashSet((Collection<? extends Object>) term5770);
        term5379 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term5379, term5379.getClass(), "id", term5380);
        setField(term5379, term5379.getClass(), "awardName", enum13);
        setField(term5379, term5379.getClass(), "category", "bWWfajKbEX");
        setIntField(term5379, term5379.getClass(), "year", -883034806);
        setField(term5379, term5379.getClass(), "books", term5453);
        HashMap term5460 = new HashMap();
        Set<Object> term5771 =  ((Map) term5460).keySet();
        term5459 = new HashSet((Collection<? extends Object>) term5771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.award.Award");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term5459;
        callMethod(klass, "setBooks", argTypes, term5379, args);
    }

};


