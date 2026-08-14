package skaro.pokeapi.resource.contesttype;

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
import static skaro.pokeapi.resource.contesttype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class ContestType_getNames_6889369167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1241;

    public ContestType_getNames_6889369167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1242 = new Integer(-2038273078);
        Object term1283 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term1286 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1283, term1283.getClass(), "name", "");
        setField(term1283, term1283.getClass(), "color", "");
        setField(term1286, term1286.getClass(), "name", null);
        setField(term1286, term1286.getClass(), "url", null);
        setField(term1283, term1283.getClass(), "language", term1286);
        Object term1287 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term1290 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1287, term1287.getClass(), "name", "");
        setField(term1287, term1287.getClass(), "color", "");
        setField(term1290, term1290.getClass(), "name", null);
        setField(term1290, term1290.getClass(), "url", null);
        setField(term1287, term1287.getClass(), "language", term1290);
        ArrayList term1281 = new ArrayList();
        ((ArrayList) term1281).add(term1283);
        ((ArrayList) term1281).add(term1287);
        term1241 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestType"));
        Object term1256 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1241, term1241.getClass(), "id", term1242);
        setField(term1241, term1241.getClass(), "name", "EeBVbzjcCI");
        setField(term1256, term1256.getClass(), "name", "UfQtPRyWRC");
        setField(term1256, term1256.getClass(), "url", "FPvxVzzSvD");
        setField(term1241, term1241.getClass(), "berryFlavor", term1256);
        setField(term1241, term1241.getClass(), "names", term1281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesttype.ContestType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term1241, args);
    }

};


