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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Quest_addToTasks_1772895762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9660;
     Object term9688;

    public Quest_addToTasks_1772895762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9661 = new Long(1597484336218508869L);
        HashMap term9677 = new HashMap();
        Set<Object> term9774 =  ((Map) term9677).keySet();
        HashSet term9676 = new HashSet((Collection<? extends Object>) term9774);
        HashMap term9683 = new HashMap();
        Set<Object> term9775 =  ((Map) term9683).keySet();
        HashSet term9682 = new HashSet((Collection<? extends Object>) term9775);
        term9660 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term9660, term9660.getClass(), "id", term9661);
        setField(term9660, term9660.getClass(), "name", "tRxZafjqIx");
        setLongField(term9660, term9660.getClass(), "version", 1439298019805881866L);
        setField(term9660, term9660.getClass(), "tasks", term9676);
        setField(term9660, term9660.getClass(), "knights", term9682);
        Long term9689 = new Long(-685023850445639859L);
        Long term9714 = new Long(-6950146046121430355L);
        HashMap term9730 = new HashMap();
        Set<Object> term9796 =  ((Map) term9730).keySet();
        HashSet term9729 = new HashSet((Collection<? extends Object>) term9796);
        HashMap term9736 = new HashMap();
        Set<Object> term9797 =  ((Map) term9736).keySet();
        HashSet term9735 = new HashSet((Collection<? extends Object>) term9797);
        term9688 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term9704 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9708 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9713 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term9741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9746 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9756 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9761 = newInstance(Class.forName("java.time.Duration"));
        setField(term9688, term9688.getClass(), "id", term9689);
        setField(term9688, term9688.getClass(), "name", "DhjNLmRMCu");
        setIntField(term9688, term9688.getClass(), "priority", 3);
        setIntField(term9704, term9704.getClass(), "year", 2026);
        setShortField(term9704, term9704.getClass(), "month", (short) 8);
        setShortField(term9704, term9704.getClass(), "day", (short) 12);
        setField(term9688, term9688.getClass(), "startDate", term9704);
        setIntField(term9708, term9708.getClass(), "year", 2026);
        setShortField(term9708, term9708.getClass(), "month", (short) 8);
        setShortField(term9708, term9708.getClass(), "day", (short) 12);
        setField(term9688, term9688.getClass(), "endDate", term9708);
        setBooleanField(term9688, term9688.getClass(), "completed", false);
        setField(term9713, term9713.getClass(), "id", term9714);
        setField(term9713, term9713.getClass(), "name", "PgPzMSEjjX");
        setLongField(term9713, term9713.getClass(), "version", -8708192233349544946L);
        setField(term9713, term9713.getClass(), "tasks", term9729);
        setField(term9713, term9713.getClass(), "knights", term9735);
        setField(term9688, term9688.getClass(), "quest", term9713);
        setIntField(term9742, term9742.getClass(), "year", 2010);
        setShortField(term9742, term9742.getClass(), "month", (short) 1);
        setShortField(term9742, term9742.getClass(), "day", (short) 17);
        setField(term9741, term9741.getClass(), "date", term9742);
        setByteField(term9746, term9746.getClass(), "hour", (byte) 13);
        setByteField(term9746, term9746.getClass(), "minute", (byte) 5);
        setByteField(term9746, term9746.getClass(), "second", (byte) 51);
        setIntField(term9746, term9746.getClass(), "nano", 362260580);
        setField(term9741, term9741.getClass(), "time", term9746);
        setField(term9688, term9688.getClass(), "createdDate", term9741);
        setIntField(term9752, term9752.getClass(), "year", 2010);
        setShortField(term9752, term9752.getClass(), "month", (short) 9);
        setShortField(term9752, term9752.getClass(), "day", (short) 28);
        setField(term9751, term9751.getClass(), "date", term9752);
        setByteField(term9756, term9756.getClass(), "hour", (byte) 6);
        setByteField(term9756, term9756.getClass(), "minute", (byte) 4);
        setByteField(term9756, term9756.getClass(), "second", (byte) 54);
        setIntField(term9756, term9756.getClass(), "nano", 604713782);
        setField(term9751, term9751.getClass(), "time", term9756);
        setField(term9688, term9688.getClass(), "modifiedDate", term9751);
        setLongField(term9761, term9761.getClass(), "seconds", 230400L);
        setIntField(term9761, term9761.getClass(), "nanos", 0);
        setField(term9688, term9688.getClass(), "duration", term9761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Quest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.oreilly.quest.entities.Task");
        Object[] args = new Object[1];
        args[0] = term9688;
        callMethod(klass, "addToTasks", argTypes, term9660, args);
    }

};


