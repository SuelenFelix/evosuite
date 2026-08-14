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

public class TimeSeriesRequestIdAlphaVantage_getTimeSeriesPoint_210061734413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31970;

    public TimeSeriesRequestIdAlphaVantage_getTimeSeriesPoint_210061734413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31970 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage"));
        setField(term31970, term31970.getClass(), "SOURCE", null);
        setField(term31970, term31970.getClass(), "timeSeriesId", null);
        setField(term31970, term31970.getClass(), "tsp", null);
        setField(term31970, term31970.getClass(), "exchange", null);
        setField(term31970, term31970.getClass(), "ticker", null);
        setField(term31970, term31970.getClass(), "id", null);
        setField(term31970, term31970.getClass(), "startTime", null);
        setField(term31970, term31970.getClass(), "endTime", null);
        setField(term31970, term31970.getClass(), "interval", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeSeriesPoint", argTypes, term31970, args);
    }

};


