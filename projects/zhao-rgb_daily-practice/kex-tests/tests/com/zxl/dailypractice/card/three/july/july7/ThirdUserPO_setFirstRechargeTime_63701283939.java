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

public class ThirdUserPO_setFirstRechargeTime_63701283939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11246;
     Object term11415;

    public ThirdUserPO_setFirstRechargeTime_63701283939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11375 = new Integer(2058711405);
        Integer term11377 = new Integer(1743683601);
        Integer term11405 = new Integer(-945116798);
        Integer term11407 = new Integer(1593461795);
        Integer term11409 = new Integer(515182546);
        Integer term11411 = new Integer(-936895502);
        Integer term11413 = new Integer(-129547140);
        term11246 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term11343 = newInstance(Class.forName("java.util.Date"));
        Object term11345 = newInstance(Class.forName("java.util.Date"));
        Object term11371 = newInstance(Class.forName("java.util.Date"));
        Object term11373 = newInstance(Class.forName("java.util.Date"));
        Object term11403 = newInstance(Class.forName("java.util.Date"));
        setField(term11246, term11246.getClass(), "pkUserId", "VSaNnhMpRc");
        setField(term11246, term11246.getClass(), "thirdUserId", "QNjNTLlUaV");
        setField(term11246, term11246.getClass(), "thirdType", "hIYsRyOZxk");
        setField(term11246, term11246.getClass(), "unionId", "RjNoEywJbC");
        setField(term11246, term11246.getClass(), "name", "RTTvrwwhou");
        setField(term11246, term11246.getClass(), "nickName", "lRORwXipuk");
        setField(term11246, term11246.getClass(), "phoneNumber", "fVdTcjgHdw");
        setField(term11246, term11246.getClass(), "registrationChannel", "wwAwLLcLPp");
        setLongField(term11343, term11343.getClass(), "fastTime", 1441807744643L);
        setField(term11343, term11343.getClass(), "cdate", null);
        setField(term11246, term11246.getClass(), "registrationTime", term11343);
        setLongField(term11345, term11345.getClass(), "fastTime", 1412676996116L);
        setField(term11345, term11345.getClass(), "cdate", null);
        setField(term11246, term11246.getClass(), "logoutTime", term11345);
        setField(term11246, term11246.getClass(), "status", "nHpMKOmlpQ");
        setField(term11246, term11246.getClass(), "tenantId", "fKhrQsJToZ");
        setLongField(term11371, term11371.getClass(), "fastTime", 1643347136541L);
        setField(term11371, term11371.getClass(), "cdate", null);
        setField(term11246, term11246.getClass(), "createTime", term11371);
        setLongField(term11373, term11373.getClass(), "fastTime", 1565587796123L);
        setField(term11373, term11373.getClass(), "cdate", null);
        setField(term11246, term11246.getClass(), "updateTime", term11373);
        setField(term11246, term11246.getClass(), "deleted", term11375);
        setField(term11246, term11246.getClass(), "version", term11377);
        setField(term11246, term11246.getClass(), "createBy", "wsysQLGFnl");
        setField(term11246, term11246.getClass(), "updateBy", "ckQLZGFjMX");
        setLongField(term11403, term11403.getClass(), "fastTime", 1577273399172L);
        setField(term11403, term11403.getClass(), "cdate", null);
        setField(term11246, term11246.getClass(), "firstRechargeTime", term11403);
        setField(term11246, term11246.getClass(), "totalRechargeAmount", term11405);
        setField(term11246, term11246.getClass(), "totalGiftAmount", term11407);
        setField(term11246, term11246.getClass(), "walletBalance", term11409);
        setField(term11246, term11246.getClass(), "frozenAmount", term11411);
        setField(term11246, term11246.getClass(), "totalRefund", term11413);
        term11415 = newInstance(Class.forName("java.util.Date"));
        setLongField(term11415, term11415.getClass(), "fastTime", 1406013163547L);
        setField(term11415, term11415.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term11415;
        callMethod(klass, "setFirstRechargeTime", argTypes, term11246, args);
    }

};


