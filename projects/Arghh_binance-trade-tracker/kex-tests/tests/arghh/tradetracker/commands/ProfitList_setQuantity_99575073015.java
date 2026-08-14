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

public class ProfitList_setQuantity_99575073015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3832;

    public ProfitList_setQuantity_99575073015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3832 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term3845 = newInstance(Class.forName("java.util.Date"));
        Object term3884 = newInstance(Class.forName("java.util.Date"));
        setField(term3832, term3832.getClass(), "buyPrice", "iljANwuEjk");
        setLongField(term3845, term3845.getClass(), "fastTime", 1334853104718L);
        setField(term3845, term3845.getClass(), "cdate", null);
        setField(term3832, term3832.getClass(), "buyTime", term3845);
        setLongField(term3832, term3832.getClass(), "id", -872011222785455006L);
        setField(term3832, term3832.getClass(), "profit", "kNqaJKIATy");
        setField(term3832, term3832.getClass(), "quantity", "vKQukfbJUd");
        setField(term3832, term3832.getClass(), "sellPrice", "lFRJFUMVbx");
        setLongField(term3884, term3884.getClass(), "fastTime", 1496859828764L);
        setField(term3884, term3884.getClass(), "cdate", null);
        setField(term3832, term3832.getClass(), "sellTime", term3884);
        setField(term3832, term3832.getClass(), "symbol", "sZdUNdggUW");
        setField(term3832, term3832.getClass(), "timeDifference", "OqbwYQfvAe");
        setField(term3832, term3832.getClass(), "totalProfit", "tRxZafjqIx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DhjNLmRMCu";
        callMethod(klass, "setQuantity", argTypes, term3832, args);
    }

};


