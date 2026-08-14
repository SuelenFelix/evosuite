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
import java.lang.Integer;
import java.lang.Object;

public class GenerationGameIndex_setGeneration_17320888244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132641;
     Object term132669;

    public GenerationGameIndex_setGeneration_17320888244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term132642 = new Integer(219641616);
        term132641 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term132644 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term132641, term132641.getClass(), "gameIndex", term132642);
        setField(term132644, term132644.getClass(), "name", "tdyuryhflS");
        setField(term132644, term132644.getClass(), "url", "hYgrooAtUi");
        setField(term132641, term132641.getClass(), "generation", term132644);
        term132669 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term132669, term132669.getClass(), "name", "JWlQwtWqCi");
        setField(term132669, term132669.getClass(), "url", "GPJMhLGzDn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.GenerationGameIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term132669;
        callMethod(klass, "setGeneration", argTypes, term132641, args);
    }

};


