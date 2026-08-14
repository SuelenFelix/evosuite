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

public class MoveFlavorText_setFlavorText_18631865472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5044;

    public MoveFlavorText_setFlavorText_18631865472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5044 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveFlavorText"));
        Object term5057 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5082 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5044, term5044.getClass(), "flavorText", "HpZXWDPhlg");
        setField(term5057, term5057.getClass(), "name", "lBOokzEPfe");
        setField(term5057, term5057.getClass(), "url", "dtGZCsKXbW");
        setField(term5044, term5044.getClass(), "language", term5057);
        setField(term5082, term5082.getClass(), "name", "bdyhHbDAmJ");
        setField(term5082, term5082.getClass(), "url", "BBXiTNHqGE");
        setField(term5044, term5044.getClass(), "versionGroup", term5082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveFlavorText");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IEYhJmgCVd";
        callMethod(klass, "setFlavorText", argTypes, term5044, args);
    }

};


