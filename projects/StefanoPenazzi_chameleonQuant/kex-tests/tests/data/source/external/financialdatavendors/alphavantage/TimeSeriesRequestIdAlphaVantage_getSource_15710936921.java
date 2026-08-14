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

public class TimeSeriesRequestIdAlphaVantage_getSource_15710936921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26994;

    public TimeSeriesRequestIdAlphaVantage_getSource_15710936921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27090 = Class.forName((String) "data.source.external.financialdatavendors.alphavantage.parameters.functions.Function");
        Field term27089 = ((Class) term27090).getDeclaredField((String) "MFI");
        ((Field) term27089).setAccessible(true);
        Object enum41 = ((Field) term27089).get((Object) null);
        term26994 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage"));
        setField(term26994, term26994.getClass(), "SOURCE", "TEParAifyi");
        setField(term26994, term26994.getClass(), "timeSeriesId", null);
        setField(term26994, term26994.getClass(), "tsp", null);
        setField(term26994, term26994.getClass(), "exchange", enum41);
        setField(term26994, term26994.getClass(), "ticker", "OWDIEULEFu");
        setField(term26994, term26994.getClass(), "id", "dWRymuLBtr");
        setField(term26994, term26994.getClass(), "startTime", "AijpHYOFuy");
        setField(term26994, term26994.getClass(), "endTime", "SbAoxhfrkn");
        setField(term26994, term26994.getClass(), "interval", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term26994, args);
    }

};


