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

public class PvDefChrLstResponse_setPdclst_9821604974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17078;

    public PvDefChrLstResponse_setPdclst_9821604974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17078 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvDefChrLstResponse"));
        setField(term17078, term17078.getClass(), "pdcl_lut", "JydxSNTMYt");
        setField(term17078, term17078.getClass(), "pdc_lst", "KpurAcrHYT");
        setField(term17078, term17078.getClass(), "cmd", "QjvDwgKJGz");
        setField(term17078, term17078.getClass(), "req_id", "ngYxiXTZrk");
        setField(term17078, term17078.getClass(), "stat", "YTxBqWRAlo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvDefChrLstResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ReruUQRXwl";
        callMethod(klass, "setPdc_lst", argTypes, term17078, args);
    }

};


