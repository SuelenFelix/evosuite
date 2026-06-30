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

public class ThirdUserPO_getNickName_41023396012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3277;

    public ThirdUserPO_getNickName_41023396012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3406 = new Integer(1540719661);
        Integer term3408 = new Integer(1265463001);
        Integer term3436 = new Integer(335112684);
        Integer term3438 = new Integer(1551099402);
        Integer term3440 = new Integer(-2027534003);
        Integer term3442 = new Integer(1063420942);
        Integer term3444 = new Integer(1375330971);
        term3277 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term3374 = newInstance(Class.forName("java.util.Date"));
        Object term3376 = newInstance(Class.forName("java.util.Date"));
        Object term3402 = newInstance(Class.forName("java.util.Date"));
        Object term3404 = newInstance(Class.forName("java.util.Date"));
        Object term3434 = newInstance(Class.forName("java.util.Date"));
        setField(term3277, term3277.getClass(), "pkUserId", "VMeAzAHwZj");
        setField(term3277, term3277.getClass(), "thirdUserId", "PznxWXsZME");
        setField(term3277, term3277.getClass(), "thirdType", "ZzIujlwVsw");
        setField(term3277, term3277.getClass(), "unionId", "LWyEaeIyAo");
        setField(term3277, term3277.getClass(), "name", "yVMkkQhvmN");
        setField(term3277, term3277.getClass(), "nickName", "mvrkADEgpp");
        setField(term3277, term3277.getClass(), "phoneNumber", "pXOkjyeIRb");
        setField(term3277, term3277.getClass(), "registrationChannel", "GgZWSjxjyE");
        setLongField(term3374, term3374.getClass(), "fastTime", 1802995433545L);
        setField(term3374, term3374.getClass(), "cdate", null);
        setField(term3277, term3277.getClass(), "registrationTime", term3374);
        setLongField(term3376, term3376.getClass(), "fastTime", 1843214817357L);
        setField(term3376, term3376.getClass(), "cdate", null);
        setField(term3277, term3277.getClass(), "logoutTime", term3376);
        setField(term3277, term3277.getClass(), "status", "EeBVbzjcCI");
        setField(term3277, term3277.getClass(), "tenantId", "UfQtPRyWRC");
        setLongField(term3402, term3402.getClass(), "fastTime", 1628695316832L);
        setField(term3402, term3402.getClass(), "cdate", null);
        setField(term3277, term3277.getClass(), "createTime", term3402);
        setLongField(term3404, term3404.getClass(), "fastTime", 1393200035243L);
        setField(term3404, term3404.getClass(), "cdate", null);
        setField(term3277, term3277.getClass(), "updateTime", term3404);
        setField(term3277, term3277.getClass(), "deleted", term3406);
        setField(term3277, term3277.getClass(), "version", term3408);
        setField(term3277, term3277.getClass(), "createBy", "FPvxVzzSvD");
        setField(term3277, term3277.getClass(), "updateBy", "WHcwFgsGFC");
        setLongField(term3434, term3434.getClass(), "fastTime", 1762147441299L);
        setField(term3434, term3434.getClass(), "cdate", null);
        setField(term3277, term3277.getClass(), "firstRechargeTime", term3434);
        setField(term3277, term3277.getClass(), "totalRechargeAmount", term3436);
        setField(term3277, term3277.getClass(), "totalGiftAmount", term3438);
        setField(term3277, term3277.getClass(), "walletBalance", term3440);
        setField(term3277, term3277.getClass(), "frozenAmount", term3442);
        setField(term3277, term3277.getClass(), "totalRefund", term3444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNickName", argTypes, term3277, args);
    }

};


