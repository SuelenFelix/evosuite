package org.openRealmOfStars.gui.util;

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
import static org.openRealmOfStars.gui.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GuiStatics_getTextWidth_14505121983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6179;

    public GuiStatics_getTextWidth_14505121983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6179 = newInstance(Class.forName("java.awt.Font"));
        Object term6180 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term6181 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term6182 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term6184 = newInstance(Class.forName("java.lang.Object"));
        Object term6185 = newInstance(Class.forName("java.lang.Object"));
        Object term6211 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term6213 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6214 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term6182, term6182.getClass(), "hash", 576457758);
        setField(term6182, term6182.getClass(), "key", term6184);
        setField(term6182, term6182.getClass(), "value", term6185);
        setField(term6182, term6182.getClass(), "next", null);
        setElement(term6181, 8, term6182);
        setField(term6180, term6180.getClass(), "table", term6181);
        setIntField(term6180, term6180.getClass(), "count", 1);
        setIntField(term6180, term6180.getClass(), "threshold", 8);
        setFloatField(term6180, term6180.getClass(), "loadFactor", 0.75F);
        setIntField(term6180, term6180.getClass(), "modCount", 1);
        setField(term6180, term6180.getClass(), "keySet", null);
        setField(term6180, term6180.getClass(), "entrySet", null);
        setField(term6180, term6180.getClass(), "values", null);
        setField(term6179, term6179.getClass(), "fRequestedAttributes", term6180);
        setField(term6179, term6179.getClass(), "name", "nHXjMycHlU");
        setIntField(term6179, term6179.getClass(), "style", 954660603);
        setIntField(term6179, term6179.getClass(), "size", -1351605385);
        setFloatField(term6179, term6179.getClass(), "pointSize", 0.8474802F);
        setField(term6179, term6179.getClass(), "peer", null);
        setLongField(term6179, term6179.getClass(), "pData", 2535595959091595249L);
        setField(term6179, term6179.getClass(), "font2DHandle", null);
        setField(term6179, term6179.getClass(), "values", null);
        setBooleanField(term6179, term6179.getClass(), "hasLayoutAttributes", true);
        setBooleanField(term6179, term6179.getClass(), "createdFont", true);
        setBooleanField(term6179, term6179.getClass(), "nonIdentityTx", false);
        setIntField(term6179, term6179.getClass(), "hash", 278355793);
        setIntField(term6179, term6179.getClass(), "fontSerializedDataVersion", -310648604);
        setLongField(term6211, term6211.getClass(), "timestamp", -5476826692763582090L);
        setField(term6211, term6211.getClass(), "referent", null);
        setField(term6213, term6213.getClass(), "lock", term6214);
        setField(term6213, term6213.getClass(), "head", null);
        setLongField(term6213, term6213.getClass(), "queueLength", -872011222785455006L);
        setField(term6211, term6211.getClass(), "queue", term6213);
        setField(term6211, term6211.getClass(), "next", null);
        setField(term6211, term6211.getClass(), "discovered", null);
        setField(term6179, term6179.getClass(), "flmref", term6211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GuiStatics");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Font");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term6179;
        args[1] = "ieCtQFdkii";
        callMethod(klass, "getTextWidth", argTypes, null, args);
    }

};


