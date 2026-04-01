package org.openRealmOfStars.gui.list;

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
import static org.openRealmOfStars.gui.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SaveGameListRenderer_SaveGameLabel_paintComponent_3944415723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48319;

    public SaveGameListRenderer_SaveGameLabel_paintComponent_3944415723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48319 = newInstance(Class.forName("org.openRealmOfStars.gui.list.SaveGameListRenderer$SaveGameLabel"));
        setIntField(term48319, term48319.getClass(), "mnemonic", 0);
        setIntField(term48319, term48319.getClass(), "mnemonicIndex", 0);
        setField(term48319, term48319.getClass(), "text", null);
        setField(term48319, term48319.getClass(), "defaultIcon", null);
        setField(term48319, term48319.getClass(), "disabledIcon", null);
        setBooleanField(term48319, term48319.getClass(), "disabledIconSet", false);
        setIntField(term48319, term48319.getClass(), "verticalAlignment", 0);
        setIntField(term48319, term48319.getClass(), "horizontalAlignment", 0);
        setIntField(term48319, term48319.getClass(), "verticalTextPosition", 0);
        setIntField(term48319, term48319.getClass(), "horizontalTextPosition", 0);
        setIntField(term48319, term48319.getClass(), "iconTextGap", 0);
        setField(term48319, term48319.getClass(), "labelFor", null);
        setBooleanField(term48319, term48319.getClass(), "isAlignmentXSet", false);
        setFloatField(term48319, term48319.getClass(), "alignmentX", 0.0F);
        setBooleanField(term48319, term48319.getClass(), "isAlignmentYSet", false);
        setFloatField(term48319, term48319.getClass(), "alignmentY", 0.0F);
        setField(term48319, term48319.getClass(), "ui", null);
        setField(term48319, term48319.getClass(), "listenerList", null);
        setField(term48319, term48319.getClass(), "clientProperties", null);
        setField(term48319, term48319.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term48319, term48319.getClass(), "autoscrolls", false);
        setField(term48319, term48319.getClass(), "border", null);
        setIntField(term48319, term48319.getClass(), "flags", 0);
        setField(term48319, term48319.getClass(), "inputVerifier", null);
        setBooleanField(term48319, term48319.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term48319, term48319.getClass(), "paintingChild", null);
        setField(term48319, term48319.getClass(), "popupMenu", null);
        setField(term48319, term48319.getClass(), "revalidateRunnableScheduled", null);
        setField(term48319, term48319.getClass(), "focusInputMap", null);
        setField(term48319, term48319.getClass(), "ancestorInputMap", null);
        setField(term48319, term48319.getClass(), "windowInputMap", null);
        setField(term48319, term48319.getClass(), "actionMap", null);
        setField(term48319, term48319.getClass(), "aaHint", null);
        setField(term48319, term48319.getClass(), "lcdRenderingHint", null);
        setField(term48319, term48319.getClass(), "component", null);
        setField(term48319, term48319.getClass(), "layoutMgr", null);
        setField(term48319, term48319.getClass(), "dispatcher", null);
        setField(term48319, term48319.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term48319, term48319.getClass(), "focusCycleRoot", false);
        setBooleanField(term48319, term48319.getClass(), "focusTraversalPolicyProvider", false);
        setField(term48319, term48319.getClass(), "printingThreads", null);
        setBooleanField(term48319, term48319.getClass(), "printing", false);
        setField(term48319, term48319.getClass(), "containerListener", null);
        setIntField(term48319, term48319.getClass(), "listeningChildren", 0);
        setIntField(term48319, term48319.getClass(), "listeningBoundsChildren", 0);
        setIntField(term48319, term48319.getClass(), "descendantsCount", 0);
        setField(term48319, term48319.getClass(), "preserveBackgroundColor", null);
        setIntField(term48319, term48319.getClass(), "numOfHWComponents", 0);
        setIntField(term48319, term48319.getClass(), "numOfLWComponents", 0);
        setField(term48319, term48319.getClass(), "modalComp", null);
        setField(term48319, term48319.getClass(), "modalAppContext", null);
        setIntField(term48319, term48319.getClass(), "containerSerializedDataVersion", 0);
        setField(term48319, term48319.getClass(), "peer", null);
        setField(term48319, term48319.getClass(), "parent", null);
        setField(term48319, term48319.getClass(), "appContext", null);
        setIntField(term48319, term48319.getClass(), "x", 0);
        setIntField(term48319, term48319.getClass(), "y", 0);
        setIntField(term48319, term48319.getClass(), "width", 0);
        setIntField(term48319, term48319.getClass(), "height", 0);
        setField(term48319, term48319.getClass(), "foreground", null);
        setField(term48319, term48319.getClass(), "background", null);
        setField(term48319, term48319.getClass(), "font", null);
        setField(term48319, term48319.getClass(), "peerFont", null);
        setField(term48319, term48319.getClass(), "cursor", null);
        setField(term48319, term48319.getClass(), "locale", null);
        setField(term48319, term48319.getClass(), "graphicsConfig", null);
        setField(term48319, term48319.getClass(), "bufferStrategy", null);
        setBooleanField(term48319, term48319.getClass(), "ignoreRepaint", false);
        setBooleanField(term48319, term48319.getClass(), "visible", false);
        setBooleanField(term48319, term48319.getClass(), "enabled", false);
        setBooleanField(term48319, term48319.getClass(), "valid", false);
        setField(term48319, term48319.getClass(), "dropTarget", null);
        setField(term48319, term48319.getClass(), "popups", null);
        setField(term48319, term48319.getClass(), "name", null);
        setBooleanField(term48319, term48319.getClass(), "nameExplicitlySet", false);
        setBooleanField(term48319, term48319.getClass(), "focusable", false);
        setIntField(term48319, term48319.getClass(), "isFocusTraversableOverridden", 0);
        setField(term48319, term48319.getClass(), "focusTraversalKeys", null);
        setBooleanField(term48319, term48319.getClass(), "focusTraversalKeysEnabled", false);
        setField(term48319, term48319.getClass(), "acc", null);
        setField(term48319, term48319.getClass(), "minSize", null);
        setBooleanField(term48319, term48319.getClass(), "minSizeSet", false);
        setField(term48319, term48319.getClass(), "prefSize", null);
        setBooleanField(term48319, term48319.getClass(), "prefSizeSet", false);
        setField(term48319, term48319.getClass(), "maxSize", null);
        setBooleanField(term48319, term48319.getClass(), "maxSizeSet", false);
        setField(term48319, term48319.getClass(), "componentOrientation", null);
        setBooleanField(term48319, term48319.getClass(), "newEventsOnly", false);
        setField(term48319, term48319.getClass(), "componentListener", null);
        setField(term48319, term48319.getClass(), "focusListener", null);
        setField(term48319, term48319.getClass(), "hierarchyListener", null);
        setField(term48319, term48319.getClass(), "hierarchyBoundsListener", null);
        setField(term48319, term48319.getClass(), "keyListener", null);
        setField(term48319, term48319.getClass(), "mouseListener", null);
        setField(term48319, term48319.getClass(), "mouseMotionListener", null);
        setField(term48319, term48319.getClass(), "mouseWheelListener", null);
        setField(term48319, term48319.getClass(), "inputMethodListener", null);
        setLongField(term48319, term48319.getClass(), "eventMask", 0L);
        setField(term48319, term48319.getClass(), "changeSupport", null);
        setField(term48319, term48319.getClass(), "objectLock", null);
        setBooleanField(term48319, term48319.getClass(), "isPacked", false);
        setIntField(term48319, term48319.getClass(), "boundsOp", 0);
        setField(term48319, term48319.getClass(), "compoundShape", null);
        setField(term48319, term48319.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term48319, term48319.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term48319, term48319.getClass(), "backgroundEraseDisabled", false);
        setField(term48319, term48319.getClass(), "eventCache", null);
        setBooleanField(term48319, term48319.getClass(), "coalescingEnabled", false);
        setBooleanField(term48319, term48319.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term48319, term48319.getClass(), "componentSerializedDataVersion", 0);
        setField(term48319, term48319.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.list.SaveGameListRenderer$SaveGameLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term48319, args);
    }

};


