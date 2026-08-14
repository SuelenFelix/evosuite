package skaro.pokeapi.resource.generation;

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
import static skaro.pokeapi.resource.generation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Generation_getTypes_122518800513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1004;

    public Generation_getTypes_122518800513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1005 = new Integer(-883034806);
        ArrayList term1019 = new ArrayList();
        Object term1025 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1027 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1025, term1025.getClass(), "name", "");
        setField(term1027, term1027.getClass(), "name", null);
        setField(term1027, term1027.getClass(), "url", null);
        setField(term1025, term1025.getClass(), "language", term1027);
        ArrayList term1023 = new ArrayList();
        ((ArrayList) term1023).add(term1025);
        ArrayList term1030 = new ArrayList();
        ArrayList term1034 = new ArrayList();
        ArrayList term1038 = new ArrayList();
        ArrayList term1042 = new ArrayList();
        term1004 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term1004, term1004.getClass(), "id", term1005);
        setField(term1004, term1004.getClass(), "name", "PqtVXXZMqK");
        setField(term1004, term1004.getClass(), "abilities", term1019);
        setField(term1004, term1004.getClass(), "names", term1023);
        setField(term1004, term1004.getClass(), "moves", term1030);
        setField(term1004, term1004.getClass(), "pokemonSpecies", term1034);
        setField(term1004, term1004.getClass(), "types", term1038);
        setField(term1004, term1004.getClass(), "versionGroups", term1042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTypes", argTypes, term1004, args);
    }

};


