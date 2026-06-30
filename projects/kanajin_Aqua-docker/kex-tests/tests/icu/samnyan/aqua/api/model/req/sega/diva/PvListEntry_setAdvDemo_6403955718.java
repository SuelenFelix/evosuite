package icu.samnyan.aqua.api.model.req.sega.diva;

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
import static icu.samnyan.aqua.api.model.req.sega.diva.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PvListEntry_setAdvDemo_6403955718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375;
     Object term421;

    public PvListEntry_setAdvDemo_6403955718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term379 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term380 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term381 = newInstance(Class.forName("java.time.LocalDate"));
        Object term385 = newInstance(Class.forName("java.time.LocalTime"));
        Object term390 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term391 = newInstance(Class.forName("java.time.LocalDate"));
        Object term395 = newInstance(Class.forName("java.time.LocalTime"));
        Object term400 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402 = newInstance(Class.forName("java.time.LocalDate"));
        Object term406 = newInstance(Class.forName("java.time.LocalTime"));
        Object term411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term416 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term375, term375.getClass(), "PVID", 865208305);
        setIntField(term375, term375.getClass(), "Version", -1275173084);
        setIntField(term375, term375.getClass(), "Edition", -244121226);
        setIntField(term381, term381.getClass(), "year", 2012);
        setShortField(term381, term381.getClass(), "month", (short) 3);
        setShortField(term381, term381.getClass(), "day", (short) 27);
        setField(term380, term380.getClass(), "date", term381);
        setByteField(term385, term385.getClass(), "hour", (byte) 17);
        setByteField(term385, term385.getClass(), "minute", (byte) 49);
        setByteField(term385, term385.getClass(), "second", (byte) 24);
        setIntField(term385, term385.getClass(), "nano", 530647398);
        setField(term380, term380.getClass(), "time", term385);
        setField(term379, term379.getClass(), "Start", term380);
        setIntField(term391, term391.getClass(), "year", 2010);
        setShortField(term391, term391.getClass(), "month", (short) 6);
        setShortField(term391, term391.getClass(), "day", (short) 14);
        setField(term390, term390.getClass(), "date", term391);
        setByteField(term395, term395.getClass(), "hour", (byte) 6);
        setByteField(term395, term395.getClass(), "minute", (byte) 22);
        setByteField(term395, term395.getClass(), "second", (byte) 20);
        setIntField(term395, term395.getClass(), "nano", 25133051);
        setField(term390, term390.getClass(), "time", term395);
        setField(term379, term379.getClass(), "End", term390);
        setField(term375, term375.getClass(), "AdvDemo", term379);
        setIntField(term402, term402.getClass(), "year", 2010);
        setShortField(term402, term402.getClass(), "month", (short) 5);
        setShortField(term402, term402.getClass(), "day", (short) 2);
        setField(term401, term401.getClass(), "date", term402);
        setByteField(term406, term406.getClass(), "hour", (byte) 2);
        setByteField(term406, term406.getClass(), "minute", (byte) 22);
        setByteField(term406, term406.getClass(), "second", (byte) 33);
        setIntField(term406, term406.getClass(), "nano", 530835039);
        setField(term401, term401.getClass(), "time", term406);
        setField(term400, term400.getClass(), "Start", term401);
        setIntField(term412, term412.getClass(), "year", 2024);
        setShortField(term412, term412.getClass(), "month", (short) 4);
        setShortField(term412, term412.getClass(), "day", (short) 24);
        setField(term411, term411.getClass(), "date", term412);
        setByteField(term416, term416.getClass(), "hour", (byte) 7);
        setByteField(term416, term416.getClass(), "minute", (byte) 2);
        setByteField(term416, term416.getClass(), "second", (byte) 51);
        setIntField(term416, term416.getClass(), "nano", 635502964);
        setField(term411, term411.getClass(), "time", term416);
        setField(term400, term400.getClass(), "End", term411);
        setField(term375, term375.getClass(), "Playable", term400);
        term421 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term422 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term423 = newInstance(Class.forName("java.time.LocalDate"));
        Object term427 = newInstance(Class.forName("java.time.LocalTime"));
        Object term432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term437 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term423, term423.getClass(), "year", 2010);
        setShortField(term423, term423.getClass(), "month", (short) 1);
        setShortField(term423, term423.getClass(), "day", (short) 17);
        setField(term422, term422.getClass(), "date", term423);
        setByteField(term427, term427.getClass(), "hour", (byte) 13);
        setByteField(term427, term427.getClass(), "minute", (byte) 5);
        setByteField(term427, term427.getClass(), "second", (byte) 51);
        setIntField(term427, term427.getClass(), "nano", 362260580);
        setField(term422, term422.getClass(), "time", term427);
        setField(term421, term421.getClass(), "Start", term422);
        setIntField(term433, term433.getClass(), "year", 2010);
        setShortField(term433, term433.getClass(), "month", (short) 9);
        setShortField(term433, term433.getClass(), "day", (short) 28);
        setField(term432, term432.getClass(), "date", term433);
        setByteField(term437, term437.getClass(), "hour", (byte) 6);
        setByteField(term437, term437.getClass(), "minute", (byte) 4);
        setByteField(term437, term437.getClass(), "second", (byte) 54);
        setIntField(term437, term437.getClass(), "nano", 604713782);
        setField(term432, term432.getClass(), "time", term437);
        setField(term421, term421.getClass(), "End", term432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair");
        Object[] args = new Object[1];
        args[0] = term421;
        callMethod(klass, "setAdvDemo", argTypes, term375, args);
    }

};


