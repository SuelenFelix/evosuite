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
import java.lang.Object;

public class PostLike_PostLikeBuilder_toString_1957829757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22994;

    public PostLike_PostLikeBuilder_toString_1957829757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22995 = new Long(-2577420466618938650L);
        Long term22997 = new Long(5614572229094721840L);
        Long term22999 = new Long(-159468133651974975L);
        term22994 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike$PostLikeBuilder"));
        Object term23001 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23002 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23006 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23016 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22994, term22994.getClass(), "id", term22995);
        setField(term22994, term22994.getClass(), "userId", term22997);
        setField(term22994, term22994.getClass(), "postId", term22999);
        setIntField(term23002, term23002.getClass(), "year", 2018);
        setShortField(term23002, term23002.getClass(), "month", (short) 7);
        setShortField(term23002, term23002.getClass(), "day", (short) 24);
        setField(term23001, term23001.getClass(), "date", term23002);
        setByteField(term23006, term23006.getClass(), "hour", (byte) 8);
        setByteField(term23006, term23006.getClass(), "minute", (byte) 32);
        setByteField(term23006, term23006.getClass(), "second", (byte) 43);
        setIntField(term23006, term23006.getClass(), "nano", 490940025);
        setField(term23001, term23001.getClass(), "time", term23006);
        setField(term22994, term22994.getClass(), "createdAt", term23001);
        setIntField(term23012, term23012.getClass(), "year", 2018);
        setShortField(term23012, term23012.getClass(), "month", (short) 7);
        setShortField(term23012, term23012.getClass(), "day", (short) 6);
        setField(term23011, term23011.getClass(), "date", term23012);
        setByteField(term23016, term23016.getClass(), "hour", (byte) 6);
        setByteField(term23016, term23016.getClass(), "minute", (byte) 33);
        setByteField(term23016, term23016.getClass(), "second", (byte) 21);
        setIntField(term23016, term23016.getClass(), "nano", 484192339);
        setField(term23011, term23011.getClass(), "time", term23016);
        setField(term22994, term22994.getClass(), "updatedAt", term23011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike$PostLikeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term22994, args);
    }

};


