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

public class RoleDTO_getId_12026725463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16998;

    public RoleDTO_getId_12026725463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16999 = new Long(-1164342036939643746L);
        term16998 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO"));
        Object term17013 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17014 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17018 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17023 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17024 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17028 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16998, term16998.getClass(), "id", term16999);
        setField(term16998, term16998.getClass(), "name", "IHqvyhMtuM");
        setIntField(term17014, term17014.getClass(), "year", 2017);
        setShortField(term17014, term17014.getClass(), "month", (short) 6);
        setShortField(term17014, term17014.getClass(), "day", (short) 7);
        setField(term17013, term17013.getClass(), "date", term17014);
        setByteField(term17018, term17018.getClass(), "hour", (byte) 13);
        setByteField(term17018, term17018.getClass(), "minute", (byte) 52);
        setByteField(term17018, term17018.getClass(), "second", (byte) 17);
        setIntField(term17018, term17018.getClass(), "nano", 78180039);
        setField(term17013, term17013.getClass(), "time", term17018);
        setField(term16998, term16998.getClass(), "createdAt", term17013);
        setIntField(term17024, term17024.getClass(), "year", 2017);
        setShortField(term17024, term17024.getClass(), "month", (short) 6);
        setShortField(term17024, term17024.getClass(), "day", (short) 23);
        setField(term17023, term17023.getClass(), "date", term17024);
        setByteField(term17028, term17028.getClass(), "hour", (byte) 23);
        setByteField(term17028, term17028.getClass(), "minute", (byte) 29);
        setByteField(term17028, term17028.getClass(), "second", (byte) 17);
        setIntField(term17028, term17028.getClass(), "nano", 491252353);
        setField(term17023, term17023.getClass(), "time", term17028);
        setField(term16998, term16998.getClass(), "updatedAt", term17023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term16998, args);
    }

};


