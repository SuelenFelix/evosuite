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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class FileDTO_toBO_11381316471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17990;

    public FileDTO_toBO_11381316471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17991 = new Long(9214973322210954344L);
        Long term17993 = new Long(3662777917800385964L);
        Class<? extends Object> term18099 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term18098 = ((Class) term18099).getDeclaredField((String) "LOCAL");
        ((Field) term18098).setAccessible(true);
        Object enum31 = ((Field) term18098).get((Object) null);
        Long term18041 = new Long(-7005300544167632229L);
        HashMap term18087 = new HashMap();
        term17990 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term18028 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term18055 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18056 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18060 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18065 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18066 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18070 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17990, term17990.getClass(), "id", term17991);
        setField(term17990, term17990.getClass(), "userId", term17993);
        setField(term17990, term17990.getClass(), "region", enum31);
        setField(term17990, term17990.getClass(), "bucket", "nKZKnxWYCK");
        setField(term17990, term17990.getClass(), "path", "JOqQxuzRuZ");
        setField(term18028, term18028.getClass(), "name", "RSaoipUlsg");
        setField(term18028, term18028.getClass(), "size", term18041);
        setField(term18028, term18028.getClass(), "type", "cSHGbqKqlN");
        setField(term17990, term17990.getClass(), "meta", term18028);
        setIntField(term18056, term18056.getClass(), "year", 2023);
        setShortField(term18056, term18056.getClass(), "month", (short) 5);
        setShortField(term18056, term18056.getClass(), "day", (short) 19);
        setField(term18055, term18055.getClass(), "date", term18056);
        setByteField(term18060, term18060.getClass(), "hour", (byte) 20);
        setByteField(term18060, term18060.getClass(), "minute", (byte) 50);
        setByteField(term18060, term18060.getClass(), "second", (byte) 49);
        setIntField(term18060, term18060.getClass(), "nano", 806710892);
        setField(term18055, term18055.getClass(), "time", term18060);
        setField(term17990, term17990.getClass(), "createdAt", term18055);
        setIntField(term18066, term18066.getClass(), "year", 2022);
        setShortField(term18066, term18066.getClass(), "month", (short) 8);
        setShortField(term18066, term18066.getClass(), "day", (short) 3);
        setField(term18065, term18065.getClass(), "date", term18066);
        setByteField(term18070, term18070.getClass(), "hour", (byte) 18);
        setByteField(term18070, term18070.getClass(), "minute", (byte) 3);
        setByteField(term18070, term18070.getClass(), "second", (byte) 33);
        setIntField(term18070, term18070.getClass(), "nano", 770583920);
        setField(term18065, term18065.getClass(), "time", term18070);
        setField(term17990, term17990.getClass(), "updatedAt", term18065);
        setField(term17990, term17990.getClass(), "url", "pFAfANnxup");
        setField(term17990, term17990.getClass(), "thumbs", term18087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBO", argTypes, term17990, args);
    }

};


