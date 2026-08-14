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
import java.util.LinkedHashMap;

public class FileDTO_FileDTOBuilder_thumbs_194538672210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56764;
     Object term56872;

    public FileDTO_FileDTOBuilder_thumbs_194538672210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term56765 = new Long(7043650218274841102L);
        Long term56767 = new Long(-6096774034189525139L);
        Class<? extends Object> term56879 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term56878 = ((Class) term56879).getDeclaredField((String) "LOCAL");
        ((Field) term56878).setAccessible(true);
        Object enum111 = ((Field) term56878).get((Object) null);
        Long term56815 = new Long(-6476891479972746312L);
        HashMap term56861 = new HashMap();
        term56764 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder"));
        Object term56802 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term56829 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56830 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56834 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56844 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term56764, term56764.getClass(), "id", term56765);
        setField(term56764, term56764.getClass(), "userId", term56767);
        setField(term56764, term56764.getClass(), "region", enum111);
        setField(term56764, term56764.getClass(), "bucket", "SDbDgydVpg");
        setField(term56764, term56764.getClass(), "path", "EEMaiNkiOH");
        setField(term56802, term56802.getClass(), "name", "sFdmTylvqh");
        setField(term56802, term56802.getClass(), "size", term56815);
        setField(term56802, term56802.getClass(), "type", "rgniLaOaiz");
        setField(term56764, term56764.getClass(), "meta", term56802);
        setIntField(term56830, term56830.getClass(), "year", 2015);
        setShortField(term56830, term56830.getClass(), "month", (short) 3);
        setShortField(term56830, term56830.getClass(), "day", (short) 31);
        setField(term56829, term56829.getClass(), "date", term56830);
        setByteField(term56834, term56834.getClass(), "hour", (byte) 9);
        setByteField(term56834, term56834.getClass(), "minute", (byte) 42);
        setByteField(term56834, term56834.getClass(), "second", (byte) 3);
        setIntField(term56834, term56834.getClass(), "nano", 508678403);
        setField(term56829, term56829.getClass(), "time", term56834);
        setField(term56764, term56764.getClass(), "createdAt", term56829);
        setIntField(term56840, term56840.getClass(), "year", 2020);
        setShortField(term56840, term56840.getClass(), "month", (short) 9);
        setShortField(term56840, term56840.getClass(), "day", (short) 13);
        setField(term56839, term56839.getClass(), "date", term56840);
        setByteField(term56844, term56844.getClass(), "hour", (byte) 0);
        setByteField(term56844, term56844.getClass(), "minute", (byte) 7);
        setByteField(term56844, term56844.getClass(), "second", (byte) 27);
        setIntField(term56844, term56844.getClass(), "nano", 835567947);
        setField(term56839, term56839.getClass(), "time", term56844);
        setField(term56764, term56764.getClass(), "updatedAt", term56839);
        setField(term56764, term56764.getClass(), "url", "fzQzzdIOMC");
        setField(term56764, term56764.getClass(), "thumbs", term56861);
        term56872 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term56872;
        callMethod(klass, "thumbs", argTypes, term56764, args);
    }

};


