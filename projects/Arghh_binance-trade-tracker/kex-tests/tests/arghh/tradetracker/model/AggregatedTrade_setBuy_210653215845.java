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
import java.lang.Boolean;

public class AggregatedTrade_setBuy_210653215845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16680;
     Object term16682;

    public AggregatedTrade_setBuy_210653215845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16680 = newInstance(Class.forName("arghh.tradetracker.model.AggregatedTrade"));
        setField(term16680, term16680.getClass(), "id", null);
        setField(term16680, term16680.getClass(), "symbol", null);
        setBooleanField(term16680, term16680.getClass(), "buy", false);
        setField(term16680, term16680.getClass(), "binanceId", null);
        setField(term16680, term16680.getClass(), "price", null);
        setField(term16680, term16680.getClass(), "quantity", null);
        setField(term16680, term16680.getClass(), "fee", null);
        setField(term16680, term16680.getClass(), "feeCoin", null);
        setField(term16680, term16680.getClass(), "total", null);
        setField(term16680, term16680.getClass(), "tradeTime", null);
        setField(term16680, term16680.getClass(), "profit", null);
        setField(term16680, term16680.getClass(), "trade", null);
        term16682 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.AggregatedTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term16682;
        callMethod(klass, "setBuy", argTypes, term16680, args);
    }

};


