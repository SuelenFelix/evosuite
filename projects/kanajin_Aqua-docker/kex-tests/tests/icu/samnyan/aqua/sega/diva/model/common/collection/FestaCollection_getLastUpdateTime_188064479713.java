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

public class FestaCollection_getLastUpdateTime_188064479713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10466;

    public FestaCollection_getLastUpdateTime_188064479713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10637 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term10636 = ((Class) term10637).getDeclaredField((String) "PINK_FESTA");
        ((Field) term10636).setAccessible(true);
        Object enum26 = ((Field) term10636).get((Object) null);
        Class<? extends Object> term10919 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term10918 = ((Class) term10919).getDeclaredField((String) "UNDEFINED");
        ((Field) term10918).setAccessible(true);
        Object enum27 = ((Field) term10918).get((Object) null);
        Integer term10543 = new Integer(0);
        Integer term10545 = new Integer(1);
        Integer term10614 = new Integer(0);
        Integer term10616 = new Integer(1);
        term10466 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term10467 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term10547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10552 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10557 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10558 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10562 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10563 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10567 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term10618 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10619 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10623 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10624 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10628 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10629 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term10467, term10467.getClass(), "id", -1);
        setBooleanField(term10467, term10467.getClass(), "enable", true);
        setField(term10467, term10467.getClass(), "name", "xxx");
        setField(term10467, term10467.getClass(), "kind", enum26);
        setField(term10467, term10467.getClass(), "difficulty", enum27);
        setField(term10467, term10467.getClass(), "pvList", "ALL");
        setField(term10467, term10467.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term10467, term10467.getClass(), "addVP", term10543);
        setField(term10467, term10467.getClass(), "vpMultiplier", term10545);
        setIntField(term10548, term10548.getClass(), "year", 2005);
        setShortField(term10548, term10548.getClass(), "month", (short) 1);
        setShortField(term10548, term10548.getClass(), "day", (short) 1);
        setField(term10547, term10547.getClass(), "date", term10548);
        setByteField(term10552, term10552.getClass(), "hour", (byte) 0);
        setByteField(term10552, term10552.getClass(), "minute", (byte) 0);
        setByteField(term10552, term10552.getClass(), "second", (byte) 0);
        setIntField(term10552, term10552.getClass(), "nano", 0);
        setField(term10547, term10547.getClass(), "time", term10552);
        setField(term10467, term10467.getClass(), "start", term10547);
        setIntField(term10558, term10558.getClass(), "year", 2005);
        setShortField(term10558, term10558.getClass(), "month", (short) 1);
        setShortField(term10558, term10558.getClass(), "day", (short) 1);
        setField(term10557, term10557.getClass(), "date", term10558);
        setField(term10557, term10557.getClass(), "time", term10552);
        setField(term10467, term10467.getClass(), "end", term10557);
        setIntField(term10563, term10563.getClass(), "year", 2005);
        setShortField(term10563, term10563.getClass(), "month", (short) 1);
        setShortField(term10563, term10563.getClass(), "day", (short) 1);
        setField(term10562, term10562.getClass(), "date", term10563);
        setField(term10562, term10562.getClass(), "time", term10552);
        setField(term10467, term10467.getClass(), "createDate", term10562);
        setField(term10466, term10466.getClass(), "firstFesta", term10467);
        setIntField(term10567, term10567.getClass(), "id", -1);
        setBooleanField(term10567, term10567.getClass(), "enable", true);
        setField(term10567, term10567.getClass(), "name", "xxx");
        setField(term10567, term10567.getClass(), "kind", enum26);
        setField(term10567, term10567.getClass(), "difficulty", enum27);
        setField(term10567, term10567.getClass(), "pvList", "ALL");
        setField(term10567, term10567.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term10567, term10567.getClass(), "addVP", term10614);
        setField(term10567, term10567.getClass(), "vpMultiplier", term10616);
        setIntField(term10619, term10619.getClass(), "year", 2005);
        setShortField(term10619, term10619.getClass(), "month", (short) 1);
        setShortField(term10619, term10619.getClass(), "day", (short) 1);
        setField(term10618, term10618.getClass(), "date", term10619);
        setField(term10618, term10618.getClass(), "time", term10552);
        setField(term10567, term10567.getClass(), "start", term10618);
        setIntField(term10624, term10624.getClass(), "year", 2005);
        setShortField(term10624, term10624.getClass(), "month", (short) 1);
        setShortField(term10624, term10624.getClass(), "day", (short) 1);
        setField(term10623, term10623.getClass(), "date", term10624);
        setField(term10623, term10623.getClass(), "time", term10552);
        setField(term10567, term10567.getClass(), "end", term10623);
        setIntField(term10629, term10629.getClass(), "year", 2005);
        setShortField(term10629, term10629.getClass(), "month", (short) 1);
        setShortField(term10629, term10629.getClass(), "day", (short) 1);
        setField(term10628, term10628.getClass(), "date", term10629);
        setField(term10628, term10628.getClass(), "time", term10552);
        setField(term10567, term10567.getClass(), "createDate", term10628);
        setField(term10466, term10466.getClass(), "secondFesta", term10567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastUpdateTime", argTypes, term10466, args);
    }

};


