package skaro.pokeapi.resource.nature;

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
import static skaro.pokeapi.resource.nature.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Nature_getNames_16818119414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19332;

    public Nature_getNames_16818119414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term19333 = new Integer(-1911972560);
        Object term19449 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term19451 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19449, term19449.getClass(), "name", "");
        setField(term19451, term19451.getClass(), "name", null);
        setField(term19451, term19451.getClass(), "url", null);
        setField(term19449, term19449.getClass(), "language", term19451);
        Object term19452 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term19454 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19452, term19452.getClass(), "name", "");
        setField(term19454, term19454.getClass(), "name", null);
        setField(term19454, term19454.getClass(), "url", null);
        setField(term19452, term19452.getClass(), "language", term19454);
        Object term19455 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term19457 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19455, term19455.getClass(), "name", "");
        setField(term19457, term19457.getClass(), "name", null);
        setField(term19457, term19457.getClass(), "url", null);
        setField(term19455, term19455.getClass(), "language", term19457);
        Object term19458 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term19460 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19458, term19458.getClass(), "name", "");
        setField(term19460, term19460.getClass(), "name", null);
        setField(term19460, term19460.getClass(), "url", null);
        setField(term19458, term19458.getClass(), "language", term19460);
        ArrayList term19447 = new ArrayList();
        ((ArrayList) term19447).add(term19449);
        ((ArrayList) term19447).add(term19452);
        ((ArrayList) term19447).add(term19455);
        ((ArrayList) term19447).add(term19458);
        term19332 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term19347 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term19372 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term19397 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term19422 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19332, term19332.getClass(), "id", term19333);
        setField(term19332, term19332.getClass(), "name", "eNcuSzCfin");
        setField(term19347, term19347.getClass(), "name", "lujQENuAbC");
        setField(term19347, term19347.getClass(), "url", "qkbmnArlda");
        setField(term19332, term19332.getClass(), "decreasedStat", term19347);
        setField(term19372, term19372.getClass(), "name", "yvOcemZnPj");
        setField(term19372, term19372.getClass(), "url", "xAxPUWaeyn");
        setField(term19332, term19332.getClass(), "increasedStat", term19372);
        setField(term19397, term19397.getClass(), "name", "QrXzPOoTMM");
        setField(term19397, term19397.getClass(), "url", "ovDeGFzsPr");
        setField(term19332, term19332.getClass(), "hatesFlavor", term19397);
        setField(term19422, term19422.getClass(), "name", "MetUQYZAvL");
        setField(term19422, term19422.getClass(), "url", "TfZIVTqpIe");
        setField(term19332, term19332.getClass(), "likesFlavor", term19422);
        setField(term19332, term19332.getClass(), "names", term19447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term19332, args);
    }

};


