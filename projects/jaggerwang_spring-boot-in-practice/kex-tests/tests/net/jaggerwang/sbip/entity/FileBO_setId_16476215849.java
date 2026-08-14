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

public class FileBO_setId_16476215849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6956;
     Object term7041;

    public FileBO_setId_16476215849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6957 = new Long(-8654565919063661957L);
        Long term6959 = new Long(-5248475803419977214L);
        Class<? extends Object> term7044 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term7043 = ((Class) term7044).getDeclaredField((String) "LOCAL");
        ((Field) term7043).setAccessible(true);
        Object enum18 = ((Field) term7043).get((Object) null);
        Long term7007 = new Long(-6723783499250797216L);
        term6956 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term6994 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term7021 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7026 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7031 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7032 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7036 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6956, term6956.getClass(), "id", term6957);
        setField(term6956, term6956.getClass(), "userId", term6959);
        setField(term6956, term6956.getClass(), "region", enum18);
        setField(term6956, term6956.getClass(), "bucket", "SPpkrGcPRr");
        setField(term6956, term6956.getClass(), "path", "sEccwbJKYE");
        setField(term6994, term6994.getClass(), "name", "AWRooQKkdW");
        setField(term6994, term6994.getClass(), "size", term7007);
        setField(term6994, term6994.getClass(), "type", "vjxIhXHxGR");
        setField(term6956, term6956.getClass(), "meta", term6994);
        setIntField(term7022, term7022.getClass(), "year", 2023);
        setShortField(term7022, term7022.getClass(), "month", (short) 7);
        setShortField(term7022, term7022.getClass(), "day", (short) 16);
        setField(term7021, term7021.getClass(), "date", term7022);
        setByteField(term7026, term7026.getClass(), "hour", (byte) 3);
        setByteField(term7026, term7026.getClass(), "minute", (byte) 1);
        setByteField(term7026, term7026.getClass(), "second", (byte) 19);
        setIntField(term7026, term7026.getClass(), "nano", 488629554);
        setField(term7021, term7021.getClass(), "time", term7026);
        setField(term6956, term6956.getClass(), "createdAt", term7021);
        setIntField(term7032, term7032.getClass(), "year", 2018);
        setShortField(term7032, term7032.getClass(), "month", (short) 7);
        setShortField(term7032, term7032.getClass(), "day", (short) 12);
        setField(term7031, term7031.getClass(), "date", term7032);
        setByteField(term7036, term7036.getClass(), "hour", (byte) 1);
        setByteField(term7036, term7036.getClass(), "minute", (byte) 3);
        setByteField(term7036, term7036.getClass(), "second", (byte) 47);
        setIntField(term7036, term7036.getClass(), "nano", 2729929);
        setField(term7031, term7031.getClass(), "time", term7036);
        setField(term6956, term6956.getClass(), "updatedAt", term7031);
        term7041 = new Long(41775768178052008L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term7041;
        callMethod(klass, "setId", argTypes, term6956, args);
    }

};


