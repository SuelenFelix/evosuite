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
import java.lang.Object;

public class UserStatDTO_getPostCount_1886623875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28262;

    public UserStatDTO_getPostCount_1886623875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28263 = new Long(77619432202128806L);
        Long term28265 = new Long(-1647156882669215876L);
        Long term28267 = new Long(4115148503664117517L);
        Long term28269 = new Long(8527367353497875781L);
        Long term28271 = new Long(-6489405551733780896L);
        Long term28273 = new Long(5818741986224130131L);
        term28262 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28275 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28276 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28280 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28285 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28286 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28290 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28262, term28262.getClass(), "id", term28263);
        setField(term28262, term28262.getClass(), "userId", term28265);
        setField(term28262, term28262.getClass(), "postCount", term28267);
        setField(term28262, term28262.getClass(), "likeCount", term28269);
        setField(term28262, term28262.getClass(), "followingCount", term28271);
        setField(term28262, term28262.getClass(), "followerCount", term28273);
        setIntField(term28276, term28276.getClass(), "year", 2010);
        setShortField(term28276, term28276.getClass(), "month", (short) 11);
        setShortField(term28276, term28276.getClass(), "day", (short) 14);
        setField(term28275, term28275.getClass(), "date", term28276);
        setByteField(term28280, term28280.getClass(), "hour", (byte) 4);
        setByteField(term28280, term28280.getClass(), "minute", (byte) 49);
        setByteField(term28280, term28280.getClass(), "second", (byte) 50);
        setIntField(term28280, term28280.getClass(), "nano", 621399921);
        setField(term28275, term28275.getClass(), "time", term28280);
        setField(term28262, term28262.getClass(), "createdAt", term28275);
        setIntField(term28286, term28286.getClass(), "year", 2027);
        setShortField(term28286, term28286.getClass(), "month", (short) 1);
        setShortField(term28286, term28286.getClass(), "day", (short) 20);
        setField(term28285, term28285.getClass(), "date", term28286);
        setByteField(term28290, term28290.getClass(), "hour", (byte) 8);
        setByteField(term28290, term28290.getClass(), "minute", (byte) 5);
        setByteField(term28290, term28290.getClass(), "second", (byte) 44);
        setIntField(term28290, term28290.getClass(), "nano", 960768267);
        setField(term28285, term28285.getClass(), "time", term28290);
        setField(term28262, term28262.getClass(), "updatedAt", term28285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPostCount", argTypes, term28262, args);
    }

};


