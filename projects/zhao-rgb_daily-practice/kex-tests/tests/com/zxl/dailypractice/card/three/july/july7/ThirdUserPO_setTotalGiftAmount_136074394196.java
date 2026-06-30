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

public class ThirdUserPO_setTotalGiftAmount_136074394196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15346;

    public ThirdUserPO_setTotalGiftAmount_136074394196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15346 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        setField(term15346, term15346.getClass(), "pkUserId", null);
        setField(term15346, term15346.getClass(), "thirdUserId", null);
        setField(term15346, term15346.getClass(), "thirdType", null);
        setField(term15346, term15346.getClass(), "unionId", null);
        setField(term15346, term15346.getClass(), "name", null);
        setField(term15346, term15346.getClass(), "nickName", null);
        setField(term15346, term15346.getClass(), "phoneNumber", null);
        setField(term15346, term15346.getClass(), "registrationChannel", null);
        setField(term15346, term15346.getClass(), "registrationTime", null);
        setField(term15346, term15346.getClass(), "logoutTime", null);
        setField(term15346, term15346.getClass(), "status", null);
        setField(term15346, term15346.getClass(), "tenantId", null);
        setField(term15346, term15346.getClass(), "createTime", null);
        setField(term15346, term15346.getClass(), "updateTime", null);
        setField(term15346, term15346.getClass(), "deleted", null);
        setField(term15346, term15346.getClass(), "version", null);
        setField(term15346, term15346.getClass(), "createBy", null);
        setField(term15346, term15346.getClass(), "updateBy", null);
        setField(term15346, term15346.getClass(), "firstRechargeTime", null);
        setField(term15346, term15346.getClass(), "totalRechargeAmount", null);
        setField(term15346, term15346.getClass(), "totalGiftAmount", null);
        setField(term15346, term15346.getClass(), "walletBalance", null);
        setField(term15346, term15346.getClass(), "frozenAmount", null);
        setField(term15346, term15346.getClass(), "totalRefund", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTotalGiftAmount", argTypes, term15346, args);
    }

};


