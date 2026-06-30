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

public class PvNgMdlLstResponse_getPnmllut_2075366156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2375;

    public PvNgMdlLstResponse_getPnmllut_2075366156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2375 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvNgMdlLstResponse"));
        setField(term2375, term2375.getClass(), "pnml_lut", null);
        setField(term2375, term2375.getClass(), "pnm_lst", null);
        setField(term2375, term2375.getClass(), "cmd", null);
        setField(term2375, term2375.getClass(), "req_id", null);
        setField(term2375, term2375.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvNgMdlLstResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPnml_lut", argTypes, term2375, args);
    }

};


