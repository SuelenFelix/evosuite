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

public class SpendCreditResponse_setLvpltid_115333374312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1434;
     Object term1499;

    public SpendCreditResponse_setLvpltid_115333374312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1434 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term1434, term1434.getClass(), "cmpgn_rslt", "hoicvmsovO");
        setIntField(term1434, term1434.getClass(), "cmpgn_rslt_num", 454281060);
        setIntField(term1434, term1434.getClass(), "vcld_pts", -1786399638);
        setField(term1434, term1434.getClass(), "lv_str", "eqJfYWRaEL");
        setIntField(term1434, term1434.getClass(), "lv_efct_id", 2055867847);
        setIntField(term1434, term1434.getClass(), "lv_plt_id", -1048298087);
        setField(term1434, term1434.getClass(), "cmd", "fhkbdRViHi");
        setField(term1434, term1434.getClass(), "req_id", "uWHnvSvaPl");
        setField(term1434, term1434.getClass(), "stat", "kBdSllIBVz");
        term1499 = new Integer(292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1499;
        callMethod(klass, "setLv_plt_id", argTypes, term1434, args);
    }

};


