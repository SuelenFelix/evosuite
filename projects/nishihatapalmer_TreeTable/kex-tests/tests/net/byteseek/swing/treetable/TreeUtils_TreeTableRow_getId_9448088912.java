package net.byteseek.swing.treetable;

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
import static net.byteseek.swing.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TreeUtils_TreeTableRow_getId_9448088912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81422;

    public TreeUtils_TreeTableRow_getId_9448088912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81422 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow"));
        Object term81423 = newInstance(Class.forName("java.lang.Object"));
        Object term81424 = newInstance(Class.forName("java.lang.Object"));
        Object[] term81425 = (Object[]) newArray("java.lang.Object", 7);
        Object term81426 = newInstance(Class.forName("java.lang.Object"));
        Object term81427 = newInstance(Class.forName("java.lang.Object"));
        Object term81428 = newInstance(Class.forName("java.lang.Object"));
        Object term81429 = newInstance(Class.forName("java.lang.Object"));
        Object term81430 = newInstance(Class.forName("java.lang.Object"));
        Object term81431 = newInstance(Class.forName("java.lang.Object"));
        Object term81432 = newInstance(Class.forName("java.lang.Object"));
        setField(term81422, term81422.getClass(), "id", term81423);
        setField(term81422, term81422.getClass(), "parentId", term81424);
        setElement(term81425, 0, term81426);
        setElement(term81425, 1, term81427);
        setElement(term81425, 2, term81428);
        setElement(term81425, 3, term81429);
        setElement(term81425, 4, term81430);
        setElement(term81425, 5, term81431);
        setElement(term81425, 6, term81432);
        setField(term81422, term81422.getClass(), "otherColumns", term81425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term81422, args);
    }

};


