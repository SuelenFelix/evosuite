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

public class MemoryWindow_actionPerformed_213507421610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46485;

    public MemoryWindow_actionPerformed_213507421610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46485 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow"));
        setField(term46485, term46485.getClass(), "memoryTableModel", null);
        setField(term46485, term46485.getClass(), "memoryTable", null);
        setField(term46485, term46485.getClass(), "pageNumberTextField", null);
        setField(term46485, term46485.getClass(), "previousPageButton", null);
        setField(term46485, term46485.getClass(), "nextPageButton", null);
        setIntField(term46485, term46485.getClass(), "defaultCloseOperation", 0);
        setField(term46485, term46485.getClass(), "transferHandler", null);
        setField(term46485, term46485.getClass(), "rootPane", null);
        setBooleanField(term46485, term46485.getClass(), "rootPaneCheckingEnabled", false);
        setField(term46485, term46485.getClass(), "accessibleContext", null);
        setField(term46485, term46485.getClass(), "maximizedBounds", null);
        setField(term46485, term46485.getClass(), "title", null);
        setField(term46485, term46485.getClass(), "menuBar", null);
        setBooleanField(term46485, term46485.getClass(), "resizable", false);
        setBooleanField(term46485, term46485.getClass(), "undecorated", false);
        setBooleanField(term46485, term46485.getClass(), "mbManagement", false);
        setIntField(term46485, term46485.getClass(), "state", 0);
        setField(term46485, term46485.getClass(), "ownedWindows", null);
        setIntField(term46485, term46485.getClass(), "frameSerializedDataVersion", 0);
        setField(term46485, term46485.getClass(), "warningString", null);
        setField(term46485, term46485.getClass(), "icons", null);
        setField(term46485, term46485.getClass(), "temporaryLostComponent", null);
        setBooleanField(term46485, term46485.getClass(), "syncLWRequests", false);
        setBooleanField(term46485, term46485.getClass(), "beforeFirstShow", false);
        setBooleanField(term46485, term46485.getClass(), "disposing", false);
        setField(term46485, term46485.getClass(), "disposerRecord", null);
        setBooleanField(term46485, term46485.getClass(), "alwaysOnTop", false);
        setField(term46485, term46485.getClass(), "ownedWindowList", null);
        setField(term46485, term46485.getClass(), "weakThis", null);
        setBooleanField(term46485, term46485.getClass(), "showWithParent", false);
        setField(term46485, term46485.getClass(), "modalBlocker", null);
        setField(term46485, term46485.getClass(), "modalExclusionType", null);
        setField(term46485, term46485.getClass(), "windowListener", null);
        setField(term46485, term46485.getClass(), "windowStateListener", null);
        setField(term46485, term46485.getClass(), "windowFocusListener", null);
        setField(term46485, term46485.getClass(), "inputContext", null);
        setField(term46485, term46485.getClass(), "inputContextLock", null);
        setField(term46485, term46485.getClass(), "focusMgr", null);
        setBooleanField(term46485, term46485.getClass(), "focusableWindowState", false);
        setBooleanField(term46485, term46485.getClass(), "autoRequestFocus", false);
        setBooleanField(term46485, term46485.getClass(), "isInShow", false);
        setFloatField(term46485, term46485.getClass(), "opacity", 0.0F);
        setField(term46485, term46485.getClass(), "shape", null);
        setBooleanField(term46485, term46485.getClass(), "isTrayIconWindow", false);
        setIntField(term46485, term46485.getClass(), "securityWarningWidth", 0);
        setIntField(term46485, term46485.getClass(), "securityWarningHeight", 0);
        setDoubleField(term46485, term46485.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term46485, term46485.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term46485, term46485.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term46485, term46485.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term46485, term46485.getClass(), "anchor", null);
        setField(term46485, term46485.getClass(), "type", null);
        setIntField(term46485, term46485.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term46485, term46485.getClass(), "locationByPlatform", false);
        setField(term46485, term46485.getClass(), "component", null);
        setField(term46485, term46485.getClass(), "layoutMgr", null);
        setField(term46485, term46485.getClass(), "dispatcher", null);
        setField(term46485, term46485.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term46485, term46485.getClass(), "focusCycleRoot", false);
        setBooleanField(term46485, term46485.getClass(), "focusTraversalPolicyProvider", false);
        setField(term46485, term46485.getClass(), "printingThreads", null);
        setBooleanField(term46485, term46485.getClass(), "printing", false);
        setField(term46485, term46485.getClass(), "containerListener", null);
        setIntField(term46485, term46485.getClass(), "listeningChildren", 0);
        setIntField(term46485, term46485.getClass(), "listeningBoundsChildren", 0);
        setIntField(term46485, term46485.getClass(), "descendantsCount", 0);
        setField(term46485, term46485.getClass(), "preserveBackgroundColor", null);
        setIntField(term46485, term46485.getClass(), "numOfHWComponents", 0);
        setIntField(term46485, term46485.getClass(), "numOfLWComponents", 0);
        setField(term46485, term46485.getClass(), "modalComp", null);
        setField(term46485, term46485.getClass(), "modalAppContext", null);
        setIntField(term46485, term46485.getClass(), "containerSerializedDataVersion", 0);
        setField(term46485, term46485.getClass(), "peer", null);
        setField(term46485, term46485.getClass(), "parent", null);
        setField(term46485, term46485.getClass(), "appContext", null);
        setIntField(term46485, term46485.getClass(), "x", 0);
        setIntField(term46485, term46485.getClass(), "y", 0);
        setIntField(term46485, term46485.getClass(), "width", 0);
        setIntField(term46485, term46485.getClass(), "height", 0);
        setField(term46485, term46485.getClass(), "foreground", null);
        setField(term46485, term46485.getClass(), "background", null);
        setField(term46485, term46485.getClass(), "font", null);
        setField(term46485, term46485.getClass(), "peerFont", null);
        setField(term46485, term46485.getClass(), "cursor", null);
        setField(term46485, term46485.getClass(), "locale", null);
        setField(term46485, term46485.getClass(), "graphicsConfig", null);
        setField(term46485, term46485.getClass(), "bufferStrategy", null);
        setBooleanField(term46485, term46485.getClass(), "ignoreRepaint", false);
        setBooleanField(term46485, term46485.getClass(), "visible", false);
        setBooleanField(term46485, term46485.getClass(), "enabled", false);
        setBooleanField(term46485, term46485.getClass(), "valid", false);
        setField(term46485, term46485.getClass(), "dropTarget", null);
        setField(term46485, term46485.getClass(), "popups", null);
        setField(term46485, term46485.getClass(), "name", null);
        setBooleanField(term46485, term46485.getClass(), "nameExplicitlySet", false);
        setBooleanField(term46485, term46485.getClass(), "focusable", false);
        setIntField(term46485, term46485.getClass(), "isFocusTraversableOverridden", 0);
        setField(term46485, term46485.getClass(), "focusTraversalKeys", null);
        setBooleanField(term46485, term46485.getClass(), "focusTraversalKeysEnabled", false);
        setField(term46485, term46485.getClass(), "acc", null);
        setField(term46485, term46485.getClass(), "minSize", null);
        setBooleanField(term46485, term46485.getClass(), "minSizeSet", false);
        setField(term46485, term46485.getClass(), "prefSize", null);
        setBooleanField(term46485, term46485.getClass(), "prefSizeSet", false);
        setField(term46485, term46485.getClass(), "maxSize", null);
        setBooleanField(term46485, term46485.getClass(), "maxSizeSet", false);
        setField(term46485, term46485.getClass(), "componentOrientation", null);
        setBooleanField(term46485, term46485.getClass(), "newEventsOnly", false);
        setField(term46485, term46485.getClass(), "componentListener", null);
        setField(term46485, term46485.getClass(), "focusListener", null);
        setField(term46485, term46485.getClass(), "hierarchyListener", null);
        setField(term46485, term46485.getClass(), "hierarchyBoundsListener", null);
        setField(term46485, term46485.getClass(), "keyListener", null);
        setField(term46485, term46485.getClass(), "mouseListener", null);
        setField(term46485, term46485.getClass(), "mouseMotionListener", null);
        setField(term46485, term46485.getClass(), "mouseWheelListener", null);
        setField(term46485, term46485.getClass(), "inputMethodListener", null);
        setLongField(term46485, term46485.getClass(), "eventMask", 0L);
        setField(term46485, term46485.getClass(), "changeSupport", null);
        setField(term46485, term46485.getClass(), "objectLock", null);
        setBooleanField(term46485, term46485.getClass(), "isPacked", false);
        setIntField(term46485, term46485.getClass(), "boundsOp", 0);
        setField(term46485, term46485.getClass(), "compoundShape", null);
        setField(term46485, term46485.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term46485, term46485.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term46485, term46485.getClass(), "backgroundEraseDisabled", false);
        setField(term46485, term46485.getClass(), "eventCache", null);
        setBooleanField(term46485, term46485.getClass(), "coalescingEnabled", false);
        setBooleanField(term46485, term46485.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term46485, term46485.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "actionPerformed", argTypes, term46485, args);
    }

};


