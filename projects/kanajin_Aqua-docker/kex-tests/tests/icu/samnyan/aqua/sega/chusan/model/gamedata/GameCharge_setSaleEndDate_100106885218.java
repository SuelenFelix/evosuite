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

public class GameCharge_setSaleEndDate_100106885218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1723;
     Object term1781;

    public GameCharge_setSaleEndDate_100106885218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1723 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term1728 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1729 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1733 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1738 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1739 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1743 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1749 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1750 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1754 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1759 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1760 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1764 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1723, term1723.getClass(), "id", -4920224193275732920L);
        setIntField(term1723, term1723.getClass(), "orderId", -615654495);
        setIntField(term1723, term1723.getClass(), "chargeId", -1476117762);
        setIntField(term1723, term1723.getClass(), "price", -341962980);
        setIntField(term1729, term1729.getClass(), "year", 2012);
        setShortField(term1729, term1729.getClass(), "month", (short) 5);
        setShortField(term1729, term1729.getClass(), "day", (short) 17);
        setField(term1728, term1728.getClass(), "date", term1729);
        setByteField(term1733, term1733.getClass(), "hour", (byte) 19);
        setByteField(term1733, term1733.getClass(), "minute", (byte) 36);
        setByteField(term1733, term1733.getClass(), "second", (byte) 33);
        setIntField(term1733, term1733.getClass(), "nano", 46625011);
        setField(term1728, term1728.getClass(), "time", term1733);
        setField(term1723, term1723.getClass(), "startDate", term1728);
        setIntField(term1739, term1739.getClass(), "year", 2013);
        setShortField(term1739, term1739.getClass(), "month", (short) 7);
        setShortField(term1739, term1739.getClass(), "day", (short) 3);
        setField(term1738, term1738.getClass(), "date", term1739);
        setByteField(term1743, term1743.getClass(), "hour", (byte) 10);
        setByteField(term1743, term1743.getClass(), "minute", (byte) 59);
        setByteField(term1743, term1743.getClass(), "second", (byte) 22);
        setIntField(term1743, term1743.getClass(), "nano", 937921480);
        setField(term1738, term1738.getClass(), "time", term1743);
        setField(term1723, term1723.getClass(), "endDate", term1738);
        setIntField(term1723, term1723.getClass(), "salePrice", 1532716628);
        setIntField(term1750, term1750.getClass(), "year", 2012);
        setShortField(term1750, term1750.getClass(), "month", (short) 2);
        setShortField(term1750, term1750.getClass(), "day", (short) 29);
        setField(term1749, term1749.getClass(), "date", term1750);
        setByteField(term1754, term1754.getClass(), "hour", (byte) 14);
        setByteField(term1754, term1754.getClass(), "minute", (byte) 26);
        setByteField(term1754, term1754.getClass(), "second", (byte) 20);
        setIntField(term1754, term1754.getClass(), "nano", 780823452);
        setField(term1749, term1749.getClass(), "time", term1754);
        setField(term1723, term1723.getClass(), "saleStartDate", term1749);
        setIntField(term1760, term1760.getClass(), "year", 2029);
        setShortField(term1760, term1760.getClass(), "month", (short) 7);
        setShortField(term1760, term1760.getClass(), "day", (short) 19);
        setField(term1759, term1759.getClass(), "date", term1760);
        setByteField(term1764, term1764.getClass(), "hour", (byte) 17);
        setByteField(term1764, term1764.getClass(), "minute", (byte) 37);
        setByteField(term1764, term1764.getClass(), "second", (byte) 21);
        setIntField(term1764, term1764.getClass(), "nano", 320093277);
        setField(term1759, term1759.getClass(), "time", term1764);
        setField(term1723, term1723.getClass(), "saleEndDate", term1759);
        setField(term1723, term1723.getClass(), "remarks", "HyxfbSQYBe");
        term1781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1786 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1782, term1782.getClass(), "year", 2028);
        setShortField(term1782, term1782.getClass(), "month", (short) 1);
        setShortField(term1782, term1782.getClass(), "day", (short) 11);
        setField(term1781, term1781.getClass(), "date", term1782);
        setByteField(term1786, term1786.getClass(), "hour", (byte) 22);
        setByteField(term1786, term1786.getClass(), "minute", (byte) 3);
        setByteField(term1786, term1786.getClass(), "second", (byte) 39);
        setIntField(term1786, term1786.getClass(), "nano", 175567313);
        setField(term1781, term1781.getClass(), "time", term1786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1781;
        callMethod(klass, "setSaleEndDate", argTypes, term1723, args);
    }

};


