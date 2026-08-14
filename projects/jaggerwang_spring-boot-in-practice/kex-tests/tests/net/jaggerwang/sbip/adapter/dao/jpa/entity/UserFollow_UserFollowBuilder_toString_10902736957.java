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

public class UserFollow_UserFollowBuilder_toString_10902736957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22772;

    public UserFollow_UserFollowBuilder_toString_10902736957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22773 = new Long(-955253666696787757L);
        Long term22775 = new Long(-99017747847004910L);
        Long term22777 = new Long(797798302378380033L);
        term22772 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow$UserFollowBuilder"));
        Object term22779 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22780 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22784 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22789 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22790 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22794 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22772, term22772.getClass(), "id", term22773);
        setField(term22772, term22772.getClass(), "followingId", term22775);
        setField(term22772, term22772.getClass(), "followerId", term22777);
        setIntField(term22780, term22780.getClass(), "year", 2014);
        setShortField(term22780, term22780.getClass(), "month", (short) 5);
        setShortField(term22780, term22780.getClass(), "day", (short) 20);
        setField(term22779, term22779.getClass(), "date", term22780);
        setByteField(term22784, term22784.getClass(), "hour", (byte) 12);
        setByteField(term22784, term22784.getClass(), "minute", (byte) 30);
        setByteField(term22784, term22784.getClass(), "second", (byte) 37);
        setIntField(term22784, term22784.getClass(), "nano", 390283474);
        setField(term22779, term22779.getClass(), "time", term22784);
        setField(term22772, term22772.getClass(), "createdAt", term22779);
        setIntField(term22790, term22790.getClass(), "year", 2028);
        setShortField(term22790, term22790.getClass(), "month", (short) 11);
        setShortField(term22790, term22790.getClass(), "day", (short) 28);
        setField(term22789, term22789.getClass(), "date", term22790);
        setByteField(term22794, term22794.getClass(), "hour", (byte) 4);
        setByteField(term22794, term22794.getClass(), "minute", (byte) 25);
        setByteField(term22794, term22794.getClass(), "second", (byte) 12);
        setIntField(term22794, term22794.getClass(), "nano", 726554360);
        setField(term22789, term22789.getClass(), "time", term22794);
        setField(term22772, term22772.getClass(), "updatedAt", term22789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow$UserFollowBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term22772, args);
    }

};


