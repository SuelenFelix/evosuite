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

public class SpendCreditResponse_setCmpgnrsltnum_11415638088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term946;
     Object term1011;

    public SpendCreditResponse_setCmpgnrsltnum_11415638088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term946 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term946, term946.getClass(), "cmpgn_rslt", "UlajhuVLaP");
        setIntField(term946, term946.getClass(), "cmpgn_rslt_num", -73683645);
        setIntField(term946, term946.getClass(), "vcld_pts", -226514366);
        setField(term946, term946.getClass(), "lv_str", "gGSMzuGICf");
        setIntField(term946, term946.getClass(), "lv_efct_id", 1193880199);
        setIntField(term946, term946.getClass(), "lv_plt_id", -1087774327);
        setField(term946, term946.getClass(), "cmd", "hxCBltsObl");
        setField(term946, term946.getClass(), "req_id", "BndsHwAFMv");
        setField(term946, term946.getClass(), "stat", "GzFkzHGYFt");
        term1011 = new Integer(-1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1011;
        callMethod(klass, "setCmpgn_rslt_num", argTypes, term946, args);
    }

};


