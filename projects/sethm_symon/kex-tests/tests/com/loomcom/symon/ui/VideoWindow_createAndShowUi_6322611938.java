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

public class VideoWindow_createAndShowUi_6322611938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59288;

    public VideoWindow_createAndShowUi_6322611938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59288 = newInstance(Class.forName("com.loomcom.symon.ui.VideoWindow"));
        setIntField(term59288, term59288.getClass(), "scaleX", 0);
        setIntField(term59288, term59288.getClass(), "scaleY", 0);
        setBooleanField(term59288, term59288.getClass(), "shouldScale", false);
        setField(term59288, term59288.getClass(), "image", null);
        setField(term59288, term59288.getClass(), "charRom", null);
        setIntField(term59288, term59288.getClass(), "horizontalDisplayed", 0);
        setIntField(term59288, term59288.getClass(), "verticalDisplayed", 0);
        setIntField(term59288, term59288.getClass(), "scanLinesPerRow", 0);
        setIntField(term59288, term59288.getClass(), "cursorBlinkRate", 0);
        setBooleanField(term59288, term59288.getClass(), "hideCursor", false);
        setField(term59288, term59288.getClass(), "dimensions", null);
        setField(term59288, term59288.getClass(), "crtc", null);
        setField(term59288, term59288.getClass(), "scheduler", null);
        setField(term59288, term59288.getClass(), "cursorBlinker", null);
        setIntField(term59288, term59288.getClass(), "defaultCloseOperation", 0);
        setField(term59288, term59288.getClass(), "transferHandler", null);
        setField(term59288, term59288.getClass(), "rootPane", null);
        setBooleanField(term59288, term59288.getClass(), "rootPaneCheckingEnabled", false);
        setField(term59288, term59288.getClass(), "accessibleContext", null);
        setField(term59288, term59288.getClass(), "maximizedBounds", null);
        setField(term59288, term59288.getClass(), "title", null);
        setField(term59288, term59288.getClass(), "menuBar", null);
        setBooleanField(term59288, term59288.getClass(), "resizable", false);
        setBooleanField(term59288, term59288.getClass(), "undecorated", false);
        setBooleanField(term59288, term59288.getClass(), "mbManagement", false);
        setIntField(term59288, term59288.getClass(), "state", 0);
        setField(term59288, term59288.getClass(), "ownedWindows", null);
        setIntField(term59288, term59288.getClass(), "frameSerializedDataVersion", 0);
        setField(term59288, term59288.getClass(), "warningString", null);
        setField(term59288, term59288.getClass(), "icons", null);
        setField(term59288, term59288.getClass(), "temporaryLostComponent", null);
        setBooleanField(term59288, term59288.getClass(), "syncLWRequests", false);
        setBooleanField(term59288, term59288.getClass(), "beforeFirstShow", false);
        setBooleanField(term59288, term59288.getClass(), "disposing", false);
        setField(term59288, term59288.getClass(), "disposerRecord", null);
        setBooleanField(term59288, term59288.getClass(), "alwaysOnTop", false);
        setField(term59288, term59288.getClass(), "ownedWindowList", null);
        setField(term59288, term59288.getClass(), "weakThis", null);
        setBooleanField(term59288, term59288.getClass(), "showWithParent", false);
        setField(term59288, term59288.getClass(), "modalBlocker", null);
        setField(term59288, term59288.getClass(), "modalExclusionType", null);
        setField(term59288, term59288.getClass(), "windowListener", null);
        setField(term59288, term59288.getClass(), "windowStateListener", null);
        setField(term59288, term59288.getClass(), "windowFocusListener", null);
        setField(term59288, term59288.getClass(), "inputContext", null);
        setField(term59288, term59288.getClass(), "inputContextLock", null);
        setField(term59288, term59288.getClass(), "focusMgr", null);
        setBooleanField(term59288, term59288.getClass(), "focusableWindowState", false);
        setBooleanField(term59288, term59288.getClass(), "autoRequestFocus", false);
        setBooleanField(term59288, term59288.getClass(), "isInShow", false);
        setFloatField(term59288, term59288.getClass(), "opacity", 0.0F);
        setField(term59288, term59288.getClass(), "shape", null);
        setBooleanField(term59288, term59288.getClass(), "isTrayIconWindow", false);
        setIntField(term59288, term59288.getClass(), "securityWarningWidth", 0);
        setIntField(term59288, term59288.getClass(), "securityWarningHeight", 0);
        setDoubleField(term59288, term59288.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term59288, term59288.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term59288, term59288.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term59288, term59288.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term59288, term59288.getClass(), "anchor", null);
        setField(term59288, term59288.getClass(), "type", null);
        setIntField(term59288, term59288.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term59288, term59288.getClass(), "locationByPlatform", false);
        setField(term59288, term59288.getClass(), "component", null);
        setField(term59288, term59288.getClass(), "layoutMgr", null);
        setField(term59288, term59288.getClass(), "dispatcher", null);
        setField(term59288, term59288.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term59288, term59288.getClass(), "focusCycleRoot", false);
        setBooleanField(term59288, term59288.getClass(), "focusTraversalPolicyProvider", false);
        setField(term59288, term59288.getClass(), "printingThreads", null);
        setBooleanField(term59288, term59288.getClass(), "printing", false);
        setField(term59288, term59288.getClass(), "containerListener", null);
        setIntField(term59288, term59288.getClass(), "listeningChildren", 0);
        setIntField(term59288, term59288.getClass(), "listeningBoundsChildren", 0);
        setIntField(term59288, term59288.getClass(), "descendantsCount", 0);
        setField(term59288, term59288.getClass(), "preserveBackgroundColor", null);
        setIntField(term59288, term59288.getClass(), "numOfHWComponents", 0);
        setIntField(term59288, term59288.getClass(), "numOfLWComponents", 0);
        setField(term59288, term59288.getClass(), "modalComp", null);
        setField(term59288, term59288.getClass(), "modalAppContext", null);
        setIntField(term59288, term59288.getClass(), "containerSerializedDataVersion", 0);
        setField(term59288, term59288.getClass(), "peer", null);
        setField(term59288, term59288.getClass(), "parent", null);
        setField(term59288, term59288.getClass(), "appContext", null);
        setIntField(term59288, term59288.getClass(), "x", 0);
        setIntField(term59288, term59288.getClass(), "y", 0);
        setIntField(term59288, term59288.getClass(), "width", 0);
        setIntField(term59288, term59288.getClass(), "height", 0);
        setField(term59288, term59288.getClass(), "foreground", null);
        setField(term59288, term59288.getClass(), "background", null);
        setField(term59288, term59288.getClass(), "font", null);
        setField(term59288, term59288.getClass(), "peerFont", null);
        setField(term59288, term59288.getClass(), "cursor", null);
        setField(term59288, term59288.getClass(), "locale", null);
        setField(term59288, term59288.getClass(), "graphicsConfig", null);
        setField(term59288, term59288.getClass(), "bufferStrategy", null);
        setBooleanField(term59288, term59288.getClass(), "ignoreRepaint", false);
        setBooleanField(term59288, term59288.getClass(), "visible", false);
        setBooleanField(term59288, term59288.getClass(), "enabled", false);
        setBooleanField(term59288, term59288.getClass(), "valid", false);
        setField(term59288, term59288.getClass(), "dropTarget", null);
        setField(term59288, term59288.getClass(), "popups", null);
        setField(term59288, term59288.getClass(), "name", null);
        setBooleanField(term59288, term59288.getClass(), "nameExplicitlySet", false);
        setBooleanField(term59288, term59288.getClass(), "focusable", false);
        setIntField(term59288, term59288.getClass(), "isFocusTraversableOverridden", 0);
        setField(term59288, term59288.getClass(), "focusTraversalKeys", null);
        setBooleanField(term59288, term59288.getClass(), "focusTraversalKeysEnabled", false);
        setField(term59288, term59288.getClass(), "acc", null);
        setField(term59288, term59288.getClass(), "minSize", null);
        setBooleanField(term59288, term59288.getClass(), "minSizeSet", false);
        setField(term59288, term59288.getClass(), "prefSize", null);
        setBooleanField(term59288, term59288.getClass(), "prefSizeSet", false);
        setField(term59288, term59288.getClass(), "maxSize", null);
        setBooleanField(term59288, term59288.getClass(), "maxSizeSet", false);
        setField(term59288, term59288.getClass(), "componentOrientation", null);
        setBooleanField(term59288, term59288.getClass(), "newEventsOnly", false);
        setField(term59288, term59288.getClass(), "componentListener", null);
        setField(term59288, term59288.getClass(), "focusListener", null);
        setField(term59288, term59288.getClass(), "hierarchyListener", null);
        setField(term59288, term59288.getClass(), "hierarchyBoundsListener", null);
        setField(term59288, term59288.getClass(), "keyListener", null);
        setField(term59288, term59288.getClass(), "mouseListener", null);
        setField(term59288, term59288.getClass(), "mouseMotionListener", null);
        setField(term59288, term59288.getClass(), "mouseWheelListener", null);
        setField(term59288, term59288.getClass(), "inputMethodListener", null);
        setLongField(term59288, term59288.getClass(), "eventMask", 0L);
        setField(term59288, term59288.getClass(), "changeSupport", null);
        setField(term59288, term59288.getClass(), "objectLock", null);
        setBooleanField(term59288, term59288.getClass(), "isPacked", false);
        setIntField(term59288, term59288.getClass(), "boundsOp", 0);
        setField(term59288, term59288.getClass(), "compoundShape", null);
        setField(term59288, term59288.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term59288, term59288.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term59288, term59288.getClass(), "backgroundEraseDisabled", false);
        setField(term59288, term59288.getClass(), "eventCache", null);
        setBooleanField(term59288, term59288.getClass(), "coalescingEnabled", false);
        setBooleanField(term59288, term59288.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term59288, term59288.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.VideoWindow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createAndShowUi", argTypes, term59288, args);
    }

};


