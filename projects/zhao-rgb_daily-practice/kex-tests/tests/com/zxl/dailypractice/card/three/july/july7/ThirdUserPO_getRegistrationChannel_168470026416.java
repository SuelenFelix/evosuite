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

public class ThirdUserPO_getRegistrationChannel_168470026416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4477;

    public ThirdUserPO_getRegistrationChannel_168470026416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4606 = new Integer(-1347665717);
        Integer term4608 = new Integer(-1888585309);
        Integer term4636 = new Integer(683666002);
        Integer term4638 = new Integer(1596213415);
        Integer term4640 = new Integer(-268815336);
        Integer term4642 = new Integer(-1210583429);
        Integer term4644 = new Integer(-663691365);
        term4477 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term4574 = newInstance(Class.forName("java.util.Date"));
        Object term4576 = newInstance(Class.forName("java.util.Date"));
        Object term4602 = newInstance(Class.forName("java.util.Date"));
        Object term4604 = newInstance(Class.forName("java.util.Date"));
        Object term4634 = newInstance(Class.forName("java.util.Date"));
        setField(term4477, term4477.getClass(), "pkUserId", "iljANwuEjk");
        setField(term4477, term4477.getClass(), "thirdUserId", "kNqaJKIATy");
        setField(term4477, term4477.getClass(), "thirdType", "vKQukfbJUd");
        setField(term4477, term4477.getClass(), "unionId", "lFRJFUMVbx");
        setField(term4477, term4477.getClass(), "name", "sZdUNdggUW");
        setField(term4477, term4477.getClass(), "nickName", "OqbwYQfvAe");
        setField(term4477, term4477.getClass(), "phoneNumber", "tRxZafjqIx");
        setField(term4477, term4477.getClass(), "registrationChannel", "DhjNLmRMCu");
        setLongField(term4574, term4574.getClass(), "fastTime", 1285661498273L);
        setField(term4574, term4574.getClass(), "cdate", null);
        setField(term4477, term4477.getClass(), "registrationTime", term4574);
        setLongField(term4576, term4576.getClass(), "fastTime", 1643981113575L);
        setField(term4576, term4576.getClass(), "cdate", null);
        setField(term4477, term4477.getClass(), "logoutTime", term4576);
        setField(term4477, term4477.getClass(), "status", "PgPzMSEjjX");
        setField(term4477, term4477.getClass(), "tenantId", "wzsPSPcRdj");
        setLongField(term4602, term4602.getClass(), "fastTime", 1689428810999L);
        setField(term4602, term4602.getClass(), "cdate", null);
        setField(term4477, term4477.getClass(), "createTime", term4602);
        setLongField(term4604, term4604.getClass(), "fastTime", 1570714321079L);
        setField(term4604, term4604.getClass(), "cdate", null);
        setField(term4477, term4477.getClass(), "updateTime", term4604);
        setField(term4477, term4477.getClass(), "deleted", term4606);
        setField(term4477, term4477.getClass(), "version", term4608);
        setField(term4477, term4477.getClass(), "createBy", "kGMQdqJYyB");
        setField(term4477, term4477.getClass(), "updateBy", "XJJNClzHRf");
        setLongField(term4634, term4634.getClass(), "fastTime", 1531331402053L);
        setField(term4634, term4634.getClass(), "cdate", null);
        setField(term4477, term4477.getClass(), "firstRechargeTime", term4634);
        setField(term4477, term4477.getClass(), "totalRechargeAmount", term4636);
        setField(term4477, term4477.getClass(), "totalGiftAmount", term4638);
        setField(term4477, term4477.getClass(), "walletBalance", term4640);
        setField(term4477, term4477.getClass(), "frozenAmount", term4642);
        setField(term4477, term4477.getClass(), "totalRefund", term4644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegistrationChannel", argTypes, term4477, args);
    }

};


