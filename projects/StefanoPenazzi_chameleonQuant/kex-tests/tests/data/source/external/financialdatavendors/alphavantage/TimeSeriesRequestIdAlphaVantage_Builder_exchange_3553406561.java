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

public class TimeSeriesRequestIdAlphaVantage_Builder_exchange_3553406561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24549;
     Object enum37;

    public TimeSeriesRequestIdAlphaVantage_Builder_exchange_3553406561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24594 = Class.forName((String) "data.source.external.financialdatavendors.alphavantage.parameters.functions.Function");
        Field term24593 = ((Class) term24594).getDeclaredField((String) "HT_SINE");
        ((Field) term24593).setAccessible(true);
        Object enum36 = ((Field) term24593).get((Object) null);
        term24549 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage$Builder"));
        setField(term24549, term24549.getClass(), "timeSeriesId", null);
        setField(term24549, term24549.getClass(), "function", enum36);
        setBooleanField(term24549, term24549.getClass(), "adjusted", false);
        Class<? extends Object> term25042 = Class.forName((String) "data.source.external.financialdatavendors.alphavantage.parameters.functions.Function");
        Field term25041 = ((Class) term25042).getDeclaredField((String) "AROONOSC");
        ((Field) term25041).setAccessible(true);
        enum37 = ((Field) term25041).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("data.source.external.financialdatavendors.alphavantage.parameters.functions.Function");
        Object[] args = new Object[1];
        args[0] = enum37;
        callMethod(klass, "exchange", argTypes, term24549, args);
    }

};


