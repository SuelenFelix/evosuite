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

public class UserFollow_getFollowerId_3418744544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11617;

    public UserFollow_getFollowerId_3418744544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11618 = new Long(4139034517298316285L);
        Long term11620 = new Long(5797412846146719084L);
        Long term11622 = new Long(5319740127125920367L);
        term11617 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        Object term11624 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11625 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11629 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11634 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11635 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11639 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11617, term11617.getClass(), "id", term11618);
        setField(term11617, term11617.getClass(), "followingId", term11620);
        setField(term11617, term11617.getClass(), "followerId", term11622);
        setIntField(term11625, term11625.getClass(), "year", 2010);
        setShortField(term11625, term11625.getClass(), "month", (short) 3);
        setShortField(term11625, term11625.getClass(), "day", (short) 11);
        setField(term11624, term11624.getClass(), "date", term11625);
        setByteField(term11629, term11629.getClass(), "hour", (byte) 0);
        setByteField(term11629, term11629.getClass(), "minute", (byte) 21);
        setByteField(term11629, term11629.getClass(), "second", (byte) 25);
        setIntField(term11629, term11629.getClass(), "nano", 201315999);
        setField(term11624, term11624.getClass(), "time", term11629);
        setField(term11617, term11617.getClass(), "createdAt", term11624);
        setIntField(term11635, term11635.getClass(), "year", 2016);
        setShortField(term11635, term11635.getClass(), "month", (short) 8);
        setShortField(term11635, term11635.getClass(), "day", (short) 24);
        setField(term11634, term11634.getClass(), "date", term11635);
        setByteField(term11639, term11639.getClass(), "hour", (byte) 22);
        setByteField(term11639, term11639.getClass(), "minute", (byte) 25);
        setByteField(term11639, term11639.getClass(), "second", (byte) 3);
        setIntField(term11639, term11639.getClass(), "nano", 185613519);
        setField(term11634, term11634.getClass(), "time", term11639);
        setField(term11617, term11617.getClass(), "updatedAt", term11634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFollowerId", argTypes, term11617, args);
    }

};


