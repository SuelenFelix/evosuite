package dev.zevolution.netflixhexaarch.transportlayers.restapi;

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
import static dev.zevolution.netflixhexaarch.transportlayers.restapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AuthorsApiImpl_init_10762723040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37373;

    public AuthorsApiImpl_init_10762723040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37373 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.interactors.GetSoftwareByAuthorAndSoftwareNameUseCase"));
        setField(term37373, term37373.getClass(), "softwareRepository", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.transportlayers.restapi.AuthorsApiImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("dev.zevolution.netflixhexaarch.interactors.GetSoftwareByAuthorAndSoftwareNameUseCase");
        Object[] args = new Object[1];
        args[0] = term37373;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


