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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FsePaymentTrustlinesRequest_init_55357710231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50003;
     Object term50005;
     Object term50007;
     Object term50009;
     Object term50011;
     Object term50013;
     Object term50015;
     Object term50029;
     Object enum89;
     Object term50063;
     Object enum90;
     Object term50074;
     Object term50088;

    public FsePaymentTrustlinesRequest_init_55357710231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50003 = new Boolean(true);
        term50005 = new Boolean(false);
        term50007 = new Boolean(true);
        term50009 = new Boolean(false);
        term50011 = new Integer(1632125673);
        term50013 = new Double(0.426231085465289);
        term50015 = new Double(0.0027299293098262956);
        term50029 = new Long(-8654565919063661957L);
        Class<? extends Object> term50171 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term50170 = ((Class) term50171).getDeclaredField((String) "FLAT");
        ((Field) term50170).setAccessible(true);
        enum89 = ((Field) term50170).get((Object) null);
        term50063 = newInstance(Class.forName("java.util.Date"));
        setLongField(term50063, term50063.getClass(), "fastTime", 1531331402053L);
        setField(term50063, term50063.getClass(), "cdate", null);
        Class<? extends Object> term50565 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term50564 = ((Class) term50565).getDeclaredField((String) "DAILY");
        ((Field) term50564).setAccessible(true);
        enum90 = ((Field) term50564).get((Object) null);
        term50074 = newInstance(Class.forName("java.util.Date"));
        setLongField(term50074, term50074.getClass(), "fastTime", 1264037800343L);
        setField(term50074, term50074.getClass(), "cdate", null);
        term50088 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[24];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = boolean.class;
        argTypes[8] = boolean.class;
        argTypes[9] = boolean.class;
        argTypes[10] = boolean.class;
        argTypes[11] = Class.forName("java.lang.Integer");
        argTypes[12] = Class.forName("java.lang.Double");
        argTypes[13] = Class.forName("java.lang.Double");
        argTypes[14] = Class.forName("java.lang.String");
        argTypes[15] = Class.forName("java.lang.Long");
        argTypes[16] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        argTypes[17] = Class.forName("java.lang.String");
        argTypes[18] = Class.forName("java.lang.String");
        argTypes[19] = Class.forName("java.util.Date");
        argTypes[20] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        argTypes[21] = Class.forName("java.util.Date");
        argTypes[22] = Class.forName("java.lang.String");
        argTypes[23] = boolean.class;
        Object[] args = new Object[24];
        args[0] = "dAbwpJCDif";
        args[1] = "ATSXJPySio";
        args[2] = "XZkOUcbfFg";
        args[3] = "TGiJfagfky";
        args[4] = "BJklinBmhN";
        args[5] = "IOddzvEWcl";
        args[6] = "bIrtpkYJWT";
        args[7] = term50003;
        args[8] = term50005;
        args[9] = term50007;
        args[10] = term50009;
        args[11] = term50011;
        args[12] = term50013;
        args[13] = term50015;
        args[14] = "VuLLXpvPpZ";
        args[15] = term50029;
        args[16] = enum89;
        args[17] = "UEdzEKEEEV";
        args[18] = "BcENaQFYSd";
        args[19] = term50063;
        args[20] = enum90;
        args[21] = term50074;
        args[22] = "POPYycoDBy";
        args[23] = term50088;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


