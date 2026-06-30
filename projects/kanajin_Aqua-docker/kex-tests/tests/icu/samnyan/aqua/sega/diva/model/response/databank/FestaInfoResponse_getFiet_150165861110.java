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

public class FestaInfoResponse_getFiet_150165861110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7072;

    public FestaInfoResponse_getFiet_150165861110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7072 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term7072, term7072.getClass(), "fi_id", "GEJABPlHSI");
        setField(term7072, term7072.getClass(), "fi_name", "aQFUvuaYxd");
        setField(term7072, term7072.getClass(), "fi_kind", "zNFLXMifnS");
        setField(term7072, term7072.getClass(), "fi_difficulty", "HHQcYMSBVc");
        setField(term7072, term7072.getClass(), "fi_pv_id_lst", "wdoqITnaAP");
        setField(term7072, term7072.getClass(), "fi_attr", "rIPMBcrNqB");
        setField(term7072, term7072.getClass(), "fi_add_vp", "UDaboHZHhz");
        setField(term7072, term7072.getClass(), "fi_mul_vp", "nRvKihUSPj");
        setField(term7072, term7072.getClass(), "fi_st", "BbNeQJpYPr");
        setField(term7072, term7072.getClass(), "fi_et", "riMtzCoxNj");
        setField(term7072, term7072.getClass(), "fi_lut", "YAXkVjQZcV");
        setField(term7072, term7072.getClass(), "cmd", "pumvwBWvpy");
        setField(term7072, term7072.getClass(), "req_id", "HwLHeGLyhe");
        setField(term7072, term7072.getClass(), "stat", "RDnkgWkcbz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFi_et", argTypes, term7072, args);
    }

};


