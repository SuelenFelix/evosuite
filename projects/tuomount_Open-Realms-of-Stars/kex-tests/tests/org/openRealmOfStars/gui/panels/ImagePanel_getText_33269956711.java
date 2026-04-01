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

public class ImagePanel_getText_33269956711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11227;

    public ImagePanel_getText_33269956711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11227 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ImagePanel"));
        setField(term11227, term11227.getClass(), "image", null);
        setField(term11227, term11227.getClass(), "text", null);
        setBooleanField(term11227, term11227.getClass(), "isAlignmentXSet", false);
        setFloatField(term11227, term11227.getClass(), "alignmentX", 0.0F);
        setBooleanField(term11227, term11227.getClass(), "isAlignmentYSet", false);
        setFloatField(term11227, term11227.getClass(), "alignmentY", 0.0F);
        setField(term11227, term11227.getClass(), "ui", null);
        setField(term11227, term11227.getClass(), "listenerList", null);
        setField(term11227, term11227.getClass(), "clientProperties", null);
        setField(term11227, term11227.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term11227, term11227.getClass(), "autoscrolls", false);
        setField(term11227, term11227.getClass(), "border", null);
        setIntField(term11227, term11227.getClass(), "flags", 0);
        setField(term11227, term11227.getClass(), "inputVerifier", null);
        setBooleanField(term11227, term11227.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term11227, term11227.getClass(), "paintingChild", null);
        setField(term11227, term11227.getClass(), "popupMenu", null);
        setField(term11227, term11227.getClass(), "revalidateRunnableScheduled", null);
        setField(term11227, term11227.getClass(), "focusInputMap", null);
        setField(term11227, term11227.getClass(), "ancestorInputMap", null);
        setField(term11227, term11227.getClass(), "windowInputMap", null);
        setField(term11227, term11227.getClass(), "actionMap", null);
        setField(term11227, term11227.getClass(), "aaHint", null);
        setField(term11227, term11227.getClass(), "lcdRenderingHint", null);
        setField(term11227, term11227.getClass(), "component", null);
        setField(term11227, term11227.getClass(), "layoutMgr", null);
        setField(term11227, term11227.getClass(), "dispatcher", null);
        setField(term11227, term11227.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term11227, term11227.getClass(), "focusCycleRoot", false);
        setBooleanField(term11227, term11227.getClass(), "focusTraversalPolicyProvider", false);
        setField(term11227, term11227.getClass(), "printingThreads", null);
        setBooleanField(term11227, term11227.getClass(), "printing", false);
        setField(term11227, term11227.getClass(), "containerListener", null);
        setIntField(term11227, term11227.getClass(), "listeningChildren", 0);
        setIntField(term11227, term11227.getClass(), "listeningBoundsChildren", 0);
        setIntField(term11227, term11227.getClass(), "descendantsCount", 0);
        setField(term11227, term11227.getClass(), "preserveBackgroundColor", null);
        setIntField(term11227, term11227.getClass(), "numOfHWComponents", 0);
        setIntField(term11227, term11227.getClass(), "numOfLWComponents", 0);
        setField(term11227, term11227.getClass(), "modalComp", null);
        setField(term11227, term11227.getClass(), "modalAppContext", null);
        setIntField(term11227, term11227.getClass(), "containerSerializedDataVersion", 0);
        setField(term11227, term11227.getClass(), "peer", null);
        setField(term11227, term11227.getClass(), "parent", null);
        setField(term11227, term11227.getClass(), "appContext", null);
        setIntField(term11227, term11227.getClass(), "x", 0);
        setIntField(term11227, term11227.getClass(), "y", 0);
        setIntField(term11227, term11227.getClass(), "width", 0);
        setIntField(term11227, term11227.getClass(), "height", 0);
        setField(term11227, term11227.getClass(), "foreground", null);
        setField(term11227, term11227.getClass(), "background", null);
        setField(term11227, term11227.getClass(), "font", null);
        setField(term11227, term11227.getClass(), "peerFont", null);
        setField(term11227, term11227.getClass(), "cursor", null);
        setField(term11227, term11227.getClass(), "locale", null);
        setField(term11227, term11227.getClass(), "graphicsConfig", null);
        setField(term11227, term11227.getClass(), "bufferStrategy", null);
        setBooleanField(term11227, term11227.getClass(), "ignoreRepaint", false);
        setBooleanField(term11227, term11227.getClass(), "visible", false);
        setBooleanField(term11227, term11227.getClass(), "enabled", false);
        setBooleanField(term11227, term11227.getClass(), "valid", false);
        setField(term11227, term11227.getClass(), "dropTarget", null);
        setField(term11227, term11227.getClass(), "popups", null);
        setField(term11227, term11227.getClass(), "name", null);
        setBooleanField(term11227, term11227.getClass(), "nameExplicitlySet", false);
        setBooleanField(term11227, term11227.getClass(), "focusable", false);
        setIntField(term11227, term11227.getClass(), "isFocusTraversableOverridden", 0);
        setField(term11227, term11227.getClass(), "focusTraversalKeys", null);
        setBooleanField(term11227, term11227.getClass(), "focusTraversalKeysEnabled", false);
        setField(term11227, term11227.getClass(), "acc", null);
        setField(term11227, term11227.getClass(), "minSize", null);
        setBooleanField(term11227, term11227.getClass(), "minSizeSet", false);
        setField(term11227, term11227.getClass(), "prefSize", null);
        setBooleanField(term11227, term11227.getClass(), "prefSizeSet", false);
        setField(term11227, term11227.getClass(), "maxSize", null);
        setBooleanField(term11227, term11227.getClass(), "maxSizeSet", false);
        setField(term11227, term11227.getClass(), "componentOrientation", null);
        setBooleanField(term11227, term11227.getClass(), "newEventsOnly", false);
        setField(term11227, term11227.getClass(), "componentListener", null);
        setField(term11227, term11227.getClass(), "focusListener", null);
        setField(term11227, term11227.getClass(), "hierarchyListener", null);
        setField(term11227, term11227.getClass(), "hierarchyBoundsListener", null);
        setField(term11227, term11227.getClass(), "keyListener", null);
        setField(term11227, term11227.getClass(), "mouseListener", null);
        setField(term11227, term11227.getClass(), "mouseMotionListener", null);
        setField(term11227, term11227.getClass(), "mouseWheelListener", null);
        setField(term11227, term11227.getClass(), "inputMethodListener", null);
        setLongField(term11227, term11227.getClass(), "eventMask", 0L);
        setField(term11227, term11227.getClass(), "changeSupport", null);
        setField(term11227, term11227.getClass(), "objectLock", null);
        setBooleanField(term11227, term11227.getClass(), "isPacked", false);
        setIntField(term11227, term11227.getClass(), "boundsOp", 0);
        setField(term11227, term11227.getClass(), "compoundShape", null);
        setField(term11227, term11227.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term11227, term11227.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term11227, term11227.getClass(), "backgroundEraseDisabled", false);
        setField(term11227, term11227.getClass(), "eventCache", null);
        setBooleanField(term11227, term11227.getClass(), "coalescingEnabled", false);
        setBooleanField(term11227, term11227.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term11227, term11227.getClass(), "componentSerializedDataVersion", 0);
        setField(term11227, term11227.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ImagePanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term11227, args);
    }

};


