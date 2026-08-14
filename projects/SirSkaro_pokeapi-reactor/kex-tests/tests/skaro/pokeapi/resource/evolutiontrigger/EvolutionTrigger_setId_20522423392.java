package skaro.pokeapi.resource.evolutiontrigger;

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
import static skaro.pokeapi.resource.evolutiontrigger.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class EvolutionTrigger_setId_20522423392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term81;

    public EvolutionTrigger_setId_20522423392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term50 = new Integer(1162663216);
        Object term66 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term68 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term66, term66.getClass(), "name", "");
        setField(term68, term68.getClass(), "name", null);
        setField(term68, term68.getClass(), "url", null);
        setField(term66, term66.getClass(), "language", term68);
        Object term69 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term71 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term69, term69.getClass(), "name", "");
        setField(term71, term71.getClass(), "name", null);
        setField(term71, term71.getClass(), "url", null);
        setField(term69, term69.getClass(), "language", term71);
        Object term72 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term74 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term72, term72.getClass(), "name", "");
        setField(term74, term74.getClass(), "name", null);
        setField(term74, term74.getClass(), "url", null);
        setField(term72, term72.getClass(), "language", term74);
        ArrayList term64 = new ArrayList();
        ((ArrayList) term64).add(term66);
        ((ArrayList) term64).add(term69);
        ((ArrayList) term64).add(term72);
        ArrayList term77 = new ArrayList();
        term49 = newInstance(Class.forName("skaro.pokeapi.resource.evolutiontrigger.EvolutionTrigger"));
        setField(term49, term49.getClass(), "id", term50);
        setField(term49, term49.getClass(), "name", "ZiaGIbnzTs");
        setField(term49, term49.getClass(), "names", term64);
        setField(term49, term49.getClass(), "pokemonSpecies", term77);
        term81 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutiontrigger.EvolutionTrigger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term81;
        callMethod(klass, "setId", argTypes, term49, args);
    }

};


