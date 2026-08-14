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

public class TraceLog_refresh_11577869062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65118;

    public TraceLog_refresh_11577869062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65118 = newInstance(Class.forName("com.loomcom.symon.ui.TraceLog"));
        setField(term65118, term65118.getClass(), "traceLog", null);
        setField(term65118, term65118.getClass(), "traceLogTextArea", null);
        setIntField(term65118, term65118.getClass(), "defaultCloseOperation", 0);
        setField(term65118, term65118.getClass(), "transferHandler", null);
        setField(term65118, term65118.getClass(), "rootPane", null);
        setBooleanField(term65118, term65118.getClass(), "rootPaneCheckingEnabled", false);
        setField(term65118, term65118.getClass(), "accessibleContext", null);
        setField(term65118, term65118.getClass(), "maximizedBounds", null);
        setField(term65118, term65118.getClass(), "title", null);
        setField(term65118, term65118.getClass(), "menuBar", null);
        setBooleanField(term65118, term65118.getClass(), "resizable", false);
        setBooleanField(term65118, term65118.getClass(), "undecorated", false);
        setBooleanField(term65118, term65118.getClass(), "mbManagement", false);
        setIntField(term65118, term65118.getClass(), "state", 0);
        setField(term65118, term65118.getClass(), "ownedWindows", null);
        setIntField(term65118, term65118.getClass(), "frameSerializedDataVersion", 0);
        setField(term65118, term65118.getClass(), "warningString", null);
        setField(term65118, term65118.getClass(), "icons", null);
        setField(term65118, term65118.getClass(), "temporaryLostComponent", null);
        setBooleanField(term65118, term65118.getClass(), "syncLWRequests", false);
        setBooleanField(term65118, term65118.getClass(), "beforeFirstShow", false);
        setBooleanField(term65118, term65118.getClass(), "disposing", false);
        setField(term65118, term65118.getClass(), "disposerRecord", null);
        setBooleanField(term65118, term65118.getClass(), "alwaysOnTop", false);
        setField(term65118, term65118.getClass(), "ownedWindowList", null);
        setField(term65118, term65118.getClass(), "weakThis", null);
        setBooleanField(term65118, term65118.getClass(), "showWithParent", false);
        setField(term65118, term65118.getClass(), "modalBlocker", null);
        setField(term65118, term65118.getClass(), "modalExclusionType", null);
        setField(term65118, term65118.getClass(), "windowListener", null);
        setField(term65118, term65118.getClass(), "windowStateListener", null);
        setField(term65118, term65118.getClass(), "windowFocusListener", null);
        setField(term65118, term65118.getClass(), "inputContext", null);
        setField(term65118, term65118.getClass(), "inputContextLock", null);
        setField(term65118, term65118.getClass(), "focusMgr", null);
        setBooleanField(term65118, term65118.getClass(), "focusableWindowState", false);
        setBooleanField(term65118, term65118.getClass(), "autoRequestFocus", false);
        setBooleanField(term65118, term65118.getClass(), "isInShow", false);
        setFloatField(term65118, term65118.getClass(), "opacity", 0.0F);
        setField(term65118, term65118.getClass(), "shape", null);
        setBooleanField(term65118, term65118.getClass(), "isTrayIconWindow", false);
        setIntField(term65118, term65118.getClass(), "securityWarningWidth", 0);
        setIntField(term65118, term65118.getClass(), "securityWarningHeight", 0);
        setDoubleField(term65118, term65118.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term65118, term65118.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term65118, term65118.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term65118, term65118.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term65118, term65118.getClass(), "anchor", null);
        setField(term65118, term65118.getClass(), "type", null);
        setIntField(term65118, term65118.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term65118, term65118.getClass(), "locationByPlatform", false);
        setField(term65118, term65118.getClass(), "component", null);
        setField(term65118, term65118.getClass(), "layoutMgr", null);
        setField(term65118, term65118.getClass(), "dispatcher", null);
        setField(term65118, term65118.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term65118, term65118.getClass(), "focusCycleRoot", false);
        setBooleanField(term65118, term65118.getClass(), "focusTraversalPolicyProvider", false);
        setField(term65118, term65118.getClass(), "printingThreads", null);
        setBooleanField(term65118, term65118.getClass(), "printing", false);
        setField(term65118, term65118.getClass(), "containerListener", null);
        setIntField(term65118, term65118.getClass(), "listeningChildren", 0);
        setIntField(term65118, term65118.getClass(), "listeningBoundsChildren", 0);
        setIntField(term65118, term65118.getClass(), "descendantsCount", 0);
        setField(term65118, term65118.getClass(), "preserveBackgroundColor", null);
        setIntField(term65118, term65118.getClass(), "numOfHWComponents", 0);
        setIntField(term65118, term65118.getClass(), "numOfLWComponents", 0);
        setField(term65118, term65118.getClass(), "modalComp", null);
        setField(term65118, term65118.getClass(), "modalAppContext", null);
        setIntField(term65118, term65118.getClass(), "containerSerializedDataVersion", 0);
        setField(term65118, term65118.getClass(), "peer", null);
        setField(term65118, term65118.getClass(), "parent", null);
        setField(term65118, term65118.getClass(), "appContext", null);
        setIntField(term65118, term65118.getClass(), "x", 0);
        setIntField(term65118, term65118.getClass(), "y", 0);
        setIntField(term65118, term65118.getClass(), "width", 0);
        setIntField(term65118, term65118.getClass(), "height", 0);
        setField(term65118, term65118.getClass(), "foreground", null);
        setField(term65118, term65118.getClass(), "background", null);
        setField(term65118, term65118.getClass(), "font", null);
        setField(term65118, term65118.getClass(), "peerFont", null);
        setField(term65118, term65118.getClass(), "cursor", null);
        setField(term65118, term65118.getClass(), "locale", null);
        setField(term65118, term65118.getClass(), "graphicsConfig", null);
        setField(term65118, term65118.getClass(), "bufferStrategy", null);
        setBooleanField(term65118, term65118.getClass(), "ignoreRepaint", false);
        setBooleanField(term65118, term65118.getClass(), "visible", false);
        setBooleanField(term65118, term65118.getClass(), "enabled", false);
        setBooleanField(term65118, term65118.getClass(), "valid", false);
        setField(term65118, term65118.getClass(), "dropTarget", null);
        setField(term65118, term65118.getClass(), "popups", null);
        setField(term65118, term65118.getClass(), "name", null);
        setBooleanField(term65118, term65118.getClass(), "nameExplicitlySet", false);
        setBooleanField(term65118, term65118.getClass(), "focusable", false);
        setIntField(term65118, term65118.getClass(), "isFocusTraversableOverridden", 0);
        setField(term65118, term65118.getClass(), "focusTraversalKeys", null);
        setBooleanField(term65118, term65118.getClass(), "focusTraversalKeysEnabled", false);
        setField(term65118, term65118.getClass(), "acc", null);
        setField(term65118, term65118.getClass(), "minSize", null);
        setBooleanField(term65118, term65118.getClass(), "minSizeSet", false);
        setField(term65118, term65118.getClass(), "prefSize", null);
        setBooleanField(term65118, term65118.getClass(), "prefSizeSet", false);
        setField(term65118, term65118.getClass(), "maxSize", null);
        setBooleanField(term65118, term65118.getClass(), "maxSizeSet", false);
        setField(term65118, term65118.getClass(), "componentOrientation", null);
        setBooleanField(term65118, term65118.getClass(), "newEventsOnly", false);
        setField(term65118, term65118.getClass(), "componentListener", null);
        setField(term65118, term65118.getClass(), "focusListener", null);
        setField(term65118, term65118.getClass(), "hierarchyListener", null);
        setField(term65118, term65118.getClass(), "hierarchyBoundsListener", null);
        setField(term65118, term65118.getClass(), "keyListener", null);
        setField(term65118, term65118.getClass(), "mouseListener", null);
        setField(term65118, term65118.getClass(), "mouseMotionListener", null);
        setField(term65118, term65118.getClass(), "mouseWheelListener", null);
        setField(term65118, term65118.getClass(), "inputMethodListener", null);
        setLongField(term65118, term65118.getClass(), "eventMask", 0L);
        setField(term65118, term65118.getClass(), "changeSupport", null);
        setField(term65118, term65118.getClass(), "objectLock", null);
        setBooleanField(term65118, term65118.getClass(), "isPacked", false);
        setIntField(term65118, term65118.getClass(), "boundsOp", 0);
        setField(term65118, term65118.getClass(), "compoundShape", null);
        setField(term65118, term65118.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term65118, term65118.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term65118, term65118.getClass(), "backgroundEraseDisabled", false);
        setField(term65118, term65118.getClass(), "eventCache", null);
        setBooleanField(term65118, term65118.getClass(), "coalescingEnabled", false);
        setBooleanField(term65118, term65118.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term65118, term65118.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.TraceLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "refresh", argTypes, term65118, args);
    }

};


