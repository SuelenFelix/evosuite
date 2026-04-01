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

public class SpaceLabel_createToolTip_20291388825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257;

    public SpaceLabel_createToolTip_20291388825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.SpaceLabel"));
        setIntField(term257, term257.getClass(), "mnemonic", 0);
        setIntField(term257, term257.getClass(), "mnemonicIndex", 0);
        setField(term257, term257.getClass(), "text", null);
        setField(term257, term257.getClass(), "defaultIcon", null);
        setField(term257, term257.getClass(), "disabledIcon", null);
        setBooleanField(term257, term257.getClass(), "disabledIconSet", false);
        setIntField(term257, term257.getClass(), "verticalAlignment", 0);
        setIntField(term257, term257.getClass(), "horizontalAlignment", 0);
        setIntField(term257, term257.getClass(), "verticalTextPosition", 0);
        setIntField(term257, term257.getClass(), "horizontalTextPosition", 0);
        setIntField(term257, term257.getClass(), "iconTextGap", 0);
        setField(term257, term257.getClass(), "labelFor", null);
        setBooleanField(term257, term257.getClass(), "isAlignmentXSet", false);
        setFloatField(term257, term257.getClass(), "alignmentX", 0.0F);
        setBooleanField(term257, term257.getClass(), "isAlignmentYSet", false);
        setFloatField(term257, term257.getClass(), "alignmentY", 0.0F);
        setField(term257, term257.getClass(), "ui", null);
        setField(term257, term257.getClass(), "listenerList", null);
        setField(term257, term257.getClass(), "clientProperties", null);
        setField(term257, term257.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term257, term257.getClass(), "autoscrolls", false);
        setField(term257, term257.getClass(), "border", null);
        setIntField(term257, term257.getClass(), "flags", 0);
        setField(term257, term257.getClass(), "inputVerifier", null);
        setBooleanField(term257, term257.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term257, term257.getClass(), "paintingChild", null);
        setField(term257, term257.getClass(), "popupMenu", null);
        setField(term257, term257.getClass(), "revalidateRunnableScheduled", null);
        setField(term257, term257.getClass(), "focusInputMap", null);
        setField(term257, term257.getClass(), "ancestorInputMap", null);
        setField(term257, term257.getClass(), "windowInputMap", null);
        setField(term257, term257.getClass(), "actionMap", null);
        setField(term257, term257.getClass(), "aaHint", null);
        setField(term257, term257.getClass(), "lcdRenderingHint", null);
        setField(term257, term257.getClass(), "component", null);
        setField(term257, term257.getClass(), "layoutMgr", null);
        setField(term257, term257.getClass(), "dispatcher", null);
        setField(term257, term257.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term257, term257.getClass(), "focusCycleRoot", false);
        setBooleanField(term257, term257.getClass(), "focusTraversalPolicyProvider", false);
        setField(term257, term257.getClass(), "printingThreads", null);
        setBooleanField(term257, term257.getClass(), "printing", false);
        setField(term257, term257.getClass(), "containerListener", null);
        setIntField(term257, term257.getClass(), "listeningChildren", 0);
        setIntField(term257, term257.getClass(), "listeningBoundsChildren", 0);
        setIntField(term257, term257.getClass(), "descendantsCount", 0);
        setField(term257, term257.getClass(), "preserveBackgroundColor", null);
        setIntField(term257, term257.getClass(), "numOfHWComponents", 0);
        setIntField(term257, term257.getClass(), "numOfLWComponents", 0);
        setField(term257, term257.getClass(), "modalComp", null);
        setField(term257, term257.getClass(), "modalAppContext", null);
        setIntField(term257, term257.getClass(), "containerSerializedDataVersion", 0);
        setField(term257, term257.getClass(), "peer", null);
        setField(term257, term257.getClass(), "parent", null);
        setField(term257, term257.getClass(), "appContext", null);
        setIntField(term257, term257.getClass(), "x", 0);
        setIntField(term257, term257.getClass(), "y", 0);
        setIntField(term257, term257.getClass(), "width", 0);
        setIntField(term257, term257.getClass(), "height", 0);
        setField(term257, term257.getClass(), "foreground", null);
        setField(term257, term257.getClass(), "background", null);
        setField(term257, term257.getClass(), "font", null);
        setField(term257, term257.getClass(), "peerFont", null);
        setField(term257, term257.getClass(), "cursor", null);
        setField(term257, term257.getClass(), "locale", null);
        setField(term257, term257.getClass(), "graphicsConfig", null);
        setField(term257, term257.getClass(), "bufferStrategy", null);
        setBooleanField(term257, term257.getClass(), "ignoreRepaint", false);
        setBooleanField(term257, term257.getClass(), "visible", false);
        setBooleanField(term257, term257.getClass(), "enabled", false);
        setBooleanField(term257, term257.getClass(), "valid", false);
        setField(term257, term257.getClass(), "dropTarget", null);
        setField(term257, term257.getClass(), "popups", null);
        setField(term257, term257.getClass(), "name", null);
        setBooleanField(term257, term257.getClass(), "nameExplicitlySet", false);
        setBooleanField(term257, term257.getClass(), "focusable", false);
        setIntField(term257, term257.getClass(), "isFocusTraversableOverridden", 0);
        setField(term257, term257.getClass(), "focusTraversalKeys", null);
        setBooleanField(term257, term257.getClass(), "focusTraversalKeysEnabled", false);
        setField(term257, term257.getClass(), "acc", null);
        setField(term257, term257.getClass(), "minSize", null);
        setBooleanField(term257, term257.getClass(), "minSizeSet", false);
        setField(term257, term257.getClass(), "prefSize", null);
        setBooleanField(term257, term257.getClass(), "prefSizeSet", false);
        setField(term257, term257.getClass(), "maxSize", null);
        setBooleanField(term257, term257.getClass(), "maxSizeSet", false);
        setField(term257, term257.getClass(), "componentOrientation", null);
        setBooleanField(term257, term257.getClass(), "newEventsOnly", false);
        setField(term257, term257.getClass(), "componentListener", null);
        setField(term257, term257.getClass(), "focusListener", null);
        setField(term257, term257.getClass(), "hierarchyListener", null);
        setField(term257, term257.getClass(), "hierarchyBoundsListener", null);
        setField(term257, term257.getClass(), "keyListener", null);
        setField(term257, term257.getClass(), "mouseListener", null);
        setField(term257, term257.getClass(), "mouseMotionListener", null);
        setField(term257, term257.getClass(), "mouseWheelListener", null);
        setField(term257, term257.getClass(), "inputMethodListener", null);
        setLongField(term257, term257.getClass(), "eventMask", 0L);
        setField(term257, term257.getClass(), "changeSupport", null);
        setField(term257, term257.getClass(), "objectLock", null);
        setBooleanField(term257, term257.getClass(), "isPacked", false);
        setIntField(term257, term257.getClass(), "boundsOp", 0);
        setField(term257, term257.getClass(), "compoundShape", null);
        setField(term257, term257.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term257, term257.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term257, term257.getClass(), "backgroundEraseDisabled", false);
        setField(term257, term257.getClass(), "eventCache", null);
        setBooleanField(term257, term257.getClass(), "coalescingEnabled", false);
        setBooleanField(term257, term257.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term257, term257.getClass(), "componentSerializedDataVersion", 0);
        setField(term257, term257.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.SpaceLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term257, args);
    }

};


