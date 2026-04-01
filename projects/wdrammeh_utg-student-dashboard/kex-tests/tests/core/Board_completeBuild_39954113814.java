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

public class Board_completeBuild_39954113814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197126;

    public Board_completeBuild_39954113814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197126 = newInstance(Class.forName("core.Board"));
        setField(term197126, term197126.getClass(), "contentPanel", null);
        setField(term197126, term197126.getClass(), "bodyLayer", null);
        setField(term197126, term197126.getClass(), "cardLayout", null);
        setField(term197126, term197126.getClass(), "semesterActivity", null);
        setField(term197126, term197126.getClass(), "moduleActivity", null);
        setField(term197126, term197126.getClass(), "settingsUI", null);
        setField(term197126, term197126.getClass(), "transcriptActivity", null);
        setField(term197126, term197126.getClass(), "analysisActivity", null);
        setField(term197126, term197126.getClass(), "helpActivity", null);
        setField(term197126, term197126.getClass(), "about", null);
        setField(term197126, term197126.getClass(), "taskActivity", null);
        setField(term197126, term197126.getClass(), "newsPresent", null);
        setField(term197126, term197126.getClass(), "alertActivity", null);
        setIntField(term197126, term197126.getClass(), "defaultCloseOperation", 0);
        setField(term197126, term197126.getClass(), "transferHandler", null);
        setField(term197126, term197126.getClass(), "rootPane", null);
        setBooleanField(term197126, term197126.getClass(), "rootPaneCheckingEnabled", false);
        setField(term197126, term197126.getClass(), "accessibleContext", null);
        setField(term197126, term197126.getClass(), "maximizedBounds", null);
        setField(term197126, term197126.getClass(), "title", null);
        setField(term197126, term197126.getClass(), "menuBar", null);
        setBooleanField(term197126, term197126.getClass(), "resizable", false);
        setBooleanField(term197126, term197126.getClass(), "undecorated", false);
        setBooleanField(term197126, term197126.getClass(), "mbManagement", false);
        setIntField(term197126, term197126.getClass(), "state", 0);
        setField(term197126, term197126.getClass(), "ownedWindows", null);
        setIntField(term197126, term197126.getClass(), "frameSerializedDataVersion", 0);
        setField(term197126, term197126.getClass(), "warningString", null);
        setField(term197126, term197126.getClass(), "icons", null);
        setField(term197126, term197126.getClass(), "temporaryLostComponent", null);
        setBooleanField(term197126, term197126.getClass(), "syncLWRequests", false);
        setBooleanField(term197126, term197126.getClass(), "beforeFirstShow", false);
        setBooleanField(term197126, term197126.getClass(), "disposing", false);
        setField(term197126, term197126.getClass(), "disposerRecord", null);
        setBooleanField(term197126, term197126.getClass(), "alwaysOnTop", false);
        setField(term197126, term197126.getClass(), "ownedWindowList", null);
        setField(term197126, term197126.getClass(), "weakThis", null);
        setBooleanField(term197126, term197126.getClass(), "showWithParent", false);
        setField(term197126, term197126.getClass(), "modalBlocker", null);
        setField(term197126, term197126.getClass(), "modalExclusionType", null);
        setField(term197126, term197126.getClass(), "windowListener", null);
        setField(term197126, term197126.getClass(), "windowStateListener", null);
        setField(term197126, term197126.getClass(), "windowFocusListener", null);
        setField(term197126, term197126.getClass(), "inputContext", null);
        setField(term197126, term197126.getClass(), "inputContextLock", null);
        setField(term197126, term197126.getClass(), "focusMgr", null);
        setBooleanField(term197126, term197126.getClass(), "focusableWindowState", false);
        setBooleanField(term197126, term197126.getClass(), "autoRequestFocus", false);
        setBooleanField(term197126, term197126.getClass(), "isInShow", false);
        setFloatField(term197126, term197126.getClass(), "opacity", 0.0F);
        setField(term197126, term197126.getClass(), "shape", null);
        setBooleanField(term197126, term197126.getClass(), "isTrayIconWindow", false);
        setIntField(term197126, term197126.getClass(), "securityWarningWidth", 0);
        setIntField(term197126, term197126.getClass(), "securityWarningHeight", 0);
        setDoubleField(term197126, term197126.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term197126, term197126.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term197126, term197126.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term197126, term197126.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term197126, term197126.getClass(), "anchor", null);
        setField(term197126, term197126.getClass(), "type", null);
        setIntField(term197126, term197126.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term197126, term197126.getClass(), "locationByPlatform", false);
        setField(term197126, term197126.getClass(), "component", null);
        setField(term197126, term197126.getClass(), "layoutMgr", null);
        setField(term197126, term197126.getClass(), "dispatcher", null);
        setField(term197126, term197126.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term197126, term197126.getClass(), "focusCycleRoot", false);
        setBooleanField(term197126, term197126.getClass(), "focusTraversalPolicyProvider", false);
        setField(term197126, term197126.getClass(), "printingThreads", null);
        setBooleanField(term197126, term197126.getClass(), "printing", false);
        setField(term197126, term197126.getClass(), "containerListener", null);
        setIntField(term197126, term197126.getClass(), "listeningChildren", 0);
        setIntField(term197126, term197126.getClass(), "listeningBoundsChildren", 0);
        setIntField(term197126, term197126.getClass(), "descendantsCount", 0);
        setField(term197126, term197126.getClass(), "preserveBackgroundColor", null);
        setIntField(term197126, term197126.getClass(), "numOfHWComponents", 0);
        setIntField(term197126, term197126.getClass(), "numOfLWComponents", 0);
        setField(term197126, term197126.getClass(), "modalComp", null);
        setField(term197126, term197126.getClass(), "modalAppContext", null);
        setIntField(term197126, term197126.getClass(), "containerSerializedDataVersion", 0);
        setField(term197126, term197126.getClass(), "peer", null);
        setField(term197126, term197126.getClass(), "parent", null);
        setField(term197126, term197126.getClass(), "appContext", null);
        setIntField(term197126, term197126.getClass(), "x", 0);
        setIntField(term197126, term197126.getClass(), "y", 0);
        setIntField(term197126, term197126.getClass(), "width", 0);
        setIntField(term197126, term197126.getClass(), "height", 0);
        setField(term197126, term197126.getClass(), "foreground", null);
        setField(term197126, term197126.getClass(), "background", null);
        setField(term197126, term197126.getClass(), "font", null);
        setField(term197126, term197126.getClass(), "peerFont", null);
        setField(term197126, term197126.getClass(), "cursor", null);
        setField(term197126, term197126.getClass(), "locale", null);
        setField(term197126, term197126.getClass(), "graphicsConfig", null);
        setField(term197126, term197126.getClass(), "bufferStrategy", null);
        setBooleanField(term197126, term197126.getClass(), "ignoreRepaint", false);
        setBooleanField(term197126, term197126.getClass(), "visible", false);
        setBooleanField(term197126, term197126.getClass(), "enabled", false);
        setBooleanField(term197126, term197126.getClass(), "valid", false);
        setField(term197126, term197126.getClass(), "dropTarget", null);
        setField(term197126, term197126.getClass(), "popups", null);
        setField(term197126, term197126.getClass(), "name", null);
        setBooleanField(term197126, term197126.getClass(), "nameExplicitlySet", false);
        setBooleanField(term197126, term197126.getClass(), "focusable", false);
        setIntField(term197126, term197126.getClass(), "isFocusTraversableOverridden", 0);
        setField(term197126, term197126.getClass(), "focusTraversalKeys", null);
        setBooleanField(term197126, term197126.getClass(), "focusTraversalKeysEnabled", false);
        setField(term197126, term197126.getClass(), "acc", null);
        setField(term197126, term197126.getClass(), "minSize", null);
        setBooleanField(term197126, term197126.getClass(), "minSizeSet", false);
        setField(term197126, term197126.getClass(), "prefSize", null);
        setBooleanField(term197126, term197126.getClass(), "prefSizeSet", false);
        setField(term197126, term197126.getClass(), "maxSize", null);
        setBooleanField(term197126, term197126.getClass(), "maxSizeSet", false);
        setField(term197126, term197126.getClass(), "componentOrientation", null);
        setBooleanField(term197126, term197126.getClass(), "newEventsOnly", false);
        setField(term197126, term197126.getClass(), "componentListener", null);
        setField(term197126, term197126.getClass(), "focusListener", null);
        setField(term197126, term197126.getClass(), "hierarchyListener", null);
        setField(term197126, term197126.getClass(), "hierarchyBoundsListener", null);
        setField(term197126, term197126.getClass(), "keyListener", null);
        setField(term197126, term197126.getClass(), "mouseListener", null);
        setField(term197126, term197126.getClass(), "mouseMotionListener", null);
        setField(term197126, term197126.getClass(), "mouseWheelListener", null);
        setField(term197126, term197126.getClass(), "inputMethodListener", null);
        setLongField(term197126, term197126.getClass(), "eventMask", 0L);
        setField(term197126, term197126.getClass(), "changeSupport", null);
        setField(term197126, term197126.getClass(), "objectLock", null);
        setBooleanField(term197126, term197126.getClass(), "isPacked", false);
        setIntField(term197126, term197126.getClass(), "boundsOp", 0);
        setField(term197126, term197126.getClass(), "compoundShape", null);
        setField(term197126, term197126.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term197126, term197126.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term197126, term197126.getClass(), "backgroundEraseDisabled", false);
        setField(term197126, term197126.getClass(), "eventCache", null);
        setBooleanField(term197126, term197126.getClass(), "coalescingEnabled", false);
        setBooleanField(term197126, term197126.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term197126, term197126.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "completeBuild", argTypes, term197126, args);
    }

};


