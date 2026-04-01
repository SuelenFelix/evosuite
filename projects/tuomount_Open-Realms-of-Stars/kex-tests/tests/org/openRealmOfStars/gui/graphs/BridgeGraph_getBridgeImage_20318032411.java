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

public class BridgeGraph_getBridgeImage_20318032411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;

    public BridgeGraph_getBridgeImage_20318032411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = newInstance(Class.forName("org.openRealmOfStars.gui.graphs.BridgeGraph"));
        Object term50 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term52 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term61 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term70 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term79 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term80 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term81 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setIntField(term50, term50.getClass(), "imageType", 1162663216);
        setField(term50, term50.getClass(), "colorModel", null);
        setField(term52, term52.getClass(), "sampleModel", null);
        setField(term52, term52.getClass(), "dataBuffer", null);
        setIntField(term52, term52.getClass(), "minX", 1484323161);
        setIntField(term52, term52.getClass(), "minY", 391863371);
        setIntField(term52, term52.getClass(), "width", -1922583790);
        setIntField(term52, term52.getClass(), "height", -616727354);
        setIntField(term52, term52.getClass(), "sampleModelTranslateX", -1955890973);
        setIntField(term52, term52.getClass(), "sampleModelTranslateY", -2038273078);
        setIntField(term52, term52.getClass(), "numBands", 1227103734);
        setIntField(term52, term52.getClass(), "numDataElements", -1339778481);
        setField(term61, term61.getClass(), "sampleModel", null);
        setField(term61, term61.getClass(), "dataBuffer", null);
        setIntField(term61, term61.getClass(), "minX", 1725571209);
        setIntField(term61, term61.getClass(), "minY", -522618178);
        setIntField(term61, term61.getClass(), "width", 1134449235);
        setIntField(term61, term61.getClass(), "height", -883034806);
        setIntField(term61, term61.getClass(), "sampleModelTranslateX", 1585847225);
        setIntField(term61, term61.getClass(), "sampleModelTranslateY", 597278769);
        setIntField(term61, term61.getClass(), "numBands", -1685132342);
        setIntField(term61, term61.getClass(), "numDataElements", -1456670397);
        setField(term70, term70.getClass(), "sampleModel", null);
        setField(term70, term70.getClass(), "dataBuffer", null);
        setIntField(term70, term70.getClass(), "minX", 0);
        setIntField(term70, term70.getClass(), "minY", 0);
        setIntField(term70, term70.getClass(), "width", 0);
        setIntField(term70, term70.getClass(), "height", 0);
        setIntField(term70, term70.getClass(), "sampleModelTranslateX", 0);
        setIntField(term70, term70.getClass(), "sampleModelTranslateY", 0);
        setIntField(term70, term70.getClass(), "numBands", 0);
        setIntField(term70, term70.getClass(), "numDataElements", 0);
        setField(term70, term70.getClass(), "parent", null);
        setField(term61, term61.getClass(), "parent", term70);
        setField(term52, term52.getClass(), "parent", term61);
        setField(term50, term50.getClass(), "raster", term52);
        setField(term50, term50.getClass(), "osis", null);
        setIntField(term81, term81.getClass(), "hash", 1033560433);
        setField(term81, term81.getClass(), "key", null);
        setField(term81, term81.getClass(), "value", null);
        setField(term81, term81.getClass(), "next", null);
        setElement(term80, 4, term81);
        setField(term79, term79.getClass(), "table", term80);
        setIntField(term79, term79.getClass(), "count", 1);
        setIntField(term79, term79.getClass(), "threshold", 8);
        setFloatField(term79, term79.getClass(), "loadFactor", 0.75F);
        setIntField(term79, term79.getClass(), "modCount", 1);
        setField(term79, term79.getClass(), "keySet", null);
        setField(term79, term79.getClass(), "entrySet", null);
        setField(term79, term79.getClass(), "values", null);
        setField(term50, term50.getClass(), "properties", term79);
        setFloatField(term50, term50.getClass(), "accelerationPriority", 0.13238746F);
        setField(term50, term50.getClass(), "surfaceManager", null);
        setField(term49, term49.getClass(), "bridgeImage", term50);
        setIntField(term49, term49.getClass(), "yOffset", 1048535127);
        setField(term49, term49.getClass(), "name", "xxtlPwDYFs");
        setBooleanField(term49, term49.getClass(), "customImage", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.graphs.BridgeGraph");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBridgeImage", argTypes, term49, args);
    }

};


