package space.gavinklfong.invest.forex.dtos;

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
import static space.gavinklfong.invest.forex.dtos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class ForexRateApiResp_setDate_15422325939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14368;
     Object term14408;

    public ForexRateApiResp_setDate_15422325939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14381 = new HashMap();
        term14368 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp"));
        Object term14404 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14368, term14368.getClass(), "id", "DSNsTGYXDF");
        setField(term14368, term14368.getClass(), "rates", term14381);
        setField(term14368, term14368.getClass(), "base", "rLHAoqXgPh");
        setIntField(term14404, term14404.getClass(), "year", 2022);
        setShortField(term14404, term14404.getClass(), "month", (short) 2);
        setShortField(term14404, term14404.getClass(), "day", (short) 25);
        setField(term14368, term14368.getClass(), "date", term14404);
        term14408 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term14408, term14408.getClass(), "year", 2017);
        setShortField(term14408, term14408.getClass(), "month", (short) 7);
        setShortField(term14408, term14408.getClass(), "day", (short) 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term14408;
        callMethod(klass, "setDate", argTypes, term14368, args);
    }

};


