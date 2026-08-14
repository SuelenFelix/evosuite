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

public class Plan_getNote_170070266310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32715;

    public Plan_getNote_170070266310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32716 = new Integer(-1547384488);
        Integer term32718 = new Integer(1442160736);
        Integer term32764 = new Integer(1114000454);
        term32715 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term32720 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32724 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term32715, term32715.getClass(), "id", term32716);
        setField(term32715, term32715.getClass(), "user_id", term32718);
        setIntField(term32720, term32720.getClass(), "year", 2012);
        setShortField(term32720, term32720.getClass(), "month", (short) 3);
        setShortField(term32720, term32720.getClass(), "day", (short) 27);
        setField(term32715, term32715.getClass(), "start_date", term32720);
        setIntField(term32724, term32724.getClass(), "year", 2020);
        setShortField(term32724, term32724.getClass(), "month", (short) 8);
        setShortField(term32724, term32724.getClass(), "day", (short) 12);
        setField(term32715, term32715.getClass(), "last_date", term32724);
        setField(term32715, term32715.getClass(), "day_of_week", "iVIrSxTsaM");
        setField(term32715, term32715.getClass(), "subject", "FmJNEfmYgq");
        setField(term32715, term32715.getClass(), "start_time", "NqQofgWsJd");
        setField(term32715, term32715.getClass(), "minutes", term32764);
        setField(term32715, term32715.getClass(), "items", "ZlVRdHsBMO");
        setField(term32715, term32715.getClass(), "note", "UMMXkhuqzw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNote", argTypes, term32715, args);
    }

};


