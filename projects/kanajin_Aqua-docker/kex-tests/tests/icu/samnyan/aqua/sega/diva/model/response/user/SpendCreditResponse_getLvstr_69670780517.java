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

public class SpendCreditResponse_getLvstr_69670780517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1574;

    public SpendCreditResponse_getLvstr_69670780517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1574 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term1574, term1574.getClass(), "cmpgn_rslt", null);
        setIntField(term1574, term1574.getClass(), "cmpgn_rslt_num", 0);
        setIntField(term1574, term1574.getClass(), "vcld_pts", 0);
        setField(term1574, term1574.getClass(), "lv_str", null);
        setIntField(term1574, term1574.getClass(), "lv_efct_id", 0);
        setIntField(term1574, term1574.getClass(), "lv_plt_id", 0);
        setField(term1574, term1574.getClass(), "cmd", null);
        setField(term1574, term1574.getClass(), "req_id", null);
        setField(term1574, term1574.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_str", argTypes, term1574, args);
    }

};


