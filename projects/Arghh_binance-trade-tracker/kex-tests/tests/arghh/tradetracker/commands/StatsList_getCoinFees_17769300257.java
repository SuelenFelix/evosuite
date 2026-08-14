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

public class StatsList_getCoinFees_17769300257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term826;

    public StatsList_getCoinFees_17769300257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term863 = new HashMap();
        HashMap term874 = new HashMap();
        HashMap term887 = new HashMap();
        term826 = newInstance(Class.forName("arghh.tradetracker.commands.StatsList"));
        setField(term826, term826.getClass(), "tradeCount", "xLbjWUgOIL");
        setField(term826, term826.getClass(), "profitsGained", "jDtqGUpnZN");
        setField(term826, term826.getClass(), "profitsLost", "nGKItKLYNC");
        setField(term826, term826.getClass(), "marketTrades", term863);
        setField(term826, term826.getClass(), "marketProfits", term874);
        setField(term826, term826.getClass(), "coinFees", term887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.StatsList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoinFees", argTypes, term826, args);
    }

};


