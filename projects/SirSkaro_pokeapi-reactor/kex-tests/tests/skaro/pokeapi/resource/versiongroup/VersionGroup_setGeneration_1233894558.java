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

public class VersionGroup_setGeneration_1233894558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term643;
     Object term701;

    public VersionGroup_setGeneration_1233894558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term644 = new Integer(-1685132342);
        Integer term658 = new Integer(-1456670397);
        ArrayList term685 = new ArrayList();
        ArrayList term689 = new ArrayList();
        ArrayList term693 = new ArrayList();
        ArrayList term697 = new ArrayList();
        term643 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term660 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term643, term643.getClass(), "id", term644);
        setField(term643, term643.getClass(), "name", "xOEqzGAmDU");
        setField(term643, term643.getClass(), "order", term658);
        setField(term660, term660.getClass(), "name", "eZFUvlxvGV");
        setField(term660, term660.getClass(), "url", "BYqFIqCKAV");
        setField(term643, term643.getClass(), "generation", term660);
        setField(term643, term643.getClass(), "moveLearnMethods", term685);
        setField(term643, term643.getClass(), "pokedexes", term689);
        setField(term643, term643.getClass(), "regions", term693);
        setField(term643, term643.getClass(), "versions", term697);
        term701 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term701, term701.getClass(), "name", "OclPbYPkcH");
        setField(term701, term701.getClass(), "url", "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term701;
        callMethod(klass, "setGeneration", argTypes, term643, args);
    }

};


