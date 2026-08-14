package skaro.pokeapi.resource.evolutionchain;

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
import static skaro.pokeapi.resource.evolutionchain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class EvolutionDetail_getKnownMove_2526846639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5189;

    public EvolutionDetail_getKnownMove_2526846639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5240 = new Integer(1713573821);
        Integer term5342 = new Integer(1956590498);
        Integer term5344 = new Integer(1467356494);
        Integer term5346 = new Integer(-26316536);
        Integer term5348 = new Integer(1716165145);
        Boolean term5350 = new Boolean(false);
        Integer term5402 = new Integer(1692937831);
        Boolean term5441 = new Boolean(true);
        term5189 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term5190 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5215 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5242 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5267 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5292 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5317 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5352 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5377 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5416 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5190, term5190.getClass(), "name", "IENRuqmwUU");
        setField(term5190, term5190.getClass(), "url", "GsWxOwXvSu");
        setField(term5189, term5189.getClass(), "item", term5190);
        setField(term5215, term5215.getClass(), "name", "bKBSncrMEZ");
        setField(term5215, term5215.getClass(), "url", "yeSXGqQExb");
        setField(term5189, term5189.getClass(), "trigger", term5215);
        setField(term5189, term5189.getClass(), "gender", term5240);
        setField(term5242, term5242.getClass(), "name", "uXYcXVYJZM");
        setField(term5242, term5242.getClass(), "url", "BJhjdJUhkz");
        setField(term5189, term5189.getClass(), "heldItem", term5242);
        setField(term5267, term5267.getClass(), "name", "cdHYQDgUZR");
        setField(term5267, term5267.getClass(), "url", "KAORSSPSeV");
        setField(term5189, term5189.getClass(), "knownMove", term5267);
        setField(term5292, term5292.getClass(), "name", "UimMMORkzd");
        setField(term5292, term5292.getClass(), "url", "huVIXUWLtI");
        setField(term5189, term5189.getClass(), "knownMoveType", term5292);
        setField(term5317, term5317.getClass(), "name", "vhKzFyKPOT");
        setField(term5317, term5317.getClass(), "url", "nQhIgWXdRc");
        setField(term5189, term5189.getClass(), "location", term5317);
        setField(term5189, term5189.getClass(), "minLevel", term5342);
        setField(term5189, term5189.getClass(), "minHappiness", term5344);
        setField(term5189, term5189.getClass(), "minBeauty", term5346);
        setField(term5189, term5189.getClass(), "minAffection", term5348);
        setField(term5189, term5189.getClass(), "needsOverworldRain", term5350);
        setField(term5352, term5352.getClass(), "name", "EusenEbIoF");
        setField(term5352, term5352.getClass(), "url", "SScVQYSvWH");
        setField(term5189, term5189.getClass(), "partySpecies", term5352);
        setField(term5377, term5377.getClass(), "name", "MnovcqFhCl");
        setField(term5377, term5377.getClass(), "url", "qYtAeLzOhW");
        setField(term5189, term5189.getClass(), "partyType", term5377);
        setField(term5189, term5189.getClass(), "relativePhysicalStats", term5402);
        setField(term5189, term5189.getClass(), "timeOfDay", "tJzmOfcUnY");
        setField(term5416, term5416.getClass(), "name", "TKlccZUpjz");
        setField(term5416, term5416.getClass(), "url", "GGzwMoHZXC");
        setField(term5189, term5189.getClass(), "tradeSpecies", term5416);
        setField(term5189, term5189.getClass(), "turnUpsideDown", term5441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKnownMove", argTypes, term5189, args);
    }

};


