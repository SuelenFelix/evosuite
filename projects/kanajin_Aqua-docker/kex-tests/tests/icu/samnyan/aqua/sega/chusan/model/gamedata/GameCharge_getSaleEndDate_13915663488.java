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

public class GameCharge_getSaleEndDate_13915663488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1003;

    public GameCharge_getSaleEndDate_13915663488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1003 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term1008 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1013 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1018 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1019 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1023 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1029 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1030 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1034 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1044 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1003, term1003.getClass(), "id", -7237588299778557629L);
        setIntField(term1003, term1003.getClass(), "orderId", 1225272962);
        setIntField(term1003, term1003.getClass(), "chargeId", 1324040357);
        setIntField(term1003, term1003.getClass(), "price", -1588772968);
        setIntField(term1009, term1009.getClass(), "year", 2028);
        setShortField(term1009, term1009.getClass(), "month", (short) 1);
        setShortField(term1009, term1009.getClass(), "day", (short) 18);
        setField(term1008, term1008.getClass(), "date", term1009);
        setByteField(term1013, term1013.getClass(), "hour", (byte) 12);
        setByteField(term1013, term1013.getClass(), "minute", (byte) 4);
        setByteField(term1013, term1013.getClass(), "second", (byte) 39);
        setIntField(term1013, term1013.getClass(), "nano", 651287093);
        setField(term1008, term1008.getClass(), "time", term1013);
        setField(term1003, term1003.getClass(), "startDate", term1008);
        setIntField(term1019, term1019.getClass(), "year", 2027);
        setShortField(term1019, term1019.getClass(), "month", (short) 7);
        setShortField(term1019, term1019.getClass(), "day", (short) 23);
        setField(term1018, term1018.getClass(), "date", term1019);
        setByteField(term1023, term1023.getClass(), "hour", (byte) 12);
        setByteField(term1023, term1023.getClass(), "minute", (byte) 6);
        setByteField(term1023, term1023.getClass(), "second", (byte) 19);
        setIntField(term1023, term1023.getClass(), "nano", 8025683);
        setField(term1018, term1018.getClass(), "time", term1023);
        setField(term1003, term1003.getClass(), "endDate", term1018);
        setIntField(term1003, term1003.getClass(), "salePrice", -93135961);
        setIntField(term1030, term1030.getClass(), "year", 2018);
        setShortField(term1030, term1030.getClass(), "month", (short) 2);
        setShortField(term1030, term1030.getClass(), "day", (short) 14);
        setField(term1029, term1029.getClass(), "date", term1030);
        setByteField(term1034, term1034.getClass(), "hour", (byte) 2);
        setByteField(term1034, term1034.getClass(), "minute", (byte) 40);
        setByteField(term1034, term1034.getClass(), "second", (byte) 48);
        setIntField(term1034, term1034.getClass(), "nano", 371006728);
        setField(term1029, term1029.getClass(), "time", term1034);
        setField(term1003, term1003.getClass(), "saleStartDate", term1029);
        setIntField(term1040, term1040.getClass(), "year", 2025);
        setShortField(term1040, term1040.getClass(), "month", (short) 8);
        setShortField(term1040, term1040.getClass(), "day", (short) 22);
        setField(term1039, term1039.getClass(), "date", term1040);
        setByteField(term1044, term1044.getClass(), "hour", (byte) 6);
        setByteField(term1044, term1044.getClass(), "minute", (byte) 48);
        setByteField(term1044, term1044.getClass(), "second", (byte) 49);
        setIntField(term1044, term1044.getClass(), "nano", 46400229);
        setField(term1039, term1039.getClass(), "time", term1044);
        setField(term1003, term1003.getClass(), "saleEndDate", term1039);
        setField(term1003, term1003.getClass(), "remarks", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSaleEndDate", argTypes, term1003, args);
    }

};


