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

public class ProfitList_getTimeDifference_20568591339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2824;

    public ProfitList_getTimeDifference_20568591339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2824 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term2837 = newInstance(Class.forName("java.util.Date"));
        Object term2876 = newInstance(Class.forName("java.util.Date"));
        setField(term2824, term2824.getClass(), "buyPrice", "pXOkjyeIRb");
        setLongField(term2837, term2837.getClass(), "fastTime", 1882638884364L);
        setField(term2837, term2837.getClass(), "cdate", null);
        setField(term2824, term2824.getClass(), "buyTime", term2837);
        setLongField(term2824, term2824.getClass(), "id", -7237588299778557629L);
        setField(term2824, term2824.getClass(), "profit", "GgZWSjxjyE");
        setField(term2824, term2824.getClass(), "quantity", "EeBVbzjcCI");
        setField(term2824, term2824.getClass(), "sellPrice", "UfQtPRyWRC");
        setLongField(term2876, term2876.getClass(), "fastTime", 1437757323580L);
        setField(term2876, term2876.getClass(), "cdate", null);
        setField(term2824, term2824.getClass(), "sellTime", term2876);
        setField(term2824, term2824.getClass(), "symbol", "FPvxVzzSvD");
        setField(term2824, term2824.getClass(), "timeDifference", "WHcwFgsGFC");
        setField(term2824, term2824.getClass(), "totalProfit", "HzqpegHiRq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeDifference", argTypes, term2824, args);
    }

};


