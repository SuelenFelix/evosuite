package data.source.external.financialdatavendors.alphavantage;

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
import static data.source.external.financialdatavendors.alphavantage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TimeSeriesRequestIdAlphaVantage_getTimeSeriesId_962323813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28271;

    public TimeSeriesRequestIdAlphaVantage_getTimeSeriesId_962323813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28365 = Class.forName((String) "data.source.external.financialdatavendors.alphavantage.parameters.functions.Function");
        Field term28364 = ((Class) term28365).getDeclaredField((String) "DX");
        ((Field) term28364).setAccessible(true);
        Object enum43 = ((Field) term28364).get((Object) null);
        term28271 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage"));
        setField(term28271, term28271.getClass(), "SOURCE", "UlajhuVLaP");
        setField(term28271, term28271.getClass(), "timeSeriesId", null);
        setField(term28271, term28271.getClass(), "tsp", null);
        setField(term28271, term28271.getClass(), "exchange", enum43);
        setField(term28271, term28271.getClass(), "ticker", "gGSMzuGICf");
        setField(term28271, term28271.getClass(), "id", "hxCBltsObl");
        setField(term28271, term28271.getClass(), "startTime", "BndsHwAFMv");
        setField(term28271, term28271.getClass(), "endTime", "GzFkzHGYFt");
        setField(term28271, term28271.getClass(), "interval", "tShwQLRGNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeSeriesId", argTypes, term28271, args);
    }

};


