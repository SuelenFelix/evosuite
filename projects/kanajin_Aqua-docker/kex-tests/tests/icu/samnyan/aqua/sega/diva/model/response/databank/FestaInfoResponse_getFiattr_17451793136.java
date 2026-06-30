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

public class FestaInfoResponse_getFiattr_17451793136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5836;

    public FestaInfoResponse_getFiattr_17451793136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5836 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term5836, term5836.getClass(), "fi_id", "CGOpQSZZwI");
        setField(term5836, term5836.getClass(), "fi_name", "ypEdrstygY");
        setField(term5836, term5836.getClass(), "fi_kind", "sNQFlATEeQ");
        setField(term5836, term5836.getClass(), "fi_difficulty", "ZKMLioamsY");
        setField(term5836, term5836.getClass(), "fi_pv_id_lst", "WVbxuoDBcn");
        setField(term5836, term5836.getClass(), "fi_attr", "pvDEABOxLt");
        setField(term5836, term5836.getClass(), "fi_add_vp", "beAMpkroCQ");
        setField(term5836, term5836.getClass(), "fi_mul_vp", "uSUvKAyuvd");
        setField(term5836, term5836.getClass(), "fi_st", "onQLVONGuf");
        setField(term5836, term5836.getClass(), "fi_et", "SOrEHbcbmn");
        setField(term5836, term5836.getClass(), "fi_lut", "bnsyeQXFdu");
        setField(term5836, term5836.getClass(), "cmd", "BwtdjiefJn");
        setField(term5836, term5836.getClass(), "req_id", "jDmhBrIoDa");
        setField(term5836, term5836.getClass(), "stat", "SPtPatHeOm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFi_attr", argTypes, term5836, args);
    }

};


