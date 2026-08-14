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

public class AggregatedTrade_getSymbol_171621789334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16658;

    public AggregatedTrade_getSymbol_171621789334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16658 = newInstance(Class.forName("arghh.tradetracker.model.AggregatedTrade"));
        setField(term16658, term16658.getClass(), "id", null);
        setField(term16658, term16658.getClass(), "symbol", null);
        setBooleanField(term16658, term16658.getClass(), "buy", false);
        setField(term16658, term16658.getClass(), "binanceId", null);
        setField(term16658, term16658.getClass(), "price", null);
        setField(term16658, term16658.getClass(), "quantity", null);
        setField(term16658, term16658.getClass(), "fee", null);
        setField(term16658, term16658.getClass(), "feeCoin", null);
        setField(term16658, term16658.getClass(), "total", null);
        setField(term16658, term16658.getClass(), "tradeTime", null);
        setField(term16658, term16658.getClass(), "profit", null);
        setField(term16658, term16658.getClass(), "trade", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.AggregatedTrade");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbol", argTypes, term16658, args);
    }

};


