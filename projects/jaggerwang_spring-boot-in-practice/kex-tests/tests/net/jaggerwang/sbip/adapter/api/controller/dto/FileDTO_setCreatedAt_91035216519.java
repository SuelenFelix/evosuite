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

public class FileDTO_setCreatedAt_91035216519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24545;
     Object term24653;

    public FileDTO_setCreatedAt_91035216519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24546 = new Long(-8992404862613425105L);
        Long term24548 = new Long(3103198349031409063L);
        Class<? extends Object> term24664 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term24663 = ((Class) term24664).getDeclaredField((String) "LOCAL");
        ((Field) term24663).setAccessible(true);
        Object enum48 = ((Field) term24663).get((Object) null);
        Long term24596 = new Long(753095050088595263L);
        HashMap term24642 = new HashMap();
        term24545 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term24583 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term24610 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24611 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24615 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24620 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24621 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24625 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24545, term24545.getClass(), "id", term24546);
        setField(term24545, term24545.getClass(), "userId", term24548);
        setField(term24545, term24545.getClass(), "region", enum48);
        setField(term24545, term24545.getClass(), "bucket", "RTTvrwwhou");
        setField(term24545, term24545.getClass(), "path", "lRORwXipuk");
        setField(term24583, term24583.getClass(), "name", "fVdTcjgHdw");
        setField(term24583, term24583.getClass(), "size", term24596);
        setField(term24583, term24583.getClass(), "type", "wwAwLLcLPp");
        setField(term24545, term24545.getClass(), "meta", term24583);
        setIntField(term24611, term24611.getClass(), "year", 2010);
        setShortField(term24611, term24611.getClass(), "month", (short) 5);
        setShortField(term24611, term24611.getClass(), "day", (short) 19);
        setField(term24610, term24610.getClass(), "date", term24611);
        setByteField(term24615, term24615.getClass(), "hour", (byte) 12);
        setByteField(term24615, term24615.getClass(), "minute", (byte) 17);
        setByteField(term24615, term24615.getClass(), "second", (byte) 52);
        setIntField(term24615, term24615.getClass(), "nano", 273610077);
        setField(term24610, term24610.getClass(), "time", term24615);
        setField(term24545, term24545.getClass(), "createdAt", term24610);
        setIntField(term24621, term24621.getClass(), "year", 2017);
        setShortField(term24621, term24621.getClass(), "month", (short) 4);
        setShortField(term24621, term24621.getClass(), "day", (short) 5);
        setField(term24620, term24620.getClass(), "date", term24621);
        setByteField(term24625, term24625.getClass(), "hour", (byte) 15);
        setByteField(term24625, term24625.getClass(), "minute", (byte) 9);
        setByteField(term24625, term24625.getClass(), "second", (byte) 36);
        setIntField(term24625, term24625.getClass(), "nano", 504876449);
        setField(term24620, term24620.getClass(), "time", term24625);
        setField(term24545, term24545.getClass(), "updatedAt", term24620);
        setField(term24545, term24545.getClass(), "url", "nHpMKOmlpQ");
        setField(term24545, term24545.getClass(), "thumbs", term24642);
        term24653 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24654 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24658 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term24654, term24654.getClass(), "year", 2013);
        setShortField(term24654, term24654.getClass(), "month", (short) 9);
        setShortField(term24654, term24654.getClass(), "day", (short) 27);
        setField(term24653, term24653.getClass(), "date", term24654);
        setByteField(term24658, term24658.getClass(), "hour", (byte) 9);
        setByteField(term24658, term24658.getClass(), "minute", (byte) 30);
        setByteField(term24658, term24658.getClass(), "second", (byte) 6);
        setIntField(term24658, term24658.getClass(), "nano", 647438502);
        setField(term24653, term24653.getClass(), "time", term24658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term24653;
        callMethod(klass, "setCreatedAt", argTypes, term24545, args);
    }

};


