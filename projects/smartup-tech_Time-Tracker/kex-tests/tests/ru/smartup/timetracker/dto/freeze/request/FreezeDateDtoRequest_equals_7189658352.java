package ru.smartup.timetracker.dto.freeze.request;

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
import static ru.smartup.timetracker.dto.freeze.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class FreezeDateDtoRequest_equals_7189658352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;
     Object term71;

    public FreezeDateDtoRequest_equals_7189658352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term53 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term53, term53.getClass(), "year", 2017);
        setShortField(term53, term53.getClass(), "month", (short) 7);
        setShortField(term53, term53.getClass(), "day", (short) 22);
        Object term57 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term57, term57.getClass(), "year", 2026);
        setShortField(term57, term57.getClass(), "month", (short) 12);
        setShortField(term57, term57.getClass(), "day", (short) 13);
        Object term61 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term61, term61.getClass(), "year", 2020);
        setShortField(term61, term61.getClass(), "month", (short) 5);
        setShortField(term61, term61.getClass(), "day", (short) 14);
        Object term65 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term65, term65.getClass(), "year", 2025);
        setShortField(term65, term65.getClass(), "month", (short) 4);
        setShortField(term65, term65.getClass(), "day", (short) 23);
        ArrayList term51 = new ArrayList();
        ((ArrayList) term51).add(term53);
        ((ArrayList) term51).add(term57);
        ((ArrayList) term51).add(term61);
        ((ArrayList) term51).add(term65);
        term50 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.request.FreezeDateDtoRequest"));
        setField(term50, term50.getClass(), "dates", term51);
        term71 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.request.FreezeDateDtoRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term71;
        callMethod(klass, "equals", argTypes, term50, args);
    }

};


