package skaro.pokeapi.resource.item;

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
import static skaro.pokeapi.resource.item.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class ItemHolderPokemon_getVersionDetails_16513790453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7415;

    public ItemHolderPokemon_getVersionDetails_16513790453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7444 = new Integer(1168633950);
        Object term7443 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7446 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7443, term7443.getClass(), "rarity", term7444);
        setField(term7446, term7446.getClass(), "name", null);
        setField(term7446, term7446.getClass(), "url", null);
        setField(term7443, term7443.getClass(), "version", term7446);
        Integer term7448 = new Integer(1607082164);
        Object term7447 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7450 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7447, term7447.getClass(), "rarity", term7448);
        setField(term7450, term7450.getClass(), "name", null);
        setField(term7450, term7450.getClass(), "url", null);
        setField(term7447, term7447.getClass(), "version", term7450);
        Integer term7452 = new Integer(1890399366);
        Object term7451 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7454 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7451, term7451.getClass(), "rarity", term7452);
        setField(term7454, term7454.getClass(), "name", null);
        setField(term7454, term7454.getClass(), "url", null);
        setField(term7451, term7451.getClass(), "version", term7454);
        Integer term7456 = new Integer(-1867239125);
        Object term7455 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7458 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7455, term7455.getClass(), "rarity", term7456);
        setField(term7458, term7458.getClass(), "name", null);
        setField(term7458, term7458.getClass(), "url", null);
        setField(term7455, term7455.getClass(), "version", term7458);
        Integer term7460 = new Integer(952869601);
        Object term7459 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7462 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7459, term7459.getClass(), "rarity", term7460);
        setField(term7462, term7462.getClass(), "name", null);
        setField(term7462, term7462.getClass(), "url", null);
        setField(term7459, term7459.getClass(), "version", term7462);
        Integer term7464 = new Integer(91958879);
        Object term7463 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7466 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7463, term7463.getClass(), "rarity", term7464);
        setField(term7466, term7466.getClass(), "name", null);
        setField(term7466, term7466.getClass(), "url", null);
        setField(term7463, term7463.getClass(), "version", term7466);
        Integer term7468 = new Integer(-645429025);
        Object term7467 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7470 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7467, term7467.getClass(), "rarity", term7468);
        setField(term7470, term7470.getClass(), "name", null);
        setField(term7470, term7470.getClass(), "url", null);
        setField(term7467, term7467.getClass(), "version", term7470);
        ArrayList term7441 = new ArrayList();
        ((ArrayList) term7441).add(term7443);
        ((ArrayList) term7441).add(term7447);
        ((ArrayList) term7441).add(term7451);
        ((ArrayList) term7441).add(term7455);
        ((ArrayList) term7441).add(term7459);
        ((ArrayList) term7441).add(term7463);
        ((ArrayList) term7441).add(term7467);
        term7415 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon"));
        Object term7416 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7416, term7416.getClass(), "name", "iSQqMWMRlU");
        setField(term7416, term7416.getClass(), "url", "djWEnlbOXu");
        setField(term7415, term7415.getClass(), "pokemon", term7416);
        setField(term7415, term7415.getClass(), "versionDetails", term7441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionDetails", argTypes, term7415, args);
    }

};


