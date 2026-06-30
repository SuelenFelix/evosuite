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

public class FestaInfoResponse_getFikind_14692387343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4909;

    public FestaInfoResponse_getFikind_14692387343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4909 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term4909, term4909.getClass(), "fi_id", "PCipZnmBOF");
        setField(term4909, term4909.getClass(), "fi_name", "zcorEihhLK");
        setField(term4909, term4909.getClass(), "fi_kind", "GrqozDKFOk");
        setField(term4909, term4909.getClass(), "fi_difficulty", "CFyoseFGLF");
        setField(term4909, term4909.getClass(), "fi_pv_id_lst", "SFqCrhEWLm");
        setField(term4909, term4909.getClass(), "fi_attr", "GZdcJyZntS");
        setField(term4909, term4909.getClass(), "fi_add_vp", "OIHoJeysUi");
        setField(term4909, term4909.getClass(), "fi_mul_vp", "WXMWFDGcLB");
        setField(term4909, term4909.getClass(), "fi_st", "wKWbJssZuG");
        setField(term4909, term4909.getClass(), "fi_et", "NzBMMhkhpT");
        setField(term4909, term4909.getClass(), "fi_lut", "qCpEbQDHdF");
        setField(term4909, term4909.getClass(), "cmd", "AHbZyFOmlo");
        setField(term4909, term4909.getClass(), "req_id", "TwfWVQGiIj");
        setField(term4909, term4909.getClass(), "stat", "gUvcueTURF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFi_kind", argTypes, term4909, args);
    }

};


