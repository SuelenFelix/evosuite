package game;

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
import static game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Bird_action_21019073733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8673;

    public Bird_action_21019073733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8673 = newInstance(Class.forName("game.Bird"));
        Object[] term8680 = (Object[]) newArray("java.awt.image.BufferedImage", 5);
        Object term8681 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8683 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term8692 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term8701 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term8702 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term8708 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8710 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term8719 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term8720 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term8726 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8729 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8732 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term8673, term8673.getClass(), "x", -890538258);
        setIntField(term8673, term8673.getClass(), "y", -1085899912);
        setIntField(term8673, term8673.getClass(), "birdHeight", -1458980236);
        setIntField(term8673, term8673.getClass(), "birdWidth", 890505372);
        setDoubleField(term8673, term8673.getClass(), "velocity", 0.22651340641904605);
        setIntField(term8673, term8673.getClass(), "count", 2044137055);
        setIntField(term8681, term8681.getClass(), "imageType", -1452324619);
        setField(term8681, term8681.getClass(), "colorModel", null);
        setField(term8683, term8683.getClass(), "sampleModel", null);
        setField(term8683, term8683.getClass(), "dataBuffer", null);
        setIntField(term8683, term8683.getClass(), "minX", -1121709274);
        setIntField(term8683, term8683.getClass(), "minY", -532304223);
        setIntField(term8683, term8683.getClass(), "width", 666218293);
        setIntField(term8683, term8683.getClass(), "height", 1737876343);
        setIntField(term8683, term8683.getClass(), "sampleModelTranslateX", -897937940);
        setIntField(term8683, term8683.getClass(), "sampleModelTranslateY", 1523261232);
        setIntField(term8683, term8683.getClass(), "numBands", -428988337);
        setIntField(term8683, term8683.getClass(), "numDataElements", 48047085);
        setField(term8692, term8692.getClass(), "sampleModel", null);
        setField(term8692, term8692.getClass(), "dataBuffer", null);
        setIntField(term8692, term8692.getClass(), "minX", 1902784843);
        setIntField(term8692, term8692.getClass(), "minY", 2021136615);
        setIntField(term8692, term8692.getClass(), "width", 1778570695);
        setIntField(term8692, term8692.getClass(), "height", -1142164411);
        setIntField(term8692, term8692.getClass(), "sampleModelTranslateX", -1619435313);
        setIntField(term8692, term8692.getClass(), "sampleModelTranslateY", 1013801066);
        setIntField(term8692, term8692.getClass(), "numBands", 1512541853);
        setIntField(term8692, term8692.getClass(), "numDataElements", -965421502);
        setField(term8692, term8692.getClass(), "parent", null);
        setField(term8683, term8683.getClass(), "parent", term8692);
        setField(term8681, term8681.getClass(), "raster", term8683);
        setField(term8681, term8681.getClass(), "osis", null);
        setField(term8701, term8701.getClass(), "table", term8702);
        setIntField(term8701, term8701.getClass(), "count", 1);
        setIntField(term8701, term8701.getClass(), "threshold", 8);
        setFloatField(term8701, term8701.getClass(), "loadFactor", 0.75F);
        setIntField(term8701, term8701.getClass(), "modCount", 1);
        setField(term8701, term8701.getClass(), "keySet", null);
        setField(term8701, term8701.getClass(), "entrySet", null);
        setField(term8701, term8701.getClass(), "values", null);
        setField(term8681, term8681.getClass(), "properties", term8701);
        setFloatField(term8681, term8681.getClass(), "accelerationPriority", 0.24413109F);
        setField(term8681, term8681.getClass(), "surfaceManager", null);
        setElement(term8680, 0, term8681);
        setIntField(term8708, term8708.getClass(), "imageType", -1368173231);
        setField(term8708, term8708.getClass(), "colorModel", null);
        setField(term8710, term8710.getClass(), "sampleModel", null);
        setField(term8710, term8710.getClass(), "dataBuffer", null);
        setIntField(term8710, term8710.getClass(), "minX", 0);
        setIntField(term8710, term8710.getClass(), "minY", 0);
        setIntField(term8710, term8710.getClass(), "width", 0);
        setIntField(term8710, term8710.getClass(), "height", 0);
        setIntField(term8710, term8710.getClass(), "sampleModelTranslateX", 0);
        setIntField(term8710, term8710.getClass(), "sampleModelTranslateY", 0);
        setIntField(term8710, term8710.getClass(), "numBands", 0);
        setIntField(term8710, term8710.getClass(), "numDataElements", 0);
        setField(term8710, term8710.getClass(), "parent", null);
        setField(term8708, term8708.getClass(), "raster", term8710);
        setField(term8708, term8708.getClass(), "osis", null);
        setField(term8719, term8719.getClass(), "table", term8720);
        setIntField(term8719, term8719.getClass(), "count", 1);
        setIntField(term8719, term8719.getClass(), "threshold", 8);
        setFloatField(term8719, term8719.getClass(), "loadFactor", 0.75F);
        setIntField(term8719, term8719.getClass(), "modCount", 1);
        setField(term8719, term8719.getClass(), "keySet", null);
        setField(term8719, term8719.getClass(), "entrySet", null);
        setField(term8719, term8719.getClass(), "values", null);
        setField(term8708, term8708.getClass(), "properties", term8719);
        setFloatField(term8708, term8708.getClass(), "accelerationPriority", 0.0F);
        setField(term8708, term8708.getClass(), "surfaceManager", null);
        setElement(term8680, 1, term8708);
        setIntField(term8726, term8726.getClass(), "imageType", 0);
        setField(term8726, term8726.getClass(), "colorModel", null);
        setField(term8726, term8726.getClass(), "raster", null);
        setField(term8726, term8726.getClass(), "osis", null);
        setField(term8726, term8726.getClass(), "properties", null);
        setFloatField(term8726, term8726.getClass(), "accelerationPriority", 0.0F);
        setField(term8726, term8726.getClass(), "surfaceManager", null);
        setElement(term8680, 2, term8726);
        setIntField(term8729, term8729.getClass(), "imageType", 0);
        setField(term8729, term8729.getClass(), "colorModel", null);
        setField(term8729, term8729.getClass(), "raster", null);
        setField(term8729, term8729.getClass(), "osis", null);
        setField(term8729, term8729.getClass(), "properties", null);
        setFloatField(term8729, term8729.getClass(), "accelerationPriority", 0.0F);
        setField(term8729, term8729.getClass(), "surfaceManager", null);
        setElement(term8680, 3, term8729);
        setIntField(term8732, term8732.getClass(), "imageType", 0);
        setField(term8732, term8732.getClass(), "colorModel", null);
        setField(term8732, term8732.getClass(), "raster", null);
        setField(term8732, term8732.getClass(), "osis", null);
        setField(term8732, term8732.getClass(), "properties", null);
        setFloatField(term8732, term8732.getClass(), "accelerationPriority", 0.0F);
        setField(term8732, term8732.getClass(), "surfaceManager", null);
        setElement(term8680, 4, term8732);
        setField(term8673, term8673.getClass(), "images", term8680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Bird");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "action", argTypes, term8673, args);
    }

};


