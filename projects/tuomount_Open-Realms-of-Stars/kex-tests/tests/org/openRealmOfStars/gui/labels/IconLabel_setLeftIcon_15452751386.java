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

public class IconLabel_setLeftIcon_15452751386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31412;

    public IconLabel_setLeftIcon_15452751386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31412 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.IconLabel"));
        setField(term31412, term31412.getClass(), "icon", null);
        setIntField(term31412, term31412.getClass(), "mnemonic", 0);
        setIntField(term31412, term31412.getClass(), "mnemonicIndex", 0);
        setField(term31412, term31412.getClass(), "text", null);
        setField(term31412, term31412.getClass(), "defaultIcon", null);
        setField(term31412, term31412.getClass(), "disabledIcon", null);
        setBooleanField(term31412, term31412.getClass(), "disabledIconSet", false);
        setIntField(term31412, term31412.getClass(), "verticalAlignment", 0);
        setIntField(term31412, term31412.getClass(), "horizontalAlignment", 0);
        setIntField(term31412, term31412.getClass(), "verticalTextPosition", 0);
        setIntField(term31412, term31412.getClass(), "horizontalTextPosition", 0);
        setIntField(term31412, term31412.getClass(), "iconTextGap", 0);
        setField(term31412, term31412.getClass(), "labelFor", null);
        setBooleanField(term31412, term31412.getClass(), "isAlignmentXSet", false);
        setFloatField(term31412, term31412.getClass(), "alignmentX", 0.0F);
        setBooleanField(term31412, term31412.getClass(), "isAlignmentYSet", false);
        setFloatField(term31412, term31412.getClass(), "alignmentY", 0.0F);
        setField(term31412, term31412.getClass(), "ui", null);
        setField(term31412, term31412.getClass(), "listenerList", null);
        setField(term31412, term31412.getClass(), "clientProperties", null);
        setField(term31412, term31412.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term31412, term31412.getClass(), "autoscrolls", false);
        setField(term31412, term31412.getClass(), "border", null);
        setIntField(term31412, term31412.getClass(), "flags", 0);
        setField(term31412, term31412.getClass(), "inputVerifier", null);
        setBooleanField(term31412, term31412.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term31412, term31412.getClass(), "paintingChild", null);
        setField(term31412, term31412.getClass(), "popupMenu", null);
        setField(term31412, term31412.getClass(), "revalidateRunnableScheduled", null);
        setField(term31412, term31412.getClass(), "focusInputMap", null);
        setField(term31412, term31412.getClass(), "ancestorInputMap", null);
        setField(term31412, term31412.getClass(), "windowInputMap", null);
        setField(term31412, term31412.getClass(), "actionMap", null);
        setField(term31412, term31412.getClass(), "aaHint", null);
        setField(term31412, term31412.getClass(), "lcdRenderingHint", null);
        setField(term31412, term31412.getClass(), "component", null);
        setField(term31412, term31412.getClass(), "layoutMgr", null);
        setField(term31412, term31412.getClass(), "dispatcher", null);
        setField(term31412, term31412.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term31412, term31412.getClass(), "focusCycleRoot", false);
        setBooleanField(term31412, term31412.getClass(), "focusTraversalPolicyProvider", false);
        setField(term31412, term31412.getClass(), "printingThreads", null);
        setBooleanField(term31412, term31412.getClass(), "printing", false);
        setField(term31412, term31412.getClass(), "containerListener", null);
        setIntField(term31412, term31412.getClass(), "listeningChildren", 0);
        setIntField(term31412, term31412.getClass(), "listeningBoundsChildren", 0);
        setIntField(term31412, term31412.getClass(), "descendantsCount", 0);
        setField(term31412, term31412.getClass(), "preserveBackgroundColor", null);
        setIntField(term31412, term31412.getClass(), "numOfHWComponents", 0);
        setIntField(term31412, term31412.getClass(), "numOfLWComponents", 0);
        setField(term31412, term31412.getClass(), "modalComp", null);
        setField(term31412, term31412.getClass(), "modalAppContext", null);
        setIntField(term31412, term31412.getClass(), "containerSerializedDataVersion", 0);
        setField(term31412, term31412.getClass(), "peer", null);
        setField(term31412, term31412.getClass(), "parent", null);
        setField(term31412, term31412.getClass(), "appContext", null);
        setIntField(term31412, term31412.getClass(), "x", 0);
        setIntField(term31412, term31412.getClass(), "y", 0);
        setIntField(term31412, term31412.getClass(), "width", 0);
        setIntField(term31412, term31412.getClass(), "height", 0);
        setField(term31412, term31412.getClass(), "foreground", null);
        setField(term31412, term31412.getClass(), "background", null);
        setField(term31412, term31412.getClass(), "font", null);
        setField(term31412, term31412.getClass(), "peerFont", null);
        setField(term31412, term31412.getClass(), "cursor", null);
        setField(term31412, term31412.getClass(), "locale", null);
        setField(term31412, term31412.getClass(), "graphicsConfig", null);
        setField(term31412, term31412.getClass(), "bufferStrategy", null);
        setBooleanField(term31412, term31412.getClass(), "ignoreRepaint", false);
        setBooleanField(term31412, term31412.getClass(), "visible", false);
        setBooleanField(term31412, term31412.getClass(), "enabled", false);
        setBooleanField(term31412, term31412.getClass(), "valid", false);
        setField(term31412, term31412.getClass(), "dropTarget", null);
        setField(term31412, term31412.getClass(), "popups", null);
        setField(term31412, term31412.getClass(), "name", null);
        setBooleanField(term31412, term31412.getClass(), "nameExplicitlySet", false);
        setBooleanField(term31412, term31412.getClass(), "focusable", false);
        setIntField(term31412, term31412.getClass(), "isFocusTraversableOverridden", 0);
        setField(term31412, term31412.getClass(), "focusTraversalKeys", null);
        setBooleanField(term31412, term31412.getClass(), "focusTraversalKeysEnabled", false);
        setField(term31412, term31412.getClass(), "acc", null);
        setField(term31412, term31412.getClass(), "minSize", null);
        setBooleanField(term31412, term31412.getClass(), "minSizeSet", false);
        setField(term31412, term31412.getClass(), "prefSize", null);
        setBooleanField(term31412, term31412.getClass(), "prefSizeSet", false);
        setField(term31412, term31412.getClass(), "maxSize", null);
        setBooleanField(term31412, term31412.getClass(), "maxSizeSet", false);
        setField(term31412, term31412.getClass(), "componentOrientation", null);
        setBooleanField(term31412, term31412.getClass(), "newEventsOnly", false);
        setField(term31412, term31412.getClass(), "componentListener", null);
        setField(term31412, term31412.getClass(), "focusListener", null);
        setField(term31412, term31412.getClass(), "hierarchyListener", null);
        setField(term31412, term31412.getClass(), "hierarchyBoundsListener", null);
        setField(term31412, term31412.getClass(), "keyListener", null);
        setField(term31412, term31412.getClass(), "mouseListener", null);
        setField(term31412, term31412.getClass(), "mouseMotionListener", null);
        setField(term31412, term31412.getClass(), "mouseWheelListener", null);
        setField(term31412, term31412.getClass(), "inputMethodListener", null);
        setLongField(term31412, term31412.getClass(), "eventMask", 0L);
        setField(term31412, term31412.getClass(), "changeSupport", null);
        setField(term31412, term31412.getClass(), "objectLock", null);
        setBooleanField(term31412, term31412.getClass(), "isPacked", false);
        setIntField(term31412, term31412.getClass(), "boundsOp", 0);
        setField(term31412, term31412.getClass(), "compoundShape", null);
        setField(term31412, term31412.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term31412, term31412.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term31412, term31412.getClass(), "backgroundEraseDisabled", false);
        setField(term31412, term31412.getClass(), "eventCache", null);
        setBooleanField(term31412, term31412.getClass(), "coalescingEnabled", false);
        setBooleanField(term31412, term31412.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term31412, term31412.getClass(), "componentSerializedDataVersion", 0);
        setField(term31412, term31412.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.IconLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLeftIcon", argTypes, term31412, args);
    }

};


