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

public class UserStatDTO_UserStatDTOBuilder_postCount_2966305603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57992;
     Object term58025;

    public UserStatDTO_UserStatDTOBuilder_postCount_2966305603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57993 = new Long(-7084245215702303910L);
        Long term57995 = new Long(-2143540634259970953L);
        Long term57997 = new Long(-6779665610828821838L);
        Long term57999 = new Long(7026184159827656720L);
        Long term58001 = new Long(432186805820232994L);
        Long term58003 = new Long(-2991029806121048772L);
        term57992 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder"));
        Object term58005 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58006 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58010 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58015 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58016 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58020 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term57992, term57992.getClass(), "id", term57993);
        setField(term57992, term57992.getClass(), "userId", term57995);
        setField(term57992, term57992.getClass(), "postCount", term57997);
        setField(term57992, term57992.getClass(), "likeCount", term57999);
        setField(term57992, term57992.getClass(), "followingCount", term58001);
        setField(term57992, term57992.getClass(), "followerCount", term58003);
        setIntField(term58006, term58006.getClass(), "year", 2027);
        setShortField(term58006, term58006.getClass(), "month", (short) 2);
        setShortField(term58006, term58006.getClass(), "day", (short) 11);
        setField(term58005, term58005.getClass(), "date", term58006);
        setByteField(term58010, term58010.getClass(), "hour", (byte) 8);
        setByteField(term58010, term58010.getClass(), "minute", (byte) 5);
        setByteField(term58010, term58010.getClass(), "second", (byte) 22);
        setIntField(term58010, term58010.getClass(), "nano", 32017661);
        setField(term58005, term58005.getClass(), "time", term58010);
        setField(term57992, term57992.getClass(), "createdAt", term58005);
        setIntField(term58016, term58016.getClass(), "year", 2025);
        setShortField(term58016, term58016.getClass(), "month", (short) 9);
        setShortField(term58016, term58016.getClass(), "day", (short) 24);
        setField(term58015, term58015.getClass(), "date", term58016);
        setByteField(term58020, term58020.getClass(), "hour", (byte) 4);
        setByteField(term58020, term58020.getClass(), "minute", (byte) 49);
        setByteField(term58020, term58020.getClass(), "second", (byte) 51);
        setIntField(term58020, term58020.getClass(), "nano", 103885357);
        setField(term58015, term58015.getClass(), "time", term58020);
        setField(term57992, term57992.getClass(), "updatedAt", term58015);
        term58025 = new Long(-1146200229133968810L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term58025;
        callMethod(klass, "postCount", argTypes, term57992, args);
    }

};


