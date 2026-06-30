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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

public class FsePaymentRequest_init_70393455331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375422;
     Object term375495;
     Object term375533;
     Object term375547;
     Object term375549;
     Object term375551;
     Object enum722;
     Object term375597;
     Object enum723;
     Object term375609;
     Object term375623;

    public FsePaymentRequest_init_70393455331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375422 = new LinkedList();
        ((LinkedList) term375422).add("fdqPCobvDf");
        ((LinkedList) term375422).add("aMrnCqYOLU");
        ((LinkedList) term375422).add("");
        ((LinkedList) term375422).add((Object)null);
        ((LinkedList) term375422).add((Object)null);
        ((LinkedList) term375422).add((Object)null);
        ((LinkedList) term375422).add((Object)null);
        ((LinkedList) term375422).add((Object)null);
        term375495 = newInstance(Class.forName("java.util.Date"));
        setLongField(term375495, term375495.getClass(), "fastTime", 1332619715133L);
        setField(term375495, term375495.getClass(), "cdate", null);
        term375533 = new Boolean(true);
        term375547 = new Boolean(false);
        term375549 = new Boolean(true);
        term375551 = new Long(-8147385208615265440L);
        Class<? extends Object> term375736 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term375735 = ((Class) term375736).getDeclaredField((String) "FLAT");
        ((Field) term375735).setAccessible(true);
        enum722 = ((Field) term375735).get((Object) null);
        term375597 = new Long(2169332993170315110L);
        Class<? extends Object> term376140 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term376139 = ((Class) term376140).getDeclaredField((String) "WEEKLY");
        ((Field) term376139).setAccessible(true);
        enum723 = ((Field) term376139).get((Object) null);
        term375609 = newInstance(Class.forName("java.util.Date"));
        setLongField(term375609, term375609.getClass(), "fastTime", 1561164757620L);
        setField(term375609, term375609.getClass(), "cdate", null);
        term375623 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[24];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.util.Date");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = boolean.class;
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = boolean.class;
        argTypes[13] = boolean.class;
        argTypes[14] = Class.forName("java.lang.Long");
        argTypes[15] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        argTypes[16] = Class.forName("java.lang.String");
        argTypes[17] = Class.forName("java.lang.String");
        argTypes[18] = Class.forName("java.lang.String");
        argTypes[19] = Class.forName("java.lang.Long");
        argTypes[20] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        argTypes[21] = Class.forName("java.util.Date");
        argTypes[22] = Class.forName("java.lang.String");
        argTypes[23] = boolean.class;
        Object[] args = new Object[24];
        args[0] = "VASBLRBXui";
        args[1] = "stiYhZjwjf";
        args[2] = "eNhTkzISMP";
        args[3] = "TOoaOPcTTB";
        args[4] = term375422;
        args[5] = "xdaMoiPzcT";
        args[6] = term375495;
        args[7] = "cNgzDmCExR";
        args[8] = "OVIRthBBTP";
        args[9] = "PMNZjFOSxe";
        args[10] = term375533;
        args[11] = "RunVMgFFZo";
        args[12] = term375547;
        args[13] = term375549;
        args[14] = term375551;
        args[15] = enum722;
        args[16] = "WFOAbiqZtY";
        args[17] = "fDdzXpgVRo";
        args[18] = "FHYonZSkfn";
        args[19] = term375597;
        args[20] = enum723;
        args[21] = term375609;
        args[22] = "PiMqofRFQi";
        args[23] = term375623;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


