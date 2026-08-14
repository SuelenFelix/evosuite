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

public class TreeUtils_TreeTableRow_setId_9979376553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80745;
     Object term80757;

    public TreeUtils_TreeTableRow_setId_9979376553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80745 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow"));
        Object term80746 = newInstance(Class.forName("java.lang.Object"));
        Object term80747 = newInstance(Class.forName("java.lang.Object"));
        Object[] term80748 = (Object[]) newArray("java.lang.Object", 8);
        Object term80749 = newInstance(Class.forName("java.lang.Object"));
        Object term80750 = newInstance(Class.forName("java.lang.Object"));
        Object term80751 = newInstance(Class.forName("java.lang.Object"));
        Object term80752 = newInstance(Class.forName("java.lang.Object"));
        Object term80753 = newInstance(Class.forName("java.lang.Object"));
        Object term80754 = newInstance(Class.forName("java.lang.Object"));
        Object term80755 = newInstance(Class.forName("java.lang.Object"));
        Object term80756 = newInstance(Class.forName("java.lang.Object"));
        setField(term80745, term80745.getClass(), "id", term80746);
        setField(term80745, term80745.getClass(), "parentId", term80747);
        setElement(term80748, 0, term80749);
        setElement(term80748, 1, term80750);
        setElement(term80748, 2, term80751);
        setElement(term80748, 3, term80752);
        setElement(term80748, 4, term80753);
        setElement(term80748, 5, term80754);
        setElement(term80748, 6, term80755);
        setElement(term80748, 7, term80756);
        setField(term80745, term80745.getClass(), "otherColumns", term80748);
        term80757 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term80757;
        callMethod(klass, "setId", argTypes, term80745, args);
    }

};


