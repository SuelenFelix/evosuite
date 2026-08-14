package net.jaggerwang.sbip.usecase;

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
import static net.jaggerwang.sbip.usecase.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PostUsecase_publish_14066602681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715;
     Object term716;

    public PostUsecase_publish_14066602681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term715 = newInstance(Class.forName("net.jaggerwang.sbip.usecase.PostUsecase"));
        setField(term715, term715.getClass(), "postDAO", null);
        Long term717 = new Long(8428634514691209827L);
        Long term719 = new Long(-2585684163342970173L);
        Class<? extends Object> term805 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term804 = ((Class) term805).getDeclaredField((String) "IMAGE");
        ((Field) term804).setAccessible(true);
        Object enum0 = ((Field) term804).get((Object) null);
        Long term744 = new Long(8059786003080744426L);
        Long term746 = new Long(-4365849114644724155L);
        Long term748 = new Long(2486810210675247493L);
        Long term750 = new Long(7009926388951271268L);
        Long term752 = new Long(-7672528020740371001L);
        ArrayList term742 = new ArrayList();
        ((ArrayList) term742).add(term744);
        ((ArrayList) term742).add(term746);
        ((ArrayList) term742).add(term748);
        ((ArrayList) term742).add(term750);
        ((ArrayList) term742).add(term752);
        Long term756 = new Long(-4502405999831680926L);
        term716 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term758 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term759 = newInstance(Class.forName("java.time.LocalDate"));
        Object term763 = newInstance(Class.forName("java.time.LocalTime"));
        Object term768 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term769 = newInstance(Class.forName("java.time.LocalDate"));
        Object term773 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term716, term716.getClass(), "id", term717);
        setField(term716, term716.getClass(), "userId", term719);
        setField(term716, term716.getClass(), "type", enum0);
        setField(term716, term716.getClass(), "text", "OclPbYPkcH");
        setField(term716, term716.getClass(), "imageIds", term742);
        setField(term716, term716.getClass(), "videoId", term756);
        setIntField(term759, term759.getClass(), "year", 2022);
        setShortField(term759, term759.getClass(), "month", (short) 2);
        setShortField(term759, term759.getClass(), "day", (short) 26);
        setField(term758, term758.getClass(), "date", term759);
        setByteField(term763, term763.getClass(), "hour", (byte) 11);
        setByteField(term763, term763.getClass(), "minute", (byte) 42);
        setByteField(term763, term763.getClass(), "second", (byte) 15);
        setIntField(term763, term763.getClass(), "nano", 377731937);
        setField(term758, term758.getClass(), "time", term763);
        setField(term716, term716.getClass(), "createdAt", term758);
        setIntField(term769, term769.getClass(), "year", 2026);
        setShortField(term769, term769.getClass(), "month", (short) 12);
        setShortField(term769, term769.getClass(), "day", (short) 14);
        setField(term768, term768.getClass(), "date", term769);
        setByteField(term773, term773.getClass(), "hour", (byte) 16);
        setByteField(term773, term773.getClass(), "minute", (byte) 34);
        setByteField(term773, term773.getClass(), "second", (byte) 9);
        setIntField(term773, term773.getClass(), "nano", 518326996);
        setField(term768, term768.getClass(), "time", term773);
        setField(term716, term716.getClass(), "updatedAt", term768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.usecase.PostUsecase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Object[] args = new Object[1];
        args[0] = term716;
        callMethod(klass, "publish", argTypes, term715, args);
    }

};


