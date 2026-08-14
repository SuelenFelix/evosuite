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
import java.lang.Integer;

public class TreeTableHeaderRenderer_SortIconBorder_paintBorder_4541745272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117713;
     Object term117719;
     Object term117721;
     Object term117723;
     Object term117725;

    public TreeTableHeaderRenderer_SortIconBorder_paintBorder_4541745272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117713 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer$SortIconBorder"));
        Object term117714 = newInstance(Class.forName("java.awt.Insets"));
        setIntField(term117714, term117714.getClass(), "top", 1921465988);
        setIntField(term117714, term117714.getClass(), "left", -164438599);
        setIntField(term117714, term117714.getClass(), "bottom", -444441955);
        setIntField(term117714, term117714.getClass(), "right", -544005591);
        setField(term117713, term117713.getClass(), "insets", term117714);
        setField(term117713, term117713.getClass(), "this$0", null);
        term117719 = new Integer(-1379603462);
        term117721 = new Integer(-1304965721);
        term117723 = new Integer(1661411651);
        term117725 = new Integer(175517901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer$SortIconBorder");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.awt.Component");
        argTypes[1] = Class.forName("java.awt.Graphics");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term117719;
        args[3] = term117721;
        args[4] = term117723;
        args[5] = term117725;
        callMethod(klass, "paintBorder", argTypes, term117713, args);
    }

};


