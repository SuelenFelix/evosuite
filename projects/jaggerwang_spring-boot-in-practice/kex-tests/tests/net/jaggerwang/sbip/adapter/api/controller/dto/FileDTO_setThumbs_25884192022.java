package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class FileDTO_setThumbs_25884192022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25727;
     Object term25835;

    public FileDTO_setThumbs_25884192022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25728 = new Long(-1526328443223793465L);
        Long term25730 = new Long(-412186147449928821L);
        Class<? extends Object> term25890 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term25889 = ((Class) term25890).getDeclaredField((String) "LOCAL");
        ((Field) term25889).setAccessible(true);
        Object enum51 = ((Field) term25889).get((Object) null);
        Long term25778 = new Long(-1449569009562240465L);
        HashMap term25824 = new HashMap();
        term25727 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term25765 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term25792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25797 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25802 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25803 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25807 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25727, term25727.getClass(), "id", term25728);
        setField(term25727, term25727.getClass(), "userId", term25730);
        setField(term25727, term25727.getClass(), "region", enum51);
        setField(term25727, term25727.getClass(), "bucket", "jiCGTTzKGB");
        setField(term25727, term25727.getClass(), "path", "MqICFYzDJj");
        setField(term25765, term25765.getClass(), "name", "YgQvdcBQKw");
        setField(term25765, term25765.getClass(), "size", term25778);
        setField(term25765, term25765.getClass(), "type", "FiYYLuailz");
        setField(term25727, term25727.getClass(), "meta", term25765);
        setIntField(term25793, term25793.getClass(), "year", 2029);
        setShortField(term25793, term25793.getClass(), "month", (short) 1);
        setShortField(term25793, term25793.getClass(), "day", (short) 21);
        setField(term25792, term25792.getClass(), "date", term25793);
        setByteField(term25797, term25797.getClass(), "hour", (byte) 9);
        setByteField(term25797, term25797.getClass(), "minute", (byte) 46);
        setByteField(term25797, term25797.getClass(), "second", (byte) 1);
        setIntField(term25797, term25797.getClass(), "nano", 276350652);
        setField(term25792, term25792.getClass(), "time", term25797);
        setField(term25727, term25727.getClass(), "createdAt", term25792);
        setIntField(term25803, term25803.getClass(), "year", 2019);
        setShortField(term25803, term25803.getClass(), "month", (short) 12);
        setShortField(term25803, term25803.getClass(), "day", (short) 20);
        setField(term25802, term25802.getClass(), "date", term25803);
        setByteField(term25807, term25807.getClass(), "hour", (byte) 22);
        setByteField(term25807, term25807.getClass(), "minute", (byte) 20);
        setByteField(term25807, term25807.getClass(), "second", (byte) 29);
        setIntField(term25807, term25807.getClass(), "nano", 582302461);
        setField(term25802, term25802.getClass(), "time", term25807);
        setField(term25727, term25727.getClass(), "updatedAt", term25802);
        setField(term25727, term25727.getClass(), "url", "XebAeSnCKZ");
        setField(term25727, term25727.getClass(), "thumbs", term25824);
        term25835 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term25835;
        callMethod(klass, "setThumbs", argTypes, term25727, args);
    }

};


