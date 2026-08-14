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
import java.lang.Object;

public class ProfitList_getBuyPrice_15029787421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1544;

    public ProfitList_getBuyPrice_15029787421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1544 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term1557 = newInstance(Class.forName("java.util.Date"));
        Object term1596 = newInstance(Class.forName("java.util.Date"));
        setField(term1544, term1544.getClass(), "buyPrice", "TimdotUuNC");
        setLongField(term1557, term1557.getClass(), "fastTime", 1345871412244L);
        setField(term1557, term1557.getClass(), "cdate", null);
        setField(term1544, term1544.getClass(), "buyTime", term1557);
        setLongField(term1544, term1544.getClass(), "id", 2442117782898005296L);
        setField(term1544, term1544.getClass(), "profit", "PkWMRdJcBb");
        setField(term1544, term1544.getClass(), "quantity", "jSpAteRute");
        setField(term1544, term1544.getClass(), "sellPrice", "swZVeJAxjt");
        setLongField(term1596, term1596.getClass(), "fastTime", 1480438351369L);
        setField(term1596, term1596.getClass(), "cdate", null);
        setField(term1544, term1544.getClass(), "sellTime", term1596);
        setField(term1544, term1544.getClass(), "symbol", "xOcJIiQQDu");
        setField(term1544, term1544.getClass(), "timeDifference", "GVizqqzXpy");
        setField(term1544, term1544.getClass(), "totalProfit", "JqXGgAhZPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBuyPrice", argTypes, term1544, args);
    }

};


