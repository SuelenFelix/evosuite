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

public class ThirdUserPO_getStatus_69076671622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6237;

    public ThirdUserPO_getStatus_69076671622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6366 = new Integer(-1565502840);
        Integer term6368 = new Integer(344323424);
        Integer term6396 = new Integer(9726679);
        Integer term6398 = new Integer(-25637976);
        Integer term6400 = new Integer(1555897383);
        Integer term6402 = new Integer(202001407);
        Integer term6404 = new Integer(158873461);
        term6237 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term6334 = newInstance(Class.forName("java.util.Date"));
        Object term6336 = newInstance(Class.forName("java.util.Date"));
        Object term6362 = newInstance(Class.forName("java.util.Date"));
        Object term6364 = newInstance(Class.forName("java.util.Date"));
        Object term6394 = newInstance(Class.forName("java.util.Date"));
        setField(term6237, term6237.getClass(), "pkUserId", "ZKMLioamsY");
        setField(term6237, term6237.getClass(), "thirdUserId", "WVbxuoDBcn");
        setField(term6237, term6237.getClass(), "thirdType", "pvDEABOxLt");
        setField(term6237, term6237.getClass(), "unionId", "beAMpkroCQ");
        setField(term6237, term6237.getClass(), "name", "uSUvKAyuvd");
        setField(term6237, term6237.getClass(), "nickName", "onQLVONGuf");
        setField(term6237, term6237.getClass(), "phoneNumber", "SOrEHbcbmn");
        setField(term6237, term6237.getClass(), "registrationChannel", "bnsyeQXFdu");
        setLongField(term6334, term6334.getClass(), "fastTime", 1342877876146L);
        setField(term6334, term6334.getClass(), "cdate", null);
        setField(term6237, term6237.getClass(), "registrationTime", term6334);
        setLongField(term6336, term6336.getClass(), "fastTime", 1511283614327L);
        setField(term6336, term6336.getClass(), "cdate", null);
        setField(term6237, term6237.getClass(), "logoutTime", term6336);
        setField(term6237, term6237.getClass(), "status", "BwtdjiefJn");
        setField(term6237, term6237.getClass(), "tenantId", "jDmhBrIoDa");
        setLongField(term6362, term6362.getClass(), "fastTime", 1758773264597L);
        setField(term6362, term6362.getClass(), "cdate", null);
        setField(term6237, term6237.getClass(), "createTime", term6362);
        setLongField(term6364, term6364.getClass(), "fastTime", 1303889782295L);
        setField(term6364, term6364.getClass(), "cdate", null);
        setField(term6237, term6237.getClass(), "updateTime", term6364);
        setField(term6237, term6237.getClass(), "deleted", term6366);
        setField(term6237, term6237.getClass(), "version", term6368);
        setField(term6237, term6237.getClass(), "createBy", "SPtPatHeOm");
        setField(term6237, term6237.getClass(), "updateBy", "ywmcuThdfL");
        setLongField(term6394, term6394.getClass(), "fastTime", 1316972437233L);
        setField(term6394, term6394.getClass(), "cdate", null);
        setField(term6237, term6237.getClass(), "firstRechargeTime", term6394);
        setField(term6237, term6237.getClass(), "totalRechargeAmount", term6396);
        setField(term6237, term6237.getClass(), "totalGiftAmount", term6398);
        setField(term6237, term6237.getClass(), "walletBalance", term6400);
        setField(term6237, term6237.getClass(), "frozenAmount", term6402);
        setField(term6237, term6237.getClass(), "totalRefund", term6404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term6237, args);
    }

};


