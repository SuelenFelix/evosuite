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

public class RmtWpLstResponse_getRwlst_2620977417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1774;

    public RmtWpLstResponse_getRwlst_2620977417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1774 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.RmtWpLstResponse"));
        setField(term1774, term1774.getClass(), "rwl_lut", null);
        setField(term1774, term1774.getClass(), "rw_lst", null);
        setField(term1774, term1774.getClass(), "cmd", null);
        setField(term1774, term1774.getClass(), "req_id", null);
        setField(term1774, term1774.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.RmtWpLstResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRw_lst", argTypes, term1774, args);
    }

};


