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

public class PostBO_setVideoId_29648642914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17208;
     Object term17264;

    public PostBO_setVideoId_29648642914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17209 = new Long(3746481521207337771L);
        Long term17211 = new Long(4341016500855678917L);
        Class<? extends Object> term17267 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term17266 = ((Class) term17267).getDeclaredField((String) "VIDEO");
        ((Field) term17266).setAccessible(true);
        Object enum47 = ((Field) term17266).get((Object) null);
        Long term17236 = new Long(-5871746020807491998L);
        Long term17238 = new Long(4742108233936970770L);
        ArrayList term17234 = new ArrayList();
        ((ArrayList) term17234).add(term17236);
        ((ArrayList) term17234).add(term17238);
        Long term17242 = new Long(2722004046017350471L);
        term17208 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term17244 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17245 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17249 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17254 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17255 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17259 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17208, term17208.getClass(), "id", term17209);
        setField(term17208, term17208.getClass(), "userId", term17211);
        setField(term17208, term17208.getClass(), "type", enum47);
        setField(term17208, term17208.getClass(), "text", "rLHAoqXgPh");
        setField(term17208, term17208.getClass(), "imageIds", term17234);
        setField(term17208, term17208.getClass(), "videoId", term17242);
        setIntField(term17245, term17245.getClass(), "year", 2026);
        setShortField(term17245, term17245.getClass(), "month", (short) 2);
        setShortField(term17245, term17245.getClass(), "day", (short) 5);
        setField(term17244, term17244.getClass(), "date", term17245);
        setByteField(term17249, term17249.getClass(), "hour", (byte) 1);
        setByteField(term17249, term17249.getClass(), "minute", (byte) 38);
        setByteField(term17249, term17249.getClass(), "second", (byte) 15);
        setIntField(term17249, term17249.getClass(), "nano", 167345230);
        setField(term17244, term17244.getClass(), "time", term17249);
        setField(term17208, term17208.getClass(), "createdAt", term17244);
        setIntField(term17255, term17255.getClass(), "year", 2029);
        setShortField(term17255, term17255.getClass(), "month", (short) 6);
        setShortField(term17255, term17255.getClass(), "day", (short) 4);
        setField(term17254, term17254.getClass(), "date", term17255);
        setByteField(term17259, term17259.getClass(), "hour", (byte) 22);
        setByteField(term17259, term17259.getClass(), "minute", (byte) 1);
        setByteField(term17259, term17259.getClass(), "second", (byte) 38);
        setIntField(term17259, term17259.getClass(), "nano", 329228491);
        setField(term17254, term17254.getClass(), "time", term17259);
        setField(term17208, term17208.getClass(), "updatedAt", term17254);
        term17264 = new Long(6636235983121346803L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term17264;
        callMethod(klass, "setVideoId", argTypes, term17208, args);
    }

};


