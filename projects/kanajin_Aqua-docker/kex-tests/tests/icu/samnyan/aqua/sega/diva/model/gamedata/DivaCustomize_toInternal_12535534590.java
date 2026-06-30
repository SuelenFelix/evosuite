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

public class DivaCustomize_toInternal_12535534590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28756;

    public DivaCustomize_toInternal_12535534590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28756 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term28771 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28772 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28776 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28786 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28756, term28756.getClass(), "id", -1982489643);
        setField(term28756, term28756.getClass(), "name", "ICnzwgujDT");
        setIntField(term28756, term28756.getClass(), "price", 550892835);
        setIntField(term28772, term28772.getClass(), "year", 2025);
        setShortField(term28772, term28772.getClass(), "month", (short) 4);
        setShortField(term28772, term28772.getClass(), "day", (short) 24);
        setField(term28771, term28771.getClass(), "date", term28772);
        setByteField(term28776, term28776.getClass(), "hour", (byte) 18);
        setByteField(term28776, term28776.getClass(), "minute", (byte) 11);
        setByteField(term28776, term28776.getClass(), "second", (byte) 40);
        setIntField(term28776, term28776.getClass(), "nano", 137454929);
        setField(term28771, term28771.getClass(), "time", term28776);
        setField(term28756, term28756.getClass(), "releaseDate", term28771);
        setIntField(term28782, term28782.getClass(), "year", 2024);
        setShortField(term28782, term28782.getClass(), "month", (short) 1);
        setShortField(term28782, term28782.getClass(), "day", (short) 24);
        setField(term28781, term28781.getClass(), "date", term28782);
        setByteField(term28786, term28786.getClass(), "hour", (byte) 20);
        setByteField(term28786, term28786.getClass(), "minute", (byte) 28);
        setByteField(term28786, term28786.getClass(), "second", (byte) 39);
        setIntField(term28786, term28786.getClass(), "nano", 952728177);
        setField(term28781, term28781.getClass(), "time", term28786);
        setField(term28756, term28756.getClass(), "endDate", term28781);
        setIntField(term28756, term28756.getClass(), "sortOrder", 1237549886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toInternal", argTypes, term28756, args);
    }

};


