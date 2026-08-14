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

public class PostStatDTO_equals_3964920313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90527;
     Object term90554;

    public PostStatDTO_equals_3964920313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90528 = new Long(-8433455023051048992L);
        Long term90530 = new Long(2135057416650245432L);
        Long term90532 = new Long(-7977668399638006021L);
        term90527 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO"));
        Object term90534 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90535 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90539 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90544 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90545 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90549 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90527, term90527.getClass(), "id", term90528);
        setField(term90527, term90527.getClass(), "postId", term90530);
        setField(term90527, term90527.getClass(), "likeCount", term90532);
        setIntField(term90535, term90535.getClass(), "year", 2012);
        setShortField(term90535, term90535.getClass(), "month", (short) 11);
        setShortField(term90535, term90535.getClass(), "day", (short) 28);
        setField(term90534, term90534.getClass(), "date", term90535);
        setByteField(term90539, term90539.getClass(), "hour", (byte) 19);
        setByteField(term90539, term90539.getClass(), "minute", (byte) 18);
        setByteField(term90539, term90539.getClass(), "second", (byte) 3);
        setIntField(term90539, term90539.getClass(), "nano", 323457154);
        setField(term90534, term90534.getClass(), "time", term90539);
        setField(term90527, term90527.getClass(), "createdAt", term90534);
        setIntField(term90545, term90545.getClass(), "year", 2020);
        setShortField(term90545, term90545.getClass(), "month", (short) 9);
        setShortField(term90545, term90545.getClass(), "day", (short) 1);
        setField(term90544, term90544.getClass(), "date", term90545);
        setByteField(term90549, term90549.getClass(), "hour", (byte) 22);
        setByteField(term90549, term90549.getClass(), "minute", (byte) 39);
        setByteField(term90549, term90549.getClass(), "second", (byte) 14);
        setIntField(term90549, term90549.getClass(), "nano", 306720874);
        setField(term90544, term90544.getClass(), "time", term90549);
        setField(term90527, term90527.getClass(), "updatedAt", term90544);
        term90554 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term90554;
        callMethod(klass, "equals", argTypes, term90527, args);
    }

};


