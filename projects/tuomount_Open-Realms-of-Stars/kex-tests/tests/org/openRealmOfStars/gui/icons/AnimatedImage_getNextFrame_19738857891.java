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

public class AnimatedImage_getNextFrame_19738857891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683;

    public AnimatedImage_getNextFrame_19738857891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term686 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term688 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term697 = newInstance(Class.forName("java.util.Hashtable"));
        setIntField(term686, term686.getClass(), "imageType", 1384592638);
        setField(term686, term686.getClass(), "colorModel", null);
        setField(term688, term688.getClass(), "sampleModel", null);
        setField(term688, term688.getClass(), "dataBuffer", null);
        setIntField(term688, term688.getClass(), "minX", -1002370457);
        setIntField(term688, term688.getClass(), "minY", -2014576105);
        setIntField(term688, term688.getClass(), "width", 1296895584);
        setIntField(term688, term688.getClass(), "height", 628918458);
        setIntField(term688, term688.getClass(), "sampleModelTranslateX", -1274456137);
        setIntField(term688, term688.getClass(), "sampleModelTranslateY", 1041916673);
        setIntField(term688, term688.getClass(), "numBands", -601863069);
        setIntField(term688, term688.getClass(), "numDataElements", 663292551);
        setField(term688, term688.getClass(), "parent", null);
        setField(term686, term686.getClass(), "raster", term688);
        setField(term686, term686.getClass(), "osis", null);
        setField(term697, term697.getClass(), "table", null);
        setIntField(term697, term697.getClass(), "count", 1);
        setIntField(term697, term697.getClass(), "threshold", 8);
        setFloatField(term697, term697.getClass(), "loadFactor", 0.75F);
        setIntField(term697, term697.getClass(), "modCount", 1);
        setField(term697, term697.getClass(), "keySet", null);
        setField(term697, term697.getClass(), "entrySet", null);
        setField(term697, term697.getClass(), "values", null);
        setField(term686, term686.getClass(), "properties", term697);
        setFloatField(term686, term686.getClass(), "accelerationPriority", 0.2857073F);
        setField(term686, term686.getClass(), "surfaceManager", null);
        Object term703 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term705 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term714 = newInstance(Class.forName("java.util.Hashtable"));
        setIntField(term703, term703.getClass(), "imageType", -506958186);
        setField(term703, term703.getClass(), "colorModel", null);
        setField(term705, term705.getClass(), "sampleModel", null);
        setField(term705, term705.getClass(), "dataBuffer", null);
        setIntField(term705, term705.getClass(), "minX", 0);
        setIntField(term705, term705.getClass(), "minY", 0);
        setIntField(term705, term705.getClass(), "width", 0);
        setIntField(term705, term705.getClass(), "height", 0);
        setIntField(term705, term705.getClass(), "sampleModelTranslateX", 0);
        setIntField(term705, term705.getClass(), "sampleModelTranslateY", 0);
        setIntField(term705, term705.getClass(), "numBands", 0);
        setIntField(term705, term705.getClass(), "numDataElements", 0);
        setField(term705, term705.getClass(), "parent", null);
        setField(term703, term703.getClass(), "raster", term705);
        setField(term703, term703.getClass(), "osis", null);
        setField(term714, term714.getClass(), "table", null);
        setIntField(term714, term714.getClass(), "count", 1);
        setIntField(term714, term714.getClass(), "threshold", 8);
        setFloatField(term714, term714.getClass(), "loadFactor", 0.75F);
        setIntField(term714, term714.getClass(), "modCount", 1);
        setField(term714, term714.getClass(), "keySet", null);
        setField(term714, term714.getClass(), "entrySet", null);
        setField(term714, term714.getClass(), "values", null);
        setField(term703, term703.getClass(), "properties", term714);
        setFloatField(term703, term703.getClass(), "accelerationPriority", 0.0F);
        setField(term703, term703.getClass(), "surfaceManager", null);
        Object term720 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term720, term720.getClass(), "imageType", 0);
        setField(term720, term720.getClass(), "colorModel", null);
        setField(term720, term720.getClass(), "raster", null);
        setField(term720, term720.getClass(), "osis", null);
        setField(term720, term720.getClass(), "properties", null);
        setFloatField(term720, term720.getClass(), "accelerationPriority", 0.0F);
        setField(term720, term720.getClass(), "surfaceManager", null);
        Object term723 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term723, term723.getClass(), "imageType", 0);
        setField(term723, term723.getClass(), "colorModel", null);
        setField(term723, term723.getClass(), "raster", null);
        setField(term723, term723.getClass(), "osis", null);
        setField(term723, term723.getClass(), "properties", null);
        setFloatField(term723, term723.getClass(), "accelerationPriority", 0.0F);
        setField(term723, term723.getClass(), "surfaceManager", null);
        Object term726 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term726, term726.getClass(), "imageType", 0);
        setField(term726, term726.getClass(), "colorModel", null);
        setField(term726, term726.getClass(), "raster", null);
        setField(term726, term726.getClass(), "osis", null);
        setField(term726, term726.getClass(), "properties", null);
        setFloatField(term726, term726.getClass(), "accelerationPriority", 0.0F);
        setField(term726, term726.getClass(), "surfaceManager", null);
        ArrayList term684 = new ArrayList();
        ((ArrayList) term684).add(term686);
        ((ArrayList) term684).add(term703);
        ((ArrayList) term684).add(term720);
        ((ArrayList) term684).add(term723);
        ((ArrayList) term684).add(term726);
        term683 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage"));
        setField(term683, term683.getClass(), "animations", term684);
        setIntField(term683, term683.getClass(), "frame", -1970452551);
        setIntField(term683, term683.getClass(), "sizeX", -1896376975);
        setIntField(term683, term683.getClass(), "sizeY", 729658803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextFrame", argTypes, term683, args);
    }

};


