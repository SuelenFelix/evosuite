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

public class CstmzItmNgMdlListResponse_setCinmllut_11129191958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17815;

    public CstmzItmNgMdlListResponse_setCinmllut_11129191958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17815 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.CstmzItmNgMdlListResponse"));
        setField(term17815, term17815.getClass(), "cinml_lut", null);
        setField(term17815, term17815.getClass(), "cinm_lst", null);
        setField(term17815, term17815.getClass(), "cmd", null);
        setField(term17815, term17815.getClass(), "req_id", null);
        setField(term17815, term17815.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.CstmzItmNgMdlListResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCinml_lut", argTypes, term17815, args);
    }

};


