package skaro.pokeapi.resource.region;

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
import static skaro.pokeapi.resource.region.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Region_setNames_14153055128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term696;
     Object term764;

    public Region_setNames_14153055128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term697 = new Integer(1227103734);
        ArrayList term699 = new ArrayList();
        Object term717 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term719 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term717, term717.getClass(), "name", "");
        setField(term719, term719.getClass(), "name", null);
        setField(term719, term719.getClass(), "url", null);
        setField(term717, term717.getClass(), "language", term719);
        Object term720 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term722 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term720, term720.getClass(), "name", "");
        setField(term722, term722.getClass(), "name", null);
        setField(term722, term722.getClass(), "url", null);
        setField(term720, term720.getClass(), "language", term722);
        Object term723 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term725 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term723, term723.getClass(), "name", "");
        setField(term725, term725.getClass(), "name", null);
        setField(term725, term725.getClass(), "url", null);
        setField(term723, term723.getClass(), "language", term725);
        Object term726 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term728 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term726, term726.getClass(), "name", "");
        setField(term728, term728.getClass(), "name", null);
        setField(term728, term728.getClass(), "url", null);
        setField(term726, term726.getClass(), "language", term728);
        ArrayList term715 = new ArrayList();
        ((ArrayList) term715).add(term717);
        ((ArrayList) term715).add(term720);
        ((ArrayList) term715).add(term723);
        ((ArrayList) term715).add(term726);
        ArrayList term756 = new ArrayList();
        ArrayList term760 = new ArrayList();
        term696 = newInstance(Class.forName("skaro.pokeapi.resource.region.Region"));
        Object term731 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term696, term696.getClass(), "id", term697);
        setField(term696, term696.getClass(), "locations", term699);
        setField(term696, term696.getClass(), "name", "PkWMRdJcBb");
        setField(term696, term696.getClass(), "names", term715);
        setField(term731, term731.getClass(), "name", "sEccwbJKYE");
        setField(term731, term731.getClass(), "url", "AWRooQKkdW");
        setField(term696, term696.getClass(), "mainGeneration", term731);
        setField(term696, term696.getClass(), "pokedexes", term756);
        setField(term696, term696.getClass(), "versionGroups", term760);
        Object term767 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term780 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term767, term767.getClass(), "name", "vjxIhXHxGR");
        setField(term780, term780.getClass(), "name", "");
        setField(term780, term780.getClass(), "url", "");
        setField(term767, term767.getClass(), "language", term780);
        Object term784 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term786 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term784, term784.getClass(), "name", "");
        setField(term786, term786.getClass(), "name", null);
        setField(term786, term786.getClass(), "url", null);
        setField(term784, term784.getClass(), "language", term786);
        Object term788 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term788, term788.getClass(), "name", null);
        setField(term788, term788.getClass(), "language", null);
        term764 = new LinkedList();
        ((LinkedList) term764).add(term767);
        ((LinkedList) term764).add(term784);
        ((LinkedList) term764).add(term788);
        ((LinkedList) term764).add((Object)null);
        ((LinkedList) term764).add((Object)null);
        ((LinkedList) term764).add((Object)null);
        ((LinkedList) term764).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.region.Region");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term764;
        callMethod(klass, "setNames", argTypes, term696, args);
    }

};


