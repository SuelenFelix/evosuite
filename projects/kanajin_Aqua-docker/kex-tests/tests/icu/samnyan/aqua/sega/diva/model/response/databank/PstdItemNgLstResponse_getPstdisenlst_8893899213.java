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

public class PstdItemNgLstResponse_getPstdisenlst_8893899213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3379;

    public PstdItemNgLstResponse_getPstdisenlst_8893899213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3379 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdItemNgLstResponse"));
        setField(term3379, term3379.getClass(), "p_std_i_n_lut", "UfQtPRyWRC");
        setField(term3379, term3379.getClass(), "p_std_i_ie_n_lst", "FPvxVzzSvD");
        setField(term3379, term3379.getClass(), "p_std_i_se_n_lst", "WHcwFgsGFC");
        setField(term3379, term3379.getClass(), "cmd", "HzqpegHiRq");
        setField(term3379, term3379.getClass(), "req_id", "jwsfVjMoJT");
        setField(term3379, term3379.getClass(), "stat", "ZfdXfCCFDf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdItemNgLstResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getP_std_i_se_n_lst", argTypes, term3379, args);
    }

};


