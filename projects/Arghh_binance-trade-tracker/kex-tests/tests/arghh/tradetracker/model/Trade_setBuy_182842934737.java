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

public class Trade_setBuy_182842934737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28072;
     Object term28074;

    public Trade_setBuy_182842934737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28072 = newInstance(Class.forName("arghh.tradetracker.model.Trade"));
        setField(term28072, term28072.getClass(), "id", null);
        setField(term28072, term28072.getClass(), "symbol", null);
        setBooleanField(term28072, term28072.getClass(), "buy", false);
        setField(term28072, term28072.getClass(), "price", null);
        setField(term28072, term28072.getClass(), "quantity", null);
        setField(term28072, term28072.getClass(), "fee", null);
        setField(term28072, term28072.getClass(), "feeCoin", null);
        setField(term28072, term28072.getClass(), "total", null);
        setField(term28072, term28072.getClass(), "tradeTime", null);
        setField(term28072, term28072.getClass(), "aggregatedTrade", null);
        term28074 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Trade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term28074;
        callMethod(klass, "setBuy", argTypes, term28072, args);
    }

};


