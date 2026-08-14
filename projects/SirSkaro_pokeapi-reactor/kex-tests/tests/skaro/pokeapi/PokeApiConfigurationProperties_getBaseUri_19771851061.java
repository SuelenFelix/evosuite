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

public class PokeApiConfigurationProperties_getBaseUri_19771851061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137425;

    public PokeApiConfigurationProperties_getBaseUri_19771851061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137425 = newInstance(Class.forName("skaro.pokeapi.PokeApiConfigurationProperties"));
        Object term137426 = newInstance(Class.forName("java.net.URI"));
        setField(term137426, term137426.getClass(), "scheme", "telnet");
        setField(term137426, term137426.getClass(), "fragment", null);
        setField(term137426, term137426.getClass(), "authority", "192.0.2.16:80");
        setField(term137426, term137426.getClass(), "userInfo", null);
        setField(term137426, term137426.getClass(), "host", "192.0.2.16");
        setIntField(term137426, term137426.getClass(), "port", 80);
        setField(term137426, term137426.getClass(), "path", "/");
        setField(term137426, term137426.getClass(), "query", null);
        setField(term137426, term137426.getClass(), "schemeSpecificPart", null);
        setIntField(term137426, term137426.getClass(), "hash", 0);
        setField(term137426, term137426.getClass(), "decodedUserInfo", null);
        setField(term137426, term137426.getClass(), "decodedAuthority", null);
        setField(term137426, term137426.getClass(), "decodedPath", null);
        setField(term137426, term137426.getClass(), "decodedQuery", null);
        setField(term137426, term137426.getClass(), "decodedFragment", null);
        setField(term137426, term137426.getClass(), "decodedSchemeSpecificPart", null);
        setField(term137426, term137426.getClass(), "string", "telnet://192.0.2.16:80/");
        setField(term137425, term137425.getClass(), "baseUri", term137426);
        setIntField(term137425, term137425.getClass(), "maxBytesToBuffer", 565000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.PokeApiConfigurationProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseUri", argTypes, term137425, args);
    }

};


