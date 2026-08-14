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
import java.util.LinkedList;

public class VersionGroup_setMoveLearnMethods_49876949110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term864;
     Object term922;

    public VersionGroup_setMoveLearnMethods_49876949110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term865 = new Integer(-655067527);
        Integer term879 = new Integer(-6029667);
        ArrayList term906 = new ArrayList();
        ArrayList term910 = new ArrayList();
        ArrayList term914 = new ArrayList();
        ArrayList term918 = new ArrayList();
        term864 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term881 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term864, term864.getClass(), "id", term865);
        setField(term864, term864.getClass(), "name", "AijpHYOFuy");
        setField(term864, term864.getClass(), "order", term879);
        setField(term881, term881.getClass(), "name", "SbAoxhfrkn");
        setField(term881, term881.getClass(), "url", "kuTXqwMtDB");
        setField(term864, term864.getClass(), "generation", term881);
        setField(term864, term864.getClass(), "moveLearnMethods", term906);
        setField(term864, term864.getClass(), "pokedexes", term910);
        setField(term864, term864.getClass(), "regions", term914);
        setField(term864, term864.getClass(), "versions", term918);
        term922 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term922;
        callMethod(klass, "setMoveLearnMethods", argTypes, term864, args);
    }

};


