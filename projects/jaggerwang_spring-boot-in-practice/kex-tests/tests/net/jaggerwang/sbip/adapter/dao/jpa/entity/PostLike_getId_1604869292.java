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

public class PostLike_getId_1604869292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31169;

    public PostLike_getId_1604869292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31170 = new Long(-4868523627266698649L);
        Long term31172 = new Long(3228082303360203224L);
        Long term31174 = new Long(8845929725457841487L);
        term31169 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike"));
        Object term31176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31181 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31191 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31169, term31169.getClass(), "id", term31170);
        setField(term31169, term31169.getClass(), "userId", term31172);
        setField(term31169, term31169.getClass(), "postId", term31174);
        setIntField(term31177, term31177.getClass(), "year", 2015);
        setShortField(term31177, term31177.getClass(), "month", (short) 7);
        setShortField(term31177, term31177.getClass(), "day", (short) 16);
        setField(term31176, term31176.getClass(), "date", term31177);
        setByteField(term31181, term31181.getClass(), "hour", (byte) 15);
        setByteField(term31181, term31181.getClass(), "minute", (byte) 28);
        setByteField(term31181, term31181.getClass(), "second", (byte) 35);
        setIntField(term31181, term31181.getClass(), "nano", 374805749);
        setField(term31176, term31176.getClass(), "time", term31181);
        setField(term31169, term31169.getClass(), "createdAt", term31176);
        setIntField(term31187, term31187.getClass(), "year", 2021);
        setShortField(term31187, term31187.getClass(), "month", (short) 6);
        setShortField(term31187, term31187.getClass(), "day", (short) 19);
        setField(term31186, term31186.getClass(), "date", term31187);
        setByteField(term31191, term31191.getClass(), "hour", (byte) 17);
        setByteField(term31191, term31191.getClass(), "minute", (byte) 58);
        setByteField(term31191, term31191.getClass(), "second", (byte) 4);
        setIntField(term31191, term31191.getClass(), "nano", 753905173);
        setField(term31186, term31186.getClass(), "time", term31191);
        setField(term31169, term31169.getClass(), "updatedAt", term31186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term31169, args);
    }

};


