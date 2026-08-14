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

public class FileDTO_getMeta_14526881678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20270;

    public FileDTO_getMeta_14526881678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20271 = new Long(-3806202176947356197L);
        Long term20273 = new Long(-5534222035915952617L);
        Class<? extends Object> term20379 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term20378 = ((Class) term20379).getDeclaredField((String) "LOCAL");
        ((Field) term20378).setAccessible(true);
        Object enum37 = ((Field) term20378).get((Object) null);
        Long term20321 = new Long(8073378116544724166L);
        HashMap term20367 = new HashMap();
        term20270 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term20308 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term20335 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20336 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20340 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20345 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20346 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20350 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term20270, term20270.getClass(), "id", term20271);
        setField(term20270, term20270.getClass(), "userId", term20273);
        setField(term20270, term20270.getClass(), "region", enum37);
        setField(term20270, term20270.getClass(), "bucket", "orEuhCStGM");
        setField(term20270, term20270.getClass(), "path", "HhEaSXWvrY");
        setField(term20308, term20308.getClass(), "name", "CVRGEomOth");
        setField(term20308, term20308.getClass(), "size", term20321);
        setField(term20308, term20308.getClass(), "type", "vSeruUyNWX");
        setField(term20270, term20270.getClass(), "meta", term20308);
        setIntField(term20336, term20336.getClass(), "year", 2016);
        setShortField(term20336, term20336.getClass(), "month", (short) 4);
        setShortField(term20336, term20336.getClass(), "day", (short) 23);
        setField(term20335, term20335.getClass(), "date", term20336);
        setByteField(term20340, term20340.getClass(), "hour", (byte) 13);
        setByteField(term20340, term20340.getClass(), "minute", (byte) 34);
        setByteField(term20340, term20340.getClass(), "second", (byte) 22);
        setIntField(term20340, term20340.getClass(), "nano", 20103660);
        setField(term20335, term20335.getClass(), "time", term20340);
        setField(term20270, term20270.getClass(), "createdAt", term20335);
        setIntField(term20346, term20346.getClass(), "year", 2023);
        setShortField(term20346, term20346.getClass(), "month", (short) 1);
        setShortField(term20346, term20346.getClass(), "day", (short) 24);
        setField(term20345, term20345.getClass(), "date", term20346);
        setByteField(term20350, term20350.getClass(), "hour", (byte) 10);
        setByteField(term20350, term20350.getClass(), "minute", (byte) 26);
        setByteField(term20350, term20350.getClass(), "second", (byte) 14);
        setIntField(term20350, term20350.getClass(), "nano", 736807866);
        setField(term20345, term20345.getClass(), "time", term20350);
        setField(term20270, term20270.getClass(), "updatedAt", term20345);
        setField(term20270, term20270.getClass(), "url", "UkKvaeJfEC");
        setField(term20270, term20270.getClass(), "thumbs", term20367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeta", argTypes, term20270, args);
    }

};


