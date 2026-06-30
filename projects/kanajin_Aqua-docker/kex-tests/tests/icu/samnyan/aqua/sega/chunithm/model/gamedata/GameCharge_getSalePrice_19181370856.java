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

public class GameCharge_getSalePrice_19181370856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735;

    public GameCharge_getSalePrice_19181370856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term735 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term740 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term741 = newInstance(Class.forName("java.time.LocalDate"));
        Object term745 = newInstance(Class.forName("java.time.LocalTime"));
        Object term750 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term751 = newInstance(Class.forName("java.time.LocalDate"));
        Object term755 = newInstance(Class.forName("java.time.LocalTime"));
        Object term761 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term762 = newInstance(Class.forName("java.time.LocalDate"));
        Object term766 = newInstance(Class.forName("java.time.LocalTime"));
        Object term771 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term772 = newInstance(Class.forName("java.time.LocalDate"));
        Object term776 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term735, term735.getClass(), "id", 4872422362414183754L);
        setIntField(term735, term735.getClass(), "orderId", 458147407);
        setIntField(term735, term735.getClass(), "chargeId", -184153539);
        setIntField(term735, term735.getClass(), "price", 493620644);
        setIntField(term741, term741.getClass(), "year", 2022);
        setShortField(term741, term741.getClass(), "month", (short) 6);
        setShortField(term741, term741.getClass(), "day", (short) 20);
        setField(term740, term740.getClass(), "date", term741);
        setByteField(term745, term745.getClass(), "hour", (byte) 7);
        setByteField(term745, term745.getClass(), "minute", (byte) 57);
        setByteField(term745, term745.getClass(), "second", (byte) 37);
        setIntField(term745, term745.getClass(), "nano", 90374877);
        setField(term740, term740.getClass(), "time", term745);
        setField(term735, term735.getClass(), "startDate", term740);
        setIntField(term751, term751.getClass(), "year", 2023);
        setShortField(term751, term751.getClass(), "month", (short) 2);
        setShortField(term751, term751.getClass(), "day", (short) 16);
        setField(term750, term750.getClass(), "date", term751);
        setByteField(term755, term755.getClass(), "hour", (byte) 3);
        setByteField(term755, term755.getClass(), "minute", (byte) 18);
        setByteField(term755, term755.getClass(), "second", (byte) 56);
        setIntField(term755, term755.getClass(), "nano", 733017887);
        setField(term750, term750.getClass(), "time", term755);
        setField(term735, term735.getClass(), "endDate", term750);
        setIntField(term735, term735.getClass(), "salePrice", 1328271830);
        setIntField(term762, term762.getClass(), "year", 2025);
        setShortField(term762, term762.getClass(), "month", (short) 3);
        setShortField(term762, term762.getClass(), "day", (short) 28);
        setField(term761, term761.getClass(), "date", term762);
        setByteField(term766, term766.getClass(), "hour", (byte) 19);
        setByteField(term766, term766.getClass(), "minute", (byte) 56);
        setByteField(term766, term766.getClass(), "second", (byte) 52);
        setIntField(term766, term766.getClass(), "nano", 738558930);
        setField(term761, term761.getClass(), "time", term766);
        setField(term735, term735.getClass(), "saleStartDate", term761);
        setIntField(term772, term772.getClass(), "year", 2024);
        setShortField(term772, term772.getClass(), "month", (short) 2);
        setShortField(term772, term772.getClass(), "day", (short) 29);
        setField(term771, term771.getClass(), "date", term772);
        setByteField(term776, term776.getClass(), "hour", (byte) 17);
        setByteField(term776, term776.getClass(), "minute", (byte) 54);
        setByteField(term776, term776.getClass(), "second", (byte) 21);
        setIntField(term776, term776.getClass(), "nano", 605973408);
        setField(term771, term771.getClass(), "time", term776);
        setField(term735, term735.getClass(), "saleEndDate", term771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSalePrice", argTypes, term735, args);
    }

};


