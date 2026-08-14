package dev.zevolution.netflixhexaarch.interactors;

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
import static dev.zevolution.netflixhexaarch.interactors.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetSoftwareByAuthorAndSoftwareNameUseCase_execute_17264712811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GetSoftwareByAuthorAndSoftwareNameUseCase_execute_17264712811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.interactors.GetSoftwareByAuthorAndSoftwareNameUseCase"));
        setField(term1, term1.getClass(), "softwareRepository", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.interactors.GetSoftwareByAuthorAndSoftwareNameUseCase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        callMethod(klass, "execute", argTypes, term1, args);
    }

};


