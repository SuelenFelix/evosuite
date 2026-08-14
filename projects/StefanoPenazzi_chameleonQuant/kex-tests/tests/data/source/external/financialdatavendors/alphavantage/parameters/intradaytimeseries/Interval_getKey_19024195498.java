package data.source.external.financialdatavendors.alphavantage.parameters.intradaytimeseries;

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
import static data.source.external.financialdatavendors.alphavantage.parameters.intradaytimeseries.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Interval_getKey_19024195498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum4;

    public Interval_getKey_19024195498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2184 = Class.forName((String) "data.source.external.financialdatavendors.alphavantage.parameters.intradaytimeseries.Interval");
        Field term2183 = ((Class) term2184).getDeclaredField((String) "THIRTY_MIN");
        ((Field) term2183).setAccessible(true);
        enum4 = ((Field) term2183).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.financialdatavendors.alphavantage.parameters.intradaytimeseries.Interval");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKey", argTypes, enum4, args);
    }

};


