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

public class FreezeDateDtoRequest_toString_2404805305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103;

    public FreezeDateDtoRequest_toString_2404805305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term106 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term106, term106.getClass(), "year", 2022);
        setShortField(term106, term106.getClass(), "month", (short) 11);
        setShortField(term106, term106.getClass(), "day", (short) 16);
        Object term110 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term110, term110.getClass(), "year", 2024);
        setShortField(term110, term110.getClass(), "month", (short) 8);
        setShortField(term110, term110.getClass(), "day", (short) 31);
        Object term114 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term114, term114.getClass(), "year", 2019);
        setShortField(term114, term114.getClass(), "month", (short) 2);
        setShortField(term114, term114.getClass(), "day", (short) 20);
        Object term118 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term118, term118.getClass(), "year", 2027);
        setShortField(term118, term118.getClass(), "month", (short) 3);
        setShortField(term118, term118.getClass(), "day", (short) 14);
        Object term122 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term122, term122.getClass(), "year", 2018);
        setShortField(term122, term122.getClass(), "month", (short) 9);
        setShortField(term122, term122.getClass(), "day", (short) 27);
        Object term126 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term126, term126.getClass(), "year", 2025);
        setShortField(term126, term126.getClass(), "month", (short) 4);
        setShortField(term126, term126.getClass(), "day", (short) 8);
        Object term130 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term130, term130.getClass(), "year", 2012);
        setShortField(term130, term130.getClass(), "month", (short) 9);
        setShortField(term130, term130.getClass(), "day", (short) 11);
        Object term134 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term134, term134.getClass(), "year", 2017);
        setShortField(term134, term134.getClass(), "month", (short) 8);
        setShortField(term134, term134.getClass(), "day", (short) 7);
        Object term138 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term138, term138.getClass(), "year", 2021);
        setShortField(term138, term138.getClass(), "month", (short) 9);
        setShortField(term138, term138.getClass(), "day", (short) 6);
        ArrayList term104 = new ArrayList();
        ((ArrayList) term104).add(term106);
        ((ArrayList) term104).add(term110);
        ((ArrayList) term104).add(term114);
        ((ArrayList) term104).add(term118);
        ((ArrayList) term104).add(term122);
        ((ArrayList) term104).add(term126);
        ((ArrayList) term104).add(term130);
        ((ArrayList) term104).add(term134);
        ((ArrayList) term104).add(term138);
        term103 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.request.FreezeDateDtoRequest"));
        setField(term103, term103.getClass(), "dates", term104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.request.FreezeDateDtoRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term103, args);
    }

};


