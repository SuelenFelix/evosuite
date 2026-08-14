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

public class UserStatBO_equals_90708128821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12195;
     Object term12228;

    public UserStatBO_equals_90708128821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12196 = new Long(-7278883608542636188L);
        Long term12198 = new Long(-1539859611880912454L);
        Long term12200 = new Long(0L);
        Long term12202 = new Long(0L);
        Long term12204 = new Long(0L);
        Long term12206 = new Long(0L);
        term12195 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term12208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12213 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12218 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12223 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12195, term12195.getClass(), "id", term12196);
        setField(term12195, term12195.getClass(), "userId", term12198);
        setField(term12195, term12195.getClass(), "postCount", term12200);
        setField(term12195, term12195.getClass(), "likeCount", term12202);
        setField(term12195, term12195.getClass(), "followingCount", term12204);
        setField(term12195, term12195.getClass(), "followerCount", term12206);
        setIntField(term12209, term12209.getClass(), "year", 2027);
        setShortField(term12209, term12209.getClass(), "month", (short) 6);
        setShortField(term12209, term12209.getClass(), "day", (short) 20);
        setField(term12208, term12208.getClass(), "date", term12209);
        setByteField(term12213, term12213.getClass(), "hour", (byte) 23);
        setByteField(term12213, term12213.getClass(), "minute", (byte) 21);
        setByteField(term12213, term12213.getClass(), "second", (byte) 6);
        setIntField(term12213, term12213.getClass(), "nano", 897776059);
        setField(term12208, term12208.getClass(), "time", term12213);
        setField(term12195, term12195.getClass(), "createdAt", term12208);
        setIntField(term12219, term12219.getClass(), "year", 2016);
        setShortField(term12219, term12219.getClass(), "month", (short) 3);
        setShortField(term12219, term12219.getClass(), "day", (short) 20);
        setField(term12218, term12218.getClass(), "date", term12219);
        setByteField(term12223, term12223.getClass(), "hour", (byte) 0);
        setByteField(term12223, term12223.getClass(), "minute", (byte) 54);
        setByteField(term12223, term12223.getClass(), "second", (byte) 6);
        setIntField(term12223, term12223.getClass(), "nano", 183302469);
        setField(term12218, term12218.getClass(), "time", term12223);
        setField(term12195, term12195.getClass(), "updatedAt", term12218);
        term12228 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12228;
        callMethod(klass, "equals", argTypes, term12195, args);
    }

};


