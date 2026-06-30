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

public class ThirdUserPO_setUpdateTime_126077022329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8306;
     Object term8475;

    public ThirdUserPO_setUpdateTime_126077022329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8435 = new Integer(584893196);
        Integer term8437 = new Integer(497269071);
        Integer term8465 = new Integer(-1899301124);
        Integer term8467 = new Integer(-1882480155);
        Integer term8469 = new Integer(-1410220680);
        Integer term8471 = new Integer(389427431);
        Integer term8473 = new Integer(-1945706126);
        term8306 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term8403 = newInstance(Class.forName("java.util.Date"));
        Object term8405 = newInstance(Class.forName("java.util.Date"));
        Object term8431 = newInstance(Class.forName("java.util.Date"));
        Object term8433 = newInstance(Class.forName("java.util.Date"));
        Object term8463 = newInstance(Class.forName("java.util.Date"));
        setField(term8306, term8306.getClass(), "pkUserId", "JkgoRtImdE");
        setField(term8306, term8306.getClass(), "thirdUserId", "qFGKIJjlmV");
        setField(term8306, term8306.getClass(), "thirdType", "IHqvyhMtuM");
        setField(term8306, term8306.getClass(), "unionId", "dAldIGYAXV");
        setField(term8306, term8306.getClass(), "name", "mLwibAPEsa");
        setField(term8306, term8306.getClass(), "nickName", "zsWKWiTFuo");
        setField(term8306, term8306.getClass(), "phoneNumber", "UPUbwyHQKN");
        setField(term8306, term8306.getClass(), "registrationChannel", "lgQkrXANyI");
        setLongField(term8403, term8403.getClass(), "fastTime", 1793404489395L);
        setField(term8403, term8403.getClass(), "cdate", null);
        setField(term8306, term8306.getClass(), "registrationTime", term8403);
        setLongField(term8405, term8405.getClass(), "fastTime", 1758357140066L);
        setField(term8405, term8405.getClass(), "cdate", null);
        setField(term8306, term8306.getClass(), "logoutTime", term8405);
        setField(term8306, term8306.getClass(), "status", "MeTmRZXErV");
        setField(term8306, term8306.getClass(), "tenantId", "jNxbVmoZgq");
        setLongField(term8431, term8431.getClass(), "fastTime", 1668066172011L);
        setField(term8431, term8431.getClass(), "cdate", null);
        setField(term8306, term8306.getClass(), "createTime", term8431);
        setLongField(term8433, term8433.getClass(), "fastTime", 1677875735410L);
        setField(term8433, term8433.getClass(), "cdate", null);
        setField(term8306, term8306.getClass(), "updateTime", term8433);
        setField(term8306, term8306.getClass(), "deleted", term8435);
        setField(term8306, term8306.getClass(), "version", term8437);
        setField(term8306, term8306.getClass(), "createBy", "PvmBHIXaMY");
        setField(term8306, term8306.getClass(), "updateBy", "hulYxtowxw");
        setLongField(term8463, term8463.getClass(), "fastTime", 1541716264920L);
        setField(term8463, term8463.getClass(), "cdate", null);
        setField(term8306, term8306.getClass(), "firstRechargeTime", term8463);
        setField(term8306, term8306.getClass(), "totalRechargeAmount", term8465);
        setField(term8306, term8306.getClass(), "totalGiftAmount", term8467);
        setField(term8306, term8306.getClass(), "walletBalance", term8469);
        setField(term8306, term8306.getClass(), "frozenAmount", term8471);
        setField(term8306, term8306.getClass(), "totalRefund", term8473);
        term8475 = newInstance(Class.forName("java.util.Date"));
        setLongField(term8475, term8475.getClass(), "fastTime", 1736141630618L);
        setField(term8475, term8475.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term8475;
        callMethod(klass, "setUpdateTime", argTypes, term8306, args);
    }

};


