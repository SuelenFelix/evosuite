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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.LinkedList;

public class PokemonMove_setVersionGroupDetails_15904430905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20984;
     Object term21029;

    public PokemonMove_setVersionGroupDetails_15904430905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21015 = new Integer(1780958641);
        Object term21012 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term21013 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term21014 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term21013, term21013.getClass(), "name", null);
        setField(term21013, term21013.getClass(), "url", null);
        setField(term21012, term21012.getClass(), "moveLearnMethod", term21013);
        setField(term21014, term21014.getClass(), "name", null);
        setField(term21014, term21014.getClass(), "url", null);
        setField(term21012, term21012.getClass(), "versionGroup", term21014);
        setField(term21012, term21012.getClass(), "levelLearnedAt", term21015);
        Integer term21020 = new Integer(1890582085);
        Object term21017 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term21018 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term21019 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term21018, term21018.getClass(), "name", null);
        setField(term21018, term21018.getClass(), "url", null);
        setField(term21017, term21017.getClass(), "moveLearnMethod", term21018);
        setField(term21019, term21019.getClass(), "name", null);
        setField(term21019, term21019.getClass(), "url", null);
        setField(term21017, term21017.getClass(), "versionGroup", term21019);
        setField(term21017, term21017.getClass(), "levelLearnedAt", term21020);
        Integer term21025 = new Integer(2146568808);
        Object term21022 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term21023 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term21024 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term21023, term21023.getClass(), "name", null);
        setField(term21023, term21023.getClass(), "url", null);
        setField(term21022, term21022.getClass(), "moveLearnMethod", term21023);
        setField(term21024, term21024.getClass(), "name", null);
        setField(term21024, term21024.getClass(), "url", null);
        setField(term21022, term21022.getClass(), "versionGroup", term21024);
        setField(term21022, term21022.getClass(), "levelLearnedAt", term21025);
        ArrayList term21010 = new ArrayList();
        ((ArrayList) term21010).add(term21012);
        ((ArrayList) term21010).add(term21017);
        ((ArrayList) term21010).add(term21022);
        term20984 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMove"));
        Object term20985 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20985, term20985.getClass(), "name", "DZAGnhJkeU");
        setField(term20985, term20985.getClass(), "url", "xQuVexkiVz");
        setField(term20984, term20984.getClass(), "move", term20985);
        setField(term20984, term20984.getClass(), "versionGroupDetails", term21010);
        Integer term21039 = new Integer(245081679);
        Object term21032 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term21033 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term21036 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term21033, term21033.getClass(), "name", "");
        setField(term21033, term21033.getClass(), "url", "");
        setField(term21032, term21032.getClass(), "moveLearnMethod", term21033);
        setField(term21036, term21036.getClass(), "name", "");
        setField(term21036, term21036.getClass(), "url", "");
        setField(term21032, term21032.getClass(), "versionGroup", term21036);
        setField(term21032, term21032.getClass(), "levelLearnedAt", term21039);
        Integer term21045 = new Integer(1199789398);
        Object term21042 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term21043 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term21044 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term21043, term21043.getClass(), "name", null);
        setField(term21043, term21043.getClass(), "url", null);
        setField(term21042, term21042.getClass(), "moveLearnMethod", term21043);
        setField(term21044, term21044.getClass(), "name", null);
        setField(term21044, term21044.getClass(), "url", null);
        setField(term21042, term21042.getClass(), "versionGroup", term21044);
        setField(term21042, term21042.getClass(), "levelLearnedAt", term21045);
        Integer term21049 = new Integer(-1056402285);
        Object term21048 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        setField(term21048, term21048.getClass(), "moveLearnMethod", null);
        setField(term21048, term21048.getClass(), "versionGroup", null);
        setField(term21048, term21048.getClass(), "levelLearnedAt", term21049);
        term21029 = new LinkedList();
        ((LinkedList) term21029).add(term21032);
        ((LinkedList) term21029).add(term21042);
        ((LinkedList) term21029).add(term21048);
        ((LinkedList) term21029).add((Object)null);
        ((LinkedList) term21029).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonMove");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term21029;
        callMethod(klass, "setVersionGroupDetails", argTypes, term20984, args);
    }

};


