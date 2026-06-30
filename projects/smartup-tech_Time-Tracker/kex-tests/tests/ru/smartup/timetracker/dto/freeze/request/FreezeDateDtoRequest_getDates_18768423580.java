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

public class FreezeDateDtoRequest_getDates_18768423580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public FreezeDateDtoRequest_getDates_18768423580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term4, term4.getClass(), "year", 2012);
        setShortField(term4, term4.getClass(), "month", (short) 8);
        setShortField(term4, term4.getClass(), "day", (short) 25);
        Object term8 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term8, term8.getClass(), "year", 2016);
        setShortField(term8, term8.getClass(), "month", (short) 11);
        setShortField(term8, term8.getClass(), "day", (short) 29);
        Object term12 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term12, term12.getClass(), "year", 2021);
        setShortField(term12, term12.getClass(), "month", (short) 1);
        setShortField(term12, term12.getClass(), "day", (short) 18);
        Object term16 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term16, term16.getClass(), "year", 2020);
        setShortField(term16, term16.getClass(), "month", (short) 11);
        setShortField(term16, term16.getClass(), "day", (short) 22);
        Object term20 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term20, term20.getClass(), "year", 2015);
        setShortField(term20, term20.getClass(), "month", (short) 9);
        setShortField(term20, term20.getClass(), "day", (short) 19);
        ArrayList term2 = new ArrayList();
        ((ArrayList) term2).add(term4);
        ((ArrayList) term2).add(term8);
        ((ArrayList) term2).add(term12);
        ((ArrayList) term2).add(term16);
        ((ArrayList) term2).add(term20);
        term1 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.request.FreezeDateDtoRequest"));
        setField(term1, term1.getClass(), "dates", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.request.FreezeDateDtoRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDates", argTypes, term1, args);
    }

};


