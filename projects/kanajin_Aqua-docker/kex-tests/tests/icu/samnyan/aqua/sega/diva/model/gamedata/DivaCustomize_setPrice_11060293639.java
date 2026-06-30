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
import java.lang.Integer;

public class DivaCustomize_setPrice_11060293639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29194;
     Object term29230;

    public DivaCustomize_setPrice_11060293639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29194 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term29209 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29210 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29214 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29224 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29194, term29194.getClass(), "id", 590451710);
        setField(term29194, term29194.getClass(), "name", "KIBOVYItqe");
        setIntField(term29194, term29194.getClass(), "price", -1999787419);
        setIntField(term29210, term29210.getClass(), "year", 2025);
        setShortField(term29210, term29210.getClass(), "month", (short) 3);
        setShortField(term29210, term29210.getClass(), "day", (short) 9);
        setField(term29209, term29209.getClass(), "date", term29210);
        setByteField(term29214, term29214.getClass(), "hour", (byte) 5);
        setByteField(term29214, term29214.getClass(), "minute", (byte) 49);
        setByteField(term29214, term29214.getClass(), "second", (byte) 12);
        setIntField(term29214, term29214.getClass(), "nano", 791695028);
        setField(term29209, term29209.getClass(), "time", term29214);
        setField(term29194, term29194.getClass(), "releaseDate", term29209);
        setIntField(term29220, term29220.getClass(), "year", 2023);
        setShortField(term29220, term29220.getClass(), "month", (short) 9);
        setShortField(term29220, term29220.getClass(), "day", (short) 23);
        setField(term29219, term29219.getClass(), "date", term29220);
        setByteField(term29224, term29224.getClass(), "hour", (byte) 12);
        setByteField(term29224, term29224.getClass(), "minute", (byte) 55);
        setByteField(term29224, term29224.getClass(), "second", (byte) 58);
        setIntField(term29224, term29224.getClass(), "nano", 159178396);
        setField(term29219, term29219.getClass(), "time", term29224);
        setField(term29194, term29194.getClass(), "endDate", term29219);
        setIntField(term29194, term29194.getClass(), "sortOrder", -1224443634);
        term29230 = new Integer(1048451946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29230;
        callMethod(klass, "setPrice", argTypes, term29194, args);
    }

};


