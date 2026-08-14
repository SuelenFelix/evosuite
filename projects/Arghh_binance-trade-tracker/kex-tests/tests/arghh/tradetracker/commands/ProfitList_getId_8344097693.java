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

public class ProfitList_getId_8344097693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1864;

    public ProfitList_getId_8344097693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1864 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term1877 = newInstance(Class.forName("java.util.Date"));
        Object term1916 = newInstance(Class.forName("java.util.Date"));
        setField(term1864, term1864.getClass(), "buyPrice", "sEccwbJKYE");
        setLongField(term1877, term1877.getClass(), "fastTime", 1442639565302L);
        setField(term1877, term1877.getClass(), "cdate", null);
        setField(term1864, term1864.getClass(), "buyTime", term1877);
        setLongField(term1864, term1864.getClass(), "id", -8257434502486459194L);
        setField(term1864, term1864.getClass(), "profit", "AWRooQKkdW");
        setField(term1864, term1864.getClass(), "quantity", "vjxIhXHxGR");
        setField(term1864, term1864.getClass(), "sellPrice", "QXzGXbEXMu");
        setLongField(term1916, term1916.getClass(), "fastTime", 1515890130018L);
        setField(term1916, term1916.getClass(), "cdate", null);
        setField(term1864, term1864.getClass(), "sellTime", term1916);
        setField(term1864, term1864.getClass(), "symbol", "qxSDVejjiY");
        setField(term1864, term1864.getClass(), "timeDifference", "xBsXSDjXYK");
        setField(term1864, term1864.getClass(), "totalProfit", "sEnIVFtZuQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1864, args);
    }

};


