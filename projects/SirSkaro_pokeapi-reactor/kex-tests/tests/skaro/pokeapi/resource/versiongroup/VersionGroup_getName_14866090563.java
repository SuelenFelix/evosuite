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

public class VersionGroup_getName_14866090563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;

    public VersionGroup_getName_14866090563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term180 = new Integer(-616727354);
        Integer term194 = new Integer(-1955890973);
        ArrayList term221 = new ArrayList();
        ArrayList term225 = new ArrayList();
        ArrayList term229 = new ArrayList();
        ArrayList term233 = new ArrayList();
        term179 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term196 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term179, term179.getClass(), "id", term180);
        setField(term179, term179.getClass(), "name", "SzjVpOQTyS");
        setField(term179, term179.getClass(), "order", term194);
        setField(term196, term196.getClass(), "name", "MjGYSRKTNF");
        setField(term196, term196.getClass(), "url", "hRNSzYYIrc");
        setField(term179, term179.getClass(), "generation", term196);
        setField(term179, term179.getClass(), "moveLearnMethods", term221);
        setField(term179, term179.getClass(), "pokedexes", term225);
        setField(term179, term179.getClass(), "regions", term229);
        setField(term179, term179.getClass(), "versions", term233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term179, args);
    }

};


