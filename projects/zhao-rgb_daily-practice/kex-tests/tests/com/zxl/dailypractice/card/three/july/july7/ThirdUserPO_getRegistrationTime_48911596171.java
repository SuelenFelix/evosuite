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

public class ThirdUserPO_getRegistrationTime_48911596171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15321;

    public ThirdUserPO_getRegistrationTime_48911596171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15321 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        setField(term15321, term15321.getClass(), "pkUserId", null);
        setField(term15321, term15321.getClass(), "thirdUserId", null);
        setField(term15321, term15321.getClass(), "thirdType", null);
        setField(term15321, term15321.getClass(), "unionId", null);
        setField(term15321, term15321.getClass(), "name", null);
        setField(term15321, term15321.getClass(), "nickName", null);
        setField(term15321, term15321.getClass(), "phoneNumber", null);
        setField(term15321, term15321.getClass(), "registrationChannel", null);
        setField(term15321, term15321.getClass(), "registrationTime", null);
        setField(term15321, term15321.getClass(), "logoutTime", null);
        setField(term15321, term15321.getClass(), "status", null);
        setField(term15321, term15321.getClass(), "tenantId", null);
        setField(term15321, term15321.getClass(), "createTime", null);
        setField(term15321, term15321.getClass(), "updateTime", null);
        setField(term15321, term15321.getClass(), "deleted", null);
        setField(term15321, term15321.getClass(), "version", null);
        setField(term15321, term15321.getClass(), "createBy", null);
        setField(term15321, term15321.getClass(), "updateBy", null);
        setField(term15321, term15321.getClass(), "firstRechargeTime", null);
        setField(term15321, term15321.getClass(), "totalRechargeAmount", null);
        setField(term15321, term15321.getClass(), "totalGiftAmount", null);
        setField(term15321, term15321.getClass(), "walletBalance", null);
        setField(term15321, term15321.getClass(), "frozenAmount", null);
        setField(term15321, term15321.getClass(), "totalRefund", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegistrationTime", argTypes, term15321, args);
    }

};


