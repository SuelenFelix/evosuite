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

public class ForexRateApiResp_getBase_19076521234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14001;

    public ForexRateApiResp_getBase_19076521234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14014 = new HashMap();
        term14001 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp"));
        Object term14037 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14001, term14001.getClass(), "id", "ZfdXfCCFDf");
        setField(term14001, term14001.getClass(), "rates", term14014);
        setField(term14001, term14001.getClass(), "base", "VYkqXKVlAJ");
        setIntField(term14037, term14037.getClass(), "year", 2020);
        setShortField(term14037, term14037.getClass(), "month", (short) 11);
        setShortField(term14037, term14037.getClass(), "day", (short) 22);
        setField(term14001, term14001.getClass(), "date", term14037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBase", argTypes, term14001, args);
    }

};


