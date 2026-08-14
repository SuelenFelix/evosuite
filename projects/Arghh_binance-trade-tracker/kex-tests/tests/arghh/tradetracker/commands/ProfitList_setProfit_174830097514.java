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

public class ProfitList_setProfit_174830097514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3650;

    public ProfitList_setProfit_174830097514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3650 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term3663 = newInstance(Class.forName("java.util.Date"));
        Object term3702 = newInstance(Class.forName("java.util.Date"));
        setField(term3650, term3650.getClass(), "buyPrice", "igCAtimmYB");
        setLongField(term3663, term3663.getClass(), "fastTime", 1739417792956L);
        setField(term3663, term3663.getClass(), "cdate", null);
        setField(term3650, term3650.getClass(), "buyTime", term3663);
        setLongField(term3650, term3650.getClass(), "id", -5476826692763582090L);
        setField(term3650, term3650.getClass(), "profit", "DyiXbeYIaN");
        setField(term3650, term3650.getClass(), "quantity", "VGizxZnyHX");
        setField(term3650, term3650.getClass(), "sellPrice", "kVEZMHmRtR");
        setLongField(term3702, term3702.getClass(), "fastTime", 1329640267573L);
        setField(term3702, term3702.getClass(), "cdate", null);
        setField(term3650, term3650.getClass(), "sellTime", term3702);
        setField(term3650, term3650.getClass(), "symbol", "ekxGuOYIwi");
        setField(term3650, term3650.getClass(), "timeDifference", "RbVQXSpxXy");
        setField(term3650, term3650.getClass(), "totalProfit", "YpJbIgJWWv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JppkknKVOw";
        callMethod(klass, "setProfit", argTypes, term3650, args);
    }

};


