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

public class SpendCreditResponse_setCmpgnrslt_8315881407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809;

    public SpendCreditResponse_setCmpgnrslt_8315881407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term809 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term809, term809.getClass(), "cmpgn_rslt", "Ghbwtircqb");
        setIntField(term809, term809.getClass(), "cmpgn_rslt_num", -1275173084);
        setIntField(term809, term809.getClass(), "vcld_pts", -244121226);
        setField(term809, term809.getClass(), "lv_str", "xrwlQZdwCp");
        setIntField(term809, term809.getClass(), "lv_efct_id", -203030934);
        setIntField(term809, term809.getClass(), "lv_plt_id", -1179120542);
        setField(term809, term809.getClass(), "cmd", "IDCWpPLRkE");
        setField(term809, term809.getClass(), "req_id", "nyiiPDVjAc");
        setField(term809, term809.getClass(), "stat", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wSQxaModmm";
        callMethod(klass, "setCmpgn_rslt", argTypes, term809, args);
    }

};


