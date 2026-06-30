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

public class SpendCreditResponse_setLvefctid_190842798324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1613;
     Object term1618;

    public SpendCreditResponse_setLvefctid_190842798324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1613 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term1613, term1613.getClass(), "cmpgn_rslt", null);
        setIntField(term1613, term1613.getClass(), "cmpgn_rslt_num", 0);
        setIntField(term1613, term1613.getClass(), "vcld_pts", 0);
        setField(term1613, term1613.getClass(), "lv_str", null);
        setIntField(term1613, term1613.getClass(), "lv_efct_id", 0);
        setIntField(term1613, term1613.getClass(), "lv_plt_id", 0);
        setField(term1613, term1613.getClass(), "cmd", null);
        setField(term1613, term1613.getClass(), "req_id", null);
        setField(term1613, term1613.getClass(), "stat", null);
        term1618 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1618;
        callMethod(klass, "setLv_efct_id", argTypes, term1613, args);
    }

};


