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
import java.lang.Object;

public class PostStatBO_PostStatBOBuilder_updatedAt_13483234905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21236;
     Object term21264;

    public PostStatBO_PostStatBOBuilder_updatedAt_13483234905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21237 = new Long(-6771377873268167033L);
        Long term21239 = new Long(1278107327214302894L);
        Long term21242 = new Long(3104349415269466587L);
        term21236 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder"));
        Object term21244 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21245 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21249 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21254 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21255 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21259 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21236, term21236.getClass(), "id", term21237);
        setField(term21236, term21236.getClass(), "postId", term21239);
        setBooleanField(term21236, term21236.getClass(), "likeCount$set", false);
        setField(term21236, term21236.getClass(), "likeCount$value", term21242);
        setIntField(term21245, term21245.getClass(), "year", 2019);
        setShortField(term21245, term21245.getClass(), "month", (short) 12);
        setShortField(term21245, term21245.getClass(), "day", (short) 13);
        setField(term21244, term21244.getClass(), "date", term21245);
        setByteField(term21249, term21249.getClass(), "hour", (byte) 17);
        setByteField(term21249, term21249.getClass(), "minute", (byte) 38);
        setByteField(term21249, term21249.getClass(), "second", (byte) 43);
        setIntField(term21249, term21249.getClass(), "nano", 435007801);
        setField(term21244, term21244.getClass(), "time", term21249);
        setField(term21236, term21236.getClass(), "createdAt", term21244);
        setIntField(term21255, term21255.getClass(), "year", 2017);
        setShortField(term21255, term21255.getClass(), "month", (short) 8);
        setShortField(term21255, term21255.getClass(), "day", (short) 6);
        setField(term21254, term21254.getClass(), "date", term21255);
        setByteField(term21259, term21259.getClass(), "hour", (byte) 22);
        setByteField(term21259, term21259.getClass(), "minute", (byte) 46);
        setByteField(term21259, term21259.getClass(), "second", (byte) 47);
        setIntField(term21259, term21259.getClass(), "nano", 782967389);
        setField(term21254, term21254.getClass(), "time", term21259);
        setField(term21236, term21236.getClass(), "updatedAt", term21254);
        term21264 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21265 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21269 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term21265, term21265.getClass(), "year", 2029);
        setShortField(term21265, term21265.getClass(), "month", (short) 3);
        setShortField(term21265, term21265.getClass(), "day", (short) 3);
        setField(term21264, term21264.getClass(), "date", term21265);
        setByteField(term21269, term21269.getClass(), "hour", (byte) 2);
        setByteField(term21269, term21269.getClass(), "minute", (byte) 29);
        setByteField(term21269, term21269.getClass(), "second", (byte) 54);
        setIntField(term21269, term21269.getClass(), "nano", 846675209);
        setField(term21264, term21264.getClass(), "time", term21269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term21264;
        callMethod(klass, "updatedAt", argTypes, term21236, args);
    }

};


