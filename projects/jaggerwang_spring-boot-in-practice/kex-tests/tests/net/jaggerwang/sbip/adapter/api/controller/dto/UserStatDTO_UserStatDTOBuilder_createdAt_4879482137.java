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

public class UserStatDTO_UserStatDTOBuilder_createdAt_4879482137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58132;
     Object term58165;

    public UserStatDTO_UserStatDTOBuilder_createdAt_4879482137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58133 = new Long(2577903134840885266L);
        Long term58135 = new Long(-4179615237632495585L);
        Long term58137 = new Long(-2071004435163577830L);
        Long term58139 = new Long(4083439166031950748L);
        Long term58141 = new Long(4354307959269121855L);
        Long term58143 = new Long(-4627619845164555164L);
        term58132 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder"));
        Object term58145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58150 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58155 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58156 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58160 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58132, term58132.getClass(), "id", term58133);
        setField(term58132, term58132.getClass(), "userId", term58135);
        setField(term58132, term58132.getClass(), "postCount", term58137);
        setField(term58132, term58132.getClass(), "likeCount", term58139);
        setField(term58132, term58132.getClass(), "followingCount", term58141);
        setField(term58132, term58132.getClass(), "followerCount", term58143);
        setIntField(term58146, term58146.getClass(), "year", 2017);
        setShortField(term58146, term58146.getClass(), "month", (short) 4);
        setShortField(term58146, term58146.getClass(), "day", (short) 7);
        setField(term58145, term58145.getClass(), "date", term58146);
        setByteField(term58150, term58150.getClass(), "hour", (byte) 21);
        setByteField(term58150, term58150.getClass(), "minute", (byte) 7);
        setByteField(term58150, term58150.getClass(), "second", (byte) 57);
        setIntField(term58150, term58150.getClass(), "nano", 229024114);
        setField(term58145, term58145.getClass(), "time", term58150);
        setField(term58132, term58132.getClass(), "createdAt", term58145);
        setIntField(term58156, term58156.getClass(), "year", 2019);
        setShortField(term58156, term58156.getClass(), "month", (short) 2);
        setShortField(term58156, term58156.getClass(), "day", (short) 24);
        setField(term58155, term58155.getClass(), "date", term58156);
        setByteField(term58160, term58160.getClass(), "hour", (byte) 1);
        setByteField(term58160, term58160.getClass(), "minute", (byte) 34);
        setByteField(term58160, term58160.getClass(), "second", (byte) 39);
        setIntField(term58160, term58160.getClass(), "nano", 549100800);
        setField(term58155, term58155.getClass(), "time", term58160);
        setField(term58132, term58132.getClass(), "updatedAt", term58155);
        term58165 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58166 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58170 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term58166, term58166.getClass(), "year", 2023);
        setShortField(term58166, term58166.getClass(), "month", (short) 12);
        setShortField(term58166, term58166.getClass(), "day", (short) 5);
        setField(term58165, term58165.getClass(), "date", term58166);
        setByteField(term58170, term58170.getClass(), "hour", (byte) 19);
        setByteField(term58170, term58170.getClass(), "minute", (byte) 19);
        setByteField(term58170, term58170.getClass(), "second", (byte) 47);
        setIntField(term58170, term58170.getClass(), "nano", 871420313);
        setField(term58165, term58165.getClass(), "time", term58170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term58165;
        callMethod(klass, "createdAt", argTypes, term58132, args);
    }

};


