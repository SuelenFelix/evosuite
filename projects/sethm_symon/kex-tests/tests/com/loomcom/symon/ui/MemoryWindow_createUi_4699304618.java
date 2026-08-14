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

public class MemoryWindow_createUi_4699304618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43835;

    public MemoryWindow_createUi_4699304618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43835 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow"));
        setField(term43835, term43835.getClass(), "memoryTableModel", null);
        setField(term43835, term43835.getClass(), "memoryTable", null);
        setField(term43835, term43835.getClass(), "pageNumberTextField", null);
        setField(term43835, term43835.getClass(), "previousPageButton", null);
        setField(term43835, term43835.getClass(), "nextPageButton", null);
        setIntField(term43835, term43835.getClass(), "defaultCloseOperation", 0);
        setField(term43835, term43835.getClass(), "transferHandler", null);
        setField(term43835, term43835.getClass(), "rootPane", null);
        setBooleanField(term43835, term43835.getClass(), "rootPaneCheckingEnabled", false);
        setField(term43835, term43835.getClass(), "accessibleContext", null);
        setField(term43835, term43835.getClass(), "maximizedBounds", null);
        setField(term43835, term43835.getClass(), "title", null);
        setField(term43835, term43835.getClass(), "menuBar", null);
        setBooleanField(term43835, term43835.getClass(), "resizable", false);
        setBooleanField(term43835, term43835.getClass(), "undecorated", false);
        setBooleanField(term43835, term43835.getClass(), "mbManagement", false);
        setIntField(term43835, term43835.getClass(), "state", 0);
        setField(term43835, term43835.getClass(), "ownedWindows", null);
        setIntField(term43835, term43835.getClass(), "frameSerializedDataVersion", 0);
        setField(term43835, term43835.getClass(), "warningString", null);
        setField(term43835, term43835.getClass(), "icons", null);
        setField(term43835, term43835.getClass(), "temporaryLostComponent", null);
        setBooleanField(term43835, term43835.getClass(), "syncLWRequests", false);
        setBooleanField(term43835, term43835.getClass(), "beforeFirstShow", false);
        setBooleanField(term43835, term43835.getClass(), "disposing", false);
        setField(term43835, term43835.getClass(), "disposerRecord", null);
        setBooleanField(term43835, term43835.getClass(), "alwaysOnTop", false);
        setField(term43835, term43835.getClass(), "ownedWindowList", null);
        setField(term43835, term43835.getClass(), "weakThis", null);
        setBooleanField(term43835, term43835.getClass(), "showWithParent", false);
        setField(term43835, term43835.getClass(), "modalBlocker", null);
        setField(term43835, term43835.getClass(), "modalExclusionType", null);
        setField(term43835, term43835.getClass(), "windowListener", null);
        setField(term43835, term43835.getClass(), "windowStateListener", null);
        setField(term43835, term43835.getClass(), "windowFocusListener", null);
        setField(term43835, term43835.getClass(), "inputContext", null);
        setField(term43835, term43835.getClass(), "inputContextLock", null);
        setField(term43835, term43835.getClass(), "focusMgr", null);
        setBooleanField(term43835, term43835.getClass(), "focusableWindowState", false);
        setBooleanField(term43835, term43835.getClass(), "autoRequestFocus", false);
        setBooleanField(term43835, term43835.getClass(), "isInShow", false);
        setFloatField(term43835, term43835.getClass(), "opacity", 0.0F);
        setField(term43835, term43835.getClass(), "shape", null);
        setBooleanField(term43835, term43835.getClass(), "isTrayIconWindow", false);
        setIntField(term43835, term43835.getClass(), "securityWarningWidth", 0);
        setIntField(term43835, term43835.getClass(), "securityWarningHeight", 0);
        setDoubleField(term43835, term43835.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term43835, term43835.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term43835, term43835.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term43835, term43835.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term43835, term43835.getClass(), "anchor", null);
        setField(term43835, term43835.getClass(), "type", null);
        setIntField(term43835, term43835.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term43835, term43835.getClass(), "locationByPlatform", false);
        setField(term43835, term43835.getClass(), "component", null);
        setField(term43835, term43835.getClass(), "layoutMgr", null);
        setField(term43835, term43835.getClass(), "dispatcher", null);
        setField(term43835, term43835.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term43835, term43835.getClass(), "focusCycleRoot", false);
        setBooleanField(term43835, term43835.getClass(), "focusTraversalPolicyProvider", false);
        setField(term43835, term43835.getClass(), "printingThreads", null);
        setBooleanField(term43835, term43835.getClass(), "printing", false);
        setField(term43835, term43835.getClass(), "containerListener", null);
        setIntField(term43835, term43835.getClass(), "listeningChildren", 0);
        setIntField(term43835, term43835.getClass(), "listeningBoundsChildren", 0);
        setIntField(term43835, term43835.getClass(), "descendantsCount", 0);
        setField(term43835, term43835.getClass(), "preserveBackgroundColor", null);
        setIntField(term43835, term43835.getClass(), "numOfHWComponents", 0);
        setIntField(term43835, term43835.getClass(), "numOfLWComponents", 0);
        setField(term43835, term43835.getClass(), "modalComp", null);
        setField(term43835, term43835.getClass(), "modalAppContext", null);
        setIntField(term43835, term43835.getClass(), "containerSerializedDataVersion", 0);
        setField(term43835, term43835.getClass(), "peer", null);
        setField(term43835, term43835.getClass(), "parent", null);
        setField(term43835, term43835.getClass(), "appContext", null);
        setIntField(term43835, term43835.getClass(), "x", 0);
        setIntField(term43835, term43835.getClass(), "y", 0);
        setIntField(term43835, term43835.getClass(), "width", 0);
        setIntField(term43835, term43835.getClass(), "height", 0);
        setField(term43835, term43835.getClass(), "foreground", null);
        setField(term43835, term43835.getClass(), "background", null);
        setField(term43835, term43835.getClass(), "font", null);
        setField(term43835, term43835.getClass(), "peerFont", null);
        setField(term43835, term43835.getClass(), "cursor", null);
        setField(term43835, term43835.getClass(), "locale", null);
        setField(term43835, term43835.getClass(), "graphicsConfig", null);
        setField(term43835, term43835.getClass(), "bufferStrategy", null);
        setBooleanField(term43835, term43835.getClass(), "ignoreRepaint", false);
        setBooleanField(term43835, term43835.getClass(), "visible", false);
        setBooleanField(term43835, term43835.getClass(), "enabled", false);
        setBooleanField(term43835, term43835.getClass(), "valid", false);
        setField(term43835, term43835.getClass(), "dropTarget", null);
        setField(term43835, term43835.getClass(), "popups", null);
        setField(term43835, term43835.getClass(), "name", null);
        setBooleanField(term43835, term43835.getClass(), "nameExplicitlySet", false);
        setBooleanField(term43835, term43835.getClass(), "focusable", false);
        setIntField(term43835, term43835.getClass(), "isFocusTraversableOverridden", 0);
        setField(term43835, term43835.getClass(), "focusTraversalKeys", null);
        setBooleanField(term43835, term43835.getClass(), "focusTraversalKeysEnabled", false);
        setField(term43835, term43835.getClass(), "acc", null);
        setField(term43835, term43835.getClass(), "minSize", null);
        setBooleanField(term43835, term43835.getClass(), "minSizeSet", false);
        setField(term43835, term43835.getClass(), "prefSize", null);
        setBooleanField(term43835, term43835.getClass(), "prefSizeSet", false);
        setField(term43835, term43835.getClass(), "maxSize", null);
        setBooleanField(term43835, term43835.getClass(), "maxSizeSet", false);
        setField(term43835, term43835.getClass(), "componentOrientation", null);
        setBooleanField(term43835, term43835.getClass(), "newEventsOnly", false);
        setField(term43835, term43835.getClass(), "componentListener", null);
        setField(term43835, term43835.getClass(), "focusListener", null);
        setField(term43835, term43835.getClass(), "hierarchyListener", null);
        setField(term43835, term43835.getClass(), "hierarchyBoundsListener", null);
        setField(term43835, term43835.getClass(), "keyListener", null);
        setField(term43835, term43835.getClass(), "mouseListener", null);
        setField(term43835, term43835.getClass(), "mouseMotionListener", null);
        setField(term43835, term43835.getClass(), "mouseWheelListener", null);
        setField(term43835, term43835.getClass(), "inputMethodListener", null);
        setLongField(term43835, term43835.getClass(), "eventMask", 0L);
        setField(term43835, term43835.getClass(), "changeSupport", null);
        setField(term43835, term43835.getClass(), "objectLock", null);
        setBooleanField(term43835, term43835.getClass(), "isPacked", false);
        setIntField(term43835, term43835.getClass(), "boundsOp", 0);
        setField(term43835, term43835.getClass(), "compoundShape", null);
        setField(term43835, term43835.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term43835, term43835.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term43835, term43835.getClass(), "backgroundEraseDisabled", false);
        setField(term43835, term43835.getClass(), "eventCache", null);
        setBooleanField(term43835, term43835.getClass(), "coalescingEnabled", false);
        setBooleanField(term43835, term43835.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term43835, term43835.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createUi", argTypes, term43835, args);
    }

};


