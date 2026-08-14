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

public class RoleDTO_setName_13548605438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17225;

    public RoleDTO_setName_13548605438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17226 = new Long(4458302820344896046L);
        term17225 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO"));
        Object term17240 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17241 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17245 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17250 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17251 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17255 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17225, term17225.getClass(), "id", term17226);
        setField(term17225, term17225.getClass(), "name", "lgQkrXANyI");
        setIntField(term17241, term17241.getClass(), "year", 2013);
        setShortField(term17241, term17241.getClass(), "month", (short) 1);
        setShortField(term17241, term17241.getClass(), "day", (short) 17);
        setField(term17240, term17240.getClass(), "date", term17241);
        setByteField(term17245, term17245.getClass(), "hour", (byte) 19);
        setByteField(term17245, term17245.getClass(), "minute", (byte) 49);
        setByteField(term17245, term17245.getClass(), "second", (byte) 53);
        setIntField(term17245, term17245.getClass(), "nano", 217542739);
        setField(term17240, term17240.getClass(), "time", term17245);
        setField(term17225, term17225.getClass(), "createdAt", term17240);
        setIntField(term17251, term17251.getClass(), "year", 2025);
        setShortField(term17251, term17251.getClass(), "month", (short) 8);
        setShortField(term17251, term17251.getClass(), "day", (short) 8);
        setField(term17250, term17250.getClass(), "date", term17251);
        setByteField(term17255, term17255.getClass(), "hour", (byte) 12);
        setByteField(term17255, term17255.getClass(), "minute", (byte) 29);
        setByteField(term17255, term17255.getClass(), "second", (byte) 36);
        setIntField(term17255, term17255.getClass(), "nano", 329488602);
        setField(term17250, term17250.getClass(), "time", term17255);
        setField(term17225, term17225.getClass(), "updatedAt", term17250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MeTmRZXErV";
        callMethod(klass, "setName", argTypes, term17225, args);
    }

};


