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

public class BottomPanel_step_17882626911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9114;

    public BottomPanel_step_17882626911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9114 = newInstance(Class.forName("game.BottomPanel"));
        Object term9115 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term9117 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term9126 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term9135 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term9144 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term9145 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term9146 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        int[] term9153 = (int[]) newIntArray(1);
        setIntField(term9115, term9115.getClass(), "imageType", -899986714);
        setField(term9115, term9115.getClass(), "colorModel", null);
        setField(term9117, term9117.getClass(), "sampleModel", null);
        setField(term9117, term9117.getClass(), "dataBuffer", null);
        setIntField(term9117, term9117.getClass(), "minX", 1307244466);
        setIntField(term9117, term9117.getClass(), "minY", -252262096);
        setIntField(term9117, term9117.getClass(), "width", -37129068);
        setIntField(term9117, term9117.getClass(), "height", -861014847);
        setIntField(term9117, term9117.getClass(), "sampleModelTranslateX", 2132934139);
        setIntField(term9117, term9117.getClass(), "sampleModelTranslateY", -1261824381);
        setIntField(term9117, term9117.getClass(), "numBands", 1594426218);
        setIntField(term9117, term9117.getClass(), "numDataElements", -2060535464);
        setField(term9126, term9126.getClass(), "sampleModel", null);
        setField(term9126, term9126.getClass(), "dataBuffer", null);
        setIntField(term9126, term9126.getClass(), "minX", -1242946317);
        setIntField(term9126, term9126.getClass(), "minY", -1541566235);
        setIntField(term9126, term9126.getClass(), "width", -189738995);
        setIntField(term9126, term9126.getClass(), "height", 1943019963);
        setIntField(term9126, term9126.getClass(), "sampleModelTranslateX", 186472650);
        setIntField(term9126, term9126.getClass(), "sampleModelTranslateY", 279675992);
        setIntField(term9126, term9126.getClass(), "numBands", -1626074989);
        setIntField(term9126, term9126.getClass(), "numDataElements", -552272253);
        setField(term9135, term9135.getClass(), "sampleModel", null);
        setField(term9135, term9135.getClass(), "dataBuffer", null);
        setIntField(term9135, term9135.getClass(), "minX", 0);
        setIntField(term9135, term9135.getClass(), "minY", 0);
        setIntField(term9135, term9135.getClass(), "width", 0);
        setIntField(term9135, term9135.getClass(), "height", 0);
        setIntField(term9135, term9135.getClass(), "sampleModelTranslateX", 0);
        setIntField(term9135, term9135.getClass(), "sampleModelTranslateY", 0);
        setIntField(term9135, term9135.getClass(), "numBands", 0);
        setIntField(term9135, term9135.getClass(), "numDataElements", 0);
        setField(term9135, term9135.getClass(), "parent", null);
        setField(term9126, term9126.getClass(), "parent", term9135);
        setField(term9117, term9117.getClass(), "parent", term9126);
        setField(term9115, term9115.getClass(), "raster", term9117);
        setField(term9115, term9115.getClass(), "osis", null);
        setIntField(term9146, term9146.getClass(), "hash", -1527190286);
        setField(term9146, term9146.getClass(), "key", null);
        setField(term9146, term9146.getClass(), "value", null);
        setField(term9146, term9146.getClass(), "next", null);
        setElement(term9145, 7, term9146);
        setField(term9144, term9144.getClass(), "table", term9145);
        setIntField(term9144, term9144.getClass(), "count", 1);
        setIntField(term9144, term9144.getClass(), "threshold", 8);
        setFloatField(term9144, term9144.getClass(), "loadFactor", 0.75F);
        setIntField(term9144, term9144.getClass(), "modCount", 1);
        setField(term9144, term9144.getClass(), "keySet", null);
        setField(term9144, term9144.getClass(), "entrySet", null);
        setField(term9144, term9144.getClass(), "values", null);
        setField(term9115, term9115.getClass(), "properties", term9144);
        setFloatField(term9115, term9115.getClass(), "accelerationPriority", 0.13745493F);
        setField(term9115, term9115.getClass(), "surfaceManager", null);
        setField(term9114, term9114.getClass(), "image", term9115);
        setIntElement(term9153, 0, 1761540885);
        setField(term9114, term9114.getClass(), "x", term9153);
        setIntField(term9114, term9114.getClass(), "y", -168498989);
        setIntField(term9114, term9114.getClass(), "imageWidth", 388247095);
        setIntField(term9114, term9114.getClass(), "lavaLevel", -1320402633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.BottomPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "step", argTypes, term9114, args);
    }

};


