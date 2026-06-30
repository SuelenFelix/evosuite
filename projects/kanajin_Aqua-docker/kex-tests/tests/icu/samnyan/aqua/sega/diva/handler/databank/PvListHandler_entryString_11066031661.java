package icu.samnyan.aqua.sega.diva.handler.databank;

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
import static icu.samnyan.aqua.sega.diva.handler.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class PvListHandler_entryString_11066031661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6592;

    public PvListHandler_entryString_11066031661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6716 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term6715 = ((Class) term6716).getDeclaredField((String) "NORMAL");
        ((Field) term6715).setAccessible(true);
        Object enum0 = ((Field) term6715).get((Object) null);
        Class<? extends Object> term7014 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term7013 = ((Class) term7014).getDeclaredField((String) "ORIGINAL");
        ((Field) term7013).setAccessible(true);
        Object enum1 = ((Field) term7013).get((Object) null);
        term6592 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term6620 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6621 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6625 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6635 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6640 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6641 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6645 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6650 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6651 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6655 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term6592, term6592.getClass(), "id", 2442117782898005296L);
        setIntField(term6592, term6592.getClass(), "pvId", -1955890973);
        setField(term6592, term6592.getClass(), "difficulty", enum0);
        setIntField(term6592, term6592.getClass(), "version", -2038273078);
        setField(term6592, term6592.getClass(), "edition", enum1);
        setIntField(term6621, term6621.getClass(), "year", 2012);
        setShortField(term6621, term6621.getClass(), "month", (short) 8);
        setShortField(term6621, term6621.getClass(), "day", (short) 25);
        setField(term6620, term6620.getClass(), "date", term6621);
        setByteField(term6625, term6625.getClass(), "hour", (byte) 5);
        setByteField(term6625, term6625.getClass(), "minute", (byte) 20);
        setByteField(term6625, term6625.getClass(), "second", (byte) 50);
        setIntField(term6625, term6625.getClass(), "nano", 345595912);
        setField(term6620, term6620.getClass(), "time", term6625);
        setField(term6592, term6592.getClass(), "demoStart", term6620);
        setIntField(term6631, term6631.getClass(), "year", 2021);
        setShortField(term6631, term6631.getClass(), "month", (short) 1);
        setShortField(term6631, term6631.getClass(), "day", (short) 18);
        setField(term6630, term6630.getClass(), "date", term6631);
        setByteField(term6635, term6635.getClass(), "hour", (byte) 13);
        setByteField(term6635, term6635.getClass(), "minute", (byte) 38);
        setByteField(term6635, term6635.getClass(), "second", (byte) 26);
        setIntField(term6635, term6635.getClass(), "nano", 544608644);
        setField(term6630, term6630.getClass(), "time", term6635);
        setField(term6592, term6592.getClass(), "demoEnd", term6630);
        setIntField(term6641, term6641.getClass(), "year", 2015);
        setShortField(term6641, term6641.getClass(), "month", (short) 9);
        setShortField(term6641, term6641.getClass(), "day", (short) 19);
        setField(term6640, term6640.getClass(), "date", term6641);
        setByteField(term6645, term6645.getClass(), "hour", (byte) 9);
        setByteField(term6645, term6645.getClass(), "minute", (byte) 4);
        setByteField(term6645, term6645.getClass(), "second", (byte) 10);
        setIntField(term6645, term6645.getClass(), "nano", 401765865);
        setField(term6640, term6640.getClass(), "time", term6645);
        setField(term6592, term6592.getClass(), "playableStart", term6640);
        setIntField(term6651, term6651.getClass(), "year", 2015);
        setShortField(term6651, term6651.getClass(), "month", (short) 4);
        setShortField(term6651, term6651.getClass(), "day", (short) 14);
        setField(term6650, term6650.getClass(), "date", term6651);
        setByteField(term6655, term6655.getClass(), "hour", (byte) 18);
        setByteField(term6655, term6655.getClass(), "minute", (byte) 24);
        setByteField(term6655, term6655.getClass(), "second", (byte) 32);
        setIntField(term6655, term6655.getClass(), "nano", 369233818);
        setField(term6650, term6650.getClass(), "time", term6655);
        setField(term6592, term6592.getClass(), "playableEnd", term6650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PvListHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Object[] args = new Object[1];
        args[0] = term6592;
        callMethod(klass, "entryString", argTypes, null, args);
    }

};


