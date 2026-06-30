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

public class DivaCustomize_getId_16316577851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28802;

    public DivaCustomize_getId_16316577851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28802 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term28817 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28818 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28822 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28832 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28802, term28802.getClass(), "id", -1945635750);
        setField(term28802, term28802.getClass(), "name", "RfDgUkIYjW");
        setIntField(term28802, term28802.getClass(), "price", -1622760744);
        setIntField(term28818, term28818.getClass(), "year", 2029);
        setShortField(term28818, term28818.getClass(), "month", (short) 8);
        setShortField(term28818, term28818.getClass(), "day", (short) 29);
        setField(term28817, term28817.getClass(), "date", term28818);
        setByteField(term28822, term28822.getClass(), "hour", (byte) 15);
        setByteField(term28822, term28822.getClass(), "minute", (byte) 50);
        setByteField(term28822, term28822.getClass(), "second", (byte) 1);
        setIntField(term28822, term28822.getClass(), "nano", 277971904);
        setField(term28817, term28817.getClass(), "time", term28822);
        setField(term28802, term28802.getClass(), "releaseDate", term28817);
        setIntField(term28828, term28828.getClass(), "year", 2022);
        setShortField(term28828, term28828.getClass(), "month", (short) 11);
        setShortField(term28828, term28828.getClass(), "day", (short) 16);
        setField(term28827, term28827.getClass(), "date", term28828);
        setByteField(term28832, term28832.getClass(), "hour", (byte) 15);
        setByteField(term28832, term28832.getClass(), "minute", (byte) 54);
        setByteField(term28832, term28832.getClass(), "second", (byte) 2);
        setIntField(term28832, term28832.getClass(), "nano", 733274103);
        setField(term28827, term28827.getClass(), "time", term28832);
        setField(term28802, term28802.getClass(), "endDate", term28827);
        setIntField(term28802, term28802.getClass(), "sortOrder", 2068435279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term28802, args);
    }

};


