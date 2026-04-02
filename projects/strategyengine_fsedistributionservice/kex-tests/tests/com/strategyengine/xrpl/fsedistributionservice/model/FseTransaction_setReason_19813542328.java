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

public class FseTransaction_setReason_19813542328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605749;

    public FseTransaction_setReason_19813542328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term605829 = new Long(-2035190444044214401L);
        term605749 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term605750 = newInstance(Class.forName("java.util.Date"));
        Object term605752 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term605753 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term605755 = (int[]) newIntArray(6);
        setLongField(term605750, term605750.getClass(), "fastTime", 1296746508883L);
        setField(term605750, term605750.getClass(), "cdate", null);
        setField(term605749, term605749.getClass(), "transactionDate", term605750);
        setIntField(term605753, term605753.getClass(), "signum", 1);
        setIntElement(term605755, 0, 4897);
        setIntElement(term605755, 1, -1282823273);
        setIntElement(term605755, 2, -1737017744);
        setIntElement(term605755, 3, 1681608159);
        setIntElement(term605755, 4, -327801895);
        setIntElement(term605755, 5, -1092123993);
        setField(term605753, term605753.getClass(), "mag", term605755);
        setIntField(term605753, term605753.getClass(), "bitCountPlusOne", 0);
        setIntField(term605753, term605753.getClass(), "bitLengthPlusOne", 0);
        setIntField(term605753, term605753.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term605753, term605753.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term605752, term605752.getClass(), "intVal", term605753);
        setIntField(term605752, term605752.getClass(), "scale", 52);
        setIntField(term605752, term605752.getClass(), "precision", 0);
        setField(term605752, term605752.getClass(), "stringCache", null);
        setLongField(term605752, term605752.getClass(), "intCompact", -9223372036854775808L);
        setField(term605749, term605749.getClass(), "amount", term605752);
        setField(term605749, term605749.getClass(), "toAddress", "ednhFNlubd");
        setField(term605749, term605749.getClass(), "fromAddress", "YIcytpxQpg");
        setField(term605749, term605749.getClass(), "currency", "nLdiDnEtGa");
        setField(term605749, term605749.getClass(), "issuerAddress", "XepaExohUu");
        setField(term605749, term605749.getClass(), "transactionType", "hTcLgWjgVZ");
        setField(term605749, term605749.getClass(), "ledgerIndex", term605829);
        setField(term605749, term605749.getClass(), "transactionHash", "HJuxBeseep");
        setField(term605749, term605749.getClass(), "resultCode", "pJhaEHvvEJ");
        setField(term605749, term605749.getClass(), "reason", "uUawepHlyb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fdERpSvfXR";
        callMethod(klass, "setReason", argTypes, term605749, args);
    }

};


