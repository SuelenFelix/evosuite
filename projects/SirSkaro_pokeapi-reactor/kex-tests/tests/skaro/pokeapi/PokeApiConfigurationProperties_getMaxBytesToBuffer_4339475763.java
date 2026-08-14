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

public class PokeApiConfigurationProperties_getMaxBytesToBuffer_4339475763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137830;

    public PokeApiConfigurationProperties_getMaxBytesToBuffer_4339475763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137830 = newInstance(Class.forName("skaro.pokeapi.PokeApiConfigurationProperties"));
        Object term137831 = newInstance(Class.forName("java.net.URI"));
        setField(term137831, term137831.getClass(), "scheme", "ftp");
        setField(term137831, term137831.getClass(), "fragment", null);
        setField(term137831, term137831.getClass(), "authority", "ftp.is.co.za");
        setField(term137831, term137831.getClass(), "userInfo", null);
        setField(term137831, term137831.getClass(), "host", "ftp.is.co.za");
        setIntField(term137831, term137831.getClass(), "port", -1);
        setField(term137831, term137831.getClass(), "path", "/rfc/rfc1808.txt");
        setField(term137831, term137831.getClass(), "query", null);
        setField(term137831, term137831.getClass(), "schemeSpecificPart", null);
        setIntField(term137831, term137831.getClass(), "hash", 0);
        setField(term137831, term137831.getClass(), "decodedUserInfo", null);
        setField(term137831, term137831.getClass(), "decodedAuthority", null);
        setField(term137831, term137831.getClass(), "decodedPath", null);
        setField(term137831, term137831.getClass(), "decodedQuery", null);
        setField(term137831, term137831.getClass(), "decodedFragment", null);
        setField(term137831, term137831.getClass(), "decodedSchemeSpecificPart", null);
        setField(term137831, term137831.getClass(), "string", "ftp://ftp.is.co.za/rfc/rfc1808.txt");
        setField(term137830, term137830.getClass(), "baseUri", term137831);
        setIntField(term137830, term137830.getClass(), "maxBytesToBuffer", 565000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.PokeApiConfigurationProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxBytesToBuffer", argTypes, term137830, args);
    }

};


