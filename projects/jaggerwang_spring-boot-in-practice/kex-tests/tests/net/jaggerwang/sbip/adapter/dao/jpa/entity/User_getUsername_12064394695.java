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

public class User_getUsername_12064394695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28011;

    public User_getUsername_12064394695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28012 = new Long(5305896099727663023L);
        Long term28062 = new Long(6151197215723513345L);
        term28011 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term28076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28081 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28086 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28087 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28091 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28011, term28011.getClass(), "id", term28012);
        setField(term28011, term28011.getClass(), "username", "MYWYUeLGOp");
        setField(term28011, term28011.getClass(), "password", "tsTGdgQYUL");
        setField(term28011, term28011.getClass(), "mobile", "TtGbVmKcnX");
        setField(term28011, term28011.getClass(), "email", "GJVkUrCVdD");
        setField(term28011, term28011.getClass(), "avatarId", term28062);
        setField(term28011, term28011.getClass(), "intro", "zNdorvdUgu");
        setIntField(term28077, term28077.getClass(), "year", 2010);
        setShortField(term28077, term28077.getClass(), "month", (short) 2);
        setShortField(term28077, term28077.getClass(), "day", (short) 22);
        setField(term28076, term28076.getClass(), "date", term28077);
        setByteField(term28081, term28081.getClass(), "hour", (byte) 10);
        setByteField(term28081, term28081.getClass(), "minute", (byte) 57);
        setByteField(term28081, term28081.getClass(), "second", (byte) 47);
        setIntField(term28081, term28081.getClass(), "nano", 236871229);
        setField(term28076, term28076.getClass(), "time", term28081);
        setField(term28011, term28011.getClass(), "createdAt", term28076);
        setIntField(term28087, term28087.getClass(), "year", 2028);
        setShortField(term28087, term28087.getClass(), "month", (short) 10);
        setShortField(term28087, term28087.getClass(), "day", (short) 4);
        setField(term28086, term28086.getClass(), "date", term28087);
        setByteField(term28091, term28091.getClass(), "hour", (byte) 7);
        setByteField(term28091, term28091.getClass(), "minute", (byte) 45);
        setByteField(term28091, term28091.getClass(), "second", (byte) 52);
        setIntField(term28091, term28091.getClass(), "nano", 886309979);
        setField(term28086, term28086.getClass(), "time", term28091);
        setField(term28011, term28011.getClass(), "updatedAt", term28086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term28011, args);
    }

};


