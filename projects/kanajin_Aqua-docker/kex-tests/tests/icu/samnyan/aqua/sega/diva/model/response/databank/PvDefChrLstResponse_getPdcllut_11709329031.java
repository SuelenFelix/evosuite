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

public class PvDefChrLstResponse_getPdcllut_11709329031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16723;

    public PvDefChrLstResponse_getPdcllut_11709329031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16723 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvDefChrLstResponse"));
        setField(term16723, term16723.getClass(), "pdcl_lut", "QXyFXBjFde");
        setField(term16723, term16723.getClass(), "pdc_lst", "xVFgeyYxZS");
        setField(term16723, term16723.getClass(), "cmd", "iQiGTulJiH");
        setField(term16723, term16723.getClass(), "req_id", "utCuuVCKqE");
        setField(term16723, term16723.getClass(), "stat", "zSfoqzJbPT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvDefChrLstResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdcl_lut", argTypes, term16723, args);
    }

};


