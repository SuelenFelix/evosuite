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

public class QstInfResponse_setQilut_13564559024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11884;

    public QstInfResponse_setQilut_13564559024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11884 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.QstInfResponse"));
        setField(term11884, term11884.getClass(), "qi_lut", "DGRqjjdhzy");
        setField(term11884, term11884.getClass(), "qhi_str", "lQFkjJUPAR");
        setField(term11884, term11884.getClass(), "qrai_str", "BsuVlGUUjV");
        setField(term11884, term11884.getClass(), "cmd", "bHHjfDCntT");
        setField(term11884, term11884.getClass(), "req_id", "sEphiduvkv");
        setField(term11884, term11884.getClass(), "stat", "PbLgCSAHce");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.QstInfResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NWldOLAbqk";
        callMethod(klass, "setQi_lut", argTypes, term11884, args);
    }

};


