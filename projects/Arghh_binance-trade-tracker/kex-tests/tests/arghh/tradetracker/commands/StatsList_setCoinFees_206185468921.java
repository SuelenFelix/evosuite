package arghh.tradetracker.commands;

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
import static arghh.tradetracker.commands.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StatsList_setCoinFees_206185468921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1539;

    public StatsList_setCoinFees_206185468921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1539 = newInstance(Class.forName("arghh.tradetracker.commands.StatsList"));
        setField(term1539, term1539.getClass(), "tradeCount", null);
        setField(term1539, term1539.getClass(), "profitsGained", null);
        setField(term1539, term1539.getClass(), "profitsLost", null);
        setField(term1539, term1539.getClass(), "marketTrades", null);
        setField(term1539, term1539.getClass(), "marketProfits", null);
        setField(term1539, term1539.getClass(), "coinFees", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.StatsList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCoinFees", argTypes, term1539, args);
    }

};


