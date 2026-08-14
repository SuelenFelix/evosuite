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

public class PostLike_PostLikeBuilder_userId_3295851432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22835;
     Object term22862;

    public PostLike_PostLikeBuilder_userId_3295851432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22836 = new Long(-6806576523000182981L);
        Long term22838 = new Long(6437032166810658671L);
        Long term22840 = new Long(6044346825617132280L);
        term22835 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike$PostLikeBuilder"));
        Object term22842 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22847 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22852 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22853 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22857 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22835, term22835.getClass(), "id", term22836);
        setField(term22835, term22835.getClass(), "userId", term22838);
        setField(term22835, term22835.getClass(), "postId", term22840);
        setIntField(term22843, term22843.getClass(), "year", 2010);
        setShortField(term22843, term22843.getClass(), "month", (short) 3);
        setShortField(term22843, term22843.getClass(), "day", (short) 22);
        setField(term22842, term22842.getClass(), "date", term22843);
        setByteField(term22847, term22847.getClass(), "hour", (byte) 23);
        setByteField(term22847, term22847.getClass(), "minute", (byte) 36);
        setByteField(term22847, term22847.getClass(), "second", (byte) 22);
        setIntField(term22847, term22847.getClass(), "nano", 781575122);
        setField(term22842, term22842.getClass(), "time", term22847);
        setField(term22835, term22835.getClass(), "createdAt", term22842);
        setIntField(term22853, term22853.getClass(), "year", 2015);
        setShortField(term22853, term22853.getClass(), "month", (short) 8);
        setShortField(term22853, term22853.getClass(), "day", (short) 6);
        setField(term22852, term22852.getClass(), "date", term22853);
        setByteField(term22857, term22857.getClass(), "hour", (byte) 16);
        setByteField(term22857, term22857.getClass(), "minute", (byte) 16);
        setByteField(term22857, term22857.getClass(), "second", (byte) 21);
        setIntField(term22857, term22857.getClass(), "nano", 274900303);
        setField(term22852, term22852.getClass(), "time", term22857);
        setField(term22835, term22835.getClass(), "updatedAt", term22852);
        term22862 = new Long(-4994148485124075625L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike$PostLikeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term22862;
        callMethod(klass, "userId", argTypes, term22835, args);
    }

};


