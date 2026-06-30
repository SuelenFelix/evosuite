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

public class ThirdUserPO_setRegistrationChannel_147985442417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4766;

    public ThirdUserPO_setRegistrationChannel_147985442417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4895 = new Integer(339854490);
        Integer term4897 = new Integer(-615654495);
        Integer term4925 = new Integer(-1476117762);
        Integer term4927 = new Integer(-341962980);
        Integer term4929 = new Integer(1532716628);
        Integer term4931 = new Integer(-1801760683);
        Integer term4933 = new Integer(1141317871);
        term4766 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term4863 = newInstance(Class.forName("java.util.Date"));
        Object term4865 = newInstance(Class.forName("java.util.Date"));
        Object term4891 = newInstance(Class.forName("java.util.Date"));
        Object term4893 = newInstance(Class.forName("java.util.Date"));
        Object term4923 = newInstance(Class.forName("java.util.Date"));
        setField(term4766, term4766.getClass(), "pkUserId", "HDaezxQfQR");
        setField(term4766, term4766.getClass(), "thirdUserId", "iikZEapDlu");
        setField(term4766, term4766.getClass(), "thirdType", "nhoHrZfnIN");
        setField(term4766, term4766.getClass(), "unionId", "ZkMALXpEAZ");
        setField(term4766, term4766.getClass(), "name", "tXfQjSqDzN");
        setField(term4766, term4766.getClass(), "nickName", "BjugTaMcxJ");
        setField(term4766, term4766.getClass(), "phoneNumber", "vGiuZVPJNH");
        setField(term4766, term4766.getClass(), "registrationChannel", "tlzpzIjMib");
        setLongField(term4863, term4863.getClass(), "fastTime", 1264037800343L);
        setField(term4863, term4863.getClass(), "cdate", null);
        setField(term4766, term4766.getClass(), "registrationTime", term4863);
        setLongField(term4865, term4865.getClass(), "fastTime", 1450865259896L);
        setField(term4865, term4865.getClass(), "cdate", null);
        setField(term4766, term4766.getClass(), "logoutTime", term4865);
        setField(term4766, term4766.getClass(), "status", "AZdLeSugwv");
        setField(term4766, term4766.getClass(), "tenantId", "RMsXuyzKJV");
        setLongField(term4891, term4891.getClass(), "fastTime", 1467783054847L);
        setField(term4891, term4891.getClass(), "cdate", null);
        setField(term4766, term4766.getClass(), "createTime", term4891);
        setLongField(term4893, term4893.getClass(), "fastTime", 1825608844992L);
        setField(term4893, term4893.getClass(), "cdate", null);
        setField(term4766, term4766.getClass(), "updateTime", term4893);
        setField(term4766, term4766.getClass(), "deleted", term4895);
        setField(term4766, term4766.getClass(), "version", term4897);
        setField(term4766, term4766.getClass(), "createBy", "FwPbDZcHmB");
        setField(term4766, term4766.getClass(), "updateBy", "hOncybyCAH");
        setLongField(term4923, term4923.getClass(), "fastTime", 1465782799700L);
        setField(term4923, term4923.getClass(), "cdate", null);
        setField(term4766, term4766.getClass(), "firstRechargeTime", term4923);
        setField(term4766, term4766.getClass(), "totalRechargeAmount", term4925);
        setField(term4766, term4766.getClass(), "totalGiftAmount", term4927);
        setField(term4766, term4766.getClass(), "walletBalance", term4929);
        setField(term4766, term4766.getClass(), "frozenAmount", term4931);
        setField(term4766, term4766.getClass(), "totalRefund", term4933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QduALnDSVo";
        callMethod(klass, "setRegistrationChannel", argTypes, term4766, args);
    }

};


