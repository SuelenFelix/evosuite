package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostStatDTO_setUpdatedAt_46641470412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90490;
     Object term90517;

    public PostStatDTO_setUpdatedAt_46641470412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90491 = new Long(5295754745722713022L);
        Long term90493 = new Long(-3637086174445011335L);
        Long term90495 = new Long(-7862819468419399203L);
        term90490 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO"));
        Object term90497 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90498 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90502 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90507 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90508 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90512 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90490, term90490.getClass(), "id", term90491);
        setField(term90490, term90490.getClass(), "postId", term90493);
        setField(term90490, term90490.getClass(), "likeCount", term90495);
        setIntField(term90498, term90498.getClass(), "year", 2027);
        setShortField(term90498, term90498.getClass(), "month", (short) 12);
        setShortField(term90498, term90498.getClass(), "day", (short) 6);
        setField(term90497, term90497.getClass(), "date", term90498);
        setByteField(term90502, term90502.getClass(), "hour", (byte) 12);
        setByteField(term90502, term90502.getClass(), "minute", (byte) 9);
        setByteField(term90502, term90502.getClass(), "second", (byte) 47);
        setIntField(term90502, term90502.getClass(), "nano", 964897519);
        setField(term90497, term90497.getClass(), "time", term90502);
        setField(term90490, term90490.getClass(), "createdAt", term90497);
        setIntField(term90508, term90508.getClass(), "year", 2024);
        setShortField(term90508, term90508.getClass(), "month", (short) 1);
        setShortField(term90508, term90508.getClass(), "day", (short) 16);
        setField(term90507, term90507.getClass(), "date", term90508);
        setByteField(term90512, term90512.getClass(), "hour", (byte) 19);
        setByteField(term90512, term90512.getClass(), "minute", (byte) 24);
        setByteField(term90512, term90512.getClass(), "second", (byte) 37);
        setIntField(term90512, term90512.getClass(), "nano", 310724537);
        setField(term90507, term90507.getClass(), "time", term90512);
        setField(term90490, term90490.getClass(), "updatedAt", term90507);
        term90517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90522 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term90518, term90518.getClass(), "year", 2018);
        setShortField(term90518, term90518.getClass(), "month", (short) 1);
        setShortField(term90518, term90518.getClass(), "day", (short) 11);
        setField(term90517, term90517.getClass(), "date", term90518);
        setByteField(term90522, term90522.getClass(), "hour", (byte) 22);
        setByteField(term90522, term90522.getClass(), "minute", (byte) 49);
        setByteField(term90522, term90522.getClass(), "second", (byte) 21);
        setIntField(term90522, term90522.getClass(), "nano", 384803149);
        setField(term90517, term90517.getClass(), "time", term90522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term90517;
        callMethod(klass, "setUpdatedAt", argTypes, term90490, args);
    }

};


