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

public class GameCharge_getChargeId_18868207142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551;

    public GameCharge_getChargeId_18868207142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term551 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term556 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term557 = newInstance(Class.forName("java.time.LocalDate"));
        Object term561 = newInstance(Class.forName("java.time.LocalTime"));
        Object term566 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term567 = newInstance(Class.forName("java.time.LocalDate"));
        Object term571 = newInstance(Class.forName("java.time.LocalTime"));
        Object term577 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term578 = newInstance(Class.forName("java.time.LocalDate"));
        Object term582 = newInstance(Class.forName("java.time.LocalTime"));
        Object term587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term592 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term551, term551.getClass(), "id", -8257434502486459194L);
        setIntField(term551, term551.getClass(), "orderId", 1962444399);
        setIntField(term551, term551.getClass(), "chargeId", 767834723);
        setIntField(term551, term551.getClass(), "price", -602026508);
        setIntField(term557, term557.getClass(), "year", 2015);
        setShortField(term557, term557.getClass(), "month", (short) 12);
        setShortField(term557, term557.getClass(), "day", (short) 23);
        setField(term556, term556.getClass(), "date", term557);
        setByteField(term561, term561.getClass(), "hour", (byte) 14);
        setByteField(term561, term561.getClass(), "minute", (byte) 17);
        setByteField(term561, term561.getClass(), "second", (byte) 50);
        setIntField(term561, term561.getClass(), "nano", 325544804);
        setField(term556, term556.getClass(), "time", term561);
        setField(term551, term551.getClass(), "startDate", term556);
        setIntField(term567, term567.getClass(), "year", 2027);
        setShortField(term567, term567.getClass(), "month", (short) 11);
        setShortField(term567, term567.getClass(), "day", (short) 8);
        setField(term566, term566.getClass(), "date", term567);
        setByteField(term571, term571.getClass(), "hour", (byte) 11);
        setByteField(term571, term571.getClass(), "minute", (byte) 59);
        setByteField(term571, term571.getClass(), "second", (byte) 14);
        setIntField(term571, term571.getClass(), "nano", 322375591);
        setField(term566, term566.getClass(), "time", term571);
        setField(term551, term551.getClass(), "endDate", term566);
        setIntField(term551, term551.getClass(), "salePrice", -157887805);
        setIntField(term578, term578.getClass(), "year", 2020);
        setShortField(term578, term578.getClass(), "month", (short) 8);
        setShortField(term578, term578.getClass(), "day", (short) 15);
        setField(term577, term577.getClass(), "date", term578);
        setByteField(term582, term582.getClass(), "hour", (byte) 2);
        setByteField(term582, term582.getClass(), "minute", (byte) 0);
        setByteField(term582, term582.getClass(), "second", (byte) 38);
        setIntField(term582, term582.getClass(), "nano", 146431486);
        setField(term577, term577.getClass(), "time", term582);
        setField(term551, term551.getClass(), "saleStartDate", term577);
        setIntField(term588, term588.getClass(), "year", 2014);
        setShortField(term588, term588.getClass(), "month", (short) 11);
        setShortField(term588, term588.getClass(), "day", (short) 8);
        setField(term587, term587.getClass(), "date", term588);
        setByteField(term592, term592.getClass(), "hour", (byte) 8);
        setByteField(term592, term592.getClass(), "minute", (byte) 43);
        setByteField(term592, term592.getClass(), "second", (byte) 32);
        setIntField(term592, term592.getClass(), "nano", 154434838);
        setField(term587, term587.getClass(), "time", term592);
        setField(term551, term551.getClass(), "saleEndDate", term587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChargeId", argTypes, term551, args);
    }

};


