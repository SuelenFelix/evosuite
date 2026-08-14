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

public class UserStatBO_UserStatBOBuilder_followerCount_280507826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12581;
     Object term12618;

    public UserStatBO_UserStatBOBuilder_followerCount_280507826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12582 = new Long(-3954795081650780841L);
        Long term12584 = new Long(3288791194263207397L);
        Long term12587 = new Long(3288941170644426558L);
        Long term12590 = new Long(-8338004844694486146L);
        Long term12593 = new Long(6426732259596412988L);
        Long term12596 = new Long(185793058502220865L);
        term12581 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder"));
        Object term12598 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12599 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12603 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12609 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12613 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12581, term12581.getClass(), "id", term12582);
        setField(term12581, term12581.getClass(), "userId", term12584);
        setBooleanField(term12581, term12581.getClass(), "postCount$set", true);
        setField(term12581, term12581.getClass(), "postCount$value", term12587);
        setBooleanField(term12581, term12581.getClass(), "likeCount$set", true);
        setField(term12581, term12581.getClass(), "likeCount$value", term12590);
        setBooleanField(term12581, term12581.getClass(), "followingCount$set", true);
        setField(term12581, term12581.getClass(), "followingCount$value", term12593);
        setBooleanField(term12581, term12581.getClass(), "followerCount$set", true);
        setField(term12581, term12581.getClass(), "followerCount$value", term12596);
        setIntField(term12599, term12599.getClass(), "year", 2026);
        setShortField(term12599, term12599.getClass(), "month", (short) 6);
        setShortField(term12599, term12599.getClass(), "day", (short) 13);
        setField(term12598, term12598.getClass(), "date", term12599);
        setByteField(term12603, term12603.getClass(), "hour", (byte) 19);
        setByteField(term12603, term12603.getClass(), "minute", (byte) 23);
        setByteField(term12603, term12603.getClass(), "second", (byte) 46);
        setIntField(term12603, term12603.getClass(), "nano", 67955056);
        setField(term12598, term12598.getClass(), "time", term12603);
        setField(term12581, term12581.getClass(), "createdAt", term12598);
        setIntField(term12609, term12609.getClass(), "year", 2013);
        setShortField(term12609, term12609.getClass(), "month", (short) 12);
        setShortField(term12609, term12609.getClass(), "day", (short) 23);
        setField(term12608, term12608.getClass(), "date", term12609);
        setByteField(term12613, term12613.getClass(), "hour", (byte) 1);
        setByteField(term12613, term12613.getClass(), "minute", (byte) 0);
        setByteField(term12613, term12613.getClass(), "second", (byte) 32);
        setIntField(term12613, term12613.getClass(), "nano", 168525686);
        setField(term12608, term12608.getClass(), "time", term12613);
        setField(term12581, term12581.getClass(), "updatedAt", term12608);
        term12618 = new Long(-7698746988132548371L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12618;
        callMethod(klass, "followerCount", argTypes, term12581, args);
    }

};


