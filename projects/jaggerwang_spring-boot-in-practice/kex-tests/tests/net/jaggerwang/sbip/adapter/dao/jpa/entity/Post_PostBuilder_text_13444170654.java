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

public class Post_PostBuilder_text_13444170654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25196;

    public Post_PostBuilder_text_13444170654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25197 = new Long(-5850316381591949820L);
        Long term25199 = new Long(5857854340777182167L);
        Class<? extends Object> term25267 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term25266 = ((Class) term25267).getDeclaredField((String) "VIDEO");
        ((Field) term25266).setAccessible(true);
        Object enum63 = ((Field) term25266).get((Object) null);
        Long term25224 = new Long(3660520943100987842L);
        Long term25226 = new Long(-8211240904293846981L);
        Long term25228 = new Long(3535528164828723056L);
        ArrayList term25222 = new ArrayList();
        ((ArrayList) term25222).add(term25224);
        ((ArrayList) term25222).add(term25226);
        ((ArrayList) term25222).add(term25228);
        Long term25232 = new Long(4036794646678680547L);
        term25196 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder"));
        Object term25234 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25235 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25239 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25244 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25245 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25249 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25196, term25196.getClass(), "id", term25197);
        setField(term25196, term25196.getClass(), "userId", term25199);
        setField(term25196, term25196.getClass(), "type", enum63);
        setField(term25196, term25196.getClass(), "text", "lCyLIcSuom");
        setField(term25196, term25196.getClass(), "imageIds", term25222);
        setField(term25196, term25196.getClass(), "videoId", term25232);
        setIntField(term25235, term25235.getClass(), "year", 2029);
        setShortField(term25235, term25235.getClass(), "month", (short) 1);
        setShortField(term25235, term25235.getClass(), "day", (short) 15);
        setField(term25234, term25234.getClass(), "date", term25235);
        setByteField(term25239, term25239.getClass(), "hour", (byte) 1);
        setByteField(term25239, term25239.getClass(), "minute", (byte) 39);
        setByteField(term25239, term25239.getClass(), "second", (byte) 40);
        setIntField(term25239, term25239.getClass(), "nano", 99482694);
        setField(term25234, term25234.getClass(), "time", term25239);
        setField(term25196, term25196.getClass(), "createdAt", term25234);
        setIntField(term25245, term25245.getClass(), "year", 2025);
        setShortField(term25245, term25245.getClass(), "month", (short) 2);
        setShortField(term25245, term25245.getClass(), "day", (short) 11);
        setField(term25244, term25244.getClass(), "date", term25245);
        setByteField(term25249, term25249.getClass(), "hour", (byte) 15);
        setByteField(term25249, term25249.getClass(), "minute", (byte) 46);
        setByteField(term25249, term25249.getClass(), "second", (byte) 31);
        setIntField(term25249, term25249.getClass(), "nano", 989587730);
        setField(term25244, term25244.getClass(), "time", term25249);
        setField(term25196, term25196.getClass(), "updatedAt", term25244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CGOpQSZZwI";
        callMethod(klass, "text", argTypes, term25196, args);
    }

};


