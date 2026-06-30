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

public class GameCharge_getStartDate_3995311744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term731;

    public GameCharge_getStartDate_3995311744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term731 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term736 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term737 = newInstance(Class.forName("java.time.LocalDate"));
        Object term741 = newInstance(Class.forName("java.time.LocalTime"));
        Object term746 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term747 = newInstance(Class.forName("java.time.LocalDate"));
        Object term751 = newInstance(Class.forName("java.time.LocalTime"));
        Object term757 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term758 = newInstance(Class.forName("java.time.LocalDate"));
        Object term762 = newInstance(Class.forName("java.time.LocalTime"));
        Object term767 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term768 = newInstance(Class.forName("java.time.LocalDate"));
        Object term772 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term731, term731.getClass(), "id", 5270370404989704783L);
        setIntField(term731, term731.getClass(), "orderId", 579005622);
        setIntField(term731, term731.getClass(), "chargeId", -14890619);
        setIntField(term731, term731.getClass(), "price", 1632125673);
        setIntField(term737, term737.getClass(), "year", 2012);
        setShortField(term737, term737.getClass(), "month", (short) 4);
        setShortField(term737, term737.getClass(), "day", (short) 25);
        setField(term736, term736.getClass(), "date", term737);
        setByteField(term741, term741.getClass(), "hour", (byte) 21);
        setByteField(term741, term741.getClass(), "minute", (byte) 14);
        setByteField(term741, term741.getClass(), "second", (byte) 15);
        setIntField(term741, term741.getClass(), "nano", 561700934);
        setField(term736, term736.getClass(), "time", term741);
        setField(term731, term731.getClass(), "startDate", term736);
        setIntField(term747, term747.getClass(), "year", 2011);
        setShortField(term747, term747.getClass(), "month", (short) 10);
        setShortField(term747, term747.getClass(), "day", (short) 25);
        setField(term746, term746.getClass(), "date", term747);
        setByteField(term751, term751.getClass(), "hour", (byte) 10);
        setByteField(term751, term751.getClass(), "minute", (byte) 33);
        setByteField(term751, term751.getClass(), "second", (byte) 8);
        setIntField(term751, term751.getClass(), "nano", 268304014);
        setField(term746, term746.getClass(), "time", term751);
        setField(term731, term731.getClass(), "endDate", term746);
        setIntField(term731, term731.getClass(), "salePrice", 454281060);
        setIntField(term758, term758.getClass(), "year", 2024);
        setShortField(term758, term758.getClass(), "month", (short) 5);
        setShortField(term758, term758.getClass(), "day", (short) 6);
        setField(term757, term757.getClass(), "date", term758);
        setByteField(term762, term762.getClass(), "hour", (byte) 20);
        setByteField(term762, term762.getClass(), "minute", (byte) 14);
        setByteField(term762, term762.getClass(), "second", (byte) 27);
        setIntField(term762, term762.getClass(), "nano", 900636101);
        setField(term757, term757.getClass(), "time", term762);
        setField(term731, term731.getClass(), "saleStartDate", term757);
        setIntField(term768, term768.getClass(), "year", 2021);
        setShortField(term768, term768.getClass(), "month", (short) 4);
        setShortField(term768, term768.getClass(), "day", (short) 17);
        setField(term767, term767.getClass(), "date", term768);
        setByteField(term772, term772.getClass(), "hour", (byte) 4);
        setByteField(term772, term772.getClass(), "minute", (byte) 11);
        setByteField(term772, term772.getClass(), "second", (byte) 16);
        setIntField(term772, term772.getClass(), "nano", 509895858);
        setField(term767, term767.getClass(), "time", term772);
        setField(term731, term731.getClass(), "saleEndDate", term767);
        setField(term731, term731.getClass(), "remarks", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term731, args);
    }

};


