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
import java.lang.Integer;

public class GameSale_setRate_10745514289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232;
     Object term257;

    public GameSale_setRate_10745514289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term242 = newInstance(Class.forName("java.time.LocalTime"));
        Object term247 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term252 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term232, term232.getClass(), "orderId", 679763016);
        setIntField(term232, term232.getClass(), "type", 1962444399);
        setIntField(term232, term232.getClass(), "id", 767834723);
        setIntField(term232, term232.getClass(), "rate", -602026508);
        setIntField(term238, term238.getClass(), "year", 2017);
        setShortField(term238, term238.getClass(), "month", (short) 3);
        setShortField(term238, term238.getClass(), "day", (short) 5);
        setField(term237, term237.getClass(), "date", term238);
        setByteField(term242, term242.getClass(), "hour", (byte) 20);
        setByteField(term242, term242.getClass(), "minute", (byte) 34);
        setByteField(term242, term242.getClass(), "second", (byte) 55);
        setIntField(term242, term242.getClass(), "nano", 78024496);
        setField(term237, term237.getClass(), "time", term242);
        setField(term232, term232.getClass(), "startDate", term237);
        setIntField(term248, term248.getClass(), "year", 2020);
        setShortField(term248, term248.getClass(), "month", (short) 7);
        setShortField(term248, term248.getClass(), "day", (short) 24);
        setField(term247, term247.getClass(), "date", term248);
        setByteField(term252, term252.getClass(), "hour", (byte) 0);
        setByteField(term252, term252.getClass(), "minute", (byte) 59);
        setByteField(term252, term252.getClass(), "second", (byte) 56);
        setIntField(term252, term252.getClass(), "nano", 320219201);
        setField(term247, term247.getClass(), "time", term252);
        setField(term232, term232.getClass(), "endDate", term247);
        term257 = new Integer(-157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term257;
        callMethod(klass, "setRate", argTypes, term232, args);
    }

};


