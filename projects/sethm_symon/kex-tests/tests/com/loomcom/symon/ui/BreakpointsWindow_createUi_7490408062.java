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

public class BreakpointsWindow_createUi_7490408062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57828;

    public BreakpointsWindow_createUi_7490408062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57828 = newInstance(Class.forName("com.loomcom.symon.ui.BreakpointsWindow"));
        setField(term57828, term57828.getClass(), "mainWindow", null);
        setField(term57828, term57828.getClass(), "breakpoints", null);
        setIntField(term57828, term57828.getClass(), "defaultCloseOperation", 0);
        setField(term57828, term57828.getClass(), "transferHandler", null);
        setField(term57828, term57828.getClass(), "rootPane", null);
        setBooleanField(term57828, term57828.getClass(), "rootPaneCheckingEnabled", false);
        setField(term57828, term57828.getClass(), "accessibleContext", null);
        setField(term57828, term57828.getClass(), "maximizedBounds", null);
        setField(term57828, term57828.getClass(), "title", null);
        setField(term57828, term57828.getClass(), "menuBar", null);
        setBooleanField(term57828, term57828.getClass(), "resizable", false);
        setBooleanField(term57828, term57828.getClass(), "undecorated", false);
        setBooleanField(term57828, term57828.getClass(), "mbManagement", false);
        setIntField(term57828, term57828.getClass(), "state", 0);
        setField(term57828, term57828.getClass(), "ownedWindows", null);
        setIntField(term57828, term57828.getClass(), "frameSerializedDataVersion", 0);
        setField(term57828, term57828.getClass(), "warningString", null);
        setField(term57828, term57828.getClass(), "icons", null);
        setField(term57828, term57828.getClass(), "temporaryLostComponent", null);
        setBooleanField(term57828, term57828.getClass(), "syncLWRequests", false);
        setBooleanField(term57828, term57828.getClass(), "beforeFirstShow", false);
        setBooleanField(term57828, term57828.getClass(), "disposing", false);
        setField(term57828, term57828.getClass(), "disposerRecord", null);
        setBooleanField(term57828, term57828.getClass(), "alwaysOnTop", false);
        setField(term57828, term57828.getClass(), "ownedWindowList", null);
        setField(term57828, term57828.getClass(), "weakThis", null);
        setBooleanField(term57828, term57828.getClass(), "showWithParent", false);
        setField(term57828, term57828.getClass(), "modalBlocker", null);
        setField(term57828, term57828.getClass(), "modalExclusionType", null);
        setField(term57828, term57828.getClass(), "windowListener", null);
        setField(term57828, term57828.getClass(), "windowStateListener", null);
        setField(term57828, term57828.getClass(), "windowFocusListener", null);
        setField(term57828, term57828.getClass(), "inputContext", null);
        setField(term57828, term57828.getClass(), "inputContextLock", null);
        setField(term57828, term57828.getClass(), "focusMgr", null);
        setBooleanField(term57828, term57828.getClass(), "focusableWindowState", false);
        setBooleanField(term57828, term57828.getClass(), "autoRequestFocus", false);
        setBooleanField(term57828, term57828.getClass(), "isInShow", false);
        setFloatField(term57828, term57828.getClass(), "opacity", 0.0F);
        setField(term57828, term57828.getClass(), "shape", null);
        setBooleanField(term57828, term57828.getClass(), "isTrayIconWindow", false);
        setIntField(term57828, term57828.getClass(), "securityWarningWidth", 0);
        setIntField(term57828, term57828.getClass(), "securityWarningHeight", 0);
        setDoubleField(term57828, term57828.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term57828, term57828.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term57828, term57828.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term57828, term57828.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term57828, term57828.getClass(), "anchor", null);
        setField(term57828, term57828.getClass(), "type", null);
        setIntField(term57828, term57828.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term57828, term57828.getClass(), "locationByPlatform", false);
        setField(term57828, term57828.getClass(), "component", null);
        setField(term57828, term57828.getClass(), "layoutMgr", null);
        setField(term57828, term57828.getClass(), "dispatcher", null);
        setField(term57828, term57828.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term57828, term57828.getClass(), "focusCycleRoot", false);
        setBooleanField(term57828, term57828.getClass(), "focusTraversalPolicyProvider", false);
        setField(term57828, term57828.getClass(), "printingThreads", null);
        setBooleanField(term57828, term57828.getClass(), "printing", false);
        setField(term57828, term57828.getClass(), "containerListener", null);
        setIntField(term57828, term57828.getClass(), "listeningChildren", 0);
        setIntField(term57828, term57828.getClass(), "listeningBoundsChildren", 0);
        setIntField(term57828, term57828.getClass(), "descendantsCount", 0);
        setField(term57828, term57828.getClass(), "preserveBackgroundColor", null);
        setIntField(term57828, term57828.getClass(), "numOfHWComponents", 0);
        setIntField(term57828, term57828.getClass(), "numOfLWComponents", 0);
        setField(term57828, term57828.getClass(), "modalComp", null);
        setField(term57828, term57828.getClass(), "modalAppContext", null);
        setIntField(term57828, term57828.getClass(), "containerSerializedDataVersion", 0);
        setField(term57828, term57828.getClass(), "peer", null);
        setField(term57828, term57828.getClass(), "parent", null);
        setField(term57828, term57828.getClass(), "appContext", null);
        setIntField(term57828, term57828.getClass(), "x", 0);
        setIntField(term57828, term57828.getClass(), "y", 0);
        setIntField(term57828, term57828.getClass(), "width", 0);
        setIntField(term57828, term57828.getClass(), "height", 0);
        setField(term57828, term57828.getClass(), "foreground", null);
        setField(term57828, term57828.getClass(), "background", null);
        setField(term57828, term57828.getClass(), "font", null);
        setField(term57828, term57828.getClass(), "peerFont", null);
        setField(term57828, term57828.getClass(), "cursor", null);
        setField(term57828, term57828.getClass(), "locale", null);
        setField(term57828, term57828.getClass(), "graphicsConfig", null);
        setField(term57828, term57828.getClass(), "bufferStrategy", null);
        setBooleanField(term57828, term57828.getClass(), "ignoreRepaint", false);
        setBooleanField(term57828, term57828.getClass(), "visible", false);
        setBooleanField(term57828, term57828.getClass(), "enabled", false);
        setBooleanField(term57828, term57828.getClass(), "valid", false);
        setField(term57828, term57828.getClass(), "dropTarget", null);
        setField(term57828, term57828.getClass(), "popups", null);
        setField(term57828, term57828.getClass(), "name", null);
        setBooleanField(term57828, term57828.getClass(), "nameExplicitlySet", false);
        setBooleanField(term57828, term57828.getClass(), "focusable", false);
        setIntField(term57828, term57828.getClass(), "isFocusTraversableOverridden", 0);
        setField(term57828, term57828.getClass(), "focusTraversalKeys", null);
        setBooleanField(term57828, term57828.getClass(), "focusTraversalKeysEnabled", false);
        setField(term57828, term57828.getClass(), "acc", null);
        setField(term57828, term57828.getClass(), "minSize", null);
        setBooleanField(term57828, term57828.getClass(), "minSizeSet", false);
        setField(term57828, term57828.getClass(), "prefSize", null);
        setBooleanField(term57828, term57828.getClass(), "prefSizeSet", false);
        setField(term57828, term57828.getClass(), "maxSize", null);
        setBooleanField(term57828, term57828.getClass(), "maxSizeSet", false);
        setField(term57828, term57828.getClass(), "componentOrientation", null);
        setBooleanField(term57828, term57828.getClass(), "newEventsOnly", false);
        setField(term57828, term57828.getClass(), "componentListener", null);
        setField(term57828, term57828.getClass(), "focusListener", null);
        setField(term57828, term57828.getClass(), "hierarchyListener", null);
        setField(term57828, term57828.getClass(), "hierarchyBoundsListener", null);
        setField(term57828, term57828.getClass(), "keyListener", null);
        setField(term57828, term57828.getClass(), "mouseListener", null);
        setField(term57828, term57828.getClass(), "mouseMotionListener", null);
        setField(term57828, term57828.getClass(), "mouseWheelListener", null);
        setField(term57828, term57828.getClass(), "inputMethodListener", null);
        setLongField(term57828, term57828.getClass(), "eventMask", 0L);
        setField(term57828, term57828.getClass(), "changeSupport", null);
        setField(term57828, term57828.getClass(), "objectLock", null);
        setBooleanField(term57828, term57828.getClass(), "isPacked", false);
        setIntField(term57828, term57828.getClass(), "boundsOp", 0);
        setField(term57828, term57828.getClass(), "compoundShape", null);
        setField(term57828, term57828.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term57828, term57828.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term57828, term57828.getClass(), "backgroundEraseDisabled", false);
        setField(term57828, term57828.getClass(), "eventCache", null);
        setBooleanField(term57828, term57828.getClass(), "coalescingEnabled", false);
        setBooleanField(term57828, term57828.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term57828, term57828.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.BreakpointsWindow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createUi", argTypes, term57828, args);
    }

};


