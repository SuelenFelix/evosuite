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
import java.lang.Integer;

public class BuyModuleResponse_setMdlid_107281098017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8533;
     Object term8536;

    public BuyModuleResponse_setMdlid_107281098017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8533 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse"));
        setField(term8533, term8533.getClass(), "shp_rslt", null);
        setIntField(term8533, term8533.getClass(), "mdl_id", 0);
        setField(term8533, term8533.getClass(), "mdl_have", null);
        setIntField(term8533, term8533.getClass(), "vcld_pts", 0);
        setField(term8533, term8533.getClass(), "cmd", null);
        setField(term8533, term8533.getClass(), "req_id", null);
        setField(term8533, term8533.getClass(), "stat", null);
        term8536 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8536;
        callMethod(klass, "setMdl_id", argTypes, term8533, args);
    }

};


