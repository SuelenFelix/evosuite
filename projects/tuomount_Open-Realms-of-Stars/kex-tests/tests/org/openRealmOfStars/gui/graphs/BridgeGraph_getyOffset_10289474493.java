package org.openRealmOfStars.gui.graphs;

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
import static org.openRealmOfStars.gui.graphs.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BridgeGraph_getyOffset_10289474493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175;

    public BridgeGraph_getyOffset_10289474493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175 = newInstance(Class.forName("org.openRealmOfStars.gui.graphs.BridgeGraph"));
        Object term176 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term178 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term187 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term196 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term205 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term206 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term207 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term176, term176.getClass(), "imageType", 679763016);
        setField(term176, term176.getClass(), "colorModel", null);
        setField(term178, term178.getClass(), "sampleModel", null);
        setField(term178, term178.getClass(), "dataBuffer", null);
        setIntField(term178, term178.getClass(), "minX", 1962444399);
        setIntField(term178, term178.getClass(), "minY", 767834723);
        setIntField(term178, term178.getClass(), "width", -602026508);
        setIntField(term178, term178.getClass(), "height", -157887805);
        setIntField(term178, term178.getClass(), "sampleModelTranslateX", 1876565163);
        setIntField(term178, term178.getClass(), "sampleModelTranslateY", -817164822);
        setIntField(term178, term178.getClass(), "numBands", -1016503459);
        setIntField(term178, term178.getClass(), "numDataElements", -1968847291);
        setField(term187, term187.getClass(), "sampleModel", null);
        setField(term187, term187.getClass(), "dataBuffer", null);
        setIntField(term187, term187.getClass(), "minX", 579005622);
        setIntField(term187, term187.getClass(), "minY", -14890619);
        setIntField(term187, term187.getClass(), "width", 1632125673);
        setIntField(term187, term187.getClass(), "height", 454281060);
        setIntField(term187, term187.getClass(), "sampleModelTranslateX", -1786399638);
        setIntField(term187, term187.getClass(), "sampleModelTranslateY", 2055867847);
        setIntField(term187, term187.getClass(), "numBands", -1048298087);
        setIntField(term187, term187.getClass(), "numDataElements", 292681826);
        setField(term196, term196.getClass(), "sampleModel", null);
        setField(term196, term196.getClass(), "dataBuffer", null);
        setIntField(term196, term196.getClass(), "minX", 0);
        setIntField(term196, term196.getClass(), "minY", 0);
        setIntField(term196, term196.getClass(), "width", 0);
        setIntField(term196, term196.getClass(), "height", 0);
        setIntField(term196, term196.getClass(), "sampleModelTranslateX", 0);
        setIntField(term196, term196.getClass(), "sampleModelTranslateY", 0);
        setIntField(term196, term196.getClass(), "numBands", 0);
        setIntField(term196, term196.getClass(), "numDataElements", 0);
        setField(term196, term196.getClass(), "parent", null);
        setField(term187, term187.getClass(), "parent", term196);
        setField(term178, term178.getClass(), "parent", term187);
        setField(term176, term176.getClass(), "raster", term178);
        setField(term176, term176.getClass(), "osis", null);
        setIntField(term207, term207.getClass(), "hash", 1755263599);
        setField(term207, term207.getClass(), "key", null);
        setField(term207, term207.getClass(), "value", null);
        setField(term207, term207.getClass(), "next", null);
        setElement(term206, 1, term207);
        setField(term205, term205.getClass(), "table", term206);
        setIntField(term205, term205.getClass(), "count", 1);
        setIntField(term205, term205.getClass(), "threshold", 8);
        setFloatField(term205, term205.getClass(), "loadFactor", 0.75F);
        setIntField(term205, term205.getClass(), "modCount", 1);
        setField(term205, term205.getClass(), "keySet", null);
        setField(term205, term205.getClass(), "entrySet", null);
        setField(term205, term205.getClass(), "values", null);
        setField(term176, term176.getClass(), "properties", term205);
        setFloatField(term176, term176.getClass(), "accelerationPriority", 0.3455959F);
        setField(term176, term176.getClass(), "surfaceManager", null);
        setField(term175, term175.getClass(), "bridgeImage", term176);
        setIntField(term175, term175.getClass(), "yOffset", -184153539);
        setField(term175, term175.getClass(), "name", "MjGYSRKTNF");
        setBooleanField(term175, term175.getClass(), "customImage", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.graphs.BridgeGraph");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getyOffset", argTypes, term175, args);
    }

};


