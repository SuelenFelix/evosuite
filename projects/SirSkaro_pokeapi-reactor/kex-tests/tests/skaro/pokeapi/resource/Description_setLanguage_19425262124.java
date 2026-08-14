package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Description_setLanguage_19425262124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124019;
     Object term124057;

    public Description_setLanguage_19425262124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124019 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term124032 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124019, term124019.getClass(), "description", "KGLkAKWmkO");
        setField(term124032, term124032.getClass(), "name", "UCUIdDMClr");
        setField(term124032, term124032.getClass(), "url", "fBJTdLHIyJ");
        setField(term124019, term124019.getClass(), "language", term124032);
        term124057 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124057, term124057.getClass(), "name", "AvedMwJryJ");
        setField(term124057, term124057.getClass(), "url", "qsgbgCONYY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Description");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term124057;
        callMethod(klass, "setLanguage", argTypes, term124019, args);
    }

};


