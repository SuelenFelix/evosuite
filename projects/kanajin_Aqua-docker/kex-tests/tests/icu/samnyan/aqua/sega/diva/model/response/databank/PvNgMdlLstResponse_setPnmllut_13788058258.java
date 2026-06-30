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

public class PvNgMdlLstResponse_setPnmllut_13788058258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2377;

    public PvNgMdlLstResponse_setPnmllut_13788058258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2377 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvNgMdlLstResponse"));
        setField(term2377, term2377.getClass(), "pnml_lut", null);
        setField(term2377, term2377.getClass(), "pnm_lst", null);
        setField(term2377, term2377.getClass(), "cmd", null);
        setField(term2377, term2377.getClass(), "req_id", null);
        setField(term2377, term2377.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvNgMdlLstResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPnml_lut", argTypes, term2377, args);
    }

};


