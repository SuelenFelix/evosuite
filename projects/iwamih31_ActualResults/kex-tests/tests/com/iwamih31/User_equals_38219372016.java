package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class User_equals_38219372016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2724;
     Object term2785;

    public User_equals_38219372016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2725 = new Integer(-1016503459);
        Integer term2727 = new Integer(-1968847291);
        term2724 = newInstance(Class.forName("com.iwamih31.User"));
        Object term2741 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2757 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2724, term2724.getClass(), "id", term2725);
        setField(term2724, term2724.getClass(), "room", term2727);
        setField(term2724, term2724.getClass(), "name", "fztQhjqwdP");
        setIntField(term2741, term2741.getClass(), "year", 2029);
        setShortField(term2741, term2741.getClass(), "month", (short) 6);
        setShortField(term2741, term2741.getClass(), "day", (short) 22);
        setField(term2724, term2724.getClass(), "birthday", term2741);
        setField(term2724, term2724.getClass(), "level", "eVpkWxjuki");
        setIntField(term2757, term2757.getClass(), "year", 2011);
        setShortField(term2757, term2757.getClass(), "month", (short) 5);
        setShortField(term2757, term2757.getClass(), "day", (short) 4);
        setField(term2724, term2724.getClass(), "move_in", term2757);
        setField(term2724, term2724.getClass(), "use", "SJiQaLvSKv");
        setField(term2724, term2724.getClass(), "note", "OEXDRUKcFl");
        term2785 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2785;
        callMethod(klass, "equals", argTypes, term2724, args);
    }

};


