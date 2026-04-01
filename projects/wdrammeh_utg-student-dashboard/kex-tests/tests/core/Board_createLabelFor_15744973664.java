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

public class Board_createLabelFor_15744973664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192122;

    public Board_createLabelFor_15744973664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192122 = newInstance(Class.forName("core.Board"));
        setField(term192122, term192122.getClass(), "contentPanel", null);
        setField(term192122, term192122.getClass(), "bodyLayer", null);
        setField(term192122, term192122.getClass(), "cardLayout", null);
        setField(term192122, term192122.getClass(), "semesterActivity", null);
        setField(term192122, term192122.getClass(), "moduleActivity", null);
        setField(term192122, term192122.getClass(), "settingsUI", null);
        setField(term192122, term192122.getClass(), "transcriptActivity", null);
        setField(term192122, term192122.getClass(), "analysisActivity", null);
        setField(term192122, term192122.getClass(), "helpActivity", null);
        setField(term192122, term192122.getClass(), "about", null);
        setField(term192122, term192122.getClass(), "taskActivity", null);
        setField(term192122, term192122.getClass(), "newsPresent", null);
        setField(term192122, term192122.getClass(), "alertActivity", null);
        setIntField(term192122, term192122.getClass(), "defaultCloseOperation", 0);
        setField(term192122, term192122.getClass(), "transferHandler", null);
        setField(term192122, term192122.getClass(), "rootPane", null);
        setBooleanField(term192122, term192122.getClass(), "rootPaneCheckingEnabled", false);
        setField(term192122, term192122.getClass(), "accessibleContext", null);
        setField(term192122, term192122.getClass(), "maximizedBounds", null);
        setField(term192122, term192122.getClass(), "title", null);
        setField(term192122, term192122.getClass(), "menuBar", null);
        setBooleanField(term192122, term192122.getClass(), "resizable", false);
        setBooleanField(term192122, term192122.getClass(), "undecorated", false);
        setBooleanField(term192122, term192122.getClass(), "mbManagement", false);
        setIntField(term192122, term192122.getClass(), "state", 0);
        setField(term192122, term192122.getClass(), "ownedWindows", null);
        setIntField(term192122, term192122.getClass(), "frameSerializedDataVersion", 0);
        setField(term192122, term192122.getClass(), "warningString", null);
        setField(term192122, term192122.getClass(), "icons", null);
        setField(term192122, term192122.getClass(), "temporaryLostComponent", null);
        setBooleanField(term192122, term192122.getClass(), "syncLWRequests", false);
        setBooleanField(term192122, term192122.getClass(), "beforeFirstShow", false);
        setBooleanField(term192122, term192122.getClass(), "disposing", false);
        setField(term192122, term192122.getClass(), "disposerRecord", null);
        setBooleanField(term192122, term192122.getClass(), "alwaysOnTop", false);
        setField(term192122, term192122.getClass(), "ownedWindowList", null);
        setField(term192122, term192122.getClass(), "weakThis", null);
        setBooleanField(term192122, term192122.getClass(), "showWithParent", false);
        setField(term192122, term192122.getClass(), "modalBlocker", null);
        setField(term192122, term192122.getClass(), "modalExclusionType", null);
        setField(term192122, term192122.getClass(), "windowListener", null);
        setField(term192122, term192122.getClass(), "windowStateListener", null);
        setField(term192122, term192122.getClass(), "windowFocusListener", null);
        setField(term192122, term192122.getClass(), "inputContext", null);
        setField(term192122, term192122.getClass(), "inputContextLock", null);
        setField(term192122, term192122.getClass(), "focusMgr", null);
        setBooleanField(term192122, term192122.getClass(), "focusableWindowState", false);
        setBooleanField(term192122, term192122.getClass(), "autoRequestFocus", false);
        setBooleanField(term192122, term192122.getClass(), "isInShow", false);
        setFloatField(term192122, term192122.getClass(), "opacity", 0.0F);
        setField(term192122, term192122.getClass(), "shape", null);
        setBooleanField(term192122, term192122.getClass(), "isTrayIconWindow", false);
        setIntField(term192122, term192122.getClass(), "securityWarningWidth", 0);
        setIntField(term192122, term192122.getClass(), "securityWarningHeight", 0);
        setDoubleField(term192122, term192122.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term192122, term192122.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term192122, term192122.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term192122, term192122.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term192122, term192122.getClass(), "anchor", null);
        setField(term192122, term192122.getClass(), "type", null);
        setIntField(term192122, term192122.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term192122, term192122.getClass(), "locationByPlatform", false);
        setField(term192122, term192122.getClass(), "component", null);
        setField(term192122, term192122.getClass(), "layoutMgr", null);
        setField(term192122, term192122.getClass(), "dispatcher", null);
        setField(term192122, term192122.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term192122, term192122.getClass(), "focusCycleRoot", false);
        setBooleanField(term192122, term192122.getClass(), "focusTraversalPolicyProvider", false);
        setField(term192122, term192122.getClass(), "printingThreads", null);
        setBooleanField(term192122, term192122.getClass(), "printing", false);
        setField(term192122, term192122.getClass(), "containerListener", null);
        setIntField(term192122, term192122.getClass(), "listeningChildren", 0);
        setIntField(term192122, term192122.getClass(), "listeningBoundsChildren", 0);
        setIntField(term192122, term192122.getClass(), "descendantsCount", 0);
        setField(term192122, term192122.getClass(), "preserveBackgroundColor", null);
        setIntField(term192122, term192122.getClass(), "numOfHWComponents", 0);
        setIntField(term192122, term192122.getClass(), "numOfLWComponents", 0);
        setField(term192122, term192122.getClass(), "modalComp", null);
        setField(term192122, term192122.getClass(), "modalAppContext", null);
        setIntField(term192122, term192122.getClass(), "containerSerializedDataVersion", 0);
        setField(term192122, term192122.getClass(), "peer", null);
        setField(term192122, term192122.getClass(), "parent", null);
        setField(term192122, term192122.getClass(), "appContext", null);
        setIntField(term192122, term192122.getClass(), "x", 0);
        setIntField(term192122, term192122.getClass(), "y", 0);
        setIntField(term192122, term192122.getClass(), "width", 0);
        setIntField(term192122, term192122.getClass(), "height", 0);
        setField(term192122, term192122.getClass(), "foreground", null);
        setField(term192122, term192122.getClass(), "background", null);
        setField(term192122, term192122.getClass(), "font", null);
        setField(term192122, term192122.getClass(), "peerFont", null);
        setField(term192122, term192122.getClass(), "cursor", null);
        setField(term192122, term192122.getClass(), "locale", null);
        setField(term192122, term192122.getClass(), "graphicsConfig", null);
        setField(term192122, term192122.getClass(), "bufferStrategy", null);
        setBooleanField(term192122, term192122.getClass(), "ignoreRepaint", false);
        setBooleanField(term192122, term192122.getClass(), "visible", false);
        setBooleanField(term192122, term192122.getClass(), "enabled", false);
        setBooleanField(term192122, term192122.getClass(), "valid", false);
        setField(term192122, term192122.getClass(), "dropTarget", null);
        setField(term192122, term192122.getClass(), "popups", null);
        setField(term192122, term192122.getClass(), "name", null);
        setBooleanField(term192122, term192122.getClass(), "nameExplicitlySet", false);
        setBooleanField(term192122, term192122.getClass(), "focusable", false);
        setIntField(term192122, term192122.getClass(), "isFocusTraversableOverridden", 0);
        setField(term192122, term192122.getClass(), "focusTraversalKeys", null);
        setBooleanField(term192122, term192122.getClass(), "focusTraversalKeysEnabled", false);
        setField(term192122, term192122.getClass(), "acc", null);
        setField(term192122, term192122.getClass(), "minSize", null);
        setBooleanField(term192122, term192122.getClass(), "minSizeSet", false);
        setField(term192122, term192122.getClass(), "prefSize", null);
        setBooleanField(term192122, term192122.getClass(), "prefSizeSet", false);
        setField(term192122, term192122.getClass(), "maxSize", null);
        setBooleanField(term192122, term192122.getClass(), "maxSizeSet", false);
        setField(term192122, term192122.getClass(), "componentOrientation", null);
        setBooleanField(term192122, term192122.getClass(), "newEventsOnly", false);
        setField(term192122, term192122.getClass(), "componentListener", null);
        setField(term192122, term192122.getClass(), "focusListener", null);
        setField(term192122, term192122.getClass(), "hierarchyListener", null);
        setField(term192122, term192122.getClass(), "hierarchyBoundsListener", null);
        setField(term192122, term192122.getClass(), "keyListener", null);
        setField(term192122, term192122.getClass(), "mouseListener", null);
        setField(term192122, term192122.getClass(), "mouseMotionListener", null);
        setField(term192122, term192122.getClass(), "mouseWheelListener", null);
        setField(term192122, term192122.getClass(), "inputMethodListener", null);
        setLongField(term192122, term192122.getClass(), "eventMask", 0L);
        setField(term192122, term192122.getClass(), "changeSupport", null);
        setField(term192122, term192122.getClass(), "objectLock", null);
        setBooleanField(term192122, term192122.getClass(), "isPacked", false);
        setIntField(term192122, term192122.getClass(), "boundsOp", 0);
        setField(term192122, term192122.getClass(), "compoundShape", null);
        setField(term192122, term192122.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term192122, term192122.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term192122, term192122.getClass(), "backgroundEraseDisabled", false);
        setField(term192122, term192122.getClass(), "eventCache", null);
        setBooleanField(term192122, term192122.getClass(), "coalescingEnabled", false);
        setBooleanField(term192122, term192122.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term192122, term192122.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "createLabelFor", argTypes, term192122, args);
    }

};


