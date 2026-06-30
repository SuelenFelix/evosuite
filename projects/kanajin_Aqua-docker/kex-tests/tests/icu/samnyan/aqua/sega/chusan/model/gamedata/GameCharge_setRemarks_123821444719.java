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

public class GameCharge_setRemarks_123821444719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1801;

    public GameCharge_setRemarks_123821444719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1801 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term1806 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1807 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1811 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1816 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1821 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1832 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1837 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1838 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1842 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1801, term1801.getClass(), "id", 8428634514691209827L);
        setIntField(term1801, term1801.getClass(), "orderId", -1801760683);
        setIntField(term1801, term1801.getClass(), "chargeId", 1141317871);
        setIntField(term1801, term1801.getClass(), "price", 890669485);
        setIntField(term1807, term1807.getClass(), "year", 2028);
        setShortField(term1807, term1807.getClass(), "month", (short) 4);
        setShortField(term1807, term1807.getClass(), "day", (short) 11);
        setField(term1806, term1806.getClass(), "date", term1807);
        setByteField(term1811, term1811.getClass(), "hour", (byte) 4);
        setByteField(term1811, term1811.getClass(), "minute", (byte) 45);
        setByteField(term1811, term1811.getClass(), "second", (byte) 2);
        setIntField(term1811, term1811.getClass(), "nano", 374177968);
        setField(term1806, term1806.getClass(), "time", term1811);
        setField(term1801, term1801.getClass(), "startDate", term1806);
        setIntField(term1817, term1817.getClass(), "year", 2021);
        setShortField(term1817, term1817.getClass(), "month", (short) 4);
        setShortField(term1817, term1817.getClass(), "day", (short) 22);
        setField(term1816, term1816.getClass(), "date", term1817);
        setByteField(term1821, term1821.getClass(), "hour", (byte) 17);
        setByteField(term1821, term1821.getClass(), "minute", (byte) 6);
        setByteField(term1821, term1821.getClass(), "second", (byte) 33);
        setIntField(term1821, term1821.getClass(), "nano", 21410850);
        setField(term1816, term1816.getClass(), "time", term1821);
        setField(term1801, term1801.getClass(), "endDate", term1816);
        setIntField(term1801, term1801.getClass(), "salePrice", 691577392);
        setIntField(term1828, term1828.getClass(), "year", 2026);
        setShortField(term1828, term1828.getClass(), "month", (short) 10);
        setShortField(term1828, term1828.getClass(), "day", (short) 19);
        setField(term1827, term1827.getClass(), "date", term1828);
        setByteField(term1832, term1832.getClass(), "hour", (byte) 7);
        setByteField(term1832, term1832.getClass(), "minute", (byte) 22);
        setByteField(term1832, term1832.getClass(), "second", (byte) 11);
        setIntField(term1832, term1832.getClass(), "nano", 17846677);
        setField(term1827, term1827.getClass(), "time", term1832);
        setField(term1801, term1801.getClass(), "saleStartDate", term1827);
        setIntField(term1838, term1838.getClass(), "year", 2018);
        setShortField(term1838, term1838.getClass(), "month", (short) 10);
        setShortField(term1838, term1838.getClass(), "day", (short) 17);
        setField(term1837, term1837.getClass(), "date", term1838);
        setByteField(term1842, term1842.getClass(), "hour", (byte) 5);
        setByteField(term1842, term1842.getClass(), "minute", (byte) 10);
        setByteField(term1842, term1842.getClass(), "second", (byte) 23);
        setIntField(term1842, term1842.getClass(), "nano", 571520422);
        setField(term1837, term1837.getClass(), "time", term1842);
        setField(term1801, term1801.getClass(), "saleEndDate", term1837);
        setField(term1801, term1801.getClass(), "remarks", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "setRemarks", argTypes, term1801, args);
    }

};


