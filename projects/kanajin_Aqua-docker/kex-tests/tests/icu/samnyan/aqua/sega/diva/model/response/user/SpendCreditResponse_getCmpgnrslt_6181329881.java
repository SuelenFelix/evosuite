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

public class SpendCreditResponse_getCmpgnrslt_6181329881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;

    public SpendCreditResponse_getCmpgnrslt_6181329881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term119, term119.getClass(), "cmpgn_rslt", "EGtDIRbSSb");
        setIntField(term119, term119.getClass(), "cmpgn_rslt_num", -1922583790);
        setIntField(term119, term119.getClass(), "vcld_pts", -616727354);
        setField(term119, term119.getClass(), "lv_str", "SzjVpOQTyS");
        setIntField(term119, term119.getClass(), "lv_efct_id", -1955890973);
        setIntField(term119, term119.getClass(), "lv_plt_id", -2038273078);
        setField(term119, term119.getClass(), "cmd", "MjGYSRKTNF");
        setField(term119, term119.getClass(), "req_id", "hRNSzYYIrc");
        setField(term119, term119.getClass(), "stat", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCmpgn_rslt", argTypes, term119, args);
    }

};


