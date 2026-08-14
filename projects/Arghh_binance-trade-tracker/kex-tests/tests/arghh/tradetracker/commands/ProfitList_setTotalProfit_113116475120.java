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

public class ProfitList_setTotalProfit_113116475120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722;

    public ProfitList_setTotalProfit_113116475120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term4735 = newInstance(Class.forName("java.util.Date"));
        Object term4774 = newInstance(Class.forName("java.util.Date"));
        setField(term4722, term4722.getClass(), "buyPrice", "AHbZyFOmlo");
        setLongField(term4735, term4735.getClass(), "fastTime", 1405279189488L);
        setField(term4735, term4735.getClass(), "cdate", null);
        setField(term4722, term4722.getClass(), "buyTime", term4735);
        setLongField(term4722, term4722.getClass(), "id", 8428634514691209827L);
        setField(term4722, term4722.getClass(), "profit", "TwfWVQGiIj");
        setField(term4722, term4722.getClass(), "quantity", "gUvcueTURF");
        setField(term4722, term4722.getClass(), "sellPrice", "EwQBhZjCIT");
        setLongField(term4774, term4774.getClass(), "fastTime", 1822704644050L);
        setField(term4774, term4774.getClass(), "cdate", null);
        setField(term4722, term4722.getClass(), "sellTime", term4774);
        setField(term4722, term4722.getClass(), "symbol", "aSkmSwTnEw");
        setField(term4722, term4722.getClass(), "timeDifference", "xvkbvaEGYd");
        setField(term4722, term4722.getClass(), "totalProfit", "HBGNxdNURv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mfCpTPPQQm";
        callMethod(klass, "setTotalProfit", argTypes, term4722, args);
    }

};


