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
import java.util.LinkedList;
import java.lang.Object;

public class TreeTableModel_buildVisibleChildren_1452955749132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99399;

    public TreeTableModel_buildVisibleChildren_1452955749132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99399 = new LinkedList();
        ((LinkedList) term99399).add((Object)null);
        ((LinkedList) term99399).add((Object)null);
        ((LinkedList) term99399).add((Object)null);
        ((LinkedList) term99399).add((Object)null);
        ((LinkedList) term99399).add((Object)null);
        ((LinkedList) term99399).add((Object)null);
        ((LinkedList) term99399).add((Object)null);
        ((LinkedList) term99399).add((Object)null);
        ((LinkedList) term99399).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term99399;
        callMethod(klass, "buildVisibleChildren", argTypes, null, args);
    }

};


