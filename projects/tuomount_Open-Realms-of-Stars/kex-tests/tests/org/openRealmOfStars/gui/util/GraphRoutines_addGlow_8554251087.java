package org.openRealmOfStars.gui.util;

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
import static org.openRealmOfStars.gui.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GraphRoutines_addGlow_8554251087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2736;

    public GraphRoutines_addGlow_8554251087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2736 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2738 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term2747 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2756 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term2765 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2766 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2767 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2770 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2736, term2736.getClass(), "imageType", -525257914);
        setField(term2736, term2736.getClass(), "colorModel", null);
        setField(term2738, term2738.getClass(), "sampleModel", null);
        setField(term2738, term2738.getClass(), "dataBuffer", null);
        setIntField(term2738, term2738.getClass(), "minX", 147209682);
        setIntField(term2738, term2738.getClass(), "minY", 34470066);
        setIntField(term2738, term2738.getClass(), "width", 2058711405);
        setIntField(term2738, term2738.getClass(), "height", 1743683601);
        setIntField(term2738, term2738.getClass(), "sampleModelTranslateX", -945116798);
        setIntField(term2738, term2738.getClass(), "sampleModelTranslateY", 1593461795);
        setIntField(term2738, term2738.getClass(), "numBands", 515182546);
        setIntField(term2738, term2738.getClass(), "numDataElements", -936895502);
        setField(term2747, term2747.getClass(), "sampleModel", null);
        setField(term2747, term2747.getClass(), "dataBuffer", null);
        setIntField(term2747, term2747.getClass(), "minX", -129547140);
        setIntField(term2747, term2747.getClass(), "minY", 199287428);
        setIntField(term2747, term2747.getClass(), "width", -1195339592);
        setIntField(term2747, term2747.getClass(), "height", -376422566);
        setIntField(term2747, term2747.getClass(), "sampleModelTranslateX", 306847454);
        setIntField(term2747, term2747.getClass(), "sampleModelTranslateY", 1745276158);
        setIntField(term2747, term2747.getClass(), "numBands", 2009020256);
        setIntField(term2747, term2747.getClass(), "numDataElements", 2049577015);
        setField(term2756, term2756.getClass(), "sampleModel", null);
        setField(term2756, term2756.getClass(), "dataBuffer", null);
        setIntField(term2756, term2756.getClass(), "minX", 0);
        setIntField(term2756, term2756.getClass(), "minY", 0);
        setIntField(term2756, term2756.getClass(), "width", 0);
        setIntField(term2756, term2756.getClass(), "height", 0);
        setIntField(term2756, term2756.getClass(), "sampleModelTranslateX", 0);
        setIntField(term2756, term2756.getClass(), "sampleModelTranslateY", 0);
        setIntField(term2756, term2756.getClass(), "numBands", 0);
        setIntField(term2756, term2756.getClass(), "numDataElements", 0);
        setField(term2756, term2756.getClass(), "parent", null);
        setField(term2747, term2747.getClass(), "parent", term2756);
        setField(term2738, term2738.getClass(), "parent", term2747);
        setField(term2736, term2736.getClass(), "raster", term2738);
        setField(term2736, term2736.getClass(), "osis", null);
        setIntField(term2767, term2767.getClass(), "hash", -1117847647);
        setField(term2767, term2767.getClass(), "key", "");
        setField(term2767, term2767.getClass(), "value", term2770);
        setField(term2767, term2767.getClass(), "next", null);
        setElement(term2766, 9, term2767);
        setField(term2765, term2765.getClass(), "table", term2766);
        setIntField(term2765, term2765.getClass(), "count", 1);
        setIntField(term2765, term2765.getClass(), "threshold", 8);
        setFloatField(term2765, term2765.getClass(), "loadFactor", 0.75F);
        setIntField(term2765, term2765.getClass(), "modCount", 1);
        setField(term2765, term2765.getClass(), "keySet", null);
        setField(term2765, term2765.getClass(), "entrySet", null);
        setField(term2765, term2765.getClass(), "values", null);
        setField(term2736, term2736.getClass(), "properties", term2765);
        setFloatField(term2736, term2736.getClass(), "accelerationPriority", 0.6608425F);
        setField(term2736, term2736.getClass(), "surfaceManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GraphRoutines");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = term2736;
        callMethod(klass, "addGlow", argTypes, null, args);
    }

};


