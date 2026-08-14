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

public class Language_setName_15921241044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264;

    public Language_setName_15921241044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term265 = new Integer(-1922583790);
        Boolean term279 = new Boolean(false);
        Object term307 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term309 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term307, term307.getClass(), "name", "");
        setField(term309, term309.getClass(), "name", null);
        setField(term309, term309.getClass(), "url", null);
        setField(term307, term307.getClass(), "language", term309);
        Object term310 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term312 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term310, term310.getClass(), "name", "");
        setField(term312, term312.getClass(), "name", null);
        setField(term312, term312.getClass(), "url", null);
        setField(term310, term310.getClass(), "language", term312);
        Object term313 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term315 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term313, term313.getClass(), "name", "");
        setField(term315, term315.getClass(), "name", null);
        setField(term315, term315.getClass(), "url", null);
        setField(term313, term313.getClass(), "language", term315);
        Object term316 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term318 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term316, term316.getClass(), "name", "");
        setField(term318, term318.getClass(), "name", null);
        setField(term318, term318.getClass(), "url", null);
        setField(term316, term316.getClass(), "language", term318);
        ArrayList term305 = new ArrayList();
        ((ArrayList) term305).add(term307);
        ((ArrayList) term305).add(term310);
        ((ArrayList) term305).add(term313);
        ((ArrayList) term305).add(term316);
        term264 = newInstance(Class.forName("skaro.pokeapi.resource.language.Language"));
        setField(term264, term264.getClass(), "id", term265);
        setField(term264, term264.getClass(), "name", "GzFkzHGYFt");
        setField(term264, term264.getClass(), "official", term279);
        setField(term264, term264.getClass(), "iso639", "tShwQLRGNe");
        setField(term264, term264.getClass(), "iso3166", "LvtrsXUliU");
        setField(term264, term264.getClass(), "names", term305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.language.Language");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ieCtQFdkii";
        callMethod(klass, "setName", argTypes, term264, args);
    }

};


