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
import java.util.LinkedHashMap;

public class FileDTO_init_85951570728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27683;
     Object term27685;
     Object enum56;
     Object term27720;
     Object term27747;
     Object term27757;
     Object term27779;

    public FileDTO_init_85951570728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27683 = new Long(-7370364068296402536L);
        term27685 = new Long(-1084263688306617320L);
        Class<? extends Object> term27832 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term27831 = ((Class) term27832).getDeclaredField((String) "LOCAL");
        ((Field) term27831).setAccessible(true);
        enum56 = ((Field) term27831).get((Object) null);
        Long term27733 = new Long(1193381106528373019L);
        term27720 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        setField(term27720, term27720.getClass(), "name", "uzmqjnOUXu");
        setField(term27720, term27720.getClass(), "size", term27733);
        setField(term27720, term27720.getClass(), "type", "xeyjTOCOJb");
        term27747 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27748 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27752 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term27748, term27748.getClass(), "year", 2020);
        setShortField(term27748, term27748.getClass(), "month", (short) 5);
        setShortField(term27748, term27748.getClass(), "day", (short) 31);
        setField(term27747, term27747.getClass(), "date", term27748);
        setByteField(term27752, term27752.getClass(), "hour", (byte) 17);
        setByteField(term27752, term27752.getClass(), "minute", (byte) 5);
        setByteField(term27752, term27752.getClass(), "second", (byte) 38);
        setIntField(term27752, term27752.getClass(), "nano", 709012300);
        setField(term27747, term27747.getClass(), "time", term27752);
        term27757 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27758 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27762 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term27758, term27758.getClass(), "year", 2021);
        setShortField(term27758, term27758.getClass(), "month", (short) 7);
        setShortField(term27758, term27758.getClass(), "day", (short) 6);
        setField(term27757, term27757.getClass(), "date", term27758);
        setByteField(term27762, term27762.getClass(), "hour", (byte) 12);
        setByteField(term27762, term27762.getClass(), "minute", (byte) 46);
        setByteField(term27762, term27762.getClass(), "second", (byte) 42);
        setIntField(term27762, term27762.getClass(), "nano", 512890850);
        setField(term27757, term27757.getClass(), "time", term27762);
        term27779 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Region");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.util.Map");
        Object[] args = new Object[10];
        args[0] = term27683;
        args[1] = term27685;
        args[2] = enum56;
        args[3] = "cmuaUiHMVL";
        args[4] = "xjoSGPWUgu";
        args[5] = term27720;
        args[6] = term27747;
        args[7] = term27757;
        args[8] = "DGRqjjdhzy";
        args[9] = term27779;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


