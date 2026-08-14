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

public class TimeSeriesRequestIdAlphaVantage_getStartTime_5776551826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30214;

    public TimeSeriesRequestIdAlphaVantage_getStartTime_5776551826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30314 = Class.forName((String) "data.source.external.financialdatavendors.alphavantage.parameters.functions.Function");
        Field term30313 = ((Class) term30314).getDeclaredField((String) "AROON");
        ((Field) term30313).setAccessible(true);
        Object enum46 = ((Field) term30313).get((Object) null);
        term30214 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage"));
        setField(term30214, term30214.getClass(), "SOURCE", "nHXjMycHlU");
        setField(term30214, term30214.getClass(), "timeSeriesId", null);
        setField(term30214, term30214.getClass(), "tsp", null);
        setField(term30214, term30214.getClass(), "exchange", enum46);
        setField(term30214, term30214.getClass(), "ticker", "ieCtQFdkii");
        setField(term30214, term30214.getClass(), "id", "dEnhdmILtU");
        setField(term30214, term30214.getClass(), "startTime", "hoicvmsovO");
        setField(term30214, term30214.getClass(), "endTime", "eqJfYWRaEL");
        setField(term30214, term30214.getClass(), "interval", "fhkbdRViHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartTime", argTypes, term30214, args);
    }

};


