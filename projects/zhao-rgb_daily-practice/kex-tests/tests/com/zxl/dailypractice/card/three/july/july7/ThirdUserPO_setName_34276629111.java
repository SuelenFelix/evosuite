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

public class ThirdUserPO_setName_34276629111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2966;

    public ThirdUserPO_setName_34276629111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3095 = new Integer(1324040357);
        Integer term3097 = new Integer(-1588772968);
        Integer term3125 = new Integer(-93135961);
        Integer term3127 = new Integer(-112921587);
        Integer term3129 = new Integer(933028652);
        Integer term3131 = new Integer(287287233);
        Integer term3133 = new Integer(962840079);
        term2966 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term3063 = newInstance(Class.forName("java.util.Date"));
        Object term3065 = newInstance(Class.forName("java.util.Date"));
        Object term3091 = newInstance(Class.forName("java.util.Date"));
        Object term3093 = newInstance(Class.forName("java.util.Date"));
        Object term3123 = newInstance(Class.forName("java.util.Date"));
        setField(term2966, term2966.getClass(), "pkUserId", "AdxvLJhNLe");
        setField(term2966, term2966.getClass(), "thirdUserId", "lHfTrWKMPk");
        setField(term2966, term2966.getClass(), "thirdType", "JDaAnsVTGV");
        setField(term2966, term2966.getClass(), "unionId", "mLUZFTfjle");
        setField(term2966, term2966.getClass(), "name", "xIeFjkHkOe");
        setField(term2966, term2966.getClass(), "nickName", "SdCKLMIYnX");
        setField(term2966, term2966.getClass(), "phoneNumber", "OJJtVNPyKZ");
        setField(term2966, term2966.getClass(), "registrationChannel", "AKNapTAfmD");
        setLongField(term3063, term3063.getClass(), "fastTime", 1761994701322L);
        setField(term3063, term3063.getClass(), "cdate", null);
        setField(term2966, term2966.getClass(), "registrationTime", term3063);
        setLongField(term3065, term3065.getClass(), "fastTime", 1695425269458L);
        setField(term3065, term3065.getClass(), "cdate", null);
        setField(term2966, term2966.getClass(), "logoutTime", term3065);
        setField(term2966, term2966.getClass(), "status", "xJgPlLxpgC");
        setField(term2966, term2966.getClass(), "tenantId", "EYtfuJaxiM");
        setLongField(term3091, term3091.getClass(), "fastTime", 1362780563394L);
        setField(term3091, term3091.getClass(), "cdate", null);
        setField(term2966, term2966.getClass(), "createTime", term3091);
        setLongField(term3093, term3093.getClass(), "fastTime", 1853963979281L);
        setField(term3093, term3093.getClass(), "cdate", null);
        setField(term2966, term2966.getClass(), "updateTime", term3093);
        setField(term2966, term2966.getClass(), "deleted", term3095);
        setField(term2966, term2966.getClass(), "version", term3097);
        setField(term2966, term2966.getClass(), "createBy", "gCWtLVKVVe");
        setField(term2966, term2966.getClass(), "updateBy", "fWKJoSoCwE");
        setLongField(term3123, term3123.getClass(), "fastTime", 1795936337628L);
        setField(term3123, term3123.getClass(), "cdate", null);
        setField(term2966, term2966.getClass(), "firstRechargeTime", term3123);
        setField(term2966, term2966.getClass(), "totalRechargeAmount", term3125);
        setField(term2966, term2966.getClass(), "totalGiftAmount", term3127);
        setField(term2966, term2966.getClass(), "walletBalance", term3129);
        setField(term2966, term2966.getClass(), "frozenAmount", term3131);
        setField(term2966, term2966.getClass(), "totalRefund", term3133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wfaXBpWAUH";
        callMethod(klass, "setName", argTypes, term2966, args);
    }

};


