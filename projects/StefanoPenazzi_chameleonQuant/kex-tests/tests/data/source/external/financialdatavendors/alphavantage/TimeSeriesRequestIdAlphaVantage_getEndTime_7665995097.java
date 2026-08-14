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

public class TimeSeriesRequestIdAlphaVantage_getEndTime_7665995097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30805;

    public TimeSeriesRequestIdAlphaVantage_getEndTime_7665995097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30901 = Class.forName((String) "data.source.external.financialdatavendors.alphavantage.parameters.functions.Function");
        Field term30900 = ((Class) term30901).getDeclaredField((String) "ADX");
        ((Field) term30900).setAccessible(true);
        Object enum47 = ((Field) term30900).get((Object) null);
        term30805 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage"));
        setField(term30805, term30805.getClass(), "SOURCE", "uWHnvSvaPl");
        setField(term30805, term30805.getClass(), "timeSeriesId", null);
        setField(term30805, term30805.getClass(), "tsp", null);
        setField(term30805, term30805.getClass(), "exchange", enum47);
        setField(term30805, term30805.getClass(), "ticker", "kBdSllIBVz");
        setField(term30805, term30805.getClass(), "id", "TJmVBGfTML");
        setField(term30805, term30805.getClass(), "startTime", "tPlsykYBqO");
        setField(term30805, term30805.getClass(), "endTime", "bLPjGVBhlX");
        setField(term30805, term30805.getClass(), "interval", "whBvTVIIlC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndTime", argTypes, term30805, args);
    }

};


