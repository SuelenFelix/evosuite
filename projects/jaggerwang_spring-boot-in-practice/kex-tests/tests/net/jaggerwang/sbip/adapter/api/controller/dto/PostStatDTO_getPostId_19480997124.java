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

public class PostStatDTO_getPostId_19480997124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90258;

    public PostStatDTO_getPostId_19480997124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90259 = new Long(-2412920067936514032L);
        Long term90261 = new Long(-1760891577100845054L);
        Long term90263 = new Long(2614185242023314675L);
        term90258 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO"));
        Object term90265 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90266 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90270 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90275 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90276 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90280 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90258, term90258.getClass(), "id", term90259);
        setField(term90258, term90258.getClass(), "postId", term90261);
        setField(term90258, term90258.getClass(), "likeCount", term90263);
        setIntField(term90266, term90266.getClass(), "year", 2014);
        setShortField(term90266, term90266.getClass(), "month", (short) 9);
        setShortField(term90266, term90266.getClass(), "day", (short) 20);
        setField(term90265, term90265.getClass(), "date", term90266);
        setByteField(term90270, term90270.getClass(), "hour", (byte) 4);
        setByteField(term90270, term90270.getClass(), "minute", (byte) 20);
        setByteField(term90270, term90270.getClass(), "second", (byte) 43);
        setIntField(term90270, term90270.getClass(), "nano", 424375033);
        setField(term90265, term90265.getClass(), "time", term90270);
        setField(term90258, term90258.getClass(), "createdAt", term90265);
        setIntField(term90276, term90276.getClass(), "year", 2016);
        setShortField(term90276, term90276.getClass(), "month", (short) 4);
        setShortField(term90276, term90276.getClass(), "day", (short) 19);
        setField(term90275, term90275.getClass(), "date", term90276);
        setByteField(term90280, term90280.getClass(), "hour", (byte) 0);
        setByteField(term90280, term90280.getClass(), "minute", (byte) 54);
        setByteField(term90280, term90280.getClass(), "second", (byte) 30);
        setIntField(term90280, term90280.getClass(), "nano", 632691153);
        setField(term90275, term90275.getClass(), "time", term90280);
        setField(term90258, term90258.getClass(), "updatedAt", term90275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPostId", argTypes, term90258, args);
    }

};


