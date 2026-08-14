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

public class PostBO_PostBOBuilder_build_10219373099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23880;

    public PostBO_PostBOBuilder_build_10219373099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23881 = new Long(3831994970480278159L);
        Long term23883 = new Long(-5714578622746827780L);
        Class<? extends Object> term23949 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term23948 = ((Class) term23949).getDeclaredField((String) "IMAGE");
        ((Field) term23948).setAccessible(true);
        Object enum68 = ((Field) term23948).get((Object) null);
        Long term23908 = new Long(8918129626022907229L);
        Long term23910 = new Long(6269054578518955349L);
        Long term23912 = new Long(-143609946830350439L);
        Long term23914 = new Long(2018084438165711668L);
        Long term23916 = new Long(-8705953038984862378L);
        Long term23918 = new Long(-7589547201844161961L);
        Long term23920 = new Long(8847748922379375307L);
        Long term23922 = new Long(1350676497718116574L);
        ArrayList term23906 = new ArrayList();
        ((ArrayList) term23906).add(term23908);
        ((ArrayList) term23906).add(term23910);
        ((ArrayList) term23906).add(term23912);
        ((ArrayList) term23906).add(term23914);
        ((ArrayList) term23906).add(term23916);
        ((ArrayList) term23906).add(term23918);
        ((ArrayList) term23906).add(term23920);
        ((ArrayList) term23906).add(term23922);
        Long term23926 = new Long(-4477377284889705897L);
        term23880 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder"));
        Object term23928 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23933 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23938 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23939 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23943 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23880, term23880.getClass(), "id", term23881);
        setField(term23880, term23880.getClass(), "userId", term23883);
        setField(term23880, term23880.getClass(), "type", enum68);
        setField(term23880, term23880.getClass(), "text", "FwPbDZcHmB");
        setField(term23880, term23880.getClass(), "imageIds", term23906);
        setField(term23880, term23880.getClass(), "videoId", term23926);
        setIntField(term23929, term23929.getClass(), "year", 2011);
        setShortField(term23929, term23929.getClass(), "month", (short) 10);
        setShortField(term23929, term23929.getClass(), "day", (short) 10);
        setField(term23928, term23928.getClass(), "date", term23929);
        setByteField(term23933, term23933.getClass(), "hour", (byte) 5);
        setByteField(term23933, term23933.getClass(), "minute", (byte) 26);
        setByteField(term23933, term23933.getClass(), "second", (byte) 16);
        setIntField(term23933, term23933.getClass(), "nano", 858245653);
        setField(term23928, term23928.getClass(), "time", term23933);
        setField(term23880, term23880.getClass(), "createdAt", term23928);
        setIntField(term23939, term23939.getClass(), "year", 2011);
        setShortField(term23939, term23939.getClass(), "month", (short) 3);
        setShortField(term23939, term23939.getClass(), "day", (short) 25);
        setField(term23938, term23938.getClass(), "date", term23939);
        setByteField(term23943, term23943.getClass(), "hour", (byte) 20);
        setByteField(term23943, term23943.getClass(), "minute", (byte) 10);
        setByteField(term23943, term23943.getClass(), "second", (byte) 51);
        setIntField(term23943, term23943.getClass(), "nano", 162102574);
        setField(term23938, term23938.getClass(), "time", term23943);
        setField(term23880, term23880.getClass(), "updatedAt", term23938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term23880, args);
    }

};


