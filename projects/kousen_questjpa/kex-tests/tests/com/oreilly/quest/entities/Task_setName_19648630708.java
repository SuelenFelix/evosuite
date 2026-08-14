package com.oreilly.quest.entities;

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
import static com.oreilly.quest.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Task_setName_19648630708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5987;

    public Task_setName_19648630708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5988 = new Long(3825396310311739952L);
        Long term6013 = new Long(-3838084482494604218L);
        HashMap term6029 = new HashMap();
        Set<Object> term6095 =  ((Map) term6029).keySet();
        HashSet term6028 = new HashSet((Collection<? extends Object>) term6095);
        HashMap term6035 = new HashMap();
        Set<Object> term6096 =  ((Map) term6035).keySet();
        HashSet term6034 = new HashSet((Collection<? extends Object>) term6096);
        term5987 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term6003 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6007 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6012 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term6040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6045 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6050 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6051 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6055 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6060 = newInstance(Class.forName("java.time.Duration"));
        setField(term5987, term5987.getClass(), "id", term5988);
        setField(term5987, term5987.getClass(), "name", "PkWMRdJcBb");
        setIntField(term5987, term5987.getClass(), "priority", 3);
        setIntField(term6003, term6003.getClass(), "year", 2026);
        setShortField(term6003, term6003.getClass(), "month", (short) 8);
        setShortField(term6003, term6003.getClass(), "day", (short) 12);
        setField(term5987, term5987.getClass(), "startDate", term6003);
        setIntField(term6007, term6007.getClass(), "year", 2026);
        setShortField(term6007, term6007.getClass(), "month", (short) 8);
        setShortField(term6007, term6007.getClass(), "day", (short) 12);
        setField(term5987, term5987.getClass(), "endDate", term6007);
        setBooleanField(term5987, term5987.getClass(), "completed", true);
        setField(term6012, term6012.getClass(), "id", term6013);
        setField(term6012, term6012.getClass(), "name", "jSpAteRute");
        setLongField(term6012, term6012.getClass(), "version", 8059786003080744426L);
        setField(term6012, term6012.getClass(), "tasks", term6028);
        setField(term6012, term6012.getClass(), "knights", term6034);
        setField(term5987, term5987.getClass(), "quest", term6012);
        setIntField(term6041, term6041.getClass(), "year", 2012);
        setShortField(term6041, term6041.getClass(), "month", (short) 9);
        setShortField(term6041, term6041.getClass(), "day", (short) 11);
        setField(term6040, term6040.getClass(), "date", term6041);
        setByteField(term6045, term6045.getClass(), "hour", (byte) 22);
        setByteField(term6045, term6045.getClass(), "minute", (byte) 10);
        setByteField(term6045, term6045.getClass(), "second", (byte) 8);
        setIntField(term6045, term6045.getClass(), "nano", 380008862);
        setField(term6040, term6040.getClass(), "time", term6045);
        setField(term5987, term5987.getClass(), "createdDate", term6040);
        setIntField(term6051, term6051.getClass(), "year", 2021);
        setShortField(term6051, term6051.getClass(), "month", (short) 9);
        setShortField(term6051, term6051.getClass(), "day", (short) 7);
        setField(term6050, term6050.getClass(), "date", term6051);
        setByteField(term6055, term6055.getClass(), "hour", (byte) 5);
        setByteField(term6055, term6055.getClass(), "minute", (byte) 25);
        setByteField(term6055, term6055.getClass(), "second", (byte) 7);
        setIntField(term6055, term6055.getClass(), "nano", 755924076);
        setField(term6050, term6050.getClass(), "time", term6055);
        setField(term5987, term5987.getClass(), "modifiedDate", term6050);
        setLongField(term6060, term6060.getClass(), "seconds", 93600L);
        setIntField(term6060, term6060.getClass(), "nanos", 0);
        setField(term5987, term5987.getClass(), "duration", term6060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "swZVeJAxjt";
        callMethod(klass, "setName", argTypes, term5987, args);
    }

};


