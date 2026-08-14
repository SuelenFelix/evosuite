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

public class TimeSeriesRequestIdAlphaVantage_getInterval_289476048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31386;

    public TimeSeriesRequestIdAlphaVantage_getInterval_289476048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31482 = Class.forName((String) "data.source.external.financialdatavendors.alphavantage.parameters.functions.Function");
        Field term31481 = ((Class) term31482).getDeclaredField((String) "BOP");
        ((Field) term31481).setAccessible(true);
        Object enum48 = ((Field) term31481).get((Object) null);
        term31386 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage"));
        setField(term31386, term31386.getClass(), "SOURCE", "IgRJUzaCwW");
        setField(term31386, term31386.getClass(), "timeSeriesId", null);
        setField(term31386, term31386.getClass(), "tsp", null);
        setField(term31386, term31386.getClass(), "exchange", enum48);
        setField(term31386, term31386.getClass(), "ticker", "JUmudUmaaV");
        setField(term31386, term31386.getClass(), "id", "KoyGrUJeJW");
        setField(term31386, term31386.getClass(), "startTime", "HqBOwkVqjD");
        setField(term31386, term31386.getClass(), "endTime", "MAcUBcBckh");
        setField(term31386, term31386.getClass(), "interval", "oVgzLbrsFr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInterval", argTypes, term31386, args);
    }

};


