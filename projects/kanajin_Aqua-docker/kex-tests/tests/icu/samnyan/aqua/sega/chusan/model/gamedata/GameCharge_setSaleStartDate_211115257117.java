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

public class GameCharge_setSaleStartDate_211115257117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1645;
     Object term1703;

    public GameCharge_setSaleStartDate_211115257117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1645 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term1650 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1651 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1655 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1660 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1661 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1665 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1671 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1676 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1681 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1686 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1645, term1645.getClass(), "id", -6573104506744284592L);
        setIntField(term1645, term1645.getClass(), "orderId", -268815336);
        setIntField(term1645, term1645.getClass(), "chargeId", -1210583429);
        setIntField(term1645, term1645.getClass(), "price", -663691365);
        setIntField(term1651, term1651.getClass(), "year", 2013);
        setShortField(term1651, term1651.getClass(), "month", (short) 11);
        setShortField(term1651, term1651.getClass(), "day", (short) 19);
        setField(term1650, term1650.getClass(), "date", term1651);
        setByteField(term1655, term1655.getClass(), "hour", (byte) 6);
        setByteField(term1655, term1655.getClass(), "minute", (byte) 45);
        setByteField(term1655, term1655.getClass(), "second", (byte) 10);
        setIntField(term1655, term1655.getClass(), "nano", 288981190);
        setField(term1650, term1650.getClass(), "time", term1655);
        setField(term1645, term1645.getClass(), "startDate", term1650);
        setIntField(term1661, term1661.getClass(), "year", 2025);
        setShortField(term1661, term1661.getClass(), "month", (short) 9);
        setShortField(term1661, term1661.getClass(), "day", (short) 18);
        setField(term1660, term1660.getClass(), "date", term1661);
        setByteField(term1665, term1665.getClass(), "hour", (byte) 16);
        setByteField(term1665, term1665.getClass(), "minute", (byte) 1);
        setByteField(term1665, term1665.getClass(), "second", (byte) 23);
        setIntField(term1665, term1665.getClass(), "nano", 178285726);
        setField(term1660, term1660.getClass(), "time", term1665);
        setField(term1645, term1645.getClass(), "endDate", term1660);
        setIntField(term1645, term1645.getClass(), "salePrice", 339854490);
        setIntField(term1672, term1672.getClass(), "year", 2013);
        setShortField(term1672, term1672.getClass(), "month", (short) 7);
        setShortField(term1672, term1672.getClass(), "day", (short) 26);
        setField(term1671, term1671.getClass(), "date", term1672);
        setByteField(term1676, term1676.getClass(), "hour", (byte) 14);
        setByteField(term1676, term1676.getClass(), "minute", (byte) 45);
        setByteField(term1676, term1676.getClass(), "second", (byte) 33);
        setIntField(term1676, term1676.getClass(), "nano", 547995853);
        setField(term1671, term1671.getClass(), "time", term1676);
        setField(term1645, term1645.getClass(), "saleStartDate", term1671);
        setIntField(term1682, term1682.getClass(), "year", 2016);
        setShortField(term1682, term1682.getClass(), "month", (short) 12);
        setShortField(term1682, term1682.getClass(), "day", (short) 20);
        setField(term1681, term1681.getClass(), "date", term1682);
        setByteField(term1686, term1686.getClass(), "hour", (byte) 8);
        setByteField(term1686, term1686.getClass(), "minute", (byte) 46);
        setByteField(term1686, term1686.getClass(), "second", (byte) 16);
        setIntField(term1686, term1686.getClass(), "nano", 10071864);
        setField(term1681, term1681.getClass(), "time", term1686);
        setField(term1645, term1645.getClass(), "saleEndDate", term1681);
        setField(term1645, term1645.getClass(), "remarks", "tbcdzjIfER");
        term1703 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1704 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1708 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1704, term1704.getClass(), "year", 2021);
        setShortField(term1704, term1704.getClass(), "month", (short) 8);
        setShortField(term1704, term1704.getClass(), "day", (short) 27);
        setField(term1703, term1703.getClass(), "date", term1704);
        setByteField(term1708, term1708.getClass(), "hour", (byte) 20);
        setByteField(term1708, term1708.getClass(), "minute", (byte) 11);
        setByteField(term1708, term1708.getClass(), "second", (byte) 47);
        setIntField(term1708, term1708.getClass(), "nano", 116303493);
        setField(term1703, term1703.getClass(), "time", term1708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1703;
        callMethod(klass, "setSaleStartDate", argTypes, term1645, args);
    }

};


