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

public class ProfitList_getTotalProfit_102811393510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2984;

    public ProfitList_getTotalProfit_102811393510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2984 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term2997 = newInstance(Class.forName("java.util.Date"));
        Object term3036 = newInstance(Class.forName("java.util.Date"));
        setField(term2984, term2984.getClass(), "buyPrice", "jwsfVjMoJT");
        setLongField(term2997, term2997.getClass(), "fastTime", 1668569229825L);
        setField(term2997, term2997.getClass(), "cdate", null);
        setField(term2984, term2984.getClass(), "buyTime", term2997);
        setLongField(term2984, term2984.getClass(), "id", 6967924379644551255L);
        setField(term2984, term2984.getClass(), "profit", "ZfdXfCCFDf");
        setField(term2984, term2984.getClass(), "quantity", "MwwjNtdOFT");
        setField(term2984, term2984.getClass(), "sellPrice", "VYkqXKVlAJ");
        setLongField(term3036, term3036.getClass(), "fastTime", 1725122217647L);
        setField(term3036, term3036.getClass(), "cdate", null);
        setField(term2984, term2984.getClass(), "sellTime", term3036);
        setField(term2984, term2984.getClass(), "symbol", "XkIoWJRNwN");
        setField(term2984, term2984.getClass(), "timeDifference", "aNWLJdrZMq");
        setField(term2984, term2984.getClass(), "totalProfit", "HHmNoYxIGj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalProfit", argTypes, term2984, args);
    }

};


