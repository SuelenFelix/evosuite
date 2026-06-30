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

public class GameCharge_getPrice_15097228823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term663;

    public GameCharge_getPrice_15097228823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term663 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term668 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term669 = newInstance(Class.forName("java.time.LocalDate"));
        Object term673 = newInstance(Class.forName("java.time.LocalTime"));
        Object term678 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term679 = newInstance(Class.forName("java.time.LocalDate"));
        Object term683 = newInstance(Class.forName("java.time.LocalTime"));
        Object term689 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term690 = newInstance(Class.forName("java.time.LocalDate"));
        Object term694 = newInstance(Class.forName("java.time.LocalTime"));
        Object term699 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term700 = newInstance(Class.forName("java.time.LocalDate"));
        Object term704 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term663, term663.getClass(), "id", -8400487765614892086L);
        setIntField(term663, term663.getClass(), "orderId", 1876565163);
        setIntField(term663, term663.getClass(), "chargeId", -817164822);
        setIntField(term663, term663.getClass(), "price", -1016503459);
        setIntField(term669, term669.getClass(), "year", 2020);
        setShortField(term669, term669.getClass(), "month", (short) 5);
        setShortField(term669, term669.getClass(), "day", (short) 18);
        setField(term668, term668.getClass(), "date", term669);
        setByteField(term673, term673.getClass(), "hour", (byte) 5);
        setByteField(term673, term673.getClass(), "minute", (byte) 46);
        setByteField(term673, term673.getClass(), "second", (byte) 13);
        setIntField(term673, term673.getClass(), "nano", 45893173);
        setField(term668, term668.getClass(), "time", term673);
        setField(term663, term663.getClass(), "startDate", term668);
        setIntField(term679, term679.getClass(), "year", 2017);
        setShortField(term679, term679.getClass(), "month", (short) 4);
        setShortField(term679, term679.getClass(), "day", (short) 3);
        setField(term678, term678.getClass(), "date", term679);
        setByteField(term683, term683.getClass(), "hour", (byte) 6);
        setByteField(term683, term683.getClass(), "minute", (byte) 51);
        setByteField(term683, term683.getClass(), "second", (byte) 10);
        setIntField(term683, term683.getClass(), "nano", 316377166);
        setField(term678, term678.getClass(), "time", term683);
        setField(term663, term663.getClass(), "endDate", term678);
        setIntField(term663, term663.getClass(), "salePrice", -1968847291);
        setIntField(term690, term690.getClass(), "year", 2027);
        setShortField(term690, term690.getClass(), "month", (short) 8);
        setShortField(term690, term690.getClass(), "day", (short) 23);
        setField(term689, term689.getClass(), "date", term690);
        setByteField(term694, term694.getClass(), "hour", (byte) 15);
        setByteField(term694, term694.getClass(), "minute", (byte) 12);
        setByteField(term694, term694.getClass(), "second", (byte) 6);
        setIntField(term694, term694.getClass(), "nano", 541218258);
        setField(term689, term689.getClass(), "time", term694);
        setField(term663, term663.getClass(), "saleStartDate", term689);
        setIntField(term700, term700.getClass(), "year", 2013);
        setShortField(term700, term700.getClass(), "month", (short) 5);
        setShortField(term700, term700.getClass(), "day", (short) 26);
        setField(term699, term699.getClass(), "date", term700);
        setByteField(term704, term704.getClass(), "hour", (byte) 4);
        setByteField(term704, term704.getClass(), "minute", (byte) 39);
        setByteField(term704, term704.getClass(), "second", (byte) 5);
        setIntField(term704, term704.getClass(), "nano", 392869354);
        setField(term699, term699.getClass(), "time", term704);
        setField(term663, term663.getClass(), "saleEndDate", term699);
        setField(term663, term663.getClass(), "remarks", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term663, args);
    }

};


