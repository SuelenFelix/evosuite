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

public class FileBO_getRegion_1572833573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4874;

    public FileBO_getRegion_1572833573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4875 = new Long(2936323121573284007L);
        Long term4877 = new Long(-1154553077993834885L);
        Class<? extends Object> term4960 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term4959 = ((Class) term4960).getDeclaredField((String) "LOCAL");
        ((Field) term4959).setAccessible(true);
        Object enum12 = ((Field) term4959).get((Object) null);
        Long term4925 = new Long(-2850532706972744550L);
        term4874 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term4912 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term4939 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4944 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4949 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4950 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4954 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4874, term4874.getClass(), "id", term4875);
        setField(term4874, term4874.getClass(), "userId", term4877);
        setField(term4874, term4874.getClass(), "region", enum12);
        setField(term4874, term4874.getClass(), "bucket", "oVgzLbrsFr");
        setField(term4874, term4874.getClass(), "path", "vQVyKLdtaz");
        setField(term4912, term4912.getClass(), "name", "OWKQODBLzb");
        setField(term4912, term4912.getClass(), "size", term4925);
        setField(term4912, term4912.getClass(), "type", "wGmYcqUkgE");
        setField(term4874, term4874.getClass(), "meta", term4912);
        setIntField(term4940, term4940.getClass(), "year", 2028);
        setShortField(term4940, term4940.getClass(), "month", (short) 10);
        setShortField(term4940, term4940.getClass(), "day", (short) 1);
        setField(term4939, term4939.getClass(), "date", term4940);
        setByteField(term4944, term4944.getClass(), "hour", (byte) 17);
        setByteField(term4944, term4944.getClass(), "minute", (byte) 29);
        setByteField(term4944, term4944.getClass(), "second", (byte) 30);
        setIntField(term4944, term4944.getClass(), "nano", 845472306);
        setField(term4939, term4939.getClass(), "time", term4944);
        setField(term4874, term4874.getClass(), "createdAt", term4939);
        setIntField(term4950, term4950.getClass(), "year", 2027);
        setShortField(term4950, term4950.getClass(), "month", (short) 2);
        setShortField(term4950, term4950.getClass(), "day", (short) 19);
        setField(term4949, term4949.getClass(), "date", term4950);
        setByteField(term4954, term4954.getClass(), "hour", (byte) 17);
        setByteField(term4954, term4954.getClass(), "minute", (byte) 37);
        setByteField(term4954, term4954.getClass(), "second", (byte) 27);
        setIntField(term4954, term4954.getClass(), "nano", 920380537);
        setField(term4949, term4949.getClass(), "time", term4954);
        setField(term4874, term4874.getClass(), "updatedAt", term4949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion", argTypes, term4874, args);
    }

};


