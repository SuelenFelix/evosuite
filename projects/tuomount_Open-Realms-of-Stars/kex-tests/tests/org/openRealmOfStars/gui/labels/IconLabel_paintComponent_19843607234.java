package org.openRealmOfStars.gui.labels;

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
import static org.openRealmOfStars.gui.labels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IconLabel_paintComponent_19843607234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31241;

    public IconLabel_paintComponent_19843607234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31241 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.IconLabel"));
        Object term31242 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term31243 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term31245 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term31254 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term31263 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term31264 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term31243, term31243.getClass(), "imageType", -571931590);
        setField(term31243, term31243.getClass(), "colorModel", null);
        setField(term31245, term31245.getClass(), "sampleModel", null);
        setField(term31245, term31245.getClass(), "dataBuffer", null);
        setIntField(term31245, term31245.getClass(), "minX", 37757400);
        setIntField(term31245, term31245.getClass(), "minY", -1632221612);
        setIntField(term31245, term31245.getClass(), "width", 1545314376);
        setIntField(term31245, term31245.getClass(), "height", 437959151);
        setIntField(term31245, term31245.getClass(), "sampleModelTranslateX", 27780241);
        setIntField(term31245, term31245.getClass(), "sampleModelTranslateY", -683868408);
        setIntField(term31245, term31245.getClass(), "numBands", -381130069);
        setIntField(term31245, term31245.getClass(), "numDataElements", 885769749);
        setField(term31254, term31254.getClass(), "sampleModel", null);
        setField(term31254, term31254.getClass(), "dataBuffer", null);
        setIntField(term31254, term31254.getClass(), "minX", -1021168716);
        setIntField(term31254, term31254.getClass(), "minY", -1238055654);
        setIntField(term31254, term31254.getClass(), "width", 1561513428);
        setIntField(term31254, term31254.getClass(), "height", 778959809);
        setIntField(term31254, term31254.getClass(), "sampleModelTranslateX", -7504064);
        setIntField(term31254, term31254.getClass(), "sampleModelTranslateY", -1464364418);
        setIntField(term31254, term31254.getClass(), "numBands", 1050420173);
        setIntField(term31254, term31254.getClass(), "numDataElements", 994300935);
        setField(term31254, term31254.getClass(), "parent", null);
        setField(term31245, term31245.getClass(), "parent", term31254);
        setField(term31243, term31243.getClass(), "raster", term31245);
        setField(term31243, term31243.getClass(), "osis", null);
        setField(term31263, term31263.getClass(), "table", term31264);
        setIntField(term31263, term31263.getClass(), "count", 1);
        setIntField(term31263, term31263.getClass(), "threshold", 8);
        setFloatField(term31263, term31263.getClass(), "loadFactor", 0.75F);
        setIntField(term31263, term31263.getClass(), "modCount", 1);
        setField(term31263, term31263.getClass(), "keySet", null);
        setField(term31263, term31263.getClass(), "entrySet", null);
        setField(term31263, term31263.getClass(), "values", null);
        setField(term31243, term31243.getClass(), "properties", term31263);
        setFloatField(term31243, term31243.getClass(), "accelerationPriority", 0.6496153F);
        setField(term31243, term31243.getClass(), "surfaceManager", null);
        setField(term31242, term31242.getClass(), "img", term31243);
        setField(term31242, term31242.getClass(), "name", "uXYojRmxrM");
        setIntField(term31242, term31242.getClass(), "index", 1780958641);
        setField(term31241, term31241.getClass(), "icon", term31242);
        setIntField(term31241, term31241.getClass(), "mnemonic", 1890582085);
        setIntField(term31241, term31241.getClass(), "mnemonicIndex", 2146568808);
        setField(term31241, term31241.getClass(), "text", "cxRwRcodud");
        setField(term31241, term31241.getClass(), "defaultIcon", null);
        setField(term31241, term31241.getClass(), "disabledIcon", null);
        setBooleanField(term31241, term31241.getClass(), "disabledIconSet", false);
        setIntField(term31241, term31241.getClass(), "verticalAlignment", 245081679);
        setIntField(term31241, term31241.getClass(), "horizontalAlignment", 1199789398);
        setIntField(term31241, term31241.getClass(), "verticalTextPosition", -1056402285);
        setIntField(term31241, term31241.getClass(), "horizontalTextPosition", 1881803912);
        setIntField(term31241, term31241.getClass(), "iconTextGap", -188535038);
        setField(term31241, term31241.getClass(), "labelFor", null);
        setBooleanField(term31241, term31241.getClass(), "isAlignmentXSet", false);
        setFloatField(term31241, term31241.getClass(), "alignmentX", 0.0F);
        setBooleanField(term31241, term31241.getClass(), "isAlignmentYSet", false);
        setFloatField(term31241, term31241.getClass(), "alignmentY", 0.0F);
        setField(term31241, term31241.getClass(), "ui", null);
        setField(term31241, term31241.getClass(), "listenerList", null);
        setField(term31241, term31241.getClass(), "clientProperties", null);
        setField(term31241, term31241.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term31241, term31241.getClass(), "autoscrolls", false);
        setField(term31241, term31241.getClass(), "border", null);
        setIntField(term31241, term31241.getClass(), "flags", 0);
        setField(term31241, term31241.getClass(), "inputVerifier", null);
        setBooleanField(term31241, term31241.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term31241, term31241.getClass(), "paintingChild", null);
        setField(term31241, term31241.getClass(), "popupMenu", null);
        setField(term31241, term31241.getClass(), "revalidateRunnableScheduled", null);
        setField(term31241, term31241.getClass(), "focusInputMap", null);
        setField(term31241, term31241.getClass(), "ancestorInputMap", null);
        setField(term31241, term31241.getClass(), "windowInputMap", null);
        setField(term31241, term31241.getClass(), "actionMap", null);
        setField(term31241, term31241.getClass(), "aaHint", null);
        setField(term31241, term31241.getClass(), "lcdRenderingHint", null);
        setField(term31241, term31241.getClass(), "component", null);
        setField(term31241, term31241.getClass(), "layoutMgr", null);
        setField(term31241, term31241.getClass(), "dispatcher", null);
        setField(term31241, term31241.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term31241, term31241.getClass(), "focusCycleRoot", false);
        setBooleanField(term31241, term31241.getClass(), "focusTraversalPolicyProvider", false);
        setField(term31241, term31241.getClass(), "printingThreads", null);
        setBooleanField(term31241, term31241.getClass(), "printing", false);
        setField(term31241, term31241.getClass(), "containerListener", null);
        setIntField(term31241, term31241.getClass(), "listeningChildren", 0);
        setIntField(term31241, term31241.getClass(), "listeningBoundsChildren", 0);
        setIntField(term31241, term31241.getClass(), "descendantsCount", 0);
        setField(term31241, term31241.getClass(), "preserveBackgroundColor", null);
        setIntField(term31241, term31241.getClass(), "numOfHWComponents", 0);
        setIntField(term31241, term31241.getClass(), "numOfLWComponents", 0);
        setField(term31241, term31241.getClass(), "modalComp", null);
        setField(term31241, term31241.getClass(), "modalAppContext", null);
        setIntField(term31241, term31241.getClass(), "containerSerializedDataVersion", 0);
        setField(term31241, term31241.getClass(), "peer", null);
        setField(term31241, term31241.getClass(), "parent", null);
        setField(term31241, term31241.getClass(), "appContext", null);
        setIntField(term31241, term31241.getClass(), "x", 0);
        setIntField(term31241, term31241.getClass(), "y", 0);
        setIntField(term31241, term31241.getClass(), "width", 0);
        setIntField(term31241, term31241.getClass(), "height", 0);
        setField(term31241, term31241.getClass(), "foreground", null);
        setField(term31241, term31241.getClass(), "background", null);
        setField(term31241, term31241.getClass(), "font", null);
        setField(term31241, term31241.getClass(), "peerFont", null);
        setField(term31241, term31241.getClass(), "cursor", null);
        setField(term31241, term31241.getClass(), "locale", null);
        setField(term31241, term31241.getClass(), "graphicsConfig", null);
        setField(term31241, term31241.getClass(), "bufferStrategy", null);
        setBooleanField(term31241, term31241.getClass(), "ignoreRepaint", false);
        setBooleanField(term31241, term31241.getClass(), "visible", false);
        setBooleanField(term31241, term31241.getClass(), "enabled", false);
        setBooleanField(term31241, term31241.getClass(), "valid", false);
        setField(term31241, term31241.getClass(), "dropTarget", null);
        setField(term31241, term31241.getClass(), "popups", null);
        setField(term31241, term31241.getClass(), "name", null);
        setBooleanField(term31241, term31241.getClass(), "nameExplicitlySet", false);
        setBooleanField(term31241, term31241.getClass(), "focusable", false);
        setIntField(term31241, term31241.getClass(), "isFocusTraversableOverridden", 0);
        setField(term31241, term31241.getClass(), "focusTraversalKeys", null);
        setBooleanField(term31241, term31241.getClass(), "focusTraversalKeysEnabled", false);
        setField(term31241, term31241.getClass(), "acc", null);
        setField(term31241, term31241.getClass(), "minSize", null);
        setBooleanField(term31241, term31241.getClass(), "minSizeSet", false);
        setField(term31241, term31241.getClass(), "prefSize", null);
        setBooleanField(term31241, term31241.getClass(), "prefSizeSet", false);
        setField(term31241, term31241.getClass(), "maxSize", null);
        setBooleanField(term31241, term31241.getClass(), "maxSizeSet", false);
        setField(term31241, term31241.getClass(), "componentOrientation", null);
        setBooleanField(term31241, term31241.getClass(), "newEventsOnly", false);
        setField(term31241, term31241.getClass(), "componentListener", null);
        setField(term31241, term31241.getClass(), "focusListener", null);
        setField(term31241, term31241.getClass(), "hierarchyListener", null);
        setField(term31241, term31241.getClass(), "hierarchyBoundsListener", null);
        setField(term31241, term31241.getClass(), "keyListener", null);
        setField(term31241, term31241.getClass(), "mouseListener", null);
        setField(term31241, term31241.getClass(), "mouseMotionListener", null);
        setField(term31241, term31241.getClass(), "mouseWheelListener", null);
        setField(term31241, term31241.getClass(), "inputMethodListener", null);
        setLongField(term31241, term31241.getClass(), "eventMask", 0L);
        setField(term31241, term31241.getClass(), "changeSupport", null);
        setField(term31241, term31241.getClass(), "objectLock", null);
        setBooleanField(term31241, term31241.getClass(), "isPacked", false);
        setIntField(term31241, term31241.getClass(), "boundsOp", 0);
        setField(term31241, term31241.getClass(), "compoundShape", null);
        setField(term31241, term31241.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term31241, term31241.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term31241, term31241.getClass(), "backgroundEraseDisabled", false);
        setField(term31241, term31241.getClass(), "eventCache", null);
        setBooleanField(term31241, term31241.getClass(), "coalescingEnabled", false);
        setBooleanField(term31241, term31241.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term31241, term31241.getClass(), "componentSerializedDataVersion", 0);
        setField(term31241, term31241.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.IconLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term31241, args);
    }

};


