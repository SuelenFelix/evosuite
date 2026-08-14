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
import java.util.ArrayList;

public class Post_setUserId_67073170113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7904;
     Object term7966;

    public Post_setUserId_67073170113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7905 = new Long(3666226122807672448L);
        Long term7907 = new Long(3108750145697087661L);
        Class<? extends Object> term7969 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term7968 = ((Class) term7969).getDeclaredField((String) "IMAGE");
        ((Field) term7968).setAccessible(true);
        Object enum22 = ((Field) term7968).get((Object) null);
        Long term7932 = new Long(3752337209837437327L);
        Long term7934 = new Long(1860789353508856614L);
        Long term7936 = new Long(-7456852906235966771L);
        Long term7938 = new Long(-67485388932970712L);
        Long term7940 = new Long(5806367330808555223L);
        ArrayList term7930 = new ArrayList();
        ((ArrayList) term7930).add(term7932);
        ((ArrayList) term7930).add(term7934);
        ((ArrayList) term7930).add(term7936);
        ((ArrayList) term7930).add(term7938);
        ((ArrayList) term7930).add(term7940);
        Long term7944 = new Long(4576699120365923235L);
        term7904 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term7946 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7947 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7951 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7956 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7957 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7961 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7904, term7904.getClass(), "id", term7905);
        setField(term7904, term7904.getClass(), "userId", term7907);
        setField(term7904, term7904.getClass(), "type", enum22);
        setField(term7904, term7904.getClass(), "text", "ffYhPOzlUs");
        setField(term7904, term7904.getClass(), "imageIds", term7930);
        setField(term7904, term7904.getClass(), "videoId", term7944);
        setIntField(term7947, term7947.getClass(), "year", 2021);
        setShortField(term7947, term7947.getClass(), "month", (short) 8);
        setShortField(term7947, term7947.getClass(), "day", (short) 27);
        setField(term7946, term7946.getClass(), "date", term7947);
        setByteField(term7951, term7951.getClass(), "hour", (byte) 20);
        setByteField(term7951, term7951.getClass(), "minute", (byte) 11);
        setByteField(term7951, term7951.getClass(), "second", (byte) 47);
        setIntField(term7951, term7951.getClass(), "nano", 116303493);
        setField(term7946, term7946.getClass(), "time", term7951);
        setField(term7904, term7904.getClass(), "createdAt", term7946);
        setIntField(term7957, term7957.getClass(), "year", 2012);
        setShortField(term7957, term7957.getClass(), "month", (short) 5);
        setShortField(term7957, term7957.getClass(), "day", (short) 17);
        setField(term7956, term7956.getClass(), "date", term7957);
        setByteField(term7961, term7961.getClass(), "hour", (byte) 19);
        setByteField(term7961, term7961.getClass(), "minute", (byte) 36);
        setByteField(term7961, term7961.getClass(), "second", (byte) 33);
        setIntField(term7961, term7961.getClass(), "nano", 46625011);
        setField(term7956, term7956.getClass(), "time", term7961);
        setField(term7904, term7904.getClass(), "updatedAt", term7956);
        term7966 = new Long(-1635471392209071620L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term7966;
        callMethod(klass, "setUserId", argTypes, term7904, args);
    }

};


