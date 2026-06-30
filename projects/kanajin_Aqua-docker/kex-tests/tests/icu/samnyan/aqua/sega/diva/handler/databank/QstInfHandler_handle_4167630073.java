package icu.samnyan.aqua.sega.diva.handler.databank;

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
import static icu.samnyan.aqua.sega.diva.handler.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class QstInfHandler_handle_4167630073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6154;

    public QstInfHandler_handle_4167630073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6154 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.QstInfHandler"));
        setField(term6154, term6154.getClass(), "mapper", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.QstInfHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handle", argTypes, term6154, args);
    }

};


