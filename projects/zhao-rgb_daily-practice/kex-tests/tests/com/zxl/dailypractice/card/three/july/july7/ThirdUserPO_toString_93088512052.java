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

public class ThirdUserPO_toString_93088512052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15016;

    public ThirdUserPO_toString_93088512052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term15145 = new Integer(-1813280137);
        Integer term15147 = new Integer(719656595);
        Integer term15175 = new Integer(-1516995753);
        Integer term15177 = new Integer(-390501023);
        Integer term15179 = new Integer(-1667482829);
        Integer term15181 = new Integer(1116576792);
        Integer term15183 = new Integer(-942194446);
        term15016 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term15113 = newInstance(Class.forName("java.util.Date"));
        Object term15115 = newInstance(Class.forName("java.util.Date"));
        Object term15141 = newInstance(Class.forName("java.util.Date"));
        Object term15143 = newInstance(Class.forName("java.util.Date"));
        Object term15173 = newInstance(Class.forName("java.util.Date"));
        setField(term15016, term15016.getClass(), "pkUserId", "ZDhASPHjDG");
        setField(term15016, term15016.getClass(), "thirdUserId", "HNVOAXYNEZ");
        setField(term15016, term15016.getClass(), "thirdType", "gbbYBYyfvr");
        setField(term15016, term15016.getClass(), "unionId", "SrWMUlbtWV");
        setField(term15016, term15016.getClass(), "name", "VePIumgrrU");
        setField(term15016, term15016.getClass(), "nickName", "DPwIqlszZo");
        setField(term15016, term15016.getClass(), "phoneNumber", "mNgDshwZNc");
        setField(term15016, term15016.getClass(), "registrationChannel", "pDqgDbJoFw");
        setLongField(term15113, term15113.getClass(), "fastTime", 1818617156349L);
        setField(term15113, term15113.getClass(), "cdate", null);
        setField(term15016, term15016.getClass(), "registrationTime", term15113);
        setLongField(term15115, term15115.getClass(), "fastTime", 1560286398870L);
        setField(term15115, term15115.getClass(), "cdate", null);
        setField(term15016, term15016.getClass(), "logoutTime", term15115);
        setField(term15016, term15016.getClass(), "status", "iVOvTzOxwt");
        setField(term15016, term15016.getClass(), "tenantId", "BjZQdecXvB");
        setLongField(term15141, term15141.getClass(), "fastTime", 1791294437021L);
        setField(term15141, term15141.getClass(), "cdate", null);
        setField(term15016, term15016.getClass(), "createTime", term15141);
        setLongField(term15143, term15143.getClass(), "fastTime", 1407926618924L);
        setField(term15143, term15143.getClass(), "cdate", null);
        setField(term15016, term15016.getClass(), "updateTime", term15143);
        setField(term15016, term15016.getClass(), "deleted", term15145);
        setField(term15016, term15016.getClass(), "version", term15147);
        setField(term15016, term15016.getClass(), "createBy", "iUkOOQhEkw");
        setField(term15016, term15016.getClass(), "updateBy", "wmVoFoUVmU");
        setLongField(term15173, term15173.getClass(), "fastTime", 1536062261151L);
        setField(term15173, term15173.getClass(), "cdate", null);
        setField(term15016, term15016.getClass(), "firstRechargeTime", term15173);
        setField(term15016, term15016.getClass(), "totalRechargeAmount", term15175);
        setField(term15016, term15016.getClass(), "totalGiftAmount", term15177);
        setField(term15016, term15016.getClass(), "walletBalance", term15179);
        setField(term15016, term15016.getClass(), "frozenAmount", term15181);
        setField(term15016, term15016.getClass(), "totalRefund", term15183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term15016, args);
    }

};


