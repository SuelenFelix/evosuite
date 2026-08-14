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

public class UserStatBO_hashCode_135576796323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12263;

    public UserStatBO_hashCode_135576796323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12264 = new Long(-2783999800714825789L);
        Long term12266 = new Long(4266570509071948633L);
        Long term12268 = new Long(0L);
        Long term12270 = new Long(0L);
        Long term12272 = new Long(0L);
        Long term12274 = new Long(0L);
        term12263 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term12276 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12281 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12286 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12287 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12291 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12263, term12263.getClass(), "id", term12264);
        setField(term12263, term12263.getClass(), "userId", term12266);
        setField(term12263, term12263.getClass(), "postCount", term12268);
        setField(term12263, term12263.getClass(), "likeCount", term12270);
        setField(term12263, term12263.getClass(), "followingCount", term12272);
        setField(term12263, term12263.getClass(), "followerCount", term12274);
        setIntField(term12277, term12277.getClass(), "year", 2013);
        setShortField(term12277, term12277.getClass(), "month", (short) 7);
        setShortField(term12277, term12277.getClass(), "day", (short) 26);
        setField(term12276, term12276.getClass(), "date", term12277);
        setByteField(term12281, term12281.getClass(), "hour", (byte) 14);
        setByteField(term12281, term12281.getClass(), "minute", (byte) 45);
        setByteField(term12281, term12281.getClass(), "second", (byte) 33);
        setIntField(term12281, term12281.getClass(), "nano", 547995853);
        setField(term12276, term12276.getClass(), "time", term12281);
        setField(term12263, term12263.getClass(), "createdAt", term12276);
        setIntField(term12287, term12287.getClass(), "year", 2016);
        setShortField(term12287, term12287.getClass(), "month", (short) 12);
        setShortField(term12287, term12287.getClass(), "day", (short) 20);
        setField(term12286, term12286.getClass(), "date", term12287);
        setByteField(term12291, term12291.getClass(), "hour", (byte) 8);
        setByteField(term12291, term12291.getClass(), "minute", (byte) 46);
        setByteField(term12291, term12291.getClass(), "second", (byte) 16);
        setIntField(term12291, term12291.getClass(), "nano", 10071864);
        setField(term12286, term12286.getClass(), "time", term12291);
        setField(term12263, term12263.getClass(), "updatedAt", term12286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12263, args);
    }

};


