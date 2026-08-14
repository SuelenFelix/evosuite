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

public class PostStatDTO_setPostId_2318635829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90395;
     Object term90422;

    public PostStatDTO_setPostId_2318635829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90396 = new Long(-7432340314800293983L);
        Long term90398 = new Long(6550654434780156893L);
        Long term90400 = new Long(2915324594222120179L);
        term90395 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO"));
        Object term90402 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90403 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90407 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90412 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90413 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90417 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90395, term90395.getClass(), "id", term90396);
        setField(term90395, term90395.getClass(), "postId", term90398);
        setField(term90395, term90395.getClass(), "likeCount", term90400);
        setIntField(term90403, term90403.getClass(), "year", 2027);
        setShortField(term90403, term90403.getClass(), "month", (short) 10);
        setShortField(term90403, term90403.getClass(), "day", (short) 28);
        setField(term90402, term90402.getClass(), "date", term90403);
        setByteField(term90407, term90407.getClass(), "hour", (byte) 2);
        setByteField(term90407, term90407.getClass(), "minute", (byte) 55);
        setByteField(term90407, term90407.getClass(), "second", (byte) 11);
        setIntField(term90407, term90407.getClass(), "nano", 659627264);
        setField(term90402, term90402.getClass(), "time", term90407);
        setField(term90395, term90395.getClass(), "createdAt", term90402);
        setIntField(term90413, term90413.getClass(), "year", 2022);
        setShortField(term90413, term90413.getClass(), "month", (short) 1);
        setShortField(term90413, term90413.getClass(), "day", (short) 20);
        setField(term90412, term90412.getClass(), "date", term90413);
        setByteField(term90417, term90417.getClass(), "hour", (byte) 0);
        setByteField(term90417, term90417.getClass(), "minute", (byte) 5);
        setByteField(term90417, term90417.getClass(), "second", (byte) 34);
        setIntField(term90417, term90417.getClass(), "nano", 917908477);
        setField(term90412, term90412.getClass(), "time", term90417);
        setField(term90395, term90395.getClass(), "updatedAt", term90412);
        term90422 = new Long(6230221287187976505L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term90422;
        callMethod(klass, "setPostId", argTypes, term90395, args);
    }

};


