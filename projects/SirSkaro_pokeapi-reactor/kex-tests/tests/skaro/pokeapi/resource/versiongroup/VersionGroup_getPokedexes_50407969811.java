package skaro.pokeapi.resource.versiongroup;

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
import static skaro.pokeapi.resource.versiongroup.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class VersionGroup_getPokedexes_50407969811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term955;

    public VersionGroup_getPokedexes_50407969811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term956 = new Integer(-2068769794);
        Integer term970 = new Integer(-117576464);
        ArrayList term997 = new ArrayList();
        ArrayList term1001 = new ArrayList();
        ArrayList term1005 = new ArrayList();
        ArrayList term1009 = new ArrayList();
        term955 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term972 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term955, term955.getClass(), "id", term956);
        setField(term955, term955.getClass(), "name", "Ghbwtircqb");
        setField(term955, term955.getClass(), "order", term970);
        setField(term972, term972.getClass(), "name", "xrwlQZdwCp");
        setField(term972, term972.getClass(), "url", "IDCWpPLRkE");
        setField(term955, term955.getClass(), "generation", term972);
        setField(term955, term955.getClass(), "moveLearnMethods", term997);
        setField(term955, term955.getClass(), "pokedexes", term1001);
        setField(term955, term955.getClass(), "regions", term1005);
        setField(term955, term955.getClass(), "versions", term1009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokedexes", argTypes, term955, args);
    }

};


