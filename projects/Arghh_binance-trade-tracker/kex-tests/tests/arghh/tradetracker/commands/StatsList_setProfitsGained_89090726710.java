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
import java.util.HashMap;

public class StatsList_setProfitsGained_89090726710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1176;

    public StatsList_setProfitsGained_89090726710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1213 = new HashMap();
        HashMap term1224 = new HashMap();
        HashMap term1237 = new HashMap();
        term1176 = newInstance(Class.forName("arghh.tradetracker.commands.StatsList"));
        setField(term1176, term1176.getClass(), "tradeCount", "TJmVBGfTML");
        setField(term1176, term1176.getClass(), "profitsGained", "tPlsykYBqO");
        setField(term1176, term1176.getClass(), "profitsLost", "bLPjGVBhlX");
        setField(term1176, term1176.getClass(), "marketTrades", term1213);
        setField(term1176, term1176.getClass(), "marketProfits", term1224);
        setField(term1176, term1176.getClass(), "coinFees", term1237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.StatsList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KoyGrUJeJW";
        callMethod(klass, "setProfitsGained", argTypes, term1176, args);
    }

};


