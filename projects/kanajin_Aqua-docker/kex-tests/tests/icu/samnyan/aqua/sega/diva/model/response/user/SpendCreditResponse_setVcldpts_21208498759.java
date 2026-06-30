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

public class SpendCreditResponse_setVcldpts_21208498759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1063;
     Object term1128;

    public SpendCreditResponse_setVcldpts_21208498759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1063 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term1063, term1063.getClass(), "cmpgn_rslt", "tShwQLRGNe");
        setIntField(term1063, term1063.getClass(), "cmpgn_rslt_num", -469968304);
        setIntField(term1063, term1063.getClass(), "vcld_pts", -1145578966);
        setField(term1063, term1063.getClass(), "lv_str", "LvtrsXUliU");
        setIntField(term1063, term1063.getClass(), "lv_efct_id", 679763016);
        setIntField(term1063, term1063.getClass(), "lv_plt_id", 1962444399);
        setField(term1063, term1063.getClass(), "cmd", "xLbjWUgOIL");
        setField(term1063, term1063.getClass(), "req_id", "jDtqGUpnZN");
        setField(term1063, term1063.getClass(), "stat", "nGKItKLYNC");
        term1128 = new Integer(767834723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1128;
        callMethod(klass, "setVcld_pts", argTypes, term1063, args);
    }

};


