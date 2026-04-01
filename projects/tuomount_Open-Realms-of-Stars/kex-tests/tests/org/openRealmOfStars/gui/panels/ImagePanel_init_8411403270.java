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
import java.lang.Object;

public class ImagePanel_init_8411403270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10510;

    public ImagePanel_init_8411403270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10510 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term10512 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term10521 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term10530 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term10539 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term10540 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term10541 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term10544 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term10510, term10510.getClass(), "imageType", -1111249833);
        setField(term10510, term10510.getClass(), "colorModel", null);
        setField(term10512, term10512.getClass(), "sampleModel", null);
        setField(term10512, term10512.getClass(), "dataBuffer", null);
        setIntField(term10512, term10512.getClass(), "minX", -1692331299);
        setIntField(term10512, term10512.getClass(), "minY", 479531250);
        setIntField(term10512, term10512.getClass(), "width", 1320570890);
        setIntField(term10512, term10512.getClass(), "height", -130649791);
        setIntField(term10512, term10512.getClass(), "sampleModelTranslateX", 534834644);
        setIntField(term10512, term10512.getClass(), "sampleModelTranslateY", 1959097203);
        setIntField(term10512, term10512.getClass(), "numBands", -209654048);
        setIntField(term10512, term10512.getClass(), "numDataElements", 477625804);
        setField(term10521, term10521.getClass(), "sampleModel", null);
        setField(term10521, term10521.getClass(), "dataBuffer", null);
        setIntField(term10521, term10521.getClass(), "minX", 252575029);
        setIntField(term10521, term10521.getClass(), "minY", 57189932);
        setIntField(term10521, term10521.getClass(), "width", 1460722225);
        setIntField(term10521, term10521.getClass(), "height", 1743224434);
        setIntField(term10521, term10521.getClass(), "sampleModelTranslateX", 842904495);
        setIntField(term10521, term10521.getClass(), "sampleModelTranslateY", 1008080511);
        setIntField(term10521, term10521.getClass(), "numBands", 1935707624);
        setIntField(term10521, term10521.getClass(), "numDataElements", 1507074215);
        setField(term10530, term10530.getClass(), "sampleModel", null);
        setField(term10530, term10530.getClass(), "dataBuffer", null);
        setIntField(term10530, term10530.getClass(), "minX", 0);
        setIntField(term10530, term10530.getClass(), "minY", 0);
        setIntField(term10530, term10530.getClass(), "width", 0);
        setIntField(term10530, term10530.getClass(), "height", 0);
        setIntField(term10530, term10530.getClass(), "sampleModelTranslateX", 0);
        setIntField(term10530, term10530.getClass(), "sampleModelTranslateY", 0);
        setIntField(term10530, term10530.getClass(), "numBands", 0);
        setIntField(term10530, term10530.getClass(), "numDataElements", 0);
        setField(term10530, term10530.getClass(), "parent", null);
        setField(term10521, term10521.getClass(), "parent", term10530);
        setField(term10512, term10512.getClass(), "parent", term10521);
        setField(term10510, term10510.getClass(), "raster", term10512);
        setField(term10510, term10510.getClass(), "osis", null);
        setIntField(term10541, term10541.getClass(), "hash", -679946570);
        setField(term10541, term10541.getClass(), "key", "");
        setField(term10541, term10541.getClass(), "value", term10544);
        setField(term10541, term10541.getClass(), "next", null);
        setElement(term10540, 7, term10541);
        setField(term10539, term10539.getClass(), "table", term10540);
        setIntField(term10539, term10539.getClass(), "count", 1);
        setIntField(term10539, term10539.getClass(), "threshold", 8);
        setFloatField(term10539, term10539.getClass(), "loadFactor", 0.75F);
        setIntField(term10539, term10539.getClass(), "modCount", 1);
        setField(term10539, term10539.getClass(), "keySet", null);
        setField(term10539, term10539.getClass(), "entrySet", null);
        setField(term10539, term10539.getClass(), "values", null);
        setField(term10510, term10510.getClass(), "properties", term10539);
        setFloatField(term10510, term10510.getClass(), "accelerationPriority", 0.8783184F);
        setField(term10510, term10510.getClass(), "surfaceManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = term10510;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


