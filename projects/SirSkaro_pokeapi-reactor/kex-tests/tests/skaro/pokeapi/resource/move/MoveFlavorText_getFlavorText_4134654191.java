package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MoveFlavorText_getFlavorText_4134654191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4931;

    public MoveFlavorText_getFlavorText_4134654191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4931 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveFlavorText"));
        Object term4944 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4969 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4931, term4931.getClass(), "flavorText", "RSaoipUlsg");
        setField(term4944, term4944.getClass(), "name", "cSHGbqKqlN");
        setField(term4944, term4944.getClass(), "url", "pFAfANnxup");
        setField(term4931, term4931.getClass(), "language", term4944);
        setField(term4969, term4969.getClass(), "name", "FbSIUZyBXZ");
        setField(term4969, term4969.getClass(), "url", "mhQDwIyrRi");
        setField(term4931, term4931.getClass(), "versionGroup", term4969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveFlavorText");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlavorText", argTypes, term4931, args);
    }

};


