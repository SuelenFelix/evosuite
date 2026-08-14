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

public class ProfitList_getProfit_976128414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2024;

    public ProfitList_getProfit_976128414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2024 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term2037 = newInstance(Class.forName("java.util.Date"));
        Object term2076 = newInstance(Class.forName("java.util.Date"));
        setField(term2024, term2024.getClass(), "buyPrice", "ZVecLZMLHF");
        setLongField(term2037, term2037.getClass(), "fastTime", 1429023851389L);
        setField(term2037, term2037.getClass(), "cdate", null);
        setField(term2024, term2024.getClass(), "buyTime", term2037);
        setLongField(term2024, term2024.getClass(), "id", -8400487765614892086L);
        setField(term2024, term2024.getClass(), "profit", "fztQhjqwdP");
        setField(term2024, term2024.getClass(), "quantity", "eVpkWxjuki");
        setField(term2024, term2024.getClass(), "sellPrice", "SJiQaLvSKv");
        setLongField(term2076, term2076.getClass(), "fastTime", 1495357463288L);
        setField(term2076, term2076.getClass(), "cdate", null);
        setField(term2024, term2024.getClass(), "sellTime", term2076);
        setField(term2024, term2024.getClass(), "symbol", "OEXDRUKcFl");
        setField(term2024, term2024.getClass(), "timeDifference", "RYdKCNNMBR");
        setField(term2024, term2024.getClass(), "totalProfit", "yGtHPyvYiQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProfit", argTypes, term2024, args);
    }

};


