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

public class PokemonForm_getId_11865487631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809;

    public PokemonForm_getId_11865487631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term810 = new Integer(568599855);
        Integer term824 = new Integer(1162663216);
        Integer term826 = new Integer(1484323161);
        Boolean term828 = new Boolean(false);
        Boolean term830 = new Boolean(false);
        Object term945 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term947 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term945, term945.getClass(), "name", "");
        setField(term947, term947.getClass(), "name", null);
        setField(term947, term947.getClass(), "url", null);
        setField(term945, term945.getClass(), "language", term947);
        Object term948 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term950 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term948, term948.getClass(), "name", "");
        setField(term950, term950.getClass(), "name", null);
        setField(term950, term950.getClass(), "url", null);
        setField(term948, term948.getClass(), "language", term950);
        Object term951 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term953 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term951, term951.getClass(), "name", "");
        setField(term953, term953.getClass(), "name", null);
        setField(term953, term953.getClass(), "url", null);
        setField(term951, term951.getClass(), "language", term953);
        Object term954 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term956 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term954, term954.getClass(), "name", "");
        setField(term956, term956.getClass(), "name", null);
        setField(term956, term956.getClass(), "url", null);
        setField(term954, term954.getClass(), "language", term956);
        Object term957 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term959 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term957, term957.getClass(), "name", "");
        setField(term959, term959.getClass(), "name", null);
        setField(term959, term959.getClass(), "url", null);
        setField(term957, term957.getClass(), "language", term959);
        ArrayList term943 = new ArrayList();
        ((ArrayList) term943).add(term945);
        ((ArrayList) term943).add(term948);
        ((ArrayList) term943).add(term951);
        ((ArrayList) term943).add(term954);
        ((ArrayList) term943).add(term957);
        Object term964 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term966 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term964, term964.getClass(), "name", "");
        setField(term966, term966.getClass(), "name", null);
        setField(term966, term966.getClass(), "url", null);
        setField(term964, term964.getClass(), "language", term966);
        Object term967 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term969 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term967, term967.getClass(), "name", "");
        setField(term969, term969.getClass(), "name", null);
        setField(term969, term969.getClass(), "url", null);
        setField(term967, term967.getClass(), "language", term969);
        Object term970 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term972 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term970, term970.getClass(), "name", "");
        setField(term972, term972.getClass(), "name", null);
        setField(term972, term972.getClass(), "url", null);
        setField(term970, term970.getClass(), "language", term972);
        Object term973 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term973, term973.getClass(), "name", "");
        setField(term973, term973.getClass(), "language", term966);
        ArrayList term962 = new ArrayList();
        ((ArrayList) term962).add(term964);
        ((ArrayList) term962).add(term967);
        ((ArrayList) term962).add(term970);
        ((ArrayList) term962).add(term973);
        term809 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term844 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term869 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term918 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term809, term809.getClass(), "id", term810);
        setField(term809, term809.getClass(), "name", "xrwlQZdwCp");
        setField(term809, term809.getClass(), "order", term824);
        setField(term809, term809.getClass(), "formOrder", term826);
        setField(term809, term809.getClass(), "isDefault", term828);
        setField(term809, term809.getClass(), "isBattleOnly", term830);
        setField(term809, term809.getClass(), "formName", "IDCWpPLRkE");
        setField(term844, term844.getClass(), "name", "nyiiPDVjAc");
        setField(term844, term844.getClass(), "url", "aKnKipADSo");
        setField(term809, term809.getClass(), "pokemon", term844);
        setField(term869, term869.getClass(), "frontDefault", "wSQxaModmm");
        setField(term869, term869.getClass(), "frontShiny", "UlajhuVLaP");
        setField(term869, term869.getClass(), "backDefault", "gGSMzuGICf");
        setField(term869, term869.getClass(), "backShiny", "hxCBltsObl");
        setField(term809, term809.getClass(), "sprites", term869);
        setField(term918, term918.getClass(), "name", "BndsHwAFMv");
        setField(term918, term918.getClass(), "url", "GzFkzHGYFt");
        setField(term809, term809.getClass(), "versionGroup", term918);
        setField(term809, term809.getClass(), "names", term943);
        setField(term809, term809.getClass(), "formNames", term962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term809, args);
    }

};


