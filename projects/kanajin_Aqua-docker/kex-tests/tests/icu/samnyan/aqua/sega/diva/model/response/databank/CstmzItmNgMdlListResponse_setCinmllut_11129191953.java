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

public class CstmzItmNgMdlListResponse_setCinmllut_11129191953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17547;

    public CstmzItmNgMdlListResponse_setCinmllut_11129191953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17547 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.CstmzItmNgMdlListResponse"));
        setField(term17547, term17547.getClass(), "cinml_lut", "JKGueoHesL");
        setField(term17547, term17547.getClass(), "cinm_lst", "CRAUqtVBkU");
        setField(term17547, term17547.getClass(), "cmd", "DddqUYfomL");
        setField(term17547, term17547.getClass(), "req_id", "YQwoogpPyi");
        setField(term17547, term17547.getClass(), "stat", "rnPhHoorxj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.CstmzItmNgMdlListResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GuwJLKquuI";
        callMethod(klass, "setCinml_lut", argTypes, term17547, args);
    }

};


