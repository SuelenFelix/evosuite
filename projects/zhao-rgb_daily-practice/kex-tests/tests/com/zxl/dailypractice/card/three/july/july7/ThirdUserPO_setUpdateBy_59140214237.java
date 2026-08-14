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

public class ThirdUserPO_setUpdateBy_59140214237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10646;

    public ThirdUserPO_setUpdateBy_59140214237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10775 = new Integer(1743224434);
        Integer term10777 = new Integer(842904495);
        Integer term10805 = new Integer(1008080511);
        Integer term10807 = new Integer(1935707624);
        Integer term10809 = new Integer(1507074215);
        Integer term10811 = new Integer(-282881827);
        Integer term10813 = new Integer(-1183353915);
        term10646 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term10743 = newInstance(Class.forName("java.util.Date"));
        Object term10745 = newInstance(Class.forName("java.util.Date"));
        Object term10771 = newInstance(Class.forName("java.util.Date"));
        Object term10773 = newInstance(Class.forName("java.util.Date"));
        Object term10803 = newInstance(Class.forName("java.util.Date"));
        setField(term10646, term10646.getClass(), "pkUserId", "ubodzJoMGW");
        setField(term10646, term10646.getClass(), "thirdUserId", "weddIktxOA");
        setField(term10646, term10646.getClass(), "thirdType", "uSlMeISsDD");
        setField(term10646, term10646.getClass(), "unionId", "WdCiTDUKqn");
        setField(term10646, term10646.getClass(), "name", "PSizQDoxxe");
        setField(term10646, term10646.getClass(), "nickName", "mKaHyMybrK");
        setField(term10646, term10646.getClass(), "phoneNumber", "AyrEXuGrEj");
        setField(term10646, term10646.getClass(), "registrationChannel", "yevIIoVYHq");
        setLongField(term10743, term10743.getClass(), "fastTime", 1755551549042L);
        setField(term10743, term10743.getClass(), "cdate", null);
        setField(term10646, term10646.getClass(), "registrationTime", term10743);
        setLongField(term10745, term10745.getClass(), "fastTime", 1619398774189L);
        setField(term10745, term10745.getClass(), "cdate", null);
        setField(term10646, term10646.getClass(), "logoutTime", term10745);
        setField(term10646, term10646.getClass(), "status", "UuYWMTqWTV");
        setField(term10646, term10646.getClass(), "tenantId", "DSFGlcaXUb");
        setLongField(term10771, term10771.getClass(), "fastTime", 1665119808787L);
        setField(term10771, term10771.getClass(), "cdate", null);
        setField(term10646, term10646.getClass(), "createTime", term10771);
        setLongField(term10773, term10773.getClass(), "fastTime", 1379077835909L);
        setField(term10773, term10773.getClass(), "cdate", null);
        setField(term10646, term10646.getClass(), "updateTime", term10773);
        setField(term10646, term10646.getClass(), "deleted", term10775);
        setField(term10646, term10646.getClass(), "version", term10777);
        setField(term10646, term10646.getClass(), "createBy", "sHMXNUzNeM");
        setField(term10646, term10646.getClass(), "updateBy", "gPzGDOEPPw");
        setLongField(term10803, term10803.getClass(), "fastTime", 1491501240125L);
        setField(term10803, term10803.getClass(), "cdate", null);
        setField(term10646, term10646.getClass(), "firstRechargeTime", term10803);
        setField(term10646, term10646.getClass(), "totalRechargeAmount", term10805);
        setField(term10646, term10646.getClass(), "totalGiftAmount", term10807);
        setField(term10646, term10646.getClass(), "walletBalance", term10809);
        setField(term10646, term10646.getClass(), "frozenAmount", term10811);
        setField(term10646, term10646.getClass(), "totalRefund", term10813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rwKoAngzCu";
        callMethod(klass, "setUpdateBy", argTypes, term10646, args);
    }

};


