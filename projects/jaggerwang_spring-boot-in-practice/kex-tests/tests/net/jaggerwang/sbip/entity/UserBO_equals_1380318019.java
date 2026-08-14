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

public class UserBO_equals_1380318019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27476;
     Object term27561;

    public UserBO_equals_1380318019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27477 = new Long(-7514437039500876647L);
        Long term27527 = new Long(204473662283899955L);
        term27476 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term27541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27546 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27556 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27476, term27476.getClass(), "id", term27477);
        setField(term27476, term27476.getClass(), "username", "QSrDQfEsTR");
        setField(term27476, term27476.getClass(), "password", "PsqusYmejD");
        setField(term27476, term27476.getClass(), "mobile", "NTWMiBEaDF");
        setField(term27476, term27476.getClass(), "email", "SPBstwKFVr");
        setField(term27476, term27476.getClass(), "avatarId", term27527);
        setField(term27476, term27476.getClass(), "intro", "WxYUTuqmIq");
        setIntField(term27542, term27542.getClass(), "year", 2018);
        setShortField(term27542, term27542.getClass(), "month", (short) 12);
        setShortField(term27542, term27542.getClass(), "day", (short) 17);
        setField(term27541, term27541.getClass(), "date", term27542);
        setByteField(term27546, term27546.getClass(), "hour", (byte) 2);
        setByteField(term27546, term27546.getClass(), "minute", (byte) 8);
        setByteField(term27546, term27546.getClass(), "second", (byte) 33);
        setIntField(term27546, term27546.getClass(), "nano", 799805513);
        setField(term27541, term27541.getClass(), "time", term27546);
        setField(term27476, term27476.getClass(), "createdAt", term27541);
        setIntField(term27552, term27552.getClass(), "year", 2015);
        setShortField(term27552, term27552.getClass(), "month", (short) 12);
        setShortField(term27552, term27552.getClass(), "day", (short) 18);
        setField(term27551, term27551.getClass(), "date", term27552);
        setByteField(term27556, term27556.getClass(), "hour", (byte) 21);
        setByteField(term27556, term27556.getClass(), "minute", (byte) 45);
        setByteField(term27556, term27556.getClass(), "second", (byte) 43);
        setIntField(term27556, term27556.getClass(), "nano", 629261984);
        setField(term27551, term27551.getClass(), "time", term27556);
        setField(term27476, term27476.getClass(), "updatedAt", term27551);
        term27561 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27561;
        callMethod(klass, "equals", argTypes, term27476, args);
    }

};


