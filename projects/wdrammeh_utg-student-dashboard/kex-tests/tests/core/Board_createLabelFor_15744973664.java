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
     Object term192136;

    public Board_createLabelFor_15744973664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192136 = newInstance(Class.forName("core.Board"));
        setField(term192136, term192136.getClass(), "contentPanel", null);
        setField(term192136, term192136.getClass(), "bodyLayer", null);
        setField(term192136, term192136.getClass(), "cardLayout", null);
        setField(term192136, term192136.getClass(), "semesterActivity", null);
        setField(term192136, term192136.getClass(), "moduleActivity", null);
        setField(term192136, term192136.getClass(), "settingsUI", null);
        setField(term192136, term192136.getClass(), "transcriptActivity", null);
        setField(term192136, term192136.getClass(), "analysisActivity", null);
        setField(term192136, term192136.getClass(), "helpActivity", null);
        setField(term192136, term192136.getClass(), "about", null);
        setField(term192136, term192136.getClass(), "taskActivity", null);
        setField(term192136, term192136.getClass(), "newsPresent", null);
        setField(term192136, term192136.getClass(), "alertActivity", null);
        setIntField(term192136, term192136.getClass(), "defaultCloseOperation", 0);
        setField(term192136, term192136.getClass(), "transferHandler", null);
        setField(term192136, term192136.getClass(), "rootPane", null);
        setBooleanField(term192136, term192136.getClass(), "rootPaneCheckingEnabled", false);
        setField(term192136, term192136.getClass(), "accessibleContext", null);
        setField(term192136, term192136.getClass(), "maximizedBounds", null);
        setField(term192136, term192136.getClass(), "title", null);
        setField(term192136, term192136.getClass(), "menuBar", null);
        setBooleanField(term192136, term192136.getClass(), "resizable", false);
        setBooleanField(term192136, term192136.getClass(), "undecorated", false);
        setBooleanField(term192136, term192136.getClass(), "mbManagement", false);
        setIntField(term192136, term192136.getClass(), "state", 0);
        setField(term192136, term192136.getClass(), "ownedWindows", null);
        setIntField(term192136, term192136.getClass(), "frameSerializedDataVersion", 0);
        setField(term192136, term192136.getClass(), "warningString", null);
        setField(term192136, term192136.getClass(), "icons", null);
        setField(term192136, term192136.getClass(), "temporaryLostComponent", null);
        setBooleanField(term192136, term192136.getClass(), "syncLWRequests", false);
        setBooleanField(term192136, term192136.getClass(), "beforeFirstShow", false);
        setBooleanField(term192136, term192136.getClass(), "disposing", false);
        setField(term192136, term192136.getClass(), "disposerRecord", null);
        setBooleanField(term192136, term192136.getClass(), "alwaysOnTop", false);
        setField(term192136, term192136.getClass(), "ownedWindowList", null);
        setField(term192136, term192136.getClass(), "weakThis", null);
        setBooleanField(term192136, term192136.getClass(), "showWithParent", false);
        setField(term192136, term192136.getClass(), "modalBlocker", null);
        setField(term192136, term192136.getClass(), "modalExclusionType", null);
        setField(term192136, term192136.getClass(), "windowListener", null);
        setField(term192136, term192136.getClass(), "windowStateListener", null);
        setField(term192136, term192136.getClass(), "windowFocusListener", null);
        setField(term192136, term192136.getClass(), "inputContext", null);
        setField(term192136, term192136.getClass(), "inputContextLock", null);
        setField(term192136, term192136.getClass(), "focusMgr", null);
        setBooleanField(term192136, term192136.getClass(), "focusableWindowState", false);
        setBooleanField(term192136, term192136.getClass(), "autoRequestFocus", false);
        setBooleanField(term192136, term192136.getClass(), "isInShow", false);
        setFloatField(term192136, term192136.getClass(), "opacity", 0.0F);
        setField(term192136, term192136.getClass(), "shape", null);
        setBooleanField(term192136, term192136.getClass(), "isTrayIconWindow", false);
        setIntField(term192136, term192136.getClass(), "securityWarningWidth", 0);
        setIntField(term192136, term192136.getClass(), "securityWarningHeight", 0);
        setDoubleField(term192136, term192136.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term192136, term192136.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term192136, term192136.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term192136, term192136.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term192136, term192136.getClass(), "anchor", null);
        setField(term192136, term192136.getClass(), "type", null);
        setIntField(term192136, term192136.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term192136, term192136.getClass(), "locationByPlatform", false);
        setField(term192136, term192136.getClass(), "component", null);
        setField(term192136, term192136.getClass(), "layoutMgr", null);
        setField(term192136, term192136.getClass(), "dispatcher", null);
        setField(term192136, term192136.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term192136, term192136.getClass(), "focusCycleRoot", false);
        setBooleanField(term192136, term192136.getClass(), "focusTraversalPolicyProvider", false);
        setField(term192136, term192136.getClass(), "printingThreads", null);
        setBooleanField(term192136, term192136.getClass(), "printing", false);
        setField(term192136, term192136.getClass(), "containerListener", null);
        setIntField(term192136, term192136.getClass(), "listeningChildren", 0);
        setIntField(term192136, term192136.getClass(), "listeningBoundsChildren", 0);
        setIntField(term192136, term192136.getClass(), "descendantsCount", 0);
        setField(term192136, term192136.getClass(), "preserveBackgroundColor", null);
        setIntField(term192136, term192136.getClass(), "numOfHWComponents", 0);
        setIntField(term192136, term192136.getClass(), "numOfLWComponents", 0);
        setField(term192136, term192136.getClass(), "modalComp", null);
        setField(term192136, term192136.getClass(), "modalAppContext", null);
        setIntField(term192136, term192136.getClass(), "containerSerializedDataVersion", 0);
        setField(term192136, term192136.getClass(), "peer", null);
        setField(term192136, term192136.getClass(), "parent", null);
        setField(term192136, term192136.getClass(), "appContext", null);
        setIntField(term192136, term192136.getClass(), "x", 0);
        setIntField(term192136, term192136.getClass(), "y", 0);
        setIntField(term192136, term192136.getClass(), "width", 0);
        setIntField(term192136, term192136.getClass(), "height", 0);
        setField(term192136, term192136.getClass(), "foreground", null);
        setField(term192136, term192136.getClass(), "background", null);
        setField(term192136, term192136.getClass(), "font", null);
        setField(term192136, term192136.getClass(), "peerFont", null);
        setField(term192136, term192136.getClass(), "cursor", null);
        setField(term192136, term192136.getClass(), "locale", null);
        setField(term192136, term192136.getClass(), "graphicsConfig", null);
        setField(term192136, term192136.getClass(), "bufferStrategy", null);
        setBooleanField(term192136, term192136.getClass(), "ignoreRepaint", false);
        setBooleanField(term192136, term192136.getClass(), "visible", false);
        setBooleanField(term192136, term192136.getClass(), "enabled", false);
        setBooleanField(term192136, term192136.getClass(), "valid", false);
        setField(term192136, term192136.getClass(), "dropTarget", null);
        setField(term192136, term192136.getClass(), "popups", null);
        setField(term192136, term192136.getClass(), "name", null);
        setBooleanField(term192136, term192136.getClass(), "nameExplicitlySet", false);
        setBooleanField(term192136, term192136.getClass(), "focusable", false);
        setIntField(term192136, term192136.getClass(), "isFocusTraversableOverridden", 0);
        setField(term192136, term192136.getClass(), "focusTraversalKeys", null);
        setBooleanField(term192136, term192136.getClass(), "focusTraversalKeysEnabled", false);
        setField(term192136, term192136.getClass(), "acc", null);
        setField(term192136, term192136.getClass(), "minSize", null);
        setBooleanField(term192136, term192136.getClass(), "minSizeSet", false);
        setField(term192136, term192136.getClass(), "prefSize", null);
        setBooleanField(term192136, term192136.getClass(), "prefSizeSet", false);
        setField(term192136, term192136.getClass(), "maxSize", null);
        setBooleanField(term192136, term192136.getClass(), "maxSizeSet", false);
        setField(term192136, term192136.getClass(), "componentOrientation", null);
        setBooleanField(term192136, term192136.getClass(), "newEventsOnly", false);
        setField(term192136, term192136.getClass(), "componentListener", null);
        setField(term192136, term192136.getClass(), "focusListener", null);
        setField(term192136, term192136.getClass(), "hierarchyListener", null);
        setField(term192136, term192136.getClass(), "hierarchyBoundsListener", null);
        setField(term192136, term192136.getClass(), "keyListener", null);
        setField(term192136, term192136.getClass(), "mouseListener", null);
        setField(term192136, term192136.getClass(), "mouseMotionListener", null);
        setField(term192136, term192136.getClass(), "mouseWheelListener", null);
        setField(term192136, term192136.getClass(), "inputMethodListener", null);
        setLongField(term192136, term192136.getClass(), "eventMask", 0L);
        setField(term192136, term192136.getClass(), "changeSupport", null);
        setField(term192136, term192136.getClass(), "objectLock", null);
        setBooleanField(term192136, term192136.getClass(), "isPacked", false);
        setIntField(term192136, term192136.getClass(), "boundsOp", 0);
        setField(term192136, term192136.getClass(), "compoundShape", null);
        setField(term192136, term192136.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term192136, term192136.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term192136, term192136.getClass(), "backgroundEraseDisabled", false);
        setField(term192136, term192136.getClass(), "eventCache", null);
        setBooleanField(term192136, term192136.getClass(), "coalescingEnabled", false);
        setBooleanField(term192136, term192136.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term192136, term192136.getClass(), "componentSerializedDataVersion", 0);
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
        callMethod(klass, "createLabelFor", argTypes, term192136, args);
    }

};


