package skaro.pokeapi.resource.movelearnmethod;

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
import static skaro.pokeapi.resource.movelearnmethod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class MoveLearnMethod_setNames_14008481468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425;
     Object term476;

    public MoveLearnMethod_setNames_14008481468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term426 = new Integer(1227103734);
        Object term442 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term444 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term442, term442.getClass(), "description", "");
        setField(term444, term444.getClass(), "name", null);
        setField(term444, term444.getClass(), "url", null);
        setField(term442, term442.getClass(), "language", term444);
        Object term445 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term447 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term445, term445.getClass(), "description", "");
        setField(term447, term447.getClass(), "name", null);
        setField(term447, term447.getClass(), "url", null);
        setField(term445, term445.getClass(), "language", term447);
        ArrayList term440 = new ArrayList();
        ((ArrayList) term440).add(term442);
        ((ArrayList) term440).add(term445);
        Object term452 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term454 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term452, term452.getClass(), "name", "");
        setField(term454, term454.getClass(), "name", null);
        setField(term454, term454.getClass(), "url", null);
        setField(term452, term452.getClass(), "language", term454);
        Object term455 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term457 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term455, term455.getClass(), "name", "");
        setField(term457, term457.getClass(), "name", null);
        setField(term457, term457.getClass(), "url", null);
        setField(term455, term455.getClass(), "language", term457);
        Object term458 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term460 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term458, term458.getClass(), "name", "");
        setField(term460, term460.getClass(), "name", null);
        setField(term460, term460.getClass(), "url", null);
        setField(term458, term458.getClass(), "language", term460);
        Object term461 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term463 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term461, term461.getClass(), "name", "");
        setField(term463, term463.getClass(), "name", null);
        setField(term463, term463.getClass(), "url", null);
        setField(term461, term461.getClass(), "language", term463);
        Object term464 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term466 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term464, term464.getClass(), "name", "");
        setField(term466, term466.getClass(), "name", null);
        setField(term466, term466.getClass(), "url", null);
        setField(term464, term464.getClass(), "language", term466);
        Object term467 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term469 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term467, term467.getClass(), "name", "");
        setField(term469, term469.getClass(), "name", null);
        setField(term469, term469.getClass(), "url", null);
        setField(term467, term467.getClass(), "language", term469);
        ArrayList term450 = new ArrayList();
        ((ArrayList) term450).add(term452);
        ((ArrayList) term450).add(term455);
        ((ArrayList) term450).add(term458);
        ((ArrayList) term450).add(term461);
        ((ArrayList) term450).add(term464);
        ((ArrayList) term450).add(term467);
        ArrayList term472 = new ArrayList();
        term425 = newInstance(Class.forName("skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod"));
        setField(term425, term425.getClass(), "id", term426);
        setField(term425, term425.getClass(), "name", "UfQtPRyWRC");
        setField(term425, term425.getClass(), "descriptions", term440);
        setField(term425, term425.getClass(), "names", term450);
        setField(term425, term425.getClass(), "versionGroups", term472);
        term476 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term476;
        callMethod(klass, "setNames", argTypes, term425, args);
    }

};


