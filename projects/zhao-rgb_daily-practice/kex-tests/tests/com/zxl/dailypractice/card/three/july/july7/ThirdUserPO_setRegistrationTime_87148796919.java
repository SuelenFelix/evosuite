package com.zxl.dailypractice.card.three.july.july7;

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
import static com.zxl.dailypractice.card.three.july.july7.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ThirdUserPO_setRegistrationTime_87148796919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5366;
     Object term5535;

    public ThirdUserPO_setRegistrationTime_87148796919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5495 = new Integer(1072005683);
        Integer term5497 = new Integer(1861318859);
        Integer term5525 = new Integer(1474524152);
        Integer term5527 = new Integer(568954359);
        Integer term5529 = new Integer(53410913);
        Integer term5531 = new Integer(-375014958);
        Integer term5533 = new Integer(1107176718);
        term5366 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term5463 = newInstance(Class.forName("java.util.Date"));
        Object term5465 = newInstance(Class.forName("java.util.Date"));
        Object term5491 = newInstance(Class.forName("java.util.Date"));
        Object term5493 = newInstance(Class.forName("java.util.Date"));
        Object term5523 = newInstance(Class.forName("java.util.Date"));
        setField(term5366, term5366.getClass(), "pkUserId", "NzBMMhkhpT");
        setField(term5366, term5366.getClass(), "thirdUserId", "qCpEbQDHdF");
        setField(term5366, term5366.getClass(), "thirdType", "AHbZyFOmlo");
        setField(term5366, term5366.getClass(), "unionId", "TwfWVQGiIj");
        setField(term5366, term5366.getClass(), "name", "gUvcueTURF");
        setField(term5366, term5366.getClass(), "nickName", "EwQBhZjCIT");
        setField(term5366, term5366.getClass(), "phoneNumber", "aSkmSwTnEw");
        setField(term5366, term5366.getClass(), "registrationChannel", "xvkbvaEGYd");
        setLongField(term5463, term5463.getClass(), "fastTime", 1291280367982L);
        setField(term5463, term5463.getClass(), "cdate", null);
        setField(term5366, term5366.getClass(), "registrationTime", term5463);
        setLongField(term5465, term5465.getClass(), "fastTime", 1491181740539L);
        setField(term5465, term5465.getClass(), "cdate", null);
        setField(term5366, term5366.getClass(), "logoutTime", term5465);
        setField(term5366, term5366.getClass(), "status", "HBGNxdNURv");
        setField(term5366, term5366.getClass(), "tenantId", "mfCpTPPQQm");
        setLongField(term5491, term5491.getClass(), "fastTime", 1461996881310L);
        setField(term5491, term5491.getClass(), "cdate", null);
        setField(term5366, term5366.getClass(), "createTime", term5491);
        setLongField(term5493, term5493.getClass(), "fastTime", 1818968525805L);
        setField(term5493, term5493.getClass(), "cdate", null);
        setField(term5366, term5366.getClass(), "updateTime", term5493);
        setField(term5366, term5366.getClass(), "deleted", term5495);
        setField(term5366, term5366.getClass(), "version", term5497);
        setField(term5366, term5366.getClass(), "createBy", "OcJCIDNIXA");
        setField(term5366, term5366.getClass(), "updateBy", "XfRABIFVEp");
        setLongField(term5523, term5523.getClass(), "fastTime", 1603905786801L);
        setField(term5523, term5523.getClass(), "cdate", null);
        setField(term5366, term5366.getClass(), "firstRechargeTime", term5523);
        setField(term5366, term5366.getClass(), "totalRechargeAmount", term5525);
        setField(term5366, term5366.getClass(), "totalGiftAmount", term5527);
        setField(term5366, term5366.getClass(), "walletBalance", term5529);
        setField(term5366, term5366.getClass(), "frozenAmount", term5531);
        setField(term5366, term5366.getClass(), "totalRefund", term5533);
        term5535 = newInstance(Class.forName("java.util.Date"));
        setLongField(term5535, term5535.getClass(), "fastTime", 1369539267611L);
        setField(term5535, term5535.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term5535;
        callMethod(klass, "setRegistrationTime", argTypes, term5366, args);
    }

};


