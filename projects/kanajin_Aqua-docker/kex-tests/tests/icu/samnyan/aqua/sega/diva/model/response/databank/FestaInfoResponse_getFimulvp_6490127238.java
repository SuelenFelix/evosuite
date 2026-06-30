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

public class FestaInfoResponse_getFimulvp_6490127238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6454;

    public FestaInfoResponse_getFimulvp_6490127238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6454 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term6454, term6454.getClass(), "fi_id", "tsTGdgQYUL");
        setField(term6454, term6454.getClass(), "fi_name", "TtGbVmKcnX");
        setField(term6454, term6454.getClass(), "fi_kind", "GJVkUrCVdD");
        setField(term6454, term6454.getClass(), "fi_difficulty", "zNdorvdUgu");
        setField(term6454, term6454.getClass(), "fi_pv_id_lst", "oPxuZbkYio");
        setField(term6454, term6454.getClass(), "fi_attr", "vKitydDVnM");
        setField(term6454, term6454.getClass(), "fi_add_vp", "urCiQnUFBM");
        setField(term6454, term6454.getClass(), "fi_mul_vp", "EKjQdtKxAM");
        setField(term6454, term6454.getClass(), "fi_st", "TXZAIPQJHt");
        setField(term6454, term6454.getClass(), "fi_et", "DIbeDHICho");
        setField(term6454, term6454.getClass(), "fi_lut", "dJGPlmSRnz");
        setField(term6454, term6454.getClass(), "cmd", "DPskuFUobI");
        setField(term6454, term6454.getClass(), "req_id", "wBGfLpNNiZ");
        setField(term6454, term6454.getClass(), "stat", "yUGCjlqgJE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFi_mul_vp", argTypes, term6454, args);
    }

};


