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

public class FestaInfoResponse_setFimulvp_81177016319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10007;

    public FestaInfoResponse_setFimulvp_81177016319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10007 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term10007, term10007.getClass(), "fi_id", "WdCiTDUKqn");
        setField(term10007, term10007.getClass(), "fi_name", "PSizQDoxxe");
        setField(term10007, term10007.getClass(), "fi_kind", "mKaHyMybrK");
        setField(term10007, term10007.getClass(), "fi_difficulty", "AyrEXuGrEj");
        setField(term10007, term10007.getClass(), "fi_pv_id_lst", "yevIIoVYHq");
        setField(term10007, term10007.getClass(), "fi_attr", "UuYWMTqWTV");
        setField(term10007, term10007.getClass(), "fi_add_vp", "DSFGlcaXUb");
        setField(term10007, term10007.getClass(), "fi_mul_vp", "sHMXNUzNeM");
        setField(term10007, term10007.getClass(), "fi_st", "gPzGDOEPPw");
        setField(term10007, term10007.getClass(), "fi_et", "rwKoAngzCu");
        setField(term10007, term10007.getClass(), "fi_lut", "VUkRVwROTl");
        setField(term10007, term10007.getClass(), "cmd", "UDlkdccCRn");
        setField(term10007, term10007.getClass(), "req_id", "McpzErOcYb");
        setField(term10007, term10007.getClass(), "stat", "jqrVEUvYEz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QITgiBrmfj";
        callMethod(klass, "setFi_mul_vp", argTypes, term10007, args);
    }

};


