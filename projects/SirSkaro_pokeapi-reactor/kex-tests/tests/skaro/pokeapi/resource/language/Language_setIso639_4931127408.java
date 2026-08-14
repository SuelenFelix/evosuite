package skaro.pokeapi.resource.language;

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
import static skaro.pokeapi.resource.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;

public class Language_setIso639_4931127408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term627;

    public Language_setIso639_4931127408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term628 = new Integer(1227103734);
        Boolean term642 = new Boolean(false);
        Object term670 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term672 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term670, term670.getClass(), "name", "");
        setField(term672, term672.getClass(), "name", null);
        setField(term672, term672.getClass(), "url", null);
        setField(term670, term670.getClass(), "language", term672);
        Object term673 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term675 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term673, term673.getClass(), "name", "");
        setField(term675, term675.getClass(), "name", null);
        setField(term675, term675.getClass(), "url", null);
        setField(term673, term673.getClass(), "language", term675);
        Object term676 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term678 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term676, term676.getClass(), "name", "");
        setField(term678, term678.getClass(), "name", null);
        setField(term678, term678.getClass(), "url", null);
        setField(term676, term676.getClass(), "language", term678);
        Object term679 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term681 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term679, term679.getClass(), "name", "");
        setField(term681, term681.getClass(), "name", null);
        setField(term681, term681.getClass(), "url", null);
        setField(term679, term679.getClass(), "language", term681);
        Object term682 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term684 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term682, term682.getClass(), "name", "");
        setField(term684, term684.getClass(), "name", null);
        setField(term684, term684.getClass(), "url", null);
        setField(term682, term682.getClass(), "language", term684);
        Object term685 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term687 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term685, term685.getClass(), "name", "");
        setField(term687, term687.getClass(), "name", null);
        setField(term687, term687.getClass(), "url", null);
        setField(term685, term685.getClass(), "language", term687);
        ArrayList term668 = new ArrayList();
        ((ArrayList) term668).add(term670);
        ((ArrayList) term668).add(term673);
        ((ArrayList) term668).add(term676);
        ((ArrayList) term668).add(term679);
        ((ArrayList) term668).add(term682);
        ((ArrayList) term668).add(term685);
        term627 = newInstance(Class.forName("skaro.pokeapi.resource.language.Language"));
        setField(term627, term627.getClass(), "id", term628);
        setField(term627, term627.getClass(), "name", "JiVRgTZvKc");
        setField(term627, term627.getClass(), "official", term642);
        setField(term627, term627.getClass(), "iso639", "XPKmummaqg");
        setField(term627, term627.getClass(), "iso3166", "BKLfkLiZTH");
        setField(term627, term627.getClass(), "names", term668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.language.Language");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pORebkoRdD";
        callMethod(klass, "setIso639", argTypes, term627, args);
    }

};


