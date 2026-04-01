package org.openRealmOfStars.gui.panels;

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
import static org.openRealmOfStars.gui.panels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ImagePanel_getImage_135995309612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11268;

    public ImagePanel_getImage_135995309612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11268 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ImagePanel"));
        setField(term11268, term11268.getClass(), "image", null);
        setField(term11268, term11268.getClass(), "text", null);
        setBooleanField(term11268, term11268.getClass(), "isAlignmentXSet", false);
        setFloatField(term11268, term11268.getClass(), "alignmentX", 0.0F);
        setBooleanField(term11268, term11268.getClass(), "isAlignmentYSet", false);
        setFloatField(term11268, term11268.getClass(), "alignmentY", 0.0F);
        setField(term11268, term11268.getClass(), "ui", null);
        setField(term11268, term11268.getClass(), "listenerList", null);
        setField(term11268, term11268.getClass(), "clientProperties", null);
        setField(term11268, term11268.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term11268, term11268.getClass(), "autoscrolls", false);
        setField(term11268, term11268.getClass(), "border", null);
        setIntField(term11268, term11268.getClass(), "flags", 0);
        setField(term11268, term11268.getClass(), "inputVerifier", null);
        setBooleanField(term11268, term11268.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term11268, term11268.getClass(), "paintingChild", null);
        setField(term11268, term11268.getClass(), "popupMenu", null);
        setField(term11268, term11268.getClass(), "revalidateRunnableScheduled", null);
        setField(term11268, term11268.getClass(), "focusInputMap", null);
        setField(term11268, term11268.getClass(), "ancestorInputMap", null);
        setField(term11268, term11268.getClass(), "windowInputMap", null);
        setField(term11268, term11268.getClass(), "actionMap", null);
        setField(term11268, term11268.getClass(), "aaHint", null);
        setField(term11268, term11268.getClass(), "lcdRenderingHint", null);
        setField(term11268, term11268.getClass(), "component", null);
        setField(term11268, term11268.getClass(), "layoutMgr", null);
        setField(term11268, term11268.getClass(), "dispatcher", null);
        setField(term11268, term11268.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term11268, term11268.getClass(), "focusCycleRoot", false);
        setBooleanField(term11268, term11268.getClass(), "focusTraversalPolicyProvider", false);
        setField(term11268, term11268.getClass(), "printingThreads", null);
        setBooleanField(term11268, term11268.getClass(), "printing", false);
        setField(term11268, term11268.getClass(), "containerListener", null);
        setIntField(term11268, term11268.getClass(), "listeningChildren", 0);
        setIntField(term11268, term11268.getClass(), "listeningBoundsChildren", 0);
        setIntField(term11268, term11268.getClass(), "descendantsCount", 0);
        setField(term11268, term11268.getClass(), "preserveBackgroundColor", null);
        setIntField(term11268, term11268.getClass(), "numOfHWComponents", 0);
        setIntField(term11268, term11268.getClass(), "numOfLWComponents", 0);
        setField(term11268, term11268.getClass(), "modalComp", null);
        setField(term11268, term11268.getClass(), "modalAppContext", null);
        setIntField(term11268, term11268.getClass(), "containerSerializedDataVersion", 0);
        setField(term11268, term11268.getClass(), "peer", null);
        setField(term11268, term11268.getClass(), "parent", null);
        setField(term11268, term11268.getClass(), "appContext", null);
        setIntField(term11268, term11268.getClass(), "x", 0);
        setIntField(term11268, term11268.getClass(), "y", 0);
        setIntField(term11268, term11268.getClass(), "width", 0);
        setIntField(term11268, term11268.getClass(), "height", 0);
        setField(term11268, term11268.getClass(), "foreground", null);
        setField(term11268, term11268.getClass(), "background", null);
        setField(term11268, term11268.getClass(), "font", null);
        setField(term11268, term11268.getClass(), "peerFont", null);
        setField(term11268, term11268.getClass(), "cursor", null);
        setField(term11268, term11268.getClass(), "locale", null);
        setField(term11268, term11268.getClass(), "graphicsConfig", null);
        setField(term11268, term11268.getClass(), "bufferStrategy", null);
        setBooleanField(term11268, term11268.getClass(), "ignoreRepaint", false);
        setBooleanField(term11268, term11268.getClass(), "visible", false);
        setBooleanField(term11268, term11268.getClass(), "enabled", false);
        setBooleanField(term11268, term11268.getClass(), "valid", false);
        setField(term11268, term11268.getClass(), "dropTarget", null);
        setField(term11268, term11268.getClass(), "popups", null);
        setField(term11268, term11268.getClass(), "name", null);
        setBooleanField(term11268, term11268.getClass(), "nameExplicitlySet", false);
        setBooleanField(term11268, term11268.getClass(), "focusable", false);
        setIntField(term11268, term11268.getClass(), "isFocusTraversableOverridden", 0);
        setField(term11268, term11268.getClass(), "focusTraversalKeys", null);
        setBooleanField(term11268, term11268.getClass(), "focusTraversalKeysEnabled", false);
        setField(term11268, term11268.getClass(), "acc", null);
        setField(term11268, term11268.getClass(), "minSize", null);
        setBooleanField(term11268, term11268.getClass(), "minSizeSet", false);
        setField(term11268, term11268.getClass(), "prefSize", null);
        setBooleanField(term11268, term11268.getClass(), "prefSizeSet", false);
        setField(term11268, term11268.getClass(), "maxSize", null);
        setBooleanField(term11268, term11268.getClass(), "maxSizeSet", false);
        setField(term11268, term11268.getClass(), "componentOrientation", null);
        setBooleanField(term11268, term11268.getClass(), "newEventsOnly", false);
        setField(term11268, term11268.getClass(), "componentListener", null);
        setField(term11268, term11268.getClass(), "focusListener", null);
        setField(term11268, term11268.getClass(), "hierarchyListener", null);
        setField(term11268, term11268.getClass(), "hierarchyBoundsListener", null);
        setField(term11268, term11268.getClass(), "keyListener", null);
        setField(term11268, term11268.getClass(), "mouseListener", null);
        setField(term11268, term11268.getClass(), "mouseMotionListener", null);
        setField(term11268, term11268.getClass(), "mouseWheelListener", null);
        setField(term11268, term11268.getClass(), "inputMethodListener", null);
        setLongField(term11268, term11268.getClass(), "eventMask", 0L);
        setField(term11268, term11268.getClass(), "changeSupport", null);
        setField(term11268, term11268.getClass(), "objectLock", null);
        setBooleanField(term11268, term11268.getClass(), "isPacked", false);
        setIntField(term11268, term11268.getClass(), "boundsOp", 0);
        setField(term11268, term11268.getClass(), "compoundShape", null);
        setField(term11268, term11268.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term11268, term11268.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term11268, term11268.getClass(), "backgroundEraseDisabled", false);
        setField(term11268, term11268.getClass(), "eventCache", null);
        setBooleanField(term11268, term11268.getClass(), "coalescingEnabled", false);
        setBooleanField(term11268, term11268.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term11268, term11268.getClass(), "componentSerializedDataVersion", 0);
        setField(term11268, term11268.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ImagePanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImage", argTypes, term11268, args);
    }

};


