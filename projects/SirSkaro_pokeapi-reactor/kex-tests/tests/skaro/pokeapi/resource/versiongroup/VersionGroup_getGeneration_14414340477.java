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

public class VersionGroup_getGeneration_14414340477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555;

    public VersionGroup_getGeneration_14414340477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term556 = new Integer(1585847225);
        Integer term570 = new Integer(597278769);
        ArrayList term597 = new ArrayList();
        ArrayList term601 = new ArrayList();
        ArrayList term605 = new ArrayList();
        ArrayList term609 = new ArrayList();
        term555 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term572 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term555, term555.getClass(), "id", term556);
        setField(term555, term555.getClass(), "name", "pCTimMblYc");
        setField(term555, term555.getClass(), "order", term570);
        setField(term572, term572.getClass(), "name", "hNxWaHcfhY");
        setField(term572, term572.getClass(), "url", "RkybSrpybU");
        setField(term555, term555.getClass(), "generation", term572);
        setField(term555, term555.getClass(), "moveLearnMethods", term597);
        setField(term555, term555.getClass(), "pokedexes", term601);
        setField(term555, term555.getClass(), "regions", term605);
        setField(term555, term555.getClass(), "versions", term609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneration", argTypes, term555, args);
    }

};


