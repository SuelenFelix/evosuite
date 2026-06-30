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

public class ThirdUserPO_setWalletBalance_82890742845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12986;
     Object term13155;

    public ThirdUserPO_setWalletBalance_82890742845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13115 = new Integer(76929641);
        Integer term13117 = new Integer(-2003192918);
        Integer term13145 = new Integer(-1362856620);
        Integer term13147 = new Integer(-1835839814);
        Integer term13149 = new Integer(-1404350380);
        Integer term13151 = new Integer(-2013924238);
        Integer term13153 = new Integer(579006268);
        term12986 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term13083 = newInstance(Class.forName("java.util.Date"));
        Object term13085 = newInstance(Class.forName("java.util.Date"));
        Object term13111 = newInstance(Class.forName("java.util.Date"));
        Object term13113 = newInstance(Class.forName("java.util.Date"));
        Object term13143 = newInstance(Class.forName("java.util.Date"));
        setField(term12986, term12986.getClass(), "pkUserId", "zMsSLTfGhl");
        setField(term12986, term12986.getClass(), "thirdUserId", "bEmHScVZaQ");
        setField(term12986, term12986.getClass(), "thirdType", "TcuXODkzBV");
        setField(term12986, term12986.getClass(), "unionId", "coJPjrBZNe");
        setField(term12986, term12986.getClass(), "name", "vMsWjuPTnO");
        setField(term12986, term12986.getClass(), "nickName", "zHvfKaOstO");
        setField(term12986, term12986.getClass(), "phoneNumber", "tOszriqETr");
        setField(term12986, term12986.getClass(), "registrationChannel", "ncSPTkhKjO");
        setLongField(term13083, term13083.getClass(), "fastTime", 1838972963174L);
        setField(term13083, term13083.getClass(), "cdate", null);
        setField(term12986, term12986.getClass(), "registrationTime", term13083);
        setLongField(term13085, term13085.getClass(), "fastTime", 1498477973553L);
        setField(term13085, term13085.getClass(), "cdate", null);
        setField(term12986, term12986.getClass(), "logoutTime", term13085);
        setField(term12986, term12986.getClass(), "status", "jcWKHRWhyj");
        setField(term12986, term12986.getClass(), "tenantId", "nrQjODRMLD");
        setLongField(term13111, term13111.getClass(), "fastTime", 1619073156188L);
        setField(term13111, term13111.getClass(), "cdate", null);
        setField(term12986, term12986.getClass(), "createTime", term13111);
        setLongField(term13113, term13113.getClass(), "fastTime", 1275828301071L);
        setField(term13113, term13113.getClass(), "cdate", null);
        setField(term12986, term12986.getClass(), "updateTime", term13113);
        setField(term12986, term12986.getClass(), "deleted", term13115);
        setField(term12986, term12986.getClass(), "version", term13117);
        setField(term12986, term12986.getClass(), "createBy", "PNoWXrsFic");
        setField(term12986, term12986.getClass(), "updateBy", "QZBHZqZope");
        setLongField(term13143, term13143.getClass(), "fastTime", 1792332776506L);
        setField(term13143, term13143.getClass(), "cdate", null);
        setField(term12986, term12986.getClass(), "firstRechargeTime", term13143);
        setField(term12986, term12986.getClass(), "totalRechargeAmount", term13145);
        setField(term12986, term12986.getClass(), "totalGiftAmount", term13147);
        setField(term12986, term12986.getClass(), "walletBalance", term13149);
        setField(term12986, term12986.getClass(), "frozenAmount", term13151);
        setField(term12986, term12986.getClass(), "totalRefund", term13153);
        term13155 = new Integer(-1694747156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term13155;
        callMethod(klass, "setWalletBalance", argTypes, term12986, args);
    }

};


