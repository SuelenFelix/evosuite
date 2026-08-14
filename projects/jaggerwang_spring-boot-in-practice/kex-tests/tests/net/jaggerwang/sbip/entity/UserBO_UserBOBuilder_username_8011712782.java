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

public class UserBO_UserBOBuilder_username_8011712782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28312;

    public UserBO_UserBOBuilder_username_8011712782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28313 = new Long(8261619652909874476L);
        Long term28363 = new Long(-3692936312179064102L);
        term28312 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder"));
        Object term28377 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28378 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28382 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28387 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28388 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28392 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28312, term28312.getClass(), "id", term28313);
        setField(term28312, term28312.getClass(), "username", "RCOqfVsRHt");
        setField(term28312, term28312.getClass(), "password", "TSyCeEZPaT");
        setField(term28312, term28312.getClass(), "mobile", "JeZFtaqkzW");
        setField(term28312, term28312.getClass(), "email", "vOVuNSCCLe");
        setField(term28312, term28312.getClass(), "avatarId", term28363);
        setField(term28312, term28312.getClass(), "intro", "fzeqPnzpnt");
        setIntField(term28378, term28378.getClass(), "year", 2014);
        setShortField(term28378, term28378.getClass(), "month", (short) 5);
        setShortField(term28378, term28378.getClass(), "day", (short) 18);
        setField(term28377, term28377.getClass(), "date", term28378);
        setByteField(term28382, term28382.getClass(), "hour", (byte) 19);
        setByteField(term28382, term28382.getClass(), "minute", (byte) 25);
        setByteField(term28382, term28382.getClass(), "second", (byte) 8);
        setIntField(term28382, term28382.getClass(), "nano", 217186771);
        setField(term28377, term28377.getClass(), "time", term28382);
        setField(term28312, term28312.getClass(), "createdAt", term28377);
        setIntField(term28388, term28388.getClass(), "year", 2023);
        setShortField(term28388, term28388.getClass(), "month", (short) 2);
        setShortField(term28388, term28388.getClass(), "day", (short) 27);
        setField(term28387, term28387.getClass(), "date", term28388);
        setByteField(term28392, term28392.getClass(), "hour", (byte) 5);
        setByteField(term28392, term28392.getClass(), "minute", (byte) 50);
        setByteField(term28392, term28392.getClass(), "second", (byte) 50);
        setIntField(term28392, term28392.getClass(), "nano", 528521692);
        setField(term28387, term28387.getClass(), "time", term28392);
        setField(term28312, term28312.getClass(), "updatedAt", term28387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RxbhrFBjkO";
        callMethod(klass, "username", argTypes, term28312, args);
    }

};


