package org.openRealmOfStars.player.message;

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
import static org.openRealmOfStars.player.message.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class Message_setIndex_1755700274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19022;
     Object term19119;

    public Message_setIndex_1755700274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19122 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term19121 = ((Class) term19122).getDeclaredField((String) "PLANETARY");
        ((Field) term19121).setAccessible(true);
        Object enum60 = ((Field) term19121).get((Object) null);
        Class<? extends Object> term19366 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term19365 = ((Class) term19366).getDeclaredField((String) "BUILDING");
        ((Field) term19365).setAccessible(true);
        Object enum61 = ((Field) term19365).get((Object) null);
        term19022 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term19023 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term19027 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term19065 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term19066 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term19068 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term19077 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term19086 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term19087 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term19023, term19023.getClass(), "x", 267763294);
        setIntField(term19023, term19023.getClass(), "y", -1497710478);
        setField(term19022, term19022.getClass(), "coordinate", term19023);
        setIntField(term19022, term19022.getClass(), "index", -525257914);
        setField(term19027, term19027.getClass(), "mainType", enum60);
        setField(term19027, term19027.getClass(), "subType", enum61);
        setField(term19022, term19022.getClass(), "type", term19027);
        setField(term19022, term19022.getClass(), "message", "SbAoxhfrkn");
        setIntField(term19066, term19066.getClass(), "imageType", 147209682);
        setField(term19066, term19066.getClass(), "colorModel", null);
        setField(term19068, term19068.getClass(), "sampleModel", null);
        setField(term19068, term19068.getClass(), "dataBuffer", null);
        setIntField(term19068, term19068.getClass(), "minX", 34470066);
        setIntField(term19068, term19068.getClass(), "minY", 2058711405);
        setIntField(term19068, term19068.getClass(), "width", 1743683601);
        setIntField(term19068, term19068.getClass(), "height", -945116798);
        setIntField(term19068, term19068.getClass(), "sampleModelTranslateX", 1593461795);
        setIntField(term19068, term19068.getClass(), "sampleModelTranslateY", 515182546);
        setIntField(term19068, term19068.getClass(), "numBands", -936895502);
        setIntField(term19068, term19068.getClass(), "numDataElements", -129547140);
        setField(term19077, term19077.getClass(), "sampleModel", null);
        setField(term19077, term19077.getClass(), "dataBuffer", null);
        setIntField(term19077, term19077.getClass(), "minX", 0);
        setIntField(term19077, term19077.getClass(), "minY", 0);
        setIntField(term19077, term19077.getClass(), "width", 0);
        setIntField(term19077, term19077.getClass(), "height", 0);
        setIntField(term19077, term19077.getClass(), "sampleModelTranslateX", 0);
        setIntField(term19077, term19077.getClass(), "sampleModelTranslateY", 0);
        setIntField(term19077, term19077.getClass(), "numBands", 0);
        setIntField(term19077, term19077.getClass(), "numDataElements", 0);
        setField(term19077, term19077.getClass(), "parent", null);
        setField(term19068, term19068.getClass(), "parent", term19077);
        setField(term19066, term19066.getClass(), "raster", term19068);
        setField(term19066, term19066.getClass(), "osis", null);
        setField(term19086, term19086.getClass(), "table", term19087);
        setIntField(term19086, term19086.getClass(), "count", 1);
        setIntField(term19086, term19086.getClass(), "threshold", 8);
        setFloatField(term19086, term19086.getClass(), "loadFactor", 0.75F);
        setIntField(term19086, term19086.getClass(), "modCount", 1);
        setField(term19086, term19086.getClass(), "keySet", null);
        setField(term19086, term19086.getClass(), "entrySet", null);
        setField(term19086, term19086.getClass(), "values", null);
        setField(term19066, term19066.getClass(), "properties", term19086);
        setFloatField(term19066, term19066.getClass(), "accelerationPriority", 0.5446086F);
        setField(term19066, term19066.getClass(), "surfaceManager", null);
        setField(term19065, term19065.getClass(), "img", term19066);
        setField(term19065, term19065.getClass(), "name", "Ghbwtircqb");
        setIntField(term19065, term19065.getClass(), "index", -1195339592);
        setField(term19022, term19022.getClass(), "icon", term19065);
        setField(term19022, term19022.getClass(), "matchByString", "xrwlQZdwCp");
        setBooleanField(term19022, term19022.getClass(), "randomEventPopup", true);
        term19119 = new Integer(-376422566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term19119;
        callMethod(klass, "setIndex", argTypes, term19022, args);
    }

};


