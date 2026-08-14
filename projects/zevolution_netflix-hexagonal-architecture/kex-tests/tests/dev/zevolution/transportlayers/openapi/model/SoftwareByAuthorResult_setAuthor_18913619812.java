package dev.zevolution.transportlayers.openapi.model;

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
import static dev.zevolution.transportlayers.openapi.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SoftwareByAuthorResult_setAuthor_18913619812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term874;

    public SoftwareByAuthorResult_setAuthor_18913619812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term899 = new Integer(-883034806);
        term874 = newInstance(Class.forName("dev.zevolution.transportlayers.openapi.model.SoftwareByAuthorResult"));
        setField(term874, term874.getClass(), "name", "nyiiPDVjAc");
        setField(term874, term874.getClass(), "description", "aKnKipADSo");
        setField(term874, term874.getClass(), "score", term899);
        setField(term874, term874.getClass(), "author", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.transportlayers.openapi.model.SoftwareByAuthorResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UlajhuVLaP";
        callMethod(klass, "setAuthor", argTypes, term874, args);
    }

};


