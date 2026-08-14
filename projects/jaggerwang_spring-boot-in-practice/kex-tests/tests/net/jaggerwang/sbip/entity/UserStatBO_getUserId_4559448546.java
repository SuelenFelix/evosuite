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

public class UserStatBO_getUserId_4559448546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11668;

    public UserStatBO_getUserId_4559448546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11669 = new Long(2297097306706899827L);
        Long term11671 = new Long(-900457279156388404L);
        Long term11673 = new Long(0L);
        Long term11675 = new Long(0L);
        Long term11677 = new Long(0L);
        Long term11679 = new Long(0L);
        term11668 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term11681 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11686 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11696 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11668, term11668.getClass(), "id", term11669);
        setField(term11668, term11668.getClass(), "userId", term11671);
        setField(term11668, term11668.getClass(), "postCount", term11673);
        setField(term11668, term11668.getClass(), "likeCount", term11675);
        setField(term11668, term11668.getClass(), "followingCount", term11677);
        setField(term11668, term11668.getClass(), "followerCount", term11679);
        setIntField(term11682, term11682.getClass(), "year", 2028);
        setShortField(term11682, term11682.getClass(), "month", (short) 4);
        setShortField(term11682, term11682.getClass(), "day", (short) 1);
        setField(term11681, term11681.getClass(), "date", term11682);
        setByteField(term11686, term11686.getClass(), "hour", (byte) 16);
        setByteField(term11686, term11686.getClass(), "minute", (byte) 22);
        setByteField(term11686, term11686.getClass(), "second", (byte) 32);
        setIntField(term11686, term11686.getClass(), "nano", 406353763);
        setField(term11681, term11681.getClass(), "time", term11686);
        setField(term11668, term11668.getClass(), "createdAt", term11681);
        setIntField(term11692, term11692.getClass(), "year", 2019);
        setShortField(term11692, term11692.getClass(), "month", (short) 7);
        setShortField(term11692, term11692.getClass(), "day", (short) 19);
        setField(term11691, term11691.getClass(), "date", term11692);
        setByteField(term11696, term11696.getClass(), "hour", (byte) 10);
        setByteField(term11696, term11696.getClass(), "minute", (byte) 54);
        setByteField(term11696, term11696.getClass(), "second", (byte) 55);
        setIntField(term11696, term11696.getClass(), "nano", 244650454);
        setField(term11691, term11691.getClass(), "time", term11696);
        setField(term11668, term11668.getClass(), "updatedAt", term11691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term11668, args);
    }

};


