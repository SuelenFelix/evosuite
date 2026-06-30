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
     Object term195138;
     Object term195198;

    public Board_setVisible_206098775910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195138 = newInstance(Class.forName("core.Board"));
        setField(term195138, term195138.getClass(), "contentPanel", null);
        setField(term195138, term195138.getClass(), "bodyLayer", null);
        setField(term195138, term195138.getClass(), "cardLayout", null);
        setField(term195138, term195138.getClass(), "semesterActivity", null);
        setField(term195138, term195138.getClass(), "moduleActivity", null);
        setField(term195138, term195138.getClass(), "settingsUI", null);
        setField(term195138, term195138.getClass(), "transcriptActivity", null);
        setField(term195138, term195138.getClass(), "analysisActivity", null);
        setField(term195138, term195138.getClass(), "helpActivity", null);
        setField(term195138, term195138.getClass(), "about", null);
        setField(term195138, term195138.getClass(), "taskActivity", null);
        setField(term195138, term195138.getClass(), "newsPresent", null);
        setField(term195138, term195138.getClass(), "alertActivity", null);
        setIntField(term195138, term195138.getClass(), "defaultCloseOperation", 0);
        setField(term195138, term195138.getClass(), "transferHandler", null);
        setField(term195138, term195138.getClass(), "rootPane", null);
        setBooleanField(term195138, term195138.getClass(), "rootPaneCheckingEnabled", false);
        setField(term195138, term195138.getClass(), "accessibleContext", null);
        setField(term195138, term195138.getClass(), "maximizedBounds", null);
        setField(term195138, term195138.getClass(), "title", null);
        setField(term195138, term195138.getClass(), "menuBar", null);
        setBooleanField(term195138, term195138.getClass(), "resizable", false);
        setBooleanField(term195138, term195138.getClass(), "undecorated", false);
        setBooleanField(term195138, term195138.getClass(), "mbManagement", false);
        setIntField(term195138, term195138.getClass(), "state", 0);
        setField(term195138, term195138.getClass(), "ownedWindows", null);
        setIntField(term195138, term195138.getClass(), "frameSerializedDataVersion", 0);
        setField(term195138, term195138.getClass(), "warningString", null);
        setField(term195138, term195138.getClass(), "icons", null);
        setField(term195138, term195138.getClass(), "temporaryLostComponent", null);
        setBooleanField(term195138, term195138.getClass(), "syncLWRequests", false);
        setBooleanField(term195138, term195138.getClass(), "beforeFirstShow", false);
        setBooleanField(term195138, term195138.getClass(), "disposing", false);
        setField(term195138, term195138.getClass(), "disposerRecord", null);
        setBooleanField(term195138, term195138.getClass(), "alwaysOnTop", false);
        setField(term195138, term195138.getClass(), "ownedWindowList", null);
        setField(term195138, term195138.getClass(), "weakThis", null);
        setBooleanField(term195138, term195138.getClass(), "showWithParent", false);
        setField(term195138, term195138.getClass(), "modalBlocker", null);
        setField(term195138, term195138.getClass(), "modalExclusionType", null);
        setField(term195138, term195138.getClass(), "windowListener", null);
        setField(term195138, term195138.getClass(), "windowStateListener", null);
        setField(term195138, term195138.getClass(), "windowFocusListener", null);
        setField(term195138, term195138.getClass(), "inputContext", null);
        setField(term195138, term195138.getClass(), "inputContextLock", null);
        setField(term195138, term195138.getClass(), "focusMgr", null);
        setBooleanField(term195138, term195138.getClass(), "focusableWindowState", false);
        setBooleanField(term195138, term195138.getClass(), "autoRequestFocus", false);
        setBooleanField(term195138, term195138.getClass(), "isInShow", false);
        setFloatField(term195138, term195138.getClass(), "opacity", 0.0F);
        setField(term195138, term195138.getClass(), "shape", null);
        setBooleanField(term195138, term195138.getClass(), "isTrayIconWindow", false);
        setIntField(term195138, term195138.getClass(), "securityWarningWidth", 0);
        setIntField(term195138, term195138.getClass(), "securityWarningHeight", 0);
        setDoubleField(term195138, term195138.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term195138, term195138.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term195138, term195138.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term195138, term195138.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term195138, term195138.getClass(), "anchor", null);
        setField(term195138, term195138.getClass(), "type", null);
        setIntField(term195138, term195138.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term195138, term195138.getClass(), "locationByPlatform", false);
        setField(term195138, term195138.getClass(), "component", null);
        setField(term195138, term195138.getClass(), "layoutMgr", null);
        setField(term195138, term195138.getClass(), "dispatcher", null);
        setField(term195138, term195138.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term195138, term195138.getClass(), "focusCycleRoot", false);
        setBooleanField(term195138, term195138.getClass(), "focusTraversalPolicyProvider", false);
        setField(term195138, term195138.getClass(), "printingThreads", null);
        setBooleanField(term195138, term195138.getClass(), "printing", false);
        setField(term195138, term195138.getClass(), "containerListener", null);
        setIntField(term195138, term195138.getClass(), "listeningChildren", 0);
        setIntField(term195138, term195138.getClass(), "listeningBoundsChildren", 0);
        setIntField(term195138, term195138.getClass(), "descendantsCount", 0);
        setField(term195138, term195138.getClass(), "preserveBackgroundColor", null);
        setIntField(term195138, term195138.getClass(), "numOfHWComponents", 0);
        setIntField(term195138, term195138.getClass(), "numOfLWComponents", 0);
        setField(term195138, term195138.getClass(), "modalComp", null);
        setField(term195138, term195138.getClass(), "modalAppContext", null);
        setIntField(term195138, term195138.getClass(), "containerSerializedDataVersion", 0);
        setField(term195138, term195138.getClass(), "peer", null);
        setField(term195138, term195138.getClass(), "parent", null);
        setField(term195138, term195138.getClass(), "appContext", null);
        setIntField(term195138, term195138.getClass(), "x", 0);
        setIntField(term195138, term195138.getClass(), "y", 0);
        setIntField(term195138, term195138.getClass(), "width", 0);
        setIntField(term195138, term195138.getClass(), "height", 0);
        setField(term195138, term195138.getClass(), "foreground", null);
        setField(term195138, term195138.getClass(), "background", null);
        setField(term195138, term195138.getClass(), "font", null);
        setField(term195138, term195138.getClass(), "peerFont", null);
        setField(term195138, term195138.getClass(), "cursor", null);
        setField(term195138, term195138.getClass(), "locale", null);
        setField(term195138, term195138.getClass(), "graphicsConfig", null);
        setField(term195138, term195138.getClass(), "bufferStrategy", null);
        setBooleanField(term195138, term195138.getClass(), "ignoreRepaint", false);
        setBooleanField(term195138, term195138.getClass(), "visible", false);
        setBooleanField(term195138, term195138.getClass(), "enabled", false);
        setBooleanField(term195138, term195138.getClass(), "valid", false);
        setField(term195138, term195138.getClass(), "dropTarget", null);
        setField(term195138, term195138.getClass(), "popups", null);
        setField(term195138, term195138.getClass(), "name", null);
        setBooleanField(term195138, term195138.getClass(), "nameExplicitlySet", false);
        setBooleanField(term195138, term195138.getClass(), "focusable", false);
        setIntField(term195138, term195138.getClass(), "isFocusTraversableOverridden", 0);
        setField(term195138, term195138.getClass(), "focusTraversalKeys", null);
        setBooleanField(term195138, term195138.getClass(), "focusTraversalKeysEnabled", false);
        setField(term195138, term195138.getClass(), "acc", null);
        setField(term195138, term195138.getClass(), "minSize", null);
        setBooleanField(term195138, term195138.getClass(), "minSizeSet", false);
        setField(term195138, term195138.getClass(), "prefSize", null);
        setBooleanField(term195138, term195138.getClass(), "prefSizeSet", false);
        setField(term195138, term195138.getClass(), "maxSize", null);
        setBooleanField(term195138, term195138.getClass(), "maxSizeSet", false);
        setField(term195138, term195138.getClass(), "componentOrientation", null);
        setBooleanField(term195138, term195138.getClass(), "newEventsOnly", false);
        setField(term195138, term195138.getClass(), "componentListener", null);
        setField(term195138, term195138.getClass(), "focusListener", null);
        setField(term195138, term195138.getClass(), "hierarchyListener", null);
        setField(term195138, term195138.getClass(), "hierarchyBoundsListener", null);
        setField(term195138, term195138.getClass(), "keyListener", null);
        setField(term195138, term195138.getClass(), "mouseListener", null);
        setField(term195138, term195138.getClass(), "mouseMotionListener", null);
        setField(term195138, term195138.getClass(), "mouseWheelListener", null);
        setField(term195138, term195138.getClass(), "inputMethodListener", null);
        setLongField(term195138, term195138.getClass(), "eventMask", 0L);
        setField(term195138, term195138.getClass(), "changeSupport", null);
        setField(term195138, term195138.getClass(), "objectLock", null);
        setBooleanField(term195138, term195138.getClass(), "isPacked", false);
        setIntField(term195138, term195138.getClass(), "boundsOp", 0);
        setField(term195138, term195138.getClass(), "compoundShape", null);
        setField(term195138, term195138.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term195138, term195138.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term195138, term195138.getClass(), "backgroundEraseDisabled", false);
        setField(term195138, term195138.getClass(), "eventCache", null);
        setBooleanField(term195138, term195138.getClass(), "coalescingEnabled", false);
        setBooleanField(term195138, term195138.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term195138, term195138.getClass(), "componentSerializedDataVersion", 0);
        term195198 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term195198;
        callMethod(klass, "setVisible", argTypes, term195138, args);
    }

};


