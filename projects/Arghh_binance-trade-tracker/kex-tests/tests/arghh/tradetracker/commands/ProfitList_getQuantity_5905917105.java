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

public class ProfitList_getQuantity_5905917105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2184;

    public ProfitList_getQuantity_5905917105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2184 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term2197 = newInstance(Class.forName("java.util.Date"));
        Object term2236 = newInstance(Class.forName("java.util.Date"));
        setField(term2184, term2184.getClass(), "buyPrice", "MvRIxilFMJ");
        setLongField(term2197, term2197.getClass(), "fastTime", 1645834034896L);
        setField(term2197, term2197.getClass(), "cdate", null);
        setField(term2184, term2184.getClass(), "buyTime", term2197);
        setLongField(term2184, term2184.getClass(), "id", 5270370404989704783L);
        setField(term2184, term2184.getClass(), "profit", "iNwOJRBEjp");
        setField(term2184, term2184.getClass(), "quantity", "XylxrMBraH");
        setField(term2184, term2184.getClass(), "sellPrice", "pORebkoRdD");
        setLongField(term2236, term2236.getClass(), "fastTime", 1500721068023L);
        setField(term2236, term2236.getClass(), "cdate", null);
        setField(term2184, term2184.getClass(), "sellTime", term2236);
        setField(term2184, term2184.getClass(), "symbol", "mXGCWJDOqA");
        setField(term2184, term2184.getClass(), "timeDifference", "dpNsDgfPso");
        setField(term2184, term2184.getClass(), "totalProfit", "hCWPJQKpdc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuantity", argTypes, term2184, args);
    }

};


