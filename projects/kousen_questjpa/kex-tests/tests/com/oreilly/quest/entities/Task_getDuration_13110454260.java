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

public class Task_getDuration_13110454260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5335;

    public Task_getDuration_13110454260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5336 = new Long(-6645965768855543712L);
        Long term5361 = new Long(4784595517102746672L);
        HashMap term5377 = new HashMap();
        Set<Object> term5431 =  ((Map) term5377).keySet();
        HashSet term5376 = new HashSet((Collection<? extends Object>) term5431);
        HashMap term5383 = new HashMap();
        Set<Object> term5432 =  ((Map) term5383).keySet();
        HashSet term5382 = new HashSet((Collection<? extends Object>) term5432);
        term5335 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term5351 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5355 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5360 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term5388 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5389 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5393 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5398 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5399 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5403 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5408 = newInstance(Class.forName("java.time.Duration"));
        setField(term5335, term5335.getClass(), "id", term5336);
        setField(term5335, term5335.getClass(), "name", "HqBOwkVqjD");
        setIntField(term5335, term5335.getClass(), "priority", 3);
        setIntField(term5351, term5351.getClass(), "year", 2026);
        setShortField(term5351, term5351.getClass(), "month", (short) 8);
        setShortField(term5351, term5351.getClass(), "day", (short) 12);
        setField(term5335, term5335.getClass(), "startDate", term5351);
        setIntField(term5355, term5355.getClass(), "year", 2026);
        setShortField(term5355, term5355.getClass(), "month", (short) 8);
        setShortField(term5355, term5355.getClass(), "day", (short) 12);
        setField(term5335, term5335.getClass(), "endDate", term5355);
        setBooleanField(term5335, term5335.getClass(), "completed", false);
        setField(term5360, term5360.getClass(), "id", term5361);
        setField(term5360, term5360.getClass(), "name", "MAcUBcBckh");
        setLongField(term5360, term5360.getClass(), "version", -872011222785455006L);
        setField(term5360, term5360.getClass(), "tasks", term5376);
        setField(term5360, term5360.getClass(), "knights", term5382);
        setField(term5335, term5335.getClass(), "quest", term5360);
        setIntField(term5389, term5389.getClass(), "year", 2012);
        setShortField(term5389, term5389.getClass(), "month", (short) 8);
        setShortField(term5389, term5389.getClass(), "day", (short) 25);
        setField(term5388, term5388.getClass(), "date", term5389);
        setByteField(term5393, term5393.getClass(), "hour", (byte) 5);
        setByteField(term5393, term5393.getClass(), "minute", (byte) 20);
        setByteField(term5393, term5393.getClass(), "second", (byte) 50);
        setIntField(term5393, term5393.getClass(), "nano", 345595912);
        setField(term5388, term5388.getClass(), "time", term5393);
        setField(term5335, term5335.getClass(), "createdDate", term5388);
        setIntField(term5399, term5399.getClass(), "year", 2021);
        setShortField(term5399, term5399.getClass(), "month", (short) 1);
        setShortField(term5399, term5399.getClass(), "day", (short) 18);
        setField(term5398, term5398.getClass(), "date", term5399);
        setByteField(term5403, term5403.getClass(), "hour", (byte) 13);
        setByteField(term5403, term5403.getClass(), "minute", (byte) 38);
        setByteField(term5403, term5403.getClass(), "second", (byte) 26);
        setIntField(term5403, term5403.getClass(), "nano", 544608644);
        setField(term5398, term5398.getClass(), "time", term5403);
        setField(term5335, term5335.getClass(), "modifiedDate", term5398);
        setLongField(term5408, term5408.getClass(), "seconds", 46800L);
        setIntField(term5408, term5408.getClass(), "nanos", 0);
        setField(term5335, term5335.getClass(), "duration", term5408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term5335, args);
    }

};


