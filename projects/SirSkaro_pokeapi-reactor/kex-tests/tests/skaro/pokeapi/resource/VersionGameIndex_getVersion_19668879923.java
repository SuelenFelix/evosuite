package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class VersionGameIndex_getVersion_19668879923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135520;

    public VersionGameIndex_getVersion_19668879923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term135521 = new Integer(-1780849406);
        term135520 = newInstance(Class.forName("skaro.pokeapi.resource.VersionGameIndex"));
        Object term135523 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term135520, term135520.getClass(), "gameIndex", term135521);
        setField(term135523, term135523.getClass(), "name", "JWfpkVbPeH");
        setField(term135523, term135523.getClass(), "url", "uNjHrzHDTX");
        setField(term135520, term135520.getClass(), "version", term135523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VersionGameIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term135520, args);
    }

};


