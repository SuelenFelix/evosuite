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

public class Message_saveMessage_18366641042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17782;
     Object term17879;

    public Message_saveMessage_18366641042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17893 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term17892 = ((Class) term17893).getDeclaredField((String) "RESEARCH");
        ((Field) term17892).setAccessible(true);
        Object enum56 = ((Field) term17892).get((Object) null);
        Class<? extends Object> term18134 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term18133 = ((Class) term18134).getDeclaredField((String) "ESPIONAGE");
        ((Field) term18133).setAccessible(true);
        Object enum57 = ((Field) term18133).get((Object) null);
        term17782 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        Object term17783 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term17787 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        Object term17825 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term17826 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term17828 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term17837 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term17846 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term17847 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term17783, term17783.getClass(), "x", 388157121);
        setIntField(term17783, term17783.getClass(), "y", 1684998508);
        setField(term17782, term17782.getClass(), "coordinate", term17783);
        setIntField(term17782, term17782.getClass(), "index", 1270666529);
        setField(term17787, term17787.getClass(), "mainType", enum56);
        setField(term17787, term17787.getClass(), "subType", enum57);
        setField(term17782, term17782.getClass(), "type", term17787);
        setField(term17782, term17782.getClass(), "message", "vrQLuWIDJX");
        setIntField(term17826, term17826.getClass(), "imageType", -1146679443);
        setField(term17826, term17826.getClass(), "colorModel", null);
        setField(term17828, term17828.getClass(), "sampleModel", null);
        setField(term17828, term17828.getClass(), "dataBuffer", null);
        setIntField(term17828, term17828.getClass(), "minX", -860131894);
        setIntField(term17828, term17828.getClass(), "minY", -1022990421);
        setIntField(term17828, term17828.getClass(), "width", 1045547089);
        setIntField(term17828, term17828.getClass(), "height", -1122880881);
        setIntField(term17828, term17828.getClass(), "sampleModelTranslateX", -542712742);
        setIntField(term17828, term17828.getClass(), "sampleModelTranslateY", -1254072822);
        setIntField(term17828, term17828.getClass(), "numBands", -1111249833);
        setIntField(term17828, term17828.getClass(), "numDataElements", -1692331299);
        setField(term17837, term17837.getClass(), "sampleModel", null);
        setField(term17837, term17837.getClass(), "dataBuffer", null);
        setIntField(term17837, term17837.getClass(), "minX", 0);
        setIntField(term17837, term17837.getClass(), "minY", 0);
        setIntField(term17837, term17837.getClass(), "width", 0);
        setIntField(term17837, term17837.getClass(), "height", 0);
        setIntField(term17837, term17837.getClass(), "sampleModelTranslateX", 0);
        setIntField(term17837, term17837.getClass(), "sampleModelTranslateY", 0);
        setIntField(term17837, term17837.getClass(), "numBands", 0);
        setIntField(term17837, term17837.getClass(), "numDataElements", 0);
        setField(term17837, term17837.getClass(), "parent", null);
        setField(term17828, term17828.getClass(), "parent", term17837);
        setField(term17826, term17826.getClass(), "raster", term17828);
        setField(term17826, term17826.getClass(), "osis", null);
        setField(term17846, term17846.getClass(), "table", term17847);
        setIntField(term17846, term17846.getClass(), "count", 1);
        setIntField(term17846, term17846.getClass(), "threshold", 8);
        setFloatField(term17846, term17846.getClass(), "loadFactor", 0.75F);
        setIntField(term17846, term17846.getClass(), "modCount", 1);
        setField(term17846, term17846.getClass(), "keySet", null);
        setField(term17846, term17846.getClass(), "entrySet", null);
        setField(term17846, term17846.getClass(), "values", null);
        setField(term17826, term17826.getClass(), "properties", term17846);
        setFloatField(term17826, term17826.getClass(), "accelerationPriority", 0.5523636F);
        setField(term17826, term17826.getClass(), "surfaceManager", null);
        setField(term17825, term17825.getClass(), "img", term17826);
        setField(term17825, term17825.getClass(), "name", "OclPbYPkcH");
        setIntField(term17825, term17825.getClass(), "index", 1320570890);
        setField(term17782, term17782.getClass(), "icon", term17825);
        setField(term17782, term17782.getClass(), "matchByString", "IoAlmYsBwc");
        setBooleanField(term17782, term17782.getClass(), "randomEventPopup", false);
        term17879 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term17881 = (byte[]) newByteArray(3);
        byte[] term17885 = (byte[]) newByteArray(4);
        Object term17891 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term17879, term17879.getClass(), "written", -130649791);
        setByteElement(term17881, 0, (byte) -112);
        setByteElement(term17881, 1, (byte) 81);
        setByteElement(term17881, 2, (byte) 65);
        setField(term17879, term17879.getClass(), "bytearr", term17881);
        setByteElement(term17885, 0, (byte) -44);
        setByteElement(term17885, 1, (byte) 33);
        setByteElement(term17885, 2, (byte) -74);
        setByteElement(term17885, 3, (byte) -84);
        setField(term17879, term17879.getClass(), "writeBuffer", term17885);
        setField(term17879, term17879.getClass(), "out", null);
        setBooleanField(term17879, term17879.getClass(), "closed", true);
        setField(term17879, term17879.getClass(), "closeLock", term17891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term17879;
        callMethod(klass, "saveMessage", argTypes, term17782, args);
    }

};


