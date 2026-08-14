package com.zxl.dailypractice.project.entity;

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
import static com.zxl.dailypractice.project.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meetings_getSubject_5899443622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187;

    public Meetings_getSubject_5899443622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term188 = new Integer(1484323161);
        term187 = newInstance(Class.forName("com.zxl.dailypractice.project.entity.Meetings"));
        Object term226 = newInstance(Class.forName("java.util.Date"));
        setField(term187, term187.getClass(), "id", term188);
        setField(term187, term187.getClass(), "people", "hRNSzYYIrc");
        setField(term187, term187.getClass(), "subject", "RMFIsYGgne");
        setField(term187, term187.getClass(), "context", "NRdvgJlhkX");
        setLongField(term226, term226.getClass(), "fastTime", 1610940182830L);
        setField(term226, term226.getClass(), "cdate", null);
        setField(term187, term187.getClass(), "time", term226);
        setField(term187, term187.getClass(), "remark", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.entity.Meetings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubject", argTypes, term187, args);
    }

};


