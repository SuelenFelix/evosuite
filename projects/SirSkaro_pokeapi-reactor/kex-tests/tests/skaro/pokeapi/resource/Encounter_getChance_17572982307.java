package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Encounter_getChance_17572982307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5463;

    public Encounter_getChance_17572982307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5464 = new Integer(-1005024758);
        Integer term5466 = new Integer(2634669);
        ArrayList term5468 = new ArrayList();
        Integer term5472 = new Integer(-1912429941);
        term5463 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term5474 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5463, term5463.getClass(), "minLevel", term5464);
        setField(term5463, term5463.getClass(), "maxLevel", term5466);
        setField(term5463, term5463.getClass(), "conditionValues", term5468);
        setField(term5463, term5463.getClass(), "chance", term5472);
        setField(term5474, term5474.getClass(), "name", "cfRimmJxqA");
        setField(term5474, term5474.getClass(), "url", "oOnRVGqFmy");
        setField(term5463, term5463.getClass(), "method", term5474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Encounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChance", argTypes, term5463, args);
    }

};


