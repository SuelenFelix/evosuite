package skaro.pokeapi.resource.machine;

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
import static skaro.pokeapi.resource.machine.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Machine_setVersionGroup_5586026728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1059;
     Object term1137;

    public Machine_setVersionGroup_5586026728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1060 = new Integer(1227103734);
        term1059 = newInstance(Class.forName("skaro.pokeapi.resource.machine.Machine"));
        Object term1062 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1087 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1112 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1059, term1059.getClass(), "id", term1060);
        setField(term1062, term1062.getClass(), "name", "nGKItKLYNC");
        setField(term1062, term1062.getClass(), "url", "UiUYnPrcCi");
        setField(term1059, term1059.getClass(), "item", term1062);
        setField(term1087, term1087.getClass(), "name", "UoYtihxVaS");
        setField(term1087, term1087.getClass(), "url", "JDswTTCZHV");
        setField(term1059, term1059.getClass(), "move", term1087);
        setField(term1112, term1112.getClass(), "name", "onpbIeEKoi");
        setField(term1112, term1112.getClass(), "url", "YRHGsAkhxb");
        setField(term1059, term1059.getClass(), "versionGroup", term1112);
        term1137 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1137, term1137.getClass(), "name", "ytSBIKXogI");
        setField(term1137, term1137.getClass(), "url", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.machine.Machine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term1137;
        callMethod(klass, "setVersionGroup", argTypes, term1059, args);
    }

};


