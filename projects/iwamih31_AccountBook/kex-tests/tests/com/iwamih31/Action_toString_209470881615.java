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

public class Action_toString_209470881615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13644;

    public Action_toString_209470881615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13645 = new Integer(1596070772);
        Integer term13675 = new Integer(97029295);
        Integer term13677 = new Integer(-1371869594);
        term13644 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term13647 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13644, term13644.getClass(), "id", term13645);
        setIntField(term13647, term13647.getClass(), "year", 2012);
        setShortField(term13647, term13647.getClass(), "month", (short) 2);
        setShortField(term13647, term13647.getClass(), "day", (short) 19);
        setField(term13644, term13644.getClass(), "date", term13647);
        setField(term13644, term13644.getClass(), "subject", "tlQSNgTkQX");
        setField(term13644, term13644.getClass(), "apply", "PCipZnmBOF");
        setField(term13644, term13644.getClass(), "income", term13675);
        setField(term13644, term13644.getClass(), "spending", term13677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13644, args);
    }

};


