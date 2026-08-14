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

public class PostStatDTO_toString_99909556816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90610;

    public PostStatDTO_toString_99909556816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90611 = new Long(-1930943711257094155L);
        Long term90613 = new Long(8895118820871384465L);
        Long term90615 = new Long(-1133623154868596434L);
        term90610 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO"));
        Object term90617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90622 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90627 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90628 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90632 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90610, term90610.getClass(), "id", term90611);
        setField(term90610, term90610.getClass(), "postId", term90613);
        setField(term90610, term90610.getClass(), "likeCount", term90615);
        setIntField(term90618, term90618.getClass(), "year", 2026);
        setShortField(term90618, term90618.getClass(), "month", (short) 11);
        setShortField(term90618, term90618.getClass(), "day", (short) 19);
        setField(term90617, term90617.getClass(), "date", term90618);
        setByteField(term90622, term90622.getClass(), "hour", (byte) 12);
        setByteField(term90622, term90622.getClass(), "minute", (byte) 3);
        setByteField(term90622, term90622.getClass(), "second", (byte) 5);
        setIntField(term90622, term90622.getClass(), "nano", 172986053);
        setField(term90617, term90617.getClass(), "time", term90622);
        setField(term90610, term90610.getClass(), "createdAt", term90617);
        setIntField(term90628, term90628.getClass(), "year", 2013);
        setShortField(term90628, term90628.getClass(), "month", (short) 9);
        setShortField(term90628, term90628.getClass(), "day", (short) 29);
        setField(term90627, term90627.getClass(), "date", term90628);
        setByteField(term90632, term90632.getClass(), "hour", (byte) 15);
        setByteField(term90632, term90632.getClass(), "minute", (byte) 27);
        setByteField(term90632, term90632.getClass(), "second", (byte) 16);
        setIntField(term90632, term90632.getClass(), "nano", 618632470);
        setField(term90627, term90627.getClass(), "time", term90632);
        setField(term90610, term90610.getClass(), "updatedAt", term90627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term90610, args);
    }

};


