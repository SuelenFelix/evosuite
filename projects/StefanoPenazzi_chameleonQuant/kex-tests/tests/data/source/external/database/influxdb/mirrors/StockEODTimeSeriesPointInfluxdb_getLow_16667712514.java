package data.source.external.database.influxdb.mirrors;

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
import static data.source.external.database.influxdb.mirrors.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class StockEODTimeSeriesPointInfluxdb_getLow_16667712514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;

    public StockEODTimeSeriesPointInfluxdb_getLow_16667712514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term152 = new Double(0.6862221294683138);
        Double term154 = new Double(0.15917839663695388);
        Double term156 = new Double(0.9374115574082594);
        Double term158 = new Double(0.8454723071922143);
        Double term160 = new Double(0.8566567697571895);
        term148 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb"));
        Object term149 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term149, term149.getClass(), "seconds", 1797203628L);
        setIntField(term149, term149.getClass(), "nanos", 25000000);
        setField(term148, term148.getClass(), "time", term149);
        setField(term148, term148.getClass(), "open", term152);
        setField(term148, term148.getClass(), "close", term154);
        setField(term148, term148.getClass(), "high", term156);
        setField(term148, term148.getClass(), "low", term158);
        setField(term148, term148.getClass(), "volume", term160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLow", argTypes, term148, args);
    }

};


