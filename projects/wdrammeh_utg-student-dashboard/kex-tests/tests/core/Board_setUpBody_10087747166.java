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

public class Board_setUpBody_10087747166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193137;

    public Board_setUpBody_10087747166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193137 = newInstance(Class.forName("core.Board"));
        setField(term193137, term193137.getClass(), "contentPanel", null);
        setField(term193137, term193137.getClass(), "bodyLayer", null);
        setField(term193137, term193137.getClass(), "cardLayout", null);
        setField(term193137, term193137.getClass(), "semesterActivity", null);
        setField(term193137, term193137.getClass(), "moduleActivity", null);
        setField(term193137, term193137.getClass(), "settingsUI", null);
        setField(term193137, term193137.getClass(), "transcriptActivity", null);
        setField(term193137, term193137.getClass(), "analysisActivity", null);
        setField(term193137, term193137.getClass(), "helpActivity", null);
        setField(term193137, term193137.getClass(), "about", null);
        setField(term193137, term193137.getClass(), "taskActivity", null);
        setField(term193137, term193137.getClass(), "newsPresent", null);
        setField(term193137, term193137.getClass(), "alertActivity", null);
        setIntField(term193137, term193137.getClass(), "defaultCloseOperation", 0);
        setField(term193137, term193137.getClass(), "transferHandler", null);
        setField(term193137, term193137.getClass(), "rootPane", null);
        setBooleanField(term193137, term193137.getClass(), "rootPaneCheckingEnabled", false);
        setField(term193137, term193137.getClass(), "accessibleContext", null);
        setField(term193137, term193137.getClass(), "maximizedBounds", null);
        setField(term193137, term193137.getClass(), "title", null);
        setField(term193137, term193137.getClass(), "menuBar", null);
        setBooleanField(term193137, term193137.getClass(), "resizable", false);
        setBooleanField(term193137, term193137.getClass(), "undecorated", false);
        setBooleanField(term193137, term193137.getClass(), "mbManagement", false);
        setIntField(term193137, term193137.getClass(), "state", 0);
        setField(term193137, term193137.getClass(), "ownedWindows", null);
        setIntField(term193137, term193137.getClass(), "frameSerializedDataVersion", 0);
        setField(term193137, term193137.getClass(), "warningString", null);
        setField(term193137, term193137.getClass(), "icons", null);
        setField(term193137, term193137.getClass(), "temporaryLostComponent", null);
        setBooleanField(term193137, term193137.getClass(), "syncLWRequests", false);
        setBooleanField(term193137, term193137.getClass(), "beforeFirstShow", false);
        setBooleanField(term193137, term193137.getClass(), "disposing", false);
        setField(term193137, term193137.getClass(), "disposerRecord", null);
        setBooleanField(term193137, term193137.getClass(), "alwaysOnTop", false);
        setField(term193137, term193137.getClass(), "ownedWindowList", null);
        setField(term193137, term193137.getClass(), "weakThis", null);
        setBooleanField(term193137, term193137.getClass(), "showWithParent", false);
        setField(term193137, term193137.getClass(), "modalBlocker", null);
        setField(term193137, term193137.getClass(), "modalExclusionType", null);
        setField(term193137, term193137.getClass(), "windowListener", null);
        setField(term193137, term193137.getClass(), "windowStateListener", null);
        setField(term193137, term193137.getClass(), "windowFocusListener", null);
        setField(term193137, term193137.getClass(), "inputContext", null);
        setField(term193137, term193137.getClass(), "inputContextLock", null);
        setField(term193137, term193137.getClass(), "focusMgr", null);
        setBooleanField(term193137, term193137.getClass(), "focusableWindowState", false);
        setBooleanField(term193137, term193137.getClass(), "autoRequestFocus", false);
        setBooleanField(term193137, term193137.getClass(), "isInShow", false);
        setFloatField(term193137, term193137.getClass(), "opacity", 0.0F);
        setField(term193137, term193137.getClass(), "shape", null);
        setBooleanField(term193137, term193137.getClass(), "isTrayIconWindow", false);
        setIntField(term193137, term193137.getClass(), "securityWarningWidth", 0);
        setIntField(term193137, term193137.getClass(), "securityWarningHeight", 0);
        setDoubleField(term193137, term193137.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term193137, term193137.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term193137, term193137.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term193137, term193137.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term193137, term193137.getClass(), "anchor", null);
        setField(term193137, term193137.getClass(), "type", null);
        setIntField(term193137, term193137.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term193137, term193137.getClass(), "locationByPlatform", false);
        setField(term193137, term193137.getClass(), "component", null);
        setField(term193137, term193137.getClass(), "layoutMgr", null);
        setField(term193137, term193137.getClass(), "dispatcher", null);
        setField(term193137, term193137.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term193137, term193137.getClass(), "focusCycleRoot", false);
        setBooleanField(term193137, term193137.getClass(), "focusTraversalPolicyProvider", false);
        setField(term193137, term193137.getClass(), "printingThreads", null);
        setBooleanField(term193137, term193137.getClass(), "printing", false);
        setField(term193137, term193137.getClass(), "containerListener", null);
        setIntField(term193137, term193137.getClass(), "listeningChildren", 0);
        setIntField(term193137, term193137.getClass(), "listeningBoundsChildren", 0);
        setIntField(term193137, term193137.getClass(), "descendantsCount", 0);
        setField(term193137, term193137.getClass(), "preserveBackgroundColor", null);
        setIntField(term193137, term193137.getClass(), "numOfHWComponents", 0);
        setIntField(term193137, term193137.getClass(), "numOfLWComponents", 0);
        setField(term193137, term193137.getClass(), "modalComp", null);
        setField(term193137, term193137.getClass(), "modalAppContext", null);
        setIntField(term193137, term193137.getClass(), "containerSerializedDataVersion", 0);
        setField(term193137, term193137.getClass(), "peer", null);
        setField(term193137, term193137.getClass(), "parent", null);
        setField(term193137, term193137.getClass(), "appContext", null);
        setIntField(term193137, term193137.getClass(), "x", 0);
        setIntField(term193137, term193137.getClass(), "y", 0);
        setIntField(term193137, term193137.getClass(), "width", 0);
        setIntField(term193137, term193137.getClass(), "height", 0);
        setField(term193137, term193137.getClass(), "foreground", null);
        setField(term193137, term193137.getClass(), "background", null);
        setField(term193137, term193137.getClass(), "font", null);
        setField(term193137, term193137.getClass(), "peerFont", null);
        setField(term193137, term193137.getClass(), "cursor", null);
        setField(term193137, term193137.getClass(), "locale", null);
        setField(term193137, term193137.getClass(), "graphicsConfig", null);
        setField(term193137, term193137.getClass(), "bufferStrategy", null);
        setBooleanField(term193137, term193137.getClass(), "ignoreRepaint", false);
        setBooleanField(term193137, term193137.getClass(), "visible", false);
        setBooleanField(term193137, term193137.getClass(), "enabled", false);
        setBooleanField(term193137, term193137.getClass(), "valid", false);
        setField(term193137, term193137.getClass(), "dropTarget", null);
        setField(term193137, term193137.getClass(), "popups", null);
        setField(term193137, term193137.getClass(), "name", null);
        setBooleanField(term193137, term193137.getClass(), "nameExplicitlySet", false);
        setBooleanField(term193137, term193137.getClass(), "focusable", false);
        setIntField(term193137, term193137.getClass(), "isFocusTraversableOverridden", 0);
        setField(term193137, term193137.getClass(), "focusTraversalKeys", null);
        setBooleanField(term193137, term193137.getClass(), "focusTraversalKeysEnabled", false);
        setField(term193137, term193137.getClass(), "acc", null);
        setField(term193137, term193137.getClass(), "minSize", null);
        setBooleanField(term193137, term193137.getClass(), "minSizeSet", false);
        setField(term193137, term193137.getClass(), "prefSize", null);
        setBooleanField(term193137, term193137.getClass(), "prefSizeSet", false);
        setField(term193137, term193137.getClass(), "maxSize", null);
        setBooleanField(term193137, term193137.getClass(), "maxSizeSet", false);
        setField(term193137, term193137.getClass(), "componentOrientation", null);
        setBooleanField(term193137, term193137.getClass(), "newEventsOnly", false);
        setField(term193137, term193137.getClass(), "componentListener", null);
        setField(term193137, term193137.getClass(), "focusListener", null);
        setField(term193137, term193137.getClass(), "hierarchyListener", null);
        setField(term193137, term193137.getClass(), "hierarchyBoundsListener", null);
        setField(term193137, term193137.getClass(), "keyListener", null);
        setField(term193137, term193137.getClass(), "mouseListener", null);
        setField(term193137, term193137.getClass(), "mouseMotionListener", null);
        setField(term193137, term193137.getClass(), "mouseWheelListener", null);
        setField(term193137, term193137.getClass(), "inputMethodListener", null);
        setLongField(term193137, term193137.getClass(), "eventMask", 0L);
        setField(term193137, term193137.getClass(), "changeSupport", null);
        setField(term193137, term193137.getClass(), "objectLock", null);
        setBooleanField(term193137, term193137.getClass(), "isPacked", false);
        setIntField(term193137, term193137.getClass(), "boundsOp", 0);
        setField(term193137, term193137.getClass(), "compoundShape", null);
        setField(term193137, term193137.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term193137, term193137.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term193137, term193137.getClass(), "backgroundEraseDisabled", false);
        setField(term193137, term193137.getClass(), "eventCache", null);
        setBooleanField(term193137, term193137.getClass(), "coalescingEnabled", false);
        setBooleanField(term193137, term193137.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term193137, term193137.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setUpBody", argTypes, term193137, args);
    }

};


