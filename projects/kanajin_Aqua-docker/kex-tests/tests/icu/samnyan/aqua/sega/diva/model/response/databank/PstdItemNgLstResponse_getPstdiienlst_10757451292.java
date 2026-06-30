package icu.samnyan.aqua.sega.diva.model.response.databank;

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
import static icu.samnyan.aqua.sega.diva.model.response.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PstdItemNgLstResponse_getPstdiienlst_10757451292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3246;

    public PstdItemNgLstResponse_getPstdiienlst_10757451292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3246 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdItemNgLstResponse"));
        setField(term3246, term3246.getClass(), "p_std_i_n_lut", "LWyEaeIyAo");
        setField(term3246, term3246.getClass(), "p_std_i_ie_n_lst", "yVMkkQhvmN");
        setField(term3246, term3246.getClass(), "p_std_i_se_n_lst", "mvrkADEgpp");
        setField(term3246, term3246.getClass(), "cmd", "pXOkjyeIRb");
        setField(term3246, term3246.getClass(), "req_id", "GgZWSjxjyE");
        setField(term3246, term3246.getClass(), "stat", "EeBVbzjcCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdItemNgLstResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getP_std_i_ie_n_lst", argTypes, term3246, args);
    }

};


