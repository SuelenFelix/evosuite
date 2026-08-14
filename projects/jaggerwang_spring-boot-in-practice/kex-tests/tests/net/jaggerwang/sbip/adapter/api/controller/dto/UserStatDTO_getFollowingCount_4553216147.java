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

public class UserStatDTO_getFollowingCount_4553216147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28328;

    public UserStatDTO_getFollowingCount_4553216147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28329 = new Long(-6423955170741487890L);
        Long term28331 = new Long(-4663904610228258188L);
        Long term28333 = new Long(3824691451696451167L);
        Long term28335 = new Long(-6237686742902369498L);
        Long term28337 = new Long(-2286229228641472715L);
        Long term28339 = new Long(7464122056779140588L);
        term28328 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28341 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28342 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28346 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28356 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28328, term28328.getClass(), "id", term28329);
        setField(term28328, term28328.getClass(), "userId", term28331);
        setField(term28328, term28328.getClass(), "postCount", term28333);
        setField(term28328, term28328.getClass(), "likeCount", term28335);
        setField(term28328, term28328.getClass(), "followingCount", term28337);
        setField(term28328, term28328.getClass(), "followerCount", term28339);
        setIntField(term28342, term28342.getClass(), "year", 2014);
        setShortField(term28342, term28342.getClass(), "month", (short) 5);
        setShortField(term28342, term28342.getClass(), "day", (short) 20);
        setField(term28341, term28341.getClass(), "date", term28342);
        setByteField(term28346, term28346.getClass(), "hour", (byte) 12);
        setByteField(term28346, term28346.getClass(), "minute", (byte) 30);
        setByteField(term28346, term28346.getClass(), "second", (byte) 37);
        setIntField(term28346, term28346.getClass(), "nano", 390283474);
        setField(term28341, term28341.getClass(), "time", term28346);
        setField(term28328, term28328.getClass(), "createdAt", term28341);
        setIntField(term28352, term28352.getClass(), "year", 2028);
        setShortField(term28352, term28352.getClass(), "month", (short) 11);
        setShortField(term28352, term28352.getClass(), "day", (short) 28);
        setField(term28351, term28351.getClass(), "date", term28352);
        setByteField(term28356, term28356.getClass(), "hour", (byte) 4);
        setByteField(term28356, term28356.getClass(), "minute", (byte) 25);
        setByteField(term28356, term28356.getClass(), "second", (byte) 12);
        setIntField(term28356, term28356.getClass(), "nano", 726554360);
        setField(term28351, term28351.getClass(), "time", term28356);
        setField(term28328, term28328.getClass(), "updatedAt", term28351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFollowingCount", argTypes, term28328, args);
    }

};


