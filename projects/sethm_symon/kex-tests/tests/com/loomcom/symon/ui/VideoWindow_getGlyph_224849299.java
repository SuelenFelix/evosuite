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

public class VideoWindow_getGlyph_224849299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59356;
     Object term59424;

    public VideoWindow_getGlyph_224849299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59356 = newInstance(Class.forName("com.loomcom.symon.ui.VideoWindow"));
        setIntField(term59356, term59356.getClass(), "scaleX", 0);
        setIntField(term59356, term59356.getClass(), "scaleY", 0);
        setBooleanField(term59356, term59356.getClass(), "shouldScale", false);
        setField(term59356, term59356.getClass(), "image", null);
        setField(term59356, term59356.getClass(), "charRom", null);
        setIntField(term59356, term59356.getClass(), "horizontalDisplayed", 0);
        setIntField(term59356, term59356.getClass(), "verticalDisplayed", 0);
        setIntField(term59356, term59356.getClass(), "scanLinesPerRow", 0);
        setIntField(term59356, term59356.getClass(), "cursorBlinkRate", 0);
        setBooleanField(term59356, term59356.getClass(), "hideCursor", false);
        setField(term59356, term59356.getClass(), "dimensions", null);
        setField(term59356, term59356.getClass(), "crtc", null);
        setField(term59356, term59356.getClass(), "scheduler", null);
        setField(term59356, term59356.getClass(), "cursorBlinker", null);
        setIntField(term59356, term59356.getClass(), "defaultCloseOperation", 0);
        setField(term59356, term59356.getClass(), "transferHandler", null);
        setField(term59356, term59356.getClass(), "rootPane", null);
        setBooleanField(term59356, term59356.getClass(), "rootPaneCheckingEnabled", false);
        setField(term59356, term59356.getClass(), "accessibleContext", null);
        setField(term59356, term59356.getClass(), "maximizedBounds", null);
        setField(term59356, term59356.getClass(), "title", null);
        setField(term59356, term59356.getClass(), "menuBar", null);
        setBooleanField(term59356, term59356.getClass(), "resizable", false);
        setBooleanField(term59356, term59356.getClass(), "undecorated", false);
        setBooleanField(term59356, term59356.getClass(), "mbManagement", false);
        setIntField(term59356, term59356.getClass(), "state", 0);
        setField(term59356, term59356.getClass(), "ownedWindows", null);
        setIntField(term59356, term59356.getClass(), "frameSerializedDataVersion", 0);
        setField(term59356, term59356.getClass(), "warningString", null);
        setField(term59356, term59356.getClass(), "icons", null);
        setField(term59356, term59356.getClass(), "temporaryLostComponent", null);
        setBooleanField(term59356, term59356.getClass(), "syncLWRequests", false);
        setBooleanField(term59356, term59356.getClass(), "beforeFirstShow", false);
        setBooleanField(term59356, term59356.getClass(), "disposing", false);
        setField(term59356, term59356.getClass(), "disposerRecord", null);
        setBooleanField(term59356, term59356.getClass(), "alwaysOnTop", false);
        setField(term59356, term59356.getClass(), "ownedWindowList", null);
        setField(term59356, term59356.getClass(), "weakThis", null);
        setBooleanField(term59356, term59356.getClass(), "showWithParent", false);
        setField(term59356, term59356.getClass(), "modalBlocker", null);
        setField(term59356, term59356.getClass(), "modalExclusionType", null);
        setField(term59356, term59356.getClass(), "windowListener", null);
        setField(term59356, term59356.getClass(), "windowStateListener", null);
        setField(term59356, term59356.getClass(), "windowFocusListener", null);
        setField(term59356, term59356.getClass(), "inputContext", null);
        setField(term59356, term59356.getClass(), "inputContextLock", null);
        setField(term59356, term59356.getClass(), "focusMgr", null);
        setBooleanField(term59356, term59356.getClass(), "focusableWindowState", false);
        setBooleanField(term59356, term59356.getClass(), "autoRequestFocus", false);
        setBooleanField(term59356, term59356.getClass(), "isInShow", false);
        setFloatField(term59356, term59356.getClass(), "opacity", 0.0F);
        setField(term59356, term59356.getClass(), "shape", null);
        setBooleanField(term59356, term59356.getClass(), "isTrayIconWindow", false);
        setIntField(term59356, term59356.getClass(), "securityWarningWidth", 0);
        setIntField(term59356, term59356.getClass(), "securityWarningHeight", 0);
        setDoubleField(term59356, term59356.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term59356, term59356.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term59356, term59356.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term59356, term59356.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term59356, term59356.getClass(), "anchor", null);
        setField(term59356, term59356.getClass(), "type", null);
        setIntField(term59356, term59356.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term59356, term59356.getClass(), "locationByPlatform", false);
        setField(term59356, term59356.getClass(), "component", null);
        setField(term59356, term59356.getClass(), "layoutMgr", null);
        setField(term59356, term59356.getClass(), "dispatcher", null);
        setField(term59356, term59356.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term59356, term59356.getClass(), "focusCycleRoot", false);
        setBooleanField(term59356, term59356.getClass(), "focusTraversalPolicyProvider", false);
        setField(term59356, term59356.getClass(), "printingThreads", null);
        setBooleanField(term59356, term59356.getClass(), "printing", false);
        setField(term59356, term59356.getClass(), "containerListener", null);
        setIntField(term59356, term59356.getClass(), "listeningChildren", 0);
        setIntField(term59356, term59356.getClass(), "listeningBoundsChildren", 0);
        setIntField(term59356, term59356.getClass(), "descendantsCount", 0);
        setField(term59356, term59356.getClass(), "preserveBackgroundColor", null);
        setIntField(term59356, term59356.getClass(), "numOfHWComponents", 0);
        setIntField(term59356, term59356.getClass(), "numOfLWComponents", 0);
        setField(term59356, term59356.getClass(), "modalComp", null);
        setField(term59356, term59356.getClass(), "modalAppContext", null);
        setIntField(term59356, term59356.getClass(), "containerSerializedDataVersion", 0);
        setField(term59356, term59356.getClass(), "peer", null);
        setField(term59356, term59356.getClass(), "parent", null);
        setField(term59356, term59356.getClass(), "appContext", null);
        setIntField(term59356, term59356.getClass(), "x", 0);
        setIntField(term59356, term59356.getClass(), "y", 0);
        setIntField(term59356, term59356.getClass(), "width", 0);
        setIntField(term59356, term59356.getClass(), "height", 0);
        setField(term59356, term59356.getClass(), "foreground", null);
        setField(term59356, term59356.getClass(), "background", null);
        setField(term59356, term59356.getClass(), "font", null);
        setField(term59356, term59356.getClass(), "peerFont", null);
        setField(term59356, term59356.getClass(), "cursor", null);
        setField(term59356, term59356.getClass(), "locale", null);
        setField(term59356, term59356.getClass(), "graphicsConfig", null);
        setField(term59356, term59356.getClass(), "bufferStrategy", null);
        setBooleanField(term59356, term59356.getClass(), "ignoreRepaint", false);
        setBooleanField(term59356, term59356.getClass(), "visible", false);
        setBooleanField(term59356, term59356.getClass(), "enabled", false);
        setBooleanField(term59356, term59356.getClass(), "valid", false);
        setField(term59356, term59356.getClass(), "dropTarget", null);
        setField(term59356, term59356.getClass(), "popups", null);
        setField(term59356, term59356.getClass(), "name", null);
        setBooleanField(term59356, term59356.getClass(), "nameExplicitlySet", false);
        setBooleanField(term59356, term59356.getClass(), "focusable", false);
        setIntField(term59356, term59356.getClass(), "isFocusTraversableOverridden", 0);
        setField(term59356, term59356.getClass(), "focusTraversalKeys", null);
        setBooleanField(term59356, term59356.getClass(), "focusTraversalKeysEnabled", false);
        setField(term59356, term59356.getClass(), "acc", null);
        setField(term59356, term59356.getClass(), "minSize", null);
        setBooleanField(term59356, term59356.getClass(), "minSizeSet", false);
        setField(term59356, term59356.getClass(), "prefSize", null);
        setBooleanField(term59356, term59356.getClass(), "prefSizeSet", false);
        setField(term59356, term59356.getClass(), "maxSize", null);
        setBooleanField(term59356, term59356.getClass(), "maxSizeSet", false);
        setField(term59356, term59356.getClass(), "componentOrientation", null);
        setBooleanField(term59356, term59356.getClass(), "newEventsOnly", false);
        setField(term59356, term59356.getClass(), "componentListener", null);
        setField(term59356, term59356.getClass(), "focusListener", null);
        setField(term59356, term59356.getClass(), "hierarchyListener", null);
        setField(term59356, term59356.getClass(), "hierarchyBoundsListener", null);
        setField(term59356, term59356.getClass(), "keyListener", null);
        setField(term59356, term59356.getClass(), "mouseListener", null);
        setField(term59356, term59356.getClass(), "mouseMotionListener", null);
        setField(term59356, term59356.getClass(), "mouseWheelListener", null);
        setField(term59356, term59356.getClass(), "inputMethodListener", null);
        setLongField(term59356, term59356.getClass(), "eventMask", 0L);
        setField(term59356, term59356.getClass(), "changeSupport", null);
        setField(term59356, term59356.getClass(), "objectLock", null);
        setBooleanField(term59356, term59356.getClass(), "isPacked", false);
        setIntField(term59356, term59356.getClass(), "boundsOp", 0);
        setField(term59356, term59356.getClass(), "compoundShape", null);
        setField(term59356, term59356.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term59356, term59356.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term59356, term59356.getClass(), "backgroundEraseDisabled", false);
        setField(term59356, term59356.getClass(), "eventCache", null);
        setBooleanField(term59356, term59356.getClass(), "coalescingEnabled", false);
        setBooleanField(term59356, term59356.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term59356, term59356.getClass(), "componentSerializedDataVersion", 0);
        term59424 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.VideoWindow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term59424;
        callMethod(klass, "getGlyph", argTypes, term59356, args);
    }

};


