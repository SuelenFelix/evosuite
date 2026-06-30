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
import java.util.LinkedHashMap;

public class ForexRateApiResp_setRates_10679451267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14203;
     Object term14243;

    public ForexRateApiResp_setRates_10679451267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14216 = new HashMap();
        term14203 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp"));
        Object term14239 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14203, term14203.getClass(), "id", "aWYOWZFyaX");
        setField(term14203, term14203.getClass(), "rates", term14216);
        setField(term14203, term14203.getClass(), "base", "DbiCVtPPCT");
        setIntField(term14239, term14239.getClass(), "year", 2015);
        setShortField(term14239, term14239.getClass(), "month", (short) 4);
        setShortField(term14239, term14239.getClass(), "day", (short) 14);
        setField(term14203, term14203.getClass(), "date", term14239);
        term14243 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term14243;
        callMethod(klass, "setRates", argTypes, term14203, args);
    }

};


