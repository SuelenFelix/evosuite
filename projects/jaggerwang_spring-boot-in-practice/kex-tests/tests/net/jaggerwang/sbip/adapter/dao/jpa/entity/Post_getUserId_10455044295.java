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

public class Post_getUserId_10455044295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5662;

    public Post_getUserId_10455044295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5663 = new Long(-4030863184426321096L);
        Long term5665 = new Long(-8010214112439224349L);
        Class<? extends Object> term5716 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term5715 = ((Class) term5716).getDeclaredField((String) "TEXT");
        ((Field) term5715).setAccessible(true);
        Object enum14 = ((Field) term5715).get((Object) null);
        Long term5689 = new Long(-6673920710396545553L);
        ArrayList term5687 = new ArrayList();
        ((ArrayList) term5687).add(term5689);
        Long term5693 = new Long(3412644969878030772L);
        term5662 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term5695 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5696 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5700 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5710 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5662, term5662.getClass(), "id", term5663);
        setField(term5662, term5662.getClass(), "userId", term5665);
        setField(term5662, term5662.getClass(), "type", enum14);
        setField(term5662, term5662.getClass(), "text", "xLbjWUgOIL");
        setField(term5662, term5662.getClass(), "imageIds", term5687);
        setField(term5662, term5662.getClass(), "videoId", term5693);
        setIntField(term5696, term5696.getClass(), "year", 2013);
        setShortField(term5696, term5696.getClass(), "month", (short) 5);
        setShortField(term5696, term5696.getClass(), "day", (short) 9);
        setField(term5695, term5695.getClass(), "date", term5696);
        setByteField(term5700, term5700.getClass(), "hour", (byte) 4);
        setByteField(term5700, term5700.getClass(), "minute", (byte) 18);
        setByteField(term5700, term5700.getClass(), "second", (byte) 35);
        setIntField(term5700, term5700.getClass(), "nano", 909079395);
        setField(term5695, term5695.getClass(), "time", term5700);
        setField(term5662, term5662.getClass(), "createdAt", term5695);
        setIntField(term5706, term5706.getClass(), "year", 2015);
        setShortField(term5706, term5706.getClass(), "month", (short) 3);
        setShortField(term5706, term5706.getClass(), "day", (short) 15);
        setField(term5705, term5705.getClass(), "date", term5706);
        setByteField(term5710, term5710.getClass(), "hour", (byte) 8);
        setByteField(term5710, term5710.getClass(), "minute", (byte) 45);
        setByteField(term5710, term5710.getClass(), "second", (byte) 29);
        setIntField(term5710, term5710.getClass(), "nano", 781486470);
        setField(term5705, term5705.getClass(), "time", term5710);
        setField(term5662, term5662.getClass(), "updatedAt", term5705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term5662, args);
    }

};


