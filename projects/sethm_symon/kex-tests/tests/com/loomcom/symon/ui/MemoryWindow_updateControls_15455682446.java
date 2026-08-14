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

public class MemoryWindow_updateControls_15455682446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41274;

    public MemoryWindow_updateControls_15455682446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41274 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow"));
        setField(term41274, term41274.getClass(), "memoryTableModel", null);
        setField(term41274, term41274.getClass(), "memoryTable", null);
        setField(term41274, term41274.getClass(), "pageNumberTextField", null);
        setField(term41274, term41274.getClass(), "previousPageButton", null);
        setField(term41274, term41274.getClass(), "nextPageButton", null);
        setIntField(term41274, term41274.getClass(), "defaultCloseOperation", 0);
        setField(term41274, term41274.getClass(), "transferHandler", null);
        setField(term41274, term41274.getClass(), "rootPane", null);
        setBooleanField(term41274, term41274.getClass(), "rootPaneCheckingEnabled", false);
        setField(term41274, term41274.getClass(), "accessibleContext", null);
        setField(term41274, term41274.getClass(), "maximizedBounds", null);
        setField(term41274, term41274.getClass(), "title", null);
        setField(term41274, term41274.getClass(), "menuBar", null);
        setBooleanField(term41274, term41274.getClass(), "resizable", false);
        setBooleanField(term41274, term41274.getClass(), "undecorated", false);
        setBooleanField(term41274, term41274.getClass(), "mbManagement", false);
        setIntField(term41274, term41274.getClass(), "state", 0);
        setField(term41274, term41274.getClass(), "ownedWindows", null);
        setIntField(term41274, term41274.getClass(), "frameSerializedDataVersion", 0);
        setField(term41274, term41274.getClass(), "warningString", null);
        setField(term41274, term41274.getClass(), "icons", null);
        setField(term41274, term41274.getClass(), "temporaryLostComponent", null);
        setBooleanField(term41274, term41274.getClass(), "syncLWRequests", false);
        setBooleanField(term41274, term41274.getClass(), "beforeFirstShow", false);
        setBooleanField(term41274, term41274.getClass(), "disposing", false);
        setField(term41274, term41274.getClass(), "disposerRecord", null);
        setBooleanField(term41274, term41274.getClass(), "alwaysOnTop", false);
        setField(term41274, term41274.getClass(), "ownedWindowList", null);
        setField(term41274, term41274.getClass(), "weakThis", null);
        setBooleanField(term41274, term41274.getClass(), "showWithParent", false);
        setField(term41274, term41274.getClass(), "modalBlocker", null);
        setField(term41274, term41274.getClass(), "modalExclusionType", null);
        setField(term41274, term41274.getClass(), "windowListener", null);
        setField(term41274, term41274.getClass(), "windowStateListener", null);
        setField(term41274, term41274.getClass(), "windowFocusListener", null);
        setField(term41274, term41274.getClass(), "inputContext", null);
        setField(term41274, term41274.getClass(), "inputContextLock", null);
        setField(term41274, term41274.getClass(), "focusMgr", null);
        setBooleanField(term41274, term41274.getClass(), "focusableWindowState", false);
        setBooleanField(term41274, term41274.getClass(), "autoRequestFocus", false);
        setBooleanField(term41274, term41274.getClass(), "isInShow", false);
        setFloatField(term41274, term41274.getClass(), "opacity", 0.0F);
        setField(term41274, term41274.getClass(), "shape", null);
        setBooleanField(term41274, term41274.getClass(), "isTrayIconWindow", false);
        setIntField(term41274, term41274.getClass(), "securityWarningWidth", 0);
        setIntField(term41274, term41274.getClass(), "securityWarningHeight", 0);
        setDoubleField(term41274, term41274.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term41274, term41274.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term41274, term41274.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term41274, term41274.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term41274, term41274.getClass(), "anchor", null);
        setField(term41274, term41274.getClass(), "type", null);
        setIntField(term41274, term41274.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term41274, term41274.getClass(), "locationByPlatform", false);
        setField(term41274, term41274.getClass(), "component", null);
        setField(term41274, term41274.getClass(), "layoutMgr", null);
        setField(term41274, term41274.getClass(), "dispatcher", null);
        setField(term41274, term41274.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41274, term41274.getClass(), "focusCycleRoot", false);
        setBooleanField(term41274, term41274.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41274, term41274.getClass(), "printingThreads", null);
        setBooleanField(term41274, term41274.getClass(), "printing", false);
        setField(term41274, term41274.getClass(), "containerListener", null);
        setIntField(term41274, term41274.getClass(), "listeningChildren", 0);
        setIntField(term41274, term41274.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41274, term41274.getClass(), "descendantsCount", 0);
        setField(term41274, term41274.getClass(), "preserveBackgroundColor", null);
        setIntField(term41274, term41274.getClass(), "numOfHWComponents", 0);
        setIntField(term41274, term41274.getClass(), "numOfLWComponents", 0);
        setField(term41274, term41274.getClass(), "modalComp", null);
        setField(term41274, term41274.getClass(), "modalAppContext", null);
        setIntField(term41274, term41274.getClass(), "containerSerializedDataVersion", 0);
        setField(term41274, term41274.getClass(), "peer", null);
        setField(term41274, term41274.getClass(), "parent", null);
        setField(term41274, term41274.getClass(), "appContext", null);
        setIntField(term41274, term41274.getClass(), "x", 0);
        setIntField(term41274, term41274.getClass(), "y", 0);
        setIntField(term41274, term41274.getClass(), "width", 0);
        setIntField(term41274, term41274.getClass(), "height", 0);
        setField(term41274, term41274.getClass(), "foreground", null);
        setField(term41274, term41274.getClass(), "background", null);
        setField(term41274, term41274.getClass(), "font", null);
        setField(term41274, term41274.getClass(), "peerFont", null);
        setField(term41274, term41274.getClass(), "cursor", null);
        setField(term41274, term41274.getClass(), "locale", null);
        setField(term41274, term41274.getClass(), "graphicsConfig", null);
        setField(term41274, term41274.getClass(), "bufferStrategy", null);
        setBooleanField(term41274, term41274.getClass(), "ignoreRepaint", false);
        setBooleanField(term41274, term41274.getClass(), "visible", false);
        setBooleanField(term41274, term41274.getClass(), "enabled", false);
        setBooleanField(term41274, term41274.getClass(), "valid", false);
        setField(term41274, term41274.getClass(), "dropTarget", null);
        setField(term41274, term41274.getClass(), "popups", null);
        setField(term41274, term41274.getClass(), "name", null);
        setBooleanField(term41274, term41274.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41274, term41274.getClass(), "focusable", false);
        setIntField(term41274, term41274.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41274, term41274.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41274, term41274.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41274, term41274.getClass(), "acc", null);
        setField(term41274, term41274.getClass(), "minSize", null);
        setBooleanField(term41274, term41274.getClass(), "minSizeSet", false);
        setField(term41274, term41274.getClass(), "prefSize", null);
        setBooleanField(term41274, term41274.getClass(), "prefSizeSet", false);
        setField(term41274, term41274.getClass(), "maxSize", null);
        setBooleanField(term41274, term41274.getClass(), "maxSizeSet", false);
        setField(term41274, term41274.getClass(), "componentOrientation", null);
        setBooleanField(term41274, term41274.getClass(), "newEventsOnly", false);
        setField(term41274, term41274.getClass(), "componentListener", null);
        setField(term41274, term41274.getClass(), "focusListener", null);
        setField(term41274, term41274.getClass(), "hierarchyListener", null);
        setField(term41274, term41274.getClass(), "hierarchyBoundsListener", null);
        setField(term41274, term41274.getClass(), "keyListener", null);
        setField(term41274, term41274.getClass(), "mouseListener", null);
        setField(term41274, term41274.getClass(), "mouseMotionListener", null);
        setField(term41274, term41274.getClass(), "mouseWheelListener", null);
        setField(term41274, term41274.getClass(), "inputMethodListener", null);
        setLongField(term41274, term41274.getClass(), "eventMask", 0L);
        setField(term41274, term41274.getClass(), "changeSupport", null);
        setField(term41274, term41274.getClass(), "objectLock", null);
        setBooleanField(term41274, term41274.getClass(), "isPacked", false);
        setIntField(term41274, term41274.getClass(), "boundsOp", 0);
        setField(term41274, term41274.getClass(), "compoundShape", null);
        setField(term41274, term41274.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41274, term41274.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41274, term41274.getClass(), "backgroundEraseDisabled", false);
        setField(term41274, term41274.getClass(), "eventCache", null);
        setBooleanField(term41274, term41274.getClass(), "coalescingEnabled", false);
        setBooleanField(term41274, term41274.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41274, term41274.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateControls", argTypes, term41274, args);
    }

};


