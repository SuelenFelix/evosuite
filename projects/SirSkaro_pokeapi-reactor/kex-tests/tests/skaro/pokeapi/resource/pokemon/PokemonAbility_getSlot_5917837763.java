package skaro.pokeapi.resource.pokemon;

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
import static skaro.pokeapi.resource.pokemon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class PokemonAbility_getSlot_5917837763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20487;

    public PokemonAbility_getSlot_5917837763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term20488 = new Boolean(false);
        Integer term20490 = new Integer(-1632221612);
        term20487 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonAbility"));
        Object term20492 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20487, term20487.getClass(), "isHidden", term20488);
        setField(term20487, term20487.getClass(), "slot", term20490);
        setField(term20492, term20492.getClass(), "name", "NeTiWVoyjZ");
        setField(term20492, term20492.getClass(), "url", "CGeclMyIOP");
        setField(term20487, term20487.getClass(), "ability", term20492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonAbility");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlot", argTypes, term20487, args);
    }

};


