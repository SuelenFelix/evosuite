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

public class GameCharge_getSaleStartDate_2498264137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term935;

    public GameCharge_getSaleStartDate_2498264137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term935 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term940 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term941 = newInstance(Class.forName("java.time.LocalDate"));
        Object term945 = newInstance(Class.forName("java.time.LocalTime"));
        Object term950 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term951 = newInstance(Class.forName("java.time.LocalDate"));
        Object term955 = newInstance(Class.forName("java.time.LocalTime"));
        Object term961 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term962 = newInstance(Class.forName("java.time.LocalDate"));
        Object term966 = newInstance(Class.forName("java.time.LocalTime"));
        Object term971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term976 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term935, term935.getClass(), "id", 6811161968424632369L);
        setIntField(term935, term935.getClass(), "orderId", 1596070772);
        setIntField(term935, term935.getClass(), "chargeId", 97029295);
        setIntField(term935, term935.getClass(), "price", -1371869594);
        setIntField(term941, term941.getClass(), "year", 2016);
        setShortField(term941, term941.getClass(), "month", (short) 2);
        setShortField(term941, term941.getClass(), "day", (short) 25);
        setField(term940, term940.getClass(), "date", term941);
        setByteField(term945, term945.getClass(), "hour", (byte) 8);
        setByteField(term945, term945.getClass(), "minute", (byte) 54);
        setByteField(term945, term945.getClass(), "second", (byte) 40);
        setIntField(term945, term945.getClass(), "nano", 124525896);
        setField(term940, term940.getClass(), "time", term945);
        setField(term935, term935.getClass(), "startDate", term940);
        setIntField(term951, term951.getClass(), "year", 2029);
        setShortField(term951, term951.getClass(), "month", (short) 1);
        setShortField(term951, term951.getClass(), "day", (short) 10);
        setField(term950, term950.getClass(), "date", term951);
        setByteField(term955, term955.getClass(), "hour", (byte) 8);
        setByteField(term955, term955.getClass(), "minute", (byte) 46);
        setByteField(term955, term955.getClass(), "second", (byte) 35);
        setIntField(term955, term955.getClass(), "nano", 58807194);
        setField(term950, term950.getClass(), "time", term955);
        setField(term935, term935.getClass(), "endDate", term950);
        setIntField(term935, term935.getClass(), "salePrice", -2095575670);
        setIntField(term962, term962.getClass(), "year", 2016);
        setShortField(term962, term962.getClass(), "month", (short) 10);
        setShortField(term962, term962.getClass(), "day", (short) 20);
        setField(term961, term961.getClass(), "date", term962);
        setByteField(term966, term966.getClass(), "hour", (byte) 18);
        setByteField(term966, term966.getClass(), "minute", (byte) 39);
        setByteField(term966, term966.getClass(), "second", (byte) 1);
        setIntField(term966, term966.getClass(), "nano", 196253988);
        setField(term961, term961.getClass(), "time", term966);
        setField(term935, term935.getClass(), "saleStartDate", term961);
        setIntField(term972, term972.getClass(), "year", 2019);
        setShortField(term972, term972.getClass(), "month", (short) 1);
        setShortField(term972, term972.getClass(), "day", (short) 6);
        setField(term971, term971.getClass(), "date", term972);
        setByteField(term976, term976.getClass(), "hour", (byte) 18);
        setByteField(term976, term976.getClass(), "minute", (byte) 8);
        setByteField(term976, term976.getClass(), "second", (byte) 46);
        setIntField(term976, term976.getClass(), "nano", 934136445);
        setField(term971, term971.getClass(), "time", term976);
        setField(term935, term935.getClass(), "saleEndDate", term971);
        setField(term935, term935.getClass(), "remarks", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSaleStartDate", argTypes, term935, args);
    }

};


