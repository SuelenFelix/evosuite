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

public class MemoryWindow_updateState_256421312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49062;

    public MemoryWindow_updateState_256421312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49062 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow"));
        setField(term49062, term49062.getClass(), "memoryTableModel", null);
        setField(term49062, term49062.getClass(), "memoryTable", null);
        setField(term49062, term49062.getClass(), "pageNumberTextField", null);
        setField(term49062, term49062.getClass(), "previousPageButton", null);
        setField(term49062, term49062.getClass(), "nextPageButton", null);
        setIntField(term49062, term49062.getClass(), "defaultCloseOperation", 0);
        setField(term49062, term49062.getClass(), "transferHandler", null);
        setField(term49062, term49062.getClass(), "rootPane", null);
        setBooleanField(term49062, term49062.getClass(), "rootPaneCheckingEnabled", false);
        setField(term49062, term49062.getClass(), "accessibleContext", null);
        setField(term49062, term49062.getClass(), "maximizedBounds", null);
        setField(term49062, term49062.getClass(), "title", null);
        setField(term49062, term49062.getClass(), "menuBar", null);
        setBooleanField(term49062, term49062.getClass(), "resizable", false);
        setBooleanField(term49062, term49062.getClass(), "undecorated", false);
        setBooleanField(term49062, term49062.getClass(), "mbManagement", false);
        setIntField(term49062, term49062.getClass(), "state", 0);
        setField(term49062, term49062.getClass(), "ownedWindows", null);
        setIntField(term49062, term49062.getClass(), "frameSerializedDataVersion", 0);
        setField(term49062, term49062.getClass(), "warningString", null);
        setField(term49062, term49062.getClass(), "icons", null);
        setField(term49062, term49062.getClass(), "temporaryLostComponent", null);
        setBooleanField(term49062, term49062.getClass(), "syncLWRequests", false);
        setBooleanField(term49062, term49062.getClass(), "beforeFirstShow", false);
        setBooleanField(term49062, term49062.getClass(), "disposing", false);
        setField(term49062, term49062.getClass(), "disposerRecord", null);
        setBooleanField(term49062, term49062.getClass(), "alwaysOnTop", false);
        setField(term49062, term49062.getClass(), "ownedWindowList", null);
        setField(term49062, term49062.getClass(), "weakThis", null);
        setBooleanField(term49062, term49062.getClass(), "showWithParent", false);
        setField(term49062, term49062.getClass(), "modalBlocker", null);
        setField(term49062, term49062.getClass(), "modalExclusionType", null);
        setField(term49062, term49062.getClass(), "windowListener", null);
        setField(term49062, term49062.getClass(), "windowStateListener", null);
        setField(term49062, term49062.getClass(), "windowFocusListener", null);
        setField(term49062, term49062.getClass(), "inputContext", null);
        setField(term49062, term49062.getClass(), "inputContextLock", null);
        setField(term49062, term49062.getClass(), "focusMgr", null);
        setBooleanField(term49062, term49062.getClass(), "focusableWindowState", false);
        setBooleanField(term49062, term49062.getClass(), "autoRequestFocus", false);
        setBooleanField(term49062, term49062.getClass(), "isInShow", false);
        setFloatField(term49062, term49062.getClass(), "opacity", 0.0F);
        setField(term49062, term49062.getClass(), "shape", null);
        setBooleanField(term49062, term49062.getClass(), "isTrayIconWindow", false);
        setIntField(term49062, term49062.getClass(), "securityWarningWidth", 0);
        setIntField(term49062, term49062.getClass(), "securityWarningHeight", 0);
        setDoubleField(term49062, term49062.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term49062, term49062.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term49062, term49062.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term49062, term49062.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term49062, term49062.getClass(), "anchor", null);
        setField(term49062, term49062.getClass(), "type", null);
        setIntField(term49062, term49062.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term49062, term49062.getClass(), "locationByPlatform", false);
        setField(term49062, term49062.getClass(), "component", null);
        setField(term49062, term49062.getClass(), "layoutMgr", null);
        setField(term49062, term49062.getClass(), "dispatcher", null);
        setField(term49062, term49062.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term49062, term49062.getClass(), "focusCycleRoot", false);
        setBooleanField(term49062, term49062.getClass(), "focusTraversalPolicyProvider", false);
        setField(term49062, term49062.getClass(), "printingThreads", null);
        setBooleanField(term49062, term49062.getClass(), "printing", false);
        setField(term49062, term49062.getClass(), "containerListener", null);
        setIntField(term49062, term49062.getClass(), "listeningChildren", 0);
        setIntField(term49062, term49062.getClass(), "listeningBoundsChildren", 0);
        setIntField(term49062, term49062.getClass(), "descendantsCount", 0);
        setField(term49062, term49062.getClass(), "preserveBackgroundColor", null);
        setIntField(term49062, term49062.getClass(), "numOfHWComponents", 0);
        setIntField(term49062, term49062.getClass(), "numOfLWComponents", 0);
        setField(term49062, term49062.getClass(), "modalComp", null);
        setField(term49062, term49062.getClass(), "modalAppContext", null);
        setIntField(term49062, term49062.getClass(), "containerSerializedDataVersion", 0);
        setField(term49062, term49062.getClass(), "peer", null);
        setField(term49062, term49062.getClass(), "parent", null);
        setField(term49062, term49062.getClass(), "appContext", null);
        setIntField(term49062, term49062.getClass(), "x", 0);
        setIntField(term49062, term49062.getClass(), "y", 0);
        setIntField(term49062, term49062.getClass(), "width", 0);
        setIntField(term49062, term49062.getClass(), "height", 0);
        setField(term49062, term49062.getClass(), "foreground", null);
        setField(term49062, term49062.getClass(), "background", null);
        setField(term49062, term49062.getClass(), "font", null);
        setField(term49062, term49062.getClass(), "peerFont", null);
        setField(term49062, term49062.getClass(), "cursor", null);
        setField(term49062, term49062.getClass(), "locale", null);
        setField(term49062, term49062.getClass(), "graphicsConfig", null);
        setField(term49062, term49062.getClass(), "bufferStrategy", null);
        setBooleanField(term49062, term49062.getClass(), "ignoreRepaint", false);
        setBooleanField(term49062, term49062.getClass(), "visible", false);
        setBooleanField(term49062, term49062.getClass(), "enabled", false);
        setBooleanField(term49062, term49062.getClass(), "valid", false);
        setField(term49062, term49062.getClass(), "dropTarget", null);
        setField(term49062, term49062.getClass(), "popups", null);
        setField(term49062, term49062.getClass(), "name", null);
        setBooleanField(term49062, term49062.getClass(), "nameExplicitlySet", false);
        setBooleanField(term49062, term49062.getClass(), "focusable", false);
        setIntField(term49062, term49062.getClass(), "isFocusTraversableOverridden", 0);
        setField(term49062, term49062.getClass(), "focusTraversalKeys", null);
        setBooleanField(term49062, term49062.getClass(), "focusTraversalKeysEnabled", false);
        setField(term49062, term49062.getClass(), "acc", null);
        setField(term49062, term49062.getClass(), "minSize", null);
        setBooleanField(term49062, term49062.getClass(), "minSizeSet", false);
        setField(term49062, term49062.getClass(), "prefSize", null);
        setBooleanField(term49062, term49062.getClass(), "prefSizeSet", false);
        setField(term49062, term49062.getClass(), "maxSize", null);
        setBooleanField(term49062, term49062.getClass(), "maxSizeSet", false);
        setField(term49062, term49062.getClass(), "componentOrientation", null);
        setBooleanField(term49062, term49062.getClass(), "newEventsOnly", false);
        setField(term49062, term49062.getClass(), "componentListener", null);
        setField(term49062, term49062.getClass(), "focusListener", null);
        setField(term49062, term49062.getClass(), "hierarchyListener", null);
        setField(term49062, term49062.getClass(), "hierarchyBoundsListener", null);
        setField(term49062, term49062.getClass(), "keyListener", null);
        setField(term49062, term49062.getClass(), "mouseListener", null);
        setField(term49062, term49062.getClass(), "mouseMotionListener", null);
        setField(term49062, term49062.getClass(), "mouseWheelListener", null);
        setField(term49062, term49062.getClass(), "inputMethodListener", null);
        setLongField(term49062, term49062.getClass(), "eventMask", 0L);
        setField(term49062, term49062.getClass(), "changeSupport", null);
        setField(term49062, term49062.getClass(), "objectLock", null);
        setBooleanField(term49062, term49062.getClass(), "isPacked", false);
        setIntField(term49062, term49062.getClass(), "boundsOp", 0);
        setField(term49062, term49062.getClass(), "compoundShape", null);
        setField(term49062, term49062.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term49062, term49062.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term49062, term49062.getClass(), "backgroundEraseDisabled", false);
        setField(term49062, term49062.getClass(), "eventCache", null);
        setBooleanField(term49062, term49062.getClass(), "coalescingEnabled", false);
        setBooleanField(term49062, term49062.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term49062, term49062.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateState", argTypes, term49062, args);
    }

};


