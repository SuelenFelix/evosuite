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

public class FileDTO_getPath_7764886337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19890;

    public FileDTO_getPath_7764886337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19891 = new Long(-8692119547314358088L);
        Long term19893 = new Long(-2083524977884307536L);
        Class<? extends Object> term19999 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term19998 = ((Class) term19999).getDeclaredField((String) "LOCAL");
        ((Field) term19998).setAccessible(true);
        Object enum36 = ((Field) term19998).get((Object) null);
        Long term19941 = new Long(-2691996476200751382L);
        HashMap term19987 = new HashMap();
        term19890 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term19928 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term19955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19960 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19966 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19970 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term19890, term19890.getClass(), "id", term19891);
        setField(term19890, term19890.getClass(), "userId", term19893);
        setField(term19890, term19890.getClass(), "region", enum36);
        setField(term19890, term19890.getClass(), "bucket", "gltJarNuUk");
        setField(term19890, term19890.getClass(), "path", "ZwZIDwYcSW");
        setField(term19928, term19928.getClass(), "name", "sOdkipUKRu");
        setField(term19928, term19928.getClass(), "size", term19941);
        setField(term19928, term19928.getClass(), "type", "oKwCDqywym");
        setField(term19890, term19890.getClass(), "meta", term19928);
        setIntField(term19956, term19956.getClass(), "year", 2028);
        setShortField(term19956, term19956.getClass(), "month", (short) 3);
        setShortField(term19956, term19956.getClass(), "day", (short) 20);
        setField(term19955, term19955.getClass(), "date", term19956);
        setByteField(term19960, term19960.getClass(), "hour", (byte) 15);
        setByteField(term19960, term19960.getClass(), "minute", (byte) 5);
        setByteField(term19960, term19960.getClass(), "second", (byte) 16);
        setIntField(term19960, term19960.getClass(), "nano", 223082659);
        setField(term19955, term19955.getClass(), "time", term19960);
        setField(term19890, term19890.getClass(), "createdAt", term19955);
        setIntField(term19966, term19966.getClass(), "year", 2019);
        setShortField(term19966, term19966.getClass(), "month", (short) 4);
        setShortField(term19966, term19966.getClass(), "day", (short) 1);
        setField(term19965, term19965.getClass(), "date", term19966);
        setByteField(term19970, term19970.getClass(), "hour", (byte) 8);
        setByteField(term19970, term19970.getClass(), "minute", (byte) 11);
        setByteField(term19970, term19970.getClass(), "second", (byte) 4);
        setIntField(term19970, term19970.getClass(), "nano", 648208624);
        setField(term19965, term19965.getClass(), "time", term19970);
        setField(term19890, term19890.getClass(), "updatedAt", term19965);
        setField(term19890, term19890.getClass(), "url", "zjZYTddemL");
        setField(term19890, term19890.getClass(), "thumbs", term19987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term19890, args);
    }

};


