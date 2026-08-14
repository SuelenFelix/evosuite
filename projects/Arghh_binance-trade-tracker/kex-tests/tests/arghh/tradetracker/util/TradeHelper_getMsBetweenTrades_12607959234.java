package arghh.tradetracker.util;

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
import static arghh.tradetracker.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TradeHelper_getMsBetweenTrades_12607959234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;
     Object term133;

    public TradeHelper_getMsBetweenTrades_12607959234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131 = newInstance(Class.forName("java.util.Date"));
        setLongField(term131, term131.getClass(), "fastTime", 1345871412244L);
        setField(term131, term131.getClass(), "cdate", null);
        term133 = newInstance(Class.forName("java.util.Date"));
        setLongField(term133, term133.getClass(), "fastTime", 1480438351369L);
        setField(term133, term133.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.util.TradeHelper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term131;
        args[1] = term133;
        callMethod(klass, "getMsBetweenTrades", argTypes, null, args);
    }

};


