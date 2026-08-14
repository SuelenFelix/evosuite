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

public class PostLike_prePersist_11964795310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31142;

    public PostLike_prePersist_11964795310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31143 = new Long(-8510452367371037137L);
        Long term31145 = new Long(2123432481270520381L);
        Long term31147 = new Long(7205698466499430091L);
        term31142 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike"));
        Object term31149 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31150 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31154 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31164 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31142, term31142.getClass(), "id", term31143);
        setField(term31142, term31142.getClass(), "userId", term31145);
        setField(term31142, term31142.getClass(), "postId", term31147);
        setIntField(term31150, term31150.getClass(), "year", 2014);
        setShortField(term31150, term31150.getClass(), "month", (short) 5);
        setShortField(term31150, term31150.getClass(), "day", (short) 5);
        setField(term31149, term31149.getClass(), "date", term31150);
        setByteField(term31154, term31154.getClass(), "hour", (byte) 17);
        setByteField(term31154, term31154.getClass(), "minute", (byte) 28);
        setByteField(term31154, term31154.getClass(), "second", (byte) 52);
        setIntField(term31154, term31154.getClass(), "nano", 741253436);
        setField(term31149, term31149.getClass(), "time", term31154);
        setField(term31142, term31142.getClass(), "createdAt", term31149);
        setIntField(term31160, term31160.getClass(), "year", 2015);
        setShortField(term31160, term31160.getClass(), "month", (short) 3);
        setShortField(term31160, term31160.getClass(), "day", (short) 23);
        setField(term31159, term31159.getClass(), "date", term31160);
        setByteField(term31164, term31164.getClass(), "hour", (byte) 7);
        setByteField(term31164, term31164.getClass(), "minute", (byte) 27);
        setByteField(term31164, term31164.getClass(), "second", (byte) 38);
        setIntField(term31164, term31164.getClass(), "nano", 467385263);
        setField(term31159, term31159.getClass(), "time", term31164);
        setField(term31142, term31142.getClass(), "updatedAt", term31159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prePersist", argTypes, term31142, args);
    }

};


