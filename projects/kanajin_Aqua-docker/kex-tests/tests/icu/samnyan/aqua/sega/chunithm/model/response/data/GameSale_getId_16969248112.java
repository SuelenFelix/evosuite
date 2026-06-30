package icu.samnyan.aqua.sega.chunithm.model.response.data;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameSale_getId_16969248112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;

    public GameSale_getId_16969248112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term56 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51, term51.getClass(), "orderId", 1227103734);
        setIntField(term51, term51.getClass(), "type", -1339778481);
        setIntField(term51, term51.getClass(), "id", 1725571209);
        setIntField(term51, term51.getClass(), "rate", -522618178);
        setIntField(term57, term57.getClass(), "year", 2022);
        setShortField(term57, term57.getClass(), "month", (short) 2);
        setShortField(term57, term57.getClass(), "day", (short) 26);
        setField(term56, term56.getClass(), "date", term57);
        setByteField(term61, term61.getClass(), "hour", (byte) 11);
        setByteField(term61, term61.getClass(), "minute", (byte) 42);
        setByteField(term61, term61.getClass(), "second", (byte) 15);
        setIntField(term61, term61.getClass(), "nano", 377731937);
        setField(term56, term56.getClass(), "time", term61);
        setField(term51, term51.getClass(), "startDate", term56);
        setIntField(term67, term67.getClass(), "year", 2026);
        setShortField(term67, term67.getClass(), "month", (short) 12);
        setShortField(term67, term67.getClass(), "day", (short) 14);
        setField(term66, term66.getClass(), "date", term67);
        setByteField(term71, term71.getClass(), "hour", (byte) 16);
        setByteField(term71, term71.getClass(), "minute", (byte) 34);
        setByteField(term71, term71.getClass(), "second", (byte) 9);
        setIntField(term71, term71.getClass(), "nano", 518326996);
        setField(term66, term66.getClass(), "time", term71);
        setField(term51, term51.getClass(), "endDate", term66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term51, args);
    }

};


