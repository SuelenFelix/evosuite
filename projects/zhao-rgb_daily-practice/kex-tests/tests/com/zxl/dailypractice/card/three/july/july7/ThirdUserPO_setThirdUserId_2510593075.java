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

public class ThirdUserPO_setThirdUserId_2510593075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1166;

    public ThirdUserPO_setThirdUserId_2510593075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1295 = new Integer(-117576464);
        Integer term1297 = new Integer(-1007160944);
        Integer term1325 = new Integer(1135664017);
        Integer term1327 = new Integer(590364439);
        Integer term1329 = new Integer(865208305);
        Integer term1331 = new Integer(-1275173084);
        Integer term1333 = new Integer(-244121226);
        term1166 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term1263 = newInstance(Class.forName("java.util.Date"));
        Object term1265 = newInstance(Class.forName("java.util.Date"));
        Object term1291 = newInstance(Class.forName("java.util.Date"));
        Object term1293 = newInstance(Class.forName("java.util.Date"));
        Object term1323 = newInstance(Class.forName("java.util.Date"));
        setField(term1166, term1166.getClass(), "pkUserId", "jDtqGUpnZN");
        setField(term1166, term1166.getClass(), "thirdUserId", "nGKItKLYNC");
        setField(term1166, term1166.getClass(), "thirdType", "UiUYnPrcCi");
        setField(term1166, term1166.getClass(), "unionId", "UoYtihxVaS");
        setField(term1166, term1166.getClass(), "name", "JDswTTCZHV");
        setField(term1166, term1166.getClass(), "nickName", "onpbIeEKoi");
        setField(term1166, term1166.getClass(), "phoneNumber", "YRHGsAkhxb");
        setField(term1166, term1166.getClass(), "registrationChannel", "ffYhPOzlUs");
        setLongField(term1263, term1263.getClass(), "fastTime", 1725122217647L);
        setField(term1263, term1263.getClass(), "cdate", null);
        setField(term1166, term1166.getClass(), "registrationTime", term1263);
        setLongField(term1265, term1265.getClass(), "fastTime", 1550698994689L);
        setField(term1265, term1265.getClass(), "cdate", null);
        setField(term1166, term1166.getClass(), "logoutTime", term1265);
        setField(term1166, term1166.getClass(), "status", "MLqYREekMl");
        setField(term1166, term1166.getClass(), "tenantId", "ytSBIKXogI");
        setLongField(term1291, term1291.getClass(), "fastTime", 1804998087131L);
        setField(term1291, term1291.getClass(), "cdate", null);
        setField(term1166, term1166.getClass(), "createTime", term1291);
        setLongField(term1293, term1293.getClass(), "fastTime", 1538078916394L);
        setField(term1293, term1293.getClass(), "cdate", null);
        setField(term1166, term1166.getClass(), "updateTime", term1293);
        setField(term1166, term1166.getClass(), "deleted", term1295);
        setField(term1166, term1166.getClass(), "version", term1297);
        setField(term1166, term1166.getClass(), "createBy", "nHXjMycHlU");
        setField(term1166, term1166.getClass(), "updateBy", "ieCtQFdkii");
        setLongField(term1323, term1323.getClass(), "fastTime", 1744090065937L);
        setField(term1323, term1323.getClass(), "cdate", null);
        setField(term1166, term1166.getClass(), "firstRechargeTime", term1323);
        setField(term1166, term1166.getClass(), "totalRechargeAmount", term1325);
        setField(term1166, term1166.getClass(), "totalGiftAmount", term1327);
        setField(term1166, term1166.getClass(), "walletBalance", term1329);
        setField(term1166, term1166.getClass(), "frozenAmount", term1331);
        setField(term1166, term1166.getClass(), "totalRefund", term1333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dEnhdmILtU";
        callMethod(klass, "setThirdUserId", argTypes, term1166, args);
    }

};


