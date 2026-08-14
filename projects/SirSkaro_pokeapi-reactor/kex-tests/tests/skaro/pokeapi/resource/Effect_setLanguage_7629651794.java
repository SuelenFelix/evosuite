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

public class Effect_setLanguage_7629651794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7077;
     Object term7115;

    public Effect_setLanguage_7629651794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7077 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term7090 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7077, term7077.getClass(), "effect", "dUNzDLXJcj");
        setField(term7090, term7090.getClass(), "name", "OrVSjRJVwa");
        setField(term7090, term7090.getClass(), "url", "cdZEcINJAM");
        setField(term7077, term7077.getClass(), "language", term7090);
        term7115 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7115, term7115.getClass(), "name", "nEgozCeoUr");
        setField(term7115, term7115.getClass(), "url", "EWGMzlcOnW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Effect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term7115;
        callMethod(klass, "setLanguage", argTypes, term7077, args);
    }

};


