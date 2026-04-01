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
import java.lang.Boolean;

public class Board_setVisible_206098775910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195124;
     Object term195184;

    public Board_setVisible_206098775910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195124 = newInstance(Class.forName("core.Board"));
        setField(term195124, term195124.getClass(), "contentPanel", null);
        setField(term195124, term195124.getClass(), "bodyLayer", null);
        setField(term195124, term195124.getClass(), "cardLayout", null);
        setField(term195124, term195124.getClass(), "semesterActivity", null);
        setField(term195124, term195124.getClass(), "moduleActivity", null);
        setField(term195124, term195124.getClass(), "settingsUI", null);
        setField(term195124, term195124.getClass(), "transcriptActivity", null);
        setField(term195124, term195124.getClass(), "analysisActivity", null);
        setField(term195124, term195124.getClass(), "helpActivity", null);
        setField(term195124, term195124.getClass(), "about", null);
        setField(term195124, term195124.getClass(), "taskActivity", null);
        setField(term195124, term195124.getClass(), "newsPresent", null);
        setField(term195124, term195124.getClass(), "alertActivity", null);
        setIntField(term195124, term195124.getClass(), "defaultCloseOperation", 0);
        setField(term195124, term195124.getClass(), "transferHandler", null);
        setField(term195124, term195124.getClass(), "rootPane", null);
        setBooleanField(term195124, term195124.getClass(), "rootPaneCheckingEnabled", false);
        setField(term195124, term195124.getClass(), "accessibleContext", null);
        setField(term195124, term195124.getClass(), "maximizedBounds", null);
        setField(term195124, term195124.getClass(), "title", null);
        setField(term195124, term195124.getClass(), "menuBar", null);
        setBooleanField(term195124, term195124.getClass(), "resizable", false);
        setBooleanField(term195124, term195124.getClass(), "undecorated", false);
        setBooleanField(term195124, term195124.getClass(), "mbManagement", false);
        setIntField(term195124, term195124.getClass(), "state", 0);
        setField(term195124, term195124.getClass(), "ownedWindows", null);
        setIntField(term195124, term195124.getClass(), "frameSerializedDataVersion", 0);
        setField(term195124, term195124.getClass(), "warningString", null);
        setField(term195124, term195124.getClass(), "icons", null);
        setField(term195124, term195124.getClass(), "temporaryLostComponent", null);
        setBooleanField(term195124, term195124.getClass(), "syncLWRequests", false);
        setBooleanField(term195124, term195124.getClass(), "beforeFirstShow", false);
        setBooleanField(term195124, term195124.getClass(), "disposing", false);
        setField(term195124, term195124.getClass(), "disposerRecord", null);
        setBooleanField(term195124, term195124.getClass(), "alwaysOnTop", false);
        setField(term195124, term195124.getClass(), "ownedWindowList", null);
        setField(term195124, term195124.getClass(), "weakThis", null);
        setBooleanField(term195124, term195124.getClass(), "showWithParent", false);
        setField(term195124, term195124.getClass(), "modalBlocker", null);
        setField(term195124, term195124.getClass(), "modalExclusionType", null);
        setField(term195124, term195124.getClass(), "windowListener", null);
        setField(term195124, term195124.getClass(), "windowStateListener", null);
        setField(term195124, term195124.getClass(), "windowFocusListener", null);
        setField(term195124, term195124.getClass(), "inputContext", null);
        setField(term195124, term195124.getClass(), "inputContextLock", null);
        setField(term195124, term195124.getClass(), "focusMgr", null);
        setBooleanField(term195124, term195124.getClass(), "focusableWindowState", false);
        setBooleanField(term195124, term195124.getClass(), "autoRequestFocus", false);
        setBooleanField(term195124, term195124.getClass(), "isInShow", false);
        setFloatField(term195124, term195124.getClass(), "opacity", 0.0F);
        setField(term195124, term195124.getClass(), "shape", null);
        setBooleanField(term195124, term195124.getClass(), "isTrayIconWindow", false);
        setIntField(term195124, term195124.getClass(), "securityWarningWidth", 0);
        setIntField(term195124, term195124.getClass(), "securityWarningHeight", 0);
        setDoubleField(term195124, term195124.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term195124, term195124.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term195124, term195124.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term195124, term195124.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term195124, term195124.getClass(), "anchor", null);
        setField(term195124, term195124.getClass(), "type", null);
        setIntField(term195124, term195124.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term195124, term195124.getClass(), "locationByPlatform", false);
        setField(term195124, term195124.getClass(), "component", null);
        setField(term195124, term195124.getClass(), "layoutMgr", null);
        setField(term195124, term195124.getClass(), "dispatcher", null);
        setField(term195124, term195124.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term195124, term195124.getClass(), "focusCycleRoot", false);
        setBooleanField(term195124, term195124.getClass(), "focusTraversalPolicyProvider", false);
        setField(term195124, term195124.getClass(), "printingThreads", null);
        setBooleanField(term195124, term195124.getClass(), "printing", false);
        setField(term195124, term195124.getClass(), "containerListener", null);
        setIntField(term195124, term195124.getClass(), "listeningChildren", 0);
        setIntField(term195124, term195124.getClass(), "listeningBoundsChildren", 0);
        setIntField(term195124, term195124.getClass(), "descendantsCount", 0);
        setField(term195124, term195124.getClass(), "preserveBackgroundColor", null);
        setIntField(term195124, term195124.getClass(), "numOfHWComponents", 0);
        setIntField(term195124, term195124.getClass(), "numOfLWComponents", 0);
        setField(term195124, term195124.getClass(), "modalComp", null);
        setField(term195124, term195124.getClass(), "modalAppContext", null);
        setIntField(term195124, term195124.getClass(), "containerSerializedDataVersion", 0);
        setField(term195124, term195124.getClass(), "peer", null);
        setField(term195124, term195124.getClass(), "parent", null);
        setField(term195124, term195124.getClass(), "appContext", null);
        setIntField(term195124, term195124.getClass(), "x", 0);
        setIntField(term195124, term195124.getClass(), "y", 0);
        setIntField(term195124, term195124.getClass(), "width", 0);
        setIntField(term195124, term195124.getClass(), "height", 0);
        setField(term195124, term195124.getClass(), "foreground", null);
        setField(term195124, term195124.getClass(), "background", null);
        setField(term195124, term195124.getClass(), "font", null);
        setField(term195124, term195124.getClass(), "peerFont", null);
        setField(term195124, term195124.getClass(), "cursor", null);
        setField(term195124, term195124.getClass(), "locale", null);
        setField(term195124, term195124.getClass(), "graphicsConfig", null);
        setField(term195124, term195124.getClass(), "bufferStrategy", null);
        setBooleanField(term195124, term195124.getClass(), "ignoreRepaint", false);
        setBooleanField(term195124, term195124.getClass(), "visible", false);
        setBooleanField(term195124, term195124.getClass(), "enabled", false);
        setBooleanField(term195124, term195124.getClass(), "valid", false);
        setField(term195124, term195124.getClass(), "dropTarget", null);
        setField(term195124, term195124.getClass(), "popups", null);
        setField(term195124, term195124.getClass(), "name", null);
        setBooleanField(term195124, term195124.getClass(), "nameExplicitlySet", false);
        setBooleanField(term195124, term195124.getClass(), "focusable", false);
        setIntField(term195124, term195124.getClass(), "isFocusTraversableOverridden", 0);
        setField(term195124, term195124.getClass(), "focusTraversalKeys", null);
        setBooleanField(term195124, term195124.getClass(), "focusTraversalKeysEnabled", false);
        setField(term195124, term195124.getClass(), "acc", null);
        setField(term195124, term195124.getClass(), "minSize", null);
        setBooleanField(term195124, term195124.getClass(), "minSizeSet", false);
        setField(term195124, term195124.getClass(), "prefSize", null);
        setBooleanField(term195124, term195124.getClass(), "prefSizeSet", false);
        setField(term195124, term195124.getClass(), "maxSize", null);
        setBooleanField(term195124, term195124.getClass(), "maxSizeSet", false);
        setField(term195124, term195124.getClass(), "componentOrientation", null);
        setBooleanField(term195124, term195124.getClass(), "newEventsOnly", false);
        setField(term195124, term195124.getClass(), "componentListener", null);
        setField(term195124, term195124.getClass(), "focusListener", null);
        setField(term195124, term195124.getClass(), "hierarchyListener", null);
        setField(term195124, term195124.getClass(), "hierarchyBoundsListener", null);
        setField(term195124, term195124.getClass(), "keyListener", null);
        setField(term195124, term195124.getClass(), "mouseListener", null);
        setField(term195124, term195124.getClass(), "mouseMotionListener", null);
        setField(term195124, term195124.getClass(), "mouseWheelListener", null);
        setField(term195124, term195124.getClass(), "inputMethodListener", null);
        setLongField(term195124, term195124.getClass(), "eventMask", 0L);
        setField(term195124, term195124.getClass(), "changeSupport", null);
        setField(term195124, term195124.getClass(), "objectLock", null);
        setBooleanField(term195124, term195124.getClass(), "isPacked", false);
        setIntField(term195124, term195124.getClass(), "boundsOp", 0);
        setField(term195124, term195124.getClass(), "compoundShape", null);
        setField(term195124, term195124.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term195124, term195124.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term195124, term195124.getClass(), "backgroundEraseDisabled", false);
        setField(term195124, term195124.getClass(), "eventCache", null);
        setBooleanField(term195124, term195124.getClass(), "coalescingEnabled", false);
        setBooleanField(term195124, term195124.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term195124, term195124.getClass(), "componentSerializedDataVersion", 0);
        term195184 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term195184;
        callMethod(klass, "setVisible", argTypes, term195124, args);
    }

};


