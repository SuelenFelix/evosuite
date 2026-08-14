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
import java.lang.Integer;

public class MemoryWindow_setPageNumber_20473991912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36147;
     Object term36207;

    public MemoryWindow_setPageNumber_20473991912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36147 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow"));
        setField(term36147, term36147.getClass(), "memoryTableModel", null);
        setField(term36147, term36147.getClass(), "memoryTable", null);
        setField(term36147, term36147.getClass(), "pageNumberTextField", null);
        setField(term36147, term36147.getClass(), "previousPageButton", null);
        setField(term36147, term36147.getClass(), "nextPageButton", null);
        setIntField(term36147, term36147.getClass(), "defaultCloseOperation", 0);
        setField(term36147, term36147.getClass(), "transferHandler", null);
        setField(term36147, term36147.getClass(), "rootPane", null);
        setBooleanField(term36147, term36147.getClass(), "rootPaneCheckingEnabled", false);
        setField(term36147, term36147.getClass(), "accessibleContext", null);
        setField(term36147, term36147.getClass(), "maximizedBounds", null);
        setField(term36147, term36147.getClass(), "title", null);
        setField(term36147, term36147.getClass(), "menuBar", null);
        setBooleanField(term36147, term36147.getClass(), "resizable", false);
        setBooleanField(term36147, term36147.getClass(), "undecorated", false);
        setBooleanField(term36147, term36147.getClass(), "mbManagement", false);
        setIntField(term36147, term36147.getClass(), "state", 0);
        setField(term36147, term36147.getClass(), "ownedWindows", null);
        setIntField(term36147, term36147.getClass(), "frameSerializedDataVersion", 0);
        setField(term36147, term36147.getClass(), "warningString", null);
        setField(term36147, term36147.getClass(), "icons", null);
        setField(term36147, term36147.getClass(), "temporaryLostComponent", null);
        setBooleanField(term36147, term36147.getClass(), "syncLWRequests", false);
        setBooleanField(term36147, term36147.getClass(), "beforeFirstShow", false);
        setBooleanField(term36147, term36147.getClass(), "disposing", false);
        setField(term36147, term36147.getClass(), "disposerRecord", null);
        setBooleanField(term36147, term36147.getClass(), "alwaysOnTop", false);
        setField(term36147, term36147.getClass(), "ownedWindowList", null);
        setField(term36147, term36147.getClass(), "weakThis", null);
        setBooleanField(term36147, term36147.getClass(), "showWithParent", false);
        setField(term36147, term36147.getClass(), "modalBlocker", null);
        setField(term36147, term36147.getClass(), "modalExclusionType", null);
        setField(term36147, term36147.getClass(), "windowListener", null);
        setField(term36147, term36147.getClass(), "windowStateListener", null);
        setField(term36147, term36147.getClass(), "windowFocusListener", null);
        setField(term36147, term36147.getClass(), "inputContext", null);
        setField(term36147, term36147.getClass(), "inputContextLock", null);
        setField(term36147, term36147.getClass(), "focusMgr", null);
        setBooleanField(term36147, term36147.getClass(), "focusableWindowState", false);
        setBooleanField(term36147, term36147.getClass(), "autoRequestFocus", false);
        setBooleanField(term36147, term36147.getClass(), "isInShow", false);
        setFloatField(term36147, term36147.getClass(), "opacity", 0.0F);
        setField(term36147, term36147.getClass(), "shape", null);
        setBooleanField(term36147, term36147.getClass(), "isTrayIconWindow", false);
        setIntField(term36147, term36147.getClass(), "securityWarningWidth", 0);
        setIntField(term36147, term36147.getClass(), "securityWarningHeight", 0);
        setDoubleField(term36147, term36147.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term36147, term36147.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term36147, term36147.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term36147, term36147.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term36147, term36147.getClass(), "anchor", null);
        setField(term36147, term36147.getClass(), "type", null);
        setIntField(term36147, term36147.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term36147, term36147.getClass(), "locationByPlatform", false);
        setField(term36147, term36147.getClass(), "component", null);
        setField(term36147, term36147.getClass(), "layoutMgr", null);
        setField(term36147, term36147.getClass(), "dispatcher", null);
        setField(term36147, term36147.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term36147, term36147.getClass(), "focusCycleRoot", false);
        setBooleanField(term36147, term36147.getClass(), "focusTraversalPolicyProvider", false);
        setField(term36147, term36147.getClass(), "printingThreads", null);
        setBooleanField(term36147, term36147.getClass(), "printing", false);
        setField(term36147, term36147.getClass(), "containerListener", null);
        setIntField(term36147, term36147.getClass(), "listeningChildren", 0);
        setIntField(term36147, term36147.getClass(), "listeningBoundsChildren", 0);
        setIntField(term36147, term36147.getClass(), "descendantsCount", 0);
        setField(term36147, term36147.getClass(), "preserveBackgroundColor", null);
        setIntField(term36147, term36147.getClass(), "numOfHWComponents", 0);
        setIntField(term36147, term36147.getClass(), "numOfLWComponents", 0);
        setField(term36147, term36147.getClass(), "modalComp", null);
        setField(term36147, term36147.getClass(), "modalAppContext", null);
        setIntField(term36147, term36147.getClass(), "containerSerializedDataVersion", 0);
        setField(term36147, term36147.getClass(), "peer", null);
        setField(term36147, term36147.getClass(), "parent", null);
        setField(term36147, term36147.getClass(), "appContext", null);
        setIntField(term36147, term36147.getClass(), "x", 0);
        setIntField(term36147, term36147.getClass(), "y", 0);
        setIntField(term36147, term36147.getClass(), "width", 0);
        setIntField(term36147, term36147.getClass(), "height", 0);
        setField(term36147, term36147.getClass(), "foreground", null);
        setField(term36147, term36147.getClass(), "background", null);
        setField(term36147, term36147.getClass(), "font", null);
        setField(term36147, term36147.getClass(), "peerFont", null);
        setField(term36147, term36147.getClass(), "cursor", null);
        setField(term36147, term36147.getClass(), "locale", null);
        setField(term36147, term36147.getClass(), "graphicsConfig", null);
        setField(term36147, term36147.getClass(), "bufferStrategy", null);
        setBooleanField(term36147, term36147.getClass(), "ignoreRepaint", false);
        setBooleanField(term36147, term36147.getClass(), "visible", false);
        setBooleanField(term36147, term36147.getClass(), "enabled", false);
        setBooleanField(term36147, term36147.getClass(), "valid", false);
        setField(term36147, term36147.getClass(), "dropTarget", null);
        setField(term36147, term36147.getClass(), "popups", null);
        setField(term36147, term36147.getClass(), "name", null);
        setBooleanField(term36147, term36147.getClass(), "nameExplicitlySet", false);
        setBooleanField(term36147, term36147.getClass(), "focusable", false);
        setIntField(term36147, term36147.getClass(), "isFocusTraversableOverridden", 0);
        setField(term36147, term36147.getClass(), "focusTraversalKeys", null);
        setBooleanField(term36147, term36147.getClass(), "focusTraversalKeysEnabled", false);
        setField(term36147, term36147.getClass(), "acc", null);
        setField(term36147, term36147.getClass(), "minSize", null);
        setBooleanField(term36147, term36147.getClass(), "minSizeSet", false);
        setField(term36147, term36147.getClass(), "prefSize", null);
        setBooleanField(term36147, term36147.getClass(), "prefSizeSet", false);
        setField(term36147, term36147.getClass(), "maxSize", null);
        setBooleanField(term36147, term36147.getClass(), "maxSizeSet", false);
        setField(term36147, term36147.getClass(), "componentOrientation", null);
        setBooleanField(term36147, term36147.getClass(), "newEventsOnly", false);
        setField(term36147, term36147.getClass(), "componentListener", null);
        setField(term36147, term36147.getClass(), "focusListener", null);
        setField(term36147, term36147.getClass(), "hierarchyListener", null);
        setField(term36147, term36147.getClass(), "hierarchyBoundsListener", null);
        setField(term36147, term36147.getClass(), "keyListener", null);
        setField(term36147, term36147.getClass(), "mouseListener", null);
        setField(term36147, term36147.getClass(), "mouseMotionListener", null);
        setField(term36147, term36147.getClass(), "mouseWheelListener", null);
        setField(term36147, term36147.getClass(), "inputMethodListener", null);
        setLongField(term36147, term36147.getClass(), "eventMask", 0L);
        setField(term36147, term36147.getClass(), "changeSupport", null);
        setField(term36147, term36147.getClass(), "objectLock", null);
        setBooleanField(term36147, term36147.getClass(), "isPacked", false);
        setIntField(term36147, term36147.getClass(), "boundsOp", 0);
        setField(term36147, term36147.getClass(), "compoundShape", null);
        setField(term36147, term36147.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term36147, term36147.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term36147, term36147.getClass(), "backgroundEraseDisabled", false);
        setField(term36147, term36147.getClass(), "eventCache", null);
        setBooleanField(term36147, term36147.getClass(), "coalescingEnabled", false);
        setBooleanField(term36147, term36147.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term36147, term36147.getClass(), "componentSerializedDataVersion", 0);
        term36207 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term36207;
        callMethod(klass, "setPageNumber", argTypes, term36147, args);
    }

};


