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

public class UserStatDTO_UserStatDTOBuilder_toString_59028636210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58251;

    public UserStatDTO_UserStatDTOBuilder_toString_59028636210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58252 = new Long(4098126979899957789L);
        Long term58254 = new Long(1429711781003863063L);
        Long term58256 = new Long(-1033267581061931547L);
        Long term58258 = new Long(8918321414047974185L);
        Long term58260 = new Long(-142778328872192310L);
        Long term58262 = new Long(-7173990301200265783L);
        term58251 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder"));
        Object term58264 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58265 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58269 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58274 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58275 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58279 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58251, term58251.getClass(), "id", term58252);
        setField(term58251, term58251.getClass(), "userId", term58254);
        setField(term58251, term58251.getClass(), "postCount", term58256);
        setField(term58251, term58251.getClass(), "likeCount", term58258);
        setField(term58251, term58251.getClass(), "followingCount", term58260);
        setField(term58251, term58251.getClass(), "followerCount", term58262);
        setIntField(term58265, term58265.getClass(), "year", 2011);
        setShortField(term58265, term58265.getClass(), "month", (short) 12);
        setShortField(term58265, term58265.getClass(), "day", (short) 8);
        setField(term58264, term58264.getClass(), "date", term58265);
        setByteField(term58269, term58269.getClass(), "hour", (byte) 14);
        setByteField(term58269, term58269.getClass(), "minute", (byte) 21);
        setByteField(term58269, term58269.getClass(), "second", (byte) 41);
        setIntField(term58269, term58269.getClass(), "nano", 831066682);
        setField(term58264, term58264.getClass(), "time", term58269);
        setField(term58251, term58251.getClass(), "createdAt", term58264);
        setIntField(term58275, term58275.getClass(), "year", 2018);
        setShortField(term58275, term58275.getClass(), "month", (short) 12);
        setShortField(term58275, term58275.getClass(), "day", (short) 8);
        setField(term58274, term58274.getClass(), "date", term58275);
        setByteField(term58279, term58279.getClass(), "hour", (byte) 14);
        setByteField(term58279, term58279.getClass(), "minute", (byte) 50);
        setByteField(term58279, term58279.getClass(), "second", (byte) 10);
        setIntField(term58279, term58279.getClass(), "nano", 698726170);
        setField(term58274, term58274.getClass(), "time", term58279);
        setField(term58251, term58251.getClass(), "updatedAt", term58274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term58251, args);
    }

};


