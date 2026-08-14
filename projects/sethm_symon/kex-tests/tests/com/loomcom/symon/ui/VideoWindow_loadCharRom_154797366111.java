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

public class VideoWindow_loadCharRom_154797366111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59494;

    public VideoWindow_loadCharRom_154797366111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59494 = newInstance(Class.forName("com.loomcom.symon.ui.VideoWindow"));
        setIntField(term59494, term59494.getClass(), "scaleX", 0);
        setIntField(term59494, term59494.getClass(), "scaleY", 0);
        setBooleanField(term59494, term59494.getClass(), "shouldScale", false);
        setField(term59494, term59494.getClass(), "image", null);
        setField(term59494, term59494.getClass(), "charRom", null);
        setIntField(term59494, term59494.getClass(), "horizontalDisplayed", 0);
        setIntField(term59494, term59494.getClass(), "verticalDisplayed", 0);
        setIntField(term59494, term59494.getClass(), "scanLinesPerRow", 0);
        setIntField(term59494, term59494.getClass(), "cursorBlinkRate", 0);
        setBooleanField(term59494, term59494.getClass(), "hideCursor", false);
        setField(term59494, term59494.getClass(), "dimensions", null);
        setField(term59494, term59494.getClass(), "crtc", null);
        setField(term59494, term59494.getClass(), "scheduler", null);
        setField(term59494, term59494.getClass(), "cursorBlinker", null);
        setIntField(term59494, term59494.getClass(), "defaultCloseOperation", 0);
        setField(term59494, term59494.getClass(), "transferHandler", null);
        setField(term59494, term59494.getClass(), "rootPane", null);
        setBooleanField(term59494, term59494.getClass(), "rootPaneCheckingEnabled", false);
        setField(term59494, term59494.getClass(), "accessibleContext", null);
        setField(term59494, term59494.getClass(), "maximizedBounds", null);
        setField(term59494, term59494.getClass(), "title", null);
        setField(term59494, term59494.getClass(), "menuBar", null);
        setBooleanField(term59494, term59494.getClass(), "resizable", false);
        setBooleanField(term59494, term59494.getClass(), "undecorated", false);
        setBooleanField(term59494, term59494.getClass(), "mbManagement", false);
        setIntField(term59494, term59494.getClass(), "state", 0);
        setField(term59494, term59494.getClass(), "ownedWindows", null);
        setIntField(term59494, term59494.getClass(), "frameSerializedDataVersion", 0);
        setField(term59494, term59494.getClass(), "warningString", null);
        setField(term59494, term59494.getClass(), "icons", null);
        setField(term59494, term59494.getClass(), "temporaryLostComponent", null);
        setBooleanField(term59494, term59494.getClass(), "syncLWRequests", false);
        setBooleanField(term59494, term59494.getClass(), "beforeFirstShow", false);
        setBooleanField(term59494, term59494.getClass(), "disposing", false);
        setField(term59494, term59494.getClass(), "disposerRecord", null);
        setBooleanField(term59494, term59494.getClass(), "alwaysOnTop", false);
        setField(term59494, term59494.getClass(), "ownedWindowList", null);
        setField(term59494, term59494.getClass(), "weakThis", null);
        setBooleanField(term59494, term59494.getClass(), "showWithParent", false);
        setField(term59494, term59494.getClass(), "modalBlocker", null);
        setField(term59494, term59494.getClass(), "modalExclusionType", null);
        setField(term59494, term59494.getClass(), "windowListener", null);
        setField(term59494, term59494.getClass(), "windowStateListener", null);
        setField(term59494, term59494.getClass(), "windowFocusListener", null);
        setField(term59494, term59494.getClass(), "inputContext", null);
        setField(term59494, term59494.getClass(), "inputContextLock", null);
        setField(term59494, term59494.getClass(), "focusMgr", null);
        setBooleanField(term59494, term59494.getClass(), "focusableWindowState", false);
        setBooleanField(term59494, term59494.getClass(), "autoRequestFocus", false);
        setBooleanField(term59494, term59494.getClass(), "isInShow", false);
        setFloatField(term59494, term59494.getClass(), "opacity", 0.0F);
        setField(term59494, term59494.getClass(), "shape", null);
        setBooleanField(term59494, term59494.getClass(), "isTrayIconWindow", false);
        setIntField(term59494, term59494.getClass(), "securityWarningWidth", 0);
        setIntField(term59494, term59494.getClass(), "securityWarningHeight", 0);
        setDoubleField(term59494, term59494.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term59494, term59494.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term59494, term59494.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term59494, term59494.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term59494, term59494.getClass(), "anchor", null);
        setField(term59494, term59494.getClass(), "type", null);
        setIntField(term59494, term59494.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term59494, term59494.getClass(), "locationByPlatform", false);
        setField(term59494, term59494.getClass(), "component", null);
        setField(term59494, term59494.getClass(), "layoutMgr", null);
        setField(term59494, term59494.getClass(), "dispatcher", null);
        setField(term59494, term59494.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term59494, term59494.getClass(), "focusCycleRoot", false);
        setBooleanField(term59494, term59494.getClass(), "focusTraversalPolicyProvider", false);
        setField(term59494, term59494.getClass(), "printingThreads", null);
        setBooleanField(term59494, term59494.getClass(), "printing", false);
        setField(term59494, term59494.getClass(), "containerListener", null);
        setIntField(term59494, term59494.getClass(), "listeningChildren", 0);
        setIntField(term59494, term59494.getClass(), "listeningBoundsChildren", 0);
        setIntField(term59494, term59494.getClass(), "descendantsCount", 0);
        setField(term59494, term59494.getClass(), "preserveBackgroundColor", null);
        setIntField(term59494, term59494.getClass(), "numOfHWComponents", 0);
        setIntField(term59494, term59494.getClass(), "numOfLWComponents", 0);
        setField(term59494, term59494.getClass(), "modalComp", null);
        setField(term59494, term59494.getClass(), "modalAppContext", null);
        setIntField(term59494, term59494.getClass(), "containerSerializedDataVersion", 0);
        setField(term59494, term59494.getClass(), "peer", null);
        setField(term59494, term59494.getClass(), "parent", null);
        setField(term59494, term59494.getClass(), "appContext", null);
        setIntField(term59494, term59494.getClass(), "x", 0);
        setIntField(term59494, term59494.getClass(), "y", 0);
        setIntField(term59494, term59494.getClass(), "width", 0);
        setIntField(term59494, term59494.getClass(), "height", 0);
        setField(term59494, term59494.getClass(), "foreground", null);
        setField(term59494, term59494.getClass(), "background", null);
        setField(term59494, term59494.getClass(), "font", null);
        setField(term59494, term59494.getClass(), "peerFont", null);
        setField(term59494, term59494.getClass(), "cursor", null);
        setField(term59494, term59494.getClass(), "locale", null);
        setField(term59494, term59494.getClass(), "graphicsConfig", null);
        setField(term59494, term59494.getClass(), "bufferStrategy", null);
        setBooleanField(term59494, term59494.getClass(), "ignoreRepaint", false);
        setBooleanField(term59494, term59494.getClass(), "visible", false);
        setBooleanField(term59494, term59494.getClass(), "enabled", false);
        setBooleanField(term59494, term59494.getClass(), "valid", false);
        setField(term59494, term59494.getClass(), "dropTarget", null);
        setField(term59494, term59494.getClass(), "popups", null);
        setField(term59494, term59494.getClass(), "name", null);
        setBooleanField(term59494, term59494.getClass(), "nameExplicitlySet", false);
        setBooleanField(term59494, term59494.getClass(), "focusable", false);
        setIntField(term59494, term59494.getClass(), "isFocusTraversableOverridden", 0);
        setField(term59494, term59494.getClass(), "focusTraversalKeys", null);
        setBooleanField(term59494, term59494.getClass(), "focusTraversalKeysEnabled", false);
        setField(term59494, term59494.getClass(), "acc", null);
        setField(term59494, term59494.getClass(), "minSize", null);
        setBooleanField(term59494, term59494.getClass(), "minSizeSet", false);
        setField(term59494, term59494.getClass(), "prefSize", null);
        setBooleanField(term59494, term59494.getClass(), "prefSizeSet", false);
        setField(term59494, term59494.getClass(), "maxSize", null);
        setBooleanField(term59494, term59494.getClass(), "maxSizeSet", false);
        setField(term59494, term59494.getClass(), "componentOrientation", null);
        setBooleanField(term59494, term59494.getClass(), "newEventsOnly", false);
        setField(term59494, term59494.getClass(), "componentListener", null);
        setField(term59494, term59494.getClass(), "focusListener", null);
        setField(term59494, term59494.getClass(), "hierarchyListener", null);
        setField(term59494, term59494.getClass(), "hierarchyBoundsListener", null);
        setField(term59494, term59494.getClass(), "keyListener", null);
        setField(term59494, term59494.getClass(), "mouseListener", null);
        setField(term59494, term59494.getClass(), "mouseMotionListener", null);
        setField(term59494, term59494.getClass(), "mouseWheelListener", null);
        setField(term59494, term59494.getClass(), "inputMethodListener", null);
        setLongField(term59494, term59494.getClass(), "eventMask", 0L);
        setField(term59494, term59494.getClass(), "changeSupport", null);
        setField(term59494, term59494.getClass(), "objectLock", null);
        setBooleanField(term59494, term59494.getClass(), "isPacked", false);
        setIntField(term59494, term59494.getClass(), "boundsOp", 0);
        setField(term59494, term59494.getClass(), "compoundShape", null);
        setField(term59494, term59494.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term59494, term59494.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term59494, term59494.getClass(), "backgroundEraseDisabled", false);
        setField(term59494, term59494.getClass(), "eventCache", null);
        setBooleanField(term59494, term59494.getClass(), "coalescingEnabled", false);
        setBooleanField(term59494, term59494.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term59494, term59494.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.VideoWindow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "loadCharRom", argTypes, term59494, args);
    }

};


