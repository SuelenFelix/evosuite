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

public class Profit_setSellTime_26231810833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5458;

    public Profit_setSellTime_26231810833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5458 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        setField(term5458, term5458.getClass(), "id", null);
        setField(term5458, term5458.getClass(), "baseCurrency", null);
        setField(term5458, term5458.getClass(), "profitValue", null);
        setField(term5458, term5458.getClass(), "quantity", null);
        setField(term5458, term5458.getClass(), "priceDifference", null);
        setLongField(term5458, term5458.getClass(), "timeDifference", 0L);
        setField(term5458, term5458.getClass(), "aggregatedTrade", null);
        setField(term5458, term5458.getClass(), "sellTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSellTime", argTypes, term5458, args);
    }

};


