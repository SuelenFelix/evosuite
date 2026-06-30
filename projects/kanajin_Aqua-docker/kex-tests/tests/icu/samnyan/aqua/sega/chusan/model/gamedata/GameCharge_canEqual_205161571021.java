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

public class GameCharge_canEqual_205161571021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1960;
     Object term2018;

    public GameCharge_canEqual_205161571021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1960 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term1965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1966 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1970 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1975 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1976 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1980 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1986 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1987 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1991 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1996 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1997 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2001 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1960, term1960.getClass(), "id", 8059786003080744426L);
        setIntField(term1960, term1960.getClass(), "orderId", 1386130016);
        setIntField(term1960, term1960.getClass(), "chargeId", 1072005683);
        setIntField(term1960, term1960.getClass(), "price", 1861318859);
        setIntField(term1966, term1966.getClass(), "year", 2026);
        setShortField(term1966, term1966.getClass(), "month", (short) 6);
        setShortField(term1966, term1966.getClass(), "day", (short) 13);
        setField(term1965, term1965.getClass(), "date", term1966);
        setByteField(term1970, term1970.getClass(), "hour", (byte) 19);
        setByteField(term1970, term1970.getClass(), "minute", (byte) 23);
        setByteField(term1970, term1970.getClass(), "second", (byte) 46);
        setIntField(term1970, term1970.getClass(), "nano", 67955056);
        setField(term1965, term1965.getClass(), "time", term1970);
        setField(term1960, term1960.getClass(), "startDate", term1965);
        setIntField(term1976, term1976.getClass(), "year", 2013);
        setShortField(term1976, term1976.getClass(), "month", (short) 12);
        setShortField(term1976, term1976.getClass(), "day", (short) 23);
        setField(term1975, term1975.getClass(), "date", term1976);
        setByteField(term1980, term1980.getClass(), "hour", (byte) 1);
        setByteField(term1980, term1980.getClass(), "minute", (byte) 0);
        setByteField(term1980, term1980.getClass(), "second", (byte) 32);
        setIntField(term1980, term1980.getClass(), "nano", 168525686);
        setField(term1975, term1975.getClass(), "time", term1980);
        setField(term1960, term1960.getClass(), "endDate", term1975);
        setIntField(term1960, term1960.getClass(), "salePrice", 1474524152);
        setIntField(term1987, term1987.getClass(), "year", 2014);
        setShortField(term1987, term1987.getClass(), "month", (short) 1);
        setShortField(term1987, term1987.getClass(), "day", (short) 26);
        setField(term1986, term1986.getClass(), "date", term1987);
        setByteField(term1991, term1991.getClass(), "hour", (byte) 3);
        setByteField(term1991, term1991.getClass(), "minute", (byte) 31);
        setByteField(term1991, term1991.getClass(), "second", (byte) 56);
        setIntField(term1991, term1991.getClass(), "nano", 100873602);
        setField(term1986, term1986.getClass(), "time", term1991);
        setField(term1960, term1960.getClass(), "saleStartDate", term1986);
        setIntField(term1997, term1997.getClass(), "year", 2021);
        setShortField(term1997, term1997.getClass(), "month", (short) 12);
        setShortField(term1997, term1997.getClass(), "day", (short) 1);
        setField(term1996, term1996.getClass(), "date", term1997);
        setByteField(term2001, term2001.getClass(), "hour", (byte) 15);
        setByteField(term2001, term2001.getClass(), "minute", (byte) 30);
        setByteField(term2001, term2001.getClass(), "second", (byte) 5);
        setIntField(term2001, term2001.getClass(), "nano", 996341606);
        setField(term1996, term1996.getClass(), "time", term2001);
        setField(term1960, term1960.getClass(), "saleEndDate", term1996);
        setField(term1960, term1960.getClass(), "remarks", "xOEqzGAmDU");
        term2018 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2018;
        callMethod(klass, "canEqual", argTypes, term1960, args);
    }

};


