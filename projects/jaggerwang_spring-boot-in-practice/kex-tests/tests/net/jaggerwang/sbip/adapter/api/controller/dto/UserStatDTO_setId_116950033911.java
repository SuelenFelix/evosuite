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

public class UserStatDTO_setId_116950033911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28460;
     Object term28493;

    public UserStatDTO_setId_116950033911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28461 = new Long(1350676497718116574L);
        Long term28463 = new Long(-4477377284889705897L);
        Long term28465 = new Long(6323132402520425961L);
        Long term28467 = new Long(-354905832180781372L);
        Long term28469 = new Long(-5967061076297699457L);
        Long term28471 = new Long(1550364590565203407L);
        term28460 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28473 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28474 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28478 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28483 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28484 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28488 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28460, term28460.getClass(), "id", term28461);
        setField(term28460, term28460.getClass(), "userId", term28463);
        setField(term28460, term28460.getClass(), "postCount", term28465);
        setField(term28460, term28460.getClass(), "likeCount", term28467);
        setField(term28460, term28460.getClass(), "followingCount", term28469);
        setField(term28460, term28460.getClass(), "followerCount", term28471);
        setIntField(term28474, term28474.getClass(), "year", 2020);
        setShortField(term28474, term28474.getClass(), "month", (short) 4);
        setShortField(term28474, term28474.getClass(), "day", (short) 16);
        setField(term28473, term28473.getClass(), "date", term28474);
        setByteField(term28478, term28478.getClass(), "hour", (byte) 7);
        setByteField(term28478, term28478.getClass(), "minute", (byte) 46);
        setByteField(term28478, term28478.getClass(), "second", (byte) 47);
        setIntField(term28478, term28478.getClass(), "nano", 687690824);
        setField(term28473, term28473.getClass(), "time", term28478);
        setField(term28460, term28460.getClass(), "createdAt", term28473);
        setIntField(term28484, term28484.getClass(), "year", 2010);
        setShortField(term28484, term28484.getClass(), "month", (short) 7);
        setShortField(term28484, term28484.getClass(), "day", (short) 15);
        setField(term28483, term28483.getClass(), "date", term28484);
        setByteField(term28488, term28488.getClass(), "hour", (byte) 11);
        setByteField(term28488, term28488.getClass(), "minute", (byte) 28);
        setByteField(term28488, term28488.getClass(), "second", (byte) 5);
        setIntField(term28488, term28488.getClass(), "nano", 471613968);
        setField(term28483, term28483.getClass(), "time", term28488);
        setField(term28460, term28460.getClass(), "updatedAt", term28483);
        term28493 = new Long(4530705892517898929L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term28493;
        callMethod(klass, "setId", argTypes, term28460, args);
    }

};


