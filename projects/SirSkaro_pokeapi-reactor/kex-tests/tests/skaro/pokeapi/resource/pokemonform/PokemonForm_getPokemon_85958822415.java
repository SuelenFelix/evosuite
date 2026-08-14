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

public class PokemonForm_getPokemon_85958822415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4551;

    public PokemonForm_getPokemon_85958822415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4552 = new Integer(-817164822);
        Integer term4566 = new Integer(-1016503459);
        Integer term4568 = new Integer(-1968847291);
        Boolean term4570 = new Boolean(true);
        Boolean term4572 = new Boolean(true);
        Object term4687 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4689 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4687, term4687.getClass(), "name", "");
        setField(term4689, term4689.getClass(), "name", null);
        setField(term4689, term4689.getClass(), "url", null);
        setField(term4687, term4687.getClass(), "language", term4689);
        Object term4690 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4692 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4690, term4690.getClass(), "name", "");
        setField(term4692, term4692.getClass(), "name", null);
        setField(term4692, term4692.getClass(), "url", null);
        setField(term4690, term4690.getClass(), "language", term4692);
        Object term4693 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4695 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4693, term4693.getClass(), "name", "");
        setField(term4695, term4695.getClass(), "name", null);
        setField(term4695, term4695.getClass(), "url", null);
        setField(term4693, term4693.getClass(), "language", term4695);
        Object term4696 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4698 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4696, term4696.getClass(), "name", "");
        setField(term4698, term4698.getClass(), "name", null);
        setField(term4698, term4698.getClass(), "url", null);
        setField(term4696, term4696.getClass(), "language", term4698);
        Object term4699 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4701 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4699, term4699.getClass(), "name", "");
        setField(term4701, term4701.getClass(), "name", null);
        setField(term4701, term4701.getClass(), "url", null);
        setField(term4699, term4699.getClass(), "language", term4701);
        Object term4702 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4704 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4702, term4702.getClass(), "name", "");
        setField(term4704, term4704.getClass(), "name", null);
        setField(term4704, term4704.getClass(), "url", null);
        setField(term4702, term4702.getClass(), "language", term4704);
        Object term4705 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4707 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4705, term4705.getClass(), "name", "");
        setField(term4707, term4707.getClass(), "name", null);
        setField(term4707, term4707.getClass(), "url", null);
        setField(term4705, term4705.getClass(), "language", term4707);
        ArrayList term4685 = new ArrayList();
        ((ArrayList) term4685).add(term4687);
        ((ArrayList) term4685).add(term4690);
        ((ArrayList) term4685).add(term4693);
        ((ArrayList) term4685).add(term4696);
        ((ArrayList) term4685).add(term4699);
        ((ArrayList) term4685).add(term4702);
        ((ArrayList) term4685).add(term4705);
        Object term4712 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4714 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4712, term4712.getClass(), "name", "");
        setField(term4714, term4714.getClass(), "name", null);
        setField(term4714, term4714.getClass(), "url", null);
        setField(term4712, term4712.getClass(), "language", term4714);
        Object term4715 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term4715, term4715.getClass(), "name", "");
        setField(term4715, term4715.getClass(), "language", term4704);
        ArrayList term4710 = new ArrayList();
        ((ArrayList) term4710).add(term4712);
        ((ArrayList) term4710).add(term4715);
        term4551 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term4586 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4611 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term4660 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4551, term4551.getClass(), "id", term4552);
        setField(term4551, term4551.getClass(), "name", "QNjNTLlUaV");
        setField(term4551, term4551.getClass(), "order", term4566);
        setField(term4551, term4551.getClass(), "formOrder", term4568);
        setField(term4551, term4551.getClass(), "isDefault", term4570);
        setField(term4551, term4551.getClass(), "isBattleOnly", term4572);
        setField(term4551, term4551.getClass(), "formName", "hIYsRyOZxk");
        setField(term4586, term4586.getClass(), "name", "RjNoEywJbC");
        setField(term4586, term4586.getClass(), "url", "RTTvrwwhou");
        setField(term4551, term4551.getClass(), "pokemon", term4586);
        setField(term4611, term4611.getClass(), "frontDefault", "lRORwXipuk");
        setField(term4611, term4611.getClass(), "frontShiny", "fVdTcjgHdw");
        setField(term4611, term4611.getClass(), "backDefault", "wwAwLLcLPp");
        setField(term4611, term4611.getClass(), "backShiny", "nHpMKOmlpQ");
        setField(term4551, term4551.getClass(), "sprites", term4611);
        setField(term4660, term4660.getClass(), "name", "fKhrQsJToZ");
        setField(term4660, term4660.getClass(), "url", "wsysQLGFnl");
        setField(term4551, term4551.getClass(), "versionGroup", term4660);
        setField(term4551, term4551.getClass(), "names", term4685);
        setField(term4551, term4551.getClass(), "formNames", term4710);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokemon", argTypes, term4551, args);
    }

};


