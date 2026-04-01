package org.openRealmOfStars.gui.icons;

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
import static org.openRealmOfStars.gui.icons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class AnimatedImage_getFrame_19957876942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term734;
     Object term782;

    public AnimatedImage_getFrame_19957876942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term737 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term739 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term748 = newInstance(Class.forName("java.util.Hashtable"));
        setIntField(term737, term737.getClass(), "imageType", 114754804);
        setField(term737, term737.getClass(), "colorModel", null);
        setField(term739, term739.getClass(), "sampleModel", null);
        setField(term739, term739.getClass(), "dataBuffer", null);
        setIntField(term739, term739.getClass(), "minX", 1687361082);
        setIntField(term739, term739.getClass(), "minY", 584893196);
        setIntField(term739, term739.getClass(), "width", 497269071);
        setIntField(term739, term739.getClass(), "height", -1899301124);
        setIntField(term739, term739.getClass(), "sampleModelTranslateX", -1882480155);
        setIntField(term739, term739.getClass(), "sampleModelTranslateY", -1410220680);
        setIntField(term739, term739.getClass(), "numBands", 389427431);
        setIntField(term739, term739.getClass(), "numDataElements", -1945706126);
        setField(term739, term739.getClass(), "parent", null);
        setField(term737, term737.getClass(), "raster", term739);
        setField(term737, term737.getClass(), "osis", null);
        setField(term748, term748.getClass(), "table", null);
        setIntField(term748, term748.getClass(), "count", 1);
        setIntField(term748, term748.getClass(), "threshold", 8);
        setFloatField(term748, term748.getClass(), "loadFactor", 0.75F);
        setIntField(term748, term748.getClass(), "modCount", 1);
        setField(term748, term748.getClass(), "keySet", null);
        setField(term748, term748.getClass(), "entrySet", null);
        setField(term748, term748.getClass(), "values", null);
        setField(term737, term737.getClass(), "properties", term748);
        setFloatField(term737, term737.getClass(), "accelerationPriority", 0.6880585F);
        setField(term737, term737.getClass(), "surfaceManager", null);
        Object term754 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term756 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term765 = newInstance(Class.forName("java.util.Hashtable"));
        setIntField(term754, term754.getClass(), "imageType", -571169753);
        setField(term754, term754.getClass(), "colorModel", null);
        setField(term756, term756.getClass(), "sampleModel", null);
        setField(term756, term756.getClass(), "dataBuffer", null);
        setIntField(term756, term756.getClass(), "minX", 0);
        setIntField(term756, term756.getClass(), "minY", 0);
        setIntField(term756, term756.getClass(), "width", 0);
        setIntField(term756, term756.getClass(), "height", 0);
        setIntField(term756, term756.getClass(), "sampleModelTranslateX", 0);
        setIntField(term756, term756.getClass(), "sampleModelTranslateY", 0);
        setIntField(term756, term756.getClass(), "numBands", 0);
        setIntField(term756, term756.getClass(), "numDataElements", 0);
        setField(term756, term756.getClass(), "parent", null);
        setField(term754, term754.getClass(), "raster", term756);
        setField(term754, term754.getClass(), "osis", null);
        setField(term765, term765.getClass(), "table", null);
        setIntField(term765, term765.getClass(), "count", 1);
        setIntField(term765, term765.getClass(), "threshold", 8);
        setFloatField(term765, term765.getClass(), "loadFactor", 0.75F);
        setIntField(term765, term765.getClass(), "modCount", 1);
        setField(term765, term765.getClass(), "keySet", null);
        setField(term765, term765.getClass(), "entrySet", null);
        setField(term765, term765.getClass(), "values", null);
        setField(term754, term754.getClass(), "properties", term765);
        setFloatField(term754, term754.getClass(), "accelerationPriority", 0.0F);
        setField(term754, term754.getClass(), "surfaceManager", null);
        Object term771 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term771, term771.getClass(), "imageType", 0);
        setField(term771, term771.getClass(), "colorModel", null);
        setField(term771, term771.getClass(), "raster", null);
        setField(term771, term771.getClass(), "osis", null);
        setField(term771, term771.getClass(), "properties", null);
        setFloatField(term771, term771.getClass(), "accelerationPriority", 0.0F);
        setField(term771, term771.getClass(), "surfaceManager", null);
        Object term774 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term774, term774.getClass(), "imageType", 0);
        setField(term774, term774.getClass(), "colorModel", null);
        setField(term774, term774.getClass(), "raster", null);
        setField(term774, term774.getClass(), "osis", null);
        setField(term774, term774.getClass(), "properties", null);
        setFloatField(term774, term774.getClass(), "accelerationPriority", 0.0F);
        setField(term774, term774.getClass(), "surfaceManager", null);
        ArrayList term735 = new ArrayList();
        ((ArrayList) term735).add(term737);
        ((ArrayList) term735).add(term754);
        ((ArrayList) term735).add(term771);
        ((ArrayList) term735).add(term774);
        term734 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage"));
        setField(term734, term734.getClass(), "animations", term735);
        setIntField(term734, term734.getClass(), "frame", -165587447);
        setIntField(term734, term734.getClass(), "sizeX", -1347358701);
        setIntField(term734, term734.getClass(), "sizeY", 806595993);
        term782 = new Integer(548228925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term782;
        callMethod(klass, "getFrame", argTypes, term734, args);
    }

};


