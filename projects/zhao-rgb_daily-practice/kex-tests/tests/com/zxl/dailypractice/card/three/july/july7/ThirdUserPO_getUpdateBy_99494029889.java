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

public class ThirdUserPO_getUpdateBy_99494029889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15339;

    public ThirdUserPO_getUpdateBy_99494029889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15339 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        setField(term15339, term15339.getClass(), "pkUserId", null);
        setField(term15339, term15339.getClass(), "thirdUserId", null);
        setField(term15339, term15339.getClass(), "thirdType", null);
        setField(term15339, term15339.getClass(), "unionId", null);
        setField(term15339, term15339.getClass(), "name", null);
        setField(term15339, term15339.getClass(), "nickName", null);
        setField(term15339, term15339.getClass(), "phoneNumber", null);
        setField(term15339, term15339.getClass(), "registrationChannel", null);
        setField(term15339, term15339.getClass(), "registrationTime", null);
        setField(term15339, term15339.getClass(), "logoutTime", null);
        setField(term15339, term15339.getClass(), "status", null);
        setField(term15339, term15339.getClass(), "tenantId", null);
        setField(term15339, term15339.getClass(), "createTime", null);
        setField(term15339, term15339.getClass(), "updateTime", null);
        setField(term15339, term15339.getClass(), "deleted", null);
        setField(term15339, term15339.getClass(), "version", null);
        setField(term15339, term15339.getClass(), "createBy", null);
        setField(term15339, term15339.getClass(), "updateBy", null);
        setField(term15339, term15339.getClass(), "firstRechargeTime", null);
        setField(term15339, term15339.getClass(), "totalRechargeAmount", null);
        setField(term15339, term15339.getClass(), "totalGiftAmount", null);
        setField(term15339, term15339.getClass(), "walletBalance", null);
        setField(term15339, term15339.getClass(), "frozenAmount", null);
        setField(term15339, term15339.getClass(), "totalRefund", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateBy", argTypes, term15339, args);
    }

};


