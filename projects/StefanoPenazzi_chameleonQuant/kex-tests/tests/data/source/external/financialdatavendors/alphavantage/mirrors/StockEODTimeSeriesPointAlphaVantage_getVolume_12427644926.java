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

public class StockEODTimeSeriesPointAlphaVantage_getVolume_12427644926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;

    public StockEODTimeSeriesPointAlphaVantage_getVolume_12427644926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term75 = new Double(0.3800088629986428);
        Double term77 = new Double(0.5840714198152577);
        Double term79 = new Double(0.7559240768573477);
        Double term81 = new Double(0.10667076642995188);
        Double term83 = new Double(0.11493000848982304);
        term71 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.mirrors.StockEODTimeSeriesPointAlphaVantage"));
        Object term72 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term72, term72.getClass(), "seconds", 1515890130L);
        setIntField(term72, term72.getClass(), "nanos", 18000000);
        setField(term71, term71.getClass(), "time", term72);
        setField(term71, term71.getClass(), "open", term75);
        setField(term71, term71.getClass(), "close", term77);
        setField(term71, term71.getClass(), "high", term79);
        setField(term71, term71.getClass(), "low", term81);
        setField(term71, term71.getClass(), "volume", term83);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.mirrors.StockEODTimeSeriesPointAlphaVantage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolume", argTypes, term71, args);
    }

};


