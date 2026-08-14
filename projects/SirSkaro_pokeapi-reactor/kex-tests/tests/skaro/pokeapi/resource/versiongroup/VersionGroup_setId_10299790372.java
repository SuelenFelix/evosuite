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

public class VersionGroup_setId_10299790372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89;
     Object term147;

    public VersionGroup_setId_10299790372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term90 = new Integer(1484323161);
        Integer term104 = new Integer(391863371);
        ArrayList term131 = new ArrayList();
        ArrayList term135 = new ArrayList();
        ArrayList term139 = new ArrayList();
        ArrayList term143 = new ArrayList();
        term89 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term106 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term89, term89.getClass(), "id", term90);
        setField(term89, term89.getClass(), "name", "xxtlPwDYFs");
        setField(term89, term89.getClass(), "order", term104);
        setField(term106, term106.getClass(), "name", "jJCZpVmanW");
        setField(term106, term106.getClass(), "url", "EGtDIRbSSb");
        setField(term89, term89.getClass(), "generation", term106);
        setField(term89, term89.getClass(), "moveLearnMethods", term131);
        setField(term89, term89.getClass(), "pokedexes", term135);
        setField(term89, term89.getClass(), "regions", term139);
        setField(term89, term89.getClass(), "versions", term143);
        term147 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term147;
        callMethod(klass, "setId", argTypes, term89, args);
    }

};


