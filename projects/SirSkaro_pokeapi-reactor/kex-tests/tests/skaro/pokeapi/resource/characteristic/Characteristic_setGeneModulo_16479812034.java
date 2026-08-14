package skaro.pokeapi.resource.characteristic;

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
import static skaro.pokeapi.resource.characteristic.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;

public class Characteristic_setGeneModulo_16479812034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54;
     Object term71;

    public Characteristic_setGeneModulo_16479812034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term55 = new Integer(1048535127);
        Integer term57 = new Integer(-655067527);
        Integer term61 = new Integer(-6029667);
        Integer term63 = new Integer(-2068769794);
        Integer term65 = new Integer(-117576464);
        Integer term67 = new Integer(-1007160944);
        ArrayList term59 = new ArrayList();
        ((ArrayList) term59).add(term61);
        ((ArrayList) term59).add(term63);
        ((ArrayList) term59).add(term65);
        ((ArrayList) term59).add(term67);
        term54 = newInstance(Class.forName("skaro.pokeapi.resource.characteristic.Characteristic"));
        setField(term54, term54.getClass(), "id", term55);
        setField(term54, term54.getClass(), "geneModulo", term57);
        setField(term54, term54.getClass(), "possibleValues", term59);
        term71 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.characteristic.Characteristic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term71;
        callMethod(klass, "setGeneModulo", argTypes, term54, args);
    }

};


