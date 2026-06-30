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

public class FestaInfoResponse_setFiaddvp_105881127418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9676;

    public FestaInfoResponse_setFiaddvp_105881127418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9676 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term9676, term9676.getClass(), "fi_id", "lKrEAkypza");
        setField(term9676, term9676.getClass(), "fi_name", "KtuuNAqGCQ");
        setField(term9676, term9676.getClass(), "fi_kind", "OGQsfjmReM");
        setField(term9676, term9676.getClass(), "fi_difficulty", "YsUtbngnRO");
        setField(term9676, term9676.getClass(), "fi_pv_id_lst", "JisaWUxcNb");
        setField(term9676, term9676.getClass(), "fi_attr", "NxgmYPzWCI");
        setField(term9676, term9676.getClass(), "fi_add_vp", "SqjyKmayBx");
        setField(term9676, term9676.getClass(), "fi_mul_vp", "XjDhvToxJy");
        setField(term9676, term9676.getClass(), "fi_st", "nxSTJflLQy");
        setField(term9676, term9676.getClass(), "fi_et", "FlHzxEfFzI");
        setField(term9676, term9676.getClass(), "fi_lut", "aSATgQUpoe");
        setField(term9676, term9676.getClass(), "cmd", "VkPSXewZfB");
        setField(term9676, term9676.getClass(), "req_id", "ubodzJoMGW");
        setField(term9676, term9676.getClass(), "stat", "weddIktxOA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uSlMeISsDD";
        callMethod(klass, "setFi_add_vp", argTypes, term9676, args);
    }

};


