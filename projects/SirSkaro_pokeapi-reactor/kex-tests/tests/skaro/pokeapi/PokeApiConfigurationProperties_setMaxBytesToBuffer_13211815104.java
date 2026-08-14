package skaro.pokeapi;

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
import static skaro.pokeapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class PokeApiConfigurationProperties_setMaxBytesToBuffer_13211815104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137999;
     Object term138063;

    public PokeApiConfigurationProperties_setMaxBytesToBuffer_13211815104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137999 = newInstance(Class.forName("skaro.pokeapi.PokeApiConfigurationProperties"));
        Object term138000 = newInstance(Class.forName("java.net.URI"));
        setField(term138000, term138000.getClass(), "scheme", "mailto");
        setField(term138000, term138000.getClass(), "fragment", null);
        setField(term138000, term138000.getClass(), "authority", null);
        setField(term138000, term138000.getClass(), "userInfo", null);
        setField(term138000, term138000.getClass(), "host", null);
        setIntField(term138000, term138000.getClass(), "port", -1);
        setField(term138000, term138000.getClass(), "path", null);
        setField(term138000, term138000.getClass(), "query", null);
        setField(term138000, term138000.getClass(), "schemeSpecificPart", "John.Doe@example.com");
        setIntField(term138000, term138000.getClass(), "hash", 0);
        setField(term138000, term138000.getClass(), "decodedUserInfo", null);
        setField(term138000, term138000.getClass(), "decodedAuthority", null);
        setField(term138000, term138000.getClass(), "decodedPath", null);
        setField(term138000, term138000.getClass(), "decodedQuery", null);
        setField(term138000, term138000.getClass(), "decodedFragment", null);
        setField(term138000, term138000.getClass(), "decodedSchemeSpecificPart", null);
        setField(term138000, term138000.getClass(), "string", "mailto:John.Doe@example.com");
        setField(term137999, term137999.getClass(), "baseUri", term138000);
        setIntField(term137999, term137999.getClass(), "maxBytesToBuffer", 565000);
        term138063 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.PokeApiConfigurationProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term138063;
        callMethod(klass, "setMaxBytesToBuffer", argTypes, term137999, args);
    }

};


