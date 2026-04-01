package core;

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
import static core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Board_collapse_110888769012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196102;

    public Board_collapse_110888769012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196102 = newInstance(Class.forName("core.Board"));
        setField(term196102, term196102.getClass(), "contentPanel", null);
        setField(term196102, term196102.getClass(), "bodyLayer", null);
        setField(term196102, term196102.getClass(), "cardLayout", null);
        setField(term196102, term196102.getClass(), "semesterActivity", null);
        setField(term196102, term196102.getClass(), "moduleActivity", null);
        setField(term196102, term196102.getClass(), "settingsUI", null);
        setField(term196102, term196102.getClass(), "transcriptActivity", null);
        setField(term196102, term196102.getClass(), "analysisActivity", null);
        setField(term196102, term196102.getClass(), "helpActivity", null);
        setField(term196102, term196102.getClass(), "about", null);
        setField(term196102, term196102.getClass(), "taskActivity", null);
        setField(term196102, term196102.getClass(), "newsPresent", null);
        setField(term196102, term196102.getClass(), "alertActivity", null);
        setIntField(term196102, term196102.getClass(), "defaultCloseOperation", 0);
        setField(term196102, term196102.getClass(), "transferHandler", null);
        setField(term196102, term196102.getClass(), "rootPane", null);
        setBooleanField(term196102, term196102.getClass(), "rootPaneCheckingEnabled", false);
        setField(term196102, term196102.getClass(), "accessibleContext", null);
        setField(term196102, term196102.getClass(), "maximizedBounds", null);
        setField(term196102, term196102.getClass(), "title", null);
        setField(term196102, term196102.getClass(), "menuBar", null);
        setBooleanField(term196102, term196102.getClass(), "resizable", false);
        setBooleanField(term196102, term196102.getClass(), "undecorated", false);
        setBooleanField(term196102, term196102.getClass(), "mbManagement", false);
        setIntField(term196102, term196102.getClass(), "state", 0);
        setField(term196102, term196102.getClass(), "ownedWindows", null);
        setIntField(term196102, term196102.getClass(), "frameSerializedDataVersion", 0);
        setField(term196102, term196102.getClass(), "warningString", null);
        setField(term196102, term196102.getClass(), "icons", null);
        setField(term196102, term196102.getClass(), "temporaryLostComponent", null);
        setBooleanField(term196102, term196102.getClass(), "syncLWRequests", false);
        setBooleanField(term196102, term196102.getClass(), "beforeFirstShow", false);
        setBooleanField(term196102, term196102.getClass(), "disposing", false);
        setField(term196102, term196102.getClass(), "disposerRecord", null);
        setBooleanField(term196102, term196102.getClass(), "alwaysOnTop", false);
        setField(term196102, term196102.getClass(), "ownedWindowList", null);
        setField(term196102, term196102.getClass(), "weakThis", null);
        setBooleanField(term196102, term196102.getClass(), "showWithParent", false);
        setField(term196102, term196102.getClass(), "modalBlocker", null);
        setField(term196102, term196102.getClass(), "modalExclusionType", null);
        setField(term196102, term196102.getClass(), "windowListener", null);
        setField(term196102, term196102.getClass(), "windowStateListener", null);
        setField(term196102, term196102.getClass(), "windowFocusListener", null);
        setField(term196102, term196102.getClass(), "inputContext", null);
        setField(term196102, term196102.getClass(), "inputContextLock", null);
        setField(term196102, term196102.getClass(), "focusMgr", null);
        setBooleanField(term196102, term196102.getClass(), "focusableWindowState", false);
        setBooleanField(term196102, term196102.getClass(), "autoRequestFocus", false);
        setBooleanField(term196102, term196102.getClass(), "isInShow", false);
        setFloatField(term196102, term196102.getClass(), "opacity", 0.0F);
        setField(term196102, term196102.getClass(), "shape", null);
        setBooleanField(term196102, term196102.getClass(), "isTrayIconWindow", false);
        setIntField(term196102, term196102.getClass(), "securityWarningWidth", 0);
        setIntField(term196102, term196102.getClass(), "securityWarningHeight", 0);
        setDoubleField(term196102, term196102.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term196102, term196102.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term196102, term196102.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term196102, term196102.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term196102, term196102.getClass(), "anchor", null);
        setField(term196102, term196102.getClass(), "type", null);
        setIntField(term196102, term196102.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term196102, term196102.getClass(), "locationByPlatform", false);
        setField(term196102, term196102.getClass(), "component", null);
        setField(term196102, term196102.getClass(), "layoutMgr", null);
        setField(term196102, term196102.getClass(), "dispatcher", null);
        setField(term196102, term196102.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term196102, term196102.getClass(), "focusCycleRoot", false);
        setBooleanField(term196102, term196102.getClass(), "focusTraversalPolicyProvider", false);
        setField(term196102, term196102.getClass(), "printingThreads", null);
        setBooleanField(term196102, term196102.getClass(), "printing", false);
        setField(term196102, term196102.getClass(), "containerListener", null);
        setIntField(term196102, term196102.getClass(), "listeningChildren", 0);
        setIntField(term196102, term196102.getClass(), "listeningBoundsChildren", 0);
        setIntField(term196102, term196102.getClass(), "descendantsCount", 0);
        setField(term196102, term196102.getClass(), "preserveBackgroundColor", null);
        setIntField(term196102, term196102.getClass(), "numOfHWComponents", 0);
        setIntField(term196102, term196102.getClass(), "numOfLWComponents", 0);
        setField(term196102, term196102.getClass(), "modalComp", null);
        setField(term196102, term196102.getClass(), "modalAppContext", null);
        setIntField(term196102, term196102.getClass(), "containerSerializedDataVersion", 0);
        setField(term196102, term196102.getClass(), "peer", null);
        setField(term196102, term196102.getClass(), "parent", null);
        setField(term196102, term196102.getClass(), "appContext", null);
        setIntField(term196102, term196102.getClass(), "x", 0);
        setIntField(term196102, term196102.getClass(), "y", 0);
        setIntField(term196102, term196102.getClass(), "width", 0);
        setIntField(term196102, term196102.getClass(), "height", 0);
        setField(term196102, term196102.getClass(), "foreground", null);
        setField(term196102, term196102.getClass(), "background", null);
        setField(term196102, term196102.getClass(), "font", null);
        setField(term196102, term196102.getClass(), "peerFont", null);
        setField(term196102, term196102.getClass(), "cursor", null);
        setField(term196102, term196102.getClass(), "locale", null);
        setField(term196102, term196102.getClass(), "graphicsConfig", null);
        setField(term196102, term196102.getClass(), "bufferStrategy", null);
        setBooleanField(term196102, term196102.getClass(), "ignoreRepaint", false);
        setBooleanField(term196102, term196102.getClass(), "visible", false);
        setBooleanField(term196102, term196102.getClass(), "enabled", false);
        setBooleanField(term196102, term196102.getClass(), "valid", false);
        setField(term196102, term196102.getClass(), "dropTarget", null);
        setField(term196102, term196102.getClass(), "popups", null);
        setField(term196102, term196102.getClass(), "name", null);
        setBooleanField(term196102, term196102.getClass(), "nameExplicitlySet", false);
        setBooleanField(term196102, term196102.getClass(), "focusable", false);
        setIntField(term196102, term196102.getClass(), "isFocusTraversableOverridden", 0);
        setField(term196102, term196102.getClass(), "focusTraversalKeys", null);
        setBooleanField(term196102, term196102.getClass(), "focusTraversalKeysEnabled", false);
        setField(term196102, term196102.getClass(), "acc", null);
        setField(term196102, term196102.getClass(), "minSize", null);
        setBooleanField(term196102, term196102.getClass(), "minSizeSet", false);
        setField(term196102, term196102.getClass(), "prefSize", null);
        setBooleanField(term196102, term196102.getClass(), "prefSizeSet", false);
        setField(term196102, term196102.getClass(), "maxSize", null);
        setBooleanField(term196102, term196102.getClass(), "maxSizeSet", false);
        setField(term196102, term196102.getClass(), "componentOrientation", null);
        setBooleanField(term196102, term196102.getClass(), "newEventsOnly", false);
        setField(term196102, term196102.getClass(), "componentListener", null);
        setField(term196102, term196102.getClass(), "focusListener", null);
        setField(term196102, term196102.getClass(), "hierarchyListener", null);
        setField(term196102, term196102.getClass(), "hierarchyBoundsListener", null);
        setField(term196102, term196102.getClass(), "keyListener", null);
        setField(term196102, term196102.getClass(), "mouseListener", null);
        setField(term196102, term196102.getClass(), "mouseMotionListener", null);
        setField(term196102, term196102.getClass(), "mouseWheelListener", null);
        setField(term196102, term196102.getClass(), "inputMethodListener", null);
        setLongField(term196102, term196102.getClass(), "eventMask", 0L);
        setField(term196102, term196102.getClass(), "changeSupport", null);
        setField(term196102, term196102.getClass(), "objectLock", null);
        setBooleanField(term196102, term196102.getClass(), "isPacked", false);
        setIntField(term196102, term196102.getClass(), "boundsOp", 0);
        setField(term196102, term196102.getClass(), "compoundShape", null);
        setField(term196102, term196102.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term196102, term196102.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term196102, term196102.getClass(), "backgroundEraseDisabled", false);
        setField(term196102, term196102.getClass(), "eventCache", null);
        setBooleanField(term196102, term196102.getClass(), "coalescingEnabled", false);
        setBooleanField(term196102, term196102.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term196102, term196102.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "collapse", argTypes, term196102, args);
    }

};


