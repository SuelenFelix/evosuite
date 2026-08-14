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

public class TraceLog_simulatorDidStart_12170758468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70907;

    public TraceLog_simulatorDidStart_12170758468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70907 = newInstance(Class.forName("com.loomcom.symon.ui.TraceLog"));
        setField(term70907, term70907.getClass(), "traceLog", null);
        setField(term70907, term70907.getClass(), "traceLogTextArea", null);
        setIntField(term70907, term70907.getClass(), "defaultCloseOperation", 0);
        setField(term70907, term70907.getClass(), "transferHandler", null);
        setField(term70907, term70907.getClass(), "rootPane", null);
        setBooleanField(term70907, term70907.getClass(), "rootPaneCheckingEnabled", false);
        setField(term70907, term70907.getClass(), "accessibleContext", null);
        setField(term70907, term70907.getClass(), "maximizedBounds", null);
        setField(term70907, term70907.getClass(), "title", null);
        setField(term70907, term70907.getClass(), "menuBar", null);
        setBooleanField(term70907, term70907.getClass(), "resizable", false);
        setBooleanField(term70907, term70907.getClass(), "undecorated", false);
        setBooleanField(term70907, term70907.getClass(), "mbManagement", false);
        setIntField(term70907, term70907.getClass(), "state", 0);
        setField(term70907, term70907.getClass(), "ownedWindows", null);
        setIntField(term70907, term70907.getClass(), "frameSerializedDataVersion", 0);
        setField(term70907, term70907.getClass(), "warningString", null);
        setField(term70907, term70907.getClass(), "icons", null);
        setField(term70907, term70907.getClass(), "temporaryLostComponent", null);
        setBooleanField(term70907, term70907.getClass(), "syncLWRequests", false);
        setBooleanField(term70907, term70907.getClass(), "beforeFirstShow", false);
        setBooleanField(term70907, term70907.getClass(), "disposing", false);
        setField(term70907, term70907.getClass(), "disposerRecord", null);
        setBooleanField(term70907, term70907.getClass(), "alwaysOnTop", false);
        setField(term70907, term70907.getClass(), "ownedWindowList", null);
        setField(term70907, term70907.getClass(), "weakThis", null);
        setBooleanField(term70907, term70907.getClass(), "showWithParent", false);
        setField(term70907, term70907.getClass(), "modalBlocker", null);
        setField(term70907, term70907.getClass(), "modalExclusionType", null);
        setField(term70907, term70907.getClass(), "windowListener", null);
        setField(term70907, term70907.getClass(), "windowStateListener", null);
        setField(term70907, term70907.getClass(), "windowFocusListener", null);
        setField(term70907, term70907.getClass(), "inputContext", null);
        setField(term70907, term70907.getClass(), "inputContextLock", null);
        setField(term70907, term70907.getClass(), "focusMgr", null);
        setBooleanField(term70907, term70907.getClass(), "focusableWindowState", false);
        setBooleanField(term70907, term70907.getClass(), "autoRequestFocus", false);
        setBooleanField(term70907, term70907.getClass(), "isInShow", false);
        setFloatField(term70907, term70907.getClass(), "opacity", 0.0F);
        setField(term70907, term70907.getClass(), "shape", null);
        setBooleanField(term70907, term70907.getClass(), "isTrayIconWindow", false);
        setIntField(term70907, term70907.getClass(), "securityWarningWidth", 0);
        setIntField(term70907, term70907.getClass(), "securityWarningHeight", 0);
        setDoubleField(term70907, term70907.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term70907, term70907.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term70907, term70907.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term70907, term70907.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term70907, term70907.getClass(), "anchor", null);
        setField(term70907, term70907.getClass(), "type", null);
        setIntField(term70907, term70907.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term70907, term70907.getClass(), "locationByPlatform", false);
        setField(term70907, term70907.getClass(), "component", null);
        setField(term70907, term70907.getClass(), "layoutMgr", null);
        setField(term70907, term70907.getClass(), "dispatcher", null);
        setField(term70907, term70907.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term70907, term70907.getClass(), "focusCycleRoot", false);
        setBooleanField(term70907, term70907.getClass(), "focusTraversalPolicyProvider", false);
        setField(term70907, term70907.getClass(), "printingThreads", null);
        setBooleanField(term70907, term70907.getClass(), "printing", false);
        setField(term70907, term70907.getClass(), "containerListener", null);
        setIntField(term70907, term70907.getClass(), "listeningChildren", 0);
        setIntField(term70907, term70907.getClass(), "listeningBoundsChildren", 0);
        setIntField(term70907, term70907.getClass(), "descendantsCount", 0);
        setField(term70907, term70907.getClass(), "preserveBackgroundColor", null);
        setIntField(term70907, term70907.getClass(), "numOfHWComponents", 0);
        setIntField(term70907, term70907.getClass(), "numOfLWComponents", 0);
        setField(term70907, term70907.getClass(), "modalComp", null);
        setField(term70907, term70907.getClass(), "modalAppContext", null);
        setIntField(term70907, term70907.getClass(), "containerSerializedDataVersion", 0);
        setField(term70907, term70907.getClass(), "peer", null);
        setField(term70907, term70907.getClass(), "parent", null);
        setField(term70907, term70907.getClass(), "appContext", null);
        setIntField(term70907, term70907.getClass(), "x", 0);
        setIntField(term70907, term70907.getClass(), "y", 0);
        setIntField(term70907, term70907.getClass(), "width", 0);
        setIntField(term70907, term70907.getClass(), "height", 0);
        setField(term70907, term70907.getClass(), "foreground", null);
        setField(term70907, term70907.getClass(), "background", null);
        setField(term70907, term70907.getClass(), "font", null);
        setField(term70907, term70907.getClass(), "peerFont", null);
        setField(term70907, term70907.getClass(), "cursor", null);
        setField(term70907, term70907.getClass(), "locale", null);
        setField(term70907, term70907.getClass(), "graphicsConfig", null);
        setField(term70907, term70907.getClass(), "bufferStrategy", null);
        setBooleanField(term70907, term70907.getClass(), "ignoreRepaint", false);
        setBooleanField(term70907, term70907.getClass(), "visible", false);
        setBooleanField(term70907, term70907.getClass(), "enabled", false);
        setBooleanField(term70907, term70907.getClass(), "valid", false);
        setField(term70907, term70907.getClass(), "dropTarget", null);
        setField(term70907, term70907.getClass(), "popups", null);
        setField(term70907, term70907.getClass(), "name", null);
        setBooleanField(term70907, term70907.getClass(), "nameExplicitlySet", false);
        setBooleanField(term70907, term70907.getClass(), "focusable", false);
        setIntField(term70907, term70907.getClass(), "isFocusTraversableOverridden", 0);
        setField(term70907, term70907.getClass(), "focusTraversalKeys", null);
        setBooleanField(term70907, term70907.getClass(), "focusTraversalKeysEnabled", false);
        setField(term70907, term70907.getClass(), "acc", null);
        setField(term70907, term70907.getClass(), "minSize", null);
        setBooleanField(term70907, term70907.getClass(), "minSizeSet", false);
        setField(term70907, term70907.getClass(), "prefSize", null);
        setBooleanField(term70907, term70907.getClass(), "prefSizeSet", false);
        setField(term70907, term70907.getClass(), "maxSize", null);
        setBooleanField(term70907, term70907.getClass(), "maxSizeSet", false);
        setField(term70907, term70907.getClass(), "componentOrientation", null);
        setBooleanField(term70907, term70907.getClass(), "newEventsOnly", false);
        setField(term70907, term70907.getClass(), "componentListener", null);
        setField(term70907, term70907.getClass(), "focusListener", null);
        setField(term70907, term70907.getClass(), "hierarchyListener", null);
        setField(term70907, term70907.getClass(), "hierarchyBoundsListener", null);
        setField(term70907, term70907.getClass(), "keyListener", null);
        setField(term70907, term70907.getClass(), "mouseListener", null);
        setField(term70907, term70907.getClass(), "mouseMotionListener", null);
        setField(term70907, term70907.getClass(), "mouseWheelListener", null);
        setField(term70907, term70907.getClass(), "inputMethodListener", null);
        setLongField(term70907, term70907.getClass(), "eventMask", 0L);
        setField(term70907, term70907.getClass(), "changeSupport", null);
        setField(term70907, term70907.getClass(), "objectLock", null);
        setBooleanField(term70907, term70907.getClass(), "isPacked", false);
        setIntField(term70907, term70907.getClass(), "boundsOp", 0);
        setField(term70907, term70907.getClass(), "compoundShape", null);
        setField(term70907, term70907.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term70907, term70907.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term70907, term70907.getClass(), "backgroundEraseDisabled", false);
        setField(term70907, term70907.getClass(), "eventCache", null);
        setBooleanField(term70907, term70907.getClass(), "coalescingEnabled", false);
        setBooleanField(term70907, term70907.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term70907, term70907.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.TraceLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "simulatorDidStart", argTypes, term70907, args);
    }

};


