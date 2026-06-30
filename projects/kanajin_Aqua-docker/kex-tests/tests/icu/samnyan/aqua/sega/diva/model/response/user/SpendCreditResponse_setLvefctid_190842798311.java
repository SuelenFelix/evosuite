package icu.samnyan.aqua.sega.diva.model.response.user;

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
import static icu.samnyan.aqua.sega.diva.model.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SpendCreditResponse_setLvefctid_190842798311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1317;
     Object term1382;

    public SpendCreditResponse_setLvefctid_190842798311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1317 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term1317, term1317.getClass(), "cmpgn_rslt", "MLqYREekMl");
        setIntField(term1317, term1317.getClass(), "cmpgn_rslt_num", -1016503459);
        setIntField(term1317, term1317.getClass(), "vcld_pts", -1968847291);
        setField(term1317, term1317.getClass(), "lv_str", "ytSBIKXogI");
        setIntField(term1317, term1317.getClass(), "lv_efct_id", 579005622);
        setIntField(term1317, term1317.getClass(), "lv_plt_id", -14890619);
        setField(term1317, term1317.getClass(), "cmd", "nHXjMycHlU");
        setField(term1317, term1317.getClass(), "req_id", "ieCtQFdkii");
        setField(term1317, term1317.getClass(), "stat", "dEnhdmILtU");
        term1382 = new Integer(1632125673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1382;
        callMethod(klass, "setLv_efct_id", argTypes, term1317, args);
    }

};


