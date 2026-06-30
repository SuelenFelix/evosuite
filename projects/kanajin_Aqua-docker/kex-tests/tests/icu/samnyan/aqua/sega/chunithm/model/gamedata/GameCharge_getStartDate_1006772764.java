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

public class GameCharge_getStartDate_1006772764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term643;

    public GameCharge_getStartDate_1006772764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term643 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term648 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term649 = newInstance(Class.forName("java.time.LocalDate"));
        Object term653 = newInstance(Class.forName("java.time.LocalTime"));
        Object term658 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term659 = newInstance(Class.forName("java.time.LocalDate"));
        Object term663 = newInstance(Class.forName("java.time.LocalTime"));
        Object term669 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term670 = newInstance(Class.forName("java.time.LocalDate"));
        Object term674 = newInstance(Class.forName("java.time.LocalTime"));
        Object term679 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term680 = newInstance(Class.forName("java.time.LocalDate"));
        Object term684 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term643, term643.getClass(), "id", 5270370404989704783L);
        setIntField(term643, term643.getClass(), "orderId", 579005622);
        setIntField(term643, term643.getClass(), "chargeId", -14890619);
        setIntField(term643, term643.getClass(), "price", 1632125673);
        setIntField(term649, term649.getClass(), "year", 2012);
        setShortField(term649, term649.getClass(), "month", (short) 4);
        setShortField(term649, term649.getClass(), "day", (short) 25);
        setField(term648, term648.getClass(), "date", term649);
        setByteField(term653, term653.getClass(), "hour", (byte) 21);
        setByteField(term653, term653.getClass(), "minute", (byte) 14);
        setByteField(term653, term653.getClass(), "second", (byte) 15);
        setIntField(term653, term653.getClass(), "nano", 561700934);
        setField(term648, term648.getClass(), "time", term653);
        setField(term643, term643.getClass(), "startDate", term648);
        setIntField(term659, term659.getClass(), "year", 2011);
        setShortField(term659, term659.getClass(), "month", (short) 10);
        setShortField(term659, term659.getClass(), "day", (short) 25);
        setField(term658, term658.getClass(), "date", term659);
        setByteField(term663, term663.getClass(), "hour", (byte) 10);
        setByteField(term663, term663.getClass(), "minute", (byte) 33);
        setByteField(term663, term663.getClass(), "second", (byte) 8);
        setIntField(term663, term663.getClass(), "nano", 268304014);
        setField(term658, term658.getClass(), "time", term663);
        setField(term643, term643.getClass(), "endDate", term658);
        setIntField(term643, term643.getClass(), "salePrice", 454281060);
        setIntField(term670, term670.getClass(), "year", 2024);
        setShortField(term670, term670.getClass(), "month", (short) 5);
        setShortField(term670, term670.getClass(), "day", (short) 6);
        setField(term669, term669.getClass(), "date", term670);
        setByteField(term674, term674.getClass(), "hour", (byte) 20);
        setByteField(term674, term674.getClass(), "minute", (byte) 14);
        setByteField(term674, term674.getClass(), "second", (byte) 27);
        setIntField(term674, term674.getClass(), "nano", 900636101);
        setField(term669, term669.getClass(), "time", term674);
        setField(term643, term643.getClass(), "saleStartDate", term669);
        setIntField(term680, term680.getClass(), "year", 2021);
        setShortField(term680, term680.getClass(), "month", (short) 4);
        setShortField(term680, term680.getClass(), "day", (short) 17);
        setField(term679, term679.getClass(), "date", term680);
        setByteField(term684, term684.getClass(), "hour", (byte) 4);
        setByteField(term684, term684.getClass(), "minute", (byte) 11);
        setByteField(term684, term684.getClass(), "second", (byte) 16);
        setIntField(term684, term684.getClass(), "nano", 509895858);
        setField(term679, term679.getClass(), "time", term684);
        setField(term643, term643.getClass(), "saleEndDate", term679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term643, args);
    }

};


