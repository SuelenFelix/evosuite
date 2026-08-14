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

public class FileDTO_setMeta_37292555518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24118;
     Object term24226;

    public FileDTO_setMeta_37292555518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24119 = new Long(-6771377873268167033L);
        Long term24121 = new Long(1278107327214302894L);
        Class<? extends Object> term24254 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term24253 = ((Class) term24254).getDeclaredField((String) "LOCAL");
        ((Field) term24253).setAccessible(true);
        Object enum47 = ((Field) term24253).get((Object) null);
        Long term24169 = new Long(3104349415269466587L);
        HashMap term24215 = new HashMap();
        term24118 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term24156 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term24183 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24184 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24188 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24193 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24194 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24198 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24118, term24118.getClass(), "id", term24119);
        setField(term24118, term24118.getClass(), "userId", term24121);
        setField(term24118, term24118.getClass(), "region", enum47);
        setField(term24118, term24118.getClass(), "bucket", "bxyfeicqrK");
        setField(term24118, term24118.getClass(), "path", "vBnWPlsZMk");
        setField(term24156, term24156.getClass(), "name", "fIZsWucfXz");
        setField(term24156, term24156.getClass(), "size", term24169);
        setField(term24156, term24156.getClass(), "type", "IApvtmfhnq");
        setField(term24118, term24118.getClass(), "meta", term24156);
        setIntField(term24184, term24184.getClass(), "year", 2020);
        setShortField(term24184, term24184.getClass(), "month", (short) 10);
        setShortField(term24184, term24184.getClass(), "day", (short) 2);
        setField(term24183, term24183.getClass(), "date", term24184);
        setByteField(term24188, term24188.getClass(), "hour", (byte) 1);
        setByteField(term24188, term24188.getClass(), "minute", (byte) 41);
        setByteField(term24188, term24188.getClass(), "second", (byte) 48);
        setIntField(term24188, term24188.getClass(), "nano", 834720747);
        setField(term24183, term24183.getClass(), "time", term24188);
        setField(term24118, term24118.getClass(), "createdAt", term24183);
        setIntField(term24194, term24194.getClass(), "year", 2022);
        setShortField(term24194, term24194.getClass(), "month", (short) 3);
        setShortField(term24194, term24194.getClass(), "day", (short) 31);
        setField(term24193, term24193.getClass(), "date", term24194);
        setByteField(term24198, term24198.getClass(), "hour", (byte) 3);
        setByteField(term24198, term24198.getClass(), "minute", (byte) 43);
        setByteField(term24198, term24198.getClass(), "second", (byte) 28);
        setIntField(term24198, term24198.getClass(), "nano", 772790770);
        setField(term24193, term24193.getClass(), "time", term24198);
        setField(term24118, term24118.getClass(), "updatedAt", term24193);
        setField(term24118, term24118.getClass(), "url", "VSaNnhMpRc");
        setField(term24118, term24118.getClass(), "thumbs", term24215);
        Long term24239 = new Long(-7423063312741500355L);
        term24226 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        setField(term24226, term24226.getClass(), "name", "hIYsRyOZxk");
        setField(term24226, term24226.getClass(), "size", term24239);
        setField(term24226, term24226.getClass(), "type", "RjNoEywJbC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta");
        Object[] args = new Object[1];
        args[0] = term24226;
        callMethod(klass, "setMeta", argTypes, term24118, args);
    }

};


