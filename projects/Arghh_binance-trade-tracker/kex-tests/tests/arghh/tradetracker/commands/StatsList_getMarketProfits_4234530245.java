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

public class StatsList_getMarketProfits_4234530245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492;

    public StatsList_getMarketProfits_4234530245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term529 = new HashMap();
        HashMap term540 = new HashMap();
        HashMap term553 = new HashMap();
        term492 = newInstance(Class.forName("arghh.tradetracker.commands.StatsList"));
        setField(term492, term492.getClass(), "tradeCount", "OWDIEULEFu");
        setField(term492, term492.getClass(), "profitsGained", "dWRymuLBtr");
        setField(term492, term492.getClass(), "profitsLost", "AijpHYOFuy");
        setField(term492, term492.getClass(), "marketTrades", term529);
        setField(term492, term492.getClass(), "marketProfits", term540);
        setField(term492, term492.getClass(), "coinFees", term553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.StatsList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMarketProfits", argTypes, term492, args);
    }

};


