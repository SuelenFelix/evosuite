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

public class FileBO_getUpdatedAt_7900389228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6609;

    public FileBO_getUpdatedAt_7900389228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6610 = new Long(414749984815662075L);
        Long term6612 = new Long(463622836963501975L);
        Class<? extends Object> term6695 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term6694 = ((Class) term6695).getDeclaredField((String) "LOCAL");
        ((Field) term6694).setAccessible(true);
        Object enum17 = ((Field) term6694).get((Object) null);
        Long term6660 = new Long(305759998609888272L);
        term6609 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term6647 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term6674 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6675 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6679 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6684 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6685 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6689 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6609, term6609.getClass(), "id", term6610);
        setField(term6609, term6609.getClass(), "userId", term6612);
        setField(term6609, term6609.getClass(), "region", enum17);
        setField(term6609, term6609.getClass(), "bucket", "XqgfKFvPSD");
        setField(term6609, term6609.getClass(), "path", "JiVRgTZvKc");
        setField(term6647, term6647.getClass(), "name", "XPKmummaqg");
        setField(term6647, term6647.getClass(), "size", term6660);
        setField(term6647, term6647.getClass(), "type", "BKLfkLiZTH");
        setField(term6609, term6609.getClass(), "meta", term6647);
        setIntField(term6675, term6675.getClass(), "year", 2010);
        setShortField(term6675, term6675.getClass(), "month", (short) 1);
        setShortField(term6675, term6675.getClass(), "day", (short) 17);
        setField(term6674, term6674.getClass(), "date", term6675);
        setByteField(term6679, term6679.getClass(), "hour", (byte) 13);
        setByteField(term6679, term6679.getClass(), "minute", (byte) 5);
        setByteField(term6679, term6679.getClass(), "second", (byte) 51);
        setIntField(term6679, term6679.getClass(), "nano", 362260580);
        setField(term6674, term6674.getClass(), "time", term6679);
        setField(term6609, term6609.getClass(), "createdAt", term6674);
        setIntField(term6685, term6685.getClass(), "year", 2010);
        setShortField(term6685, term6685.getClass(), "month", (short) 9);
        setShortField(term6685, term6685.getClass(), "day", (short) 28);
        setField(term6684, term6684.getClass(), "date", term6685);
        setByteField(term6689, term6689.getClass(), "hour", (byte) 6);
        setByteField(term6689, term6689.getClass(), "minute", (byte) 4);
        setByteField(term6689, term6689.getClass(), "second", (byte) 54);
        setIntField(term6689, term6689.getClass(), "nano", 604713782);
        setField(term6684, term6684.getClass(), "time", term6689);
        setField(term6609, term6609.getClass(), "updatedAt", term6684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term6609, args);
    }

};


