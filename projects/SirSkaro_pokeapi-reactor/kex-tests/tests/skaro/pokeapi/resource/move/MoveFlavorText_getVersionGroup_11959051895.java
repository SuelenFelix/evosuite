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

public class MoveFlavorText_getVersionGroup_11959051895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5450;

    public MoveFlavorText_getVersionGroup_11959051895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5450 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveFlavorText"));
        Object term5463 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5488 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5450, term5450.getClass(), "flavorText", "IkpjUOuWQU");
        setField(term5463, term5463.getClass(), "name", "boSSpezHeU");
        setField(term5463, term5463.getClass(), "url", "OUeBWNTQDh");
        setField(term5450, term5450.getClass(), "language", term5463);
        setField(term5488, term5488.getClass(), "name", "gltJarNuUk");
        setField(term5488, term5488.getClass(), "url", "ZwZIDwYcSW");
        setField(term5450, term5450.getClass(), "versionGroup", term5488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveFlavorText");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionGroup", argTypes, term5450, args);
    }

};


