package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class AdjacencyMatrixGraph_removeEdge_15387219862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578;
     Object term611;
     Object term613;

    public AdjacencyMatrixGraph_removeEdge_15387219862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term578 = newInstance(Class.forName("util.AdjacencyMatrixGraph"));
        Object[] term579 = (Object[]) newArray("[I", 7);
        int[] term580 = (int[]) newIntArray(1);
        int[] term582 = (int[]) newIntArray(6);
        int[] term589 = (int[]) newIntArray(5);
        int[] term595 = (int[]) newIntArray(5);
        int[] term601 = (int[]) newIntArray(2);
        int[] term604 = (int[]) newIntArray(3);
        int[] term608 = (int[]) newIntArray(1);
        setIntElement(term580, 0, -2104981311);
        setElement(term579, 0, term580);
        setIntElement(term582, 0, -571169753);
        setIntElement(term582, 1, 318591690);
        setIntElement(term582, 2, -165587447);
        setIntElement(term582, 3, -1347358701);
        setIntElement(term582, 4, 806595993);
        setIntElement(term582, 5, 548228925);
        setElement(term579, 1, term582);
        setIntElement(term589, 0, -749861210);
        setIntElement(term589, 1, 1694224101);
        setIntElement(term589, 2, 937859191);
        setIntElement(term589, 3, -916584829);
        setIntElement(term589, 4, -2131181468);
        setElement(term579, 2, term589);
        setIntElement(term595, 0, 282916351);
        setIntElement(term595, 1, 880977281);
        setIntElement(term595, 2, 371943306);
        setIntElement(term595, 3, 982388293);
        setIntElement(term595, 4, -159494544);
        setElement(term579, 3, term595);
        setIntElement(term601, 0, -75206835);
        setIntElement(term601, 1, -1618206977);
        setElement(term579, 4, term601);
        setIntElement(term604, 0, -1747406163);
        setIntElement(term604, 1, 388157121);
        setIntElement(term604, 2, 1684998508);
        setElement(term579, 5, term604);
        setIntElement(term608, 0, -1476644457);
        setElement(term579, 6, term608);
        setField(term578, term578.getClass(), "adjMatrix", term579);
        setIntField(term578, term578.getClass(), "numVertices", 1270666529);
        term611 = new Integer(-1146679443);
        term613 = new Integer(-860131894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.AdjacencyMatrixGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term611;
        args[1] = term613;
        callMethod(klass, "removeEdge", argTypes, term578, args);
    }

};


