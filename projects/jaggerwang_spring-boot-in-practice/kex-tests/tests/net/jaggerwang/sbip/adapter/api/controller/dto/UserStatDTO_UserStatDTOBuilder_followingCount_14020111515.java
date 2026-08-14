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

public class UserStatDTO_UserStatDTOBuilder_followingCount_14020111515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58062;
     Object term58095;

    public UserStatDTO_UserStatDTOBuilder_followingCount_14020111515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58063 = new Long(-94386090490716219L);
        Long term58065 = new Long(-5539140353886034290L);
        Long term58067 = new Long(-2993798135603613656L);
        Long term58069 = new Long(7643902889687500887L);
        Long term58071 = new Long(5801400276670793406L);
        Long term58073 = new Long(750257143483156761L);
        term58062 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder"));
        Object term58075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58080 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58090 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58062, term58062.getClass(), "id", term58063);
        setField(term58062, term58062.getClass(), "userId", term58065);
        setField(term58062, term58062.getClass(), "postCount", term58067);
        setField(term58062, term58062.getClass(), "likeCount", term58069);
        setField(term58062, term58062.getClass(), "followingCount", term58071);
        setField(term58062, term58062.getClass(), "followerCount", term58073);
        setIntField(term58076, term58076.getClass(), "year", 2023);
        setShortField(term58076, term58076.getClass(), "month", (short) 12);
        setShortField(term58076, term58076.getClass(), "day", (short) 26);
        setField(term58075, term58075.getClass(), "date", term58076);
        setByteField(term58080, term58080.getClass(), "hour", (byte) 17);
        setByteField(term58080, term58080.getClass(), "minute", (byte) 38);
        setByteField(term58080, term58080.getClass(), "second", (byte) 54);
        setIntField(term58080, term58080.getClass(), "nano", 703000129);
        setField(term58075, term58075.getClass(), "time", term58080);
        setField(term58062, term58062.getClass(), "createdAt", term58075);
        setIntField(term58086, term58086.getClass(), "year", 2013);
        setShortField(term58086, term58086.getClass(), "month", (short) 8);
        setShortField(term58086, term58086.getClass(), "day", (short) 24);
        setField(term58085, term58085.getClass(), "date", term58086);
        setByteField(term58090, term58090.getClass(), "hour", (byte) 15);
        setByteField(term58090, term58090.getClass(), "minute", (byte) 52);
        setByteField(term58090, term58090.getClass(), "second", (byte) 16);
        setIntField(term58090, term58090.getClass(), "nano", 996842360);
        setField(term58085, term58085.getClass(), "time", term58090);
        setField(term58062, term58062.getClass(), "updatedAt", term58085);
        term58095 = new Long(-1357354750773482244L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term58095;
        callMethod(klass, "followingCount", argTypes, term58062, args);
    }

};


