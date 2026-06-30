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

public class ThirdUserPO_setUnionId_1651921689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2366;

    public ThirdUserPO_setUnionId_1651921689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2495 = new Integer(454281060);
        Integer term2497 = new Integer(-1786399638);
        Integer term2525 = new Integer(2055867847);
        Integer term2527 = new Integer(-1048298087);
        Integer term2529 = new Integer(292681826);
        Integer term2531 = new Integer(458147407);
        Integer term2533 = new Integer(-184153539);
        term2366 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term2463 = newInstance(Class.forName("java.util.Date"));
        Object term2465 = newInstance(Class.forName("java.util.Date"));
        Object term2491 = newInstance(Class.forName("java.util.Date"));
        Object term2493 = newInstance(Class.forName("java.util.Date"));
        Object term2523 = newInstance(Class.forName("java.util.Date"));
        setField(term2366, term2366.getClass(), "pkUserId", "BKLfkLiZTH");
        setField(term2366, term2366.getClass(), "thirdUserId", "SPpkrGcPRr");
        setField(term2366, term2366.getClass(), "thirdType", "sEccwbJKYE");
        setField(term2366, term2366.getClass(), "unionId", "AWRooQKkdW");
        setField(term2366, term2366.getClass(), "name", "vjxIhXHxGR");
        setField(term2366, term2366.getClass(), "nickName", "QXzGXbEXMu");
        setField(term2366, term2366.getClass(), "phoneNumber", "qxSDVejjiY");
        setField(term2366, term2366.getClass(), "registrationChannel", "xBsXSDjXYK");
        setLongField(term2463, term2463.getClass(), "fastTime", 1464421789888L);
        setField(term2463, term2463.getClass(), "cdate", null);
        setField(term2366, term2366.getClass(), "registrationTime", term2463);
        setLongField(term2465, term2465.getClass(), "fastTime", 1405279189488L);
        setField(term2465, term2465.getClass(), "cdate", null);
        setField(term2366, term2366.getClass(), "logoutTime", term2465);
        setField(term2366, term2366.getClass(), "status", "sEnIVFtZuQ");
        setField(term2366, term2366.getClass(), "tenantId", "ZVecLZMLHF");
        setLongField(term2491, term2491.getClass(), "fastTime", 1822704644050L);
        setField(term2491, term2491.getClass(), "cdate", null);
        setField(term2366, term2366.getClass(), "createTime", term2491);
        setLongField(term2493, term2493.getClass(), "fastTime", 1678177615298L);
        setField(term2493, term2493.getClass(), "cdate", null);
        setField(term2366, term2366.getClass(), "updateTime", term2493);
        setField(term2366, term2366.getClass(), "deleted", term2495);
        setField(term2366, term2366.getClass(), "version", term2497);
        setField(term2366, term2366.getClass(), "createBy", "fztQhjqwdP");
        setField(term2366, term2366.getClass(), "updateBy", "eVpkWxjuki");
        setLongField(term2523, term2523.getClass(), "fastTime", 1666076287186L);
        setField(term2523, term2523.getClass(), "cdate", null);
        setField(term2366, term2366.getClass(), "firstRechargeTime", term2523);
        setField(term2366, term2366.getClass(), "totalRechargeAmount", term2525);
        setField(term2366, term2366.getClass(), "totalGiftAmount", term2527);
        setField(term2366, term2366.getClass(), "walletBalance", term2529);
        setField(term2366, term2366.getClass(), "frozenAmount", term2531);
        setField(term2366, term2366.getClass(), "totalRefund", term2533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SJiQaLvSKv";
        callMethod(klass, "setUnionId", argTypes, term2366, args);
    }

};


