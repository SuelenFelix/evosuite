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

public class FestaInfoResponse_getFist_15012415379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6763;

    public FestaInfoResponse_getFist_15012415379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6763 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term6763, term6763.getClass(), "fi_id", "PXdVZyoJyC");
        setField(term6763, term6763.getClass(), "fi_name", "vLerpqavFM");
        setField(term6763, term6763.getClass(), "fi_kind", "qnvxzwuGKX");
        setField(term6763, term6763.getClass(), "fi_difficulty", "EdPAvpluZg");
        setField(term6763, term6763.getClass(), "fi_pv_id_lst", "DzHVBMqWtE");
        setField(term6763, term6763.getClass(), "fi_attr", "THZSpzBRYP");
        setField(term6763, term6763.getClass(), "fi_add_vp", "ZfBIVGBQOE");
        setField(term6763, term6763.getClass(), "fi_mul_vp", "QSrDQfEsTR");
        setField(term6763, term6763.getClass(), "fi_st", "PsqusYmejD");
        setField(term6763, term6763.getClass(), "fi_et", "NTWMiBEaDF");
        setField(term6763, term6763.getClass(), "fi_lut", "SPBstwKFVr");
        setField(term6763, term6763.getClass(), "cmd", "WxYUTuqmIq");
        setField(term6763, term6763.getClass(), "req_id", "OeQLvhVERT");
        setField(term6763, term6763.getClass(), "stat", "IlvgFINwIa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFi_st", argTypes, term6763, args);
    }

};


