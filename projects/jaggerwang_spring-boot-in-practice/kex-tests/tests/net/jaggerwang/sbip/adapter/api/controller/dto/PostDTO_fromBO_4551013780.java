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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PostDTO_fromBO_4551013780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58875;

    public PostDTO_fromBO_4551013780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58876 = new Long(-2342559604213128910L);
        Long term58878 = new Long(7857334824369215506L);
        Class<? extends Object> term58928 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term58927 = ((Class) term58928).getDeclaredField((String) "IMAGE");
        ((Field) term58927).setAccessible(true);
        Object enum114 = ((Field) term58927).get((Object) null);
        ArrayList term58901 = new ArrayList();
        Long term58905 = new Long(-4871569513248515478L);
        term58875 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term58907 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58908 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58912 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58917 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58918 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58922 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58875, term58875.getClass(), "id", term58876);
        setField(term58875, term58875.getClass(), "userId", term58878);
        setField(term58875, term58875.getClass(), "type", enum114);
        setField(term58875, term58875.getClass(), "text", "VoKhXiLAaW");
        setField(term58875, term58875.getClass(), "imageIds", term58901);
        setField(term58875, term58875.getClass(), "videoId", term58905);
        setIntField(term58908, term58908.getClass(), "year", 2025);
        setShortField(term58908, term58908.getClass(), "month", (short) 8);
        setShortField(term58908, term58908.getClass(), "day", (short) 27);
        setField(term58907, term58907.getClass(), "date", term58908);
        setByteField(term58912, term58912.getClass(), "hour", (byte) 17);
        setByteField(term58912, term58912.getClass(), "minute", (byte) 10);
        setByteField(term58912, term58912.getClass(), "second", (byte) 17);
        setIntField(term58912, term58912.getClass(), "nano", 43520203);
        setField(term58907, term58907.getClass(), "time", term58912);
        setField(term58875, term58875.getClass(), "createdAt", term58907);
        setIntField(term58918, term58918.getClass(), "year", 2029);
        setShortField(term58918, term58918.getClass(), "month", (short) 4);
        setShortField(term58918, term58918.getClass(), "day", (short) 4);
        setField(term58917, term58917.getClass(), "date", term58918);
        setByteField(term58922, term58922.getClass(), "hour", (byte) 21);
        setByteField(term58922, term58922.getClass(), "minute", (byte) 28);
        setByteField(term58922, term58922.getClass(), "second", (byte) 58);
        setIntField(term58922, term58922.getClass(), "nano", 639031577);
        setField(term58917, term58917.getClass(), "time", term58922);
        setField(term58875, term58875.getClass(), "updatedAt", term58917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Object[] args = new Object[1];
        args[0] = term58875;
        callMethod(klass, "fromBO", argTypes, null, args);
    }

};


