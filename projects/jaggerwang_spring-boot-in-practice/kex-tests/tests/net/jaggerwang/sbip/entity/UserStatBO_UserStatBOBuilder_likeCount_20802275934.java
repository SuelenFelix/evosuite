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

public class UserStatBO_UserStatBOBuilder_likeCount_20802275934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12503;
     Object term12540;

    public UserStatBO_UserStatBOBuilder_likeCount_20802275934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12504 = new Long(5973526439563541711L);
        Long term12506 = new Long(5246058710498845622L);
        Long term12509 = new Long(4394651392080968777L);
        Long term12512 = new Long(-7310273014364148916L);
        Long term12515 = new Long(8863790908271299748L);
        Long term12518 = new Long(9205327385733285058L);
        term12503 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder"));
        Object term12520 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12521 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12525 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12530 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12531 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12535 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12503, term12503.getClass(), "id", term12504);
        setField(term12503, term12503.getClass(), "userId", term12506);
        setBooleanField(term12503, term12503.getClass(), "postCount$set", false);
        setField(term12503, term12503.getClass(), "postCount$value", term12509);
        setBooleanField(term12503, term12503.getClass(), "likeCount$set", true);
        setField(term12503, term12503.getClass(), "likeCount$value", term12512);
        setBooleanField(term12503, term12503.getClass(), "followingCount$set", false);
        setField(term12503, term12503.getClass(), "followingCount$value", term12515);
        setBooleanField(term12503, term12503.getClass(), "followerCount$set", false);
        setField(term12503, term12503.getClass(), "followerCount$value", term12518);
        setIntField(term12521, term12521.getClass(), "year", 2022);
        setShortField(term12521, term12521.getClass(), "month", (short) 11);
        setShortField(term12521, term12521.getClass(), "day", (short) 5);
        setField(term12520, term12520.getClass(), "date", term12521);
        setByteField(term12525, term12525.getClass(), "hour", (byte) 0);
        setByteField(term12525, term12525.getClass(), "minute", (byte) 51);
        setByteField(term12525, term12525.getClass(), "second", (byte) 23);
        setIntField(term12525, term12525.getClass(), "nano", 1140962);
        setField(term12520, term12520.getClass(), "time", term12525);
        setField(term12503, term12503.getClass(), "createdAt", term12520);
        setIntField(term12531, term12531.getClass(), "year", 2020);
        setShortField(term12531, term12531.getClass(), "month", (short) 5);
        setShortField(term12531, term12531.getClass(), "day", (short) 24);
        setField(term12530, term12530.getClass(), "date", term12531);
        setByteField(term12535, term12535.getClass(), "hour", (byte) 2);
        setByteField(term12535, term12535.getClass(), "minute", (byte) 9);
        setByteField(term12535, term12535.getClass(), "second", (byte) 52);
        setIntField(term12535, term12535.getClass(), "nano", 653329393);
        setField(term12530, term12530.getClass(), "time", term12535);
        setField(term12503, term12503.getClass(), "updatedAt", term12530);
        term12540 = new Long(4199886998224701110L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12540;
        callMethod(klass, "likeCount", argTypes, term12503, args);
    }

};


