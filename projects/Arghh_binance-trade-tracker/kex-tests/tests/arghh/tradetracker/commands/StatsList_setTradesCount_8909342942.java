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

public class StatsList_setTradesCount_8909342942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105;

    public StatsList_setTradesCount_8909342942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term142 = new HashMap();
        HashMap term153 = new HashMap();
        HashMap term166 = new HashMap();
        term105 = newInstance(Class.forName("arghh.tradetracker.commands.StatsList"));
        setField(term105, term105.getClass(), "tradeCount", "SzjVpOQTyS");
        setField(term105, term105.getClass(), "profitsGained", "MjGYSRKTNF");
        setField(term105, term105.getClass(), "profitsLost", "hRNSzYYIrc");
        setField(term105, term105.getClass(), "marketTrades", term142);
        setField(term105, term105.getClass(), "marketProfits", term153);
        setField(term105, term105.getClass(), "coinFees", term166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.StatsList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MxlszYVzRf";
        callMethod(klass, "setTradesCount", argTypes, term105, args);
    }

};


