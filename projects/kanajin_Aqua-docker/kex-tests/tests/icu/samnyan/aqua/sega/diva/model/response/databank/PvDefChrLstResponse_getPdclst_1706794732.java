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

public class PvDefChrLstResponse_getPdclst_1706794732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16834;

    public PvDefChrLstResponse_getPdclst_1706794732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16834 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvDefChrLstResponse"));
        setField(term16834, term16834.getClass(), "pdcl_lut", "QUymMnsCIj");
        setField(term16834, term16834.getClass(), "pdc_lst", "ikTtOgdVYS");
        setField(term16834, term16834.getClass(), "cmd", "JptuwlirlS");
        setField(term16834, term16834.getClass(), "req_id", "TKOMaGswbU");
        setField(term16834, term16834.getClass(), "stat", "YcTbglHiUq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvDefChrLstResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdc_lst", argTypes, term16834, args);
    }

};


