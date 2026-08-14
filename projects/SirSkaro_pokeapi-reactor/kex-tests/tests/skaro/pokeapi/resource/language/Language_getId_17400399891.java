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

public class Language_getId_17400399891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Language_getId_17400399891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Boolean term16 = new Boolean(false);
        Object term44 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term46 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term44, term44.getClass(), "name", "");
        setField(term46, term46.getClass(), "name", null);
        setField(term46, term46.getClass(), "url", null);
        setField(term44, term44.getClass(), "language", term46);
        Object term47 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term49 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term47, term47.getClass(), "name", "");
        setField(term49, term49.getClass(), "name", null);
        setField(term49, term49.getClass(), "url", null);
        setField(term47, term47.getClass(), "language", term49);
        Object term50 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term52 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term50, term50.getClass(), "name", "");
        setField(term52, term52.getClass(), "name", null);
        setField(term52, term52.getClass(), "url", null);
        setField(term50, term50.getClass(), "language", term52);
        Object term53 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term55 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term53, term53.getClass(), "name", "");
        setField(term55, term55.getClass(), "name", null);
        setField(term55, term55.getClass(), "url", null);
        setField(term53, term53.getClass(), "language", term55);
        Object term56 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term58 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term56, term56.getClass(), "name", "");
        setField(term58, term58.getClass(), "name", null);
        setField(term58, term58.getClass(), "url", null);
        setField(term56, term56.getClass(), "language", term58);
        ArrayList term42 = new ArrayList();
        ((ArrayList) term42).add(term44);
        ((ArrayList) term42).add(term47);
        ((ArrayList) term42).add(term50);
        ((ArrayList) term42).add(term53);
        ((ArrayList) term42).add(term56);
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.language.Language"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "official", term16);
        setField(term1, term1.getClass(), "iso639", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "iso3166", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "names", term42);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.language.Language");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


