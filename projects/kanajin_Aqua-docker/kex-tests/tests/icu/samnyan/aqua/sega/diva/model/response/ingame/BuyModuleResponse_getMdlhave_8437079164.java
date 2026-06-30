package icu.samnyan.aqua.sega.diva.model.response.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.response.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class BuyModuleResponse_getMdlhave_8437079164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6330;

    public BuyModuleResponse_getMdlhave_8437079164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6393 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term6392 = ((Class) term6393).getDeclaredField((String) "FAILED");
        ((Field) term6392).setAccessible(true);
        Object enum18 = ((Field) term6392).get((Object) null);
        term6330 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse"));
        setField(term6330, term6330.getClass(), "shp_rslt", enum18);
        setIntField(term6330, term6330.getClass(), "mdl_id", 590364439);
        setField(term6330, term6330.getClass(), "mdl_have", "fhkbdRViHi");
        setIntField(term6330, term6330.getClass(), "vcld_pts", 865208305);
        setField(term6330, term6330.getClass(), "cmd", "uWHnvSvaPl");
        setField(term6330, term6330.getClass(), "req_id", "kBdSllIBVz");
        setField(term6330, term6330.getClass(), "stat", "TJmVBGfTML");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMdl_have", argTypes, term6330, args);
    }

};


