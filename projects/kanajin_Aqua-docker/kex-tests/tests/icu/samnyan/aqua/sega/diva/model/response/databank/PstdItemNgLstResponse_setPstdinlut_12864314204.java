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

public class PstdItemNgLstResponse_setPstdinlut_12864314204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3512;

    public PstdItemNgLstResponse_setPstdinlut_12864314204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3512 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdItemNgLstResponse"));
        setField(term3512, term3512.getClass(), "p_std_i_n_lut", "MwwjNtdOFT");
        setField(term3512, term3512.getClass(), "p_std_i_ie_n_lst", "VYkqXKVlAJ");
        setField(term3512, term3512.getClass(), "p_std_i_se_n_lst", "XkIoWJRNwN");
        setField(term3512, term3512.getClass(), "cmd", "aNWLJdrZMq");
        setField(term3512, term3512.getClass(), "req_id", "HHmNoYxIGj");
        setField(term3512, term3512.getClass(), "stat", "PtirvZmsGt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdItemNgLstResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HWkpTmtlrc";
        callMethod(klass, "setP_std_i_n_lut", argTypes, term3512, args);
    }

};


