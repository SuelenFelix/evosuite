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

public class FileDTO_getId_7337302163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18370;

    public FileDTO_getId_7337302163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18371 = new Long(-278716491237139968L);
        Long term18373 = new Long(-629491722907628764L);
        Class<? extends Object> term18479 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term18478 = ((Class) term18479).getDeclaredField((String) "LOCAL");
        ((Field) term18478).setAccessible(true);
        Object enum32 = ((Field) term18478).get((Object) null);
        Long term18421 = new Long(-5552123402871285352L);
        HashMap term18467 = new HashMap();
        term18370 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term18408 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term18435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18440 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18450 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18370, term18370.getClass(), "id", term18371);
        setField(term18370, term18370.getClass(), "userId", term18373);
        setField(term18370, term18370.getClass(), "region", enum32);
        setField(term18370, term18370.getClass(), "bucket", "mhQDwIyrRi");
        setField(term18370, term18370.getClass(), "path", "HpZXWDPhlg");
        setField(term18408, term18408.getClass(), "name", "lBOokzEPfe");
        setField(term18408, term18408.getClass(), "size", term18421);
        setField(term18408, term18408.getClass(), "type", "dtGZCsKXbW");
        setField(term18370, term18370.getClass(), "meta", term18408);
        setIntField(term18436, term18436.getClass(), "year", 2011);
        setShortField(term18436, term18436.getClass(), "month", (short) 10);
        setShortField(term18436, term18436.getClass(), "day", (short) 10);
        setField(term18435, term18435.getClass(), "date", term18436);
        setByteField(term18440, term18440.getClass(), "hour", (byte) 5);
        setByteField(term18440, term18440.getClass(), "minute", (byte) 26);
        setByteField(term18440, term18440.getClass(), "second", (byte) 16);
        setIntField(term18440, term18440.getClass(), "nano", 858245653);
        setField(term18435, term18435.getClass(), "time", term18440);
        setField(term18370, term18370.getClass(), "createdAt", term18435);
        setIntField(term18446, term18446.getClass(), "year", 2011);
        setShortField(term18446, term18446.getClass(), "month", (short) 3);
        setShortField(term18446, term18446.getClass(), "day", (short) 25);
        setField(term18445, term18445.getClass(), "date", term18446);
        setByteField(term18450, term18450.getClass(), "hour", (byte) 20);
        setByteField(term18450, term18450.getClass(), "minute", (byte) 10);
        setByteField(term18450, term18450.getClass(), "second", (byte) 51);
        setIntField(term18450, term18450.getClass(), "nano", 162102574);
        setField(term18445, term18445.getClass(), "time", term18450);
        setField(term18370, term18370.getClass(), "updatedAt", term18445);
        setField(term18370, term18370.getClass(), "url", "bdyhHbDAmJ");
        setField(term18370, term18370.getClass(), "thumbs", term18467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term18370, args);
    }

};


