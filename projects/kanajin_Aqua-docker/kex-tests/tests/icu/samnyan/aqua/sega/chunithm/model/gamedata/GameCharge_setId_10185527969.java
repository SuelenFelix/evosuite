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
import java.lang.Long;

public class GameCharge_setId_10185527969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term873;
     Object term919;

    public GameCharge_setId_10185527969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term873 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term878 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term879 = newInstance(Class.forName("java.time.LocalDate"));
        Object term883 = newInstance(Class.forName("java.time.LocalTime"));
        Object term888 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term889 = newInstance(Class.forName("java.time.LocalDate"));
        Object term893 = newInstance(Class.forName("java.time.LocalTime"));
        Object term899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term904 = newInstance(Class.forName("java.time.LocalTime"));
        Object term909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term914 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term873, term873.getClass(), "id", 6967924379644551255L);
        setIntField(term873, term873.getClass(), "orderId", -112921587);
        setIntField(term873, term873.getClass(), "chargeId", 933028652);
        setIntField(term873, term873.getClass(), "price", 287287233);
        setIntField(term879, term879.getClass(), "year", 2028);
        setShortField(term879, term879.getClass(), "month", (short) 4);
        setShortField(term879, term879.getClass(), "day", (short) 1);
        setField(term878, term878.getClass(), "date", term879);
        setByteField(term883, term883.getClass(), "hour", (byte) 16);
        setByteField(term883, term883.getClass(), "minute", (byte) 22);
        setByteField(term883, term883.getClass(), "second", (byte) 32);
        setIntField(term883, term883.getClass(), "nano", 406353763);
        setField(term878, term878.getClass(), "time", term883);
        setField(term873, term873.getClass(), "startDate", term878);
        setIntField(term889, term889.getClass(), "year", 2019);
        setShortField(term889, term889.getClass(), "month", (short) 7);
        setShortField(term889, term889.getClass(), "day", (short) 19);
        setField(term888, term888.getClass(), "date", term889);
        setByteField(term893, term893.getClass(), "hour", (byte) 10);
        setByteField(term893, term893.getClass(), "minute", (byte) 54);
        setByteField(term893, term893.getClass(), "second", (byte) 55);
        setIntField(term893, term893.getClass(), "nano", 244650454);
        setField(term888, term888.getClass(), "time", term893);
        setField(term873, term873.getClass(), "endDate", term888);
        setIntField(term873, term873.getClass(), "salePrice", 962840079);
        setIntField(term900, term900.getClass(), "year", 2022);
        setShortField(term900, term900.getClass(), "month", (short) 4);
        setShortField(term900, term900.getClass(), "day", (short) 15);
        setField(term899, term899.getClass(), "date", term900);
        setByteField(term904, term904.getClass(), "hour", (byte) 20);
        setByteField(term904, term904.getClass(), "minute", (byte) 58);
        setByteField(term904, term904.getClass(), "second", (byte) 46);
        setIntField(term904, term904.getClass(), "nano", 435562727);
        setField(term899, term899.getClass(), "time", term904);
        setField(term873, term873.getClass(), "saleStartDate", term899);
        setIntField(term910, term910.getClass(), "year", 2026);
        setShortField(term910, term910.getClass(), "month", (short) 10);
        setShortField(term910, term910.getClass(), "day", (short) 31);
        setField(term909, term909.getClass(), "date", term910);
        setByteField(term914, term914.getClass(), "hour", (byte) 17);
        setByteField(term914, term914.getClass(), "minute", (byte) 6);
        setByteField(term914, term914.getClass(), "second", (byte) 30);
        setIntField(term914, term914.getClass(), "nano", 785931660);
        setField(term909, term909.getClass(), "time", term914);
        setField(term873, term873.getClass(), "saleEndDate", term909);
        term919 = new Long(-2813493605142626659L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term919;
        callMethod(klass, "setId", argTypes, term873, args);
    }

};


