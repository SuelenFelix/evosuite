package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameCharge_getPrice_20099313323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597;

    public GameCharge_getPrice_20099313323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term597 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term602 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term603 = newInstance(Class.forName("java.time.LocalDate"));
        Object term607 = newInstance(Class.forName("java.time.LocalTime"));
        Object term612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term617 = newInstance(Class.forName("java.time.LocalTime"));
        Object term623 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term624 = newInstance(Class.forName("java.time.LocalDate"));
        Object term628 = newInstance(Class.forName("java.time.LocalTime"));
        Object term633 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term634 = newInstance(Class.forName("java.time.LocalDate"));
        Object term638 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term597, term597.getClass(), "id", -8400487765614892086L);
        setIntField(term597, term597.getClass(), "orderId", 1876565163);
        setIntField(term597, term597.getClass(), "chargeId", -817164822);
        setIntField(term597, term597.getClass(), "price", -1016503459);
        setIntField(term603, term603.getClass(), "year", 2020);
        setShortField(term603, term603.getClass(), "month", (short) 5);
        setShortField(term603, term603.getClass(), "day", (short) 18);
        setField(term602, term602.getClass(), "date", term603);
        setByteField(term607, term607.getClass(), "hour", (byte) 5);
        setByteField(term607, term607.getClass(), "minute", (byte) 46);
        setByteField(term607, term607.getClass(), "second", (byte) 13);
        setIntField(term607, term607.getClass(), "nano", 45893173);
        setField(term602, term602.getClass(), "time", term607);
        setField(term597, term597.getClass(), "startDate", term602);
        setIntField(term613, term613.getClass(), "year", 2017);
        setShortField(term613, term613.getClass(), "month", (short) 4);
        setShortField(term613, term613.getClass(), "day", (short) 3);
        setField(term612, term612.getClass(), "date", term613);
        setByteField(term617, term617.getClass(), "hour", (byte) 6);
        setByteField(term617, term617.getClass(), "minute", (byte) 51);
        setByteField(term617, term617.getClass(), "second", (byte) 10);
        setIntField(term617, term617.getClass(), "nano", 316377166);
        setField(term612, term612.getClass(), "time", term617);
        setField(term597, term597.getClass(), "endDate", term612);
        setIntField(term597, term597.getClass(), "salePrice", -1968847291);
        setIntField(term624, term624.getClass(), "year", 2027);
        setShortField(term624, term624.getClass(), "month", (short) 8);
        setShortField(term624, term624.getClass(), "day", (short) 23);
        setField(term623, term623.getClass(), "date", term624);
        setByteField(term628, term628.getClass(), "hour", (byte) 15);
        setByteField(term628, term628.getClass(), "minute", (byte) 12);
        setByteField(term628, term628.getClass(), "second", (byte) 6);
        setIntField(term628, term628.getClass(), "nano", 541218258);
        setField(term623, term623.getClass(), "time", term628);
        setField(term597, term597.getClass(), "saleStartDate", term623);
        setIntField(term634, term634.getClass(), "year", 2013);
        setShortField(term634, term634.getClass(), "month", (short) 5);
        setShortField(term634, term634.getClass(), "day", (short) 26);
        setField(term633, term633.getClass(), "date", term634);
        setByteField(term638, term638.getClass(), "hour", (byte) 4);
        setByteField(term638, term638.getClass(), "minute", (byte) 39);
        setByteField(term638, term638.getClass(), "second", (byte) 5);
        setIntField(term638, term638.getClass(), "nano", 392869354);
        setField(term633, term633.getClass(), "time", term638);
        setField(term597, term597.getClass(), "saleEndDate", term633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term597, args);
    }

};


