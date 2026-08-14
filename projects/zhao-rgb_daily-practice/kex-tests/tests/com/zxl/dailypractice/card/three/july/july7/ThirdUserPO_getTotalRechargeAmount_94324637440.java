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

public class ThirdUserPO_getTotalRechargeAmount_94324637440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11537;

    public ThirdUserPO_getTotalRechargeAmount_94324637440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11666 = new Integer(199287428);
        Integer term11668 = new Integer(-1195339592);
        Integer term11696 = new Integer(-376422566);
        Integer term11698 = new Integer(306847454);
        Integer term11700 = new Integer(1745276158);
        Integer term11702 = new Integer(2009020256);
        Integer term11704 = new Integer(2049577015);
        term11537 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term11634 = newInstance(Class.forName("java.util.Date"));
        Object term11636 = newInstance(Class.forName("java.util.Date"));
        Object term11662 = newInstance(Class.forName("java.util.Date"));
        Object term11664 = newInstance(Class.forName("java.util.Date"));
        Object term11694 = newInstance(Class.forName("java.util.Date"));
        setField(term11537, term11537.getClass(), "pkUserId", "qphdrqUtNx");
        setField(term11537, term11537.getClass(), "thirdUserId", "bwlLFAfNWx");
        setField(term11537, term11537.getClass(), "thirdType", "JWodNQzjjV");
        setField(term11537, term11537.getClass(), "unionId", "CAgxWjhxNf");
        setField(term11537, term11537.getClass(), "name", "goAoCMhKBu");
        setField(term11537, term11537.getClass(), "nickName", "BWxJSgKHRT");
        setField(term11537, term11537.getClass(), "phoneNumber", "AGXoIndFnm");
        setField(term11537, term11537.getClass(), "registrationChannel", "mwmFMNEzkK");
        setLongField(term11634, term11634.getClass(), "fastTime", 1554543387782L);
        setField(term11634, term11634.getClass(), "cdate", null);
        setField(term11537, term11537.getClass(), "registrationTime", term11634);
        setLongField(term11636, term11636.getClass(), "fastTime", 1813469018389L);
        setField(term11636, term11636.getClass(), "cdate", null);
        setField(term11537, term11537.getClass(), "logoutTime", term11636);
        setField(term11537, term11537.getClass(), "status", "kVAmKknVln");
        setField(term11537, term11537.getClass(), "tenantId", "MRFLbEGYKG");
        setLongField(term11662, term11662.getClass(), "fastTime", 1828947956352L);
        setField(term11662, term11662.getClass(), "cdate", null);
        setField(term11537, term11537.getClass(), "createTime", term11662);
        setLongField(term11664, term11664.getClass(), "fastTime", 1458419201638L);
        setField(term11664, term11664.getClass(), "cdate", null);
        setField(term11537, term11537.getClass(), "updateTime", term11664);
        setField(term11537, term11537.getClass(), "deleted", term11666);
        setField(term11537, term11537.getClass(), "version", term11668);
        setField(term11537, term11537.getClass(), "createBy", "BYrGukTyof");
        setField(term11537, term11537.getClass(), "updateBy", "jiCGTTzKGB");
        setLongField(term11694, term11694.getClass(), "fastTime", 1378006520445L);
        setField(term11694, term11694.getClass(), "cdate", null);
        setField(term11537, term11537.getClass(), "firstRechargeTime", term11694);
        setField(term11537, term11537.getClass(), "totalRechargeAmount", term11696);
        setField(term11537, term11537.getClass(), "totalGiftAmount", term11698);
        setField(term11537, term11537.getClass(), "walletBalance", term11700);
        setField(term11537, term11537.getClass(), "frozenAmount", term11702);
        setField(term11537, term11537.getClass(), "totalRefund", term11704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalRechargeAmount", argTypes, term11537, args);
    }

};


