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

public class GameCharge_getId_7124682560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term459;

    public GameCharge_getId_7124682560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term459 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term469 = newInstance(Class.forName("java.time.LocalTime"));
        Object term474 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term475 = newInstance(Class.forName("java.time.LocalDate"));
        Object term479 = newInstance(Class.forName("java.time.LocalTime"));
        Object term485 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term486 = newInstance(Class.forName("java.time.LocalDate"));
        Object term490 = newInstance(Class.forName("java.time.LocalTime"));
        Object term495 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term496 = newInstance(Class.forName("java.time.LocalDate"));
        Object term500 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term459, term459.getClass(), "id", 2442117782898005296L);
        setIntField(term459, term459.getClass(), "orderId", -73683645);
        setIntField(term459, term459.getClass(), "chargeId", -226514366);
        setIntField(term459, term459.getClass(), "price", 1193880199);
        setIntField(term465, term465.getClass(), "year", 2012);
        setShortField(term465, term465.getClass(), "month", (short) 3);
        setShortField(term465, term465.getClass(), "day", (short) 27);
        setField(term464, term464.getClass(), "date", term465);
        setByteField(term469, term469.getClass(), "hour", (byte) 17);
        setByteField(term469, term469.getClass(), "minute", (byte) 49);
        setByteField(term469, term469.getClass(), "second", (byte) 24);
        setIntField(term469, term469.getClass(), "nano", 530647398);
        setField(term464, term464.getClass(), "time", term469);
        setField(term459, term459.getClass(), "startDate", term464);
        setIntField(term475, term475.getClass(), "year", 2010);
        setShortField(term475, term475.getClass(), "month", (short) 6);
        setShortField(term475, term475.getClass(), "day", (short) 14);
        setField(term474, term474.getClass(), "date", term475);
        setByteField(term479, term479.getClass(), "hour", (byte) 6);
        setByteField(term479, term479.getClass(), "minute", (byte) 22);
        setByteField(term479, term479.getClass(), "second", (byte) 20);
        setIntField(term479, term479.getClass(), "nano", 25133051);
        setField(term474, term474.getClass(), "time", term479);
        setField(term459, term459.getClass(), "endDate", term474);
        setIntField(term459, term459.getClass(), "salePrice", -1087774327);
        setIntField(term486, term486.getClass(), "year", 2010);
        setShortField(term486, term486.getClass(), "month", (short) 5);
        setShortField(term486, term486.getClass(), "day", (short) 2);
        setField(term485, term485.getClass(), "date", term486);
        setByteField(term490, term490.getClass(), "hour", (byte) 2);
        setByteField(term490, term490.getClass(), "minute", (byte) 22);
        setByteField(term490, term490.getClass(), "second", (byte) 33);
        setIntField(term490, term490.getClass(), "nano", 530835039);
        setField(term485, term485.getClass(), "time", term490);
        setField(term459, term459.getClass(), "saleStartDate", term485);
        setIntField(term496, term496.getClass(), "year", 2024);
        setShortField(term496, term496.getClass(), "month", (short) 4);
        setShortField(term496, term496.getClass(), "day", (short) 24);
        setField(term495, term495.getClass(), "date", term496);
        setByteField(term500, term500.getClass(), "hour", (byte) 7);
        setByteField(term500, term500.getClass(), "minute", (byte) 2);
        setByteField(term500, term500.getClass(), "second", (byte) 51);
        setIntField(term500, term500.getClass(), "nano", 635502964);
        setField(term495, term495.getClass(), "time", term500);
        setField(term459, term459.getClass(), "saleEndDate", term495);
        setField(term459, term459.getClass(), "remarks", "PAEBtnZtTD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term459, args);
    }

};


