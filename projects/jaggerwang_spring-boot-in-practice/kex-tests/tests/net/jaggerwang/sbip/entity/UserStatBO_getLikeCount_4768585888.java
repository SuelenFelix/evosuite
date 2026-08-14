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

public class UserStatBO_getLikeCount_4768585888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11734;

    public UserStatBO_getLikeCount_4768585888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11735 = new Long(3620247240684476031L);
        Long term11737 = new Long(8313800941204938919L);
        Long term11739 = new Long(0L);
        Long term11741 = new Long(0L);
        Long term11743 = new Long(0L);
        Long term11745 = new Long(0L);
        term11734 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term11747 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11748 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11752 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11757 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11758 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11762 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11734, term11734.getClass(), "id", term11735);
        setField(term11734, term11734.getClass(), "userId", term11737);
        setField(term11734, term11734.getClass(), "postCount", term11739);
        setField(term11734, term11734.getClass(), "likeCount", term11741);
        setField(term11734, term11734.getClass(), "followingCount", term11743);
        setField(term11734, term11734.getClass(), "followerCount", term11745);
        setIntField(term11748, term11748.getClass(), "year", 2022);
        setShortField(term11748, term11748.getClass(), "month", (short) 11);
        setShortField(term11748, term11748.getClass(), "day", (short) 10);
        setField(term11747, term11747.getClass(), "date", term11748);
        setByteField(term11752, term11752.getClass(), "hour", (byte) 20);
        setByteField(term11752, term11752.getClass(), "minute", (byte) 8);
        setByteField(term11752, term11752.getClass(), "second", (byte) 35);
        setIntField(term11752, term11752.getClass(), "nano", 658416570);
        setField(term11747, term11747.getClass(), "time", term11752);
        setField(term11734, term11734.getClass(), "createdAt", term11747);
        setIntField(term11758, term11758.getClass(), "year", 2018);
        setShortField(term11758, term11758.getClass(), "month", (short) 11);
        setShortField(term11758, term11758.getClass(), "day", (short) 9);
        setField(term11757, term11757.getClass(), "date", term11758);
        setByteField(term11762, term11762.getClass(), "hour", (byte) 6);
        setByteField(term11762, term11762.getClass(), "minute", (byte) 8);
        setByteField(term11762, term11762.getClass(), "second", (byte) 32);
        setIntField(term11762, term11762.getClass(), "nano", 750733310);
        setField(term11757, term11757.getClass(), "time", term11762);
        setField(term11734, term11734.getClass(), "updatedAt", term11757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikeCount", argTypes, term11734, args);
    }

};


