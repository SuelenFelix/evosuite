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

public class BurnTransactionEnt_toBuilder_6205233221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233736;

    public BurnTransactionEnt_toBuilder_6205233221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term233737 = new Long(-2413135395771470086L);
        Long term233751 = new Long(-823085399570394644L);
        term233736 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term233753 = newInstance(Class.forName("java.util.Date"));
        Object term233755 = newInstance(Class.forName("java.util.Date"));
        setField(term233736, term233736.getClass(), "id", term233737);
        setField(term233736, term233736.getClass(), "transactionHash", "OfXdotjbuM");
        setField(term233736, term233736.getClass(), "ledgerIndex", term233751);
        setLongField(term233753, term233753.getClass(), "fastTime", 1417332081038L);
        setField(term233753, term233753.getClass(), "cdate", null);
        setField(term233736, term233736.getClass(), "createDate", term233753);
        setLongField(term233755, term233755.getClass(), "fastTime", 1517240339927L);
        setField(term233755, term233755.getClass(), "cdate", null);
        setField(term233736, term233736.getClass(), "txDate", term233755);
        setField(term233736, term233736.getClass(), "toAddress", "DNkENYBesD");
        setField(term233736, term233736.getClass(), "fromAddress", "TSogTVVlxc");
        setField(term233736, term233736.getClass(), "amount", "kWEJlReukq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term233736, args);
    }

};


