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

public class ThirdUserPO_getUnionId_9766731928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2077;

    public ThirdUserPO_getUnionId_9766731928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2206 = new Integer(1876565163);
        Integer term2208 = new Integer(-817164822);
        Integer term2236 = new Integer(-1016503459);
        Integer term2238 = new Integer(-1968847291);
        Integer term2240 = new Integer(579005622);
        Integer term2242 = new Integer(-14890619);
        Integer term2244 = new Integer(1632125673);
        term2077 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term2174 = newInstance(Class.forName("java.util.Date"));
        Object term2176 = newInstance(Class.forName("java.util.Date"));
        Object term2202 = newInstance(Class.forName("java.util.Date"));
        Object term2204 = newInstance(Class.forName("java.util.Date"));
        Object term2234 = newInstance(Class.forName("java.util.Date"));
        setField(term2077, term2077.getClass(), "pkUserId", "TimdotUuNC");
        setField(term2077, term2077.getClass(), "thirdUserId", "PkWMRdJcBb");
        setField(term2077, term2077.getClass(), "thirdType", "jSpAteRute");
        setField(term2077, term2077.getClass(), "unionId", "swZVeJAxjt");
        setField(term2077, term2077.getClass(), "name", "xOcJIiQQDu");
        setField(term2077, term2077.getClass(), "nickName", "GVizqqzXpy");
        setField(term2077, term2077.getClass(), "phoneNumber", "JqXGgAhZPl");
        setField(term2077, term2077.getClass(), "registrationChannel", "jiKYgYHqIS");
        setLongField(term2174, term2174.getClass(), "fastTime", 1876872800559L);
        setField(term2174, term2174.getClass(), "cdate", null);
        setField(term2077, term2077.getClass(), "registrationTime", term2174);
        setLongField(term2176, term2176.getClass(), "fastTime", 1304532099366L);
        setField(term2176, term2176.getClass(), "cdate", null);
        setField(term2077, term2077.getClass(), "logoutTime", term2176);
        setField(term2077, term2077.getClass(), "status", "DfISiziTgG");
        setField(term2077, term2077.getClass(), "tenantId", "XqgfKFvPSD");
        setLongField(term2202, term2202.getClass(), "fastTime", 1488725902101L);
        setField(term2202, term2202.getClass(), "cdate", null);
        setField(term2077, term2077.getClass(), "createTime", term2202);
        setLongField(term2204, term2204.getClass(), "fastTime", 1311560117361L);
        setField(term2204, term2204.getClass(), "cdate", null);
        setField(term2077, term2077.getClass(), "updateTime", term2204);
        setField(term2077, term2077.getClass(), "deleted", term2206);
        setField(term2077, term2077.getClass(), "version", term2208);
        setField(term2077, term2077.getClass(), "createBy", "JiVRgTZvKc");
        setField(term2077, term2077.getClass(), "updateBy", "XPKmummaqg");
        setLongField(term2234, term2234.getClass(), "fastTime", 1595517583842L);
        setField(term2234, term2234.getClass(), "cdate", null);
        setField(term2077, term2077.getClass(), "firstRechargeTime", term2234);
        setField(term2077, term2077.getClass(), "totalRechargeAmount", term2236);
        setField(term2077, term2077.getClass(), "totalGiftAmount", term2238);
        setField(term2077, term2077.getClass(), "walletBalance", term2240);
        setField(term2077, term2077.getClass(), "frozenAmount", term2242);
        setField(term2077, term2077.getClass(), "totalRefund", term2244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnionId", argTypes, term2077, args);
    }

};


