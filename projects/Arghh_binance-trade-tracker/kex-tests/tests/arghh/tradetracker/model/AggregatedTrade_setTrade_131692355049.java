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

public class AggregatedTrade_setTrade_131692355049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16690;

    public AggregatedTrade_setTrade_131692355049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16690 = newInstance(Class.forName("arghh.tradetracker.model.AggregatedTrade"));
        setField(term16690, term16690.getClass(), "id", null);
        setField(term16690, term16690.getClass(), "symbol", null);
        setBooleanField(term16690, term16690.getClass(), "buy", false);
        setField(term16690, term16690.getClass(), "binanceId", null);
        setField(term16690, term16690.getClass(), "price", null);
        setField(term16690, term16690.getClass(), "quantity", null);
        setField(term16690, term16690.getClass(), "fee", null);
        setField(term16690, term16690.getClass(), "feeCoin", null);
        setField(term16690, term16690.getClass(), "total", null);
        setField(term16690, term16690.getClass(), "tradeTime", null);
        setField(term16690, term16690.getClass(), "profit", null);
        setField(term16690, term16690.getClass(), "trade", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.AggregatedTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTrade", argTypes, term16690, args);
    }

};


