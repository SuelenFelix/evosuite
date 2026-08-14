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

public class Task_getName_6102276587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5889;

    public Task_getName_6102276587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5890 = new Long(-1468719814009985452L);
        Long term5915 = new Long(-7738503207562305297L);
        HashMap term5931 = new HashMap();
        Set<Object> term5985 =  ((Map) term5931).keySet();
        HashSet term5930 = new HashSet((Collection<? extends Object>) term5985);
        HashMap term5937 = new HashMap();
        Set<Object> term5986 =  ((Map) term5937).keySet();
        HashSet term5936 = new HashSet((Collection<? extends Object>) term5986);
        term5889 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term5905 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5909 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5914 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term5942 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5943 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5947 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5952 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5953 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5957 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5962 = newInstance(Class.forName("java.time.Duration"));
        setField(term5889, term5889.getClass(), "id", term5890);
        setField(term5889, term5889.getClass(), "name", "PHvxnGHptP");
        setIntField(term5889, term5889.getClass(), "priority", 3);
        setIntField(term5905, term5905.getClass(), "year", 2026);
        setShortField(term5905, term5905.getClass(), "month", (short) 8);
        setShortField(term5905, term5905.getClass(), "day", (short) 12);
        setField(term5889, term5889.getClass(), "startDate", term5905);
        setIntField(term5909, term5909.getClass(), "year", 2026);
        setShortField(term5909, term5909.getClass(), "month", (short) 8);
        setShortField(term5909, term5909.getClass(), "day", (short) 12);
        setField(term5889, term5889.getClass(), "endDate", term5909);
        setBooleanField(term5889, term5889.getClass(), "completed", true);
        setField(term5914, term5914.getClass(), "id", term5915);
        setField(term5914, term5914.getClass(), "name", "TimdotUuNC");
        setLongField(term5914, term5914.getClass(), "version", -2585684163342970173L);
        setField(term5914, term5914.getClass(), "tasks", term5930);
        setField(term5914, term5914.getClass(), "knights", term5936);
        setField(term5889, term5889.getClass(), "quest", term5914);
        setIntField(term5943, term5943.getClass(), "year", 2019);
        setShortField(term5943, term5943.getClass(), "month", (short) 2);
        setShortField(term5943, term5943.getClass(), "day", (short) 21);
        setField(term5942, term5942.getClass(), "date", term5943);
        setByteField(term5947, term5947.getClass(), "hour", (byte) 5);
        setByteField(term5947, term5947.getClass(), "minute", (byte) 41);
        setByteField(term5947, term5947.getClass(), "second", (byte) 11);
        setIntField(term5947, term5947.getClass(), "nano", 859829782);
        setField(term5942, term5942.getClass(), "time", term5947);
        setField(term5889, term5889.getClass(), "createdDate", term5942);
        setIntField(term5953, term5953.getClass(), "year", 2018);
        setShortField(term5953, term5953.getClass(), "month", (short) 9);
        setShortField(term5953, term5953.getClass(), "day", (short) 28);
        setField(term5952, term5952.getClass(), "date", term5953);
        setByteField(term5957, term5957.getClass(), "hour", (byte) 3);
        setByteField(term5957, term5957.getClass(), "minute", (byte) 37);
        setByteField(term5957, term5957.getClass(), "second", (byte) 46);
        setIntField(term5957, term5957.getClass(), "nano", 763326845);
        setField(term5952, term5952.getClass(), "time", term5957);
        setField(term5889, term5889.getClass(), "modifiedDate", term5952);
        setLongField(term5962, term5962.getClass(), "seconds", 144000L);
        setIntField(term5962, term5962.getClass(), "nanos", 0);
        setField(term5889, term5889.getClass(), "duration", term5962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term5889, args);
    }

};


