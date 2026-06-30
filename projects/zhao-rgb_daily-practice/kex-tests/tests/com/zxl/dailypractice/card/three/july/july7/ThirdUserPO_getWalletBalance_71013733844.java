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

public class ThirdUserPO_getWalletBalance_71013733844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12697;

    public ThirdUserPO_getWalletBalance_71013733844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12826 = new Integer(-310528004);
        Integer term12828 = new Integer(-634976996);
        Integer term12856 = new Integer(-1015274146);
        Integer term12858 = new Integer(-49052672);
        Integer term12860 = new Integer(339372704);
        Integer term12862 = new Integer(-851097944);
        Integer term12864 = new Integer(803925431);
        term12697 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term12794 = newInstance(Class.forName("java.util.Date"));
        Object term12796 = newInstance(Class.forName("java.util.Date"));
        Object term12822 = newInstance(Class.forName("java.util.Date"));
        Object term12824 = newInstance(Class.forName("java.util.Date"));
        Object term12854 = newInstance(Class.forName("java.util.Date"));
        setField(term12697, term12697.getClass(), "pkUserId", "uzmqjnOUXu");
        setField(term12697, term12697.getClass(), "thirdUserId", "xeyjTOCOJb");
        setField(term12697, term12697.getClass(), "thirdType", "DGRqjjdhzy");
        setField(term12697, term12697.getClass(), "unionId", "lQFkjJUPAR");
        setField(term12697, term12697.getClass(), "name", "BsuVlGUUjV");
        setField(term12697, term12697.getClass(), "nickName", "bHHjfDCntT");
        setField(term12697, term12697.getClass(), "phoneNumber", "sEphiduvkv");
        setField(term12697, term12697.getClass(), "registrationChannel", "PbLgCSAHce");
        setLongField(term12794, term12794.getClass(), "fastTime", 1755133084362L);
        setField(term12794, term12794.getClass(), "cdate", null);
        setField(term12697, term12697.getClass(), "registrationTime", term12794);
        setLongField(term12796, term12796.getClass(), "fastTime", 1879103408714L);
        setField(term12796, term12796.getClass(), "cdate", null);
        setField(term12697, term12697.getClass(), "logoutTime", term12796);
        setField(term12697, term12697.getClass(), "status", "NWldOLAbqk");
        setField(term12697, term12697.getClass(), "tenantId", "qnYaYSpDwO");
        setLongField(term12822, term12822.getClass(), "fastTime", 1464342312685L);
        setField(term12822, term12822.getClass(), "cdate", null);
        setField(term12697, term12697.getClass(), "createTime", term12822);
        setLongField(term12824, term12824.getClass(), "fastTime", 1831173948055L);
        setField(term12824, term12824.getClass(), "cdate", null);
        setField(term12697, term12697.getClass(), "updateTime", term12824);
        setField(term12697, term12697.getClass(), "deleted", term12826);
        setField(term12697, term12697.getClass(), "version", term12828);
        setField(term12697, term12697.getClass(), "createBy", "dgbFDCdHtj");
        setField(term12697, term12697.getClass(), "updateBy", "EKpdCBubDE");
        setLongField(term12854, term12854.getClass(), "fastTime", 1373124461341L);
        setField(term12854, term12854.getClass(), "cdate", null);
        setField(term12697, term12697.getClass(), "firstRechargeTime", term12854);
        setField(term12697, term12697.getClass(), "totalRechargeAmount", term12856);
        setField(term12697, term12697.getClass(), "totalGiftAmount", term12858);
        setField(term12697, term12697.getClass(), "walletBalance", term12860);
        setField(term12697, term12697.getClass(), "frozenAmount", term12862);
        setField(term12697, term12697.getClass(), "totalRefund", term12864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWalletBalance", argTypes, term12697, args);
    }

};


