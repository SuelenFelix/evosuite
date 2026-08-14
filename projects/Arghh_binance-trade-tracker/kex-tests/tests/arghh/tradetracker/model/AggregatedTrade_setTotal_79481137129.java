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

public class AggregatedTrade_setTotal_79481137129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16648;

    public AggregatedTrade_setTotal_79481137129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16648 = newInstance(Class.forName("arghh.tradetracker.model.AggregatedTrade"));
        setField(term16648, term16648.getClass(), "id", null);
        setField(term16648, term16648.getClass(), "symbol", null);
        setBooleanField(term16648, term16648.getClass(), "buy", false);
        setField(term16648, term16648.getClass(), "binanceId", null);
        setField(term16648, term16648.getClass(), "price", null);
        setField(term16648, term16648.getClass(), "quantity", null);
        setField(term16648, term16648.getClass(), "fee", null);
        setField(term16648, term16648.getClass(), "feeCoin", null);
        setField(term16648, term16648.getClass(), "total", null);
        setField(term16648, term16648.getClass(), "tradeTime", null);
        setField(term16648, term16648.getClass(), "profit", null);
        setField(term16648, term16648.getClass(), "trade", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.AggregatedTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTotal", argTypes, term16648, args);
    }

};


