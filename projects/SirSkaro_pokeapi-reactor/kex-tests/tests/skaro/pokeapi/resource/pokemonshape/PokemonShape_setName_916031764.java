package skaro.pokeapi.resource.pokemonshape;

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
import static skaro.pokeapi.resource.pokemonshape.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class PokemonShape_setName_916031764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180;

    public PokemonShape_setName_916031764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term181 = new Integer(-1922583790);
        Object term197 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term199 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term197, term197.getClass(), "awesomeName", "");
        setField(term199, term199.getClass(), "name", null);
        setField(term199, term199.getClass(), "url", null);
        setField(term197, term197.getClass(), "language", term199);
        ArrayList term195 = new ArrayList();
        ((ArrayList) term195).add(term197);
        Object term204 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term206 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term204, term204.getClass(), "name", "");
        setField(term206, term206.getClass(), "name", null);
        setField(term206, term206.getClass(), "url", null);
        setField(term204, term204.getClass(), "language", term206);
        Object term207 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term209 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term207, term207.getClass(), "name", "");
        setField(term209, term209.getClass(), "name", null);
        setField(term209, term209.getClass(), "url", null);
        setField(term207, term207.getClass(), "language", term209);
        Object term210 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term212 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term210, term210.getClass(), "name", "");
        setField(term212, term212.getClass(), "name", null);
        setField(term212, term212.getClass(), "url", null);
        setField(term210, term210.getClass(), "language", term212);
        Object term213 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term215 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term213, term213.getClass(), "name", "");
        setField(term215, term215.getClass(), "name", null);
        setField(term215, term215.getClass(), "url", null);
        setField(term213, term213.getClass(), "language", term215);
        Object term216 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term218 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term216, term216.getClass(), "name", "");
        setField(term218, term218.getClass(), "name", null);
        setField(term218, term218.getClass(), "url", null);
        setField(term216, term216.getClass(), "language", term218);
        Object term219 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term221 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term219, term219.getClass(), "name", "");
        setField(term221, term221.getClass(), "name", null);
        setField(term221, term221.getClass(), "url", null);
        setField(term219, term219.getClass(), "language", term221);
        ArrayList term202 = new ArrayList();
        ((ArrayList) term202).add(term204);
        ((ArrayList) term202).add(term207);
        ((ArrayList) term202).add(term210);
        ((ArrayList) term202).add(term213);
        ((ArrayList) term202).add(term216);
        ((ArrayList) term202).add(term219);
        ArrayList term224 = new ArrayList();
        term180 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.PokemonShape"));
        setField(term180, term180.getClass(), "id", term181);
        setField(term180, term180.getClass(), "name", "bLPjGVBhlX");
        setField(term180, term180.getClass(), "awesomeNames", term195);
        setField(term180, term180.getClass(), "names", term202);
        setField(term180, term180.getClass(), "pokemonSpecies", term224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonshape.PokemonShape");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOcJIiQQDu";
        callMethod(klass, "setName", argTypes, term180, args);
    }

};


