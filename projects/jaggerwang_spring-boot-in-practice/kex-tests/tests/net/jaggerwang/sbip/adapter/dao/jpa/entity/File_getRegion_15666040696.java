package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class File_getRegion_15666040696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15851;

    public File_getRegion_15666040696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15852 = new Long(-997945615782059734L);
        Long term15854 = new Long(-599981502351912419L);
        Class<? extends Object> term15937 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term15936 = ((Class) term15937).getDeclaredField((String) "LOCAL");
        ((Field) term15936).setAccessible(true);
        Object enum40 = ((Field) term15936).get((Object) null);
        Long term15902 = new Long(8171709541116491249L);
        term15851 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term15889 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term15916 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15917 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15921 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15926 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15927 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15931 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term15851, term15851.getClass(), "id", term15852);
        setField(term15851, term15851.getClass(), "userId", term15854);
        setField(term15851, term15851.getClass(), "region", enum40);
        setField(term15851, term15851.getClass(), "bucket", "HzqpegHiRq");
        setField(term15851, term15851.getClass(), "path", "jwsfVjMoJT");
        setField(term15889, term15889.getClass(), "name", "ZfdXfCCFDf");
        setField(term15889, term15889.getClass(), "size", term15902);
        setField(term15889, term15889.getClass(), "type", "MwwjNtdOFT");
        setField(term15851, term15851.getClass(), "meta", term15889);
        setIntField(term15917, term15917.getClass(), "year", 2016);
        setShortField(term15917, term15917.getClass(), "month", (short) 4);
        setShortField(term15917, term15917.getClass(), "day", (short) 23);
        setField(term15916, term15916.getClass(), "date", term15917);
        setByteField(term15921, term15921.getClass(), "hour", (byte) 13);
        setByteField(term15921, term15921.getClass(), "minute", (byte) 34);
        setByteField(term15921, term15921.getClass(), "second", (byte) 22);
        setIntField(term15921, term15921.getClass(), "nano", 20103660);
        setField(term15916, term15916.getClass(), "time", term15921);
        setField(term15851, term15851.getClass(), "createdAt", term15916);
        setIntField(term15927, term15927.getClass(), "year", 2023);
        setShortField(term15927, term15927.getClass(), "month", (short) 1);
        setShortField(term15927, term15927.getClass(), "day", (short) 24);
        setField(term15926, term15926.getClass(), "date", term15927);
        setByteField(term15931, term15931.getClass(), "hour", (byte) 10);
        setByteField(term15931, term15931.getClass(), "minute", (byte) 26);
        setByteField(term15931, term15931.getClass(), "second", (byte) 14);
        setIntField(term15931, term15931.getClass(), "nano", 736807866);
        setField(term15926, term15926.getClass(), "time", term15931);
        setField(term15851, term15851.getClass(), "updatedAt", term15926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion", argTypes, term15851, args);
    }

};


