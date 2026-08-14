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

public class PostStatDTO_PostStatDTOBuilder_build_2057939456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58455;

    public PostStatDTO_PostStatDTOBuilder_build_2057939456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58456 = new Long(-3926033211239834024L);
        Long term58458 = new Long(7585284844822710343L);
        Long term58460 = new Long(6803750423071360242L);
        term58455 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO$PostStatDTOBuilder"));
        Object term58462 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58463 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58467 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58472 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58473 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58477 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58455, term58455.getClass(), "id", term58456);
        setField(term58455, term58455.getClass(), "postId", term58458);
        setField(term58455, term58455.getClass(), "likeCount", term58460);
        setIntField(term58463, term58463.getClass(), "year", 2027);
        setShortField(term58463, term58463.getClass(), "month", (short) 2);
        setShortField(term58463, term58463.getClass(), "day", (short) 28);
        setField(term58462, term58462.getClass(), "date", term58463);
        setByteField(term58467, term58467.getClass(), "hour", (byte) 10);
        setByteField(term58467, term58467.getClass(), "minute", (byte) 42);
        setByteField(term58467, term58467.getClass(), "second", (byte) 49);
        setIntField(term58467, term58467.getClass(), "nano", 494945461);
        setField(term58462, term58462.getClass(), "time", term58467);
        setField(term58455, term58455.getClass(), "createdAt", term58462);
        setIntField(term58473, term58473.getClass(), "year", 2018);
        setShortField(term58473, term58473.getClass(), "month", (short) 3);
        setShortField(term58473, term58473.getClass(), "day", (short) 28);
        setField(term58472, term58472.getClass(), "date", term58473);
        setByteField(term58477, term58477.getClass(), "hour", (byte) 21);
        setByteField(term58477, term58477.getClass(), "minute", (byte) 12);
        setByteField(term58477, term58477.getClass(), "second", (byte) 31);
        setIntField(term58477, term58477.getClass(), "nano", 841920486);
        setField(term58472, term58472.getClass(), "time", term58477);
        setField(term58455, term58455.getClass(), "updatedAt", term58472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO$PostStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term58455, args);
    }

};


