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

public class MemoryWindow_getPageNumber_13331883274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38702;

    public MemoryWindow_getPageNumber_13331883274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38702 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow"));
        setField(term38702, term38702.getClass(), "memoryTableModel", null);
        setField(term38702, term38702.getClass(), "memoryTable", null);
        setField(term38702, term38702.getClass(), "pageNumberTextField", null);
        setField(term38702, term38702.getClass(), "previousPageButton", null);
        setField(term38702, term38702.getClass(), "nextPageButton", null);
        setIntField(term38702, term38702.getClass(), "defaultCloseOperation", 0);
        setField(term38702, term38702.getClass(), "transferHandler", null);
        setField(term38702, term38702.getClass(), "rootPane", null);
        setBooleanField(term38702, term38702.getClass(), "rootPaneCheckingEnabled", false);
        setField(term38702, term38702.getClass(), "accessibleContext", null);
        setField(term38702, term38702.getClass(), "maximizedBounds", null);
        setField(term38702, term38702.getClass(), "title", null);
        setField(term38702, term38702.getClass(), "menuBar", null);
        setBooleanField(term38702, term38702.getClass(), "resizable", false);
        setBooleanField(term38702, term38702.getClass(), "undecorated", false);
        setBooleanField(term38702, term38702.getClass(), "mbManagement", false);
        setIntField(term38702, term38702.getClass(), "state", 0);
        setField(term38702, term38702.getClass(), "ownedWindows", null);
        setIntField(term38702, term38702.getClass(), "frameSerializedDataVersion", 0);
        setField(term38702, term38702.getClass(), "warningString", null);
        setField(term38702, term38702.getClass(), "icons", null);
        setField(term38702, term38702.getClass(), "temporaryLostComponent", null);
        setBooleanField(term38702, term38702.getClass(), "syncLWRequests", false);
        setBooleanField(term38702, term38702.getClass(), "beforeFirstShow", false);
        setBooleanField(term38702, term38702.getClass(), "disposing", false);
        setField(term38702, term38702.getClass(), "disposerRecord", null);
        setBooleanField(term38702, term38702.getClass(), "alwaysOnTop", false);
        setField(term38702, term38702.getClass(), "ownedWindowList", null);
        setField(term38702, term38702.getClass(), "weakThis", null);
        setBooleanField(term38702, term38702.getClass(), "showWithParent", false);
        setField(term38702, term38702.getClass(), "modalBlocker", null);
        setField(term38702, term38702.getClass(), "modalExclusionType", null);
        setField(term38702, term38702.getClass(), "windowListener", null);
        setField(term38702, term38702.getClass(), "windowStateListener", null);
        setField(term38702, term38702.getClass(), "windowFocusListener", null);
        setField(term38702, term38702.getClass(), "inputContext", null);
        setField(term38702, term38702.getClass(), "inputContextLock", null);
        setField(term38702, term38702.getClass(), "focusMgr", null);
        setBooleanField(term38702, term38702.getClass(), "focusableWindowState", false);
        setBooleanField(term38702, term38702.getClass(), "autoRequestFocus", false);
        setBooleanField(term38702, term38702.getClass(), "isInShow", false);
        setFloatField(term38702, term38702.getClass(), "opacity", 0.0F);
        setField(term38702, term38702.getClass(), "shape", null);
        setBooleanField(term38702, term38702.getClass(), "isTrayIconWindow", false);
        setIntField(term38702, term38702.getClass(), "securityWarningWidth", 0);
        setIntField(term38702, term38702.getClass(), "securityWarningHeight", 0);
        setDoubleField(term38702, term38702.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term38702, term38702.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term38702, term38702.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term38702, term38702.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term38702, term38702.getClass(), "anchor", null);
        setField(term38702, term38702.getClass(), "type", null);
        setIntField(term38702, term38702.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term38702, term38702.getClass(), "locationByPlatform", false);
        setField(term38702, term38702.getClass(), "component", null);
        setField(term38702, term38702.getClass(), "layoutMgr", null);
        setField(term38702, term38702.getClass(), "dispatcher", null);
        setField(term38702, term38702.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term38702, term38702.getClass(), "focusCycleRoot", false);
        setBooleanField(term38702, term38702.getClass(), "focusTraversalPolicyProvider", false);
        setField(term38702, term38702.getClass(), "printingThreads", null);
        setBooleanField(term38702, term38702.getClass(), "printing", false);
        setField(term38702, term38702.getClass(), "containerListener", null);
        setIntField(term38702, term38702.getClass(), "listeningChildren", 0);
        setIntField(term38702, term38702.getClass(), "listeningBoundsChildren", 0);
        setIntField(term38702, term38702.getClass(), "descendantsCount", 0);
        setField(term38702, term38702.getClass(), "preserveBackgroundColor", null);
        setIntField(term38702, term38702.getClass(), "numOfHWComponents", 0);
        setIntField(term38702, term38702.getClass(), "numOfLWComponents", 0);
        setField(term38702, term38702.getClass(), "modalComp", null);
        setField(term38702, term38702.getClass(), "modalAppContext", null);
        setIntField(term38702, term38702.getClass(), "containerSerializedDataVersion", 0);
        setField(term38702, term38702.getClass(), "peer", null);
        setField(term38702, term38702.getClass(), "parent", null);
        setField(term38702, term38702.getClass(), "appContext", null);
        setIntField(term38702, term38702.getClass(), "x", 0);
        setIntField(term38702, term38702.getClass(), "y", 0);
        setIntField(term38702, term38702.getClass(), "width", 0);
        setIntField(term38702, term38702.getClass(), "height", 0);
        setField(term38702, term38702.getClass(), "foreground", null);
        setField(term38702, term38702.getClass(), "background", null);
        setField(term38702, term38702.getClass(), "font", null);
        setField(term38702, term38702.getClass(), "peerFont", null);
        setField(term38702, term38702.getClass(), "cursor", null);
        setField(term38702, term38702.getClass(), "locale", null);
        setField(term38702, term38702.getClass(), "graphicsConfig", null);
        setField(term38702, term38702.getClass(), "bufferStrategy", null);
        setBooleanField(term38702, term38702.getClass(), "ignoreRepaint", false);
        setBooleanField(term38702, term38702.getClass(), "visible", false);
        setBooleanField(term38702, term38702.getClass(), "enabled", false);
        setBooleanField(term38702, term38702.getClass(), "valid", false);
        setField(term38702, term38702.getClass(), "dropTarget", null);
        setField(term38702, term38702.getClass(), "popups", null);
        setField(term38702, term38702.getClass(), "name", null);
        setBooleanField(term38702, term38702.getClass(), "nameExplicitlySet", false);
        setBooleanField(term38702, term38702.getClass(), "focusable", false);
        setIntField(term38702, term38702.getClass(), "isFocusTraversableOverridden", 0);
        setField(term38702, term38702.getClass(), "focusTraversalKeys", null);
        setBooleanField(term38702, term38702.getClass(), "focusTraversalKeysEnabled", false);
        setField(term38702, term38702.getClass(), "acc", null);
        setField(term38702, term38702.getClass(), "minSize", null);
        setBooleanField(term38702, term38702.getClass(), "minSizeSet", false);
        setField(term38702, term38702.getClass(), "prefSize", null);
        setBooleanField(term38702, term38702.getClass(), "prefSizeSet", false);
        setField(term38702, term38702.getClass(), "maxSize", null);
        setBooleanField(term38702, term38702.getClass(), "maxSizeSet", false);
        setField(term38702, term38702.getClass(), "componentOrientation", null);
        setBooleanField(term38702, term38702.getClass(), "newEventsOnly", false);
        setField(term38702, term38702.getClass(), "componentListener", null);
        setField(term38702, term38702.getClass(), "focusListener", null);
        setField(term38702, term38702.getClass(), "hierarchyListener", null);
        setField(term38702, term38702.getClass(), "hierarchyBoundsListener", null);
        setField(term38702, term38702.getClass(), "keyListener", null);
        setField(term38702, term38702.getClass(), "mouseListener", null);
        setField(term38702, term38702.getClass(), "mouseMotionListener", null);
        setField(term38702, term38702.getClass(), "mouseWheelListener", null);
        setField(term38702, term38702.getClass(), "inputMethodListener", null);
        setLongField(term38702, term38702.getClass(), "eventMask", 0L);
        setField(term38702, term38702.getClass(), "changeSupport", null);
        setField(term38702, term38702.getClass(), "objectLock", null);
        setBooleanField(term38702, term38702.getClass(), "isPacked", false);
        setIntField(term38702, term38702.getClass(), "boundsOp", 0);
        setField(term38702, term38702.getClass(), "compoundShape", null);
        setField(term38702, term38702.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term38702, term38702.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term38702, term38702.getClass(), "backgroundEraseDisabled", false);
        setField(term38702, term38702.getClass(), "eventCache", null);
        setBooleanField(term38702, term38702.getClass(), "coalescingEnabled", false);
        setBooleanField(term38702, term38702.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term38702, term38702.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageNumber", argTypes, term38702, args);
    }

};


