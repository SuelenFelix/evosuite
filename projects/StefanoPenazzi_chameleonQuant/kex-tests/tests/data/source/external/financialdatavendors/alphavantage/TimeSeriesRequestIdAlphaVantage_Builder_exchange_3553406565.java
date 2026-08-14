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

public class TimeSeriesRequestIdAlphaVantage_Builder_exchange_3553406565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26419;

    public TimeSeriesRequestIdAlphaVantage_Builder_exchange_3553406565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26419 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage$Builder"));
        setField(term26419, term26419.getClass(), "timeSeriesId", null);
        setField(term26419, term26419.getClass(), "function", null);
        setBooleanField(term26419, term26419.getClass(), "adjusted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("data.source.external.financialdatavendors.alphavantage.parameters.functions.Function");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "exchange", argTypes, term26419, args);
    }

};


