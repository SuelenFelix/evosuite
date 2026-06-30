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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;

public class AirdropStatus_init_198014406336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205147;
     Object term205150;
     Object term205152;
     Object term205154;
     Object term205156;
     Object term205158;
     Object enum403;
     Object enum404;
     Object term205239;
     Object term205241;
     Object term205243;
     Object enum405;
     Object term205293;
     Object term205307;
     Object enum406;
     Object enum407;
     Object term205375;

    public AirdropStatus_init_198014406336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205147 = new LinkedList();
        term205150 = new Long(-7589547201844161961L);
        term205152 = newInstance(Class.forName("java.util.Date"));
        setLongField(term205152, term205152.getClass(), "fastTime", 1730039204666L);
        setField(term205152, term205152.getClass(), "cdate", null);
        term205154 = newInstance(Class.forName("java.util.Date"));
        setLongField(term205154, term205154.getClass(), "fastTime", 1644599149749L);
        setField(term205154, term205154.getClass(), "cdate", null);
        term205156 = newInstance(Class.forName("java.util.Date"));
        setLongField(term205156, term205156.getClass(), "fastTime", 1879056669403L);
        setField(term205156, term205156.getClass(), "cdate", null);
        term205158 = newInstance(Class.forName("java.util.Date"));
        setLongField(term205158, term205158.getClass(), "fastTime", 1426940357842L);
        setField(term205158, term205158.getClass(), "cdate", null);
        Class<? extends Object> term205378 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term205377 = ((Class) term205378).getDeclaredField((String) "DAILY");
        ((Field) term205377).setAccessible(true);
        enum403 = ((Field) term205377).get((Object) null);
        Class<? extends Object> term205765 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term205764 = ((Class) term205765).getDeclaredField((String) "QUEUED");
        ((Field) term205764).setAccessible(true);
        enum404 = ((Field) term205764).get((Object) null);
        term205239 = new Boolean(true);
        term205241 = new Boolean(false);
        term205243 = new Integer(568954359);
        Class<? extends Object> term206225 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term206224 = ((Class) term206225).getDeclaredField((String) "GLOBALID");
        ((Field) term206224).setAccessible(true);
        enum405 = ((Field) term206224).get((Object) null);
        term205293 = new Long(8847748922379375307L);
        term205307 = new Long(1350676497718116574L);
        Class<? extends Object> term206636 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term206635 = ((Class) term206636).getDeclaredField((String) "FLAT");
        ((Field) term206635).setAccessible(true);
        enum406 = ((Field) term206635).get((Object) null);
        Class<? extends Object> term207050 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term207049 = ((Class) term207050).getDeclaredField((String) "ACTIVE");
        ((Field) term207049).setAccessible(true);
        enum407 = ((Field) term207049).get((Object) null);
        term205375 = new Long(-4477377284889705897L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[30];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.util.Date");
        argTypes[3] = Class.forName("java.util.Date");
        argTypes[4] = Class.forName("java.util.Date");
        argTypes[5] = Class.forName("java.util.Date");
        argTypes[6] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        argTypes[7] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("java.lang.String");
        argTypes[13] = boolean.class;
        argTypes[14] = boolean.class;
        argTypes[15] = Class.forName("java.lang.Integer");
        argTypes[16] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        argTypes[17] = Class.forName("java.lang.String");
        argTypes[18] = Class.forName("java.lang.String");
        argTypes[19] = Class.forName("java.lang.String");
        argTypes[20] = Class.forName("java.lang.Long");
        argTypes[21] = Class.forName("java.lang.String");
        argTypes[22] = Class.forName("java.lang.Long");
        argTypes[23] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        argTypes[24] = Class.forName("java.lang.String");
        argTypes[25] = Class.forName("java.lang.String");
        argTypes[26] = Class.forName("java.lang.String");
        argTypes[27] = Class.forName("java.lang.String");
        argTypes[28] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        argTypes[29] = Class.forName("java.lang.Long");
        Object[] args = new Object[30];
        args[0] = term205147;
        args[1] = term205150;
        args[2] = term205152;
        args[3] = term205154;
        args[4] = term205156;
        args[5] = term205158;
        args[6] = enum403;
        args[7] = enum404;
        args[8] = "dFDHlXwhMk";
        args[9] = "AUMXeSohOi";
        args[10] = "HjZSMjBIEl";
        args[11] = "SQQNAxPlwz";
        args[12] = "AoOgJDNbaF";
        args[13] = term205239;
        args[14] = term205241;
        args[15] = term205243;
        args[16] = enum405;
        args[17] = "PoxurfXwit";
        args[18] = "fhKxidKBbV";
        args[19] = "SIJmlwIkel";
        args[20] = term205293;
        args[21] = "lqucbHOiHE";
        args[22] = term205307;
        args[23] = enum406;
        args[24] = "AtnEadrVWF";
        args[25] = "YghxvBBBOW";
        args[26] = "LHuytJdqwq";
        args[27] = "SqSvcPPMTC";
        args[28] = enum407;
        args[29] = term205375;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


