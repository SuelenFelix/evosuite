package arghh.tradetracker.model;

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
import static arghh.tradetracker.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Profit_setTimeDifference_138506715731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5452;
     Object term5454;

    public Profit_setTimeDifference_138506715731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5452 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        setField(term5452, term5452.getClass(), "id", null);
        setField(term5452, term5452.getClass(), "baseCurrency", null);
        setField(term5452, term5452.getClass(), "profitValue", null);
        setField(term5452, term5452.getClass(), "quantity", null);
        setField(term5452, term5452.getClass(), "priceDifference", null);
        setLongField(term5452, term5452.getClass(), "timeDifference", 0L);
        setField(term5452, term5452.getClass(), "aggregatedTrade", null);
        setField(term5452, term5452.getClass(), "sellTime", null);
        term5454 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term5454;
        callMethod(klass, "setTimeDifference", argTypes, term5452, args);
    }

};


