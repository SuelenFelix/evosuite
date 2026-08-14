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

public class VersionGroupFlavorText_getText_12500526931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131699;

    public VersionGroupFlavorText_getText_12500526931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131699 = newInstance(Class.forName("skaro.pokeapi.resource.VersionGroupFlavorText"));
        Object term131712 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term131737 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term131699, term131699.getClass(), "text", "bnXjavaLWd");
        setField(term131712, term131712.getClass(), "name", "CFFNdgjRTN");
        setField(term131712, term131712.getClass(), "url", "GHkhiVOhli");
        setField(term131699, term131699.getClass(), "language", term131712);
        setField(term131737, term131737.getClass(), "name", "cqLbRHYQIW");
        setField(term131737, term131737.getClass(), "url", "fIpTDxwgUR");
        setField(term131699, term131699.getClass(), "versionGroup", term131737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VersionGroupFlavorText");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term131699, args);
    }

};


