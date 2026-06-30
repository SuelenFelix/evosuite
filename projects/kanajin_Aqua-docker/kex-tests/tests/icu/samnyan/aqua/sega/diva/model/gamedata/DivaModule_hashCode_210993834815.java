package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DivaModule_hashCode_210993834815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30456;

    public DivaModule_hashCode_210993834815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30456 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term30471 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30472 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30476 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30481 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30482 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30486 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30456, term30456.getClass(), "id", -1660057757);
        setField(term30456, term30456.getClass(), "name", "KDKQhbiclt");
        setIntField(term30456, term30456.getClass(), "price", 1816273440);
        setIntField(term30472, term30472.getClass(), "year", 2011);
        setShortField(term30472, term30472.getClass(), "month", (short) 8);
        setShortField(term30472, term30472.getClass(), "day", (short) 1);
        setField(term30471, term30471.getClass(), "date", term30472);
        setByteField(term30476, term30476.getClass(), "hour", (byte) 7);
        setByteField(term30476, term30476.getClass(), "minute", (byte) 2);
        setByteField(term30476, term30476.getClass(), "second", (byte) 46);
        setIntField(term30476, term30476.getClass(), "nano", 187178462);
        setField(term30471, term30471.getClass(), "time", term30476);
        setField(term30456, term30456.getClass(), "releaseDate", term30471);
        setIntField(term30482, term30482.getClass(), "year", 2020);
        setShortField(term30482, term30482.getClass(), "month", (short) 9);
        setShortField(term30482, term30482.getClass(), "day", (short) 3);
        setField(term30481, term30481.getClass(), "date", term30482);
        setByteField(term30486, term30486.getClass(), "hour", (byte) 10);
        setByteField(term30486, term30486.getClass(), "minute", (byte) 44);
        setByteField(term30486, term30486.getClass(), "second", (byte) 5);
        setIntField(term30486, term30486.getClass(), "nano", 572560230);
        setField(term30481, term30481.getClass(), "time", term30486);
        setField(term30456, term30456.getClass(), "endDate", term30481);
        setIntField(term30456, term30456.getClass(), "sortOrder", -96541009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term30456, args);
    }

};


