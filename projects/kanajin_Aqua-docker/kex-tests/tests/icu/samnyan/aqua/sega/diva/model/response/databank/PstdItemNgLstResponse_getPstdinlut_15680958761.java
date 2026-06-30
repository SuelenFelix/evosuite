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

public class PstdItemNgLstResponse_getPstdinlut_15680958761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3113;

    public PstdItemNgLstResponse_getPstdinlut_15680958761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3113 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdItemNgLstResponse"));
        setField(term3113, term3113.getClass(), "p_std_i_n_lut", "gCWtLVKVVe");
        setField(term3113, term3113.getClass(), "p_std_i_ie_n_lst", "fWKJoSoCwE");
        setField(term3113, term3113.getClass(), "p_std_i_se_n_lst", "wfaXBpWAUH");
        setField(term3113, term3113.getClass(), "cmd", "VMeAzAHwZj");
        setField(term3113, term3113.getClass(), "req_id", "PznxWXsZME");
        setField(term3113, term3113.getClass(), "stat", "ZzIujlwVsw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdItemNgLstResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getP_std_i_n_lut", argTypes, term3113, args);
    }

};


