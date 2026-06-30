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

public class ForexRateApiResp_getRates_17744365683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13941;

    public ForexRateApiResp_getRates_17744365683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13954 = new HashMap();
        term13941 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp"));
        Object term13977 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13941, term13941.getClass(), "id", "WHcwFgsGFC");
        setField(term13941, term13941.getClass(), "rates", term13954);
        setField(term13941, term13941.getClass(), "base", "jwsfVjMoJT");
        setIntField(term13977, term13977.getClass(), "year", 2021);
        setShortField(term13977, term13977.getClass(), "month", (short) 1);
        setShortField(term13977, term13977.getClass(), "day", (short) 18);
        setField(term13941, term13941.getClass(), "date", term13977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRates", argTypes, term13941, args);
    }

};


