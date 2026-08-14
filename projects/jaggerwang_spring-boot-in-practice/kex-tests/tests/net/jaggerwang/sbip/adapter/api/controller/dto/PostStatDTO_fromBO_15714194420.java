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

public class PostStatDTO_fromBO_15714194420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90177;

    public PostStatDTO_fromBO_15714194420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90178 = new Long(2739506880892071716L);
        Long term90180 = new Long(6348449517519237060L);
        Long term90182 = new Long(0L);
        term90177 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term90184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90189 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90199 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90177, term90177.getClass(), "id", term90178);
        setField(term90177, term90177.getClass(), "postId", term90180);
        setField(term90177, term90177.getClass(), "likeCount", term90182);
        setIntField(term90185, term90185.getClass(), "year", 2021);
        setShortField(term90185, term90185.getClass(), "month", (short) 8);
        setShortField(term90185, term90185.getClass(), "day", (short) 18);
        setField(term90184, term90184.getClass(), "date", term90185);
        setByteField(term90189, term90189.getClass(), "hour", (byte) 23);
        setByteField(term90189, term90189.getClass(), "minute", (byte) 11);
        setByteField(term90189, term90189.getClass(), "second", (byte) 44);
        setIntField(term90189, term90189.getClass(), "nano", 804306638);
        setField(term90184, term90184.getClass(), "time", term90189);
        setField(term90177, term90177.getClass(), "createdAt", term90184);
        setIntField(term90195, term90195.getClass(), "year", 2027);
        setShortField(term90195, term90195.getClass(), "month", (short) 11);
        setShortField(term90195, term90195.getClass(), "day", (short) 1);
        setField(term90194, term90194.getClass(), "date", term90195);
        setByteField(term90199, term90199.getClass(), "hour", (byte) 16);
        setByteField(term90199, term90199.getClass(), "minute", (byte) 52);
        setByteField(term90199, term90199.getClass(), "second", (byte) 36);
        setIntField(term90199, term90199.getClass(), "nano", 59738907);
        setField(term90194, term90194.getClass(), "time", term90199);
        setField(term90177, term90177.getClass(), "updatedAt", term90194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Object[] args = new Object[1];
        args[0] = term90177;
        callMethod(klass, "fromBO", argTypes, null, args);
    }

};


