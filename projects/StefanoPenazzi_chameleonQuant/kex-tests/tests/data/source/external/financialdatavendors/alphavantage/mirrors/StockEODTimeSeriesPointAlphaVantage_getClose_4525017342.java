package data.source.external.financialdatavendors.alphavantage.mirrors;

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
import static data.source.external.financialdatavendors.alphavantage.mirrors.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class StockEODTimeSeriesPointAlphaVantage_getClose_4525017342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;

    public StockEODTimeSeriesPointAlphaVantage_getClose_4525017342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term19 = new Double(0.40176586625454525);
        Double term21 = new Double(0.2641345529914265);
        Double term23 = new Double(0.36923381893433327);
        Double term25 = new Double(0.6076495596892013);
        Double term27 = new Double(0.37773193782763337);
        term15 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.mirrors.StockEODTimeSeriesPointAlphaVantage"));
        Object term16 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term16, term16.getClass(), "seconds", 1480438351L);
        setIntField(term16, term16.getClass(), "nanos", 369000000);
        setField(term15, term15.getClass(), "time", term16);
        setField(term15, term15.getClass(), "open", term19);
        setField(term15, term15.getClass(), "close", term21);
        setField(term15, term15.getClass(), "high", term23);
        setField(term15, term15.getClass(), "low", term25);
        setField(term15, term15.getClass(), "volume", term27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.mirrors.StockEODTimeSeriesPointAlphaVantage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClose", argTypes, term15, args);
    }

};


