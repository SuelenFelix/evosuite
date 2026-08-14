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

public class MoveStatChange_setChange_13466650042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4736;
     Object term4764;

    public MoveStatChange_setChange_13466650042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4737 = new Integer(-1404350380);
        term4736 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveStatChange"));
        Object term4739 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4736, term4736.getClass(), "change", term4737);
        setField(term4739, term4739.getClass(), "name", "GNEmuHPNcU");
        setField(term4739, term4739.getClass(), "url", "IoSfuKDFRe");
        setField(term4736, term4736.getClass(), "stat", term4739);
        term4764 = new Integer(-2013924238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveStatChange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4764;
        callMethod(klass, "setChange", argTypes, term4736, args);
    }

};


