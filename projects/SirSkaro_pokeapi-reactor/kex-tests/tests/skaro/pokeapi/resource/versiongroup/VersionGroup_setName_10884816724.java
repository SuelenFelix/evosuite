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

public class VersionGroup_setName_10884816724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;

    public VersionGroup_setName_10884816724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term268 = new Integer(-2038273078);
        Integer term282 = new Integer(1227103734);
        ArrayList term309 = new ArrayList();
        ArrayList term313 = new ArrayList();
        ArrayList term317 = new ArrayList();
        ArrayList term321 = new ArrayList();
        term267 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term284 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term267, term267.getClass(), "id", term268);
        setField(term267, term267.getClass(), "name", "RMFIsYGgne");
        setField(term267, term267.getClass(), "order", term282);
        setField(term284, term284.getClass(), "name", "NRdvgJlhkX");
        setField(term284, term284.getClass(), "url", "uuaPigETmJ");
        setField(term267, term267.getClass(), "generation", term284);
        setField(term267, term267.getClass(), "moveLearnMethods", term309);
        setField(term267, term267.getClass(), "pokedexes", term313);
        setField(term267, term267.getClass(), "regions", term317);
        setField(term267, term267.getClass(), "versions", term321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MxlszYVzRf";
        callMethod(klass, "setName", argTypes, term267, args);
    }

};


