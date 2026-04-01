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
     Object term191060;

    public Board_setUpThorax_14901124722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191060 = newInstance(Class.forName("core.Board"));
        setField(term191060, term191060.getClass(), "contentPanel", null);
        setField(term191060, term191060.getClass(), "bodyLayer", null);
        setField(term191060, term191060.getClass(), "cardLayout", null);
        setField(term191060, term191060.getClass(), "semesterActivity", null);
        setField(term191060, term191060.getClass(), "moduleActivity", null);
        setField(term191060, term191060.getClass(), "settingsUI", null);
        setField(term191060, term191060.getClass(), "transcriptActivity", null);
        setField(term191060, term191060.getClass(), "analysisActivity", null);
        setField(term191060, term191060.getClass(), "helpActivity", null);
        setField(term191060, term191060.getClass(), "about", null);
        setField(term191060, term191060.getClass(), "taskActivity", null);
        setField(term191060, term191060.getClass(), "newsPresent", null);
        setField(term191060, term191060.getClass(), "alertActivity", null);
        setIntField(term191060, term191060.getClass(), "defaultCloseOperation", 0);
        setField(term191060, term191060.getClass(), "transferHandler", null);
        setField(term191060, term191060.getClass(), "rootPane", null);
        setBooleanField(term191060, term191060.getClass(), "rootPaneCheckingEnabled", false);
        setField(term191060, term191060.getClass(), "accessibleContext", null);
        setField(term191060, term191060.getClass(), "maximizedBounds", null);
        setField(term191060, term191060.getClass(), "title", null);
        setField(term191060, term191060.getClass(), "menuBar", null);
        setBooleanField(term191060, term191060.getClass(), "resizable", false);
        setBooleanField(term191060, term191060.getClass(), "undecorated", false);
        setBooleanField(term191060, term191060.getClass(), "mbManagement", false);
        setIntField(term191060, term191060.getClass(), "state", 0);
        setField(term191060, term191060.getClass(), "ownedWindows", null);
        setIntField(term191060, term191060.getClass(), "frameSerializedDataVersion", 0);
        setField(term191060, term191060.getClass(), "warningString", null);
        setField(term191060, term191060.getClass(), "icons", null);
        setField(term191060, term191060.getClass(), "temporaryLostComponent", null);
        setBooleanField(term191060, term191060.getClass(), "syncLWRequests", false);
        setBooleanField(term191060, term191060.getClass(), "beforeFirstShow", false);
        setBooleanField(term191060, term191060.getClass(), "disposing", false);
        setField(term191060, term191060.getClass(), "disposerRecord", null);
        setBooleanField(term191060, term191060.getClass(), "alwaysOnTop", false);
        setField(term191060, term191060.getClass(), "ownedWindowList", null);
        setField(term191060, term191060.getClass(), "weakThis", null);
        setBooleanField(term191060, term191060.getClass(), "showWithParent", false);
        setField(term191060, term191060.getClass(), "modalBlocker", null);
        setField(term191060, term191060.getClass(), "modalExclusionType", null);
        setField(term191060, term191060.getClass(), "windowListener", null);
        setField(term191060, term191060.getClass(), "windowStateListener", null);
        setField(term191060, term191060.getClass(), "windowFocusListener", null);
        setField(term191060, term191060.getClass(), "inputContext", null);
        setField(term191060, term191060.getClass(), "inputContextLock", null);
        setField(term191060, term191060.getClass(), "focusMgr", null);
        setBooleanField(term191060, term191060.getClass(), "focusableWindowState", false);
        setBooleanField(term191060, term191060.getClass(), "autoRequestFocus", false);
        setBooleanField(term191060, term191060.getClass(), "isInShow", false);
        setFloatField(term191060, term191060.getClass(), "opacity", 0.0F);
        setField(term191060, term191060.getClass(), "shape", null);
        setBooleanField(term191060, term191060.getClass(), "isTrayIconWindow", false);
        setIntField(term191060, term191060.getClass(), "securityWarningWidth", 0);
        setIntField(term191060, term191060.getClass(), "securityWarningHeight", 0);
        setDoubleField(term191060, term191060.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term191060, term191060.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term191060, term191060.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term191060, term191060.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term191060, term191060.getClass(), "anchor", null);
        setField(term191060, term191060.getClass(), "type", null);
        setIntField(term191060, term191060.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term191060, term191060.getClass(), "locationByPlatform", false);
        setField(term191060, term191060.getClass(), "component", null);
        setField(term191060, term191060.getClass(), "layoutMgr", null);
        setField(term191060, term191060.getClass(), "dispatcher", null);
        setField(term191060, term191060.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term191060, term191060.getClass(), "focusCycleRoot", false);
        setBooleanField(term191060, term191060.getClass(), "focusTraversalPolicyProvider", false);
        setField(term191060, term191060.getClass(), "printingThreads", null);
        setBooleanField(term191060, term191060.getClass(), "printing", false);
        setField(term191060, term191060.getClass(), "containerListener", null);
        setIntField(term191060, term191060.getClass(), "listeningChildren", 0);
        setIntField(term191060, term191060.getClass(), "listeningBoundsChildren", 0);
        setIntField(term191060, term191060.getClass(), "descendantsCount", 0);
        setField(term191060, term191060.getClass(), "preserveBackgroundColor", null);
        setIntField(term191060, term191060.getClass(), "numOfHWComponents", 0);
        setIntField(term191060, term191060.getClass(), "numOfLWComponents", 0);
        setField(term191060, term191060.getClass(), "modalComp", null);
        setField(term191060, term191060.getClass(), "modalAppContext", null);
        setIntField(term191060, term191060.getClass(), "containerSerializedDataVersion", 0);
        setField(term191060, term191060.getClass(), "peer", null);
        setField(term191060, term191060.getClass(), "parent", null);
        setField(term191060, term191060.getClass(), "appContext", null);
        setIntField(term191060, term191060.getClass(), "x", 0);
        setIntField(term191060, term191060.getClass(), "y", 0);
        setIntField(term191060, term191060.getClass(), "width", 0);
        setIntField(term191060, term191060.getClass(), "height", 0);
        setField(term191060, term191060.getClass(), "foreground", null);
        setField(term191060, term191060.getClass(), "background", null);
        setField(term191060, term191060.getClass(), "font", null);
        setField(term191060, term191060.getClass(), "peerFont", null);
        setField(term191060, term191060.getClass(), "cursor", null);
        setField(term191060, term191060.getClass(), "locale", null);
        setField(term191060, term191060.getClass(), "graphicsConfig", null);
        setField(term191060, term191060.getClass(), "bufferStrategy", null);
        setBooleanField(term191060, term191060.getClass(), "ignoreRepaint", false);
        setBooleanField(term191060, term191060.getClass(), "visible", false);
        setBooleanField(term191060, term191060.getClass(), "enabled", false);
        setBooleanField(term191060, term191060.getClass(), "valid", false);
        setField(term191060, term191060.getClass(), "dropTarget", null);
        setField(term191060, term191060.getClass(), "popups", null);
        setField(term191060, term191060.getClass(), "name", null);
        setBooleanField(term191060, term191060.getClass(), "nameExplicitlySet", false);
        setBooleanField(term191060, term191060.getClass(), "focusable", false);
        setIntField(term191060, term191060.getClass(), "isFocusTraversableOverridden", 0);
        setField(term191060, term191060.getClass(), "focusTraversalKeys", null);
        setBooleanField(term191060, term191060.getClass(), "focusTraversalKeysEnabled", false);
        setField(term191060, term191060.getClass(), "acc", null);
        setField(term191060, term191060.getClass(), "minSize", null);
        setBooleanField(term191060, term191060.getClass(), "minSizeSet", false);
        setField(term191060, term191060.getClass(), "prefSize", null);
        setBooleanField(term191060, term191060.getClass(), "prefSizeSet", false);
        setField(term191060, term191060.getClass(), "maxSize", null);
        setBooleanField(term191060, term191060.getClass(), "maxSizeSet", false);
        setField(term191060, term191060.getClass(), "componentOrientation", null);
        setBooleanField(term191060, term191060.getClass(), "newEventsOnly", false);
        setField(term191060, term191060.getClass(), "componentListener", null);
        setField(term191060, term191060.getClass(), "focusListener", null);
        setField(term191060, term191060.getClass(), "hierarchyListener", null);
        setField(term191060, term191060.getClass(), "hierarchyBoundsListener", null);
        setField(term191060, term191060.getClass(), "keyListener", null);
        setField(term191060, term191060.getClass(), "mouseListener", null);
        setField(term191060, term191060.getClass(), "mouseMotionListener", null);
        setField(term191060, term191060.getClass(), "mouseWheelListener", null);
        setField(term191060, term191060.getClass(), "inputMethodListener", null);
        setLongField(term191060, term191060.getClass(), "eventMask", 0L);
        setField(term191060, term191060.getClass(), "changeSupport", null);
        setField(term191060, term191060.getClass(), "objectLock", null);
        setBooleanField(term191060, term191060.getClass(), "isPacked", false);
        setIntField(term191060, term191060.getClass(), "boundsOp", 0);
        setField(term191060, term191060.getClass(), "compoundShape", null);
        setField(term191060, term191060.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term191060, term191060.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term191060, term191060.getClass(), "backgroundEraseDisabled", false);
        setField(term191060, term191060.getClass(), "eventCache", null);
        setBooleanField(term191060, term191060.getClass(), "coalescingEnabled", false);
        setBooleanField(term191060, term191060.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term191060, term191060.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setUpThorax", argTypes, term191060, args);
    }

};


