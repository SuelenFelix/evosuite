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

public class PstdHCtrlResponse_getPstdhclut_18949609456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16079;

    public PstdHCtrlResponse_getPstdhclut_18949609456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16079 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdHCtrlResponse"));
        setField(term16079, term16079.getClass(), "p_std_hc_lut", null);
        setField(term16079, term16079.getClass(), "p_std_hc_str", null);
        setField(term16079, term16079.getClass(), "cmd", null);
        setField(term16079, term16079.getClass(), "req_id", null);
        setField(term16079, term16079.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdHCtrlResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getP_std_hc_lut", argTypes, term16079, args);
    }

};


