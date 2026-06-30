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

public class ThirdUserPO_setCreateTime_55816764627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7726;
     Object term7895;

    public ThirdUserPO_setCreateTime_55816764627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7855 = new Integer(-1731761810);
        Integer term7857 = new Integer(197109649);
        Integer term7885 = new Integer(-1239406390);
        Integer term7887 = new Integer(1557431527);
        Integer term7889 = new Integer(-1504890659);
        Integer term7891 = new Integer(1358829571);
        Integer term7893 = new Integer(991356662);
        term7726 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term7823 = newInstance(Class.forName("java.util.Date"));
        Object term7825 = newInstance(Class.forName("java.util.Date"));
        Object term7851 = newInstance(Class.forName("java.util.Date"));
        Object term7853 = newInstance(Class.forName("java.util.Date"));
        Object term7883 = newInstance(Class.forName("java.util.Date"));
        setField(term7726, term7726.getClass(), "pkUserId", "riMtzCoxNj");
        setField(term7726, term7726.getClass(), "thirdUserId", "YAXkVjQZcV");
        setField(term7726, term7726.getClass(), "thirdType", "pumvwBWvpy");
        setField(term7726, term7726.getClass(), "unionId", "HwLHeGLyhe");
        setField(term7726, term7726.getClass(), "name", "RDnkgWkcbz");
        setField(term7726, term7726.getClass(), "nickName", "IBpaxltauX");
        setField(term7726, term7726.getClass(), "phoneNumber", "hePqROaplw");
        setField(term7726, term7726.getClass(), "registrationChannel", "PJcSNDruWd");
        setLongField(term7823, term7823.getClass(), "fastTime", 1267380225974L);
        setField(term7823, term7823.getClass(), "cdate", null);
        setField(term7726, term7726.getClass(), "registrationTime", term7823);
        setLongField(term7825, term7825.getClass(), "fastTime", 1518551771568L);
        setField(term7825, term7825.getClass(), "cdate", null);
        setField(term7726, term7726.getClass(), "logoutTime", term7825);
        setField(term7726, term7726.getClass(), "status", "VVNNlAePXF");
        setField(term7726, term7726.getClass(), "tenantId", "jnwVnmKAFv");
        setLongField(term7851, term7851.getClass(), "fastTime", 1496476439025L);
        setField(term7851, term7851.getClass(), "cdate", null);
        setField(term7726, term7726.getClass(), "createTime", term7851);
        setLongField(term7853, term7853.getClass(), "fastTime", 1755788577674L);
        setField(term7853, term7853.getClass(), "cdate", null);
        setField(term7726, term7726.getClass(), "updateTime", term7853);
        setField(term7726, term7726.getClass(), "deleted", term7855);
        setField(term7726, term7726.getClass(), "version", term7857);
        setField(term7726, term7726.getClass(), "createBy", "TXyHhqeCjR");
        setField(term7726, term7726.getClass(), "updateBy", "lZIgPZPgTu");
        setLongField(term7883, term7883.getClass(), "fastTime", 1291600397937L);
        setField(term7883, term7883.getClass(), "cdate", null);
        setField(term7726, term7726.getClass(), "firstRechargeTime", term7883);
        setField(term7726, term7726.getClass(), "totalRechargeAmount", term7885);
        setField(term7726, term7726.getClass(), "totalGiftAmount", term7887);
        setField(term7726, term7726.getClass(), "walletBalance", term7889);
        setField(term7726, term7726.getClass(), "frozenAmount", term7891);
        setField(term7726, term7726.getClass(), "totalRefund", term7893);
        term7895 = newInstance(Class.forName("java.util.Date"));
        setLongField(term7895, term7895.getClass(), "fastTime", 1838150926204L);
        setField(term7895, term7895.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term7895;
        callMethod(klass, "setCreateTime", argTypes, term7726, args);
    }

};


