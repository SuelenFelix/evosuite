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

public class ThirdUserPO_getPkUserId_4304482352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;

    public ThirdUserPO_getPkUserId_4304482352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term406 = new Integer(1484323161);
        Integer term408 = new Integer(391863371);
        Integer term436 = new Integer(-1922583790);
        Integer term438 = new Integer(-616727354);
        Integer term440 = new Integer(-1955890973);
        Integer term442 = new Integer(-2038273078);
        Integer term444 = new Integer(1227103734);
        term277 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term374 = newInstance(Class.forName("java.util.Date"));
        Object term376 = newInstance(Class.forName("java.util.Date"));
        Object term402 = newInstance(Class.forName("java.util.Date"));
        Object term404 = newInstance(Class.forName("java.util.Date"));
        Object term434 = newInstance(Class.forName("java.util.Date"));
        setField(term277, term277.getClass(), "pkUserId", "MxlszYVzRf");
        setField(term277, term277.getClass(), "thirdUserId", "LQFpaHEwXR");
        setField(term277, term277.getClass(), "thirdType", "oVcInYnLWB");
        setField(term277, term277.getClass(), "unionId", "aJlieCFVtF");
        setField(term277, term277.getClass(), "name", "ZiaGIbnzTs");
        setField(term277, term277.getClass(), "nickName", "tbcdzjIfER");
        setField(term277, term277.getClass(), "phoneNumber", "HyxfbSQYBe");
        setField(term277, term277.getClass(), "registrationChannel", "pCTimMblYc");
        setLongField(term374, term374.getClass(), "fastTime", 1442639565302L);
        setField(term374, term374.getClass(), "cdate", null);
        setField(term277, term277.getClass(), "registrationTime", term374);
        setLongField(term376, term376.getClass(), "fastTime", 1515890130018L);
        setField(term376, term376.getClass(), "cdate", null);
        setField(term277, term277.getClass(), "logoutTime", term376);
        setField(term277, term277.getClass(), "status", "hNxWaHcfhY");
        setField(term277, term277.getClass(), "tenantId", "RkybSrpybU");
        setLongField(term402, term402.getClass(), "fastTime", 1429023851389L);
        setField(term402, term402.getClass(), "cdate", null);
        setField(term277, term277.getClass(), "createTime", term402);
        setLongField(term404, term404.getClass(), "fastTime", 1495357463288L);
        setField(term404, term404.getClass(), "cdate", null);
        setField(term277, term277.getClass(), "updateTime", term404);
        setField(term277, term277.getClass(), "deleted", term406);
        setField(term277, term277.getClass(), "version", term408);
        setField(term277, term277.getClass(), "createBy", "xOEqzGAmDU");
        setField(term277, term277.getClass(), "updateBy", "eZFUvlxvGV");
        setLongField(term434, term434.getClass(), "fastTime", 1645834034896L);
        setField(term434, term434.getClass(), "cdate", null);
        setField(term277, term277.getClass(), "firstRechargeTime", term434);
        setField(term277, term277.getClass(), "totalRechargeAmount", term436);
        setField(term277, term277.getClass(), "totalGiftAmount", term438);
        setField(term277, term277.getClass(), "walletBalance", term440);
        setField(term277, term277.getClass(), "frozenAmount", term442);
        setField(term277, term277.getClass(), "totalRefund", term444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPkUserId", argTypes, term277, args);
    }

};


