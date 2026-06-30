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

public class SpendCreditResponse_getLvefctid_14721595355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579;

    public SpendCreditResponse_getLvefctid_14721595355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term579 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term579, term579.getClass(), "cmpgn_rslt", "vrQLuWIDJX");
        setIntField(term579, term579.getClass(), "cmpgn_rslt_num", -655067527);
        setIntField(term579, term579.getClass(), "vcld_pts", -6029667);
        setField(term579, term579.getClass(), "lv_str", "flxyYxBRtu");
        setIntField(term579, term579.getClass(), "lv_efct_id", -2068769794);
        setIntField(term579, term579.getClass(), "lv_plt_id", -117576464);
        setField(term579, term579.getClass(), "cmd", "OclPbYPkcH");
        setField(term579, term579.getClass(), "req_id", "IoAlmYsBwc");
        setField(term579, term579.getClass(), "stat", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_efct_id", argTypes, term579, args);
    }

};


