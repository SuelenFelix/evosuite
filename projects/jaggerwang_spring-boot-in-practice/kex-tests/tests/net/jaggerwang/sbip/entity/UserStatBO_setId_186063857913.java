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

public class UserStatBO_setId_186063857913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11899;
     Object term11932;

    public UserStatBO_setId_186063857913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11900 = new Long(855932984568615096L);
        Long term11902 = new Long(-1616722610139554082L);
        Long term11904 = new Long(0L);
        Long term11906 = new Long(0L);
        Long term11908 = new Long(0L);
        Long term11910 = new Long(0L);
        term11899 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term11912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11917 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11922 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11923 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11927 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11899, term11899.getClass(), "id", term11900);
        setField(term11899, term11899.getClass(), "userId", term11902);
        setField(term11899, term11899.getClass(), "postCount", term11904);
        setField(term11899, term11899.getClass(), "likeCount", term11906);
        setField(term11899, term11899.getClass(), "followingCount", term11908);
        setField(term11899, term11899.getClass(), "followerCount", term11910);
        setIntField(term11913, term11913.getClass(), "year", 2021);
        setShortField(term11913, term11913.getClass(), "month", (short) 3);
        setShortField(term11913, term11913.getClass(), "day", (short) 13);
        setField(term11912, term11912.getClass(), "date", term11913);
        setByteField(term11917, term11917.getClass(), "hour", (byte) 6);
        setByteField(term11917, term11917.getClass(), "minute", (byte) 25);
        setByteField(term11917, term11917.getClass(), "second", (byte) 42);
        setIntField(term11917, term11917.getClass(), "nano", 282924199);
        setField(term11912, term11912.getClass(), "time", term11917);
        setField(term11899, term11899.getClass(), "createdAt", term11912);
        setIntField(term11923, term11923.getClass(), "year", 2020);
        setShortField(term11923, term11923.getClass(), "month", (short) 10);
        setShortField(term11923, term11923.getClass(), "day", (short) 25);
        setField(term11922, term11922.getClass(), "date", term11923);
        setByteField(term11927, term11927.getClass(), "hour", (byte) 18);
        setByteField(term11927, term11927.getClass(), "minute", (byte) 22);
        setByteField(term11927, term11927.getClass(), "second", (byte) 30);
        setIntField(term11927, term11927.getClass(), "nano", 948592965);
        setField(term11922, term11922.getClass(), "time", term11927);
        setField(term11899, term11899.getClass(), "updatedAt", term11922);
        term11932 = new Long(7495904023107549024L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term11932;
        callMethod(klass, "setId", argTypes, term11899, args);
    }

};


