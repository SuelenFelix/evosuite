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

public class ThirdUserPO_setCreateBy_107374235735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10046;

    public ThirdUserPO_setCreateBy_107374235735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10175 = new Integer(-542712742);
        Integer term10177 = new Integer(-1254072822);
        Integer term10205 = new Integer(-1111249833);
        Integer term10207 = new Integer(-1692331299);
        Integer term10209 = new Integer(479531250);
        Integer term10211 = new Integer(1320570890);
        Integer term10213 = new Integer(-130649791);
        term10046 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term10143 = newInstance(Class.forName("java.util.Date"));
        Object term10145 = newInstance(Class.forName("java.util.Date"));
        Object term10171 = newInstance(Class.forName("java.util.Date"));
        Object term10173 = newInstance(Class.forName("java.util.Date"));
        Object term10203 = newInstance(Class.forName("java.util.Date"));
        setField(term10046, term10046.getClass(), "pkUserId", "vhKzFyKPOT");
        setField(term10046, term10046.getClass(), "thirdUserId", "nQhIgWXdRc");
        setField(term10046, term10046.getClass(), "thirdType", "EusenEbIoF");
        setField(term10046, term10046.getClass(), "unionId", "SScVQYSvWH");
        setField(term10046, term10046.getClass(), "name", "MnovcqFhCl");
        setField(term10046, term10046.getClass(), "nickName", "qYtAeLzOhW");
        setField(term10046, term10046.getClass(), "phoneNumber", "tJzmOfcUnY");
        setField(term10046, term10046.getClass(), "registrationChannel", "TKlccZUpjz");
        setLongField(term10143, term10143.getClass(), "fastTime", 1598713731907L);
        setField(term10143, term10143.getClass(), "cdate", null);
        setField(term10046, term10046.getClass(), "registrationTime", term10143);
        setLongField(term10145, term10145.getClass(), "fastTime", 1707086031965L);
        setField(term10145, term10145.getClass(), "cdate", null);
        setField(term10046, term10046.getClass(), "logoutTime", term10145);
        setField(term10046, term10046.getClass(), "status", "GGzwMoHZXC");
        setField(term10046, term10046.getClass(), "tenantId", "IpmgwHTgnG");
        setLongField(term10171, term10171.getClass(), "fastTime", 1697617324008L);
        setField(term10171, term10171.getClass(), "cdate", null);
        setField(term10046, term10046.getClass(), "createTime", term10171);
        setLongField(term10173, term10173.getClass(), "fastTime", 1684755976817L);
        setField(term10173, term10173.getClass(), "cdate", null);
        setField(term10046, term10046.getClass(), "updateTime", term10173);
        setField(term10046, term10046.getClass(), "deleted", term10175);
        setField(term10046, term10046.getClass(), "version", term10177);
        setField(term10046, term10046.getClass(), "createBy", "tIpkeYIezR");
        setField(term10046, term10046.getClass(), "updateBy", "YkZtEtthvz");
        setLongField(term10203, term10203.getClass(), "fastTime", 1449316822527L);
        setField(term10203, term10203.getClass(), "cdate", null);
        setField(term10046, term10046.getClass(), "firstRechargeTime", term10203);
        setField(term10046, term10046.getClass(), "totalRechargeAmount", term10205);
        setField(term10046, term10046.getClass(), "totalGiftAmount", term10207);
        setField(term10046, term10046.getClass(), "walletBalance", term10209);
        setField(term10046, term10046.getClass(), "frozenAmount", term10211);
        setField(term10046, term10046.getClass(), "totalRefund", term10213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dwlZSxlXOo";
        callMethod(klass, "setCreateBy", argTypes, term10046, args);
    }

};


