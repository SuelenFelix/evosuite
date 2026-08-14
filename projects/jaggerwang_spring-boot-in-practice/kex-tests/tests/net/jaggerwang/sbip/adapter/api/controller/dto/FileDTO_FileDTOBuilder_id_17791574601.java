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

public class FileDTO_FileDTOBuilder_id_17791574601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53207;
     Object term53315;

    public FileDTO_FileDTOBuilder_id_17791574601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term53208 = new Long(3628778546975266226L);
        Long term53210 = new Long(5655884987926296954L);
        Class<? extends Object> term53318 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term53317 = ((Class) term53318).getDeclaredField((String) "LOCAL");
        ((Field) term53317).setAccessible(true);
        Object enum102 = ((Field) term53317).get((Object) null);
        Long term53258 = new Long(-6055416231811865303L);
        HashMap term53304 = new HashMap();
        term53207 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder"));
        Object term53245 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term53272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53277 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53282 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53283 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53287 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term53207, term53207.getClass(), "id", term53208);
        setField(term53207, term53207.getClass(), "userId", term53210);
        setField(term53207, term53207.getClass(), "region", enum102);
        setField(term53207, term53207.getClass(), "bucket", "XzZbAcRADD");
        setField(term53207, term53207.getClass(), "path", "UqSNWSoTRy");
        setField(term53245, term53245.getClass(), "name", "VesRqDfjMa");
        setField(term53245, term53245.getClass(), "size", term53258);
        setField(term53245, term53245.getClass(), "type", "AQTTebOiZR");
        setField(term53207, term53207.getClass(), "meta", term53245);
        setIntField(term53273, term53273.getClass(), "year", 2017);
        setShortField(term53273, term53273.getClass(), "month", (short) 2);
        setShortField(term53273, term53273.getClass(), "day", (short) 9);
        setField(term53272, term53272.getClass(), "date", term53273);
        setByteField(term53277, term53277.getClass(), "hour", (byte) 16);
        setByteField(term53277, term53277.getClass(), "minute", (byte) 11);
        setByteField(term53277, term53277.getClass(), "second", (byte) 59);
        setIntField(term53277, term53277.getClass(), "nano", 660290526);
        setField(term53272, term53272.getClass(), "time", term53277);
        setField(term53207, term53207.getClass(), "createdAt", term53272);
        setIntField(term53283, term53283.getClass(), "year", 2013);
        setShortField(term53283, term53283.getClass(), "month", (short) 8);
        setShortField(term53283, term53283.getClass(), "day", (short) 19);
        setField(term53282, term53282.getClass(), "date", term53283);
        setByteField(term53287, term53287.getClass(), "hour", (byte) 23);
        setByteField(term53287, term53287.getClass(), "minute", (byte) 0);
        setByteField(term53287, term53287.getClass(), "second", (byte) 13);
        setIntField(term53287, term53287.getClass(), "nano", 134992386);
        setField(term53282, term53282.getClass(), "time", term53287);
        setField(term53207, term53207.getClass(), "updatedAt", term53282);
        setField(term53207, term53207.getClass(), "url", "mgeIhswNtk");
        setField(term53207, term53207.getClass(), "thumbs", term53304);
        term53315 = new Long(4600612212546071466L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term53315;
        callMethod(klass, "id", argTypes, term53207, args);
    }

};


