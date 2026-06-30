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

public class FestaInfoResponse_getFipvidlst_3882994365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5527;

    public FestaInfoResponse_getFipvidlst_3882994365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5527 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term5527, term5527.getClass(), "fi_id", "PqtVXXZMqK");
        setField(term5527, term5527.getClass(), "fi_name", "rYbtIDVdnd");
        setField(term5527, term5527.getClass(), "fi_kind", "UKAReurpHG");
        setField(term5527, term5527.getClass(), "fi_difficulty", "WVRMUmrljA");
        setField(term5527, term5527.getClass(), "fi_pv_id_lst", "NTlKJDDWlk");
        setField(term5527, term5527.getClass(), "fi_attr", "vOuMEpOQAg");
        setField(term5527, term5527.getClass(), "fi_add_vp", "SIODFGaQhr");
        setField(term5527, term5527.getClass(), "fi_mul_vp", "qYzsiuXOgS");
        setField(term5527, term5527.getClass(), "fi_st", "bxrCBbrrct");
        setField(term5527, term5527.getClass(), "fi_et", "CKWpJaaaxX");
        setField(term5527, term5527.getClass(), "fi_lut", "UBRmXJmfrt");
        setField(term5527, term5527.getClass(), "cmd", "WZzvmIHhzZ");
        setField(term5527, term5527.getClass(), "req_id", "doQLHkjpNm");
        setField(term5527, term5527.getClass(), "stat", "lCyLIcSuom");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFi_pv_id_lst", argTypes, term5527, args);
    }

};


