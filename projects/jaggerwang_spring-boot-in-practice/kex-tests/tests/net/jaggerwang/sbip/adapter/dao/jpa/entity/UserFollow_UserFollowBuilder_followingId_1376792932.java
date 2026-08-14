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

public class UserFollow_UserFollowBuilder_followingId_1376792932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22613;
     Object term22640;

    public UserFollow_UserFollowBuilder_followingId_1376792932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22614 = new Long(-1978508496784157882L);
        Long term22616 = new Long(-7840999196900383276L);
        Long term22618 = new Long(1528628920302068646L);
        term22613 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow$UserFollowBuilder"));
        Object term22620 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22621 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22625 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22635 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22613, term22613.getClass(), "id", term22614);
        setField(term22613, term22613.getClass(), "followingId", term22616);
        setField(term22613, term22613.getClass(), "followerId", term22618);
        setIntField(term22621, term22621.getClass(), "year", 2017);
        setShortField(term22621, term22621.getClass(), "month", (short) 2);
        setShortField(term22621, term22621.getClass(), "day", (short) 5);
        setField(term22620, term22620.getClass(), "date", term22621);
        setByteField(term22625, term22625.getClass(), "hour", (byte) 5);
        setByteField(term22625, term22625.getClass(), "minute", (byte) 46);
        setByteField(term22625, term22625.getClass(), "second", (byte) 38);
        setIntField(term22625, term22625.getClass(), "nano", 214202896);
        setField(term22620, term22620.getClass(), "time", term22625);
        setField(term22613, term22613.getClass(), "createdAt", term22620);
        setIntField(term22631, term22631.getClass(), "year", 2025);
        setShortField(term22631, term22631.getClass(), "month", (short) 6);
        setShortField(term22631, term22631.getClass(), "day", (short) 18);
        setField(term22630, term22630.getClass(), "date", term22631);
        setByteField(term22635, term22635.getClass(), "hour", (byte) 14);
        setByteField(term22635, term22635.getClass(), "minute", (byte) 17);
        setByteField(term22635, term22635.getClass(), "second", (byte) 34);
        setIntField(term22635, term22635.getClass(), "nano", 564527758);
        setField(term22630, term22630.getClass(), "time", term22635);
        setField(term22613, term22613.getClass(), "updatedAt", term22630);
        term22640 = new Long(3161040540173678206L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow$UserFollowBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term22640;
        callMethod(klass, "followingId", argTypes, term22613, args);
    }

};


