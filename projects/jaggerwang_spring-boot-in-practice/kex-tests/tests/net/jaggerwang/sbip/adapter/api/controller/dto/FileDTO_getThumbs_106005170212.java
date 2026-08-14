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

public class FileDTO_getThumbs_106005170212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21790;

    public FileDTO_getThumbs_106005170212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21791 = new Long(6351887424140565471L);
        Long term21793 = new Long(6273670659288205855L);
        Class<? extends Object> term21899 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term21898 = ((Class) term21899).getDeclaredField((String) "LOCAL");
        ((Field) term21898).setAccessible(true);
        Object enum41 = ((Field) term21898).get((Object) null);
        Long term21841 = new Long(-4776514981294468834L);
        HashMap term21887 = new HashMap();
        term21790 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term21828 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term21855 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21856 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21860 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21865 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21866 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21870 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21790, term21790.getClass(), "id", term21791);
        setField(term21790, term21790.getClass(), "userId", term21793);
        setField(term21790, term21790.getClass(), "region", enum41);
        setField(term21790, term21790.getClass(), "bucket", "GGzwMoHZXC");
        setField(term21790, term21790.getClass(), "path", "IpmgwHTgnG");
        setField(term21828, term21828.getClass(), "name", "tIpkeYIezR");
        setField(term21828, term21828.getClass(), "size", term21841);
        setField(term21828, term21828.getClass(), "type", "YkZtEtthvz");
        setField(term21790, term21790.getClass(), "meta", term21828);
        setIntField(term21856, term21856.getClass(), "year", 2024);
        setShortField(term21856, term21856.getClass(), "month", (short) 9);
        setShortField(term21856, term21856.getClass(), "day", (short) 7);
        setField(term21855, term21855.getClass(), "date", term21856);
        setByteField(term21860, term21860.getClass(), "hour", (byte) 2);
        setByteField(term21860, term21860.getClass(), "minute", (byte) 37);
        setByteField(term21860, term21860.getClass(), "second", (byte) 4);
        setIntField(term21860, term21860.getClass(), "nano", 236043949);
        setField(term21855, term21855.getClass(), "time", term21860);
        setField(term21790, term21790.getClass(), "createdAt", term21855);
        setIntField(term21866, term21866.getClass(), "year", 2025);
        setShortField(term21866, term21866.getClass(), "month", (short) 7);
        setShortField(term21866, term21866.getClass(), "day", (short) 4);
        setField(term21865, term21865.getClass(), "date", term21866);
        setByteField(term21870, term21870.getClass(), "hour", (byte) 18);
        setByteField(term21870, term21870.getClass(), "minute", (byte) 13);
        setByteField(term21870, term21870.getClass(), "second", (byte) 37);
        setIntField(term21870, term21870.getClass(), "nano", 681447348);
        setField(term21865, term21865.getClass(), "time", term21870);
        setField(term21790, term21790.getClass(), "updatedAt", term21865);
        setField(term21790, term21790.getClass(), "url", "dwlZSxlXOo");
        setField(term21790, term21790.getClass(), "thumbs", term21887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getThumbs", argTypes, term21790, args);
    }

};


