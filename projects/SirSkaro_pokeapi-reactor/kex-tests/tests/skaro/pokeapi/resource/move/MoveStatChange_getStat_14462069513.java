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
import java.lang.Integer;
import java.lang.Object;

public class MoveStatChange_getStat_14462069513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4786;

    public MoveStatChange_getStat_14462069513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4787 = new Integer(579006268);
        term4786 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveStatChange"));
        Object term4789 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4786, term4786.getClass(), "change", term4787);
        setField(term4789, term4789.getClass(), "name", "AWYyZiNfsm");
        setField(term4789, term4789.getClass(), "url", "ITRRYiuDwH");
        setField(term4786, term4786.getClass(), "stat", term4789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveStatChange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStat", argTypes, term4786, args);
    }

};


