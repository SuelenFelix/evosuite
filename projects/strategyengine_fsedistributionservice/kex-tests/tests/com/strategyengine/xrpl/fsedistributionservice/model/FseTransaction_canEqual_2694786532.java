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

public class FseTransaction_canEqual_2694786532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600468;
     Object term600586;

    public FseTransaction_canEqual_2694786532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term600548 = new Long(-6860884095299687457L);
        term600468 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term600469 = newInstance(Class.forName("java.util.Date"));
        Object term600471 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term600472 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term600474 = (int[]) newIntArray(6);
        setLongField(term600469, term600469.getClass(), "fastTime", 1607071439489L);
        setField(term600469, term600469.getClass(), "cdate", null);
        setField(term600468, term600468.getClass(), "transactionDate", term600469);
        setIntField(term600472, term600472.getClass(), "signum", 1);
        setIntElement(term600474, 0, 2153);
        setIntElement(term600474, 1, -1282453118);
        setIntElement(term600474, 2, -642352868);
        setIntElement(term600474, 3, -60681079);
        setIntElement(term600474, 4, 758225525);
        setIntElement(term600474, 5, 851891499);
        setField(term600472, term600472.getClass(), "mag", term600474);
        setIntField(term600472, term600472.getClass(), "bitCountPlusOne", 0);
        setIntField(term600472, term600472.getClass(), "bitLengthPlusOne", 0);
        setIntField(term600472, term600472.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term600472, term600472.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term600471, term600471.getClass(), "intVal", term600472);
        setIntField(term600471, term600471.getClass(), "scale", 52);
        setIntField(term600471, term600471.getClass(), "precision", 0);
        setField(term600471, term600471.getClass(), "stringCache", null);
        setLongField(term600471, term600471.getClass(), "intCompact", -9223372036854775808L);
        setField(term600468, term600468.getClass(), "amount", term600471);
        setField(term600468, term600468.getClass(), "toAddress", "yNmAFVlbsd");
        setField(term600468, term600468.getClass(), "fromAddress", "OdpsFXVyHb");
        setField(term600468, term600468.getClass(), "currency", "nJYYTNCMan");
        setField(term600468, term600468.getClass(), "issuerAddress", "kfOHuUkyPD");
        setField(term600468, term600468.getClass(), "transactionType", "dPfJJGqFNX");
        setField(term600468, term600468.getClass(), "ledgerIndex", term600548);
        setField(term600468, term600468.getClass(), "transactionHash", "AcpKKvffPO");
        setField(term600468, term600468.getClass(), "resultCode", "nxXgwkBjIn");
        setField(term600468, term600468.getClass(), "reason", "BlUKdVLBNm");
        term600586 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term600586;
        callMethod(klass, "canEqual", argTypes, term600468, args);
    }

};


