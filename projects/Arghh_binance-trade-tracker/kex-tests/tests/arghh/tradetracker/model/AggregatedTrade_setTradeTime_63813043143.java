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

public class AggregatedTrade_setTradeTime_63813043143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16676;

    public AggregatedTrade_setTradeTime_63813043143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16676 = newInstance(Class.forName("arghh.tradetracker.model.AggregatedTrade"));
        setField(term16676, term16676.getClass(), "id", null);
        setField(term16676, term16676.getClass(), "symbol", null);
        setBooleanField(term16676, term16676.getClass(), "buy", false);
        setField(term16676, term16676.getClass(), "binanceId", null);
        setField(term16676, term16676.getClass(), "price", null);
        setField(term16676, term16676.getClass(), "quantity", null);
        setField(term16676, term16676.getClass(), "fee", null);
        setField(term16676, term16676.getClass(), "feeCoin", null);
        setField(term16676, term16676.getClass(), "total", null);
        setField(term16676, term16676.getClass(), "tradeTime", null);
        setField(term16676, term16676.getClass(), "profit", null);
        setField(term16676, term16676.getClass(), "trade", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.AggregatedTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTradeTime", argTypes, term16676, args);
    }

};


