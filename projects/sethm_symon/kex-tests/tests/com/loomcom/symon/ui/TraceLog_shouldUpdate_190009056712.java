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

public class TraceLog_shouldUpdate_190009056712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74916;

    public TraceLog_shouldUpdate_190009056712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74916 = newInstance(Class.forName("com.loomcom.symon.ui.TraceLog"));
        setField(term74916, term74916.getClass(), "traceLog", null);
        setField(term74916, term74916.getClass(), "traceLogTextArea", null);
        setIntField(term74916, term74916.getClass(), "defaultCloseOperation", 0);
        setField(term74916, term74916.getClass(), "transferHandler", null);
        setField(term74916, term74916.getClass(), "rootPane", null);
        setBooleanField(term74916, term74916.getClass(), "rootPaneCheckingEnabled", false);
        setField(term74916, term74916.getClass(), "accessibleContext", null);
        setField(term74916, term74916.getClass(), "maximizedBounds", null);
        setField(term74916, term74916.getClass(), "title", null);
        setField(term74916, term74916.getClass(), "menuBar", null);
        setBooleanField(term74916, term74916.getClass(), "resizable", false);
        setBooleanField(term74916, term74916.getClass(), "undecorated", false);
        setBooleanField(term74916, term74916.getClass(), "mbManagement", false);
        setIntField(term74916, term74916.getClass(), "state", 0);
        setField(term74916, term74916.getClass(), "ownedWindows", null);
        setIntField(term74916, term74916.getClass(), "frameSerializedDataVersion", 0);
        setField(term74916, term74916.getClass(), "warningString", null);
        setField(term74916, term74916.getClass(), "icons", null);
        setField(term74916, term74916.getClass(), "temporaryLostComponent", null);
        setBooleanField(term74916, term74916.getClass(), "syncLWRequests", false);
        setBooleanField(term74916, term74916.getClass(), "beforeFirstShow", false);
        setBooleanField(term74916, term74916.getClass(), "disposing", false);
        setField(term74916, term74916.getClass(), "disposerRecord", null);
        setBooleanField(term74916, term74916.getClass(), "alwaysOnTop", false);
        setField(term74916, term74916.getClass(), "ownedWindowList", null);
        setField(term74916, term74916.getClass(), "weakThis", null);
        setBooleanField(term74916, term74916.getClass(), "showWithParent", false);
        setField(term74916, term74916.getClass(), "modalBlocker", null);
        setField(term74916, term74916.getClass(), "modalExclusionType", null);
        setField(term74916, term74916.getClass(), "windowListener", null);
        setField(term74916, term74916.getClass(), "windowStateListener", null);
        setField(term74916, term74916.getClass(), "windowFocusListener", null);
        setField(term74916, term74916.getClass(), "inputContext", null);
        setField(term74916, term74916.getClass(), "inputContextLock", null);
        setField(term74916, term74916.getClass(), "focusMgr", null);
        setBooleanField(term74916, term74916.getClass(), "focusableWindowState", false);
        setBooleanField(term74916, term74916.getClass(), "autoRequestFocus", false);
        setBooleanField(term74916, term74916.getClass(), "isInShow", false);
        setFloatField(term74916, term74916.getClass(), "opacity", 0.0F);
        setField(term74916, term74916.getClass(), "shape", null);
        setBooleanField(term74916, term74916.getClass(), "isTrayIconWindow", false);
        setIntField(term74916, term74916.getClass(), "securityWarningWidth", 0);
        setIntField(term74916, term74916.getClass(), "securityWarningHeight", 0);
        setDoubleField(term74916, term74916.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term74916, term74916.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term74916, term74916.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term74916, term74916.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term74916, term74916.getClass(), "anchor", null);
        setField(term74916, term74916.getClass(), "type", null);
        setIntField(term74916, term74916.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term74916, term74916.getClass(), "locationByPlatform", false);
        setField(term74916, term74916.getClass(), "component", null);
        setField(term74916, term74916.getClass(), "layoutMgr", null);
        setField(term74916, term74916.getClass(), "dispatcher", null);
        setField(term74916, term74916.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term74916, term74916.getClass(), "focusCycleRoot", false);
        setBooleanField(term74916, term74916.getClass(), "focusTraversalPolicyProvider", false);
        setField(term74916, term74916.getClass(), "printingThreads", null);
        setBooleanField(term74916, term74916.getClass(), "printing", false);
        setField(term74916, term74916.getClass(), "containerListener", null);
        setIntField(term74916, term74916.getClass(), "listeningChildren", 0);
        setIntField(term74916, term74916.getClass(), "listeningBoundsChildren", 0);
        setIntField(term74916, term74916.getClass(), "descendantsCount", 0);
        setField(term74916, term74916.getClass(), "preserveBackgroundColor", null);
        setIntField(term74916, term74916.getClass(), "numOfHWComponents", 0);
        setIntField(term74916, term74916.getClass(), "numOfLWComponents", 0);
        setField(term74916, term74916.getClass(), "modalComp", null);
        setField(term74916, term74916.getClass(), "modalAppContext", null);
        setIntField(term74916, term74916.getClass(), "containerSerializedDataVersion", 0);
        setField(term74916, term74916.getClass(), "peer", null);
        setField(term74916, term74916.getClass(), "parent", null);
        setField(term74916, term74916.getClass(), "appContext", null);
        setIntField(term74916, term74916.getClass(), "x", 0);
        setIntField(term74916, term74916.getClass(), "y", 0);
        setIntField(term74916, term74916.getClass(), "width", 0);
        setIntField(term74916, term74916.getClass(), "height", 0);
        setField(term74916, term74916.getClass(), "foreground", null);
        setField(term74916, term74916.getClass(), "background", null);
        setField(term74916, term74916.getClass(), "font", null);
        setField(term74916, term74916.getClass(), "peerFont", null);
        setField(term74916, term74916.getClass(), "cursor", null);
        setField(term74916, term74916.getClass(), "locale", null);
        setField(term74916, term74916.getClass(), "graphicsConfig", null);
        setField(term74916, term74916.getClass(), "bufferStrategy", null);
        setBooleanField(term74916, term74916.getClass(), "ignoreRepaint", false);
        setBooleanField(term74916, term74916.getClass(), "visible", false);
        setBooleanField(term74916, term74916.getClass(), "enabled", false);
        setBooleanField(term74916, term74916.getClass(), "valid", false);
        setField(term74916, term74916.getClass(), "dropTarget", null);
        setField(term74916, term74916.getClass(), "popups", null);
        setField(term74916, term74916.getClass(), "name", null);
        setBooleanField(term74916, term74916.getClass(), "nameExplicitlySet", false);
        setBooleanField(term74916, term74916.getClass(), "focusable", false);
        setIntField(term74916, term74916.getClass(), "isFocusTraversableOverridden", 0);
        setField(term74916, term74916.getClass(), "focusTraversalKeys", null);
        setBooleanField(term74916, term74916.getClass(), "focusTraversalKeysEnabled", false);
        setField(term74916, term74916.getClass(), "acc", null);
        setField(term74916, term74916.getClass(), "minSize", null);
        setBooleanField(term74916, term74916.getClass(), "minSizeSet", false);
        setField(term74916, term74916.getClass(), "prefSize", null);
        setBooleanField(term74916, term74916.getClass(), "prefSizeSet", false);
        setField(term74916, term74916.getClass(), "maxSize", null);
        setBooleanField(term74916, term74916.getClass(), "maxSizeSet", false);
        setField(term74916, term74916.getClass(), "componentOrientation", null);
        setBooleanField(term74916, term74916.getClass(), "newEventsOnly", false);
        setField(term74916, term74916.getClass(), "componentListener", null);
        setField(term74916, term74916.getClass(), "focusListener", null);
        setField(term74916, term74916.getClass(), "hierarchyListener", null);
        setField(term74916, term74916.getClass(), "hierarchyBoundsListener", null);
        setField(term74916, term74916.getClass(), "keyListener", null);
        setField(term74916, term74916.getClass(), "mouseListener", null);
        setField(term74916, term74916.getClass(), "mouseMotionListener", null);
        setField(term74916, term74916.getClass(), "mouseWheelListener", null);
        setField(term74916, term74916.getClass(), "inputMethodListener", null);
        setLongField(term74916, term74916.getClass(), "eventMask", 0L);
        setField(term74916, term74916.getClass(), "changeSupport", null);
        setField(term74916, term74916.getClass(), "objectLock", null);
        setBooleanField(term74916, term74916.getClass(), "isPacked", false);
        setIntField(term74916, term74916.getClass(), "boundsOp", 0);
        setField(term74916, term74916.getClass(), "compoundShape", null);
        setField(term74916, term74916.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term74916, term74916.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term74916, term74916.getClass(), "backgroundEraseDisabled", false);
        setField(term74916, term74916.getClass(), "eventCache", null);
        setBooleanField(term74916, term74916.getClass(), "coalescingEnabled", false);
        setBooleanField(term74916, term74916.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term74916, term74916.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.TraceLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "shouldUpdate", argTypes, term74916, args);
    }

};


