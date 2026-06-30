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

public class ModuleEntry_setReleaseDate_14470854729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228410;
     Object term4228446;

    public ModuleEntry_setReleaseDate_14470854729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228410 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4228425 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228426 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228430 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4228435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228440 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228410, term4228410.getClass(), "ID", -62165416);
        setField(term4228410, term4228410.getClass(), "Name", "QxkCurEaLo");
        setIntField(term4228410, term4228410.getClass(), "Price", 1454972772);
        setIntField(term4228426, term4228426.getClass(), "year", 2019);
        setShortField(term4228426, term4228426.getClass(), "month", (short) 1);
        setShortField(term4228426, term4228426.getClass(), "day", (short) 23);
        setField(term4228425, term4228425.getClass(), "date", term4228426);
        setByteField(term4228430, term4228430.getClass(), "hour", (byte) 4);
        setByteField(term4228430, term4228430.getClass(), "minute", (byte) 21);
        setByteField(term4228430, term4228430.getClass(), "second", (byte) 5);
        setIntField(term4228430, term4228430.getClass(), "nano", 533244878);
        setField(term4228425, term4228425.getClass(), "time", term4228430);
        setField(term4228410, term4228410.getClass(), "ReleaseDate", term4228425);
        setIntField(term4228436, term4228436.getClass(), "year", 2010);
        setShortField(term4228436, term4228436.getClass(), "month", (short) 3);
        setShortField(term4228436, term4228436.getClass(), "day", (short) 31);
        setField(term4228435, term4228435.getClass(), "date", term4228436);
        setByteField(term4228440, term4228440.getClass(), "hour", (byte) 4);
        setByteField(term4228440, term4228440.getClass(), "minute", (byte) 9);
        setByteField(term4228440, term4228440.getClass(), "second", (byte) 24);
        setIntField(term4228440, term4228440.getClass(), "nano", 460289399);
        setField(term4228435, term4228435.getClass(), "time", term4228440);
        setField(term4228410, term4228410.getClass(), "EndDate", term4228435);
        setIntField(term4228410, term4228410.getClass(), "SortOrder", -209682978);
        term4228446 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228447 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228451 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228447, term4228447.getClass(), "year", 2017);
        setShortField(term4228447, term4228447.getClass(), "month", (short) 12);
        setShortField(term4228447, term4228447.getClass(), "day", (short) 15);
        setField(term4228446, term4228446.getClass(), "date", term4228447);
        setByteField(term4228451, term4228451.getClass(), "hour", (byte) 2);
        setByteField(term4228451, term4228451.getClass(), "minute", (byte) 12);
        setByteField(term4228451, term4228451.getClass(), "second", (byte) 21);
        setIntField(term4228451, term4228451.getClass(), "nano", 309427152);
        setField(term4228446, term4228446.getClass(), "time", term4228451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term4228446;
        callMethod(klass, "setReleaseDate", argTypes, term4228410, args);
    }

};


