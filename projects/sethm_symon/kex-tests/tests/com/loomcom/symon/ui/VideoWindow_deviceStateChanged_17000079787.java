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

public class VideoWindow_deviceStateChanged_17000079787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59220;

    public VideoWindow_deviceStateChanged_17000079787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59220 = newInstance(Class.forName("com.loomcom.symon.ui.VideoWindow"));
        setIntField(term59220, term59220.getClass(), "scaleX", 0);
        setIntField(term59220, term59220.getClass(), "scaleY", 0);
        setBooleanField(term59220, term59220.getClass(), "shouldScale", false);
        setField(term59220, term59220.getClass(), "image", null);
        setField(term59220, term59220.getClass(), "charRom", null);
        setIntField(term59220, term59220.getClass(), "horizontalDisplayed", 0);
        setIntField(term59220, term59220.getClass(), "verticalDisplayed", 0);
        setIntField(term59220, term59220.getClass(), "scanLinesPerRow", 0);
        setIntField(term59220, term59220.getClass(), "cursorBlinkRate", 0);
        setBooleanField(term59220, term59220.getClass(), "hideCursor", false);
        setField(term59220, term59220.getClass(), "dimensions", null);
        setField(term59220, term59220.getClass(), "crtc", null);
        setField(term59220, term59220.getClass(), "scheduler", null);
        setField(term59220, term59220.getClass(), "cursorBlinker", null);
        setIntField(term59220, term59220.getClass(), "defaultCloseOperation", 0);
        setField(term59220, term59220.getClass(), "transferHandler", null);
        setField(term59220, term59220.getClass(), "rootPane", null);
        setBooleanField(term59220, term59220.getClass(), "rootPaneCheckingEnabled", false);
        setField(term59220, term59220.getClass(), "accessibleContext", null);
        setField(term59220, term59220.getClass(), "maximizedBounds", null);
        setField(term59220, term59220.getClass(), "title", null);
        setField(term59220, term59220.getClass(), "menuBar", null);
        setBooleanField(term59220, term59220.getClass(), "resizable", false);
        setBooleanField(term59220, term59220.getClass(), "undecorated", false);
        setBooleanField(term59220, term59220.getClass(), "mbManagement", false);
        setIntField(term59220, term59220.getClass(), "state", 0);
        setField(term59220, term59220.getClass(), "ownedWindows", null);
        setIntField(term59220, term59220.getClass(), "frameSerializedDataVersion", 0);
        setField(term59220, term59220.getClass(), "warningString", null);
        setField(term59220, term59220.getClass(), "icons", null);
        setField(term59220, term59220.getClass(), "temporaryLostComponent", null);
        setBooleanField(term59220, term59220.getClass(), "syncLWRequests", false);
        setBooleanField(term59220, term59220.getClass(), "beforeFirstShow", false);
        setBooleanField(term59220, term59220.getClass(), "disposing", false);
        setField(term59220, term59220.getClass(), "disposerRecord", null);
        setBooleanField(term59220, term59220.getClass(), "alwaysOnTop", false);
        setField(term59220, term59220.getClass(), "ownedWindowList", null);
        setField(term59220, term59220.getClass(), "weakThis", null);
        setBooleanField(term59220, term59220.getClass(), "showWithParent", false);
        setField(term59220, term59220.getClass(), "modalBlocker", null);
        setField(term59220, term59220.getClass(), "modalExclusionType", null);
        setField(term59220, term59220.getClass(), "windowListener", null);
        setField(term59220, term59220.getClass(), "windowStateListener", null);
        setField(term59220, term59220.getClass(), "windowFocusListener", null);
        setField(term59220, term59220.getClass(), "inputContext", null);
        setField(term59220, term59220.getClass(), "inputContextLock", null);
        setField(term59220, term59220.getClass(), "focusMgr", null);
        setBooleanField(term59220, term59220.getClass(), "focusableWindowState", false);
        setBooleanField(term59220, term59220.getClass(), "autoRequestFocus", false);
        setBooleanField(term59220, term59220.getClass(), "isInShow", false);
        setFloatField(term59220, term59220.getClass(), "opacity", 0.0F);
        setField(term59220, term59220.getClass(), "shape", null);
        setBooleanField(term59220, term59220.getClass(), "isTrayIconWindow", false);
        setIntField(term59220, term59220.getClass(), "securityWarningWidth", 0);
        setIntField(term59220, term59220.getClass(), "securityWarningHeight", 0);
        setDoubleField(term59220, term59220.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term59220, term59220.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term59220, term59220.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term59220, term59220.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term59220, term59220.getClass(), "anchor", null);
        setField(term59220, term59220.getClass(), "type", null);
        setIntField(term59220, term59220.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term59220, term59220.getClass(), "locationByPlatform", false);
        setField(term59220, term59220.getClass(), "component", null);
        setField(term59220, term59220.getClass(), "layoutMgr", null);
        setField(term59220, term59220.getClass(), "dispatcher", null);
        setField(term59220, term59220.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term59220, term59220.getClass(), "focusCycleRoot", false);
        setBooleanField(term59220, term59220.getClass(), "focusTraversalPolicyProvider", false);
        setField(term59220, term59220.getClass(), "printingThreads", null);
        setBooleanField(term59220, term59220.getClass(), "printing", false);
        setField(term59220, term59220.getClass(), "containerListener", null);
        setIntField(term59220, term59220.getClass(), "listeningChildren", 0);
        setIntField(term59220, term59220.getClass(), "listeningBoundsChildren", 0);
        setIntField(term59220, term59220.getClass(), "descendantsCount", 0);
        setField(term59220, term59220.getClass(), "preserveBackgroundColor", null);
        setIntField(term59220, term59220.getClass(), "numOfHWComponents", 0);
        setIntField(term59220, term59220.getClass(), "numOfLWComponents", 0);
        setField(term59220, term59220.getClass(), "modalComp", null);
        setField(term59220, term59220.getClass(), "modalAppContext", null);
        setIntField(term59220, term59220.getClass(), "containerSerializedDataVersion", 0);
        setField(term59220, term59220.getClass(), "peer", null);
        setField(term59220, term59220.getClass(), "parent", null);
        setField(term59220, term59220.getClass(), "appContext", null);
        setIntField(term59220, term59220.getClass(), "x", 0);
        setIntField(term59220, term59220.getClass(), "y", 0);
        setIntField(term59220, term59220.getClass(), "width", 0);
        setIntField(term59220, term59220.getClass(), "height", 0);
        setField(term59220, term59220.getClass(), "foreground", null);
        setField(term59220, term59220.getClass(), "background", null);
        setField(term59220, term59220.getClass(), "font", null);
        setField(term59220, term59220.getClass(), "peerFont", null);
        setField(term59220, term59220.getClass(), "cursor", null);
        setField(term59220, term59220.getClass(), "locale", null);
        setField(term59220, term59220.getClass(), "graphicsConfig", null);
        setField(term59220, term59220.getClass(), "bufferStrategy", null);
        setBooleanField(term59220, term59220.getClass(), "ignoreRepaint", false);
        setBooleanField(term59220, term59220.getClass(), "visible", false);
        setBooleanField(term59220, term59220.getClass(), "enabled", false);
        setBooleanField(term59220, term59220.getClass(), "valid", false);
        setField(term59220, term59220.getClass(), "dropTarget", null);
        setField(term59220, term59220.getClass(), "popups", null);
        setField(term59220, term59220.getClass(), "name", null);
        setBooleanField(term59220, term59220.getClass(), "nameExplicitlySet", false);
        setBooleanField(term59220, term59220.getClass(), "focusable", false);
        setIntField(term59220, term59220.getClass(), "isFocusTraversableOverridden", 0);
        setField(term59220, term59220.getClass(), "focusTraversalKeys", null);
        setBooleanField(term59220, term59220.getClass(), "focusTraversalKeysEnabled", false);
        setField(term59220, term59220.getClass(), "acc", null);
        setField(term59220, term59220.getClass(), "minSize", null);
        setBooleanField(term59220, term59220.getClass(), "minSizeSet", false);
        setField(term59220, term59220.getClass(), "prefSize", null);
        setBooleanField(term59220, term59220.getClass(), "prefSizeSet", false);
        setField(term59220, term59220.getClass(), "maxSize", null);
        setBooleanField(term59220, term59220.getClass(), "maxSizeSet", false);
        setField(term59220, term59220.getClass(), "componentOrientation", null);
        setBooleanField(term59220, term59220.getClass(), "newEventsOnly", false);
        setField(term59220, term59220.getClass(), "componentListener", null);
        setField(term59220, term59220.getClass(), "focusListener", null);
        setField(term59220, term59220.getClass(), "hierarchyListener", null);
        setField(term59220, term59220.getClass(), "hierarchyBoundsListener", null);
        setField(term59220, term59220.getClass(), "keyListener", null);
        setField(term59220, term59220.getClass(), "mouseListener", null);
        setField(term59220, term59220.getClass(), "mouseMotionListener", null);
        setField(term59220, term59220.getClass(), "mouseWheelListener", null);
        setField(term59220, term59220.getClass(), "inputMethodListener", null);
        setLongField(term59220, term59220.getClass(), "eventMask", 0L);
        setField(term59220, term59220.getClass(), "changeSupport", null);
        setField(term59220, term59220.getClass(), "objectLock", null);
        setBooleanField(term59220, term59220.getClass(), "isPacked", false);
        setIntField(term59220, term59220.getClass(), "boundsOp", 0);
        setField(term59220, term59220.getClass(), "compoundShape", null);
        setField(term59220, term59220.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term59220, term59220.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term59220, term59220.getClass(), "backgroundEraseDisabled", false);
        setField(term59220, term59220.getClass(), "eventCache", null);
        setBooleanField(term59220, term59220.getClass(), "coalescingEnabled", false);
        setBooleanField(term59220, term59220.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term59220, term59220.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.VideoWindow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "deviceStateChanged", argTypes, term59220, args);
    }

};


