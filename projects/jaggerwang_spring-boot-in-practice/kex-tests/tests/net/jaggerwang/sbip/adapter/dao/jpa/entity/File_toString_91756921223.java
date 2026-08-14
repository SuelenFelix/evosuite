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

public class File_toString_91756921223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21867;

    public File_toString_91756921223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21868 = new Long(-7155106718297861156L);
        Long term21870 = new Long(-4191270658895729623L);
        Class<? extends Object> term21953 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term21952 = ((Class) term21953).getDeclaredField((String) "LOCAL");
        ((Field) term21952).setAccessible(true);
        Object enum57 = ((Field) term21952).get((Object) null);
        Long term21918 = new Long(349726685019432833L);
        term21867 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term21905 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term21932 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21933 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21937 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21942 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21943 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21947 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21867, term21867.getClass(), "id", term21868);
        setField(term21867, term21867.getClass(), "userId", term21870);
        setField(term21867, term21867.getClass(), "region", enum57);
        setField(term21867, term21867.getClass(), "bucket", "OIHoJeysUi");
        setField(term21867, term21867.getClass(), "path", "WXMWFDGcLB");
        setField(term21905, term21905.getClass(), "name", "wKWbJssZuG");
        setField(term21905, term21905.getClass(), "size", term21918);
        setField(term21905, term21905.getClass(), "type", "NzBMMhkhpT");
        setField(term21867, term21867.getClass(), "meta", term21905);
        setIntField(term21933, term21933.getClass(), "year", 2015);
        setShortField(term21933, term21933.getClass(), "month", (short) 4);
        setShortField(term21933, term21933.getClass(), "day", (short) 22);
        setField(term21932, term21932.getClass(), "date", term21933);
        setByteField(term21937, term21937.getClass(), "hour", (byte) 15);
        setByteField(term21937, term21937.getClass(), "minute", (byte) 23);
        setByteField(term21937, term21937.getClass(), "second", (byte) 42);
        setIntField(term21937, term21937.getClass(), "nano", 822658620);
        setField(term21932, term21932.getClass(), "time", term21937);
        setField(term21867, term21867.getClass(), "createdAt", term21932);
        setIntField(term21943, term21943.getClass(), "year", 2020);
        setShortField(term21943, term21943.getClass(), "month", (short) 4);
        setShortField(term21943, term21943.getClass(), "day", (short) 27);
        setField(term21942, term21942.getClass(), "date", term21943);
        setByteField(term21947, term21947.getClass(), "hour", (byte) 16);
        setByteField(term21947, term21947.getClass(), "minute", (byte) 48);
        setByteField(term21947, term21947.getClass(), "second", (byte) 39);
        setIntField(term21947, term21947.getClass(), "nano", 250909266);
        setField(term21942, term21942.getClass(), "time", term21947);
        setField(term21867, term21867.getClass(), "updatedAt", term21942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term21867, args);
    }

};


