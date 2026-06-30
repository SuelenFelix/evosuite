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

public class FseTransaction_FseTransactionBuilder_transactionType_16899377487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term565158;

    public FseTransaction_FseTransactionBuilder_transactionType_16899377487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term565238 = new Long(3872000207938391416L);
        term565158 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        Object term565159 = newInstance(Class.forName("java.util.Date"));
        Object term565161 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term565162 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term565164 = (int[]) newIntArray(6);
        setLongField(term565159, term565159.getClass(), "fastTime", 1557544568265L);
        setField(term565159, term565159.getClass(), "cdate", null);
        setField(term565158, term565158.getClass(), "transactionDate", term565159);
        setIntField(term565162, term565162.getClass(), "signum", 1);
        setIntElement(term565164, 0, 56264);
        setIntElement(term565164, 1, -689615198);
        setIntElement(term565164, 2, 1027150763);
        setIntElement(term565164, 3, 3972545);
        setIntElement(term565164, 4, 1573519667);
        setIntElement(term565164, 5, 356611003);
        setField(term565162, term565162.getClass(), "mag", term565164);
        setIntField(term565162, term565162.getClass(), "bitCountPlusOne", 0);
        setIntField(term565162, term565162.getClass(), "bitLengthPlusOne", 0);
        setIntField(term565162, term565162.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term565162, term565162.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term565161, term565161.getClass(), "intVal", term565162);
        setIntField(term565161, term565161.getClass(), "scale", 53);
        setIntField(term565161, term565161.getClass(), "precision", 0);
        setField(term565161, term565161.getClass(), "stringCache", null);
        setLongField(term565161, term565161.getClass(), "intCompact", -9223372036854775808L);
        setField(term565158, term565158.getClass(), "amount", term565161);
        setField(term565158, term565158.getClass(), "toAddress", "luuujjjCiB");
        setField(term565158, term565158.getClass(), "fromAddress", "NmhbsBItoX");
        setField(term565158, term565158.getClass(), "currency", "mhLgHXafNK");
        setField(term565158, term565158.getClass(), "issuerAddress", "CTpcEYMWUA");
        setField(term565158, term565158.getClass(), "transactionType", "cBLCFxQTwr");
        setField(term565158, term565158.getClass(), "ledgerIndex", term565238);
        setField(term565158, term565158.getClass(), "transactionHash", "bAPuGgLDDP");
        setField(term565158, term565158.getClass(), "resultCode", "zDqBWnYkse");
        setField(term565158, term565158.getClass(), "reason", "aJCCJNpMCR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mMmhYmbxdG";
        callMethod(klass, "transactionType", argTypes, term565158, args);
    }

};


