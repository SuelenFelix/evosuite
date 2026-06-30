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

public class SpendCreditResponse_getVcldpts_13430914093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349;

    public SpendCreditResponse_getVcldpts_13430914093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term349, term349.getClass(), "cmpgn_rslt", "aJlieCFVtF");
        setIntField(term349, term349.getClass(), "cmpgn_rslt_num", 1134449235);
        setIntField(term349, term349.getClass(), "vcld_pts", -883034806);
        setField(term349, term349.getClass(), "lv_str", "ZiaGIbnzTs");
        setIntField(term349, term349.getClass(), "lv_efct_id", 1585847225);
        setIntField(term349, term349.getClass(), "lv_plt_id", 597278769);
        setField(term349, term349.getClass(), "cmd", "tbcdzjIfER");
        setField(term349, term349.getClass(), "req_id", "HyxfbSQYBe");
        setField(term349, term349.getClass(), "stat", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVcld_pts", argTypes, term349, args);
    }

};


