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

public class FseTransaction_setLedgerIndex_88551759125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605091;
     Object term605209;

    public FseTransaction_setLedgerIndex_88551759125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term605171 = new Long(4733182453235379235L);
        term605091 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term605092 = newInstance(Class.forName("java.util.Date"));
        Object term605094 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term605095 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term605097 = (int[]) newIntArray(6);
        setLongField(term605092, term605092.getClass(), "fastTime", 1283098767416L);
        setField(term605092, term605092.getClass(), "cdate", null);
        setField(term605091, term605091.getClass(), "transactionDate", term605092);
        setIntField(term605095, term605095.getClass(), "signum", 1);
        setIntElement(term605097, 0, 43625);
        setIntElement(term605097, 1, -604702672);
        setIntElement(term605097, 2, 842202729);
        setIntElement(term605097, 3, 1481892246);
        setIntElement(term605097, 4, -516338068);
        setIntElement(term605097, 5, -882113683);
        setField(term605095, term605095.getClass(), "mag", term605097);
        setIntField(term605095, term605095.getClass(), "bitCountPlusOne", 0);
        setIntField(term605095, term605095.getClass(), "bitLengthPlusOne", 0);
        setIntField(term605095, term605095.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term605095, term605095.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term605094, term605094.getClass(), "intVal", term605095);
        setIntField(term605094, term605094.getClass(), "scale", 53);
        setIntField(term605094, term605094.getClass(), "precision", 0);
        setField(term605094, term605094.getClass(), "stringCache", null);
        setLongField(term605094, term605094.getClass(), "intCompact", -9223372036854775808L);
        setField(term605091, term605091.getClass(), "amount", term605094);
        setField(term605091, term605091.getClass(), "toAddress", "AtXchNEfAh");
        setField(term605091, term605091.getClass(), "fromAddress", "OfUGaofOyl");
        setField(term605091, term605091.getClass(), "currency", "hmqmJaPVoG");
        setField(term605091, term605091.getClass(), "issuerAddress", "pNTxRrBYYn");
        setField(term605091, term605091.getClass(), "transactionType", "EavfKjgzgQ");
        setField(term605091, term605091.getClass(), "ledgerIndex", term605171);
        setField(term605091, term605091.getClass(), "transactionHash", "efyImakJaR");
        setField(term605091, term605091.getClass(), "resultCode", "eryxzqFfFf");
        setField(term605091, term605091.getClass(), "reason", "aAFUdZslxJ");
        term605209 = new Long(-5161762055522201695L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term605209;
        callMethod(klass, "setLedgerIndex", argTypes, term605091, args);
    }

};


