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

public class UserStatBO_UserStatBOBuilder_build_802133469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12714;

    public UserStatBO_UserStatBOBuilder_build_802133469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12715 = new Long(6902365338255307910L);
        Long term12717 = new Long(-8019730974733786399L);
        Long term12720 = new Long(394960377236392159L);
        Long term12723 = new Long(-2955854401507097864L);
        Long term12726 = new Long(329213208496958131L);
        Long term12729 = new Long(8107921244631636572L);
        term12714 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder"));
        Object term12731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12736 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12746 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12714, term12714.getClass(), "id", term12715);
        setField(term12714, term12714.getClass(), "userId", term12717);
        setBooleanField(term12714, term12714.getClass(), "postCount$set", true);
        setField(term12714, term12714.getClass(), "postCount$value", term12720);
        setBooleanField(term12714, term12714.getClass(), "likeCount$set", true);
        setField(term12714, term12714.getClass(), "likeCount$value", term12723);
        setBooleanField(term12714, term12714.getClass(), "followingCount$set", false);
        setField(term12714, term12714.getClass(), "followingCount$value", term12726);
        setBooleanField(term12714, term12714.getClass(), "followerCount$set", true);
        setField(term12714, term12714.getClass(), "followerCount$value", term12729);
        setIntField(term12732, term12732.getClass(), "year", 2014);
        setShortField(term12732, term12732.getClass(), "month", (short) 5);
        setShortField(term12732, term12732.getClass(), "day", (short) 31);
        setField(term12731, term12731.getClass(), "date", term12732);
        setByteField(term12736, term12736.getClass(), "hour", (byte) 16);
        setByteField(term12736, term12736.getClass(), "minute", (byte) 3);
        setByteField(term12736, term12736.getClass(), "second", (byte) 14);
        setIntField(term12736, term12736.getClass(), "nano", 281059649);
        setField(term12731, term12731.getClass(), "time", term12736);
        setField(term12714, term12714.getClass(), "createdAt", term12731);
        setIntField(term12742, term12742.getClass(), "year", 2010);
        setShortField(term12742, term12742.getClass(), "month", (short) 12);
        setShortField(term12742, term12742.getClass(), "day", (short) 30);
        setField(term12741, term12741.getClass(), "date", term12742);
        setByteField(term12746, term12746.getClass(), "hour", (byte) 17);
        setByteField(term12746, term12746.getClass(), "minute", (byte) 44);
        setByteField(term12746, term12746.getClass(), "second", (byte) 59);
        setIntField(term12746, term12746.getClass(), "nano", 881407895);
        setField(term12741, term12741.getClass(), "time", term12746);
        setField(term12714, term12714.getClass(), "updatedAt", term12741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term12714, args);
    }

};


