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

public class StatsList_getProfitsGained_19636200299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1072;

    public StatsList_getProfitsGained_19636200299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1109 = new HashMap();
        HashMap term1120 = new HashMap();
        HashMap term1133 = new HashMap();
        term1072 = newInstance(Class.forName("arghh.tradetracker.commands.StatsList"));
        setField(term1072, term1072.getClass(), "tradeCount", "dEnhdmILtU");
        setField(term1072, term1072.getClass(), "profitsGained", "hoicvmsovO");
        setField(term1072, term1072.getClass(), "profitsLost", "eqJfYWRaEL");
        setField(term1072, term1072.getClass(), "marketTrades", term1109);
        setField(term1072, term1072.getClass(), "marketProfits", term1120);
        setField(term1072, term1072.getClass(), "coinFees", term1133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.StatsList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProfitsGained", argTypes, term1072, args);
    }

};


