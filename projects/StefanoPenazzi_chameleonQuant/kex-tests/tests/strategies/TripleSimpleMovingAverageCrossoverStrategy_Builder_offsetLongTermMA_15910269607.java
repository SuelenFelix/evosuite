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

public class TripleSimpleMovingAverageCrossoverStrategy_Builder_offsetLongTermMA_15910269607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8654;
     Object term8674;

    public TripleSimpleMovingAverageCrossoverStrategy_Builder_offsetLongTermMA_15910269607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8654 = newInstance(Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term8654, term8654.getClass(), "ts", null);
        setIntField(term8654, term8654.getClass(), "lengthStma", 480137250);
        setIntField(term8654, term8654.getClass(), "lengthMtma", -341152642);
        setIntField(term8654, term8654.getClass(), "lengthLtma", -2015854073);
        setField(term8654, term8654.getClass(), "source", "qxSDVejjiY");
        setIntField(term8654, term8654.getClass(), "offsetStma", 538259104);
        setIntField(term8654, term8654.getClass(), "offsetMtma", 96566506);
        setIntField(term8654, term8654.getClass(), "offsetLtma", -343325701);
        setField(term8654, term8654.getClass(), "ps", null);
        setDoubleField(term8654, term8654.getClass(), "targetRange", 0.9006361024877096);
        term8674 = new Integer(107945604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8674;
        callMethod(klass, "offsetLongTermMA", argTypes, term8654, args);
    }

};


