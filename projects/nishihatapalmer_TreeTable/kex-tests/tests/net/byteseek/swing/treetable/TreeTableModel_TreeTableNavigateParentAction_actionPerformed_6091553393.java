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

public class TreeTableModel_TreeTableNavigateParentAction_actionPerformed_6091553393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80882;

    public TreeTableModel_TreeTableNavigateParentAction_actionPerformed_6091553393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80882 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableNavigateParentAction"));
        setField(term80882, term80882.getClass(), "this$0", null);
        setBooleanField(term80882, term80882.getClass(), "enabled", false);
        setField(term80882, term80882.getClass(), "arrayTable", null);
        setField(term80882, term80882.getClass(), "changeSupport", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableNavigateParentAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "actionPerformed", argTypes, term80882, args);
    }

};


