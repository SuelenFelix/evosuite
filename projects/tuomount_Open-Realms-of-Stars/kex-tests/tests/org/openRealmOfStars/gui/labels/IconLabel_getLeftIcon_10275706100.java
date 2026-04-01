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

public class IconLabel_getLeftIcon_10275706100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30729;

    public IconLabel_getLeftIcon_10275706100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30729 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.IconLabel"));
        Object term30730 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term30731 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term30733 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term30742 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term30751 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term30752 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term30731, term30731.getClass(), "imageType", -1811706962);
        setField(term30731, term30731.getClass(), "colorModel", null);
        setField(term30733, term30733.getClass(), "sampleModel", null);
        setField(term30733, term30733.getClass(), "dataBuffer", null);
        setIntField(term30733, term30733.getClass(), "minX", -1242133071);
        setIntField(term30733, term30733.getClass(), "minY", -455052015);
        setIntField(term30733, term30733.getClass(), "width", -1322797287);
        setIntField(term30733, term30733.getClass(), "height", -615198242);
        setIntField(term30733, term30733.getClass(), "sampleModelTranslateX", -491132382);
        setIntField(term30733, term30733.getClass(), "sampleModelTranslateY", 918882916);
        setIntField(term30733, term30733.getClass(), "numBands", 1544012770);
        setIntField(term30733, term30733.getClass(), "numDataElements", 1922068039);
        setField(term30742, term30742.getClass(), "sampleModel", null);
        setField(term30742, term30742.getClass(), "dataBuffer", null);
        setIntField(term30742, term30742.getClass(), "minX", -410564443);
        setIntField(term30742, term30742.getClass(), "minY", 996017434);
        setIntField(term30742, term30742.getClass(), "width", -983870300);
        setIntField(term30742, term30742.getClass(), "height", 360715062);
        setIntField(term30742, term30742.getClass(), "sampleModelTranslateX", 1047409266);
        setIntField(term30742, term30742.getClass(), "sampleModelTranslateY", 1427248961);
        setIntField(term30742, term30742.getClass(), "numBands", 1445291866);
        setIntField(term30742, term30742.getClass(), "numDataElements", -139927812);
        setField(term30742, term30742.getClass(), "parent", null);
        setField(term30733, term30733.getClass(), "parent", term30742);
        setField(term30731, term30731.getClass(), "raster", term30733);
        setField(term30731, term30731.getClass(), "osis", null);
        setField(term30751, term30751.getClass(), "table", term30752);
        setIntField(term30751, term30751.getClass(), "count", 1);
        setIntField(term30751, term30751.getClass(), "threshold", 8);
        setFloatField(term30751, term30751.getClass(), "loadFactor", 0.75F);
        setIntField(term30751, term30751.getClass(), "modCount", 1);
        setField(term30751, term30751.getClass(), "keySet", null);
        setField(term30751, term30751.getClass(), "entrySet", null);
        setField(term30751, term30751.getClass(), "values", null);
        setField(term30731, term30731.getClass(), "properties", term30751);
        setFloatField(term30731, term30731.getClass(), "accelerationPriority", 0.5187846F);
        setField(term30731, term30731.getClass(), "surfaceManager", null);
        setField(term30730, term30730.getClass(), "img", term30731);
        setField(term30730, term30730.getClass(), "name", "nSWdsVyJRI");
        setIntField(term30730, term30730.getClass(), "index", 1782011477);
        setField(term30729, term30729.getClass(), "icon", term30730);
        setIntField(term30729, term30729.getClass(), "mnemonic", 2129957018);
        setIntField(term30729, term30729.getClass(), "mnemonicIndex", 691663312);
        setField(term30729, term30729.getClass(), "text", "JBOPGgGKnc");
        setField(term30729, term30729.getClass(), "defaultIcon", null);
        setField(term30729, term30729.getClass(), "disabledIcon", null);
        setBooleanField(term30729, term30729.getClass(), "disabledIconSet", false);
        setIntField(term30729, term30729.getClass(), "verticalAlignment", -1236696275);
        setIntField(term30729, term30729.getClass(), "horizontalAlignment", 575249858);
        setIntField(term30729, term30729.getClass(), "verticalTextPosition", -297957951);
        setIntField(term30729, term30729.getClass(), "horizontalTextPosition", -1816920588);
        setIntField(term30729, term30729.getClass(), "iconTextGap", 1674165862);
        setField(term30729, term30729.getClass(), "labelFor", null);
        setBooleanField(term30729, term30729.getClass(), "isAlignmentXSet", false);
        setFloatField(term30729, term30729.getClass(), "alignmentX", 0.0F);
        setBooleanField(term30729, term30729.getClass(), "isAlignmentYSet", false);
        setFloatField(term30729, term30729.getClass(), "alignmentY", 0.0F);
        setField(term30729, term30729.getClass(), "ui", null);
        setField(term30729, term30729.getClass(), "listenerList", null);
        setField(term30729, term30729.getClass(), "clientProperties", null);
        setField(term30729, term30729.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term30729, term30729.getClass(), "autoscrolls", false);
        setField(term30729, term30729.getClass(), "border", null);
        setIntField(term30729, term30729.getClass(), "flags", 0);
        setField(term30729, term30729.getClass(), "inputVerifier", null);
        setBooleanField(term30729, term30729.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term30729, term30729.getClass(), "paintingChild", null);
        setField(term30729, term30729.getClass(), "popupMenu", null);
        setField(term30729, term30729.getClass(), "revalidateRunnableScheduled", null);
        setField(term30729, term30729.getClass(), "focusInputMap", null);
        setField(term30729, term30729.getClass(), "ancestorInputMap", null);
        setField(term30729, term30729.getClass(), "windowInputMap", null);
        setField(term30729, term30729.getClass(), "actionMap", null);
        setField(term30729, term30729.getClass(), "aaHint", null);
        setField(term30729, term30729.getClass(), "lcdRenderingHint", null);
        setField(term30729, term30729.getClass(), "component", null);
        setField(term30729, term30729.getClass(), "layoutMgr", null);
        setField(term30729, term30729.getClass(), "dispatcher", null);
        setField(term30729, term30729.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term30729, term30729.getClass(), "focusCycleRoot", false);
        setBooleanField(term30729, term30729.getClass(), "focusTraversalPolicyProvider", false);
        setField(term30729, term30729.getClass(), "printingThreads", null);
        setBooleanField(term30729, term30729.getClass(), "printing", false);
        setField(term30729, term30729.getClass(), "containerListener", null);
        setIntField(term30729, term30729.getClass(), "listeningChildren", 0);
        setIntField(term30729, term30729.getClass(), "listeningBoundsChildren", 0);
        setIntField(term30729, term30729.getClass(), "descendantsCount", 0);
        setField(term30729, term30729.getClass(), "preserveBackgroundColor", null);
        setIntField(term30729, term30729.getClass(), "numOfHWComponents", 0);
        setIntField(term30729, term30729.getClass(), "numOfLWComponents", 0);
        setField(term30729, term30729.getClass(), "modalComp", null);
        setField(term30729, term30729.getClass(), "modalAppContext", null);
        setIntField(term30729, term30729.getClass(), "containerSerializedDataVersion", 0);
        setField(term30729, term30729.getClass(), "peer", null);
        setField(term30729, term30729.getClass(), "parent", null);
        setField(term30729, term30729.getClass(), "appContext", null);
        setIntField(term30729, term30729.getClass(), "x", 0);
        setIntField(term30729, term30729.getClass(), "y", 0);
        setIntField(term30729, term30729.getClass(), "width", 0);
        setIntField(term30729, term30729.getClass(), "height", 0);
        setField(term30729, term30729.getClass(), "foreground", null);
        setField(term30729, term30729.getClass(), "background", null);
        setField(term30729, term30729.getClass(), "font", null);
        setField(term30729, term30729.getClass(), "peerFont", null);
        setField(term30729, term30729.getClass(), "cursor", null);
        setField(term30729, term30729.getClass(), "locale", null);
        setField(term30729, term30729.getClass(), "graphicsConfig", null);
        setField(term30729, term30729.getClass(), "bufferStrategy", null);
        setBooleanField(term30729, term30729.getClass(), "ignoreRepaint", false);
        setBooleanField(term30729, term30729.getClass(), "visible", false);
        setBooleanField(term30729, term30729.getClass(), "enabled", false);
        setBooleanField(term30729, term30729.getClass(), "valid", false);
        setField(term30729, term30729.getClass(), "dropTarget", null);
        setField(term30729, term30729.getClass(), "popups", null);
        setField(term30729, term30729.getClass(), "name", null);
        setBooleanField(term30729, term30729.getClass(), "nameExplicitlySet", false);
        setBooleanField(term30729, term30729.getClass(), "focusable", false);
        setIntField(term30729, term30729.getClass(), "isFocusTraversableOverridden", 0);
        setField(term30729, term30729.getClass(), "focusTraversalKeys", null);
        setBooleanField(term30729, term30729.getClass(), "focusTraversalKeysEnabled", false);
        setField(term30729, term30729.getClass(), "acc", null);
        setField(term30729, term30729.getClass(), "minSize", null);
        setBooleanField(term30729, term30729.getClass(), "minSizeSet", false);
        setField(term30729, term30729.getClass(), "prefSize", null);
        setBooleanField(term30729, term30729.getClass(), "prefSizeSet", false);
        setField(term30729, term30729.getClass(), "maxSize", null);
        setBooleanField(term30729, term30729.getClass(), "maxSizeSet", false);
        setField(term30729, term30729.getClass(), "componentOrientation", null);
        setBooleanField(term30729, term30729.getClass(), "newEventsOnly", false);
        setField(term30729, term30729.getClass(), "componentListener", null);
        setField(term30729, term30729.getClass(), "focusListener", null);
        setField(term30729, term30729.getClass(), "hierarchyListener", null);
        setField(term30729, term30729.getClass(), "hierarchyBoundsListener", null);
        setField(term30729, term30729.getClass(), "keyListener", null);
        setField(term30729, term30729.getClass(), "mouseListener", null);
        setField(term30729, term30729.getClass(), "mouseMotionListener", null);
        setField(term30729, term30729.getClass(), "mouseWheelListener", null);
        setField(term30729, term30729.getClass(), "inputMethodListener", null);
        setLongField(term30729, term30729.getClass(), "eventMask", 0L);
        setField(term30729, term30729.getClass(), "changeSupport", null);
        setField(term30729, term30729.getClass(), "objectLock", null);
        setBooleanField(term30729, term30729.getClass(), "isPacked", false);
        setIntField(term30729, term30729.getClass(), "boundsOp", 0);
        setField(term30729, term30729.getClass(), "compoundShape", null);
        setField(term30729, term30729.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term30729, term30729.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term30729, term30729.getClass(), "backgroundEraseDisabled", false);
        setField(term30729, term30729.getClass(), "eventCache", null);
        setBooleanField(term30729, term30729.getClass(), "coalescingEnabled", false);
        setBooleanField(term30729, term30729.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term30729, term30729.getClass(), "componentSerializedDataVersion", 0);
        setField(term30729, term30729.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.IconLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLeftIcon", argTypes, term30729, args);
    }

};


