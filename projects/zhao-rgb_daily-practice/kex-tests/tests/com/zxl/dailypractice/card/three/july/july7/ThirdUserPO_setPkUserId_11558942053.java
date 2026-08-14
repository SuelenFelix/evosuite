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

public class ThirdUserPO_setPkUserId_11558942053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566;

    public ThirdUserPO_setPkUserId_11558942053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term695 = new Integer(-1339778481);
        Integer term697 = new Integer(1725571209);
        Integer term725 = new Integer(-522618178);
        Integer term727 = new Integer(1134449235);
        Integer term729 = new Integer(-883034806);
        Integer term731 = new Integer(1585847225);
        Integer term733 = new Integer(597278769);
        term566 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term663 = newInstance(Class.forName("java.util.Date"));
        Object term665 = newInstance(Class.forName("java.util.Date"));
        Object term691 = newInstance(Class.forName("java.util.Date"));
        Object term693 = newInstance(Class.forName("java.util.Date"));
        Object term723 = newInstance(Class.forName("java.util.Date"));
        setField(term566, term566.getClass(), "pkUserId", "BYqFIqCKAV");
        setField(term566, term566.getClass(), "thirdUserId", "vrQLuWIDJX");
        setField(term566, term566.getClass(), "thirdType", "flxyYxBRtu");
        setField(term566, term566.getClass(), "unionId", "OclPbYPkcH");
        setField(term566, term566.getClass(), "name", "IoAlmYsBwc");
        setField(term566, term566.getClass(), "nickName", "TEParAifyi");
        setField(term566, term566.getClass(), "phoneNumber", "OWDIEULEFu");
        setField(term566, term566.getClass(), "registrationChannel", "dWRymuLBtr");
        setLongField(term663, term663.getClass(), "fastTime", 1500721068023L);
        setField(term663, term663.getClass(), "cdate", null);
        setField(term566, term566.getClass(), "registrationTime", term663);
        setLongField(term665, term665.getClass(), "fastTime", 1797203628025L);
        setField(term665, term665.getClass(), "cdate", null);
        setField(term566, term566.getClass(), "logoutTime", term665);
        setField(term566, term566.getClass(), "status", "AijpHYOFuy");
        setField(term566, term566.getClass(), "tenantId", "SbAoxhfrkn");
        setLongField(term691, term691.getClass(), "fastTime", 1589457921030L);
        setField(term691, term691.getClass(), "cdate", null);
        setField(term566, term566.getClass(), "createTime", term691);
        setLongField(term693, term693.getClass(), "fastTime", 1745462962080L);
        setField(term693, term693.getClass(), "cdate", null);
        setField(term566, term566.getClass(), "updateTime", term693);
        setField(term566, term566.getClass(), "deleted", term695);
        setField(term566, term566.getClass(), "version", term697);
        setField(term566, term566.getClass(), "createBy", "kuTXqwMtDB");
        setField(term566, term566.getClass(), "updateBy", "Ghbwtircqb");
        setLongField(term723, term723.getClass(), "fastTime", 1349069753960L);
        setField(term723, term723.getClass(), "cdate", null);
        setField(term566, term566.getClass(), "firstRechargeTime", term723);
        setField(term566, term566.getClass(), "totalRechargeAmount", term725);
        setField(term566, term566.getClass(), "totalGiftAmount", term727);
        setField(term566, term566.getClass(), "walletBalance", term729);
        setField(term566, term566.getClass(), "frozenAmount", term731);
        setField(term566, term566.getClass(), "totalRefund", term733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xrwlQZdwCp";
        callMethod(klass, "setPkUserId", argTypes, term566, args);
    }

};


