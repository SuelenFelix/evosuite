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

public class PostStatBO_getId_5936259302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24464;

    public PostStatBO_getId_5936259302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24465 = new Long(-4191270658895729623L);
        Long term24467 = new Long(349726685019432833L);
        Long term24469 = new Long(0L);
        term24464 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term24471 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24472 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24476 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24481 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24482 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24486 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24464, term24464.getClass(), "id", term24465);
        setField(term24464, term24464.getClass(), "postId", term24467);
        setField(term24464, term24464.getClass(), "likeCount", term24469);
        setIntField(term24472, term24472.getClass(), "year", 2028);
        setShortField(term24472, term24472.getClass(), "month", (short) 12);
        setShortField(term24472, term24472.getClass(), "day", (short) 2);
        setField(term24471, term24471.getClass(), "date", term24472);
        setByteField(term24476, term24476.getClass(), "hour", (byte) 18);
        setByteField(term24476, term24476.getClass(), "minute", (byte) 6);
        setByteField(term24476, term24476.getClass(), "second", (byte) 45);
        setIntField(term24476, term24476.getClass(), "nano", 967474945);
        setField(term24471, term24471.getClass(), "time", term24476);
        setField(term24464, term24464.getClass(), "createdAt", term24471);
        setIntField(term24482, term24482.getClass(), "year", 2018);
        setShortField(term24482, term24482.getClass(), "month", (short) 11);
        setShortField(term24482, term24482.getClass(), "day", (short) 11);
        setField(term24481, term24481.getClass(), "date", term24482);
        setByteField(term24486, term24486.getClass(), "hour", (byte) 11);
        setByteField(term24486, term24486.getClass(), "minute", (byte) 30);
        setByteField(term24486, term24486.getClass(), "second", (byte) 33);
        setIntField(term24486, term24486.getClass(), "nano", 101261443);
        setField(term24481, term24481.getClass(), "time", term24486);
        setField(term24464, term24464.getClass(), "updatedAt", term24481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term24464, args);
    }

};


