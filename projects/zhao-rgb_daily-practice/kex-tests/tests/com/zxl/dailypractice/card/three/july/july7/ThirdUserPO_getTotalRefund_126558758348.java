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

public class ThirdUserPO_getTotalRefund_126558758348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13857;

    public ThirdUserPO_getTotalRefund_126558758348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13986 = new Integer(1215150180);
        Integer term13988 = new Integer(-1422859977);
        Integer term14016 = new Integer(-1972436591);
        Integer term14018 = new Integer(68922753);
        Integer term14020 = new Integer(-220791533);
        Integer term14022 = new Integer(1741500243);
        Integer term14024 = new Integer(-2070466617);
        term13857 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term13954 = newInstance(Class.forName("java.util.Date"));
        Object term13956 = newInstance(Class.forName("java.util.Date"));
        Object term13982 = newInstance(Class.forName("java.util.Date"));
        Object term13984 = newInstance(Class.forName("java.util.Date"));
        Object term14014 = newInstance(Class.forName("java.util.Date"));
        setField(term13857, term13857.getClass(), "pkUserId", "PGfCDJTBek");
        setField(term13857, term13857.getClass(), "thirdUserId", "ZwjARhAtHC");
        setField(term13857, term13857.getClass(), "thirdType", "XXvscsYBWv");
        setField(term13857, term13857.getClass(), "unionId", "uePedtiAfL");
        setField(term13857, term13857.getClass(), "name", "AdSHvysxQB");
        setField(term13857, term13857.getClass(), "nickName", "jlraKkBWFA");
        setField(term13857, term13857.getClass(), "phoneNumber", "mRBtFTxVdE");
        setField(term13857, term13857.getClass(), "registrationChannel", "IVacFDAZcj");
        setLongField(term13954, term13954.getClass(), "fastTime", 1292030471095L);
        setField(term13954, term13954.getClass(), "cdate", null);
        setField(term13857, term13857.getClass(), "registrationTime", term13954);
        setLongField(term13956, term13956.getClass(), "fastTime", 1781318379156L);
        setField(term13956, term13956.getClass(), "cdate", null);
        setField(term13857, term13857.getClass(), "logoutTime", term13956);
        setField(term13857, term13857.getClass(), "status", "EEYmuwyVDP");
        setField(term13857, term13857.getClass(), "tenantId", "EWFbEDAVrE");
        setLongField(term13982, term13982.getClass(), "fastTime", 1305204769767L);
        setField(term13982, term13982.getClass(), "cdate", null);
        setField(term13857, term13857.getClass(), "createTime", term13982);
        setLongField(term13984, term13984.getClass(), "fastTime", 1387754061454L);
        setField(term13984, term13984.getClass(), "cdate", null);
        setField(term13857, term13857.getClass(), "updateTime", term13984);
        setField(term13857, term13857.getClass(), "deleted", term13986);
        setField(term13857, term13857.getClass(), "version", term13988);
        setField(term13857, term13857.getClass(), "createBy", "EMiMtYgfvr");
        setField(term13857, term13857.getClass(), "updateBy", "OyYyYYnJuF");
        setLongField(term14014, term14014.getClass(), "fastTime", 1368680124141L);
        setField(term14014, term14014.getClass(), "cdate", null);
        setField(term13857, term13857.getClass(), "firstRechargeTime", term14014);
        setField(term13857, term13857.getClass(), "totalRechargeAmount", term14016);
        setField(term13857, term13857.getClass(), "totalGiftAmount", term14018);
        setField(term13857, term13857.getClass(), "walletBalance", term14020);
        setField(term13857, term13857.getClass(), "frozenAmount", term14022);
        setField(term13857, term13857.getClass(), "totalRefund", term14024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalRefund", argTypes, term13857, args);
    }

};


