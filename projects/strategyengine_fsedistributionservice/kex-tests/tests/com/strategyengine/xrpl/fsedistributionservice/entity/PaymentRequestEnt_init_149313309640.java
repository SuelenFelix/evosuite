package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;

public class PaymentRequestEnt_init_149313309640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174086;
     Object term174112;
     Object term174114;
     Object term174116;
     Object enum310;
     Object enum311;
     Object term174246;
     Object term174248;
     Object term174250;
     Object enum312;
     Object term174337;
     Object term174351;
     Object term174365;

    public PaymentRequestEnt_init_149313309640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174086 = new Long(-6423955170741487890L);
        term174112 = newInstance(Class.forName("java.util.Date"));
        setLongField(term174112, term174112.getClass(), "fastTime", 1502037591876L);
        setField(term174112, term174112.getClass(), "cdate", null);
        term174114 = newInstance(Class.forName("java.util.Date"));
        setLongField(term174114, term174114.getClass(), "fastTime", 1756486234335L);
        setField(term174114, term174114.getClass(), "cdate", null);
        term174116 = newInstance(Class.forName("java.util.Date"));
        setLongField(term174116, term174116.getClass(), "fastTime", 1867127401489L);
        setField(term174116, term174116.getClass(), "cdate", null);
        Class<? extends Object> term174400 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term174399 = ((Class) term174400).getDeclaredField((String) "COMPLETE");
        ((Field) term174399).setAccessible(true);
        enum310 = ((Field) term174399).get((Object) null);
        Class<? extends Object> term174906 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term174905 = ((Class) term174906).getDeclaredField((String) "FLAT");
        ((Field) term174905).setAccessible(true);
        enum311 = ((Field) term174905).get((Object) null);
        term174246 = new Boolean(true);
        term174248 = new Boolean(true);
        term174250 = new Integer(1386130016);
        Class<? extends Object> term175280 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term175279 = ((Class) term175280).getDeclaredField((String) "TRUSTLINE");
        ((Field) term175279).setAccessible(true);
        enum312 = ((Field) term175279).get((Object) null);
        term174337 = new Long(-4663904610228258188L);
        term174351 = new Long(3824691451696451167L);
        term174365 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[33];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.Date");
        argTypes[4] = Class.forName("java.util.Date");
        argTypes[5] = Class.forName("java.util.Date");
        argTypes[6] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("java.lang.String");
        argTypes[13] = Class.forName("java.lang.String");
        argTypes[14] = Class.forName("java.lang.String");
        argTypes[15] = Class.forName("java.lang.String");
        argTypes[16] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        argTypes[17] = Class.forName("java.lang.Boolean");
        argTypes[18] = Class.forName("java.lang.Boolean");
        argTypes[19] = Class.forName("java.lang.Integer");
        argTypes[20] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        argTypes[21] = Class.forName("java.lang.String");
        argTypes[22] = Class.forName("java.lang.String");
        argTypes[23] = Class.forName("java.lang.String");
        argTypes[24] = Class.forName("java.lang.String");
        argTypes[25] = Class.forName("java.lang.String");
        argTypes[26] = Class.forName("java.lang.String");
        argTypes[27] = Class.forName("java.lang.Long");
        argTypes[28] = Class.forName("java.lang.String");
        argTypes[29] = Class.forName("java.lang.Long");
        argTypes[30] = Class.forName("java.lang.String");
        argTypes[31] = Class.forName("java.lang.Boolean");
        argTypes[32] = Class.forName("java.lang.String");
        Object[] args = new Object[33];
        args[0] = term174086;
        args[1] = "RlyxtfCqKY";
        args[2] = "kyTUkLCRYm";
        args[3] = term174112;
        args[4] = term174114;
        args[5] = term174116;
        args[6] = enum310;
        args[7] = "oAotZgNUFH";
        args[8] = "TowhQcovXu";
        args[9] = "UFGOnIMOzf";
        args[10] = "ySiyRlAQpt";
        args[11] = "MiankJgKCp";
        args[12] = "lmZBCmpOeb";
        args[13] = "cPlYOAUqsP";
        args[14] = "ritBUyuuKt";
        args[15] = "YfziBBiPvL";
        args[16] = enum311;
        args[17] = term174246;
        args[18] = term174248;
        args[19] = term174250;
        args[20] = enum312;
        args[21] = "lNBaHEkYui";
        args[22] = "BqxRCYZwmn";
        args[23] = "KHPDZjrXQp";
        args[24] = "fpyUFzdCwQ";
        args[25] = "OQqBkSGDem";
        args[26] = "vZzZOvsIYn";
        args[27] = term174337;
        args[28] = "pAIBwhAbDu";
        args[29] = term174351;
        args[30] = "iqhNUjVbRG";
        args[31] = term174365;
        args[32] = "SSqIrPwJXd";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


