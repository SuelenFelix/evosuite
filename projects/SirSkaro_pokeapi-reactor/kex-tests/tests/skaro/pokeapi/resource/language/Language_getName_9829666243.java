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

public class Language_getName_9829666243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180;

    public Language_getName_9829666243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term181 = new Integer(391863371);
        Boolean term195 = new Boolean(false);
        Object term223 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term225 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term223, term223.getClass(), "name", "");
        setField(term225, term225.getClass(), "name", null);
        setField(term225, term225.getClass(), "url", null);
        setField(term223, term223.getClass(), "language", term225);
        Object term226 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term228 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term226, term226.getClass(), "name", "");
        setField(term228, term228.getClass(), "name", null);
        setField(term228, term228.getClass(), "url", null);
        setField(term226, term226.getClass(), "language", term228);
        Object term229 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term231 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term229, term229.getClass(), "name", "");
        setField(term231, term231.getClass(), "name", null);
        setField(term231, term231.getClass(), "url", null);
        setField(term229, term229.getClass(), "language", term231);
        ArrayList term221 = new ArrayList();
        ((ArrayList) term221).add(term223);
        ((ArrayList) term221).add(term226);
        ((ArrayList) term221).add(term229);
        term180 = newInstance(Class.forName("skaro.pokeapi.resource.language.Language"));
        setField(term180, term180.getClass(), "id", term181);
        setField(term180, term180.getClass(), "name", "SbAoxhfrkn");
        setField(term180, term180.getClass(), "official", term195);
        setField(term180, term180.getClass(), "iso639", "kuTXqwMtDB");
        setField(term180, term180.getClass(), "iso3166", "Ghbwtircqb");
        setField(term180, term180.getClass(), "names", term221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.language.Language");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term180, args);
    }

};


