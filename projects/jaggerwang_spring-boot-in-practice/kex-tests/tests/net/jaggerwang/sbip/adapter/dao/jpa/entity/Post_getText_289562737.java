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

public class Post_getText_289562737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6220;

    public Post_getText_289562737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6221 = new Long(8863790908271299748L);
        Long term6223 = new Long(9205327385733285058L);
        Class<? extends Object> term6277 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term6276 = ((Class) term6277).getDeclaredField((String) "VIDEO");
        ((Field) term6276).setAccessible(true);
        Object enum16 = ((Field) term6276).get((Object) null);
        Long term6248 = new Long(4199886998224701110L);
        Long term6250 = new Long(8540994973773607992L);
        ArrayList term6246 = new ArrayList();
        ((ArrayList) term6246).add(term6248);
        ((ArrayList) term6246).add(term6250);
        Long term6254 = new Long(-2338103433822116635L);
        term6220 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term6256 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6257 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6261 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6266 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6267 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6271 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6220, term6220.getClass(), "id", term6221);
        setField(term6220, term6220.getClass(), "userId", term6223);
        setField(term6220, term6220.getClass(), "type", enum16);
        setField(term6220, term6220.getClass(), "text", "nGKItKLYNC");
        setField(term6220, term6220.getClass(), "imageIds", term6246);
        setField(term6220, term6220.getClass(), "videoId", term6254);
        setIntField(term6257, term6257.getClass(), "year", 2020);
        setShortField(term6257, term6257.getClass(), "month", (short) 12);
        setShortField(term6257, term6257.getClass(), "day", (short) 21);
        setField(term6256, term6256.getClass(), "date", term6257);
        setByteField(term6261, term6261.getClass(), "hour", (byte) 20);
        setByteField(term6261, term6261.getClass(), "minute", (byte) 16);
        setByteField(term6261, term6261.getClass(), "second", (byte) 59);
        setIntField(term6261, term6261.getClass(), "nano", 976524801);
        setField(term6256, term6256.getClass(), "time", term6261);
        setField(term6220, term6220.getClass(), "createdAt", term6256);
        setIntField(term6267, term6267.getClass(), "year", 2028);
        setShortField(term6267, term6267.getClass(), "month", (short) 5);
        setShortField(term6267, term6267.getClass(), "day", (short) 15);
        setField(term6266, term6266.getClass(), "date", term6267);
        setByteField(term6271, term6271.getClass(), "hour", (byte) 20);
        setByteField(term6271, term6271.getClass(), "minute", (byte) 31);
        setByteField(term6271, term6271.getClass(), "second", (byte) 49);
        setIntField(term6271, term6271.getClass(), "nano", 945744862);
        setField(term6266, term6266.getClass(), "time", term6271);
        setField(term6220, term6220.getClass(), "updatedAt", term6266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term6220, args);
    }

};


