package org.openRealmOfStars.gui.panels;

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
import static org.openRealmOfStars.gui.panels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BigImagePanel_drawBoldText_12054257432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76075;
     Object term76084;
     Object term76101;
     Object term76103;

    public BigImagePanel_drawBoldText_12054257432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76075 = newInstance(Class.forName("java.awt.Color"));
        float[] term76077 = (float[]) newFloatArray(0);
        float[] term76078 = (float[]) newFloatArray(4);
        setIntField(term76075, term76075.getClass(), "value", 1906067765);
        setField(term76075, term76075.getClass(), "frgbvalue", term76077);
        setFloatElement(term76078, 0, 0.24959576F);
        setFloatElement(term76078, 1, 0.43337202F);
        setFloatElement(term76078, 2, 0.34331435F);
        setFloatElement(term76078, 3, 0.13246995F);
        setField(term76075, term76075.getClass(), "fvalue", term76078);
        setFloatField(term76075, term76075.getClass(), "falpha", 0.012435675F);
        setField(term76075, term76075.getClass(), "cs", null);
        term76084 = newInstance(Class.forName("java.awt.Color"));
        float[] term76086 = (float[]) newFloatArray(9);
        float[] term76096 = (float[]) newFloatArray(3);
        setIntField(term76084, term76084.getClass(), "value", -1141978353);
        setFloatElement(term76086, 0, 0.912685F);
        setFloatElement(term76086, 1, 0.25778466F);
        setFloatElement(term76086, 2, 0.11179066F);
        setFloatElement(term76086, 3, 0.9205692F);
        setFloatElement(term76086, 4, 0.5306474F);
        setFloatElement(term76086, 5, 0.12532318F);
        setFloatElement(term76086, 6, 0.022483587F);
        setFloatElement(term76086, 7, 0.9200632F);
        setFloatElement(term76086, 8, 0.025133014F);
        setField(term76084, term76084.getClass(), "frgbvalue", term76086);
        setFloatElement(term76096, 0, 0.5428452F);
        setFloatElement(term76096, 1, 0.016575277F);
        setFloatElement(term76096, 2, 0.27994657F);
        setField(term76084, term76084.getClass(), "fvalue", term76096);
        setFloatField(term76084, term76084.getClass(), "falpha", 0.53083503F);
        setField(term76084, term76084.getClass(), "cs", null);
        term76101 = new Integer(1877297875);
        term76103 = new Integer(-614739795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.awt.Graphics");
        argTypes[1] = Class.forName("java.awt.Color");
        argTypes[2] = Class.forName("java.awt.Color");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term76075;
        args[2] = term76084;
        args[3] = term76101;
        args[4] = term76103;
        args[5] = "ypytdNbrBc";
        callMethod(klass, "drawBoldText", argTypes, null, args);
    }

};


