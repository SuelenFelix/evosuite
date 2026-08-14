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
import java.lang.Object;

public class UserStatBO_UserStatBOBuilder_id_3888144201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12386;
     Object term12423;

    public UserStatBO_UserStatBOBuilder_id_3888144201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12387 = new Long(4502292577098212311L);
        Long term12389 = new Long(-3730936709704460408L);
        Long term12392 = new Long(-8614778293741404325L);
        Long term12395 = new Long(-5447369594017685765L);
        Long term12398 = new Long(-5724112525188606013L);
        Long term12401 = new Long(-6100012593724108983L);
        term12386 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder"));
        Object term12403 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12408 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12413 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12414 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12418 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12386, term12386.getClass(), "id", term12387);
        setField(term12386, term12386.getClass(), "userId", term12389);
        setBooleanField(term12386, term12386.getClass(), "postCount$set", false);
        setField(term12386, term12386.getClass(), "postCount$value", term12392);
        setBooleanField(term12386, term12386.getClass(), "likeCount$set", false);
        setField(term12386, term12386.getClass(), "likeCount$value", term12395);
        setBooleanField(term12386, term12386.getClass(), "followingCount$set", false);
        setField(term12386, term12386.getClass(), "followingCount$value", term12398);
        setBooleanField(term12386, term12386.getClass(), "followerCount$set", false);
        setField(term12386, term12386.getClass(), "followerCount$value", term12401);
        setIntField(term12404, term12404.getClass(), "year", 2029);
        setShortField(term12404, term12404.getClass(), "month", (short) 7);
        setShortField(term12404, term12404.getClass(), "day", (short) 19);
        setField(term12403, term12403.getClass(), "date", term12404);
        setByteField(term12408, term12408.getClass(), "hour", (byte) 17);
        setByteField(term12408, term12408.getClass(), "minute", (byte) 37);
        setByteField(term12408, term12408.getClass(), "second", (byte) 21);
        setIntField(term12408, term12408.getClass(), "nano", 320093277);
        setField(term12403, term12403.getClass(), "time", term12408);
        setField(term12386, term12386.getClass(), "createdAt", term12403);
        setIntField(term12414, term12414.getClass(), "year", 2028);
        setShortField(term12414, term12414.getClass(), "month", (short) 1);
        setShortField(term12414, term12414.getClass(), "day", (short) 11);
        setField(term12413, term12413.getClass(), "date", term12414);
        setByteField(term12418, term12418.getClass(), "hour", (byte) 22);
        setByteField(term12418, term12418.getClass(), "minute", (byte) 3);
        setByteField(term12418, term12418.getClass(), "second", (byte) 39);
        setIntField(term12418, term12418.getClass(), "nano", 175567313);
        setField(term12413, term12413.getClass(), "time", term12418);
        setField(term12386, term12386.getClass(), "updatedAt", term12413);
        term12423 = new Long(5465527210299101732L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12423;
        callMethod(klass, "id", argTypes, term12386, args);
    }

};


