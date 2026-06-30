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
import java.lang.Object;
import java.lang.Long;

public class FseTransaction_getIssuerAddress_132054424410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602101;

    public FseTransaction_getIssuerAddress_132054424410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term602181 = new Long(7744119580121297988L);
        term602101 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term602102 = newInstance(Class.forName("java.util.Date"));
        Object term602104 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term602105 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term602107 = (int[]) newIntArray(6);
        setLongField(term602102, term602102.getClass(), "fastTime", 1747477149580L);
        setField(term602102, term602102.getClass(), "cdate", null);
        setField(term602101, term602101.getClass(), "transactionDate", term602102);
        setIntField(term602105, term602105.getClass(), "signum", 1);
        setIntElement(term602107, 0, 1509);
        setIntElement(term602107, 1, 1606188749);
        setIntElement(term602107, 2, 108934561);
        setIntElement(term602107, 3, -1699947404);
        setIntElement(term602107, 4, 1301870071);
        setIntElement(term602107, 5, -338348233);
        setField(term602105, term602105.getClass(), "mag", term602107);
        setIntField(term602105, term602105.getClass(), "bitCountPlusOne", 0);
        setIntField(term602105, term602105.getClass(), "bitLengthPlusOne", 0);
        setIntField(term602105, term602105.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term602105, term602105.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term602104, term602104.getClass(), "intVal", term602105);
        setIntField(term602104, term602104.getClass(), "scale", 52);
        setIntField(term602104, term602104.getClass(), "precision", 0);
        setField(term602104, term602104.getClass(), "stringCache", null);
        setLongField(term602104, term602104.getClass(), "intCompact", -9223372036854775808L);
        setField(term602101, term602101.getClass(), "amount", term602104);
        setField(term602101, term602101.getClass(), "toAddress", "MSwWSxHYib");
        setField(term602101, term602101.getClass(), "fromAddress", "bVOxJayYiq");
        setField(term602101, term602101.getClass(), "currency", "qjysmKMiKT");
        setField(term602101, term602101.getClass(), "issuerAddress", "IdvxsTXhfI");
        setField(term602101, term602101.getClass(), "transactionType", "dqJbExUvup");
        setField(term602101, term602101.getClass(), "ledgerIndex", term602181);
        setField(term602101, term602101.getClass(), "transactionHash", "TcgeOuVhBl");
        setField(term602101, term602101.getClass(), "resultCode", "EsGOUSyjcl");
        setField(term602101, term602101.getClass(), "reason", "MrcebsjLJc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIssuerAddress", argTypes, term602101, args);
    }

};


