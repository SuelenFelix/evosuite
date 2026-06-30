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

public class SpendCreditResponse_getLvpltid_6147752076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694;

    public SpendCreditResponse_getLvpltid_6147752076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term694 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term694, term694.getClass(), "cmpgn_rslt", "OWDIEULEFu");
        setIntField(term694, term694.getClass(), "cmpgn_rslt_num", -1007160944);
        setIntField(term694, term694.getClass(), "vcld_pts", 1135664017);
        setField(term694, term694.getClass(), "lv_str", "dWRymuLBtr");
        setIntField(term694, term694.getClass(), "lv_efct_id", 590364439);
        setIntField(term694, term694.getClass(), "lv_plt_id", 865208305);
        setField(term694, term694.getClass(), "cmd", "AijpHYOFuy");
        setField(term694, term694.getClass(), "req_id", "SbAoxhfrkn");
        setField(term694, term694.getClass(), "stat", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_plt_id", argTypes, term694, args);
    }

};


