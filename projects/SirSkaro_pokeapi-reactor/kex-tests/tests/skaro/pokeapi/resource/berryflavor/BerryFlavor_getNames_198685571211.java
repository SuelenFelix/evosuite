package skaro.pokeapi.resource.berryflavor;

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
import static skaro.pokeapi.resource.berryflavor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class BerryFlavor_getNames_198685571211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140897;

    public BerryFlavor_getNames_198685571211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term140898 = new Integer(-1416009681);
        Integer term140915 = new Integer(613284576);
        Object term140914 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140917 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140914, term140914.getClass(), "potency", term140915);
        setField(term140917, term140917.getClass(), "name", null);
        setField(term140917, term140917.getClass(), "url", null);
        setField(term140914, term140914.getClass(), "berry", term140917);
        Integer term140919 = new Integer(-868953151);
        Object term140918 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140921 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140918, term140918.getClass(), "potency", term140919);
        setField(term140921, term140921.getClass(), "name", null);
        setField(term140921, term140921.getClass(), "url", null);
        setField(term140918, term140918.getClass(), "berry", term140921);
        Integer term140923 = new Integer(513401096);
        Object term140922 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140925 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140922, term140922.getClass(), "potency", term140923);
        setField(term140925, term140925.getClass(), "name", null);
        setField(term140925, term140925.getClass(), "url", null);
        setField(term140922, term140922.getClass(), "berry", term140925);
        ArrayList term140912 = new ArrayList();
        ((ArrayList) term140912).add(term140914);
        ((ArrayList) term140912).add(term140918);
        ((ArrayList) term140912).add(term140922);
        Object term140955 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140957 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140955, term140955.getClass(), "name", "");
        setField(term140957, term140957.getClass(), "name", null);
        setField(term140957, term140957.getClass(), "url", null);
        setField(term140955, term140955.getClass(), "language", term140957);
        Object term140958 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140960 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140958, term140958.getClass(), "name", "");
        setField(term140960, term140960.getClass(), "name", null);
        setField(term140960, term140960.getClass(), "url", null);
        setField(term140958, term140958.getClass(), "language", term140960);
        Object term140961 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140963 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140961, term140961.getClass(), "name", "");
        setField(term140963, term140963.getClass(), "name", null);
        setField(term140963, term140963.getClass(), "url", null);
        setField(term140961, term140961.getClass(), "language", term140963);
        Object term140964 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140966 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140964, term140964.getClass(), "name", "");
        setField(term140966, term140966.getClass(), "name", null);
        setField(term140966, term140966.getClass(), "url", null);
        setField(term140964, term140964.getClass(), "language", term140966);
        Object term140967 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140969 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140967, term140967.getClass(), "name", "");
        setField(term140969, term140969.getClass(), "name", null);
        setField(term140969, term140969.getClass(), "url", null);
        setField(term140967, term140967.getClass(), "language", term140969);
        Object term140970 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140972 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140970, term140970.getClass(), "name", "");
        setField(term140972, term140972.getClass(), "name", null);
        setField(term140972, term140972.getClass(), "url", null);
        setField(term140970, term140970.getClass(), "language", term140972);
        ArrayList term140953 = new ArrayList();
        ((ArrayList) term140953).add(term140955);
        ((ArrayList) term140953).add(term140958);
        ((ArrayList) term140953).add(term140961);
        ((ArrayList) term140953).add(term140964);
        ((ArrayList) term140953).add(term140967);
        ((ArrayList) term140953).add(term140970);
        term140897 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term140928 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140897, term140897.getClass(), "id", term140898);
        setField(term140897, term140897.getClass(), "name", "cbedsmbJgQ");
        setField(term140897, term140897.getClass(), "barries", term140912);
        setField(term140928, term140928.getClass(), "name", "ItDptrQwGu");
        setField(term140928, term140928.getClass(), "url", "yUQNRnIkvT");
        setField(term140897, term140897.getClass(), "contestType", term140928);
        setField(term140897, term140897.getClass(), "names", term140953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term140897, args);
    }

};


