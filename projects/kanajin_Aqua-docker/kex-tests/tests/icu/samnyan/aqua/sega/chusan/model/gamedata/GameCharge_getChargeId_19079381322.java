package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameCharge_getChargeId_19079381322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term595;

    public GameCharge_getChargeId_19079381322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term595 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term600 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term601 = newInstance(Class.forName("java.time.LocalDate"));
        Object term605 = newInstance(Class.forName("java.time.LocalTime"));
        Object term610 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term611 = newInstance(Class.forName("java.time.LocalDate"));
        Object term615 = newInstance(Class.forName("java.time.LocalTime"));
        Object term621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term626 = newInstance(Class.forName("java.time.LocalTime"));
        Object term631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term636 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term595, term595.getClass(), "id", -8257434502486459194L);
        setIntField(term595, term595.getClass(), "orderId", 1962444399);
        setIntField(term595, term595.getClass(), "chargeId", 767834723);
        setIntField(term595, term595.getClass(), "price", -602026508);
        setIntField(term601, term601.getClass(), "year", 2015);
        setShortField(term601, term601.getClass(), "month", (short) 12);
        setShortField(term601, term601.getClass(), "day", (short) 23);
        setField(term600, term600.getClass(), "date", term601);
        setByteField(term605, term605.getClass(), "hour", (byte) 14);
        setByteField(term605, term605.getClass(), "minute", (byte) 17);
        setByteField(term605, term605.getClass(), "second", (byte) 50);
        setIntField(term605, term605.getClass(), "nano", 325544804);
        setField(term600, term600.getClass(), "time", term605);
        setField(term595, term595.getClass(), "startDate", term600);
        setIntField(term611, term611.getClass(), "year", 2027);
        setShortField(term611, term611.getClass(), "month", (short) 11);
        setShortField(term611, term611.getClass(), "day", (short) 8);
        setField(term610, term610.getClass(), "date", term611);
        setByteField(term615, term615.getClass(), "hour", (byte) 11);
        setByteField(term615, term615.getClass(), "minute", (byte) 59);
        setByteField(term615, term615.getClass(), "second", (byte) 14);
        setIntField(term615, term615.getClass(), "nano", 322375591);
        setField(term610, term610.getClass(), "time", term615);
        setField(term595, term595.getClass(), "endDate", term610);
        setIntField(term595, term595.getClass(), "salePrice", -157887805);
        setIntField(term622, term622.getClass(), "year", 2020);
        setShortField(term622, term622.getClass(), "month", (short) 8);
        setShortField(term622, term622.getClass(), "day", (short) 15);
        setField(term621, term621.getClass(), "date", term622);
        setByteField(term626, term626.getClass(), "hour", (byte) 2);
        setByteField(term626, term626.getClass(), "minute", (byte) 0);
        setByteField(term626, term626.getClass(), "second", (byte) 38);
        setIntField(term626, term626.getClass(), "nano", 146431486);
        setField(term621, term621.getClass(), "time", term626);
        setField(term595, term595.getClass(), "saleStartDate", term621);
        setIntField(term632, term632.getClass(), "year", 2014);
        setShortField(term632, term632.getClass(), "month", (short) 11);
        setShortField(term632, term632.getClass(), "day", (short) 8);
        setField(term631, term631.getClass(), "date", term632);
        setByteField(term636, term636.getClass(), "hour", (byte) 8);
        setByteField(term636, term636.getClass(), "minute", (byte) 43);
        setByteField(term636, term636.getClass(), "second", (byte) 32);
        setIntField(term636, term636.getClass(), "nano", 154434838);
        setField(term631, term631.getClass(), "time", term636);
        setField(term595, term595.getClass(), "saleEndDate", term631);
        setField(term595, term595.getClass(), "remarks", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChargeId", argTypes, term595, args);
    }

};


