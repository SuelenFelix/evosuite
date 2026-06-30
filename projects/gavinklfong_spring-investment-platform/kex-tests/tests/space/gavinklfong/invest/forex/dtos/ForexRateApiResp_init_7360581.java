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
import java.util.LinkedHashMap;

public class ForexRateApiResp_init_7360581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13844;
     Object term13848;

    public ForexRateApiResp_init_7360581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13844 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term13844, term13844.getClass(), "year", 2012);
        setShortField(term13844, term13844.getClass(), "month", (short) 8);
        setShortField(term13844, term13844.getClass(), "day", (short) 25);
        term13848 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.time.LocalDate");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = "pXOkjyeIRb";
        args[1] = term13844;
        args[2] = term13848;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


