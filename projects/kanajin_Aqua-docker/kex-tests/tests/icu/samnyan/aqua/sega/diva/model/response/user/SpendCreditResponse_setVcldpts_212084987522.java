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

public class SpendCreditResponse_setVcldpts_212084987522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1601;
     Object term1606;

    public SpendCreditResponse_setVcldpts_212084987522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1601 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term1601, term1601.getClass(), "cmpgn_rslt", null);
        setIntField(term1601, term1601.getClass(), "cmpgn_rslt_num", 0);
        setIntField(term1601, term1601.getClass(), "vcld_pts", 0);
        setField(term1601, term1601.getClass(), "lv_str", null);
        setIntField(term1601, term1601.getClass(), "lv_efct_id", 0);
        setIntField(term1601, term1601.getClass(), "lv_plt_id", 0);
        setField(term1601, term1601.getClass(), "cmd", null);
        setField(term1601, term1601.getClass(), "req_id", null);
        setField(term1601, term1601.getClass(), "stat", null);
        term1606 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1606;
        callMethod(klass, "setVcld_pts", argTypes, term1601, args);
    }

};


