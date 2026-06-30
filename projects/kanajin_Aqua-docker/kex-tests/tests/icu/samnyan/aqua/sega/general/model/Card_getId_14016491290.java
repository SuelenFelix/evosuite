package icu.samnyan.aqua.sega.general.model;

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
import static icu.samnyan.aqua.sega.general.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Card_getId_14016491290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1521;

    public Card_getId_14016491290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1523 = new Long(2442117782898005296L);
        term1521 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1542 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1552 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1521, term1521.getClass(), "id", 2442117782898005296L);
        setField(term1521, term1521.getClass(), "extId", term1523);
        setField(term1521, term1521.getClass(), "luid", "ffYhPOzlUs");
        setIntField(term1538, term1538.getClass(), "year", 2012);
        setShortField(term1538, term1538.getClass(), "month", (short) 2);
        setShortField(term1538, term1538.getClass(), "day", (short) 19);
        setField(term1537, term1537.getClass(), "date", term1538);
        setByteField(term1542, term1542.getClass(), "hour", (byte) 8);
        setByteField(term1542, term1542.getClass(), "minute", (byte) 4);
        setByteField(term1542, term1542.getClass(), "second", (byte) 43);
        setIntField(term1542, term1542.getClass(), "nano", 114930008);
        setField(term1537, term1537.getClass(), "time", term1542);
        setField(term1521, term1521.getClass(), "registerTime", term1537);
        setIntField(term1548, term1548.getClass(), "year", 2017);
        setShortField(term1548, term1548.getClass(), "month", (short) 6);
        setShortField(term1548, term1548.getClass(), "day", (short) 8);
        setField(term1547, term1547.getClass(), "date", term1548);
        setByteField(term1552, term1552.getClass(), "hour", (byte) 0);
        setByteField(term1552, term1552.getClass(), "minute", (byte) 18);
        setByteField(term1552, term1552.getClass(), "second", (byte) 55);
        setIntField(term1552, term1552.getClass(), "nano", 680586717);
        setField(term1547, term1547.getClass(), "time", term1552);
        setField(term1521, term1521.getClass(), "accessTime", term1547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1521, args);
    }

};


