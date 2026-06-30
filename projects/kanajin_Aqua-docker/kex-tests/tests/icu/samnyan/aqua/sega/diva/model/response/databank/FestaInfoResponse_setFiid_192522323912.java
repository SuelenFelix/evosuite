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

public class FestaInfoResponse_setFiid_192522323912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7690;

    public FestaInfoResponse_setFiid_192522323912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7690 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term7690, term7690.getClass(), "fi_id", "RxbhrFBjkO");
        setField(term7690, term7690.getClass(), "fi_name", "aanyiAOJCl");
        setField(term7690, term7690.getClass(), "fi_kind", "VDokbsCuqq");
        setField(term7690, term7690.getClass(), "fi_difficulty", "xClUIcPECX");
        setField(term7690, term7690.getClass(), "fi_pv_id_lst", "avhRaGZaBF");
        setField(term7690, term7690.getClass(), "fi_attr", "JkgoRtImdE");
        setField(term7690, term7690.getClass(), "fi_add_vp", "qFGKIJjlmV");
        setField(term7690, term7690.getClass(), "fi_mul_vp", "IHqvyhMtuM");
        setField(term7690, term7690.getClass(), "fi_st", "dAldIGYAXV");
        setField(term7690, term7690.getClass(), "fi_et", "mLwibAPEsa");
        setField(term7690, term7690.getClass(), "fi_lut", "zsWKWiTFuo");
        setField(term7690, term7690.getClass(), "cmd", "UPUbwyHQKN");
        setField(term7690, term7690.getClass(), "req_id", "lgQkrXANyI");
        setField(term7690, term7690.getClass(), "stat", "MeTmRZXErV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jNxbVmoZgq";
        callMethod(klass, "setFi_id", argTypes, term7690, args);
    }

};


