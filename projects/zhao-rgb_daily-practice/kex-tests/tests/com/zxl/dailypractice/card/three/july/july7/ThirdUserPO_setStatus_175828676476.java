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

public class ThirdUserPO_setStatus_175828676476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15326;

    public ThirdUserPO_setStatus_175828676476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15326 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        setField(term15326, term15326.getClass(), "pkUserId", null);
        setField(term15326, term15326.getClass(), "thirdUserId", null);
        setField(term15326, term15326.getClass(), "thirdType", null);
        setField(term15326, term15326.getClass(), "unionId", null);
        setField(term15326, term15326.getClass(), "name", null);
        setField(term15326, term15326.getClass(), "nickName", null);
        setField(term15326, term15326.getClass(), "phoneNumber", null);
        setField(term15326, term15326.getClass(), "registrationChannel", null);
        setField(term15326, term15326.getClass(), "registrationTime", null);
        setField(term15326, term15326.getClass(), "logoutTime", null);
        setField(term15326, term15326.getClass(), "status", null);
        setField(term15326, term15326.getClass(), "tenantId", null);
        setField(term15326, term15326.getClass(), "createTime", null);
        setField(term15326, term15326.getClass(), "updateTime", null);
        setField(term15326, term15326.getClass(), "deleted", null);
        setField(term15326, term15326.getClass(), "version", null);
        setField(term15326, term15326.getClass(), "createBy", null);
        setField(term15326, term15326.getClass(), "updateBy", null);
        setField(term15326, term15326.getClass(), "firstRechargeTime", null);
        setField(term15326, term15326.getClass(), "totalRechargeAmount", null);
        setField(term15326, term15326.getClass(), "totalGiftAmount", null);
        setField(term15326, term15326.getClass(), "walletBalance", null);
        setField(term15326, term15326.getClass(), "frozenAmount", null);
        setField(term15326, term15326.getClass(), "totalRefund", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStatus", argTypes, term15326, args);
    }

};


