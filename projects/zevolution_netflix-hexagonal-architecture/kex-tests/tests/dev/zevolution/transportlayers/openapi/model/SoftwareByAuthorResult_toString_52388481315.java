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

public class SoftwareByAuthorResult_toString_52388481315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1104;

    public SoftwareByAuthorResult_toString_52388481315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1129 = new Integer(-1685132342);
        term1104 = newInstance(Class.forName("dev.zevolution.transportlayers.openapi.model.SoftwareByAuthorResult"));
        setField(term1104, term1104.getClass(), "name", "xLbjWUgOIL");
        setField(term1104, term1104.getClass(), "description", "jDtqGUpnZN");
        setField(term1104, term1104.getClass(), "score", term1129);
        setField(term1104, term1104.getClass(), "author", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.transportlayers.openapi.model.SoftwareByAuthorResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1104, args);
    }

};


