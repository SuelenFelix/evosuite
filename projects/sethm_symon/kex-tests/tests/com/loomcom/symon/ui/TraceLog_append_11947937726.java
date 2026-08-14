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

public class TraceLog_append_11947937726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69068;

    public TraceLog_append_11947937726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69068 = newInstance(Class.forName("com.loomcom.symon.ui.TraceLog"));
        setField(term69068, term69068.getClass(), "traceLog", null);
        setField(term69068, term69068.getClass(), "traceLogTextArea", null);
        setIntField(term69068, term69068.getClass(), "defaultCloseOperation", 0);
        setField(term69068, term69068.getClass(), "transferHandler", null);
        setField(term69068, term69068.getClass(), "rootPane", null);
        setBooleanField(term69068, term69068.getClass(), "rootPaneCheckingEnabled", false);
        setField(term69068, term69068.getClass(), "accessibleContext", null);
        setField(term69068, term69068.getClass(), "maximizedBounds", null);
        setField(term69068, term69068.getClass(), "title", null);
        setField(term69068, term69068.getClass(), "menuBar", null);
        setBooleanField(term69068, term69068.getClass(), "resizable", false);
        setBooleanField(term69068, term69068.getClass(), "undecorated", false);
        setBooleanField(term69068, term69068.getClass(), "mbManagement", false);
        setIntField(term69068, term69068.getClass(), "state", 0);
        setField(term69068, term69068.getClass(), "ownedWindows", null);
        setIntField(term69068, term69068.getClass(), "frameSerializedDataVersion", 0);
        setField(term69068, term69068.getClass(), "warningString", null);
        setField(term69068, term69068.getClass(), "icons", null);
        setField(term69068, term69068.getClass(), "temporaryLostComponent", null);
        setBooleanField(term69068, term69068.getClass(), "syncLWRequests", false);
        setBooleanField(term69068, term69068.getClass(), "beforeFirstShow", false);
        setBooleanField(term69068, term69068.getClass(), "disposing", false);
        setField(term69068, term69068.getClass(), "disposerRecord", null);
        setBooleanField(term69068, term69068.getClass(), "alwaysOnTop", false);
        setField(term69068, term69068.getClass(), "ownedWindowList", null);
        setField(term69068, term69068.getClass(), "weakThis", null);
        setBooleanField(term69068, term69068.getClass(), "showWithParent", false);
        setField(term69068, term69068.getClass(), "modalBlocker", null);
        setField(term69068, term69068.getClass(), "modalExclusionType", null);
        setField(term69068, term69068.getClass(), "windowListener", null);
        setField(term69068, term69068.getClass(), "windowStateListener", null);
        setField(term69068, term69068.getClass(), "windowFocusListener", null);
        setField(term69068, term69068.getClass(), "inputContext", null);
        setField(term69068, term69068.getClass(), "inputContextLock", null);
        setField(term69068, term69068.getClass(), "focusMgr", null);
        setBooleanField(term69068, term69068.getClass(), "focusableWindowState", false);
        setBooleanField(term69068, term69068.getClass(), "autoRequestFocus", false);
        setBooleanField(term69068, term69068.getClass(), "isInShow", false);
        setFloatField(term69068, term69068.getClass(), "opacity", 0.0F);
        setField(term69068, term69068.getClass(), "shape", null);
        setBooleanField(term69068, term69068.getClass(), "isTrayIconWindow", false);
        setIntField(term69068, term69068.getClass(), "securityWarningWidth", 0);
        setIntField(term69068, term69068.getClass(), "securityWarningHeight", 0);
        setDoubleField(term69068, term69068.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term69068, term69068.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term69068, term69068.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term69068, term69068.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term69068, term69068.getClass(), "anchor", null);
        setField(term69068, term69068.getClass(), "type", null);
        setIntField(term69068, term69068.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term69068, term69068.getClass(), "locationByPlatform", false);
        setField(term69068, term69068.getClass(), "component", null);
        setField(term69068, term69068.getClass(), "layoutMgr", null);
        setField(term69068, term69068.getClass(), "dispatcher", null);
        setField(term69068, term69068.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term69068, term69068.getClass(), "focusCycleRoot", false);
        setBooleanField(term69068, term69068.getClass(), "focusTraversalPolicyProvider", false);
        setField(term69068, term69068.getClass(), "printingThreads", null);
        setBooleanField(term69068, term69068.getClass(), "printing", false);
        setField(term69068, term69068.getClass(), "containerListener", null);
        setIntField(term69068, term69068.getClass(), "listeningChildren", 0);
        setIntField(term69068, term69068.getClass(), "listeningBoundsChildren", 0);
        setIntField(term69068, term69068.getClass(), "descendantsCount", 0);
        setField(term69068, term69068.getClass(), "preserveBackgroundColor", null);
        setIntField(term69068, term69068.getClass(), "numOfHWComponents", 0);
        setIntField(term69068, term69068.getClass(), "numOfLWComponents", 0);
        setField(term69068, term69068.getClass(), "modalComp", null);
        setField(term69068, term69068.getClass(), "modalAppContext", null);
        setIntField(term69068, term69068.getClass(), "containerSerializedDataVersion", 0);
        setField(term69068, term69068.getClass(), "peer", null);
        setField(term69068, term69068.getClass(), "parent", null);
        setField(term69068, term69068.getClass(), "appContext", null);
        setIntField(term69068, term69068.getClass(), "x", 0);
        setIntField(term69068, term69068.getClass(), "y", 0);
        setIntField(term69068, term69068.getClass(), "width", 0);
        setIntField(term69068, term69068.getClass(), "height", 0);
        setField(term69068, term69068.getClass(), "foreground", null);
        setField(term69068, term69068.getClass(), "background", null);
        setField(term69068, term69068.getClass(), "font", null);
        setField(term69068, term69068.getClass(), "peerFont", null);
        setField(term69068, term69068.getClass(), "cursor", null);
        setField(term69068, term69068.getClass(), "locale", null);
        setField(term69068, term69068.getClass(), "graphicsConfig", null);
        setField(term69068, term69068.getClass(), "bufferStrategy", null);
        setBooleanField(term69068, term69068.getClass(), "ignoreRepaint", false);
        setBooleanField(term69068, term69068.getClass(), "visible", false);
        setBooleanField(term69068, term69068.getClass(), "enabled", false);
        setBooleanField(term69068, term69068.getClass(), "valid", false);
        setField(term69068, term69068.getClass(), "dropTarget", null);
        setField(term69068, term69068.getClass(), "popups", null);
        setField(term69068, term69068.getClass(), "name", null);
        setBooleanField(term69068, term69068.getClass(), "nameExplicitlySet", false);
        setBooleanField(term69068, term69068.getClass(), "focusable", false);
        setIntField(term69068, term69068.getClass(), "isFocusTraversableOverridden", 0);
        setField(term69068, term69068.getClass(), "focusTraversalKeys", null);
        setBooleanField(term69068, term69068.getClass(), "focusTraversalKeysEnabled", false);
        setField(term69068, term69068.getClass(), "acc", null);
        setField(term69068, term69068.getClass(), "minSize", null);
        setBooleanField(term69068, term69068.getClass(), "minSizeSet", false);
        setField(term69068, term69068.getClass(), "prefSize", null);
        setBooleanField(term69068, term69068.getClass(), "prefSizeSet", false);
        setField(term69068, term69068.getClass(), "maxSize", null);
        setBooleanField(term69068, term69068.getClass(), "maxSizeSet", false);
        setField(term69068, term69068.getClass(), "componentOrientation", null);
        setBooleanField(term69068, term69068.getClass(), "newEventsOnly", false);
        setField(term69068, term69068.getClass(), "componentListener", null);
        setField(term69068, term69068.getClass(), "focusListener", null);
        setField(term69068, term69068.getClass(), "hierarchyListener", null);
        setField(term69068, term69068.getClass(), "hierarchyBoundsListener", null);
        setField(term69068, term69068.getClass(), "keyListener", null);
        setField(term69068, term69068.getClass(), "mouseListener", null);
        setField(term69068, term69068.getClass(), "mouseMotionListener", null);
        setField(term69068, term69068.getClass(), "mouseWheelListener", null);
        setField(term69068, term69068.getClass(), "inputMethodListener", null);
        setLongField(term69068, term69068.getClass(), "eventMask", 0L);
        setField(term69068, term69068.getClass(), "changeSupport", null);
        setField(term69068, term69068.getClass(), "objectLock", null);
        setBooleanField(term69068, term69068.getClass(), "isPacked", false);
        setIntField(term69068, term69068.getClass(), "boundsOp", 0);
        setField(term69068, term69068.getClass(), "compoundShape", null);
        setField(term69068, term69068.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term69068, term69068.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term69068, term69068.getClass(), "backgroundEraseDisabled", false);
        setField(term69068, term69068.getClass(), "eventCache", null);
        setBooleanField(term69068, term69068.getClass(), "coalescingEnabled", false);
        setBooleanField(term69068, term69068.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term69068, term69068.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.TraceLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.CpuState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "append", argTypes, term69068, args);
    }

};


