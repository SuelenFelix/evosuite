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

public class ProfitList_getSellTime_3048482837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2504;

    public ProfitList_getSellTime_3048482837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2504 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term2517 = newInstance(Class.forName("java.util.Date"));
        Object term2556 = newInstance(Class.forName("java.util.Date"));
        setField(term2504, term2504.getClass(), "buyPrice", "SdCKLMIYnX");
        setLongField(term2517, term2517.getClass(), "fastTime", 1745462962080L);
        setField(term2517, term2517.getClass(), "cdate", null);
        setField(term2504, term2504.getClass(), "buyTime", term2517);
        setLongField(term2504, term2504.getClass(), "id", 4872422362414183754L);
        setField(term2504, term2504.getClass(), "profit", "OJJtVNPyKZ");
        setField(term2504, term2504.getClass(), "quantity", "AKNapTAfmD");
        setField(term2504, term2504.getClass(), "sellPrice", "xJgPlLxpgC");
        setLongField(term2556, term2556.getClass(), "fastTime", 1349069753960L);
        setField(term2556, term2556.getClass(), "cdate", null);
        setField(term2504, term2504.getClass(), "sellTime", term2556);
        setField(term2504, term2504.getClass(), "symbol", "EYtfuJaxiM");
        setField(term2504, term2504.getClass(), "timeDifference", "gCWtLVKVVe");
        setField(term2504, term2504.getClass(), "totalProfit", "fWKJoSoCwE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSellTime", argTypes, term2504, args);
    }

};


