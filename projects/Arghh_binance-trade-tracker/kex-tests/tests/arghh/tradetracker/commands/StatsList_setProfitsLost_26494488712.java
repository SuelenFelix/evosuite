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

public class StatsList_setProfitsLost_26494488712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1406;

    public StatsList_setProfitsLost_26494488712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1443 = new HashMap();
        HashMap term1454 = new HashMap();
        HashMap term1467 = new HashMap();
        term1406 = newInstance(Class.forName("arghh.tradetracker.commands.StatsList"));
        setField(term1406, term1406.getClass(), "tradeCount", "idgaQsnJpQ");
        setField(term1406, term1406.getClass(), "profitsGained", "VgZnGoIFwQ");
        setField(term1406, term1406.getClass(), "profitsLost", "jUbSRrkrYZ");
        setField(term1406, term1406.getClass(), "marketTrades", term1443);
        setField(term1406, term1406.getClass(), "marketProfits", term1454);
        setField(term1406, term1406.getClass(), "coinFees", term1467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.StatsList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PHvxnGHptP";
        callMethod(klass, "setProfitsLost", argTypes, term1406, args);
    }

};


