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

public class SpendCreditResponse_getCmpgnrsltnum_16133028822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234;

    public SpendCreditResponse_getCmpgnrsltnum_16133028822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term234, term234.getClass(), "cmpgn_rslt", "NRdvgJlhkX");
        setIntField(term234, term234.getClass(), "cmpgn_rslt_num", 1227103734);
        setIntField(term234, term234.getClass(), "vcld_pts", -1339778481);
        setField(term234, term234.getClass(), "lv_str", "uuaPigETmJ");
        setIntField(term234, term234.getClass(), "lv_efct_id", 1725571209);
        setIntField(term234, term234.getClass(), "lv_plt_id", -522618178);
        setField(term234, term234.getClass(), "cmd", "MxlszYVzRf");
        setField(term234, term234.getClass(), "req_id", "LQFpaHEwXR");
        setField(term234, term234.getClass(), "stat", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCmpgn_rslt_num", argTypes, term234, args);
    }

};


