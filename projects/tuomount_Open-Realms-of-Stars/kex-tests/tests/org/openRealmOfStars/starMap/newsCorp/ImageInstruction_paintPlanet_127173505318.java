package org.openRealmOfStars.starMap.newsCorp;

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
import static org.openRealmOfStars.starMap.newsCorp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ImageInstruction_paintPlanet_127173505318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716626;

    public ImageInstruction_paintPlanet_127173505318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term716626 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term716628 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term716637 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term716646 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term716655 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term716656 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term716657 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term716660 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term716626, term716626.getClass(), "imageType", 2003247591);
        setField(term716626, term716626.getClass(), "colorModel", null);
        setField(term716628, term716628.getClass(), "sampleModel", null);
        setField(term716628, term716628.getClass(), "dataBuffer", null);
        setIntField(term716628, term716628.getClass(), "minX", -828427699);
        setIntField(term716628, term716628.getClass(), "minY", 1239369202);
        setIntField(term716628, term716628.getClass(), "width", -1435329726);
        setIntField(term716628, term716628.getClass(), "height", 1376796830);
        setIntField(term716628, term716628.getClass(), "sampleModelTranslateX", -434872497);
        setIntField(term716628, term716628.getClass(), "sampleModelTranslateY", -1578119477);
        setIntField(term716628, term716628.getClass(), "numBands", 126012894);
        setIntField(term716628, term716628.getClass(), "numDataElements", -309438952);
        setField(term716637, term716637.getClass(), "sampleModel", null);
        setField(term716637, term716637.getClass(), "dataBuffer", null);
        setIntField(term716637, term716637.getClass(), "minX", -1982063701);
        setIntField(term716637, term716637.getClass(), "minY", 561930952);
        setIntField(term716637, term716637.getClass(), "width", 22947048);
        setIntField(term716637, term716637.getClass(), "height", -681684272);
        setIntField(term716637, term716637.getClass(), "sampleModelTranslateX", 1017030185);
        setIntField(term716637, term716637.getClass(), "sampleModelTranslateY", 772405009);
        setIntField(term716637, term716637.getClass(), "numBands", -1292913545);
        setIntField(term716637, term716637.getClass(), "numDataElements", 103673605);
        setField(term716646, term716646.getClass(), "sampleModel", null);
        setField(term716646, term716646.getClass(), "dataBuffer", null);
        setIntField(term716646, term716646.getClass(), "minX", 0);
        setIntField(term716646, term716646.getClass(), "minY", 0);
        setIntField(term716646, term716646.getClass(), "width", 0);
        setIntField(term716646, term716646.getClass(), "height", 0);
        setIntField(term716646, term716646.getClass(), "sampleModelTranslateX", 0);
        setIntField(term716646, term716646.getClass(), "sampleModelTranslateY", 0);
        setIntField(term716646, term716646.getClass(), "numBands", 0);
        setIntField(term716646, term716646.getClass(), "numDataElements", 0);
        setField(term716646, term716646.getClass(), "parent", null);
        setField(term716637, term716637.getClass(), "parent", term716646);
        setField(term716628, term716628.getClass(), "parent", term716637);
        setField(term716626, term716626.getClass(), "raster", term716628);
        setField(term716626, term716626.getClass(), "osis", null);
        setIntField(term716657, term716657.getClass(), "hash", -108060737);
        setField(term716657, term716657.getClass(), "key", "");
        setField(term716657, term716657.getClass(), "value", term716660);
        setField(term716657, term716657.getClass(), "next", null);
        setElement(term716656, 9, term716657);
        setField(term716655, term716655.getClass(), "table", term716656);
        setIntField(term716655, term716655.getClass(), "count", 1);
        setIntField(term716655, term716655.getClass(), "threshold", 8);
        setFloatField(term716655, term716655.getClass(), "loadFactor", 0.75F);
        setIntField(term716655, term716655.getClass(), "modCount", 1);
        setField(term716655, term716655.getClass(), "keySet", null);
        setField(term716655, term716655.getClass(), "entrySet", null);
        setField(term716655, term716655.getClass(), "values", null);
        setField(term716626, term716626.getClass(), "properties", term716655);
        setFloatField(term716626, term716626.getClass(), "accelerationPriority", 0.9571234F);
        setField(term716626, term716626.getClass(), "surfaceManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term716626;
        args[1] = "ZDzujPwqKF";
        args[2] = "uRFsHTsjIO";
        args[3] = "YxFMRLMLVp";
        callMethod(klass, "paintPlanet", argTypes, null, args);
    }

};


