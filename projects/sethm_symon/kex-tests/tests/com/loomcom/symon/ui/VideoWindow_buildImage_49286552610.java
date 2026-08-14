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

public class VideoWindow_buildImage_49286552610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59426;

    public VideoWindow_buildImage_49286552610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59426 = newInstance(Class.forName("com.loomcom.symon.ui.VideoWindow"));
        setIntField(term59426, term59426.getClass(), "scaleX", 0);
        setIntField(term59426, term59426.getClass(), "scaleY", 0);
        setBooleanField(term59426, term59426.getClass(), "shouldScale", false);
        setField(term59426, term59426.getClass(), "image", null);
        setField(term59426, term59426.getClass(), "charRom", null);
        setIntField(term59426, term59426.getClass(), "horizontalDisplayed", 0);
        setIntField(term59426, term59426.getClass(), "verticalDisplayed", 0);
        setIntField(term59426, term59426.getClass(), "scanLinesPerRow", 0);
        setIntField(term59426, term59426.getClass(), "cursorBlinkRate", 0);
        setBooleanField(term59426, term59426.getClass(), "hideCursor", false);
        setField(term59426, term59426.getClass(), "dimensions", null);
        setField(term59426, term59426.getClass(), "crtc", null);
        setField(term59426, term59426.getClass(), "scheduler", null);
        setField(term59426, term59426.getClass(), "cursorBlinker", null);
        setIntField(term59426, term59426.getClass(), "defaultCloseOperation", 0);
        setField(term59426, term59426.getClass(), "transferHandler", null);
        setField(term59426, term59426.getClass(), "rootPane", null);
        setBooleanField(term59426, term59426.getClass(), "rootPaneCheckingEnabled", false);
        setField(term59426, term59426.getClass(), "accessibleContext", null);
        setField(term59426, term59426.getClass(), "maximizedBounds", null);
        setField(term59426, term59426.getClass(), "title", null);
        setField(term59426, term59426.getClass(), "menuBar", null);
        setBooleanField(term59426, term59426.getClass(), "resizable", false);
        setBooleanField(term59426, term59426.getClass(), "undecorated", false);
        setBooleanField(term59426, term59426.getClass(), "mbManagement", false);
        setIntField(term59426, term59426.getClass(), "state", 0);
        setField(term59426, term59426.getClass(), "ownedWindows", null);
        setIntField(term59426, term59426.getClass(), "frameSerializedDataVersion", 0);
        setField(term59426, term59426.getClass(), "warningString", null);
        setField(term59426, term59426.getClass(), "icons", null);
        setField(term59426, term59426.getClass(), "temporaryLostComponent", null);
        setBooleanField(term59426, term59426.getClass(), "syncLWRequests", false);
        setBooleanField(term59426, term59426.getClass(), "beforeFirstShow", false);
        setBooleanField(term59426, term59426.getClass(), "disposing", false);
        setField(term59426, term59426.getClass(), "disposerRecord", null);
        setBooleanField(term59426, term59426.getClass(), "alwaysOnTop", false);
        setField(term59426, term59426.getClass(), "ownedWindowList", null);
        setField(term59426, term59426.getClass(), "weakThis", null);
        setBooleanField(term59426, term59426.getClass(), "showWithParent", false);
        setField(term59426, term59426.getClass(), "modalBlocker", null);
        setField(term59426, term59426.getClass(), "modalExclusionType", null);
        setField(term59426, term59426.getClass(), "windowListener", null);
        setField(term59426, term59426.getClass(), "windowStateListener", null);
        setField(term59426, term59426.getClass(), "windowFocusListener", null);
        setField(term59426, term59426.getClass(), "inputContext", null);
        setField(term59426, term59426.getClass(), "inputContextLock", null);
        setField(term59426, term59426.getClass(), "focusMgr", null);
        setBooleanField(term59426, term59426.getClass(), "focusableWindowState", false);
        setBooleanField(term59426, term59426.getClass(), "autoRequestFocus", false);
        setBooleanField(term59426, term59426.getClass(), "isInShow", false);
        setFloatField(term59426, term59426.getClass(), "opacity", 0.0F);
        setField(term59426, term59426.getClass(), "shape", null);
        setBooleanField(term59426, term59426.getClass(), "isTrayIconWindow", false);
        setIntField(term59426, term59426.getClass(), "securityWarningWidth", 0);
        setIntField(term59426, term59426.getClass(), "securityWarningHeight", 0);
        setDoubleField(term59426, term59426.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term59426, term59426.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term59426, term59426.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term59426, term59426.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term59426, term59426.getClass(), "anchor", null);
        setField(term59426, term59426.getClass(), "type", null);
        setIntField(term59426, term59426.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term59426, term59426.getClass(), "locationByPlatform", false);
        setField(term59426, term59426.getClass(), "component", null);
        setField(term59426, term59426.getClass(), "layoutMgr", null);
        setField(term59426, term59426.getClass(), "dispatcher", null);
        setField(term59426, term59426.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term59426, term59426.getClass(), "focusCycleRoot", false);
        setBooleanField(term59426, term59426.getClass(), "focusTraversalPolicyProvider", false);
        setField(term59426, term59426.getClass(), "printingThreads", null);
        setBooleanField(term59426, term59426.getClass(), "printing", false);
        setField(term59426, term59426.getClass(), "containerListener", null);
        setIntField(term59426, term59426.getClass(), "listeningChildren", 0);
        setIntField(term59426, term59426.getClass(), "listeningBoundsChildren", 0);
        setIntField(term59426, term59426.getClass(), "descendantsCount", 0);
        setField(term59426, term59426.getClass(), "preserveBackgroundColor", null);
        setIntField(term59426, term59426.getClass(), "numOfHWComponents", 0);
        setIntField(term59426, term59426.getClass(), "numOfLWComponents", 0);
        setField(term59426, term59426.getClass(), "modalComp", null);
        setField(term59426, term59426.getClass(), "modalAppContext", null);
        setIntField(term59426, term59426.getClass(), "containerSerializedDataVersion", 0);
        setField(term59426, term59426.getClass(), "peer", null);
        setField(term59426, term59426.getClass(), "parent", null);
        setField(term59426, term59426.getClass(), "appContext", null);
        setIntField(term59426, term59426.getClass(), "x", 0);
        setIntField(term59426, term59426.getClass(), "y", 0);
        setIntField(term59426, term59426.getClass(), "width", 0);
        setIntField(term59426, term59426.getClass(), "height", 0);
        setField(term59426, term59426.getClass(), "foreground", null);
        setField(term59426, term59426.getClass(), "background", null);
        setField(term59426, term59426.getClass(), "font", null);
        setField(term59426, term59426.getClass(), "peerFont", null);
        setField(term59426, term59426.getClass(), "cursor", null);
        setField(term59426, term59426.getClass(), "locale", null);
        setField(term59426, term59426.getClass(), "graphicsConfig", null);
        setField(term59426, term59426.getClass(), "bufferStrategy", null);
        setBooleanField(term59426, term59426.getClass(), "ignoreRepaint", false);
        setBooleanField(term59426, term59426.getClass(), "visible", false);
        setBooleanField(term59426, term59426.getClass(), "enabled", false);
        setBooleanField(term59426, term59426.getClass(), "valid", false);
        setField(term59426, term59426.getClass(), "dropTarget", null);
        setField(term59426, term59426.getClass(), "popups", null);
        setField(term59426, term59426.getClass(), "name", null);
        setBooleanField(term59426, term59426.getClass(), "nameExplicitlySet", false);
        setBooleanField(term59426, term59426.getClass(), "focusable", false);
        setIntField(term59426, term59426.getClass(), "isFocusTraversableOverridden", 0);
        setField(term59426, term59426.getClass(), "focusTraversalKeys", null);
        setBooleanField(term59426, term59426.getClass(), "focusTraversalKeysEnabled", false);
        setField(term59426, term59426.getClass(), "acc", null);
        setField(term59426, term59426.getClass(), "minSize", null);
        setBooleanField(term59426, term59426.getClass(), "minSizeSet", false);
        setField(term59426, term59426.getClass(), "prefSize", null);
        setBooleanField(term59426, term59426.getClass(), "prefSizeSet", false);
        setField(term59426, term59426.getClass(), "maxSize", null);
        setBooleanField(term59426, term59426.getClass(), "maxSizeSet", false);
        setField(term59426, term59426.getClass(), "componentOrientation", null);
        setBooleanField(term59426, term59426.getClass(), "newEventsOnly", false);
        setField(term59426, term59426.getClass(), "componentListener", null);
        setField(term59426, term59426.getClass(), "focusListener", null);
        setField(term59426, term59426.getClass(), "hierarchyListener", null);
        setField(term59426, term59426.getClass(), "hierarchyBoundsListener", null);
        setField(term59426, term59426.getClass(), "keyListener", null);
        setField(term59426, term59426.getClass(), "mouseListener", null);
        setField(term59426, term59426.getClass(), "mouseMotionListener", null);
        setField(term59426, term59426.getClass(), "mouseWheelListener", null);
        setField(term59426, term59426.getClass(), "inputMethodListener", null);
        setLongField(term59426, term59426.getClass(), "eventMask", 0L);
        setField(term59426, term59426.getClass(), "changeSupport", null);
        setField(term59426, term59426.getClass(), "objectLock", null);
        setBooleanField(term59426, term59426.getClass(), "isPacked", false);
        setIntField(term59426, term59426.getClass(), "boundsOp", 0);
        setField(term59426, term59426.getClass(), "compoundShape", null);
        setField(term59426, term59426.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term59426, term59426.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term59426, term59426.getClass(), "backgroundEraseDisabled", false);
        setField(term59426, term59426.getClass(), "eventCache", null);
        setBooleanField(term59426, term59426.getClass(), "coalescingEnabled", false);
        setBooleanField(term59426, term59426.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term59426, term59426.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.VideoWindow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildImage", argTypes, term59426, args);
    }

};


