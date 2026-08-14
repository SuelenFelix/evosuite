package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class PastMoveStatValues_setPp_19151855368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term828;
     Object term915;

    public PastMoveStatValues_setPp_19151855368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term829 = new Integer(-1179120542);
        Integer term831 = new Integer(-73683645);
        Integer term833 = new Integer(-226514366);
        Integer term835 = new Integer(1193880199);
        Object term839 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term842 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term839, term839.getClass(), "effect", "");
        setField(term839, term839.getClass(), "shortEffect", "");
        setField(term842, term842.getClass(), "name", null);
        setField(term842, term842.getClass(), "url", null);
        setField(term839, term839.getClass(), "language", term842);
        Object term843 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term846 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term843, term843.getClass(), "effect", "");
        setField(term843, term843.getClass(), "shortEffect", "");
        setField(term846, term846.getClass(), "name", null);
        setField(term846, term846.getClass(), "url", null);
        setField(term843, term843.getClass(), "language", term846);
        Object term847 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term850 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term847, term847.getClass(), "effect", "");
        setField(term847, term847.getClass(), "shortEffect", "");
        setField(term850, term850.getClass(), "name", null);
        setField(term850, term850.getClass(), "url", null);
        setField(term847, term847.getClass(), "language", term850);
        Object term851 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term854 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term851, term851.getClass(), "effect", "");
        setField(term851, term851.getClass(), "shortEffect", "");
        setField(term854, term854.getClass(), "name", null);
        setField(term854, term854.getClass(), "url", null);
        setField(term851, term851.getClass(), "language", term854);
        Object term855 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term858 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term855, term855.getClass(), "effect", "");
        setField(term855, term855.getClass(), "shortEffect", "");
        setField(term858, term858.getClass(), "name", null);
        setField(term858, term858.getClass(), "url", null);
        setField(term855, term855.getClass(), "language", term858);
        Object term859 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term862 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term859, term859.getClass(), "effect", "");
        setField(term859, term859.getClass(), "shortEffect", "");
        setField(term862, term862.getClass(), "name", null);
        setField(term862, term862.getClass(), "url", null);
        setField(term859, term859.getClass(), "language", term862);
        ArrayList term837 = new ArrayList();
        ((ArrayList) term837).add(term839);
        ((ArrayList) term837).add(term843);
        ((ArrayList) term837).add(term847);
        ((ArrayList) term837).add(term851);
        ((ArrayList) term837).add(term855);
        ((ArrayList) term837).add(term859);
        term828 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        Object term865 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term890 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term828, term828.getClass(), "accuracy", term829);
        setField(term828, term828.getClass(), "effectChance", term831);
        setField(term828, term828.getClass(), "power", term833);
        setField(term828, term828.getClass(), "pp", term835);
        setField(term828, term828.getClass(), "effectEntries", term837);
        setField(term865, term865.getClass(), "name", "MwwjNtdOFT");
        setField(term865, term865.getClass(), "url", "VYkqXKVlAJ");
        setField(term828, term828.getClass(), "type", term865);
        setField(term890, term890.getClass(), "name", "XkIoWJRNwN");
        setField(term890, term890.getClass(), "url", "aNWLJdrZMq");
        setField(term828, term828.getClass(), "versionGroup", term890);
        term915 = new Integer(-1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term915;
        callMethod(klass, "setPp", argTypes, term828, args);
    }

};


