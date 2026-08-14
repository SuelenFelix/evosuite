package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PostBO_setUpdatedAt_65704115816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17786;
     Object term17840;

    public PostBO_setUpdatedAt_65704115816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17787 = new Long(-7013378340043571457L);
        Long term17789 = new Long(-3279534582096707294L);
        Class<? extends Object> term17851 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term17850 = ((Class) term17851).getDeclaredField((String) "IMAGE");
        ((Field) term17850).setAccessible(true);
        Object enum49 = ((Field) term17850).get((Object) null);
        Long term17814 = new Long(-6490254947459640565L);
        ArrayList term17812 = new ArrayList();
        ((ArrayList) term17812).add(term17814);
        Long term17818 = new Long(-7001094993638840490L);
        term17786 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term17820 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17821 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17825 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17830 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17831 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17835 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17786, term17786.getClass(), "id", term17787);
        setField(term17786, term17786.getClass(), "userId", term17789);
        setField(term17786, term17786.getClass(), "type", enum49);
        setField(term17786, term17786.getClass(), "text", "vwbEQQNQrx");
        setField(term17786, term17786.getClass(), "imageIds", term17812);
        setField(term17786, term17786.getClass(), "videoId", term17818);
        setIntField(term17821, term17821.getClass(), "year", 2015);
        setShortField(term17821, term17821.getClass(), "month", (short) 10);
        setShortField(term17821, term17821.getClass(), "day", (short) 8);
        setField(term17820, term17820.getClass(), "date", term17821);
        setByteField(term17825, term17825.getClass(), "hour", (byte) 22);
        setByteField(term17825, term17825.getClass(), "minute", (byte) 20);
        setByteField(term17825, term17825.getClass(), "second", (byte) 59);
        setIntField(term17825, term17825.getClass(), "nano", 350521903);
        setField(term17820, term17820.getClass(), "time", term17825);
        setField(term17786, term17786.getClass(), "createdAt", term17820);
        setIntField(term17831, term17831.getClass(), "year", 2029);
        setShortField(term17831, term17831.getClass(), "month", (short) 11);
        setShortField(term17831, term17831.getClass(), "day", (short) 8);
        setField(term17830, term17830.getClass(), "date", term17831);
        setByteField(term17835, term17835.getClass(), "hour", (byte) 23);
        setByteField(term17835, term17835.getClass(), "minute", (byte) 43);
        setByteField(term17835, term17835.getClass(), "second", (byte) 12);
        setIntField(term17835, term17835.getClass(), "nano", 586227255);
        setField(term17830, term17830.getClass(), "time", term17835);
        setField(term17786, term17786.getClass(), "updatedAt", term17830);
        term17840 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17841 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17845 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term17841, term17841.getClass(), "year", 2014);
        setShortField(term17841, term17841.getClass(), "month", (short) 1);
        setShortField(term17841, term17841.getClass(), "day", (short) 23);
        setField(term17840, term17840.getClass(), "date", term17841);
        setByteField(term17845, term17845.getClass(), "hour", (byte) 19);
        setByteField(term17845, term17845.getClass(), "minute", (byte) 52);
        setByteField(term17845, term17845.getClass(), "second", (byte) 9);
        setIntField(term17845, term17845.getClass(), "nano", 235326975);
        setField(term17840, term17840.getClass(), "time", term17845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term17840;
        callMethod(klass, "setUpdatedAt", argTypes, term17786, args);
    }

};


