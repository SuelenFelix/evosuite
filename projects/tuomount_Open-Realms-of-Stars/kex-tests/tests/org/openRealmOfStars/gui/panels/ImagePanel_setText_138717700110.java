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

public class ImagePanel_setText_138717700110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11186;

    public ImagePanel_setText_138717700110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11186 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ImagePanel"));
        setField(term11186, term11186.getClass(), "image", null);
        setField(term11186, term11186.getClass(), "text", null);
        setBooleanField(term11186, term11186.getClass(), "isAlignmentXSet", false);
        setFloatField(term11186, term11186.getClass(), "alignmentX", 0.0F);
        setBooleanField(term11186, term11186.getClass(), "isAlignmentYSet", false);
        setFloatField(term11186, term11186.getClass(), "alignmentY", 0.0F);
        setField(term11186, term11186.getClass(), "ui", null);
        setField(term11186, term11186.getClass(), "listenerList", null);
        setField(term11186, term11186.getClass(), "clientProperties", null);
        setField(term11186, term11186.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term11186, term11186.getClass(), "autoscrolls", false);
        setField(term11186, term11186.getClass(), "border", null);
        setIntField(term11186, term11186.getClass(), "flags", 0);
        setField(term11186, term11186.getClass(), "inputVerifier", null);
        setBooleanField(term11186, term11186.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term11186, term11186.getClass(), "paintingChild", null);
        setField(term11186, term11186.getClass(), "popupMenu", null);
        setField(term11186, term11186.getClass(), "revalidateRunnableScheduled", null);
        setField(term11186, term11186.getClass(), "focusInputMap", null);
        setField(term11186, term11186.getClass(), "ancestorInputMap", null);
        setField(term11186, term11186.getClass(), "windowInputMap", null);
        setField(term11186, term11186.getClass(), "actionMap", null);
        setField(term11186, term11186.getClass(), "aaHint", null);
        setField(term11186, term11186.getClass(), "lcdRenderingHint", null);
        setField(term11186, term11186.getClass(), "component", null);
        setField(term11186, term11186.getClass(), "layoutMgr", null);
        setField(term11186, term11186.getClass(), "dispatcher", null);
        setField(term11186, term11186.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term11186, term11186.getClass(), "focusCycleRoot", false);
        setBooleanField(term11186, term11186.getClass(), "focusTraversalPolicyProvider", false);
        setField(term11186, term11186.getClass(), "printingThreads", null);
        setBooleanField(term11186, term11186.getClass(), "printing", false);
        setField(term11186, term11186.getClass(), "containerListener", null);
        setIntField(term11186, term11186.getClass(), "listeningChildren", 0);
        setIntField(term11186, term11186.getClass(), "listeningBoundsChildren", 0);
        setIntField(term11186, term11186.getClass(), "descendantsCount", 0);
        setField(term11186, term11186.getClass(), "preserveBackgroundColor", null);
        setIntField(term11186, term11186.getClass(), "numOfHWComponents", 0);
        setIntField(term11186, term11186.getClass(), "numOfLWComponents", 0);
        setField(term11186, term11186.getClass(), "modalComp", null);
        setField(term11186, term11186.getClass(), "modalAppContext", null);
        setIntField(term11186, term11186.getClass(), "containerSerializedDataVersion", 0);
        setField(term11186, term11186.getClass(), "peer", null);
        setField(term11186, term11186.getClass(), "parent", null);
        setField(term11186, term11186.getClass(), "appContext", null);
        setIntField(term11186, term11186.getClass(), "x", 0);
        setIntField(term11186, term11186.getClass(), "y", 0);
        setIntField(term11186, term11186.getClass(), "width", 0);
        setIntField(term11186, term11186.getClass(), "height", 0);
        setField(term11186, term11186.getClass(), "foreground", null);
        setField(term11186, term11186.getClass(), "background", null);
        setField(term11186, term11186.getClass(), "font", null);
        setField(term11186, term11186.getClass(), "peerFont", null);
        setField(term11186, term11186.getClass(), "cursor", null);
        setField(term11186, term11186.getClass(), "locale", null);
        setField(term11186, term11186.getClass(), "graphicsConfig", null);
        setField(term11186, term11186.getClass(), "bufferStrategy", null);
        setBooleanField(term11186, term11186.getClass(), "ignoreRepaint", false);
        setBooleanField(term11186, term11186.getClass(), "visible", false);
        setBooleanField(term11186, term11186.getClass(), "enabled", false);
        setBooleanField(term11186, term11186.getClass(), "valid", false);
        setField(term11186, term11186.getClass(), "dropTarget", null);
        setField(term11186, term11186.getClass(), "popups", null);
        setField(term11186, term11186.getClass(), "name", null);
        setBooleanField(term11186, term11186.getClass(), "nameExplicitlySet", false);
        setBooleanField(term11186, term11186.getClass(), "focusable", false);
        setIntField(term11186, term11186.getClass(), "isFocusTraversableOverridden", 0);
        setField(term11186, term11186.getClass(), "focusTraversalKeys", null);
        setBooleanField(term11186, term11186.getClass(), "focusTraversalKeysEnabled", false);
        setField(term11186, term11186.getClass(), "acc", null);
        setField(term11186, term11186.getClass(), "minSize", null);
        setBooleanField(term11186, term11186.getClass(), "minSizeSet", false);
        setField(term11186, term11186.getClass(), "prefSize", null);
        setBooleanField(term11186, term11186.getClass(), "prefSizeSet", false);
        setField(term11186, term11186.getClass(), "maxSize", null);
        setBooleanField(term11186, term11186.getClass(), "maxSizeSet", false);
        setField(term11186, term11186.getClass(), "componentOrientation", null);
        setBooleanField(term11186, term11186.getClass(), "newEventsOnly", false);
        setField(term11186, term11186.getClass(), "componentListener", null);
        setField(term11186, term11186.getClass(), "focusListener", null);
        setField(term11186, term11186.getClass(), "hierarchyListener", null);
        setField(term11186, term11186.getClass(), "hierarchyBoundsListener", null);
        setField(term11186, term11186.getClass(), "keyListener", null);
        setField(term11186, term11186.getClass(), "mouseListener", null);
        setField(term11186, term11186.getClass(), "mouseMotionListener", null);
        setField(term11186, term11186.getClass(), "mouseWheelListener", null);
        setField(term11186, term11186.getClass(), "inputMethodListener", null);
        setLongField(term11186, term11186.getClass(), "eventMask", 0L);
        setField(term11186, term11186.getClass(), "changeSupport", null);
        setField(term11186, term11186.getClass(), "objectLock", null);
        setBooleanField(term11186, term11186.getClass(), "isPacked", false);
        setIntField(term11186, term11186.getClass(), "boundsOp", 0);
        setField(term11186, term11186.getClass(), "compoundShape", null);
        setField(term11186, term11186.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term11186, term11186.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term11186, term11186.getClass(), "backgroundEraseDisabled", false);
        setField(term11186, term11186.getClass(), "eventCache", null);
        setBooleanField(term11186, term11186.getClass(), "coalescingEnabled", false);
        setBooleanField(term11186, term11186.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term11186, term11186.getClass(), "componentSerializedDataVersion", 0);
        setField(term11186, term11186.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term11186, args);
    }

};


