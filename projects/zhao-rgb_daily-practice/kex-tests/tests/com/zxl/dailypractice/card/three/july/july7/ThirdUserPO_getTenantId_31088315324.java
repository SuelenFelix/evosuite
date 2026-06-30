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

public class ThirdUserPO_getTenantId_31088315324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6837;

    public ThirdUserPO_getTenantId_31088315324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6966 = new Integer(1830648570);
        Integer term6968 = new Integer(-227365013);
        Integer term6996 = new Integer(11724947);
        Integer term6998 = new Integer(1953277050);
        Integer term7000 = new Integer(1283079251);
        Integer term7002 = new Integer(-523949691);
        Integer term7004 = new Integer(1398204340);
        term6837 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term6934 = newInstance(Class.forName("java.util.Date"));
        Object term6936 = newInstance(Class.forName("java.util.Date"));
        Object term6962 = newInstance(Class.forName("java.util.Date"));
        Object term6964 = newInstance(Class.forName("java.util.Date"));
        Object term6994 = newInstance(Class.forName("java.util.Date"));
        setField(term6837, term6837.getClass(), "pkUserId", "tsTGdgQYUL");
        setField(term6837, term6837.getClass(), "thirdUserId", "TtGbVmKcnX");
        setField(term6837, term6837.getClass(), "thirdType", "GJVkUrCVdD");
        setField(term6837, term6837.getClass(), "unionId", "zNdorvdUgu");
        setField(term6837, term6837.getClass(), "name", "oPxuZbkYio");
        setField(term6837, term6837.getClass(), "nickName", "vKitydDVnM");
        setField(term6837, term6837.getClass(), "phoneNumber", "urCiQnUFBM");
        setField(term6837, term6837.getClass(), "registrationChannel", "EKjQdtKxAM");
        setLongField(term6934, term6934.getClass(), "fastTime", 1743136792108L);
        setField(term6934, term6934.getClass(), "cdate", null);
        setField(term6837, term6837.getClass(), "registrationTime", term6934);
        setLongField(term6936, term6936.getClass(), "fastTime", 1728457746580L);
        setField(term6936, term6936.getClass(), "cdate", null);
        setField(term6837, term6837.getClass(), "logoutTime", term6936);
        setField(term6837, term6837.getClass(), "status", "TXZAIPQJHt");
        setField(term6837, term6837.getClass(), "tenantId", "DIbeDHICho");
        setLongField(term6962, term6962.getClass(), "fastTime", 1709178890088L);
        setField(term6962, term6962.getClass(), "cdate", null);
        setField(term6837, term6837.getClass(), "createTime", term6962);
        setLongField(term6964, term6964.getClass(), "fastTime", 1644776129220L);
        setField(term6964, term6964.getClass(), "cdate", null);
        setField(term6837, term6837.getClass(), "updateTime", term6964);
        setField(term6837, term6837.getClass(), "deleted", term6966);
        setField(term6837, term6837.getClass(), "version", term6968);
        setField(term6837, term6837.getClass(), "createBy", "dJGPlmSRnz");
        setField(term6837, term6837.getClass(), "updateBy", "DPskuFUobI");
        setLongField(term6994, term6994.getClass(), "fastTime", 1456374715658L);
        setField(term6994, term6994.getClass(), "cdate", null);
        setField(term6837, term6837.getClass(), "firstRechargeTime", term6994);
        setField(term6837, term6837.getClass(), "totalRechargeAmount", term6996);
        setField(term6837, term6837.getClass(), "totalGiftAmount", term6998);
        setField(term6837, term6837.getClass(), "walletBalance", term7000);
        setField(term6837, term6837.getClass(), "frozenAmount", term7002);
        setField(term6837, term6837.getClass(), "totalRefund", term7004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTenantId", argTypes, term6837, args);
    }

};


