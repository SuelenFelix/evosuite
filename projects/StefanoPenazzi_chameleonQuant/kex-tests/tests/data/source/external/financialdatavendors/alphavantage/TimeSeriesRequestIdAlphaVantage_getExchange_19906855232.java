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

public class TimeSeriesRequestIdAlphaVantage_getExchange_19906855232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27575;

    public TimeSeriesRequestIdAlphaVantage_getExchange_19906855232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27717 = Class.forName((String) "data.source.external.financialdatavendors.alphavantage.parameters.functions.Function");
        Field term27716 = ((Class) term27717).getDeclaredField((String) "TIME_SERIES_DAILY_ADJUSTED");
        ((Field) term27716).setAccessible(true);
        Object enum42 = ((Field) term27716).get((Object) null);
        term27575 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage"));
        setField(term27575, term27575.getClass(), "SOURCE", "Ghbwtircqb");
        setField(term27575, term27575.getClass(), "timeSeriesId", null);
        setField(term27575, term27575.getClass(), "tsp", null);
        setField(term27575, term27575.getClass(), "exchange", enum42);
        setField(term27575, term27575.getClass(), "ticker", "xrwlQZdwCp");
        setField(term27575, term27575.getClass(), "id", "IDCWpPLRkE");
        setField(term27575, term27575.getClass(), "startTime", "nyiiPDVjAc");
        setField(term27575, term27575.getClass(), "endTime", "aKnKipADSo");
        setField(term27575, term27575.getClass(), "interval", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExchange", argTypes, term27575, args);
    }

};


