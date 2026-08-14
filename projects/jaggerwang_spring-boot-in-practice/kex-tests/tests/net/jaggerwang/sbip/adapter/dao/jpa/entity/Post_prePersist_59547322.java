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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Post_prePersist_59547322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5100;

    public Post_prePersist_59547322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5101 = new Long(3427570961451840069L);
        Long term5103 = new Long(4502292577098212311L);
        Class<? extends Object> term5159 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term5158 = ((Class) term5159).getDeclaredField((String) "IMAGE");
        ((Field) term5158).setAccessible(true);
        Object enum12 = ((Field) term5158).get((Object) null);
        Long term5128 = new Long(-3730936709704460408L);
        Long term5130 = new Long(-8614778293741404325L);
        Long term5132 = new Long(-5447369594017685765L);
        ArrayList term5126 = new ArrayList();
        ((ArrayList) term5126).add(term5128);
        ((ArrayList) term5126).add(term5130);
        ((ArrayList) term5126).add(term5132);
        Long term5136 = new Long(-5724112525188606013L);
        term5100 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term5138 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5139 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5143 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5148 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5149 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5153 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5100, term5100.getClass(), "id", term5101);
        setField(term5100, term5100.getClass(), "userId", term5103);
        setField(term5100, term5100.getClass(), "type", enum12);
        setField(term5100, term5100.getClass(), "text", "tShwQLRGNe");
        setField(term5100, term5100.getClass(), "imageIds", term5126);
        setField(term5100, term5100.getClass(), "videoId", term5136);
        setIntField(term5139, term5139.getClass(), "year", 2025);
        setShortField(term5139, term5139.getClass(), "month", (short) 12);
        setShortField(term5139, term5139.getClass(), "day", (short) 16);
        setField(term5138, term5138.getClass(), "date", term5139);
        setByteField(term5143, term5143.getClass(), "hour", (byte) 7);
        setByteField(term5143, term5143.getClass(), "minute", (byte) 53);
        setByteField(term5143, term5143.getClass(), "second", (byte) 23);
        setIntField(term5143, term5143.getClass(), "nano", 532991944);
        setField(term5138, term5138.getClass(), "time", term5143);
        setField(term5100, term5100.getClass(), "createdAt", term5138);
        setIntField(term5149, term5149.getClass(), "year", 2024);
        setShortField(term5149, term5149.getClass(), "month", (short) 2);
        setShortField(term5149, term5149.getClass(), "day", (short) 5);
        setField(term5148, term5148.getClass(), "date", term5149);
        setByteField(term5153, term5153.getClass(), "hour", (byte) 12);
        setByteField(term5153, term5153.getClass(), "minute", (byte) 28);
        setByteField(term5153, term5153.getClass(), "second", (byte) 37);
        setIntField(term5153, term5153.getClass(), "nano", 689695229);
        setField(term5148, term5148.getClass(), "time", term5153);
        setField(term5100, term5100.getClass(), "updatedAt", term5148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prePersist", argTypes, term5100, args);
    }

};


