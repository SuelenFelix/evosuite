package com.loomcom.symon.ui;

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
import static com.loomcom.symon.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Console_keyReleased_135147676912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11904;

    public Console_keyReleased_135147676912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11904 = newInstance(Class.forName("com.loomcom.symon.ui.Console"));
        setBooleanField(term11904, term11904.getClass(), "sendCrForLf", false);
        setField(term11904, term11904.getClass(), "typeAheadBuffer", null);
        setIntField(term11904, term11904.getClass(), "borderWidth", 0);
        setField(term11904, term11904.getClass(), "scrollBar", null);
        setField(term11904, term11904.getClass(), "model", null);
        setField(term11904, term11904.getClass(), "font", null);
        setIntField(term11904, term11904.getClass(), "cellWidth", 0);
        setIntField(term11904, term11904.getClass(), "cellHeight", 0);
        setIntField(term11904, term11904.getClass(), "maxDescender", 0);
        setBooleanField(term11904, term11904.getClass(), "isAlignmentXSet", false);
        setFloatField(term11904, term11904.getClass(), "alignmentX", 0.0F);
        setBooleanField(term11904, term11904.getClass(), "isAlignmentYSet", false);
        setFloatField(term11904, term11904.getClass(), "alignmentY", 0.0F);
        setField(term11904, term11904.getClass(), "ui", null);
        setField(term11904, term11904.getClass(), "listenerList", null);
        setField(term11904, term11904.getClass(), "clientProperties", null);
        setField(term11904, term11904.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term11904, term11904.getClass(), "autoscrolls", false);
        setField(term11904, term11904.getClass(), "border", null);
        setIntField(term11904, term11904.getClass(), "flags", 0);
        setField(term11904, term11904.getClass(), "inputVerifier", null);
        setBooleanField(term11904, term11904.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term11904, term11904.getClass(), "paintingChild", null);
        setField(term11904, term11904.getClass(), "popupMenu", null);
        setField(term11904, term11904.getClass(), "revalidateRunnableScheduled", null);
        setField(term11904, term11904.getClass(), "focusInputMap", null);
        setField(term11904, term11904.getClass(), "ancestorInputMap", null);
        setField(term11904, term11904.getClass(), "windowInputMap", null);
        setField(term11904, term11904.getClass(), "actionMap", null);
        setField(term11904, term11904.getClass(), "aaHint", null);
        setField(term11904, term11904.getClass(), "lcdRenderingHint", null);
        setField(term11904, term11904.getClass(), "component", null);
        setField(term11904, term11904.getClass(), "layoutMgr", null);
        setField(term11904, term11904.getClass(), "dispatcher", null);
        setField(term11904, term11904.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term11904, term11904.getClass(), "focusCycleRoot", false);
        setBooleanField(term11904, term11904.getClass(), "focusTraversalPolicyProvider", false);
        setField(term11904, term11904.getClass(), "printingThreads", null);
        setBooleanField(term11904, term11904.getClass(), "printing", false);
        setField(term11904, term11904.getClass(), "containerListener", null);
        setIntField(term11904, term11904.getClass(), "listeningChildren", 0);
        setIntField(term11904, term11904.getClass(), "listeningBoundsChildren", 0);
        setIntField(term11904, term11904.getClass(), "descendantsCount", 0);
        setField(term11904, term11904.getClass(), "preserveBackgroundColor", null);
        setIntField(term11904, term11904.getClass(), "numOfHWComponents", 0);
        setIntField(term11904, term11904.getClass(), "numOfLWComponents", 0);
        setField(term11904, term11904.getClass(), "modalComp", null);
        setField(term11904, term11904.getClass(), "modalAppContext", null);
        setIntField(term11904, term11904.getClass(), "containerSerializedDataVersion", 0);
        setField(term11904, term11904.getClass(), "peer", null);
        setField(term11904, term11904.getClass(), "parent", null);
        setField(term11904, term11904.getClass(), "appContext", null);
        setIntField(term11904, term11904.getClass(), "x", 0);
        setIntField(term11904, term11904.getClass(), "y", 0);
        setIntField(term11904, term11904.getClass(), "width", 0);
        setIntField(term11904, term11904.getClass(), "height", 0);
        setField(term11904, term11904.getClass(), "foreground", null);
        setField(term11904, term11904.getClass(), "background", null);
        setField(term11904, term11904.getClass(), "peerFont", null);
        setField(term11904, term11904.getClass(), "cursor", null);
        setField(term11904, term11904.getClass(), "locale", null);
        setField(term11904, term11904.getClass(), "graphicsConfig", null);
        setField(term11904, term11904.getClass(), "bufferStrategy", null);
        setBooleanField(term11904, term11904.getClass(), "ignoreRepaint", false);
        setBooleanField(term11904, term11904.getClass(), "visible", false);
        setBooleanField(term11904, term11904.getClass(), "enabled", false);
        setBooleanField(term11904, term11904.getClass(), "valid", false);
        setField(term11904, term11904.getClass(), "dropTarget", null);
        setField(term11904, term11904.getClass(), "popups", null);
        setField(term11904, term11904.getClass(), "name", null);
        setBooleanField(term11904, term11904.getClass(), "nameExplicitlySet", false);
        setBooleanField(term11904, term11904.getClass(), "focusable", false);
        setIntField(term11904, term11904.getClass(), "isFocusTraversableOverridden", 0);
        setField(term11904, term11904.getClass(), "focusTraversalKeys", null);
        setBooleanField(term11904, term11904.getClass(), "focusTraversalKeysEnabled", false);
        setField(term11904, term11904.getClass(), "acc", null);
        setField(term11904, term11904.getClass(), "minSize", null);
        setBooleanField(term11904, term11904.getClass(), "minSizeSet", false);
        setField(term11904, term11904.getClass(), "prefSize", null);
        setBooleanField(term11904, term11904.getClass(), "prefSizeSet", false);
        setField(term11904, term11904.getClass(), "maxSize", null);
        setBooleanField(term11904, term11904.getClass(), "maxSizeSet", false);
        setField(term11904, term11904.getClass(), "componentOrientation", null);
        setBooleanField(term11904, term11904.getClass(), "newEventsOnly", false);
        setField(term11904, term11904.getClass(), "componentListener", null);
        setField(term11904, term11904.getClass(), "focusListener", null);
        setField(term11904, term11904.getClass(), "hierarchyListener", null);
        setField(term11904, term11904.getClass(), "hierarchyBoundsListener", null);
        setField(term11904, term11904.getClass(), "keyListener", null);
        setField(term11904, term11904.getClass(), "mouseListener", null);
        setField(term11904, term11904.getClass(), "mouseMotionListener", null);
        setField(term11904, term11904.getClass(), "mouseWheelListener", null);
        setField(term11904, term11904.getClass(), "inputMethodListener", null);
        setLongField(term11904, term11904.getClass(), "eventMask", 0L);
        setField(term11904, term11904.getClass(), "changeSupport", null);
        setField(term11904, term11904.getClass(), "objectLock", null);
        setBooleanField(term11904, term11904.getClass(), "isPacked", false);
        setIntField(term11904, term11904.getClass(), "boundsOp", 0);
        setField(term11904, term11904.getClass(), "compoundShape", null);
        setField(term11904, term11904.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term11904, term11904.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term11904, term11904.getClass(), "backgroundEraseDisabled", false);
        setField(term11904, term11904.getClass(), "eventCache", null);
        setBooleanField(term11904, term11904.getClass(), "coalescingEnabled", false);
        setBooleanField(term11904, term11904.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term11904, term11904.getClass(), "componentSerializedDataVersion", 0);
        setField(term11904, term11904.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.Console");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "keyReleased", argTypes, term11904, args);
    }

};


