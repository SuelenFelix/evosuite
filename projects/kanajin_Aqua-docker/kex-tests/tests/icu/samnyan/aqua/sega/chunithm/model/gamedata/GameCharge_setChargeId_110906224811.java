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
import java.lang.Integer;

public class GameCharge_setChargeId_110906224811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term969;
     Object term1015;

    public GameCharge_setChargeId_110906224811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term969 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term974 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term975 = newInstance(Class.forName("java.time.LocalDate"));
        Object term979 = newInstance(Class.forName("java.time.LocalTime"));
        Object term984 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term985 = newInstance(Class.forName("java.time.LocalDate"));
        Object term989 = newInstance(Class.forName("java.time.LocalTime"));
        Object term995 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term996 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1000 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1005 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1006 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1010 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term969, term969.getClass(), "id", -4325723315152823407L);
        setIntField(term969, term969.getClass(), "orderId", 1063420942);
        setIntField(term969, term969.getClass(), "chargeId", 1375330971);
        setIntField(term969, term969.getClass(), "price", -478195677);
        setIntField(term975, term975.getClass(), "year", 2011);
        setShortField(term975, term975.getClass(), "month", (short) 8);
        setShortField(term975, term975.getClass(), "day", (short) 1);
        setField(term974, term974.getClass(), "date", term975);
        setByteField(term979, term979.getClass(), "hour", (byte) 7);
        setByteField(term979, term979.getClass(), "minute", (byte) 2);
        setByteField(term979, term979.getClass(), "second", (byte) 46);
        setIntField(term979, term979.getClass(), "nano", 187178462);
        setField(term974, term974.getClass(), "time", term979);
        setField(term969, term969.getClass(), "startDate", term974);
        setIntField(term985, term985.getClass(), "year", 2020);
        setShortField(term985, term985.getClass(), "month", (short) 9);
        setShortField(term985, term985.getClass(), "day", (short) 3);
        setField(term984, term984.getClass(), "date", term985);
        setByteField(term989, term989.getClass(), "hour", (byte) 10);
        setByteField(term989, term989.getClass(), "minute", (byte) 44);
        setByteField(term989, term989.getClass(), "second", (byte) 5);
        setIntField(term989, term989.getClass(), "nano", 572560230);
        setField(term984, term984.getClass(), "time", term989);
        setField(term969, term969.getClass(), "endDate", term984);
        setIntField(term969, term969.getClass(), "salePrice", 972867650);
        setIntField(term996, term996.getClass(), "year", 2020);
        setShortField(term996, term996.getClass(), "month", (short) 8);
        setShortField(term996, term996.getClass(), "day", (short) 16);
        setField(term995, term995.getClass(), "date", term996);
        setByteField(term1000, term1000.getClass(), "hour", (byte) 4);
        setByteField(term1000, term1000.getClass(), "minute", (byte) 37);
        setByteField(term1000, term1000.getClass(), "second", (byte) 19);
        setIntField(term1000, term1000.getClass(), "nano", 605410923);
        setField(term995, term995.getClass(), "time", term1000);
        setField(term969, term969.getClass(), "saleStartDate", term995);
        setIntField(term1006, term1006.getClass(), "year", 2028);
        setShortField(term1006, term1006.getClass(), "month", (short) 5);
        setShortField(term1006, term1006.getClass(), "day", (short) 2);
        setField(term1005, term1005.getClass(), "date", term1006);
        setByteField(term1010, term1010.getClass(), "hour", (byte) 2);
        setByteField(term1010, term1010.getClass(), "minute", (byte) 59);
        setByteField(term1010, term1010.getClass(), "second", (byte) 30);
        setIntField(term1010, term1010.getClass(), "nano", 222274238);
        setField(term1005, term1005.getClass(), "time", term1010);
        setField(term969, term969.getClass(), "saleEndDate", term1005);
        term1015 = new Integer(1655935355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1015;
        callMethod(klass, "setChargeId", argTypes, term969, args);
    }

};


