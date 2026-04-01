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
import java.lang.Integer;

public class TreeTableModel_insertChildNodesToModel_41266214463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99255;
     Object term99257;
     Object term99259;

    public TreeTableModel_insertChildNodesToModel_41266214463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99255 = (int[]) newIntArray(1);
        setIntElement(term99255, 0, -1367122405);
        term99257 = new Integer(-1703625118);
        term99259 = new Integer(1104108112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term99255;
        args[2] = term99257;
        args[3] = term99259;
        callMethod(klass, "insertChildNodesToModel", argTypes, null, args);
    }

};


