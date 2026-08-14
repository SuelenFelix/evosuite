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

public class PokeApiConfigurationProperties_setBaseUri_13582112662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137546;
     Object term137610;

    public PokeApiConfigurationProperties_setBaseUri_13582112662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137546 = newInstance(Class.forName("skaro.pokeapi.PokeApiConfigurationProperties"));
        Object term137547 = newInstance(Class.forName("java.net.URI"));
        setField(term137547, term137547.getClass(), "scheme", "mailto");
        setField(term137547, term137547.getClass(), "fragment", null);
        setField(term137547, term137547.getClass(), "authority", null);
        setField(term137547, term137547.getClass(), "userInfo", null);
        setField(term137547, term137547.getClass(), "host", null);
        setIntField(term137547, term137547.getClass(), "port", -1);
        setField(term137547, term137547.getClass(), "path", null);
        setField(term137547, term137547.getClass(), "query", null);
        setField(term137547, term137547.getClass(), "schemeSpecificPart", "John.Doe@example.com");
        setIntField(term137547, term137547.getClass(), "hash", 0);
        setField(term137547, term137547.getClass(), "decodedUserInfo", null);
        setField(term137547, term137547.getClass(), "decodedAuthority", null);
        setField(term137547, term137547.getClass(), "decodedPath", null);
        setField(term137547, term137547.getClass(), "decodedQuery", null);
        setField(term137547, term137547.getClass(), "decodedFragment", null);
        setField(term137547, term137547.getClass(), "decodedSchemeSpecificPart", null);
        setField(term137547, term137547.getClass(), "string", "mailto:John.Doe@example.com");
        setField(term137546, term137546.getClass(), "baseUri", term137547);
        setIntField(term137546, term137546.getClass(), "maxBytesToBuffer", 565000);
        term137610 = newInstance(Class.forName("java.net.URI"));
        setField(term137610, term137610.getClass(), "scheme", "ftp");
        setField(term137610, term137610.getClass(), "fragment", null);
        setField(term137610, term137610.getClass(), "authority", "ftp.is.co.za");
        setField(term137610, term137610.getClass(), "userInfo", null);
        setField(term137610, term137610.getClass(), "host", "ftp.is.co.za");
        setIntField(term137610, term137610.getClass(), "port", -1);
        setField(term137610, term137610.getClass(), "path", "/rfc/rfc1808.txt");
        setField(term137610, term137610.getClass(), "query", null);
        setField(term137610, term137610.getClass(), "schemeSpecificPart", null);
        setIntField(term137610, term137610.getClass(), "hash", 0);
        setField(term137610, term137610.getClass(), "decodedUserInfo", null);
        setField(term137610, term137610.getClass(), "decodedAuthority", null);
        setField(term137610, term137610.getClass(), "decodedPath", null);
        setField(term137610, term137610.getClass(), "decodedQuery", null);
        setField(term137610, term137610.getClass(), "decodedFragment", null);
        setField(term137610, term137610.getClass(), "decodedSchemeSpecificPart", null);
        setField(term137610, term137610.getClass(), "string", "ftp://ftp.is.co.za/rfc/rfc1808.txt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.PokeApiConfigurationProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URI");
        Object[] args = new Object[1];
        args[0] = term137610;
        callMethod(klass, "setBaseUri", argTypes, term137546, args);
    }

};


