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

public class Board_setUpThorax_14901124722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191074;

    public Board_setUpThorax_14901124722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191074 = newInstance(Class.forName("core.Board"));
        setField(term191074, term191074.getClass(), "contentPanel", null);
        setField(term191074, term191074.getClass(), "bodyLayer", null);
        setField(term191074, term191074.getClass(), "cardLayout", null);
        setField(term191074, term191074.getClass(), "semesterActivity", null);
        setField(term191074, term191074.getClass(), "moduleActivity", null);
        setField(term191074, term191074.getClass(), "settingsUI", null);
        setField(term191074, term191074.getClass(), "transcriptActivity", null);
        setField(term191074, term191074.getClass(), "analysisActivity", null);
        setField(term191074, term191074.getClass(), "helpActivity", null);
        setField(term191074, term191074.getClass(), "about", null);
        setField(term191074, term191074.getClass(), "taskActivity", null);
        setField(term191074, term191074.getClass(), "newsPresent", null);
        setField(term191074, term191074.getClass(), "alertActivity", null);
        setIntField(term191074, term191074.getClass(), "defaultCloseOperation", 0);
        setField(term191074, term191074.getClass(), "transferHandler", null);
        setField(term191074, term191074.getClass(), "rootPane", null);
        setBooleanField(term191074, term191074.getClass(), "rootPaneCheckingEnabled", false);
        setField(term191074, term191074.getClass(), "accessibleContext", null);
        setField(term191074, term191074.getClass(), "maximizedBounds", null);
        setField(term191074, term191074.getClass(), "title", null);
        setField(term191074, term191074.getClass(), "menuBar", null);
        setBooleanField(term191074, term191074.getClass(), "resizable", false);
        setBooleanField(term191074, term191074.getClass(), "undecorated", false);
        setBooleanField(term191074, term191074.getClass(), "mbManagement", false);
        setIntField(term191074, term191074.getClass(), "state", 0);
        setField(term191074, term191074.getClass(), "ownedWindows", null);
        setIntField(term191074, term191074.getClass(), "frameSerializedDataVersion", 0);
        setField(term191074, term191074.getClass(), "warningString", null);
        setField(term191074, term191074.getClass(), "icons", null);
        setField(term191074, term191074.getClass(), "temporaryLostComponent", null);
        setBooleanField(term191074, term191074.getClass(), "syncLWRequests", false);
        setBooleanField(term191074, term191074.getClass(), "beforeFirstShow", false);
        setBooleanField(term191074, term191074.getClass(), "disposing", false);
        setField(term191074, term191074.getClass(), "disposerRecord", null);
        setBooleanField(term191074, term191074.getClass(), "alwaysOnTop", false);
        setField(term191074, term191074.getClass(), "ownedWindowList", null);
        setField(term191074, term191074.getClass(), "weakThis", null);
        setBooleanField(term191074, term191074.getClass(), "showWithParent", false);
        setField(term191074, term191074.getClass(), "modalBlocker", null);
        setField(term191074, term191074.getClass(), "modalExclusionType", null);
        setField(term191074, term191074.getClass(), "windowListener", null);
        setField(term191074, term191074.getClass(), "windowStateListener", null);
        setField(term191074, term191074.getClass(), "windowFocusListener", null);
        setField(term191074, term191074.getClass(), "inputContext", null);
        setField(term191074, term191074.getClass(), "inputContextLock", null);
        setField(term191074, term191074.getClass(), "focusMgr", null);
        setBooleanField(term191074, term191074.getClass(), "focusableWindowState", false);
        setBooleanField(term191074, term191074.getClass(), "autoRequestFocus", false);
        setBooleanField(term191074, term191074.getClass(), "isInShow", false);
        setFloatField(term191074, term191074.getClass(), "opacity", 0.0F);
        setField(term191074, term191074.getClass(), "shape", null);
        setBooleanField(term191074, term191074.getClass(), "isTrayIconWindow", false);
        setIntField(term191074, term191074.getClass(), "securityWarningWidth", 0);
        setIntField(term191074, term191074.getClass(), "securityWarningHeight", 0);
        setDoubleField(term191074, term191074.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term191074, term191074.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term191074, term191074.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term191074, term191074.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term191074, term191074.getClass(), "anchor", null);
        setField(term191074, term191074.getClass(), "type", null);
        setIntField(term191074, term191074.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term191074, term191074.getClass(), "locationByPlatform", false);
        setField(term191074, term191074.getClass(), "component", null);
        setField(term191074, term191074.getClass(), "layoutMgr", null);
        setField(term191074, term191074.getClass(), "dispatcher", null);
        setField(term191074, term191074.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term191074, term191074.getClass(), "focusCycleRoot", false);
        setBooleanField(term191074, term191074.getClass(), "focusTraversalPolicyProvider", false);
        setField(term191074, term191074.getClass(), "printingThreads", null);
        setBooleanField(term191074, term191074.getClass(), "printing", false);
        setField(term191074, term191074.getClass(), "containerListener", null);
        setIntField(term191074, term191074.getClass(), "listeningChildren", 0);
        setIntField(term191074, term191074.getClass(), "listeningBoundsChildren", 0);
        setIntField(term191074, term191074.getClass(), "descendantsCount", 0);
        setField(term191074, term191074.getClass(), "preserveBackgroundColor", null);
        setIntField(term191074, term191074.getClass(), "numOfHWComponents", 0);
        setIntField(term191074, term191074.getClass(), "numOfLWComponents", 0);
        setField(term191074, term191074.getClass(), "modalComp", null);
        setField(term191074, term191074.getClass(), "modalAppContext", null);
        setIntField(term191074, term191074.getClass(), "containerSerializedDataVersion", 0);
        setField(term191074, term191074.getClass(), "peer", null);
        setField(term191074, term191074.getClass(), "parent", null);
        setField(term191074, term191074.getClass(), "appContext", null);
        setIntField(term191074, term191074.getClass(), "x", 0);
        setIntField(term191074, term191074.getClass(), "y", 0);
        setIntField(term191074, term191074.getClass(), "width", 0);
        setIntField(term191074, term191074.getClass(), "height", 0);
        setField(term191074, term191074.getClass(), "foreground", null);
        setField(term191074, term191074.getClass(), "background", null);
        setField(term191074, term191074.getClass(), "font", null);
        setField(term191074, term191074.getClass(), "peerFont", null);
        setField(term191074, term191074.getClass(), "cursor", null);
        setField(term191074, term191074.getClass(), "locale", null);
        setField(term191074, term191074.getClass(), "graphicsConfig", null);
        setField(term191074, term191074.getClass(), "bufferStrategy", null);
        setBooleanField(term191074, term191074.getClass(), "ignoreRepaint", false);
        setBooleanField(term191074, term191074.getClass(), "visible", false);
        setBooleanField(term191074, term191074.getClass(), "enabled", false);
        setBooleanField(term191074, term191074.getClass(), "valid", false);
        setField(term191074, term191074.getClass(), "dropTarget", null);
        setField(term191074, term191074.getClass(), "popups", null);
        setField(term191074, term191074.getClass(), "name", null);
        setBooleanField(term191074, term191074.getClass(), "nameExplicitlySet", false);
        setBooleanField(term191074, term191074.getClass(), "focusable", false);
        setIntField(term191074, term191074.getClass(), "isFocusTraversableOverridden", 0);
        setField(term191074, term191074.getClass(), "focusTraversalKeys", null);
        setBooleanField(term191074, term191074.getClass(), "focusTraversalKeysEnabled", false);
        setField(term191074, term191074.getClass(), "acc", null);
        setField(term191074, term191074.getClass(), "minSize", null);
        setBooleanField(term191074, term191074.getClass(), "minSizeSet", false);
        setField(term191074, term191074.getClass(), "prefSize", null);
        setBooleanField(term191074, term191074.getClass(), "prefSizeSet", false);
        setField(term191074, term191074.getClass(), "maxSize", null);
        setBooleanField(term191074, term191074.getClass(), "maxSizeSet", false);
        setField(term191074, term191074.getClass(), "componentOrientation", null);
        setBooleanField(term191074, term191074.getClass(), "newEventsOnly", false);
        setField(term191074, term191074.getClass(), "componentListener", null);
        setField(term191074, term191074.getClass(), "focusListener", null);
        setField(term191074, term191074.getClass(), "hierarchyListener", null);
        setField(term191074, term191074.getClass(), "hierarchyBoundsListener", null);
        setField(term191074, term191074.getClass(), "keyListener", null);
        setField(term191074, term191074.getClass(), "mouseListener", null);
        setField(term191074, term191074.getClass(), "mouseMotionListener", null);
        setField(term191074, term191074.getClass(), "mouseWheelListener", null);
        setField(term191074, term191074.getClass(), "inputMethodListener", null);
        setLongField(term191074, term191074.getClass(), "eventMask", 0L);
        setField(term191074, term191074.getClass(), "changeSupport", null);
        setField(term191074, term191074.getClass(), "objectLock", null);
        setBooleanField(term191074, term191074.getClass(), "isPacked", false);
        setIntField(term191074, term191074.getClass(), "boundsOp", 0);
        setField(term191074, term191074.getClass(), "compoundShape", null);
        setField(term191074, term191074.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term191074, term191074.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term191074, term191074.getClass(), "backgroundEraseDisabled", false);
        setField(term191074, term191074.getClass(), "eventCache", null);
        setBooleanField(term191074, term191074.getClass(), "coalescingEnabled", false);
        setBooleanField(term191074, term191074.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term191074, term191074.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setUpThorax", argTypes, term191074, args);
    }

};


