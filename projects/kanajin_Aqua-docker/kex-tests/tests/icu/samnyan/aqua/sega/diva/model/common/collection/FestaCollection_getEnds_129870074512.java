package icu.samnyan.aqua.sega.diva.model.common.collection;

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
import static icu.samnyan.aqua.sega.diva.model.common.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class FestaCollection_getEnds_129870074512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9657;

    public FestaCollection_getEnds_129870074512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9828 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term9827 = ((Class) term9828).getDeclaredField((String) "PINK_FESTA");
        ((Field) term9827).setAccessible(true);
        Object enum24 = ((Field) term9827).get((Object) null);
        Class<? extends Object> term10110 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term10109 = ((Class) term10110).getDeclaredField((String) "UNDEFINED");
        ((Field) term10109).setAccessible(true);
        Object enum25 = ((Field) term10109).get((Object) null);
        Integer term9734 = new Integer(0);
        Integer term9736 = new Integer(1);
        Integer term9805 = new Integer(0);
        Integer term9807 = new Integer(1);
        term9657 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term9658 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term9738 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9739 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9743 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9748 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9749 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9753 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9754 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9758 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term9809 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9810 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9814 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9815 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9819 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9820 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term9658, term9658.getClass(), "id", -1);
        setBooleanField(term9658, term9658.getClass(), "enable", true);
        setField(term9658, term9658.getClass(), "name", "xxx");
        setField(term9658, term9658.getClass(), "kind", enum24);
        setField(term9658, term9658.getClass(), "difficulty", enum25);
        setField(term9658, term9658.getClass(), "pvList", "ALL");
        setField(term9658, term9658.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term9658, term9658.getClass(), "addVP", term9734);
        setField(term9658, term9658.getClass(), "vpMultiplier", term9736);
        setIntField(term9739, term9739.getClass(), "year", 2005);
        setShortField(term9739, term9739.getClass(), "month", (short) 1);
        setShortField(term9739, term9739.getClass(), "day", (short) 1);
        setField(term9738, term9738.getClass(), "date", term9739);
        setByteField(term9743, term9743.getClass(), "hour", (byte) 0);
        setByteField(term9743, term9743.getClass(), "minute", (byte) 0);
        setByteField(term9743, term9743.getClass(), "second", (byte) 0);
        setIntField(term9743, term9743.getClass(), "nano", 0);
        setField(term9738, term9738.getClass(), "time", term9743);
        setField(term9658, term9658.getClass(), "start", term9738);
        setIntField(term9749, term9749.getClass(), "year", 2005);
        setShortField(term9749, term9749.getClass(), "month", (short) 1);
        setShortField(term9749, term9749.getClass(), "day", (short) 1);
        setField(term9748, term9748.getClass(), "date", term9749);
        setField(term9748, term9748.getClass(), "time", term9743);
        setField(term9658, term9658.getClass(), "end", term9748);
        setIntField(term9754, term9754.getClass(), "year", 2005);
        setShortField(term9754, term9754.getClass(), "month", (short) 1);
        setShortField(term9754, term9754.getClass(), "day", (short) 1);
        setField(term9753, term9753.getClass(), "date", term9754);
        setField(term9753, term9753.getClass(), "time", term9743);
        setField(term9658, term9658.getClass(), "createDate", term9753);
        setField(term9657, term9657.getClass(), "firstFesta", term9658);
        setIntField(term9758, term9758.getClass(), "id", -1);
        setBooleanField(term9758, term9758.getClass(), "enable", true);
        setField(term9758, term9758.getClass(), "name", "xxx");
        setField(term9758, term9758.getClass(), "kind", enum24);
        setField(term9758, term9758.getClass(), "difficulty", enum25);
        setField(term9758, term9758.getClass(), "pvList", "ALL");
        setField(term9758, term9758.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term9758, term9758.getClass(), "addVP", term9805);
        setField(term9758, term9758.getClass(), "vpMultiplier", term9807);
        setIntField(term9810, term9810.getClass(), "year", 2005);
        setShortField(term9810, term9810.getClass(), "month", (short) 1);
        setShortField(term9810, term9810.getClass(), "day", (short) 1);
        setField(term9809, term9809.getClass(), "date", term9810);
        setField(term9809, term9809.getClass(), "time", term9743);
        setField(term9758, term9758.getClass(), "start", term9809);
        setIntField(term9815, term9815.getClass(), "year", 2005);
        setShortField(term9815, term9815.getClass(), "month", (short) 1);
        setShortField(term9815, term9815.getClass(), "day", (short) 1);
        setField(term9814, term9814.getClass(), "date", term9815);
        setField(term9814, term9814.getClass(), "time", term9743);
        setField(term9758, term9758.getClass(), "end", term9814);
        setIntField(term9820, term9820.getClass(), "year", 2005);
        setShortField(term9820, term9820.getClass(), "month", (short) 1);
        setShortField(term9820, term9820.getClass(), "day", (short) 1);
        setField(term9819, term9819.getClass(), "date", term9820);
        setField(term9819, term9819.getClass(), "time", term9743);
        setField(term9758, term9758.getClass(), "createDate", term9819);
        setField(term9657, term9657.getClass(), "secondFesta", term9758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnds", argTypes, term9657, args);
    }

};


