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

public class SpendCreditResponse_setLvstr_175234567510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1180;

    public SpendCreditResponse_setLvstr_175234567510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1180 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse"));
        setField(term1180, term1180.getClass(), "cmpgn_rslt", "UiUYnPrcCi");
        setIntField(term1180, term1180.getClass(), "cmpgn_rslt_num", -602026508);
        setIntField(term1180, term1180.getClass(), "vcld_pts", -157887805);
        setField(term1180, term1180.getClass(), "lv_str", "UoYtihxVaS");
        setIntField(term1180, term1180.getClass(), "lv_efct_id", 1876565163);
        setIntField(term1180, term1180.getClass(), "lv_plt_id", -817164822);
        setField(term1180, term1180.getClass(), "cmd", "JDswTTCZHV");
        setField(term1180, term1180.getClass(), "req_id", "onpbIeEKoi");
        setField(term1180, term1180.getClass(), "stat", "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ffYhPOzlUs";
        callMethod(klass, "setLv_str", argTypes, term1180, args);
    }

};


