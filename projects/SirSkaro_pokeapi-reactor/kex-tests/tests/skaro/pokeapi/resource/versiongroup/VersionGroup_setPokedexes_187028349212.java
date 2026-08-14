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

public class VersionGroup_setPokedexes_187028349212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1043;
     Object term1101;

    public VersionGroup_setPokedexes_187028349212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1044 = new Integer(-1007160944);
        Integer term1058 = new Integer(1135664017);
        ArrayList term1085 = new ArrayList();
        ArrayList term1089 = new ArrayList();
        ArrayList term1093 = new ArrayList();
        ArrayList term1097 = new ArrayList();
        term1043 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term1060 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1043, term1043.getClass(), "id", term1044);
        setField(term1043, term1043.getClass(), "name", "nyiiPDVjAc");
        setField(term1043, term1043.getClass(), "order", term1058);
        setField(term1060, term1060.getClass(), "name", "aKnKipADSo");
        setField(term1060, term1060.getClass(), "url", "wSQxaModmm");
        setField(term1043, term1043.getClass(), "generation", term1060);
        setField(term1043, term1043.getClass(), "moveLearnMethods", term1085);
        setField(term1043, term1043.getClass(), "pokedexes", term1089);
        setField(term1043, term1043.getClass(), "regions", term1093);
        setField(term1043, term1043.getClass(), "versions", term1097);
        term1101 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1101;
        callMethod(klass, "setPokedexes", argTypes, term1043, args);
    }

};


