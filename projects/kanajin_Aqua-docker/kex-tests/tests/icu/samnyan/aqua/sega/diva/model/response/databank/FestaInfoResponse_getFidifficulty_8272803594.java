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

public class FestaInfoResponse_getFidifficulty_8272803594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5218;

    public FestaInfoResponse_getFidifficulty_8272803594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5218 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term5218, term5218.getClass(), "fi_id", "EwQBhZjCIT");
        setField(term5218, term5218.getClass(), "fi_name", "aSkmSwTnEw");
        setField(term5218, term5218.getClass(), "fi_kind", "xvkbvaEGYd");
        setField(term5218, term5218.getClass(), "fi_difficulty", "HBGNxdNURv");
        setField(term5218, term5218.getClass(), "fi_pv_id_lst", "mfCpTPPQQm");
        setField(term5218, term5218.getClass(), "fi_attr", "OcJCIDNIXA");
        setField(term5218, term5218.getClass(), "fi_add_vp", "XfRABIFVEp");
        setField(term5218, term5218.getClass(), "fi_mul_vp", "MHGKyEnwKc");
        setField(term5218, term5218.getClass(), "fi_st", "ShIELyuULw");
        setField(term5218, term5218.getClass(), "fi_et", "IpQuOGMgmj");
        setField(term5218, term5218.getClass(), "fi_lut", "pJbnHTYrxn");
        setField(term5218, term5218.getClass(), "cmd", "iIRsCSYqXH");
        setField(term5218, term5218.getClass(), "req_id", "nghfqDXyCG");
        setField(term5218, term5218.getClass(), "stat", "WBAOTqErtm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFi_difficulty", argTypes, term5218, args);
    }

};


