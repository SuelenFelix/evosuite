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

public class Language_getOfficial_13796322735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373;

    public Language_getOfficial_13796322735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term374 = new Integer(-616727354);
        Boolean term388 = new Boolean(true);
        Object term416 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term418 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term416, term416.getClass(), "name", "");
        setField(term418, term418.getClass(), "name", null);
        setField(term418, term418.getClass(), "url", null);
        setField(term416, term416.getClass(), "language", term418);
        ArrayList term414 = new ArrayList();
        ((ArrayList) term414).add(term416);
        term373 = newInstance(Class.forName("skaro.pokeapi.resource.language.Language"));
        setField(term373, term373.getClass(), "id", term374);
        setField(term373, term373.getClass(), "name", "dEnhdmILtU");
        setField(term373, term373.getClass(), "official", term388);
        setField(term373, term373.getClass(), "iso639", "hoicvmsovO");
        setField(term373, term373.getClass(), "iso3166", "eqJfYWRaEL");
        setField(term373, term373.getClass(), "names", term414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.language.Language");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOfficial", argTypes, term373, args);
    }

};


