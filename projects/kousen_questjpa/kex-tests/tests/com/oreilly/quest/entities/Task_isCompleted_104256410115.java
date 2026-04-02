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

public class Task_isCompleted_104256410115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6705;

    public Task_isCompleted_104256410115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6706 = new Long(-6723783499250797216L);
        Long term6731 = new Long(41775768178052008L);
        HashMap term6747 = new HashMap();
        Set<Object> term6801 =  ((Map) term6747).keySet();
        HashSet term6746 = new HashSet((Collection<? extends Object>) term6801);
        HashMap term6753 = new HashMap();
        Set<Object> term6802 =  ((Map) term6753).keySet();
        HashSet term6752 = new HashSet((Collection<? extends Object>) term6802);
        term6705 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term6721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6725 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6730 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term6758 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6759 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6763 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6768 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6769 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6773 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6778 = newInstance(Class.forName("java.time.Duration"));
        setField(term6705, term6705.getClass(), "id", term6706);
        setField(term6705, term6705.getClass(), "name", "vjxIhXHxGR");
        setIntField(term6705, term6705.getClass(), "priority", 3);
        setIntField(term6721, term6721.getClass(), "year", 2026);
        setShortField(term6721, term6721.getClass(), "month", (short) 4);
        setShortField(term6721, term6721.getClass(), "day", (short) 2);
        setField(term6705, term6705.getClass(), "startDate", term6721);
        setIntField(term6725, term6725.getClass(), "year", 2026);
        setShortField(term6725, term6725.getClass(), "month", (short) 4);
        setShortField(term6725, term6725.getClass(), "day", (short) 2);
        setField(term6705, term6705.getClass(), "endDate", term6725);
        setBooleanField(term6705, term6705.getClass(), "completed", true);
        setField(term6730, term6730.getClass(), "id", term6731);
        setField(term6730, term6730.getClass(), "name", "QXzGXbEXMu");
        setLongField(term6730, term6730.getClass(), "version", 2120084523938730454L);
        setField(term6730, term6730.getClass(), "tasks", term6746);
        setField(term6730, term6730.getClass(), "knights", term6752);
        setField(term6705, term6705.getClass(), "quest", term6730);
        setIntField(term6759, term6759.getClass(), "year", 2028);
        setShortField(term6759, term6759.getClass(), "month", (short) 10);
        setShortField(term6759, term6759.getClass(), "day", (short) 1);
        setField(term6758, term6758.getClass(), "date", term6759);
        setByteField(term6763, term6763.getClass(), "hour", (byte) 17);
        setByteField(term6763, term6763.getClass(), "minute", (byte) 29);
        setByteField(term6763, term6763.getClass(), "second", (byte) 30);
        setIntField(term6763, term6763.getClass(), "nano", 845472306);
        setField(term6758, term6758.getClass(), "time", term6763);
        setField(term6705, term6705.getClass(), "createdDate", term6758);
        setIntField(term6769, term6769.getClass(), "year", 2027);
        setShortField(term6769, term6769.getClass(), "month", (short) 2);
        setShortField(term6769, term6769.getClass(), "day", (short) 19);
        setField(term6768, term6768.getClass(), "date", term6769);
        setByteField(term6773, term6773.getClass(), "hour", (byte) 17);
        setByteField(term6773, term6773.getClass(), "minute", (byte) 37);
        setByteField(term6773, term6773.getClass(), "second", (byte) 27);
        setIntField(term6773, term6773.getClass(), "nano", 920380537);
        setField(term6768, term6768.getClass(), "time", term6773);
        setField(term6705, term6705.getClass(), "modifiedDate", term6768);
        setLongField(term6778, term6778.getClass(), "seconds", 46800L);
        setIntField(term6778, term6778.getClass(), "nanos", 0);
        setField(term6705, term6705.getClass(), "duration", term6778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCompleted", argTypes, term6705, args);
    }

};


