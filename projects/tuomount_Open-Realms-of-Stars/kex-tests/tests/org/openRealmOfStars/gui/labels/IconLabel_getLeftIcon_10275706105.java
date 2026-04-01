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

public class IconLabel_getLeftIcon_10275706105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31363;

    public IconLabel_getLeftIcon_10275706105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31363 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.IconLabel"));
        setField(term31363, term31363.getClass(), "icon", null);
        setIntField(term31363, term31363.getClass(), "mnemonic", 0);
        setIntField(term31363, term31363.getClass(), "mnemonicIndex", 0);
        setField(term31363, term31363.getClass(), "text", null);
        setField(term31363, term31363.getClass(), "defaultIcon", null);
        setField(term31363, term31363.getClass(), "disabledIcon", null);
        setBooleanField(term31363, term31363.getClass(), "disabledIconSet", false);
        setIntField(term31363, term31363.getClass(), "verticalAlignment", 0);
        setIntField(term31363, term31363.getClass(), "horizontalAlignment", 0);
        setIntField(term31363, term31363.getClass(), "verticalTextPosition", 0);
        setIntField(term31363, term31363.getClass(), "horizontalTextPosition", 0);
        setIntField(term31363, term31363.getClass(), "iconTextGap", 0);
        setField(term31363, term31363.getClass(), "labelFor", null);
        setBooleanField(term31363, term31363.getClass(), "isAlignmentXSet", false);
        setFloatField(term31363, term31363.getClass(), "alignmentX", 0.0F);
        setBooleanField(term31363, term31363.getClass(), "isAlignmentYSet", false);
        setFloatField(term31363, term31363.getClass(), "alignmentY", 0.0F);
        setField(term31363, term31363.getClass(), "ui", null);
        setField(term31363, term31363.getClass(), "listenerList", null);
        setField(term31363, term31363.getClass(), "clientProperties", null);
        setField(term31363, term31363.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term31363, term31363.getClass(), "autoscrolls", false);
        setField(term31363, term31363.getClass(), "border", null);
        setIntField(term31363, term31363.getClass(), "flags", 0);
        setField(term31363, term31363.getClass(), "inputVerifier", null);
        setBooleanField(term31363, term31363.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term31363, term31363.getClass(), "paintingChild", null);
        setField(term31363, term31363.getClass(), "popupMenu", null);
        setField(term31363, term31363.getClass(), "revalidateRunnableScheduled", null);
        setField(term31363, term31363.getClass(), "focusInputMap", null);
        setField(term31363, term31363.getClass(), "ancestorInputMap", null);
        setField(term31363, term31363.getClass(), "windowInputMap", null);
        setField(term31363, term31363.getClass(), "actionMap", null);
        setField(term31363, term31363.getClass(), "aaHint", null);
        setField(term31363, term31363.getClass(), "lcdRenderingHint", null);
        setField(term31363, term31363.getClass(), "component", null);
        setField(term31363, term31363.getClass(), "layoutMgr", null);
        setField(term31363, term31363.getClass(), "dispatcher", null);
        setField(term31363, term31363.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term31363, term31363.getClass(), "focusCycleRoot", false);
        setBooleanField(term31363, term31363.getClass(), "focusTraversalPolicyProvider", false);
        setField(term31363, term31363.getClass(), "printingThreads", null);
        setBooleanField(term31363, term31363.getClass(), "printing", false);
        setField(term31363, term31363.getClass(), "containerListener", null);
        setIntField(term31363, term31363.getClass(), "listeningChildren", 0);
        setIntField(term31363, term31363.getClass(), "listeningBoundsChildren", 0);
        setIntField(term31363, term31363.getClass(), "descendantsCount", 0);
        setField(term31363, term31363.getClass(), "preserveBackgroundColor", null);
        setIntField(term31363, term31363.getClass(), "numOfHWComponents", 0);
        setIntField(term31363, term31363.getClass(), "numOfLWComponents", 0);
        setField(term31363, term31363.getClass(), "modalComp", null);
        setField(term31363, term31363.getClass(), "modalAppContext", null);
        setIntField(term31363, term31363.getClass(), "containerSerializedDataVersion", 0);
        setField(term31363, term31363.getClass(), "peer", null);
        setField(term31363, term31363.getClass(), "parent", null);
        setField(term31363, term31363.getClass(), "appContext", null);
        setIntField(term31363, term31363.getClass(), "x", 0);
        setIntField(term31363, term31363.getClass(), "y", 0);
        setIntField(term31363, term31363.getClass(), "width", 0);
        setIntField(term31363, term31363.getClass(), "height", 0);
        setField(term31363, term31363.getClass(), "foreground", null);
        setField(term31363, term31363.getClass(), "background", null);
        setField(term31363, term31363.getClass(), "font", null);
        setField(term31363, term31363.getClass(), "peerFont", null);
        setField(term31363, term31363.getClass(), "cursor", null);
        setField(term31363, term31363.getClass(), "locale", null);
        setField(term31363, term31363.getClass(), "graphicsConfig", null);
        setField(term31363, term31363.getClass(), "bufferStrategy", null);
        setBooleanField(term31363, term31363.getClass(), "ignoreRepaint", false);
        setBooleanField(term31363, term31363.getClass(), "visible", false);
        setBooleanField(term31363, term31363.getClass(), "enabled", false);
        setBooleanField(term31363, term31363.getClass(), "valid", false);
        setField(term31363, term31363.getClass(), "dropTarget", null);
        setField(term31363, term31363.getClass(), "popups", null);
        setField(term31363, term31363.getClass(), "name", null);
        setBooleanField(term31363, term31363.getClass(), "nameExplicitlySet", false);
        setBooleanField(term31363, term31363.getClass(), "focusable", false);
        setIntField(term31363, term31363.getClass(), "isFocusTraversableOverridden", 0);
        setField(term31363, term31363.getClass(), "focusTraversalKeys", null);
        setBooleanField(term31363, term31363.getClass(), "focusTraversalKeysEnabled", false);
        setField(term31363, term31363.getClass(), "acc", null);
        setField(term31363, term31363.getClass(), "minSize", null);
        setBooleanField(term31363, term31363.getClass(), "minSizeSet", false);
        setField(term31363, term31363.getClass(), "prefSize", null);
        setBooleanField(term31363, term31363.getClass(), "prefSizeSet", false);
        setField(term31363, term31363.getClass(), "maxSize", null);
        setBooleanField(term31363, term31363.getClass(), "maxSizeSet", false);
        setField(term31363, term31363.getClass(), "componentOrientation", null);
        setBooleanField(term31363, term31363.getClass(), "newEventsOnly", false);
        setField(term31363, term31363.getClass(), "componentListener", null);
        setField(term31363, term31363.getClass(), "focusListener", null);
        setField(term31363, term31363.getClass(), "hierarchyListener", null);
        setField(term31363, term31363.getClass(), "hierarchyBoundsListener", null);
        setField(term31363, term31363.getClass(), "keyListener", null);
        setField(term31363, term31363.getClass(), "mouseListener", null);
        setField(term31363, term31363.getClass(), "mouseMotionListener", null);
        setField(term31363, term31363.getClass(), "mouseWheelListener", null);
        setField(term31363, term31363.getClass(), "inputMethodListener", null);
        setLongField(term31363, term31363.getClass(), "eventMask", 0L);
        setField(term31363, term31363.getClass(), "changeSupport", null);
        setField(term31363, term31363.getClass(), "objectLock", null);
        setBooleanField(term31363, term31363.getClass(), "isPacked", false);
        setIntField(term31363, term31363.getClass(), "boundsOp", 0);
        setField(term31363, term31363.getClass(), "compoundShape", null);
        setField(term31363, term31363.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term31363, term31363.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term31363, term31363.getClass(), "backgroundEraseDisabled", false);
        setField(term31363, term31363.getClass(), "eventCache", null);
        setBooleanField(term31363, term31363.getClass(), "coalescingEnabled", false);
        setBooleanField(term31363, term31363.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term31363, term31363.getClass(), "componentSerializedDataVersion", 0);
        setField(term31363, term31363.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.IconLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLeftIcon", argTypes, term31363, args);
    }

};


