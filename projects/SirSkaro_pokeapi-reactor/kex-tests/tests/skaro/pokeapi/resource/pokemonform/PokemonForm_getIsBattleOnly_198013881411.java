package skaro.pokeapi.resource.pokemonform;

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
import static skaro.pokeapi.resource.pokemonform.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;

public class PokemonForm_getIsBattleOnly_198013881411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3470;

    public PokemonForm_getIsBattleOnly_198013881411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3471 = new Integer(-226514366);
        Integer term3485 = new Integer(1193880199);
        Integer term3487 = new Integer(-1087774327);
        Boolean term3489 = new Boolean(true);
        Boolean term3491 = new Boolean(true);
        Object term3606 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3608 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3606, term3606.getClass(), "name", "");
        setField(term3608, term3608.getClass(), "name", null);
        setField(term3608, term3608.getClass(), "url", null);
        setField(term3606, term3606.getClass(), "language", term3608);
        Object term3609 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3611 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3609, term3609.getClass(), "name", "");
        setField(term3611, term3611.getClass(), "name", null);
        setField(term3611, term3611.getClass(), "url", null);
        setField(term3609, term3609.getClass(), "language", term3611);
        ArrayList term3604 = new ArrayList();
        ((ArrayList) term3604).add(term3606);
        ((ArrayList) term3604).add(term3609);
        Object term3616 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3618 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3616, term3616.getClass(), "name", "");
        setField(term3618, term3618.getClass(), "name", null);
        setField(term3618, term3618.getClass(), "url", null);
        setField(term3616, term3616.getClass(), "language", term3618);
        ArrayList term3614 = new ArrayList();
        ((ArrayList) term3614).add(term3616);
        term3470 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term3505 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3530 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term3579 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3470, term3470.getClass(), "id", term3471);
        setField(term3470, term3470.getClass(), "name", "VDokbsCuqq");
        setField(term3470, term3470.getClass(), "order", term3485);
        setField(term3470, term3470.getClass(), "formOrder", term3487);
        setField(term3470, term3470.getClass(), "isDefault", term3489);
        setField(term3470, term3470.getClass(), "isBattleOnly", term3491);
        setField(term3470, term3470.getClass(), "formName", "xClUIcPECX");
        setField(term3505, term3505.getClass(), "name", "avhRaGZaBF");
        setField(term3505, term3505.getClass(), "url", "JkgoRtImdE");
        setField(term3470, term3470.getClass(), "pokemon", term3505);
        setField(term3530, term3530.getClass(), "frontDefault", "qFGKIJjlmV");
        setField(term3530, term3530.getClass(), "frontShiny", "IHqvyhMtuM");
        setField(term3530, term3530.getClass(), "backDefault", "dAldIGYAXV");
        setField(term3530, term3530.getClass(), "backShiny", "mLwibAPEsa");
        setField(term3470, term3470.getClass(), "sprites", term3530);
        setField(term3579, term3579.getClass(), "name", "zsWKWiTFuo");
        setField(term3579, term3579.getClass(), "url", "UPUbwyHQKN");
        setField(term3470, term3470.getClass(), "versionGroup", term3579);
        setField(term3470, term3470.getClass(), "names", term3604);
        setField(term3470, term3470.getClass(), "formNames", term3614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsBattleOnly", argTypes, term3470, args);
    }

};


