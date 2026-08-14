package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MoveFlavorText_setLanguage_17752404224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5292;
     Object term5355;

    public MoveFlavorText_setLanguage_17752404224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5292 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveFlavorText"));
        Object term5305 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5330 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5292, term5292.getClass(), "flavorText", "jiUSjqwSIQ");
        setField(term5305, term5305.getClass(), "name", "MgLCedQfoj");
        setField(term5305, term5305.getClass(), "url", "zgKiINdgNu");
        setField(term5292, term5292.getClass(), "language", term5305);
        setField(term5330, term5330.getClass(), "name", "zLMTXDQHYH");
        setField(term5330, term5330.getClass(), "url", "PqywFWJlpE");
        setField(term5292, term5292.getClass(), "versionGroup", term5330);
        term5355 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5355, term5355.getClass(), "name", "dkZFDZxcde");
        setField(term5355, term5355.getClass(), "url", "WXcZEtUKlI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveFlavorText");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term5355;
        callMethod(klass, "setLanguage", argTypes, term5292, args);
    }

};


