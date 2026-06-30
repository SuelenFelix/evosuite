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

public class ThirdUserPO_setNickName_199657640013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3566;

    public ThirdUserPO_setNickName_199657640013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3695 = new Integer(-478195677);
        Integer term3697 = new Integer(972867650);
        Integer term3725 = new Integer(1655935355);
        Integer term3727 = new Integer(-481533957);
        Integer term3729 = new Integer(1240914516);
        Integer term3731 = new Integer(-1465035361);
        Integer term3733 = new Integer(1090617576);
        term3566 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term3663 = newInstance(Class.forName("java.util.Date"));
        Object term3665 = newInstance(Class.forName("java.util.Date"));
        Object term3691 = newInstance(Class.forName("java.util.Date"));
        Object term3693 = newInstance(Class.forName("java.util.Date"));
        Object term3723 = newInstance(Class.forName("java.util.Date"));
        setField(term3566, term3566.getClass(), "pkUserId", "HzqpegHiRq");
        setField(term3566, term3566.getClass(), "thirdUserId", "jwsfVjMoJT");
        setField(term3566, term3566.getClass(), "thirdType", "ZfdXfCCFDf");
        setField(term3566, term3566.getClass(), "unionId", "MwwjNtdOFT");
        setField(term3566, term3566.getClass(), "name", "VYkqXKVlAJ");
        setField(term3566, term3566.getClass(), "nickName", "XkIoWJRNwN");
        setField(term3566, term3566.getClass(), "phoneNumber", "aNWLJdrZMq");
        setField(term3566, term3566.getClass(), "registrationChannel", "HHmNoYxIGj");
        setLongField(term3663, term3663.getClass(), "fastTime", 1395479491666L);
        setField(term3663, term3663.getClass(), "cdate", null);
        setField(term3566, term3566.getClass(), "registrationTime", term3663);
        setLongField(term3665, term3665.getClass(), "fastTime", 1466008719289L);
        setField(term3665, term3665.getClass(), "cdate", null);
        setField(term3566, term3566.getClass(), "logoutTime", term3665);
        setField(term3566, term3566.getClass(), "status", "PtirvZmsGt");
        setField(term3566, term3566.getClass(), "tenantId", "HWkpTmtlrc");
        setLongField(term3691, term3691.getClass(), "fastTime", 1535838449065L);
        setField(term3691, term3691.getClass(), "cdate", null);
        setField(term3566, term3566.getClass(), "createTime", term3691);
        setLongField(term3693, term3693.getClass(), "fastTime", 1345923503543L);
        setField(term3693, term3693.getClass(), "cdate", null);
        setField(term3566, term3566.getClass(), "updateTime", term3693);
        setField(term3566, term3566.getClass(), "deleted", term3695);
        setField(term3566, term3566.getClass(), "version", term3697);
        setField(term3566, term3566.getClass(), "createBy", "hMmaoREuCK");
        setField(term3566, term3566.getClass(), "updateBy", "VeDtgDzGAN");
        setLongField(term3723, term3723.getClass(), "fastTime", 1838357779277L);
        setField(term3723, term3723.getClass(), "cdate", null);
        setField(term3566, term3566.getClass(), "firstRechargeTime", term3723);
        setField(term3566, term3566.getClass(), "totalRechargeAmount", term3725);
        setField(term3566, term3566.getClass(), "totalGiftAmount", term3727);
        setField(term3566, term3566.getClass(), "walletBalance", term3729);
        setField(term3566, term3566.getClass(), "frozenAmount", term3731);
        setField(term3566, term3566.getClass(), "totalRefund", term3733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aWYOWZFyaX";
        callMethod(klass, "setNickName", argTypes, term3566, args);
    }

};


