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
import java.util.LinkedList;

public class Post_setImageIds_52375801416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8987;
     Object term9041;

    public Post_setImageIds_52375801416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8988 = new Long(4255811647459029682L);
        Long term8990 = new Long(8000844860910174690L);
        Class<? extends Object> term9045 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term9044 = ((Class) term9045).getDeclaredField((String) "IMAGE");
        ((Field) term9044).setAccessible(true);
        Object enum26 = ((Field) term9044).get((Object) null);
        Long term9015 = new Long(2209808079059619773L);
        ArrayList term9013 = new ArrayList();
        ((ArrayList) term9013).add(term9015);
        Long term9019 = new Long(8403492202041709902L);
        term8987 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term9021 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9026 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9031 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9032 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9036 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8987, term8987.getClass(), "id", term8988);
        setField(term8987, term8987.getClass(), "userId", term8990);
        setField(term8987, term8987.getClass(), "type", enum26);
        setField(term8987, term8987.getClass(), "text", "ieCtQFdkii");
        setField(term8987, term8987.getClass(), "imageIds", term9013);
        setField(term8987, term8987.getClass(), "videoId", term9019);
        setIntField(term9022, term9022.getClass(), "year", 2028);
        setShortField(term9022, term9022.getClass(), "month", (short) 4);
        setShortField(term9022, term9022.getClass(), "day", (short) 11);
        setField(term9021, term9021.getClass(), "date", term9022);
        setByteField(term9026, term9026.getClass(), "hour", (byte) 4);
        setByteField(term9026, term9026.getClass(), "minute", (byte) 45);
        setByteField(term9026, term9026.getClass(), "second", (byte) 2);
        setIntField(term9026, term9026.getClass(), "nano", 374177968);
        setField(term9021, term9021.getClass(), "time", term9026);
        setField(term8987, term8987.getClass(), "createdAt", term9021);
        setIntField(term9032, term9032.getClass(), "year", 2021);
        setShortField(term9032, term9032.getClass(), "month", (short) 4);
        setShortField(term9032, term9032.getClass(), "day", (short) 22);
        setField(term9031, term9031.getClass(), "date", term9032);
        setByteField(term9036, term9036.getClass(), "hour", (byte) 17);
        setByteField(term9036, term9036.getClass(), "minute", (byte) 6);
        setByteField(term9036, term9036.getClass(), "second", (byte) 33);
        setIntField(term9036, term9036.getClass(), "nano", 21410850);
        setField(term9031, term9031.getClass(), "time", term9036);
        setField(term8987, term8987.getClass(), "updatedAt", term9031);
        term9041 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term9041;
        callMethod(klass, "setImageIds", argTypes, term8987, args);
    }

};


