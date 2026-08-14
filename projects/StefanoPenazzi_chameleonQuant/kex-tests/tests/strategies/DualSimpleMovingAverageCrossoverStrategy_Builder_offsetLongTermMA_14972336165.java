package strategies;

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
import static strategies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DualSimpleMovingAverageCrossoverStrategy_Builder_offsetLongTermMA_14972336165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11409;
     Object term11426;

    public DualSimpleMovingAverageCrossoverStrategy_Builder_offsetLongTermMA_14972336165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11409 = newInstance(Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term11409, term11409.getClass(), "ts", null);
        setIntField(term11409, term11409.getClass(), "lengthStma", -2131181468);
        setIntField(term11409, term11409.getClass(), "lengthLtma", 282916351);
        setField(term11409, term11409.getClass(), "source", "gCWtLVKVVe");
        setIntField(term11409, term11409.getClass(), "offsetStma", 880977281);
        setIntField(term11409, term11409.getClass(), "offsetLtma", 371943306);
        setField(term11409, term11409.getClass(), "ps", null);
        term11426 = new Integer(982388293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11426;
        callMethod(klass, "offsetLongTermMA", argTypes, term11409, args);
    }

};


