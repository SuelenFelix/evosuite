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

public class SpendCreditResponse_getVcldpts_134309140916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1569;

    public SpendCreditResponse_getVcldpts_134309140916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1569 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term1569, term1569.getClass(), "cmpgn_rslt", null);
        setIntField(term1569, term1569.getClass(), "cmpgn_rslt_num", 0);
        setIntField(term1569, term1569.getClass(), "vcld_pts", 0);
        setField(term1569, term1569.getClass(), "lv_str", null);
        setIntField(term1569, term1569.getClass(), "lv_efct_id", 0);
        setIntField(term1569, term1569.getClass(), "lv_plt_id", 0);
        setField(term1569, term1569.getClass(), "cmd", null);
        setField(term1569, term1569.getClass(), "req_id", null);
        setField(term1569, term1569.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVcld_pts", argTypes, term1569, args);
    }

};


