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

public class FileDTO_FileDTOBuilder_build_153890319911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57150;

    public FileDTO_FileDTOBuilder_build_153890319911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57151 = new Long(-366973868174666045L);
        Long term57153 = new Long(-7657074490059876332L);
        Class<? extends Object> term57259 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term57258 = ((Class) term57259).getDeclaredField((String) "LOCAL");
        ((Field) term57258).setAccessible(true);
        Object enum112 = ((Field) term57258).get((Object) null);
        Long term57201 = new Long(-4773629433896348407L);
        HashMap term57247 = new HashMap();
        term57150 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder"));
        Object term57188 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term57215 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57216 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57220 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57225 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57226 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57230 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term57150, term57150.getClass(), "id", term57151);
        setField(term57150, term57150.getClass(), "userId", term57153);
        setField(term57150, term57150.getClass(), "region", enum112);
        setField(term57150, term57150.getClass(), "bucket", "yXLTfzOgfX");
        setField(term57150, term57150.getClass(), "path", "MANlfBKTPY");
        setField(term57188, term57188.getClass(), "name", "mRoEmuCJhW");
        setField(term57188, term57188.getClass(), "size", term57201);
        setField(term57188, term57188.getClass(), "type", "JJUWbMXpyM");
        setField(term57150, term57150.getClass(), "meta", term57188);
        setIntField(term57216, term57216.getClass(), "year", 2012);
        setShortField(term57216, term57216.getClass(), "month", (short) 8);
        setShortField(term57216, term57216.getClass(), "day", (short) 31);
        setField(term57215, term57215.getClass(), "date", term57216);
        setByteField(term57220, term57220.getClass(), "hour", (byte) 17);
        setByteField(term57220, term57220.getClass(), "minute", (byte) 11);
        setByteField(term57220, term57220.getClass(), "second", (byte) 29);
        setIntField(term57220, term57220.getClass(), "nano", 462334388);
        setField(term57215, term57215.getClass(), "time", term57220);
        setField(term57150, term57150.getClass(), "createdAt", term57215);
        setIntField(term57226, term57226.getClass(), "year", 2027);
        setShortField(term57226, term57226.getClass(), "month", (short) 11);
        setShortField(term57226, term57226.getClass(), "day", (short) 28);
        setField(term57225, term57225.getClass(), "date", term57226);
        setByteField(term57230, term57230.getClass(), "hour", (byte) 23);
        setByteField(term57230, term57230.getClass(), "minute", (byte) 7);
        setByteField(term57230, term57230.getClass(), "second", (byte) 56);
        setIntField(term57230, term57230.getClass(), "nano", 948648524);
        setField(term57225, term57225.getClass(), "time", term57230);
        setField(term57150, term57150.getClass(), "updatedAt", term57225);
        setField(term57150, term57150.getClass(), "url", "KDrRQWVXok");
        setField(term57150, term57150.getClass(), "thumbs", term57247);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term57150, args);
    }

};


