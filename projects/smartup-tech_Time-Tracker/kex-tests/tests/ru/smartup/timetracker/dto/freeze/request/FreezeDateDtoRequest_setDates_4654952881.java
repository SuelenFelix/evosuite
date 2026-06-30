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
import java.util.LinkedList;

public class FreezeDateDtoRequest_setDates_4654952881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;
     Object term47;

    public FreezeDateDtoRequest_setDates_4654952881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term29, term29.getClass(), "year", 2018);
        setShortField(term29, term29.getClass(), "month", (short) 1);
        setShortField(term29, term29.getClass(), "day", (short) 13);
        Object term33 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term33, term33.getClass(), "year", 2015);
        setShortField(term33, term33.getClass(), "month", (short) 4);
        setShortField(term33, term33.getClass(), "day", (short) 14);
        Object term37 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term37, term37.getClass(), "year", 2017);
        setShortField(term37, term37.getClass(), "month", (short) 5);
        setShortField(term37, term37.getClass(), "day", (short) 21);
        Object term41 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term41, term41.getClass(), "year", 2022);
        setShortField(term41, term41.getClass(), "month", (short) 2);
        setShortField(term41, term41.getClass(), "day", (short) 25);
        ArrayList term27 = new ArrayList();
        ((ArrayList) term27).add(term29);
        ((ArrayList) term27).add(term33);
        ((ArrayList) term27).add(term37);
        ((ArrayList) term27).add(term41);
        term26 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.request.FreezeDateDtoRequest"));
        setField(term26, term26.getClass(), "dates", term27);
        term47 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.request.FreezeDateDtoRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term47;
        callMethod(klass, "setDates", argTypes, term26, args);
    }

};


