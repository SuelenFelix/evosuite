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

public class RmtWpLstResponse_setRwlst_21080115574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1640;

    public RmtWpLstResponse_setRwlst_21080115574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1640 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.RmtWpLstResponse"));
        setField(term1640, term1640.getClass(), "rwl_lut", "tPlsykYBqO");
        setField(term1640, term1640.getClass(), "rw_lst", "bLPjGVBhlX");
        setField(term1640, term1640.getClass(), "cmd", "whBvTVIIlC");
        setField(term1640, term1640.getClass(), "req_id", "IgRJUzaCwW");
        setField(term1640, term1640.getClass(), "stat", "JUmudUmaaV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.RmtWpLstResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KoyGrUJeJW";
        callMethod(klass, "setRw_lst", argTypes, term1640, args);
    }

};


