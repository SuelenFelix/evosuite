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

public class MoveFlavorText_getLanguage_5938171423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5179;

    public MoveFlavorText_getLanguage_5938171423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5179 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveFlavorText"));
        Object term5192 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5217 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5179, term5179.getClass(), "flavorText", "KSJeYkkvpk");
        setField(term5192, term5192.getClass(), "name", "qUtkFGMNUV");
        setField(term5192, term5192.getClass(), "url", "mGRiYhnMcR");
        setField(term5179, term5179.getClass(), "language", term5192);
        setField(term5217, term5217.getClass(), "name", "NFlvfJCVPO");
        setField(term5217, term5217.getClass(), "url", "KarbTXFmUU");
        setField(term5179, term5179.getClass(), "versionGroup", term5217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveFlavorText");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguage", argTypes, term5179, args);
    }

};


