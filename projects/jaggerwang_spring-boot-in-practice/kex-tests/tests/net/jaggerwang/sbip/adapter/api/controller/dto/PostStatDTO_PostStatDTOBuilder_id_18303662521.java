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

public class PostStatDTO_PostStatDTOBuilder_id_18303662521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58294;
     Object term58321;

    public PostStatDTO_PostStatDTOBuilder_id_18303662521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58295 = new Long(-5523700551819095387L);
        Long term58297 = new Long(-8614603287624597112L);
        Long term58299 = new Long(-334717540353714793L);
        term58294 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO$PostStatDTOBuilder"));
        Object term58301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58306 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58316 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58294, term58294.getClass(), "id", term58295);
        setField(term58294, term58294.getClass(), "postId", term58297);
        setField(term58294, term58294.getClass(), "likeCount", term58299);
        setIntField(term58302, term58302.getClass(), "year", 2010);
        setShortField(term58302, term58302.getClass(), "month", (short) 7);
        setShortField(term58302, term58302.getClass(), "day", (short) 21);
        setField(term58301, term58301.getClass(), "date", term58302);
        setByteField(term58306, term58306.getClass(), "hour", (byte) 12);
        setByteField(term58306, term58306.getClass(), "minute", (byte) 18);
        setByteField(term58306, term58306.getClass(), "second", (byte) 51);
        setIntField(term58306, term58306.getClass(), "nano", 209901550);
        setField(term58301, term58301.getClass(), "time", term58306);
        setField(term58294, term58294.getClass(), "createdAt", term58301);
        setIntField(term58312, term58312.getClass(), "year", 2028);
        setShortField(term58312, term58312.getClass(), "month", (short) 7);
        setShortField(term58312, term58312.getClass(), "day", (short) 2);
        setField(term58311, term58311.getClass(), "date", term58312);
        setByteField(term58316, term58316.getClass(), "hour", (byte) 23);
        setByteField(term58316, term58316.getClass(), "minute", (byte) 41);
        setByteField(term58316, term58316.getClass(), "second", (byte) 2);
        setIntField(term58316, term58316.getClass(), "nano", 187705257);
        setField(term58311, term58311.getClass(), "time", term58316);
        setField(term58294, term58294.getClass(), "updatedAt", term58311);
        term58321 = new Long(-57359230242997736L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO$PostStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term58321;
        callMethod(klass, "id", argTypes, term58294, args);
    }

};


