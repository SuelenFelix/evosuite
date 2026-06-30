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

public class FseAccount_FseAccountBuilder_activationAddress_14715741704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78075;

    public FseAccount_FseAccountBuilder_activationAddress_14715741704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78107 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78107, term78107.getClass(), "classicAddress", "");
        setField(term78107, term78107.getClass(), "currency", "");
        setField(term78107, term78107.getClass(), "balance", "");
        setField(term78107, term78107.getClass(), "limit", "");
        Object term78112 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78112, term78112.getClass(), "classicAddress", "");
        setField(term78112, term78112.getClass(), "currency", "");
        setField(term78112, term78112.getClass(), "balance", "");
        setField(term78112, term78112.getClass(), "limit", "");
        Object term78117 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78117, term78117.getClass(), "classicAddress", "");
        setField(term78117, term78117.getClass(), "currency", "");
        setField(term78117, term78117.getClass(), "balance", "");
        setField(term78117, term78117.getClass(), "limit", "");
        Object term78122 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78122, term78122.getClass(), "classicAddress", "");
        setField(term78122, term78122.getClass(), "currency", "");
        setField(term78122, term78122.getClass(), "balance", "");
        setField(term78122, term78122.getClass(), "limit", "");
        Object term78127 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78127, term78127.getClass(), "classicAddress", "");
        setField(term78127, term78127.getClass(), "currency", "");
        setField(term78127, term78127.getClass(), "balance", "");
        setField(term78127, term78127.getClass(), "limit", "");
        Object term78132 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78132, term78132.getClass(), "classicAddress", "");
        setField(term78132, term78132.getClass(), "currency", "");
        setField(term78132, term78132.getClass(), "balance", "");
        setField(term78132, term78132.getClass(), "limit", "");
        Object term78137 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78137, term78137.getClass(), "classicAddress", "");
        setField(term78137, term78137.getClass(), "currency", "");
        setField(term78137, term78137.getClass(), "balance", "");
        setField(term78137, term78137.getClass(), "limit", "");
        ArrayList term78105 = new ArrayList();
        ((ArrayList) term78105).add(term78107);
        ((ArrayList) term78105).add(term78112);
        ((ArrayList) term78105).add(term78117);
        ((ArrayList) term78105).add(term78122);
        ((ArrayList) term78105).add(term78127);
        ((ArrayList) term78105).add(term78132);
        ((ArrayList) term78105).add(term78137);
        Boolean term78156 = new Boolean(false);
        term78075 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder"));
        Object term78088 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term78089 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term78091 = (int[]) newIntArray(6);
        setField(term78075, term78075.getClass(), "classicAddress", "HCjKwpexJj");
        setIntField(term78089, term78089.getClass(), "signum", 1);
        setIntElement(term78091, 0, 1954);
        setIntElement(term78091, 1, -476668863);
        setIntElement(term78091, 2, 661030673);
        setIntElement(term78091, 3, 328061253);
        setIntElement(term78091, 4, -431156338);
        setIntElement(term78091, 5, 791621529);
        setField(term78089, term78089.getClass(), "mag", term78091);
        setIntField(term78089, term78089.getClass(), "bitCountPlusOne", 0);
        setIntField(term78089, term78089.getClass(), "bitLengthPlusOne", 0);
        setIntField(term78089, term78089.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term78089, term78089.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term78088, term78088.getClass(), "intVal", term78089);
        setIntField(term78088, term78088.getClass(), "scale", 52);
        setIntField(term78088, term78088.getClass(), "precision", 0);
        setField(term78088, term78088.getClass(), "stringCache", null);
        setLongField(term78088, term78088.getClass(), "intCompact", -9223372036854775808L);
        setField(term78075, term78075.getClass(), "xrpBalance", term78088);
        setField(term78075, term78075.getClass(), "trustLines", term78105);
        setField(term78075, term78075.getClass(), "activationAddress", "GDMUlolTNs");
        setField(term78075, term78075.getClass(), "blackholed", term78156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xpLvWisjzN";
        callMethod(klass, "activationAddress", argTypes, term78075, args);
    }

};


