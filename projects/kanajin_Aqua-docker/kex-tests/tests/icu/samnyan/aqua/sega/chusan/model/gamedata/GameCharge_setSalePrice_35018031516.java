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
import java.lang.Integer;

public class GameCharge_setSalePrice_35018031516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1575;
     Object term1633;

    public GameCharge_setSalePrice_35018031516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1575 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term1580 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1581 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1585 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1595 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1606 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1611 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1612 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1616 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1575, term1575.getClass(), "id", 5127676408959197577L);
        setIntField(term1575, term1575.getClass(), "orderId", 304775596);
        setIntField(term1575, term1575.getClass(), "chargeId", -1347665717);
        setIntField(term1575, term1575.getClass(), "price", -1888585309);
        setIntField(term1581, term1581.getClass(), "year", 2019);
        setShortField(term1581, term1581.getClass(), "month", (short) 8);
        setShortField(term1581, term1581.getClass(), "day", (short) 12);
        setField(term1580, term1580.getClass(), "date", term1581);
        setByteField(term1585, term1585.getClass(), "hour", (byte) 14);
        setByteField(term1585, term1585.getClass(), "minute", (byte) 1);
        setByteField(term1585, term1585.getClass(), "second", (byte) 51);
        setIntField(term1585, term1585.getClass(), "nano", 499021786);
        setField(term1580, term1580.getClass(), "time", term1585);
        setField(term1575, term1575.getClass(), "startDate", term1580);
        setIntField(term1591, term1591.getClass(), "year", 2014);
        setShortField(term1591, term1591.getClass(), "month", (short) 7);
        setShortField(term1591, term1591.getClass(), "day", (short) 22);
        setField(term1590, term1590.getClass(), "date", term1591);
        setByteField(term1595, term1595.getClass(), "hour", (byte) 9);
        setByteField(term1595, term1595.getClass(), "minute", (byte) 40);
        setByteField(term1595, term1595.getClass(), "second", (byte) 34);
        setIntField(term1595, term1595.getClass(), "nano", 463008257);
        setField(term1590, term1590.getClass(), "time", term1595);
        setField(term1575, term1575.getClass(), "endDate", term1590);
        setIntField(term1575, term1575.getClass(), "salePrice", 683666002);
        setIntField(term1602, term1602.getClass(), "year", 2027);
        setShortField(term1602, term1602.getClass(), "month", (short) 6);
        setShortField(term1602, term1602.getClass(), "day", (short) 20);
        setField(term1601, term1601.getClass(), "date", term1602);
        setByteField(term1606, term1606.getClass(), "hour", (byte) 23);
        setByteField(term1606, term1606.getClass(), "minute", (byte) 21);
        setByteField(term1606, term1606.getClass(), "second", (byte) 6);
        setIntField(term1606, term1606.getClass(), "nano", 897776059);
        setField(term1601, term1601.getClass(), "time", term1606);
        setField(term1575, term1575.getClass(), "saleStartDate", term1601);
        setIntField(term1612, term1612.getClass(), "year", 2016);
        setShortField(term1612, term1612.getClass(), "month", (short) 3);
        setShortField(term1612, term1612.getClass(), "day", (short) 20);
        setField(term1611, term1611.getClass(), "date", term1612);
        setByteField(term1616, term1616.getClass(), "hour", (byte) 0);
        setByteField(term1616, term1616.getClass(), "minute", (byte) 54);
        setByteField(term1616, term1616.getClass(), "second", (byte) 6);
        setIntField(term1616, term1616.getClass(), "nano", 183302469);
        setField(term1611, term1611.getClass(), "time", term1616);
        setField(term1575, term1575.getClass(), "saleEndDate", term1611);
        setField(term1575, term1575.getClass(), "remarks", "ZiaGIbnzTs");
        term1633 = new Integer(1596213415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1633;
        callMethod(klass, "setSalePrice", argTypes, term1575, args);
    }

};


