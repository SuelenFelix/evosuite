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

public class FreezeDateDtoRequest_canEqual_15231284643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term97;

    public FreezeDateDtoRequest_canEqual_15231284643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term75 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term75, term75.getClass(), "year", 2012);
        setShortField(term75, term75.getClass(), "month", (short) 10);
        setShortField(term75, term75.getClass(), "day", (short) 1);
        Object term79 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term79, term79.getClass(), "year", 2024);
        setShortField(term79, term79.getClass(), "month", (short) 1);
        setShortField(term79, term79.getClass(), "day", (short) 24);
        Object term83 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term83, term83.getClass(), "year", 2029);
        setShortField(term83, term83.getClass(), "month", (short) 1);
        setShortField(term83, term83.getClass(), "day", (short) 20);
        Object term87 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term87, term87.getClass(), "year", 2029);
        setShortField(term87, term87.getClass(), "month", (short) 8);
        setShortField(term87, term87.getClass(), "day", (short) 28);
        Object term91 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term91, term91.getClass(), "year", 2015);
        setShortField(term91, term91.getClass(), "month", (short) 7);
        setShortField(term91, term91.getClass(), "day", (short) 24);
        ArrayList term73 = new ArrayList();
        ((ArrayList) term73).add(term75);
        ((ArrayList) term73).add(term79);
        ((ArrayList) term73).add(term83);
        ((ArrayList) term73).add(term87);
        ((ArrayList) term73).add(term91);
        term72 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.request.FreezeDateDtoRequest"));
        setField(term72, term72.getClass(), "dates", term73);
        term97 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.request.FreezeDateDtoRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term97;
        callMethod(klass, "canEqual", argTypes, term72, args);
    }

};


