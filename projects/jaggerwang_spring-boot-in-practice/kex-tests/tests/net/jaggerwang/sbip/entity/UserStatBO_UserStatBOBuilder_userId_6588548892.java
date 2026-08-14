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

public class UserStatBO_UserStatBOBuilder_userId_6588548892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12425;
     Object term12462;

    public UserStatBO_UserStatBOBuilder_userId_6588548892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12426 = new Long(4699157009689333952L);
        Long term12428 = new Long(-78240609295693193L);
        Long term12431 = new Long(3090901538358721367L);
        Long term12434 = new Long(-1677189124507026637L);
        Long term12437 = new Long(4795660804170399986L);
        Long term12440 = new Long(-4030863184426321096L);
        term12425 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder"));
        Object term12442 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12443 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12447 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12452 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12453 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12457 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12425, term12425.getClass(), "id", term12426);
        setField(term12425, term12425.getClass(), "userId", term12428);
        setBooleanField(term12425, term12425.getClass(), "postCount$set", true);
        setField(term12425, term12425.getClass(), "postCount$value", term12431);
        setBooleanField(term12425, term12425.getClass(), "likeCount$set", true);
        setField(term12425, term12425.getClass(), "likeCount$value", term12434);
        setBooleanField(term12425, term12425.getClass(), "followingCount$set", true);
        setField(term12425, term12425.getClass(), "followingCount$value", term12437);
        setBooleanField(term12425, term12425.getClass(), "followerCount$set", true);
        setField(term12425, term12425.getClass(), "followerCount$value", term12440);
        setIntField(term12443, term12443.getClass(), "year", 2028);
        setShortField(term12443, term12443.getClass(), "month", (short) 4);
        setShortField(term12443, term12443.getClass(), "day", (short) 11);
        setField(term12442, term12442.getClass(), "date", term12443);
        setByteField(term12447, term12447.getClass(), "hour", (byte) 4);
        setByteField(term12447, term12447.getClass(), "minute", (byte) 45);
        setByteField(term12447, term12447.getClass(), "second", (byte) 2);
        setIntField(term12447, term12447.getClass(), "nano", 374177968);
        setField(term12442, term12442.getClass(), "time", term12447);
        setField(term12425, term12425.getClass(), "createdAt", term12442);
        setIntField(term12453, term12453.getClass(), "year", 2021);
        setShortField(term12453, term12453.getClass(), "month", (short) 4);
        setShortField(term12453, term12453.getClass(), "day", (short) 22);
        setField(term12452, term12452.getClass(), "date", term12453);
        setByteField(term12457, term12457.getClass(), "hour", (byte) 17);
        setByteField(term12457, term12457.getClass(), "minute", (byte) 6);
        setByteField(term12457, term12457.getClass(), "second", (byte) 33);
        setIntField(term12457, term12457.getClass(), "nano", 21410850);
        setField(term12452, term12452.getClass(), "time", term12457);
        setField(term12425, term12425.getClass(), "updatedAt", term12452);
        term12462 = new Long(-8010214112439224349L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12462;
        callMethod(klass, "userId", argTypes, term12425, args);
    }

};


