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

public class ThirdUserPO_setFrozenAmount_187378875747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13566;
     Object term13735;

    public ThirdUserPO_setFrozenAmount_187378875747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13695 = new Integer(-648200466);
        Integer term13697 = new Integer(2007134147);
        Integer term13725 = new Integer(993388358);
        Integer term13727 = new Integer(-765191335);
        Integer term13729 = new Integer(-1697741155);
        Integer term13731 = new Integer(1295839803);
        Integer term13733 = new Integer(-1891015523);
        term13566 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term13663 = newInstance(Class.forName("java.util.Date"));
        Object term13665 = newInstance(Class.forName("java.util.Date"));
        Object term13691 = newInstance(Class.forName("java.util.Date"));
        Object term13693 = newInstance(Class.forName("java.util.Date"));
        Object term13723 = newInstance(Class.forName("java.util.Date"));
        setField(term13566, term13566.getClass(), "pkUserId", "ONcbPCQnHd");
        setField(term13566, term13566.getClass(), "thirdUserId", "AobDaplFLl");
        setField(term13566, term13566.getClass(), "thirdType", "pDkMNnAGgv");
        setField(term13566, term13566.getClass(), "unionId", "PaCpFXGzdX");
        setField(term13566, term13566.getClass(), "name", "FftYCNbnks");
        setField(term13566, term13566.getClass(), "nickName", "lJoltmsadS");
        setField(term13566, term13566.getClass(), "phoneNumber", "mvfDtZNEHr");
        setField(term13566, term13566.getClass(), "registrationChannel", "bvSgmFUDOU");
        setLongField(term13663, term13663.getClass(), "fastTime", 1590252100843L);
        setField(term13663, term13663.getClass(), "cdate", null);
        setField(term13566, term13566.getClass(), "registrationTime", term13663);
        setLongField(term13665, term13665.getClass(), "fastTime", 1674664953654L);
        setField(term13665, term13665.getClass(), "cdate", null);
        setField(term13566, term13566.getClass(), "logoutTime", term13665);
        setField(term13566, term13566.getClass(), "status", "XMHwbfiHRl");
        setField(term13566, term13566.getClass(), "tenantId", "bucTnYicnp");
        setLongField(term13691, term13691.getClass(), "fastTime", 1726911068143L);
        setField(term13691, term13691.getClass(), "cdate", null);
        setField(term13566, term13566.getClass(), "createTime", term13691);
        setLongField(term13693, term13693.getClass(), "fastTime", 1298065306825L);
        setField(term13693, term13693.getClass(), "cdate", null);
        setField(term13566, term13566.getClass(), "updateTime", term13693);
        setField(term13566, term13566.getClass(), "deleted", term13695);
        setField(term13566, term13566.getClass(), "version", term13697);
        setField(term13566, term13566.getClass(), "createBy", "EkgprvqZlM");
        setField(term13566, term13566.getClass(), "updateBy", "fbnKvthhOz");
        setLongField(term13723, term13723.getClass(), "fastTime", 1640050684068L);
        setField(term13723, term13723.getClass(), "cdate", null);
        setField(term13566, term13566.getClass(), "firstRechargeTime", term13723);
        setField(term13566, term13566.getClass(), "totalRechargeAmount", term13725);
        setField(term13566, term13566.getClass(), "totalGiftAmount", term13727);
        setField(term13566, term13566.getClass(), "walletBalance", term13729);
        setField(term13566, term13566.getClass(), "frozenAmount", term13731);
        setField(term13566, term13566.getClass(), "totalRefund", term13733);
        term13735 = new Integer(-1560631747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term13735;
        callMethod(klass, "setFrozenAmount", argTypes, term13566, args);
    }

};


