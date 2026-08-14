package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PostBO_PostBOBuilder_toString_97843611210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24170;

    public PostBO_PostBOBuilder_toString_97843611210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24171 = new Long(6323132402520425961L);
        Long term24173 = new Long(-354905832180781372L);
        Class<? extends Object> term24236 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term24235 = ((Class) term24236).getDeclaredField((String) "TEXT");
        ((Field) term24235).setAccessible(true);
        Object enum69 = ((Field) term24235).get((Object) null);
        Long term24197 = new Long(-5967061076297699457L);
        Long term24199 = new Long(1550364590565203407L);
        Long term24201 = new Long(4530705892517898929L);
        Long term24203 = new Long(7450734758126089960L);
        Long term24205 = new Long(1377567570761089535L);
        Long term24207 = new Long(-8531377551015443915L);
        Long term24209 = new Long(-3048863932438585863L);
        ArrayList term24195 = new ArrayList();
        ((ArrayList) term24195).add(term24197);
        ((ArrayList) term24195).add(term24199);
        ((ArrayList) term24195).add(term24201);
        ((ArrayList) term24195).add(term24203);
        ((ArrayList) term24195).add(term24205);
        ((ArrayList) term24195).add(term24207);
        ((ArrayList) term24195).add(term24209);
        Long term24213 = new Long(-7155106718297861156L);
        term24170 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder"));
        Object term24215 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24216 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24220 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24225 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24226 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24230 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24170, term24170.getClass(), "id", term24171);
        setField(term24170, term24170.getClass(), "userId", term24173);
        setField(term24170, term24170.getClass(), "type", enum69);
        setField(term24170, term24170.getClass(), "text", "hOncybyCAH");
        setField(term24170, term24170.getClass(), "imageIds", term24195);
        setField(term24170, term24170.getClass(), "videoId", term24213);
        setIntField(term24216, term24216.getClass(), "year", 2027);
        setShortField(term24216, term24216.getClass(), "month", (short) 8);
        setShortField(term24216, term24216.getClass(), "day", (short) 16);
        setField(term24215, term24215.getClass(), "date", term24216);
        setByteField(term24220, term24220.getClass(), "hour", (byte) 8);
        setByteField(term24220, term24220.getClass(), "minute", (byte) 3);
        setByteField(term24220, term24220.getClass(), "second", (byte) 15);
        setIntField(term24220, term24220.getClass(), "nano", 332963320);
        setField(term24215, term24215.getClass(), "time", term24220);
        setField(term24170, term24170.getClass(), "createdAt", term24215);
        setIntField(term24226, term24226.getClass(), "year", 2021);
        setShortField(term24226, term24226.getClass(), "month", (short) 11);
        setShortField(term24226, term24226.getClass(), "day", (short) 12);
        setField(term24225, term24225.getClass(), "date", term24226);
        setByteField(term24230, term24230.getClass(), "hour", (byte) 0);
        setByteField(term24230, term24230.getClass(), "minute", (byte) 51);
        setByteField(term24230, term24230.getClass(), "second", (byte) 55);
        setIntField(term24230, term24230.getClass(), "nano", 745543124);
        setField(term24225, term24225.getClass(), "time", term24230);
        setField(term24170, term24170.getClass(), "updatedAt", term24225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term24170, args);
    }

};


