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

public class UserStatDTO_setLikeCount_120107658214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28565;
     Object term28598;

    public UserStatDTO_setLikeCount_120107658214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28566 = new Long(-1978508496784157882L);
        Long term28568 = new Long(-7840999196900383276L);
        Long term28570 = new Long(1528628920302068646L);
        Long term28572 = new Long(3161040540173678206L);
        Long term28574 = new Long(8640463098965331396L);
        Long term28576 = new Long(-4136906775323730350L);
        term28565 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28578 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28579 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28583 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28588 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28589 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28593 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28565, term28565.getClass(), "id", term28566);
        setField(term28565, term28565.getClass(), "userId", term28568);
        setField(term28565, term28565.getClass(), "postCount", term28570);
        setField(term28565, term28565.getClass(), "likeCount", term28572);
        setField(term28565, term28565.getClass(), "followingCount", term28574);
        setField(term28565, term28565.getClass(), "followerCount", term28576);
        setIntField(term28579, term28579.getClass(), "year", 2017);
        setShortField(term28579, term28579.getClass(), "month", (short) 1);
        setShortField(term28579, term28579.getClass(), "day", (short) 3);
        setField(term28578, term28578.getClass(), "date", term28579);
        setByteField(term28583, term28583.getClass(), "hour", (byte) 14);
        setByteField(term28583, term28583.getClass(), "minute", (byte) 1);
        setByteField(term28583, term28583.getClass(), "second", (byte) 1);
        setIntField(term28583, term28583.getClass(), "nano", 827128674);
        setField(term28578, term28578.getClass(), "time", term28583);
        setField(term28565, term28565.getClass(), "createdAt", term28578);
        setIntField(term28589, term28589.getClass(), "year", 2022);
        setShortField(term28589, term28589.getClass(), "month", (short) 9);
        setShortField(term28589, term28589.getClass(), "day", (short) 3);
        setField(term28588, term28588.getClass(), "date", term28589);
        setByteField(term28593, term28593.getClass(), "hour", (byte) 22);
        setByteField(term28593, term28593.getClass(), "minute", (byte) 31);
        setByteField(term28593, term28593.getClass(), "second", (byte) 44);
        setIntField(term28593, term28593.getClass(), "nano", 798112760);
        setField(term28588, term28588.getClass(), "time", term28593);
        setField(term28565, term28565.getClass(), "updatedAt", term28588);
        term28598 = new Long(6381166215871562039L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term28598;
        callMethod(klass, "setLikeCount", argTypes, term28565, args);
    }

};


