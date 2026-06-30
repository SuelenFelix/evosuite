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

public class Bird_step_13381029352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8608;

    public Bird_step_13381029352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8608 = newInstance(Class.forName("game.Bird"));
        Object[] term8615 = (Object[]) newArray("java.awt.image.BufferedImage", 6);
        Object term8616 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8618 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term8627 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term8636 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term8637 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term8643 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8645 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term8654 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term8655 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term8661 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8664 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8667 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term8670 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term8608, term8608.getClass(), "x", 18072182);
        setIntField(term8608, term8608.getClass(), "y", 1544768934);
        setIntField(term8608, term8608.getClass(), "birdHeight", -383508597);
        setIntField(term8608, term8608.getClass(), "birdWidth", -819372164);
        setDoubleField(term8608, term8608.getClass(), "velocity", 0.3202192021706908);
        setIntField(term8608, term8608.getClass(), "count", 958132675);
        setIntField(term8616, term8616.getClass(), "imageType", -689879283);
        setField(term8616, term8616.getClass(), "colorModel", null);
        setField(term8618, term8618.getClass(), "sampleModel", null);
        setField(term8618, term8618.getClass(), "dataBuffer", null);
        setIntField(term8618, term8618.getClass(), "minX", 1985432430);
        setIntField(term8618, term8618.getClass(), "minY", -1769933499);
        setIntField(term8618, term8618.getClass(), "width", -1510932472);
        setIntField(term8618, term8618.getClass(), "height", 1970654816);
        setIntField(term8618, term8618.getClass(), "sampleModelTranslateX", 1354781442);
        setIntField(term8618, term8618.getClass(), "sampleModelTranslateY", -393590701);
        setIntField(term8618, term8618.getClass(), "numBands", 86344574);
        setIntField(term8618, term8618.getClass(), "numDataElements", -829441157);
        setField(term8627, term8627.getClass(), "sampleModel", null);
        setField(term8627, term8627.getClass(), "dataBuffer", null);
        setIntField(term8627, term8627.getClass(), "minX", -1489991025);
        setIntField(term8627, term8627.getClass(), "minY", -1542979444);
        setIntField(term8627, term8627.getClass(), "width", -1130401612);
        setIntField(term8627, term8627.getClass(), "height", -316771104);
        setIntField(term8627, term8627.getClass(), "sampleModelTranslateX", -1374527319);
        setIntField(term8627, term8627.getClass(), "sampleModelTranslateY", -1735276919);
        setIntField(term8627, term8627.getClass(), "numBands", -712023865);
        setIntField(term8627, term8627.getClass(), "numDataElements", 613256157);
        setField(term8627, term8627.getClass(), "parent", null);
        setField(term8618, term8618.getClass(), "parent", term8627);
        setField(term8616, term8616.getClass(), "raster", term8618);
        setField(term8616, term8616.getClass(), "osis", null);
        setField(term8636, term8636.getClass(), "table", term8637);
        setIntField(term8636, term8636.getClass(), "count", 1);
        setIntField(term8636, term8636.getClass(), "threshold", 8);
        setFloatField(term8636, term8636.getClass(), "loadFactor", 0.75F);
        setIntField(term8636, term8636.getClass(), "modCount", 1);
        setField(term8636, term8636.getClass(), "keySet", null);
        setField(term8636, term8636.getClass(), "entrySet", null);
        setField(term8636, term8636.getClass(), "values", null);
        setField(term8616, term8616.getClass(), "properties", term8636);
        setFloatField(term8616, term8616.getClass(), "accelerationPriority", 0.37773192F);
        setField(term8616, term8616.getClass(), "surfaceManager", null);
        setElement(term8615, 0, term8616);
        setIntField(term8643, term8643.getClass(), "imageType", 1798354517);
        setField(term8643, term8643.getClass(), "colorModel", null);
        setField(term8645, term8645.getClass(), "sampleModel", null);
        setField(term8645, term8645.getClass(), "dataBuffer", null);
        setIntField(term8645, term8645.getClass(), "minX", 0);
        setIntField(term8645, term8645.getClass(), "minY", 0);
        setIntField(term8645, term8645.getClass(), "width", 0);
        setIntField(term8645, term8645.getClass(), "height", 0);
        setIntField(term8645, term8645.getClass(), "sampleModelTranslateX", 0);
        setIntField(term8645, term8645.getClass(), "sampleModelTranslateY", 0);
        setIntField(term8645, term8645.getClass(), "numBands", 0);
        setIntField(term8645, term8645.getClass(), "numDataElements", 0);
        setField(term8645, term8645.getClass(), "parent", null);
        setField(term8643, term8643.getClass(), "raster", term8645);
        setField(term8643, term8643.getClass(), "osis", null);
        setField(term8654, term8654.getClass(), "table", term8655);
        setIntField(term8654, term8654.getClass(), "count", 1);
        setIntField(term8654, term8654.getClass(), "threshold", 8);
        setFloatField(term8654, term8654.getClass(), "loadFactor", 0.75F);
        setIntField(term8654, term8654.getClass(), "modCount", 1);
        setField(term8654, term8654.getClass(), "keySet", null);
        setField(term8654, term8654.getClass(), "entrySet", null);
        setField(term8654, term8654.getClass(), "values", null);
        setField(term8643, term8643.getClass(), "properties", term8654);
        setFloatField(term8643, term8643.getClass(), "accelerationPriority", 0.0F);
        setField(term8643, term8643.getClass(), "surfaceManager", null);
        setElement(term8615, 1, term8643);
        setIntField(term8661, term8661.getClass(), "imageType", 0);
        setField(term8661, term8661.getClass(), "colorModel", null);
        setField(term8661, term8661.getClass(), "raster", null);
        setField(term8661, term8661.getClass(), "osis", null);
        setField(term8661, term8661.getClass(), "properties", null);
        setFloatField(term8661, term8661.getClass(), "accelerationPriority", 0.0F);
        setField(term8661, term8661.getClass(), "surfaceManager", null);
        setElement(term8615, 2, term8661);
        setIntField(term8664, term8664.getClass(), "imageType", 0);
        setField(term8664, term8664.getClass(), "colorModel", null);
        setField(term8664, term8664.getClass(), "raster", null);
        setField(term8664, term8664.getClass(), "osis", null);
        setField(term8664, term8664.getClass(), "properties", null);
        setFloatField(term8664, term8664.getClass(), "accelerationPriority", 0.0F);
        setField(term8664, term8664.getClass(), "surfaceManager", null);
        setElement(term8615, 3, term8664);
        setIntField(term8667, term8667.getClass(), "imageType", 0);
        setField(term8667, term8667.getClass(), "colorModel", null);
        setField(term8667, term8667.getClass(), "raster", null);
        setField(term8667, term8667.getClass(), "osis", null);
        setField(term8667, term8667.getClass(), "properties", null);
        setFloatField(term8667, term8667.getClass(), "accelerationPriority", 0.0F);
        setField(term8667, term8667.getClass(), "surfaceManager", null);
        setElement(term8615, 4, term8667);
        setIntField(term8670, term8670.getClass(), "imageType", 0);
        setField(term8670, term8670.getClass(), "colorModel", null);
        setField(term8670, term8670.getClass(), "raster", null);
        setField(term8670, term8670.getClass(), "osis", null);
        setField(term8670, term8670.getClass(), "properties", null);
        setFloatField(term8670, term8670.getClass(), "accelerationPriority", 0.0F);
        setField(term8670, term8670.getClass(), "surfaceManager", null);
        setElement(term8615, 5, term8670);
        setField(term8608, term8608.getClass(), "images", term8615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Bird");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "step", argTypes, term8608, args);
    }

};


