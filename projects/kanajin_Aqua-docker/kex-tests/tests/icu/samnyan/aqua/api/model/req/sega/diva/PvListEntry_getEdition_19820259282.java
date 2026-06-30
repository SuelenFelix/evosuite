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

public class PvListEntry_getEdition_19820259282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;

    public PvListEntry_getEdition_19820259282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term97 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term98 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term119 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term93, term93.getClass(), "PVID", -1955890973);
        setIntField(term93, term93.getClass(), "Version", -2038273078);
        setIntField(term93, term93.getClass(), "Edition", 1227103734);
        setIntField(term99, term99.getClass(), "year", 2029);
        setShortField(term99, term99.getClass(), "month", (short) 8);
        setShortField(term99, term99.getClass(), "day", (short) 29);
        setField(term98, term98.getClass(), "date", term99);
        setByteField(term103, term103.getClass(), "hour", (byte) 15);
        setByteField(term103, term103.getClass(), "minute", (byte) 50);
        setByteField(term103, term103.getClass(), "second", (byte) 1);
        setIntField(term103, term103.getClass(), "nano", 277971904);
        setField(term98, term98.getClass(), "time", term103);
        setField(term97, term97.getClass(), "Start", term98);
        setIntField(term109, term109.getClass(), "year", 2022);
        setShortField(term109, term109.getClass(), "month", (short) 11);
        setShortField(term109, term109.getClass(), "day", (short) 16);
        setField(term108, term108.getClass(), "date", term109);
        setByteField(term113, term113.getClass(), "hour", (byte) 15);
        setByteField(term113, term113.getClass(), "minute", (byte) 54);
        setByteField(term113, term113.getClass(), "second", (byte) 2);
        setIntField(term113, term113.getClass(), "nano", 733274103);
        setField(term108, term108.getClass(), "time", term113);
        setField(term97, term97.getClass(), "End", term108);
        setField(term93, term93.getClass(), "AdvDemo", term97);
        setIntField(term120, term120.getClass(), "year", 2019);
        setShortField(term120, term120.getClass(), "month", (short) 2);
        setShortField(term120, term120.getClass(), "day", (short) 21);
        setField(term119, term119.getClass(), "date", term120);
        setByteField(term124, term124.getClass(), "hour", (byte) 5);
        setByteField(term124, term124.getClass(), "minute", (byte) 41);
        setByteField(term124, term124.getClass(), "second", (byte) 11);
        setIntField(term124, term124.getClass(), "nano", 859829782);
        setField(term119, term119.getClass(), "time", term124);
        setField(term118, term118.getClass(), "Start", term119);
        setIntField(term130, term130.getClass(), "year", 2018);
        setShortField(term130, term130.getClass(), "month", (short) 9);
        setShortField(term130, term130.getClass(), "day", (short) 28);
        setField(term129, term129.getClass(), "date", term130);
        setByteField(term134, term134.getClass(), "hour", (byte) 3);
        setByteField(term134, term134.getClass(), "minute", (byte) 37);
        setByteField(term134, term134.getClass(), "second", (byte) 46);
        setIntField(term134, term134.getClass(), "nano", 763326845);
        setField(term129, term129.getClass(), "time", term134);
        setField(term118, term118.getClass(), "End", term129);
        setField(term93, term93.getClass(), "Playable", term118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEdition", argTypes, term93, args);
    }

};


