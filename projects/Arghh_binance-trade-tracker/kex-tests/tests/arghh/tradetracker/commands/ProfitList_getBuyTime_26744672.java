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

public class ProfitList_getBuyTime_26744672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1704;

    public ProfitList_getBuyTime_26744672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1704 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term1717 = newInstance(Class.forName("java.util.Date"));
        Object term1756 = newInstance(Class.forName("java.util.Date"));
        setField(term1704, term1704.getClass(), "buyPrice", "jiKYgYHqIS");
        setLongField(term1717, term1717.getClass(), "fastTime", 1610940182830L);
        setField(term1717, term1717.getClass(), "cdate", null);
        setField(term1704, term1704.getClass(), "buyTime", term1717);
        setLongField(term1704, term1704.getClass(), "id", 6375119433582206027L);
        setField(term1704, term1704.getClass(), "profit", "DfISiziTgG");
        setField(term1704, term1704.getClass(), "quantity", "XqgfKFvPSD");
        setField(term1704, term1704.getClass(), "sellPrice", "JiVRgTZvKc");
        setLongField(term1756, term1756.getClass(), "fastTime", 1606045635837L);
        setField(term1756, term1756.getClass(), "cdate", null);
        setField(term1704, term1704.getClass(), "sellTime", term1756);
        setField(term1704, term1704.getClass(), "symbol", "XPKmummaqg");
        setField(term1704, term1704.getClass(), "timeDifference", "BKLfkLiZTH");
        setField(term1704, term1704.getClass(), "totalProfit", "SPpkrGcPRr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBuyTime", argTypes, term1704, args);
    }

};


