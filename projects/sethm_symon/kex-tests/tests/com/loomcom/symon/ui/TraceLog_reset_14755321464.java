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

public class TraceLog_reset_14755321464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67027;

    public TraceLog_reset_14755321464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67027 = newInstance(Class.forName("com.loomcom.symon.ui.TraceLog"));
        setField(term67027, term67027.getClass(), "traceLog", null);
        setField(term67027, term67027.getClass(), "traceLogTextArea", null);
        setIntField(term67027, term67027.getClass(), "defaultCloseOperation", 0);
        setField(term67027, term67027.getClass(), "transferHandler", null);
        setField(term67027, term67027.getClass(), "rootPane", null);
        setBooleanField(term67027, term67027.getClass(), "rootPaneCheckingEnabled", false);
        setField(term67027, term67027.getClass(), "accessibleContext", null);
        setField(term67027, term67027.getClass(), "maximizedBounds", null);
        setField(term67027, term67027.getClass(), "title", null);
        setField(term67027, term67027.getClass(), "menuBar", null);
        setBooleanField(term67027, term67027.getClass(), "resizable", false);
        setBooleanField(term67027, term67027.getClass(), "undecorated", false);
        setBooleanField(term67027, term67027.getClass(), "mbManagement", false);
        setIntField(term67027, term67027.getClass(), "state", 0);
        setField(term67027, term67027.getClass(), "ownedWindows", null);
        setIntField(term67027, term67027.getClass(), "frameSerializedDataVersion", 0);
        setField(term67027, term67027.getClass(), "warningString", null);
        setField(term67027, term67027.getClass(), "icons", null);
        setField(term67027, term67027.getClass(), "temporaryLostComponent", null);
        setBooleanField(term67027, term67027.getClass(), "syncLWRequests", false);
        setBooleanField(term67027, term67027.getClass(), "beforeFirstShow", false);
        setBooleanField(term67027, term67027.getClass(), "disposing", false);
        setField(term67027, term67027.getClass(), "disposerRecord", null);
        setBooleanField(term67027, term67027.getClass(), "alwaysOnTop", false);
        setField(term67027, term67027.getClass(), "ownedWindowList", null);
        setField(term67027, term67027.getClass(), "weakThis", null);
        setBooleanField(term67027, term67027.getClass(), "showWithParent", false);
        setField(term67027, term67027.getClass(), "modalBlocker", null);
        setField(term67027, term67027.getClass(), "modalExclusionType", null);
        setField(term67027, term67027.getClass(), "windowListener", null);
        setField(term67027, term67027.getClass(), "windowStateListener", null);
        setField(term67027, term67027.getClass(), "windowFocusListener", null);
        setField(term67027, term67027.getClass(), "inputContext", null);
        setField(term67027, term67027.getClass(), "inputContextLock", null);
        setField(term67027, term67027.getClass(), "focusMgr", null);
        setBooleanField(term67027, term67027.getClass(), "focusableWindowState", false);
        setBooleanField(term67027, term67027.getClass(), "autoRequestFocus", false);
        setBooleanField(term67027, term67027.getClass(), "isInShow", false);
        setFloatField(term67027, term67027.getClass(), "opacity", 0.0F);
        setField(term67027, term67027.getClass(), "shape", null);
        setBooleanField(term67027, term67027.getClass(), "isTrayIconWindow", false);
        setIntField(term67027, term67027.getClass(), "securityWarningWidth", 0);
        setIntField(term67027, term67027.getClass(), "securityWarningHeight", 0);
        setDoubleField(term67027, term67027.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term67027, term67027.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term67027, term67027.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term67027, term67027.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term67027, term67027.getClass(), "anchor", null);
        setField(term67027, term67027.getClass(), "type", null);
        setIntField(term67027, term67027.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term67027, term67027.getClass(), "locationByPlatform", false);
        setField(term67027, term67027.getClass(), "component", null);
        setField(term67027, term67027.getClass(), "layoutMgr", null);
        setField(term67027, term67027.getClass(), "dispatcher", null);
        setField(term67027, term67027.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term67027, term67027.getClass(), "focusCycleRoot", false);
        setBooleanField(term67027, term67027.getClass(), "focusTraversalPolicyProvider", false);
        setField(term67027, term67027.getClass(), "printingThreads", null);
        setBooleanField(term67027, term67027.getClass(), "printing", false);
        setField(term67027, term67027.getClass(), "containerListener", null);
        setIntField(term67027, term67027.getClass(), "listeningChildren", 0);
        setIntField(term67027, term67027.getClass(), "listeningBoundsChildren", 0);
        setIntField(term67027, term67027.getClass(), "descendantsCount", 0);
        setField(term67027, term67027.getClass(), "preserveBackgroundColor", null);
        setIntField(term67027, term67027.getClass(), "numOfHWComponents", 0);
        setIntField(term67027, term67027.getClass(), "numOfLWComponents", 0);
        setField(term67027, term67027.getClass(), "modalComp", null);
        setField(term67027, term67027.getClass(), "modalAppContext", null);
        setIntField(term67027, term67027.getClass(), "containerSerializedDataVersion", 0);
        setField(term67027, term67027.getClass(), "peer", null);
        setField(term67027, term67027.getClass(), "parent", null);
        setField(term67027, term67027.getClass(), "appContext", null);
        setIntField(term67027, term67027.getClass(), "x", 0);
        setIntField(term67027, term67027.getClass(), "y", 0);
        setIntField(term67027, term67027.getClass(), "width", 0);
        setIntField(term67027, term67027.getClass(), "height", 0);
        setField(term67027, term67027.getClass(), "foreground", null);
        setField(term67027, term67027.getClass(), "background", null);
        setField(term67027, term67027.getClass(), "font", null);
        setField(term67027, term67027.getClass(), "peerFont", null);
        setField(term67027, term67027.getClass(), "cursor", null);
        setField(term67027, term67027.getClass(), "locale", null);
        setField(term67027, term67027.getClass(), "graphicsConfig", null);
        setField(term67027, term67027.getClass(), "bufferStrategy", null);
        setBooleanField(term67027, term67027.getClass(), "ignoreRepaint", false);
        setBooleanField(term67027, term67027.getClass(), "visible", false);
        setBooleanField(term67027, term67027.getClass(), "enabled", false);
        setBooleanField(term67027, term67027.getClass(), "valid", false);
        setField(term67027, term67027.getClass(), "dropTarget", null);
        setField(term67027, term67027.getClass(), "popups", null);
        setField(term67027, term67027.getClass(), "name", null);
        setBooleanField(term67027, term67027.getClass(), "nameExplicitlySet", false);
        setBooleanField(term67027, term67027.getClass(), "focusable", false);
        setIntField(term67027, term67027.getClass(), "isFocusTraversableOverridden", 0);
        setField(term67027, term67027.getClass(), "focusTraversalKeys", null);
        setBooleanField(term67027, term67027.getClass(), "focusTraversalKeysEnabled", false);
        setField(term67027, term67027.getClass(), "acc", null);
        setField(term67027, term67027.getClass(), "minSize", null);
        setBooleanField(term67027, term67027.getClass(), "minSizeSet", false);
        setField(term67027, term67027.getClass(), "prefSize", null);
        setBooleanField(term67027, term67027.getClass(), "prefSizeSet", false);
        setField(term67027, term67027.getClass(), "maxSize", null);
        setBooleanField(term67027, term67027.getClass(), "maxSizeSet", false);
        setField(term67027, term67027.getClass(), "componentOrientation", null);
        setBooleanField(term67027, term67027.getClass(), "newEventsOnly", false);
        setField(term67027, term67027.getClass(), "componentListener", null);
        setField(term67027, term67027.getClass(), "focusListener", null);
        setField(term67027, term67027.getClass(), "hierarchyListener", null);
        setField(term67027, term67027.getClass(), "hierarchyBoundsListener", null);
        setField(term67027, term67027.getClass(), "keyListener", null);
        setField(term67027, term67027.getClass(), "mouseListener", null);
        setField(term67027, term67027.getClass(), "mouseMotionListener", null);
        setField(term67027, term67027.getClass(), "mouseWheelListener", null);
        setField(term67027, term67027.getClass(), "inputMethodListener", null);
        setLongField(term67027, term67027.getClass(), "eventMask", 0L);
        setField(term67027, term67027.getClass(), "changeSupport", null);
        setField(term67027, term67027.getClass(), "objectLock", null);
        setBooleanField(term67027, term67027.getClass(), "isPacked", false);
        setIntField(term67027, term67027.getClass(), "boundsOp", 0);
        setField(term67027, term67027.getClass(), "compoundShape", null);
        setField(term67027, term67027.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term67027, term67027.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term67027, term67027.getClass(), "backgroundEraseDisabled", false);
        setField(term67027, term67027.getClass(), "eventCache", null);
        setBooleanField(term67027, term67027.getClass(), "coalescingEnabled", false);
        setBooleanField(term67027, term67027.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term67027, term67027.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.TraceLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term67027, args);
    }

};


