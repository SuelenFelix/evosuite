package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FseTrustLine_FseTrustLineBuilder_balance_17326126163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606638;

    public FseTrustLine_FseTrustLineBuilder_balance_17326126163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term606638 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine$FseTrustLineBuilder"));
        setField(term606638, term606638.getClass(), "classicAddress", "gFOGAVnoKy");
        setField(term606638, term606638.getClass(), "currency", "TNCsQimVZr");
        setField(term606638, term606638.getClass(), "balance", "dTJYyhSqZb");
        setField(term606638, term606638.getClass(), "limit", "iicxxwOzxG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine$FseTrustLineBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BSnMedHMbT";
        callMethod(klass, "balance", argTypes, term606638, args);
    }

};


