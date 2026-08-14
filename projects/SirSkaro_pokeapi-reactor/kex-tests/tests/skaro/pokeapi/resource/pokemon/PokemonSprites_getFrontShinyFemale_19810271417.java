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

public class PokemonSprites_getFrontShinyFemale_19810271417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18489;

    public PokemonSprites_getFrontShinyFemale_19810271417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18489 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term18489, term18489.getClass(), "frontDefault", "HilHTbDKDF");
        setField(term18489, term18489.getClass(), "frontShiny", "IaEqlVwmNS");
        setField(term18489, term18489.getClass(), "frontFemale", "ljNOgdPWrL");
        setField(term18489, term18489.getClass(), "frontShinyFemale", "oBlIZiyRMS");
        setField(term18489, term18489.getClass(), "backDefault", "QUYAkhtCNh");
        setField(term18489, term18489.getClass(), "backShiny", "kOaAQOLyqd");
        setField(term18489, term18489.getClass(), "backFemale", "ICBWiKaeHC");
        setField(term18489, term18489.getClass(), "backShinyFemale", "WAljagiCzu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrontShinyFemale", argTypes, term18489, args);
    }

};


