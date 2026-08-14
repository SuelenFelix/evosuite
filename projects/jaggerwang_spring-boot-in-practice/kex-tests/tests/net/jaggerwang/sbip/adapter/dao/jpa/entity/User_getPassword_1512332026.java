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

public class User_getPassword_1512332026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28146;

    public User_getPassword_1512332026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28147 = new Long(2923644849350978175L);
        Long term28197 = new Long(-575923088526116016L);
        term28146 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term28211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28216 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28221 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28222 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28226 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28146, term28146.getClass(), "id", term28147);
        setField(term28146, term28146.getClass(), "username", "oPxuZbkYio");
        setField(term28146, term28146.getClass(), "password", "vKitydDVnM");
        setField(term28146, term28146.getClass(), "mobile", "urCiQnUFBM");
        setField(term28146, term28146.getClass(), "email", "EKjQdtKxAM");
        setField(term28146, term28146.getClass(), "avatarId", term28197);
        setField(term28146, term28146.getClass(), "intro", "TXZAIPQJHt");
        setIntField(term28212, term28212.getClass(), "year", 2026);
        setShortField(term28212, term28212.getClass(), "month", (short) 9);
        setShortField(term28212, term28212.getClass(), "day", (short) 22);
        setField(term28211, term28211.getClass(), "date", term28212);
        setByteField(term28216, term28216.getClass(), "hour", (byte) 22);
        setByteField(term28216, term28216.getClass(), "minute", (byte) 25);
        setByteField(term28216, term28216.getClass(), "second", (byte) 25);
        setIntField(term28216, term28216.getClass(), "nano", 526433618);
        setField(term28211, term28211.getClass(), "time", term28216);
        setField(term28146, term28146.getClass(), "createdAt", term28211);
        setIntField(term28222, term28222.getClass(), "year", 2017);
        setShortField(term28222, term28222.getClass(), "month", (short) 8);
        setShortField(term28222, term28222.getClass(), "day", (short) 11);
        setField(term28221, term28221.getClass(), "date", term28222);
        setByteField(term28226, term28226.getClass(), "hour", (byte) 0);
        setByteField(term28226, term28226.getClass(), "minute", (byte) 12);
        setByteField(term28226, term28226.getClass(), "second", (byte) 8);
        setIntField(term28226, term28226.getClass(), "nano", 421599135);
        setField(term28221, term28221.getClass(), "time", term28226);
        setField(term28146, term28146.getClass(), "updatedAt", term28221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term28146, args);
    }

};


