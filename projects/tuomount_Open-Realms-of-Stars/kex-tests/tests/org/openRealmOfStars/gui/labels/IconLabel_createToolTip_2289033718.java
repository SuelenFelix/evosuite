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

public class IconLabel_createToolTip_2289033718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31461;

    public IconLabel_createToolTip_2289033718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31461 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.IconLabel"));
        setField(term31461, term31461.getClass(), "icon", null);
        setIntField(term31461, term31461.getClass(), "mnemonic", 0);
        setIntField(term31461, term31461.getClass(), "mnemonicIndex", 0);
        setField(term31461, term31461.getClass(), "text", null);
        setField(term31461, term31461.getClass(), "defaultIcon", null);
        setField(term31461, term31461.getClass(), "disabledIcon", null);
        setBooleanField(term31461, term31461.getClass(), "disabledIconSet", false);
        setIntField(term31461, term31461.getClass(), "verticalAlignment", 0);
        setIntField(term31461, term31461.getClass(), "horizontalAlignment", 0);
        setIntField(term31461, term31461.getClass(), "verticalTextPosition", 0);
        setIntField(term31461, term31461.getClass(), "horizontalTextPosition", 0);
        setIntField(term31461, term31461.getClass(), "iconTextGap", 0);
        setField(term31461, term31461.getClass(), "labelFor", null);
        setBooleanField(term31461, term31461.getClass(), "isAlignmentXSet", false);
        setFloatField(term31461, term31461.getClass(), "alignmentX", 0.0F);
        setBooleanField(term31461, term31461.getClass(), "isAlignmentYSet", false);
        setFloatField(term31461, term31461.getClass(), "alignmentY", 0.0F);
        setField(term31461, term31461.getClass(), "ui", null);
        setField(term31461, term31461.getClass(), "listenerList", null);
        setField(term31461, term31461.getClass(), "clientProperties", null);
        setField(term31461, term31461.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term31461, term31461.getClass(), "autoscrolls", false);
        setField(term31461, term31461.getClass(), "border", null);
        setIntField(term31461, term31461.getClass(), "flags", 0);
        setField(term31461, term31461.getClass(), "inputVerifier", null);
        setBooleanField(term31461, term31461.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term31461, term31461.getClass(), "paintingChild", null);
        setField(term31461, term31461.getClass(), "popupMenu", null);
        setField(term31461, term31461.getClass(), "revalidateRunnableScheduled", null);
        setField(term31461, term31461.getClass(), "focusInputMap", null);
        setField(term31461, term31461.getClass(), "ancestorInputMap", null);
        setField(term31461, term31461.getClass(), "windowInputMap", null);
        setField(term31461, term31461.getClass(), "actionMap", null);
        setField(term31461, term31461.getClass(), "aaHint", null);
        setField(term31461, term31461.getClass(), "lcdRenderingHint", null);
        setField(term31461, term31461.getClass(), "component", null);
        setField(term31461, term31461.getClass(), "layoutMgr", null);
        setField(term31461, term31461.getClass(), "dispatcher", null);
        setField(term31461, term31461.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term31461, term31461.getClass(), "focusCycleRoot", false);
        setBooleanField(term31461, term31461.getClass(), "focusTraversalPolicyProvider", false);
        setField(term31461, term31461.getClass(), "printingThreads", null);
        setBooleanField(term31461, term31461.getClass(), "printing", false);
        setField(term31461, term31461.getClass(), "containerListener", null);
        setIntField(term31461, term31461.getClass(), "listeningChildren", 0);
        setIntField(term31461, term31461.getClass(), "listeningBoundsChildren", 0);
        setIntField(term31461, term31461.getClass(), "descendantsCount", 0);
        setField(term31461, term31461.getClass(), "preserveBackgroundColor", null);
        setIntField(term31461, term31461.getClass(), "numOfHWComponents", 0);
        setIntField(term31461, term31461.getClass(), "numOfLWComponents", 0);
        setField(term31461, term31461.getClass(), "modalComp", null);
        setField(term31461, term31461.getClass(), "modalAppContext", null);
        setIntField(term31461, term31461.getClass(), "containerSerializedDataVersion", 0);
        setField(term31461, term31461.getClass(), "peer", null);
        setField(term31461, term31461.getClass(), "parent", null);
        setField(term31461, term31461.getClass(), "appContext", null);
        setIntField(term31461, term31461.getClass(), "x", 0);
        setIntField(term31461, term31461.getClass(), "y", 0);
        setIntField(term31461, term31461.getClass(), "width", 0);
        setIntField(term31461, term31461.getClass(), "height", 0);
        setField(term31461, term31461.getClass(), "foreground", null);
        setField(term31461, term31461.getClass(), "background", null);
        setField(term31461, term31461.getClass(), "font", null);
        setField(term31461, term31461.getClass(), "peerFont", null);
        setField(term31461, term31461.getClass(), "cursor", null);
        setField(term31461, term31461.getClass(), "locale", null);
        setField(term31461, term31461.getClass(), "graphicsConfig", null);
        setField(term31461, term31461.getClass(), "bufferStrategy", null);
        setBooleanField(term31461, term31461.getClass(), "ignoreRepaint", false);
        setBooleanField(term31461, term31461.getClass(), "visible", false);
        setBooleanField(term31461, term31461.getClass(), "enabled", false);
        setBooleanField(term31461, term31461.getClass(), "valid", false);
        setField(term31461, term31461.getClass(), "dropTarget", null);
        setField(term31461, term31461.getClass(), "popups", null);
        setField(term31461, term31461.getClass(), "name", null);
        setBooleanField(term31461, term31461.getClass(), "nameExplicitlySet", false);
        setBooleanField(term31461, term31461.getClass(), "focusable", false);
        setIntField(term31461, term31461.getClass(), "isFocusTraversableOverridden", 0);
        setField(term31461, term31461.getClass(), "focusTraversalKeys", null);
        setBooleanField(term31461, term31461.getClass(), "focusTraversalKeysEnabled", false);
        setField(term31461, term31461.getClass(), "acc", null);
        setField(term31461, term31461.getClass(), "minSize", null);
        setBooleanField(term31461, term31461.getClass(), "minSizeSet", false);
        setField(term31461, term31461.getClass(), "prefSize", null);
        setBooleanField(term31461, term31461.getClass(), "prefSizeSet", false);
        setField(term31461, term31461.getClass(), "maxSize", null);
        setBooleanField(term31461, term31461.getClass(), "maxSizeSet", false);
        setField(term31461, term31461.getClass(), "componentOrientation", null);
        setBooleanField(term31461, term31461.getClass(), "newEventsOnly", false);
        setField(term31461, term31461.getClass(), "componentListener", null);
        setField(term31461, term31461.getClass(), "focusListener", null);
        setField(term31461, term31461.getClass(), "hierarchyListener", null);
        setField(term31461, term31461.getClass(), "hierarchyBoundsListener", null);
        setField(term31461, term31461.getClass(), "keyListener", null);
        setField(term31461, term31461.getClass(), "mouseListener", null);
        setField(term31461, term31461.getClass(), "mouseMotionListener", null);
        setField(term31461, term31461.getClass(), "mouseWheelListener", null);
        setField(term31461, term31461.getClass(), "inputMethodListener", null);
        setLongField(term31461, term31461.getClass(), "eventMask", 0L);
        setField(term31461, term31461.getClass(), "changeSupport", null);
        setField(term31461, term31461.getClass(), "objectLock", null);
        setBooleanField(term31461, term31461.getClass(), "isPacked", false);
        setIntField(term31461, term31461.getClass(), "boundsOp", 0);
        setField(term31461, term31461.getClass(), "compoundShape", null);
        setField(term31461, term31461.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term31461, term31461.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term31461, term31461.getClass(), "backgroundEraseDisabled", false);
        setField(term31461, term31461.getClass(), "eventCache", null);
        setBooleanField(term31461, term31461.getClass(), "coalescingEnabled", false);
        setBooleanField(term31461, term31461.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term31461, term31461.getClass(), "componentSerializedDataVersion", 0);
        setField(term31461, term31461.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.IconLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term31461, args);
    }

};


