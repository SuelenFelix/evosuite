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

public class UserStatDTO_setFollowingCount_71640971215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28600;
     Object term28633;

    public UserStatDTO_setFollowingCount_71640971215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28601 = new Long(7656211287234019484L);
        Long term28603 = new Long(-872579514000598474L);
        Long term28605 = new Long(5097769785635819744L);
        Long term28607 = new Long(9192899183781208922L);
        Long term28609 = new Long(-7705159544905337794L);
        Long term28611 = new Long(678465732474023847L);
        term28600 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28613 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28614 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28618 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28623 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28624 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28628 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28600, term28600.getClass(), "id", term28601);
        setField(term28600, term28600.getClass(), "userId", term28603);
        setField(term28600, term28600.getClass(), "postCount", term28605);
        setField(term28600, term28600.getClass(), "likeCount", term28607);
        setField(term28600, term28600.getClass(), "followingCount", term28609);
        setField(term28600, term28600.getClass(), "followerCount", term28611);
        setIntField(term28614, term28614.getClass(), "year", 2018);
        setShortField(term28614, term28614.getClass(), "month", (short) 7);
        setShortField(term28614, term28614.getClass(), "day", (short) 24);
        setField(term28613, term28613.getClass(), "date", term28614);
        setByteField(term28618, term28618.getClass(), "hour", (byte) 8);
        setByteField(term28618, term28618.getClass(), "minute", (byte) 32);
        setByteField(term28618, term28618.getClass(), "second", (byte) 43);
        setIntField(term28618, term28618.getClass(), "nano", 490940025);
        setField(term28613, term28613.getClass(), "time", term28618);
        setField(term28600, term28600.getClass(), "createdAt", term28613);
        setIntField(term28624, term28624.getClass(), "year", 2018);
        setShortField(term28624, term28624.getClass(), "month", (short) 7);
        setShortField(term28624, term28624.getClass(), "day", (short) 6);
        setField(term28623, term28623.getClass(), "date", term28624);
        setByteField(term28628, term28628.getClass(), "hour", (byte) 6);
        setByteField(term28628, term28628.getClass(), "minute", (byte) 33);
        setByteField(term28628, term28628.getClass(), "second", (byte) 21);
        setIntField(term28628, term28628.getClass(), "nano", 484192339);
        setField(term28623, term28623.getClass(), "time", term28628);
        setField(term28600, term28600.getClass(), "updatedAt", term28623);
        term28633 = new Long(2551047634163864862L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term28633;
        callMethod(klass, "setFollowingCount", argTypes, term28600, args);
    }

};


