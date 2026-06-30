package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class BurnTransactionEnt_setAmount_42906852323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235848;

    public BurnTransactionEnt_setAmount_42906852323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term235849 = new Long(6465539339431559532L);
        Long term235863 = new Long(-5304831679802174866L);
        term235848 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term235865 = newInstance(Class.forName("java.util.Date"));
        Object term235867 = newInstance(Class.forName("java.util.Date"));
        setField(term235848, term235848.getClass(), "id", term235849);
        setField(term235848, term235848.getClass(), "transactionHash", "CBnamgJrJS");
        setField(term235848, term235848.getClass(), "ledgerIndex", term235863);
        setLongField(term235865, term235865.getClass(), "fastTime", 1709809331902L);
        setField(term235865, term235865.getClass(), "cdate", null);
        setField(term235848, term235848.getClass(), "createDate", term235865);
        setLongField(term235867, term235867.getClass(), "fastTime", 1625536681181L);
        setField(term235867, term235867.getClass(), "cdate", null);
        setField(term235848, term235848.getClass(), "txDate", term235867);
        setField(term235848, term235848.getClass(), "toAddress", "uJhRRqAnDP");
        setField(term235848, term235848.getClass(), "fromAddress", "hJCqADrhuV");
        setField(term235848, term235848.getClass(), "amount", "RyPUBlRpNZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ardfVpCueq";
        callMethod(klass, "setAmount", argTypes, term235848, args);
    }

};


