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

public class ThirdUserPO_getUpdateBy_99494029836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10357;

    public ThirdUserPO_getUpdateBy_99494029836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10486 = new Integer(534834644);
        Integer term10488 = new Integer(1959097203);
        Integer term10516 = new Integer(-209654048);
        Integer term10518 = new Integer(477625804);
        Integer term10520 = new Integer(252575029);
        Integer term10522 = new Integer(57189932);
        Integer term10524 = new Integer(1460722225);
        term10357 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term10454 = newInstance(Class.forName("java.util.Date"));
        Object term10456 = newInstance(Class.forName("java.util.Date"));
        Object term10482 = newInstance(Class.forName("java.util.Date"));
        Object term10484 = newInstance(Class.forName("java.util.Date"));
        Object term10514 = newInstance(Class.forName("java.util.Date"));
        setField(term10357, term10357.getClass(), "pkUserId", "lKrEAkypza");
        setField(term10357, term10357.getClass(), "thirdUserId", "KtuuNAqGCQ");
        setField(term10357, term10357.getClass(), "thirdType", "OGQsfjmReM");
        setField(term10357, term10357.getClass(), "unionId", "YsUtbngnRO");
        setField(term10357, term10357.getClass(), "name", "JisaWUxcNb");
        setField(term10357, term10357.getClass(), "nickName", "NxgmYPzWCI");
        setField(term10357, term10357.getClass(), "phoneNumber", "SqjyKmayBx");
        setField(term10357, term10357.getClass(), "registrationChannel", "XjDhvToxJy");
        setLongField(term10454, term10454.getClass(), "fastTime", 1423095600176L);
        setField(term10454, term10454.getClass(), "cdate", null);
        setField(term10357, term10357.getClass(), "registrationTime", term10454);
        setLongField(term10456, term10456.getClass(), "fastTime", 1890789814165L);
        setField(term10456, term10456.getClass(), "cdate", null);
        setField(term10357, term10357.getClass(), "logoutTime", term10456);
        setField(term10357, term10357.getClass(), "status", "nxSTJflLQy");
        setField(term10357, term10357.getClass(), "tenantId", "FlHzxEfFzI");
        setLongField(term10482, term10482.getClass(), "fastTime", 1368069438412L);
        setField(term10482, term10482.getClass(), "cdate", null);
        setField(term10357, term10357.getClass(), "createTime", term10482);
        setLongField(term10484, term10484.getClass(), "fastTime", 1836082079512L);
        setField(term10484, term10484.getClass(), "cdate", null);
        setField(term10357, term10357.getClass(), "updateTime", term10484);
        setField(term10357, term10357.getClass(), "deleted", term10486);
        setField(term10357, term10357.getClass(), "version", term10488);
        setField(term10357, term10357.getClass(), "createBy", "aSATgQUpoe");
        setField(term10357, term10357.getClass(), "updateBy", "VkPSXewZfB");
        setLongField(term10514, term10514.getClass(), "fastTime", 1426397467745L);
        setField(term10514, term10514.getClass(), "cdate", null);
        setField(term10357, term10357.getClass(), "firstRechargeTime", term10514);
        setField(term10357, term10357.getClass(), "totalRechargeAmount", term10516);
        setField(term10357, term10357.getClass(), "totalGiftAmount", term10518);
        setField(term10357, term10357.getClass(), "walletBalance", term10520);
        setField(term10357, term10357.getClass(), "frozenAmount", term10522);
        setField(term10357, term10357.getClass(), "totalRefund", term10524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateBy", argTypes, term10357, args);
    }

};


