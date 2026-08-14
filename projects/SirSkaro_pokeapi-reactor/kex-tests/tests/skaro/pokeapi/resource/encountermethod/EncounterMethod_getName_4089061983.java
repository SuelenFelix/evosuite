package skaro.pokeapi.resource.encountermethod;

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
import static skaro.pokeapi.resource.encountermethod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class EncounterMethod_getName_4089061983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;

    public EncounterMethod_getName_4089061983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term93 = new Integer(-616727354);
        Integer term107 = new Integer(-1955890973);
        Object term111 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term113 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term111, term111.getClass(), "name", "");
        setField(term113, term113.getClass(), "name", null);
        setField(term113, term113.getClass(), "url", null);
        setField(term111, term111.getClass(), "language", term113);
        Object term114 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term116 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term114, term114.getClass(), "name", "");
        setField(term116, term116.getClass(), "name", null);
        setField(term116, term116.getClass(), "url", null);
        setField(term114, term114.getClass(), "language", term116);
        Object term117 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term119 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term117, term117.getClass(), "name", "");
        setField(term119, term119.getClass(), "name", null);
        setField(term119, term119.getClass(), "url", null);
        setField(term117, term117.getClass(), "language", term119);
        ArrayList term109 = new ArrayList();
        ((ArrayList) term109).add(term111);
        ((ArrayList) term109).add(term114);
        ((ArrayList) term109).add(term117);
        term92 = newInstance(Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod"));
        setField(term92, term92.getClass(), "id", term93);
        setField(term92, term92.getClass(), "name", "TEParAifyi");
        setField(term92, term92.getClass(), "order", term107);
        setField(term92, term92.getClass(), "names", term109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term92, args);
    }

};


