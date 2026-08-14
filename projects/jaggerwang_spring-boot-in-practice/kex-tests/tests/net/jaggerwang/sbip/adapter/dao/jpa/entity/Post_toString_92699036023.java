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

public class Post_toString_92699036023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10954;

    public Post_toString_92699036023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10955 = new Long(6315101499811179240L);
        Long term10957 = new Long(-3033337370154155851L);
        Class<? extends Object> term11019 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term11018 = ((Class) term11019).getDeclaredField((String) "IMAGE");
        ((Field) term11018).setAccessible(true);
        Object enum33 = ((Field) term11018).get((Object) null);
        Long term10982 = new Long(-3130003589475815807L);
        Long term10984 = new Long(-5344598381371854750L);
        Long term10986 = new Long(-3718250311794019732L);
        Long term10988 = new Long(-5935517391653614345L);
        Long term10990 = new Long(-6521561238735301071L);
        Long term10992 = new Long(-6609679920238945303L);
        ArrayList term10980 = new ArrayList();
        ((ArrayList) term10980).add(term10982);
        ((ArrayList) term10980).add(term10984);
        ((ArrayList) term10980).add(term10986);
        ((ArrayList) term10980).add(term10988);
        ((ArrayList) term10980).add(term10990);
        ((ArrayList) term10980).add(term10992);
        Long term10996 = new Long(-7296330380944173376L);
        term10954 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term10998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11003 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11008 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11013 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10954, term10954.getClass(), "id", term10955);
        setField(term10954, term10954.getClass(), "userId", term10957);
        setField(term10954, term10954.getClass(), "type", enum33);
        setField(term10954, term10954.getClass(), "text", "TJmVBGfTML");
        setField(term10954, term10954.getClass(), "imageIds", term10980);
        setField(term10954, term10954.getClass(), "videoId", term10996);
        setIntField(term10999, term10999.getClass(), "year", 2014);
        setShortField(term10999, term10999.getClass(), "month", (short) 5);
        setShortField(term10999, term10999.getClass(), "day", (short) 31);
        setField(term10998, term10998.getClass(), "date", term10999);
        setByteField(term11003, term11003.getClass(), "hour", (byte) 16);
        setByteField(term11003, term11003.getClass(), "minute", (byte) 3);
        setByteField(term11003, term11003.getClass(), "second", (byte) 14);
        setIntField(term11003, term11003.getClass(), "nano", 281059649);
        setField(term10998, term10998.getClass(), "time", term11003);
        setField(term10954, term10954.getClass(), "createdAt", term10998);
        setIntField(term11009, term11009.getClass(), "year", 2010);
        setShortField(term11009, term11009.getClass(), "month", (short) 12);
        setShortField(term11009, term11009.getClass(), "day", (short) 30);
        setField(term11008, term11008.getClass(), "date", term11009);
        setByteField(term11013, term11013.getClass(), "hour", (byte) 17);
        setByteField(term11013, term11013.getClass(), "minute", (byte) 44);
        setByteField(term11013, term11013.getClass(), "second", (byte) 59);
        setIntField(term11013, term11013.getClass(), "nano", 881407895);
        setField(term11008, term11008.getClass(), "time", term11013);
        setField(term10954, term10954.getClass(), "updatedAt", term11008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10954, args);
    }

};


