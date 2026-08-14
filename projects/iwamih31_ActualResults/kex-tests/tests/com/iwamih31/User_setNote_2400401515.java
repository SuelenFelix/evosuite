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

public class User_setNote_2400401515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2601;

    public User_setNote_2400401515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2602 = new Integer(1876565163);
        Integer term2604 = new Integer(-817164822);
        term2601 = newInstance(Class.forName("com.iwamih31.User"));
        Object term2618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2634 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2601, term2601.getClass(), "id", term2602);
        setField(term2601, term2601.getClass(), "room", term2604);
        setField(term2601, term2601.getClass(), "name", "QXzGXbEXMu");
        setIntField(term2618, term2618.getClass(), "year", 2015);
        setShortField(term2618, term2618.getClass(), "month", (short) 9);
        setShortField(term2618, term2618.getClass(), "day", (short) 15);
        setField(term2601, term2601.getClass(), "birthday", term2618);
        setField(term2601, term2601.getClass(), "level", "qxSDVejjiY");
        setIntField(term2634, term2634.getClass(), "year", 2022);
        setShortField(term2634, term2634.getClass(), "month", (short) 8);
        setShortField(term2634, term2634.getClass(), "day", (short) 8);
        setField(term2601, term2601.getClass(), "move_in", term2634);
        setField(term2601, term2601.getClass(), "use", "xBsXSDjXYK");
        setField(term2601, term2601.getClass(), "note", "sEnIVFtZuQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZVecLZMLHF";
        callMethod(klass, "setNote", argTypes, term2601, args);
    }

};


