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

public class TraceLog_simulatorDidStop_161866285210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73090;

    public TraceLog_simulatorDidStop_161866285210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73090 = newInstance(Class.forName("com.loomcom.symon.ui.TraceLog"));
        setField(term73090, term73090.getClass(), "traceLog", null);
        setField(term73090, term73090.getClass(), "traceLogTextArea", null);
        setIntField(term73090, term73090.getClass(), "defaultCloseOperation", 0);
        setField(term73090, term73090.getClass(), "transferHandler", null);
        setField(term73090, term73090.getClass(), "rootPane", null);
        setBooleanField(term73090, term73090.getClass(), "rootPaneCheckingEnabled", false);
        setField(term73090, term73090.getClass(), "accessibleContext", null);
        setField(term73090, term73090.getClass(), "maximizedBounds", null);
        setField(term73090, term73090.getClass(), "title", null);
        setField(term73090, term73090.getClass(), "menuBar", null);
        setBooleanField(term73090, term73090.getClass(), "resizable", false);
        setBooleanField(term73090, term73090.getClass(), "undecorated", false);
        setBooleanField(term73090, term73090.getClass(), "mbManagement", false);
        setIntField(term73090, term73090.getClass(), "state", 0);
        setField(term73090, term73090.getClass(), "ownedWindows", null);
        setIntField(term73090, term73090.getClass(), "frameSerializedDataVersion", 0);
        setField(term73090, term73090.getClass(), "warningString", null);
        setField(term73090, term73090.getClass(), "icons", null);
        setField(term73090, term73090.getClass(), "temporaryLostComponent", null);
        setBooleanField(term73090, term73090.getClass(), "syncLWRequests", false);
        setBooleanField(term73090, term73090.getClass(), "beforeFirstShow", false);
        setBooleanField(term73090, term73090.getClass(), "disposing", false);
        setField(term73090, term73090.getClass(), "disposerRecord", null);
        setBooleanField(term73090, term73090.getClass(), "alwaysOnTop", false);
        setField(term73090, term73090.getClass(), "ownedWindowList", null);
        setField(term73090, term73090.getClass(), "weakThis", null);
        setBooleanField(term73090, term73090.getClass(), "showWithParent", false);
        setField(term73090, term73090.getClass(), "modalBlocker", null);
        setField(term73090, term73090.getClass(), "modalExclusionType", null);
        setField(term73090, term73090.getClass(), "windowListener", null);
        setField(term73090, term73090.getClass(), "windowStateListener", null);
        setField(term73090, term73090.getClass(), "windowFocusListener", null);
        setField(term73090, term73090.getClass(), "inputContext", null);
        setField(term73090, term73090.getClass(), "inputContextLock", null);
        setField(term73090, term73090.getClass(), "focusMgr", null);
        setBooleanField(term73090, term73090.getClass(), "focusableWindowState", false);
        setBooleanField(term73090, term73090.getClass(), "autoRequestFocus", false);
        setBooleanField(term73090, term73090.getClass(), "isInShow", false);
        setFloatField(term73090, term73090.getClass(), "opacity", 0.0F);
        setField(term73090, term73090.getClass(), "shape", null);
        setBooleanField(term73090, term73090.getClass(), "isTrayIconWindow", false);
        setIntField(term73090, term73090.getClass(), "securityWarningWidth", 0);
        setIntField(term73090, term73090.getClass(), "securityWarningHeight", 0);
        setDoubleField(term73090, term73090.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term73090, term73090.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term73090, term73090.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term73090, term73090.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term73090, term73090.getClass(), "anchor", null);
        setField(term73090, term73090.getClass(), "type", null);
        setIntField(term73090, term73090.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term73090, term73090.getClass(), "locationByPlatform", false);
        setField(term73090, term73090.getClass(), "component", null);
        setField(term73090, term73090.getClass(), "layoutMgr", null);
        setField(term73090, term73090.getClass(), "dispatcher", null);
        setField(term73090, term73090.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term73090, term73090.getClass(), "focusCycleRoot", false);
        setBooleanField(term73090, term73090.getClass(), "focusTraversalPolicyProvider", false);
        setField(term73090, term73090.getClass(), "printingThreads", null);
        setBooleanField(term73090, term73090.getClass(), "printing", false);
        setField(term73090, term73090.getClass(), "containerListener", null);
        setIntField(term73090, term73090.getClass(), "listeningChildren", 0);
        setIntField(term73090, term73090.getClass(), "listeningBoundsChildren", 0);
        setIntField(term73090, term73090.getClass(), "descendantsCount", 0);
        setField(term73090, term73090.getClass(), "preserveBackgroundColor", null);
        setIntField(term73090, term73090.getClass(), "numOfHWComponents", 0);
        setIntField(term73090, term73090.getClass(), "numOfLWComponents", 0);
        setField(term73090, term73090.getClass(), "modalComp", null);
        setField(term73090, term73090.getClass(), "modalAppContext", null);
        setIntField(term73090, term73090.getClass(), "containerSerializedDataVersion", 0);
        setField(term73090, term73090.getClass(), "peer", null);
        setField(term73090, term73090.getClass(), "parent", null);
        setField(term73090, term73090.getClass(), "appContext", null);
        setIntField(term73090, term73090.getClass(), "x", 0);
        setIntField(term73090, term73090.getClass(), "y", 0);
        setIntField(term73090, term73090.getClass(), "width", 0);
        setIntField(term73090, term73090.getClass(), "height", 0);
        setField(term73090, term73090.getClass(), "foreground", null);
        setField(term73090, term73090.getClass(), "background", null);
        setField(term73090, term73090.getClass(), "font", null);
        setField(term73090, term73090.getClass(), "peerFont", null);
        setField(term73090, term73090.getClass(), "cursor", null);
        setField(term73090, term73090.getClass(), "locale", null);
        setField(term73090, term73090.getClass(), "graphicsConfig", null);
        setField(term73090, term73090.getClass(), "bufferStrategy", null);
        setBooleanField(term73090, term73090.getClass(), "ignoreRepaint", false);
        setBooleanField(term73090, term73090.getClass(), "visible", false);
        setBooleanField(term73090, term73090.getClass(), "enabled", false);
        setBooleanField(term73090, term73090.getClass(), "valid", false);
        setField(term73090, term73090.getClass(), "dropTarget", null);
        setField(term73090, term73090.getClass(), "popups", null);
        setField(term73090, term73090.getClass(), "name", null);
        setBooleanField(term73090, term73090.getClass(), "nameExplicitlySet", false);
        setBooleanField(term73090, term73090.getClass(), "focusable", false);
        setIntField(term73090, term73090.getClass(), "isFocusTraversableOverridden", 0);
        setField(term73090, term73090.getClass(), "focusTraversalKeys", null);
        setBooleanField(term73090, term73090.getClass(), "focusTraversalKeysEnabled", false);
        setField(term73090, term73090.getClass(), "acc", null);
        setField(term73090, term73090.getClass(), "minSize", null);
        setBooleanField(term73090, term73090.getClass(), "minSizeSet", false);
        setField(term73090, term73090.getClass(), "prefSize", null);
        setBooleanField(term73090, term73090.getClass(), "prefSizeSet", false);
        setField(term73090, term73090.getClass(), "maxSize", null);
        setBooleanField(term73090, term73090.getClass(), "maxSizeSet", false);
        setField(term73090, term73090.getClass(), "componentOrientation", null);
        setBooleanField(term73090, term73090.getClass(), "newEventsOnly", false);
        setField(term73090, term73090.getClass(), "componentListener", null);
        setField(term73090, term73090.getClass(), "focusListener", null);
        setField(term73090, term73090.getClass(), "hierarchyListener", null);
        setField(term73090, term73090.getClass(), "hierarchyBoundsListener", null);
        setField(term73090, term73090.getClass(), "keyListener", null);
        setField(term73090, term73090.getClass(), "mouseListener", null);
        setField(term73090, term73090.getClass(), "mouseMotionListener", null);
        setField(term73090, term73090.getClass(), "mouseWheelListener", null);
        setField(term73090, term73090.getClass(), "inputMethodListener", null);
        setLongField(term73090, term73090.getClass(), "eventMask", 0L);
        setField(term73090, term73090.getClass(), "changeSupport", null);
        setField(term73090, term73090.getClass(), "objectLock", null);
        setBooleanField(term73090, term73090.getClass(), "isPacked", false);
        setIntField(term73090, term73090.getClass(), "boundsOp", 0);
        setField(term73090, term73090.getClass(), "compoundShape", null);
        setField(term73090, term73090.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term73090, term73090.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term73090, term73090.getClass(), "backgroundEraseDisabled", false);
        setField(term73090, term73090.getClass(), "eventCache", null);
        setBooleanField(term73090, term73090.getClass(), "coalescingEnabled", false);
        setBooleanField(term73090, term73090.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term73090, term73090.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.TraceLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "simulatorDidStop", argTypes, term73090, args);
    }

};


