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
import java.lang.Object;
import java.lang.Integer;

public class Icon16x16_setIndex_6691036344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447;
     Object term499;

    public Icon16x16_setIndex_6691036344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term447 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term448 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term450 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term459 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term468 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term477 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term478 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term479 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term448, term448.getClass(), "imageType", -663691365);
        setField(term448, term448.getClass(), "colorModel", null);
        setField(term450, term450.getClass(), "sampleModel", null);
        setField(term450, term450.getClass(), "dataBuffer", null);
        setIntField(term450, term450.getClass(), "minX", 339854490);
        setIntField(term450, term450.getClass(), "minY", -615654495);
        setIntField(term450, term450.getClass(), "width", -1476117762);
        setIntField(term450, term450.getClass(), "height", -341962980);
        setIntField(term450, term450.getClass(), "sampleModelTranslateX", 1532716628);
        setIntField(term450, term450.getClass(), "sampleModelTranslateY", -1801760683);
        setIntField(term450, term450.getClass(), "numBands", 1141317871);
        setIntField(term450, term450.getClass(), "numDataElements", 890669485);
        setField(term459, term459.getClass(), "sampleModel", null);
        setField(term459, term459.getClass(), "dataBuffer", null);
        setIntField(term459, term459.getClass(), "minX", 691577392);
        setIntField(term459, term459.getClass(), "minY", -893623680);
        setIntField(term459, term459.getClass(), "width", -1963434938);
        setIntField(term459, term459.getClass(), "height", 906181092);
        setIntField(term459, term459.getClass(), "sampleModelTranslateX", 1045657203);
        setIntField(term459, term459.getClass(), "sampleModelTranslateY", 1386130016);
        setIntField(term459, term459.getClass(), "numBands", 1072005683);
        setIntField(term459, term459.getClass(), "numDataElements", 1861318859);
        setField(term468, term468.getClass(), "sampleModel", null);
        setField(term468, term468.getClass(), "dataBuffer", null);
        setIntField(term468, term468.getClass(), "minX", 0);
        setIntField(term468, term468.getClass(), "minY", 0);
        setIntField(term468, term468.getClass(), "width", 0);
        setIntField(term468, term468.getClass(), "height", 0);
        setIntField(term468, term468.getClass(), "sampleModelTranslateX", 0);
        setIntField(term468, term468.getClass(), "sampleModelTranslateY", 0);
        setIntField(term468, term468.getClass(), "numBands", 0);
        setIntField(term468, term468.getClass(), "numDataElements", 0);
        setField(term468, term468.getClass(), "parent", null);
        setField(term459, term459.getClass(), "parent", term468);
        setField(term450, term450.getClass(), "parent", term459);
        setField(term448, term448.getClass(), "raster", term450);
        setField(term448, term448.getClass(), "osis", null);
        setIntField(term479, term479.getClass(), "hash", -1117847647);
        setField(term479, term479.getClass(), "key", null);
        setField(term479, term479.getClass(), "value", null);
        setField(term479, term479.getClass(), "next", null);
        setElement(term478, 9, term479);
        setField(term477, term477.getClass(), "table", term478);
        setIntField(term477, term477.getClass(), "count", 1);
        setIntField(term477, term477.getClass(), "threshold", 8);
        setFloatField(term477, term477.getClass(), "loadFactor", 0.75F);
        setIntField(term477, term477.getClass(), "modCount", 1);
        setField(term477, term477.getClass(), "keySet", null);
        setField(term477, term477.getClass(), "entrySet", null);
        setField(term477, term477.getClass(), "values", null);
        setField(term448, term448.getClass(), "properties", term477);
        setFloatField(term448, term448.getClass(), "accelerationPriority", 0.8564069F);
        setField(term448, term448.getClass(), "surfaceManager", null);
        setField(term447, term447.getClass(), "img", term448);
        setField(term447, term447.getClass(), "name", "aJlieCFVtF");
        setIntField(term447, term447.getClass(), "index", 568954359);
        term499 = new Integer(53410913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term499;
        callMethod(klass, "setIndex", argTypes, term447, args);
    }

};


