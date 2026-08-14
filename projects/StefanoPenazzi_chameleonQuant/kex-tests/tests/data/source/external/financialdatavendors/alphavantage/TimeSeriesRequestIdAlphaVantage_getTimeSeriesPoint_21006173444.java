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

public class TimeSeriesRequestIdAlphaVantage_getTimeSeriesPoint_21006173444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28847;

    public TimeSeriesRequestIdAlphaVantage_getTimeSeriesPoint_21006173444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28981 = Class.forName((String) "data.source.external.financialdatavendors.alphavantage.parameters.functions.Function");
        Field term28980 = ((Class) term28981).getDeclaredField((String) "DIGITAL_CURRENCY_DAILY");
        ((Field) term28980).setAccessible(true);
        Object enum44 = ((Field) term28980).get((Object) null);
        term28847 = newInstance(Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage"));
        setField(term28847, term28847.getClass(), "SOURCE", "LvtrsXUliU");
        setField(term28847, term28847.getClass(), "timeSeriesId", null);
        setField(term28847, term28847.getClass(), "tsp", null);
        setField(term28847, term28847.getClass(), "exchange", enum44);
        setField(term28847, term28847.getClass(), "ticker", "xLbjWUgOIL");
        setField(term28847, term28847.getClass(), "id", "jDtqGUpnZN");
        setField(term28847, term28847.getClass(), "startTime", "nGKItKLYNC");
        setField(term28847, term28847.getClass(), "endTime", "UiUYnPrcCi");
        setField(term28847, term28847.getClass(), "interval", "UoYtihxVaS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.TimeSeriesRequestIdAlphaVantage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeSeriesPoint", argTypes, term28847, args);
    }

};


