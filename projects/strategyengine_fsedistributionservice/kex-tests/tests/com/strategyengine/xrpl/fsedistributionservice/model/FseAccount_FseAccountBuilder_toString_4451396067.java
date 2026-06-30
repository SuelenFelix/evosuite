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
import java.util.ArrayList;
import java.lang.Boolean;

public class FseAccount_FseAccountBuilder_toString_4451396067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78386;

    public FseAccount_FseAccountBuilder_toString_4451396067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78418 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78418, term78418.getClass(), "classicAddress", "");
        setField(term78418, term78418.getClass(), "currency", "");
        setField(term78418, term78418.getClass(), "balance", "");
        setField(term78418, term78418.getClass(), "limit", "");
        Object term78423 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78423, term78423.getClass(), "classicAddress", "");
        setField(term78423, term78423.getClass(), "currency", "");
        setField(term78423, term78423.getClass(), "balance", "");
        setField(term78423, term78423.getClass(), "limit", "");
        Object term78428 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78428, term78428.getClass(), "classicAddress", "");
        setField(term78428, term78428.getClass(), "currency", "");
        setField(term78428, term78428.getClass(), "balance", "");
        setField(term78428, term78428.getClass(), "limit", "");
        Object term78433 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78433, term78433.getClass(), "classicAddress", "");
        setField(term78433, term78433.getClass(), "currency", "");
        setField(term78433, term78433.getClass(), "balance", "");
        setField(term78433, term78433.getClass(), "limit", "");
        Object term78438 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78438, term78438.getClass(), "classicAddress", "");
        setField(term78438, term78438.getClass(), "currency", "");
        setField(term78438, term78438.getClass(), "balance", "");
        setField(term78438, term78438.getClass(), "limit", "");
        ArrayList term78416 = new ArrayList();
        ((ArrayList) term78416).add(term78418);
        ((ArrayList) term78416).add(term78423);
        ((ArrayList) term78416).add(term78428);
        ((ArrayList) term78416).add(term78433);
        ((ArrayList) term78416).add(term78438);
        Boolean term78457 = new Boolean(true);
        term78386 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder"));
        Object term78399 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term78400 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term78402 = (int[]) newIntArray(6);
        setField(term78386, term78386.getClass(), "classicAddress", "zHiuLPzYQM");
        setIntField(term78400, term78400.getClass(), "signum", 1);
        setIntElement(term78402, 0, 25264);
        setIntElement(term78402, 1, 13306318);
        setIntElement(term78402, 2, 145344007);
        setIntElement(term78402, 3, -1015263393);
        setIntElement(term78402, 4, -1366378930);
        setIntElement(term78402, 5, 983206517);
        setField(term78400, term78400.getClass(), "mag", term78402);
        setIntField(term78400, term78400.getClass(), "bitCountPlusOne", 0);
        setIntField(term78400, term78400.getClass(), "bitLengthPlusOne", 0);
        setIntField(term78400, term78400.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term78400, term78400.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term78399, term78399.getClass(), "intVal", term78400);
        setIntField(term78399, term78399.getClass(), "scale", 53);
        setIntField(term78399, term78399.getClass(), "precision", 0);
        setField(term78399, term78399.getClass(), "stringCache", null);
        setLongField(term78399, term78399.getClass(), "intCompact", -9223372036854775808L);
        setField(term78386, term78386.getClass(), "xrpBalance", term78399);
        setField(term78386, term78386.getClass(), "trustLines", term78416);
        setField(term78386, term78386.getClass(), "activationAddress", "cABEHYBnys");
        setField(term78386, term78386.getClass(), "blackholed", term78457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term78386, args);
    }

};


