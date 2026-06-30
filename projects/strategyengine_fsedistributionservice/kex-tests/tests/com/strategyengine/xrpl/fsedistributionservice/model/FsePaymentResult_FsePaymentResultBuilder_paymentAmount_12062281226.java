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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FsePaymentResult_FsePaymentResultBuilder_paymentAmount_12062281226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15164;

    public FsePaymentResult_FsePaymentResultBuilder_paymentAmount_12062281226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15165 = new Long(2120084523938730454L);
        Class<? extends Object> term15292 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term15291 = ((Class) term15292).getDeclaredField((String) "FAILED");
        ((Field) term15291).setAccessible(true);
        Object enum26 = ((Field) term15291).get((Object) null);
        term15164 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder"));
        setField(term15164, term15164.getClass(), "id", term15165);
        setField(term15164, term15164.getClass(), "responseCode", "uPuCVuZYOI");
        setField(term15164, term15164.getClass(), "reason", "TweMFhxNdj");
        setField(term15164, term15164.getClass(), "classicAddress", "NBrvVzvQHe");
        setField(term15164, term15164.getClass(), "status", enum26);
        setField(term15164, term15164.getClass(), "paymentAmount", "FjOiNAfBOc");
        setField(term15164, term15164.getClass(), "snapshotBalance", "iCCsaLHohG");
        setField(term15164, term15164.getClass(), "nftOwned", "NJhGgctbdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MYWYUeLGOp";
        callMethod(klass, "paymentAmount", argTypes, term15164, args);
    }

};


