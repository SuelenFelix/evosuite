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

public class PostStatBO_PostStatBOBuilder_likeCount_4954616413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21168;
     Object term21196;

    public PostStatBO_PostStatBOBuilder_likeCount_4954616413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21169 = new Long(4012955251407483889L);
        Long term21171 = new Long(-4058686252500969842L);
        Long term21174 = new Long(6077991958696417121L);
        term21168 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder"));
        Object term21176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21181 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21191 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21168, term21168.getClass(), "id", term21169);
        setField(term21168, term21168.getClass(), "postId", term21171);
        setBooleanField(term21168, term21168.getClass(), "likeCount$set", true);
        setField(term21168, term21168.getClass(), "likeCount$value", term21174);
        setIntField(term21177, term21177.getClass(), "year", 2021);
        setShortField(term21177, term21177.getClass(), "month", (short) 12);
        setShortField(term21177, term21177.getClass(), "day", (short) 23);
        setField(term21176, term21176.getClass(), "date", term21177);
        setByteField(term21181, term21181.getClass(), "hour", (byte) 18);
        setByteField(term21181, term21181.getClass(), "minute", (byte) 52);
        setByteField(term21181, term21181.getClass(), "second", (byte) 27);
        setIntField(term21181, term21181.getClass(), "nano", 512484524);
        setField(term21176, term21176.getClass(), "time", term21181);
        setField(term21168, term21168.getClass(), "createdAt", term21176);
        setIntField(term21187, term21187.getClass(), "year", 2012);
        setShortField(term21187, term21187.getClass(), "month", (short) 6);
        setShortField(term21187, term21187.getClass(), "day", (short) 25);
        setField(term21186, term21186.getClass(), "date", term21187);
        setByteField(term21191, term21191.getClass(), "hour", (byte) 2);
        setByteField(term21191, term21191.getClass(), "minute", (byte) 21);
        setByteField(term21191, term21191.getClass(), "second", (byte) 28);
        setIntField(term21191, term21191.getClass(), "nano", 605177282);
        setField(term21186, term21186.getClass(), "time", term21191);
        setField(term21168, term21168.getClass(), "updatedAt", term21186);
        term21196 = new Long(-5004803270846838598L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term21196;
        callMethod(klass, "likeCount", argTypes, term21168, args);
    }

};


