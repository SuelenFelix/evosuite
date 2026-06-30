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

public class FestaInfoResponse_getFilut_69388912311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7381;

    public FestaInfoResponse_getFilut_69388912311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7381 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term7381, term7381.getClass(), "fi_id", "IBpaxltauX");
        setField(term7381, term7381.getClass(), "fi_name", "hePqROaplw");
        setField(term7381, term7381.getClass(), "fi_kind", "PJcSNDruWd");
        setField(term7381, term7381.getClass(), "fi_difficulty", "VVNNlAePXF");
        setField(term7381, term7381.getClass(), "fi_pv_id_lst", "jnwVnmKAFv");
        setField(term7381, term7381.getClass(), "fi_attr", "TXyHhqeCjR");
        setField(term7381, term7381.getClass(), "fi_add_vp", "lZIgPZPgTu");
        setField(term7381, term7381.getClass(), "fi_mul_vp", "iuCxnHGMoW");
        setField(term7381, term7381.getClass(), "fi_st", "GPSEWEDSTo");
        setField(term7381, term7381.getClass(), "fi_et", "RCOqfVsRHt");
        setField(term7381, term7381.getClass(), "fi_lut", "TSyCeEZPaT");
        setField(term7381, term7381.getClass(), "cmd", "JeZFtaqkzW");
        setField(term7381, term7381.getClass(), "req_id", "vOVuNSCCLe");
        setField(term7381, term7381.getClass(), "stat", "fzeqPnzpnt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFi_lut", argTypes, term7381, args);
    }

};


