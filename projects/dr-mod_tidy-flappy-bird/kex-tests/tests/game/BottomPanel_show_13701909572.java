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

public class BottomPanel_show_13701909572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9159;

    public BottomPanel_show_13701909572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9159 = newInstance(Class.forName("game.BottomPanel"));
        Object term9160 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term9162 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term9171 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term9180 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term9189 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term9190 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term9191 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        int[] term9198 = (int[]) newIntArray(1);
        setIntField(term9160, term9160.getClass(), "imageType", 919602316);
        setField(term9160, term9160.getClass(), "colorModel", null);
        setField(term9162, term9162.getClass(), "sampleModel", null);
        setField(term9162, term9162.getClass(), "dataBuffer", null);
        setIntField(term9162, term9162.getClass(), "minX", 1833713431);
        setIntField(term9162, term9162.getClass(), "minY", -706222608);
        setIntField(term9162, term9162.getClass(), "width", -2003607923);
        setIntField(term9162, term9162.getClass(), "height", 1378805929);
        setIntField(term9162, term9162.getClass(), "sampleModelTranslateX", 695052304);
        setIntField(term9162, term9162.getClass(), "sampleModelTranslateY", -179937218);
        setIntField(term9162, term9162.getClass(), "numBands", 940896043);
        setIntField(term9162, term9162.getClass(), "numDataElements", -1156002984);
        setField(term9171, term9171.getClass(), "sampleModel", null);
        setField(term9171, term9171.getClass(), "dataBuffer", null);
        setIntField(term9171, term9171.getClass(), "minX", 1676254730);
        setIntField(term9171, term9171.getClass(), "minY", -1661200819);
        setIntField(term9171, term9171.getClass(), "width", -235039141);
        setIntField(term9171, term9171.getClass(), "height", -1414233013);
        setIntField(term9171, term9171.getClass(), "sampleModelTranslateX", -1174440096);
        setIntField(term9171, term9171.getClass(), "sampleModelTranslateY", -679614653);
        setIntField(term9171, term9171.getClass(), "numBands", -561851867);
        setIntField(term9171, term9171.getClass(), "numDataElements", -1809928454);
        setField(term9180, term9180.getClass(), "sampleModel", null);
        setField(term9180, term9180.getClass(), "dataBuffer", null);
        setIntField(term9180, term9180.getClass(), "minX", 0);
        setIntField(term9180, term9180.getClass(), "minY", 0);
        setIntField(term9180, term9180.getClass(), "width", 0);
        setIntField(term9180, term9180.getClass(), "height", 0);
        setIntField(term9180, term9180.getClass(), "sampleModelTranslateX", 0);
        setIntField(term9180, term9180.getClass(), "sampleModelTranslateY", 0);
        setIntField(term9180, term9180.getClass(), "numBands", 0);
        setIntField(term9180, term9180.getClass(), "numDataElements", 0);
        setField(term9180, term9180.getClass(), "parent", null);
        setField(term9171, term9171.getClass(), "parent", term9180);
        setField(term9162, term9162.getClass(), "parent", term9171);
        setField(term9160, term9160.getClass(), "raster", term9162);
        setField(term9160, term9160.getClass(), "osis", null);
        setIntField(term9191, term9191.getClass(), "hash", -695597510);
        setField(term9191, term9191.getClass(), "key", null);
        setField(term9191, term9191.getClass(), "value", null);
        setField(term9191, term9191.getClass(), "next", null);
        setElement(term9190, 10, term9191);
        setField(term9189, term9189.getClass(), "table", term9190);
        setIntField(term9189, term9189.getClass(), "count", 1);
        setIntField(term9189, term9189.getClass(), "threshold", 8);
        setFloatField(term9189, term9189.getClass(), "loadFactor", 0.75F);
        setIntField(term9189, term9189.getClass(), "modCount", 1);
        setField(term9189, term9189.getClass(), "keySet", null);
        setField(term9189, term9189.getClass(), "entrySet", null);
        setField(term9189, term9189.getClass(), "values", null);
        setField(term9160, term9160.getClass(), "properties", term9189);
        setFloatField(term9160, term9160.getClass(), "accelerationPriority", 0.20144695F);
        setField(term9160, term9160.getClass(), "surfaceManager", null);
        setField(term9159, term9159.getClass(), "image", term9160);
        setIntElement(term9198, 0, -1563700756);
        setField(term9159, term9159.getClass(), "x", term9198);
        setIntField(term9159, term9159.getClass(), "y", -208314837);
        setIntField(term9159, term9159.getClass(), "imageWidth", 697841387);
        setIntField(term9159, term9159.getClass(), "lavaLevel", -1749591213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.BottomPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "show", argTypes, term9159, args);
    }

};


