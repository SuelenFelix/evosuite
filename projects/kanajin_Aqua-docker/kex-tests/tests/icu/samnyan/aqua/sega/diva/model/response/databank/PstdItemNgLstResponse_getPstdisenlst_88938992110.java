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

public class PstdItemNgLstResponse_getPstdisenlst_88938992110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3979;

    public PstdItemNgLstResponse_getPstdisenlst_88938992110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3979 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdItemNgLstResponse"));
        setField(term3979, term3979.getClass(), "p_std_i_n_lut", null);
        setField(term3979, term3979.getClass(), "p_std_i_ie_n_lst", null);
        setField(term3979, term3979.getClass(), "p_std_i_se_n_lst", null);
        setField(term3979, term3979.getClass(), "cmd", null);
        setField(term3979, term3979.getClass(), "req_id", null);
        setField(term3979, term3979.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdItemNgLstResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getP_std_i_se_n_lst", argTypes, term3979, args);
    }

};


