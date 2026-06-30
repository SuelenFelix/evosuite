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

public class ThirdUserPO_getRegistrationTime_48911596118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5077;

    public ThirdUserPO_getRegistrationTime_48911596118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5206 = new Integer(890669485);
        Integer term5208 = new Integer(691577392);
        Integer term5236 = new Integer(-893623680);
        Integer term5238 = new Integer(-1963434938);
        Integer term5240 = new Integer(906181092);
        Integer term5242 = new Integer(1045657203);
        Integer term5244 = new Integer(1386130016);
        term5077 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term5174 = newInstance(Class.forName("java.util.Date"));
        Object term5176 = newInstance(Class.forName("java.util.Date"));
        Object term5202 = newInstance(Class.forName("java.util.Date"));
        Object term5204 = newInstance(Class.forName("java.util.Date"));
        Object term5234 = newInstance(Class.forName("java.util.Date"));
        setField(term5077, term5077.getClass(), "pkUserId", "izPpKDErnQ");
        setField(term5077, term5077.getClass(), "thirdUserId", "NnpwZBUTvx");
        setField(term5077, term5077.getClass(), "thirdType", "tlQSNgTkQX");
        setField(term5077, term5077.getClass(), "unionId", "PCipZnmBOF");
        setField(term5077, term5077.getClass(), "name", "zcorEihhLK");
        setField(term5077, term5077.getClass(), "nickName", "GrqozDKFOk");
        setField(term5077, term5077.getClass(), "phoneNumber", "CFyoseFGLF");
        setField(term5077, term5077.getClass(), "registrationChannel", "SFqCrhEWLm");
        setLongField(term5174, term5174.getClass(), "fastTime", 1597421765774L);
        setField(term5174, term5174.getClass(), "cdate", null);
        setField(term5077, term5077.getClass(), "registrationTime", term5174);
        setLongField(term5176, term5176.getClass(), "fastTime", 1354735325477L);
        setField(term5176, term5176.getClass(), "cdate", null);
        setField(term5077, term5077.getClass(), "logoutTime", term5176);
        setField(term5077, term5077.getClass(), "status", "GZdcJyZntS");
        setField(term5077, term5077.getClass(), "tenantId", "OIHoJeysUi");
        setLongField(term5202, term5202.getClass(), "fastTime", 1415426053422L);
        setField(term5202, term5202.getClass(), "cdate", null);
        setField(term5077, term5077.getClass(), "createTime", term5202);
        setLongField(term5204, term5204.getClass(), "fastTime", 1359786657069L);
        setField(term5204, term5204.getClass(), "cdate", null);
        setField(term5077, term5077.getClass(), "updateTime", term5204);
        setField(term5077, term5077.getClass(), "deleted", term5206);
        setField(term5077, term5077.getClass(), "version", term5208);
        setField(term5077, term5077.getClass(), "createBy", "WXMWFDGcLB");
        setField(term5077, term5077.getClass(), "updateBy", "wKWbJssZuG");
        setLongField(term5234, term5234.getClass(), "fastTime", 1589746751309L);
        setField(term5234, term5234.getClass(), "cdate", null);
        setField(term5077, term5077.getClass(), "firstRechargeTime", term5234);
        setField(term5077, term5077.getClass(), "totalRechargeAmount", term5236);
        setField(term5077, term5077.getClass(), "totalGiftAmount", term5238);
        setField(term5077, term5077.getClass(), "walletBalance", term5240);
        setField(term5077, term5077.getClass(), "frozenAmount", term5242);
        setField(term5077, term5077.getClass(), "totalRefund", term5244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegistrationTime", argTypes, term5077, args);
    }

};


