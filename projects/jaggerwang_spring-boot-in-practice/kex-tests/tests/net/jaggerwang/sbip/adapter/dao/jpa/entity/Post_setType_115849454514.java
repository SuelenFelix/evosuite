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

public class Post_setType_115849454514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8190;
     Object enum24;

    public Post_setType_115849454514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8191 = new Long(-4714000263923324167L);
        Long term8193 = new Long(6906379511067694917L);
        Class<? extends Object> term8255 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term8254 = ((Class) term8255).getDeclaredField((String) "TEXT");
        ((Field) term8254).setAccessible(true);
        Object enum23 = ((Field) term8254).get((Object) null);
        Long term8217 = new Long(-9204303423581447271L);
        Long term8219 = new Long(6248239231585852341L);
        ArrayList term8215 = new ArrayList();
        ((ArrayList) term8215).add(term8217);
        ((ArrayList) term8215).add(term8219);
        Long term8223 = new Long(-88538481937688851L);
        term8190 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term8225 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8226 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8230 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8235 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8236 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8240 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8190, term8190.getClass(), "id", term8191);
        setField(term8190, term8190.getClass(), "userId", term8193);
        setField(term8190, term8190.getClass(), "type", enum23);
        setField(term8190, term8190.getClass(), "text", "MLqYREekMl");
        setField(term8190, term8190.getClass(), "imageIds", term8215);
        setField(term8190, term8190.getClass(), "videoId", term8223);
        setIntField(term8226, term8226.getClass(), "year", 2013);
        setShortField(term8226, term8226.getClass(), "month", (short) 7);
        setShortField(term8226, term8226.getClass(), "day", (short) 3);
        setField(term8225, term8225.getClass(), "date", term8226);
        setByteField(term8230, term8230.getClass(), "hour", (byte) 10);
        setByteField(term8230, term8230.getClass(), "minute", (byte) 59);
        setByteField(term8230, term8230.getClass(), "second", (byte) 22);
        setIntField(term8230, term8230.getClass(), "nano", 937921480);
        setField(term8225, term8225.getClass(), "time", term8230);
        setField(term8190, term8190.getClass(), "createdAt", term8225);
        setIntField(term8236, term8236.getClass(), "year", 2012);
        setShortField(term8236, term8236.getClass(), "month", (short) 2);
        setShortField(term8236, term8236.getClass(), "day", (short) 29);
        setField(term8235, term8235.getClass(), "date", term8236);
        setByteField(term8240, term8240.getClass(), "hour", (byte) 14);
        setByteField(term8240, term8240.getClass(), "minute", (byte) 26);
        setByteField(term8240, term8240.getClass(), "second", (byte) 20);
        setIntField(term8240, term8240.getClass(), "nano", 780823452);
        setField(term8235, term8235.getClass(), "time", term8240);
        setField(term8190, term8190.getClass(), "updatedAt", term8235);
        Class<? extends Object> term8474 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term8473 = ((Class) term8474).getDeclaredField((String) "VIDEO");
        ((Field) term8473).setAccessible(true);
        enum24 = ((Field) term8473).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.PostBO$Type");
        Object[] args = new Object[1];
        args[0] = enum24;
        callMethod(klass, "setType", argTypes, term8190, args);
    }

};


