package org.openRealmOfStars.player.ship;

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
import static org.openRealmOfStars.player.ship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ShipImage_image64x64_6877444514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term941472;
     Object term941512;
     Object term941514;

    public ShipImage_image64x64_6877444514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term941472 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term941474 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term941483 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term941492 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term941501 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term941502 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term941503 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term941506 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term941472, term941472.getClass(), "imageType", 591009112);
        setField(term941472, term941472.getClass(), "colorModel", null);
        setField(term941474, term941474.getClass(), "sampleModel", null);
        setField(term941474, term941474.getClass(), "dataBuffer", null);
        setIntField(term941474, term941474.getClass(), "minX", -1430913381);
        setIntField(term941474, term941474.getClass(), "minY", 214932850);
        setIntField(term941474, term941474.getClass(), "width", 1757839617);
        setIntField(term941474, term941474.getClass(), "height", 691161018);
        setIntField(term941474, term941474.getClass(), "sampleModelTranslateX", -330784048);
        setIntField(term941474, term941474.getClass(), "sampleModelTranslateY", 604589819);
        setIntField(term941474, term941474.getClass(), "numBands", 2098939667);
        setIntField(term941474, term941474.getClass(), "numDataElements", 111288260);
        setField(term941483, term941483.getClass(), "sampleModel", null);
        setField(term941483, term941483.getClass(), "dataBuffer", null);
        setIntField(term941483, term941483.getClass(), "minX", -42355061);
        setIntField(term941483, term941483.getClass(), "minY", 1023659601);
        setIntField(term941483, term941483.getClass(), "width", 1586333346);
        setIntField(term941483, term941483.getClass(), "height", -863931293);
        setIntField(term941483, term941483.getClass(), "sampleModelTranslateX", -57161737);
        setIntField(term941483, term941483.getClass(), "sampleModelTranslateY", 986258161);
        setIntField(term941483, term941483.getClass(), "numBands", 533902933);
        setIntField(term941483, term941483.getClass(), "numDataElements", -1159824938);
        setField(term941492, term941492.getClass(), "sampleModel", null);
        setField(term941492, term941492.getClass(), "dataBuffer", null);
        setIntField(term941492, term941492.getClass(), "minX", 0);
        setIntField(term941492, term941492.getClass(), "minY", 0);
        setIntField(term941492, term941492.getClass(), "width", 0);
        setIntField(term941492, term941492.getClass(), "height", 0);
        setIntField(term941492, term941492.getClass(), "sampleModelTranslateX", 0);
        setIntField(term941492, term941492.getClass(), "sampleModelTranslateY", 0);
        setIntField(term941492, term941492.getClass(), "numBands", 0);
        setIntField(term941492, term941492.getClass(), "numDataElements", 0);
        setField(term941492, term941492.getClass(), "parent", null);
        setField(term941483, term941483.getClass(), "parent", term941492);
        setField(term941474, term941474.getClass(), "parent", term941483);
        setField(term941472, term941472.getClass(), "raster", term941474);
        setField(term941472, term941472.getClass(), "osis", null);
        setIntField(term941503, term941503.getClass(), "hash", -714041541);
        setField(term941503, term941503.getClass(), "key", "");
        setField(term941503, term941503.getClass(), "value", term941506);
        setField(term941503, term941503.getClass(), "next", null);
        setElement(term941502, 9, term941503);
        setField(term941501, term941501.getClass(), "table", term941502);
        setIntField(term941501, term941501.getClass(), "count", 1);
        setIntField(term941501, term941501.getClass(), "threshold", 8);
        setFloatField(term941501, term941501.getClass(), "loadFactor", 0.75F);
        setIntField(term941501, term941501.getClass(), "modCount", 1);
        setField(term941501, term941501.getClass(), "keySet", null);
        setField(term941501, term941501.getClass(), "entrySet", null);
        setField(term941501, term941501.getClass(), "values", null);
        setField(term941472, term941472.getClass(), "properties", term941501);
        setFloatField(term941472, term941472.getClass(), "accelerationPriority", 0.13246995F);
        setField(term941472, term941472.getClass(), "surfaceManager", null);
        term941512 = new Integer(848070641);
        term941514 = new Integer(-1473335774);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipImage");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term941472;
        args[1] = term941512;
        args[2] = term941514;
        callMethod(klass, "image64x64", argTypes, null, args);
    }

};


