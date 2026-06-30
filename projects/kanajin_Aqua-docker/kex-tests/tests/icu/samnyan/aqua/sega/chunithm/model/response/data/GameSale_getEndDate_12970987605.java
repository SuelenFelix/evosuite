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

public class GameSale_getEndDate_12970987605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;

    public GameSale_getEndDate_12970987605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term131 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term126, term126.getClass(), "orderId", -655067527);
        setIntField(term126, term126.getClass(), "type", -6029667);
        setIntField(term126, term126.getClass(), "id", -2068769794);
        setIntField(term126, term126.getClass(), "rate", -117576464);
        setIntField(term132, term132.getClass(), "year", 2019);
        setShortField(term132, term132.getClass(), "month", (short) 2);
        setShortField(term132, term132.getClass(), "day", (short) 21);
        setField(term131, term131.getClass(), "date", term132);
        setByteField(term136, term136.getClass(), "hour", (byte) 5);
        setByteField(term136, term136.getClass(), "minute", (byte) 41);
        setByteField(term136, term136.getClass(), "second", (byte) 11);
        setIntField(term136, term136.getClass(), "nano", 859829782);
        setField(term131, term131.getClass(), "time", term136);
        setField(term126, term126.getClass(), "startDate", term131);
        setIntField(term142, term142.getClass(), "year", 2018);
        setShortField(term142, term142.getClass(), "month", (short) 9);
        setShortField(term142, term142.getClass(), "day", (short) 28);
        setField(term141, term141.getClass(), "date", term142);
        setByteField(term146, term146.getClass(), "hour", (byte) 3);
        setByteField(term146, term146.getClass(), "minute", (byte) 37);
        setByteField(term146, term146.getClass(), "second", (byte) 46);
        setIntField(term146, term146.getClass(), "nano", 763326845);
        setField(term141, term141.getClass(), "time", term146);
        setField(term126, term126.getClass(), "endDate", term141);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term126, args);
    }

};


