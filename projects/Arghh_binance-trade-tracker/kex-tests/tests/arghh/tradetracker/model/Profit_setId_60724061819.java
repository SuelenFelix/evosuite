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

public class Profit_setId_60724061819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5428;

    public Profit_setId_60724061819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5428 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        setField(term5428, term5428.getClass(), "id", null);
        setField(term5428, term5428.getClass(), "baseCurrency", null);
        setField(term5428, term5428.getClass(), "profitValue", null);
        setField(term5428, term5428.getClass(), "quantity", null);
        setField(term5428, term5428.getClass(), "priceDifference", null);
        setLongField(term5428, term5428.getClass(), "timeDifference", 0L);
        setField(term5428, term5428.getClass(), "aggregatedTrade", null);
        setField(term5428, term5428.getClass(), "sellTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term5428, args);
    }

};


