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

public class CstmzItmNgMdlListResponse_setCinmlst_14725707194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17680;

    public CstmzItmNgMdlListResponse_setCinmlst_14725707194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17680 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.CstmzItmNgMdlListResponse"));
        setField(term17680, term17680.getClass(), "cinml_lut", "vYMCjgnztg");
        setField(term17680, term17680.getClass(), "cinm_lst", "YupgKTSEiI");
        setField(term17680, term17680.getClass(), "cmd", "HuOUlaFmvJ");
        setField(term17680, term17680.getClass(), "req_id", "dWVwcwFGNo");
        setField(term17680, term17680.getClass(), "stat", "PNdLRrSAIY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.CstmzItmNgMdlListResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nJnRIRiLZK";
        callMethod(klass, "setCinm_lst", argTypes, term17680, args);
    }

};


