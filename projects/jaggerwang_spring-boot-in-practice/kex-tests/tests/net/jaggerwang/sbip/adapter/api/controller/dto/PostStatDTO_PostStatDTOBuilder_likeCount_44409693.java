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

public class PostStatDTO_PostStatDTOBuilder_likeCount_44409693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58352;
     Object term58379;

    public PostStatDTO_PostStatDTOBuilder_likeCount_44409693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58353 = new Long(268218069036722127L);
        Long term58355 = new Long(-3992663397060695265L);
        Long term58357 = new Long(4987297090886718616L);
        term58352 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO$PostStatDTOBuilder"));
        Object term58359 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58360 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58364 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58369 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58370 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58374 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58352, term58352.getClass(), "id", term58353);
        setField(term58352, term58352.getClass(), "postId", term58355);
        setField(term58352, term58352.getClass(), "likeCount", term58357);
        setIntField(term58360, term58360.getClass(), "year", 2017);
        setShortField(term58360, term58360.getClass(), "month", (short) 8);
        setShortField(term58360, term58360.getClass(), "day", (short) 13);
        setField(term58359, term58359.getClass(), "date", term58360);
        setByteField(term58364, term58364.getClass(), "hour", (byte) 3);
        setByteField(term58364, term58364.getClass(), "minute", (byte) 9);
        setByteField(term58364, term58364.getClass(), "second", (byte) 24);
        setIntField(term58364, term58364.getClass(), "nano", 692710591);
        setField(term58359, term58359.getClass(), "time", term58364);
        setField(term58352, term58352.getClass(), "createdAt", term58359);
        setIntField(term58370, term58370.getClass(), "year", 2019);
        setShortField(term58370, term58370.getClass(), "month", (short) 6);
        setShortField(term58370, term58370.getClass(), "day", (short) 13);
        setField(term58369, term58369.getClass(), "date", term58370);
        setByteField(term58374, term58374.getClass(), "hour", (byte) 22);
        setByteField(term58374, term58374.getClass(), "minute", (byte) 53);
        setByteField(term58374, term58374.getClass(), "second", (byte) 1);
        setIntField(term58374, term58374.getClass(), "nano", 411931015);
        setField(term58369, term58369.getClass(), "time", term58374);
        setField(term58352, term58352.getClass(), "updatedAt", term58369);
        term58379 = new Long(-2373676985592181240L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO$PostStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term58379;
        callMethod(klass, "likeCount", argTypes, term58352, args);
    }

};


