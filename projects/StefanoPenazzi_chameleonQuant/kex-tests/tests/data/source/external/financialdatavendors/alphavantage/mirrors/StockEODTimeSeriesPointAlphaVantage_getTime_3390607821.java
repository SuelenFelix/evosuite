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

public class StockEODTimeSeriesPointAlphaVantage_getTime_3390607821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public StockEODTimeSeriesPointAlphaVantage_getTime_3390607821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5 = new Double(0.13238746331190498);
        Double term7 = new Double(0.3455959125047594);
        Double term9 = new Double(0.5523635872663106);
        Double term11 = new Double(0.544608645520025);
        Double term13 = new Double(0.28570734989730284);
        term1 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.mirrors.StockEODTimeSeriesPointAlphaVantage"));
        Object term2 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term2, term2.getClass(), "seconds", 1345871412L);
        setIntField(term2, term2.getClass(), "nanos", 244000000);
        setField(term1, term1.getClass(), "time", term2);
        setField(term1, term1.getClass(), "open", term5);
        setField(term1, term1.getClass(), "close", term7);
        setField(term1, term1.getClass(), "high", term9);
        setField(term1, term1.getClass(), "low", term11);
        setField(term1, term1.getClass(), "volume", term13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.mirrors.StockEODTimeSeriesPointAlphaVantage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTime", argTypes, term1, args);
    }

};


