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

public class IconLabel_createToolTip_2289033713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31119;

    public IconLabel_createToolTip_2289033713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31119 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.IconLabel"));
        Object term31120 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term31121 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term31123 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term31132 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term31141 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term31142 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setIntField(term31121, term31121.getClass(), "imageType", -21429773);
        setField(term31121, term31121.getClass(), "colorModel", null);
        setField(term31123, term31123.getClass(), "sampleModel", null);
        setField(term31123, term31123.getClass(), "dataBuffer", null);
        setIntField(term31123, term31123.getClass(), "minX", 1774728742);
        setIntField(term31123, term31123.getClass(), "minY", -1822211508);
        setIntField(term31123, term31123.getClass(), "width", -177243872);
        setIntField(term31123, term31123.getClass(), "height", 1485047282);
        setIntField(term31123, term31123.getClass(), "sampleModelTranslateX", 1624190794);
        setIntField(term31123, term31123.getClass(), "sampleModelTranslateY", -773608881);
        setIntField(term31123, term31123.getClass(), "numBands", -1642688455);
        setIntField(term31123, term31123.getClass(), "numDataElements", -1184558215);
        setField(term31132, term31132.getClass(), "sampleModel", null);
        setField(term31132, term31132.getClass(), "dataBuffer", null);
        setIntField(term31132, term31132.getClass(), "minX", 2123688338);
        setIntField(term31132, term31132.getClass(), "minY", -1051941387);
        setIntField(term31132, term31132.getClass(), "width", -640763660);
        setIntField(term31132, term31132.getClass(), "height", -1189468129);
        setIntField(term31132, term31132.getClass(), "sampleModelTranslateX", -1099664830);
        setIntField(term31132, term31132.getClass(), "sampleModelTranslateY", 873502011);
        setIntField(term31132, term31132.getClass(), "numBands", -2004575734);
        setIntField(term31132, term31132.getClass(), "numDataElements", 1491468856);
        setField(term31132, term31132.getClass(), "parent", null);
        setField(term31123, term31123.getClass(), "parent", term31132);
        setField(term31121, term31121.getClass(), "raster", term31123);
        setField(term31121, term31121.getClass(), "osis", null);
        setField(term31141, term31141.getClass(), "table", term31142);
        setIntField(term31141, term31141.getClass(), "count", 1);
        setIntField(term31141, term31141.getClass(), "threshold", 8);
        setFloatField(term31141, term31141.getClass(), "loadFactor", 0.75F);
        setIntField(term31141, term31141.getClass(), "modCount", 1);
        setField(term31141, term31141.getClass(), "keySet", null);
        setField(term31141, term31141.getClass(), "entrySet", null);
        setField(term31141, term31141.getClass(), "values", null);
        setField(term31121, term31121.getClass(), "properties", term31141);
        setFloatField(term31121, term31121.getClass(), "accelerationPriority", 0.36261773F);
        setField(term31121, term31121.getClass(), "surfaceManager", null);
        setField(term31120, term31120.getClass(), "img", term31121);
        setField(term31120, term31120.getClass(), "name", "NFkbBiPeiw");
        setIntField(term31120, term31120.getClass(), "index", 2146718886);
        setField(term31119, term31119.getClass(), "icon", term31120);
        setIntField(term31119, term31119.getClass(), "mnemonic", -985577036);
        setIntField(term31119, term31119.getClass(), "mnemonicIndex", 802539130);
        setField(term31119, term31119.getClass(), "text", "tlRvilQyjJ");
        setField(term31119, term31119.getClass(), "defaultIcon", null);
        setField(term31119, term31119.getClass(), "disabledIcon", null);
        setBooleanField(term31119, term31119.getClass(), "disabledIconSet", false);
        setIntField(term31119, term31119.getClass(), "verticalAlignment", 2105146188);
        setIntField(term31119, term31119.getClass(), "horizontalAlignment", -862415480);
        setIntField(term31119, term31119.getClass(), "verticalTextPosition", 312605349);
        setIntField(term31119, term31119.getClass(), "horizontalTextPosition", -402072606);
        setIntField(term31119, term31119.getClass(), "iconTextGap", -477355193);
        setField(term31119, term31119.getClass(), "labelFor", null);
        setBooleanField(term31119, term31119.getClass(), "isAlignmentXSet", false);
        setFloatField(term31119, term31119.getClass(), "alignmentX", 0.0F);
        setBooleanField(term31119, term31119.getClass(), "isAlignmentYSet", false);
        setFloatField(term31119, term31119.getClass(), "alignmentY", 0.0F);
        setField(term31119, term31119.getClass(), "ui", null);
        setField(term31119, term31119.getClass(), "listenerList", null);
        setField(term31119, term31119.getClass(), "clientProperties", null);
        setField(term31119, term31119.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term31119, term31119.getClass(), "autoscrolls", false);
        setField(term31119, term31119.getClass(), "border", null);
        setIntField(term31119, term31119.getClass(), "flags", 0);
        setField(term31119, term31119.getClass(), "inputVerifier", null);
        setBooleanField(term31119, term31119.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term31119, term31119.getClass(), "paintingChild", null);
        setField(term31119, term31119.getClass(), "popupMenu", null);
        setField(term31119, term31119.getClass(), "revalidateRunnableScheduled", null);
        setField(term31119, term31119.getClass(), "focusInputMap", null);
        setField(term31119, term31119.getClass(), "ancestorInputMap", null);
        setField(term31119, term31119.getClass(), "windowInputMap", null);
        setField(term31119, term31119.getClass(), "actionMap", null);
        setField(term31119, term31119.getClass(), "aaHint", null);
        setField(term31119, term31119.getClass(), "lcdRenderingHint", null);
        setField(term31119, term31119.getClass(), "component", null);
        setField(term31119, term31119.getClass(), "layoutMgr", null);
        setField(term31119, term31119.getClass(), "dispatcher", null);
        setField(term31119, term31119.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term31119, term31119.getClass(), "focusCycleRoot", false);
        setBooleanField(term31119, term31119.getClass(), "focusTraversalPolicyProvider", false);
        setField(term31119, term31119.getClass(), "printingThreads", null);
        setBooleanField(term31119, term31119.getClass(), "printing", false);
        setField(term31119, term31119.getClass(), "containerListener", null);
        setIntField(term31119, term31119.getClass(), "listeningChildren", 0);
        setIntField(term31119, term31119.getClass(), "listeningBoundsChildren", 0);
        setIntField(term31119, term31119.getClass(), "descendantsCount", 0);
        setField(term31119, term31119.getClass(), "preserveBackgroundColor", null);
        setIntField(term31119, term31119.getClass(), "numOfHWComponents", 0);
        setIntField(term31119, term31119.getClass(), "numOfLWComponents", 0);
        setField(term31119, term31119.getClass(), "modalComp", null);
        setField(term31119, term31119.getClass(), "modalAppContext", null);
        setIntField(term31119, term31119.getClass(), "containerSerializedDataVersion", 0);
        setField(term31119, term31119.getClass(), "peer", null);
        setField(term31119, term31119.getClass(), "parent", null);
        setField(term31119, term31119.getClass(), "appContext", null);
        setIntField(term31119, term31119.getClass(), "x", 0);
        setIntField(term31119, term31119.getClass(), "y", 0);
        setIntField(term31119, term31119.getClass(), "width", 0);
        setIntField(term31119, term31119.getClass(), "height", 0);
        setField(term31119, term31119.getClass(), "foreground", null);
        setField(term31119, term31119.getClass(), "background", null);
        setField(term31119, term31119.getClass(), "font", null);
        setField(term31119, term31119.getClass(), "peerFont", null);
        setField(term31119, term31119.getClass(), "cursor", null);
        setField(term31119, term31119.getClass(), "locale", null);
        setField(term31119, term31119.getClass(), "graphicsConfig", null);
        setField(term31119, term31119.getClass(), "bufferStrategy", null);
        setBooleanField(term31119, term31119.getClass(), "ignoreRepaint", false);
        setBooleanField(term31119, term31119.getClass(), "visible", false);
        setBooleanField(term31119, term31119.getClass(), "enabled", false);
        setBooleanField(term31119, term31119.getClass(), "valid", false);
        setField(term31119, term31119.getClass(), "dropTarget", null);
        setField(term31119, term31119.getClass(), "popups", null);
        setField(term31119, term31119.getClass(), "name", null);
        setBooleanField(term31119, term31119.getClass(), "nameExplicitlySet", false);
        setBooleanField(term31119, term31119.getClass(), "focusable", false);
        setIntField(term31119, term31119.getClass(), "isFocusTraversableOverridden", 0);
        setField(term31119, term31119.getClass(), "focusTraversalKeys", null);
        setBooleanField(term31119, term31119.getClass(), "focusTraversalKeysEnabled", false);
        setField(term31119, term31119.getClass(), "acc", null);
        setField(term31119, term31119.getClass(), "minSize", null);
        setBooleanField(term31119, term31119.getClass(), "minSizeSet", false);
        setField(term31119, term31119.getClass(), "prefSize", null);
        setBooleanField(term31119, term31119.getClass(), "prefSizeSet", false);
        setField(term31119, term31119.getClass(), "maxSize", null);
        setBooleanField(term31119, term31119.getClass(), "maxSizeSet", false);
        setField(term31119, term31119.getClass(), "componentOrientation", null);
        setBooleanField(term31119, term31119.getClass(), "newEventsOnly", false);
        setField(term31119, term31119.getClass(), "componentListener", null);
        setField(term31119, term31119.getClass(), "focusListener", null);
        setField(term31119, term31119.getClass(), "hierarchyListener", null);
        setField(term31119, term31119.getClass(), "hierarchyBoundsListener", null);
        setField(term31119, term31119.getClass(), "keyListener", null);
        setField(term31119, term31119.getClass(), "mouseListener", null);
        setField(term31119, term31119.getClass(), "mouseMotionListener", null);
        setField(term31119, term31119.getClass(), "mouseWheelListener", null);
        setField(term31119, term31119.getClass(), "inputMethodListener", null);
        setLongField(term31119, term31119.getClass(), "eventMask", 0L);
        setField(term31119, term31119.getClass(), "changeSupport", null);
        setField(term31119, term31119.getClass(), "objectLock", null);
        setBooleanField(term31119, term31119.getClass(), "isPacked", false);
        setIntField(term31119, term31119.getClass(), "boundsOp", 0);
        setField(term31119, term31119.getClass(), "compoundShape", null);
        setField(term31119, term31119.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term31119, term31119.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term31119, term31119.getClass(), "backgroundEraseDisabled", false);
        setField(term31119, term31119.getClass(), "eventCache", null);
        setBooleanField(term31119, term31119.getClass(), "coalescingEnabled", false);
        setBooleanField(term31119, term31119.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term31119, term31119.getClass(), "componentSerializedDataVersion", 0);
        setField(term31119, term31119.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.IconLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term31119, args);
    }

};


