package core.task.self;

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
import static core.task.self.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class AssignmentSelf_MemberExhibitor_appendNewMember_12245635122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151024;
     Object term151087;

    public AssignmentSelf_MemberExhibitor_appendNewMember_12245635122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151024 = newInstance(Class.forName("core.task.self.AssignmentSelf$MemberExhibitor"));
        setIntField(term151024, term151024.getClass(), "pX", 0);
        setIntField(term151024, term151024.getClass(), "pY", 0);
        setField(term151024, term151024.getClass(), "membersPanel", null);
        setField(term151024, term151024.getClass(), "memberAdder", null);
        setField(term151024, term151024.getClass(), "assignmentSelf", null);
        setIntField(term151024, term151024.getClass(), "defaultCloseOperation", 0);
        setField(term151024, term151024.getClass(), "rootPane", null);
        setBooleanField(term151024, term151024.getClass(), "rootPaneCheckingEnabled", false);
        setField(term151024, term151024.getClass(), "transferHandler", null);
        setField(term151024, term151024.getClass(), "accessibleContext", null);
        setBooleanField(term151024, term151024.getClass(), "resizable", false);
        setBooleanField(term151024, term151024.getClass(), "undecorated", false);
        setBooleanField(term151024, term151024.getClass(), "initialized", false);
        setBooleanField(term151024, term151024.getClass(), "modal", false);
        setField(term151024, term151024.getClass(), "modalityType", null);
        setField(term151024, term151024.getClass(), "blockedWindows", null);
        setField(term151024, term151024.getClass(), "title", null);
        setField(term151024, term151024.getClass(), "modalFilter", null);
        setField(term151024, term151024.getClass(), "secondaryLoop", null);
        setBooleanField(term151024, term151024.getClass(), "isInHide", false);
        setBooleanField(term151024, term151024.getClass(), "isInDispose", false);
        setField(term151024, term151024.getClass(), "warningString", null);
        setField(term151024, term151024.getClass(), "icons", null);
        setField(term151024, term151024.getClass(), "temporaryLostComponent", null);
        setBooleanField(term151024, term151024.getClass(), "syncLWRequests", false);
        setBooleanField(term151024, term151024.getClass(), "beforeFirstShow", false);
        setBooleanField(term151024, term151024.getClass(), "disposing", false);
        setField(term151024, term151024.getClass(), "disposerRecord", null);
        setIntField(term151024, term151024.getClass(), "state", 0);
        setBooleanField(term151024, term151024.getClass(), "alwaysOnTop", false);
        setField(term151024, term151024.getClass(), "ownedWindowList", null);
        setField(term151024, term151024.getClass(), "weakThis", null);
        setBooleanField(term151024, term151024.getClass(), "showWithParent", false);
        setField(term151024, term151024.getClass(), "modalBlocker", null);
        setField(term151024, term151024.getClass(), "modalExclusionType", null);
        setField(term151024, term151024.getClass(), "windowListener", null);
        setField(term151024, term151024.getClass(), "windowStateListener", null);
        setField(term151024, term151024.getClass(), "windowFocusListener", null);
        setField(term151024, term151024.getClass(), "inputContext", null);
        setField(term151024, term151024.getClass(), "inputContextLock", null);
        setField(term151024, term151024.getClass(), "focusMgr", null);
        setBooleanField(term151024, term151024.getClass(), "focusableWindowState", false);
        setBooleanField(term151024, term151024.getClass(), "autoRequestFocus", false);
        setBooleanField(term151024, term151024.getClass(), "isInShow", false);
        setFloatField(term151024, term151024.getClass(), "opacity", 0.0F);
        setField(term151024, term151024.getClass(), "shape", null);
        setBooleanField(term151024, term151024.getClass(), "isTrayIconWindow", false);
        setIntField(term151024, term151024.getClass(), "securityWarningWidth", 0);
        setIntField(term151024, term151024.getClass(), "securityWarningHeight", 0);
        setDoubleField(term151024, term151024.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term151024, term151024.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term151024, term151024.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term151024, term151024.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term151024, term151024.getClass(), "anchor", null);
        setField(term151024, term151024.getClass(), "type", null);
        setIntField(term151024, term151024.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term151024, term151024.getClass(), "locationByPlatform", false);
        setField(term151024, term151024.getClass(), "component", null);
        setField(term151024, term151024.getClass(), "layoutMgr", null);
        setField(term151024, term151024.getClass(), "dispatcher", null);
        setField(term151024, term151024.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term151024, term151024.getClass(), "focusCycleRoot", false);
        setBooleanField(term151024, term151024.getClass(), "focusTraversalPolicyProvider", false);
        setField(term151024, term151024.getClass(), "printingThreads", null);
        setBooleanField(term151024, term151024.getClass(), "printing", false);
        setField(term151024, term151024.getClass(), "containerListener", null);
        setIntField(term151024, term151024.getClass(), "listeningChildren", 0);
        setIntField(term151024, term151024.getClass(), "listeningBoundsChildren", 0);
        setIntField(term151024, term151024.getClass(), "descendantsCount", 0);
        setField(term151024, term151024.getClass(), "preserveBackgroundColor", null);
        setIntField(term151024, term151024.getClass(), "numOfHWComponents", 0);
        setIntField(term151024, term151024.getClass(), "numOfLWComponents", 0);
        setField(term151024, term151024.getClass(), "modalComp", null);
        setField(term151024, term151024.getClass(), "modalAppContext", null);
        setIntField(term151024, term151024.getClass(), "containerSerializedDataVersion", 0);
        setField(term151024, term151024.getClass(), "peer", null);
        setField(term151024, term151024.getClass(), "parent", null);
        setField(term151024, term151024.getClass(), "appContext", null);
        setIntField(term151024, term151024.getClass(), "x", 0);
        setIntField(term151024, term151024.getClass(), "y", 0);
        setIntField(term151024, term151024.getClass(), "width", 0);
        setIntField(term151024, term151024.getClass(), "height", 0);
        setField(term151024, term151024.getClass(), "foreground", null);
        setField(term151024, term151024.getClass(), "background", null);
        setField(term151024, term151024.getClass(), "font", null);
        setField(term151024, term151024.getClass(), "peerFont", null);
        setField(term151024, term151024.getClass(), "cursor", null);
        setField(term151024, term151024.getClass(), "locale", null);
        setField(term151024, term151024.getClass(), "graphicsConfig", null);
        setField(term151024, term151024.getClass(), "bufferStrategy", null);
        setBooleanField(term151024, term151024.getClass(), "ignoreRepaint", false);
        setBooleanField(term151024, term151024.getClass(), "visible", false);
        setBooleanField(term151024, term151024.getClass(), "enabled", false);
        setBooleanField(term151024, term151024.getClass(), "valid", false);
        setField(term151024, term151024.getClass(), "dropTarget", null);
        setField(term151024, term151024.getClass(), "popups", null);
        setField(term151024, term151024.getClass(), "name", null);
        setBooleanField(term151024, term151024.getClass(), "nameExplicitlySet", false);
        setBooleanField(term151024, term151024.getClass(), "focusable", false);
        setIntField(term151024, term151024.getClass(), "isFocusTraversableOverridden", 0);
        setField(term151024, term151024.getClass(), "focusTraversalKeys", null);
        setBooleanField(term151024, term151024.getClass(), "focusTraversalKeysEnabled", false);
        setField(term151024, term151024.getClass(), "acc", null);
        setField(term151024, term151024.getClass(), "minSize", null);
        setBooleanField(term151024, term151024.getClass(), "minSizeSet", false);
        setField(term151024, term151024.getClass(), "prefSize", null);
        setBooleanField(term151024, term151024.getClass(), "prefSizeSet", false);
        setField(term151024, term151024.getClass(), "maxSize", null);
        setBooleanField(term151024, term151024.getClass(), "maxSizeSet", false);
        setField(term151024, term151024.getClass(), "componentOrientation", null);
        setBooleanField(term151024, term151024.getClass(), "newEventsOnly", false);
        setField(term151024, term151024.getClass(), "componentListener", null);
        setField(term151024, term151024.getClass(), "focusListener", null);
        setField(term151024, term151024.getClass(), "hierarchyListener", null);
        setField(term151024, term151024.getClass(), "hierarchyBoundsListener", null);
        setField(term151024, term151024.getClass(), "keyListener", null);
        setField(term151024, term151024.getClass(), "mouseListener", null);
        setField(term151024, term151024.getClass(), "mouseMotionListener", null);
        setField(term151024, term151024.getClass(), "mouseWheelListener", null);
        setField(term151024, term151024.getClass(), "inputMethodListener", null);
        setLongField(term151024, term151024.getClass(), "eventMask", 0L);
        setField(term151024, term151024.getClass(), "changeSupport", null);
        setField(term151024, term151024.getClass(), "objectLock", null);
        setBooleanField(term151024, term151024.getClass(), "isPacked", false);
        setIntField(term151024, term151024.getClass(), "boundsOp", 0);
        setField(term151024, term151024.getClass(), "compoundShape", null);
        setField(term151024, term151024.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term151024, term151024.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term151024, term151024.getClass(), "backgroundEraseDisabled", false);
        setField(term151024, term151024.getClass(), "eventCache", null);
        setBooleanField(term151024, term151024.getClass(), "coalescingEnabled", false);
        setBooleanField(term151024, term151024.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term151024, term151024.getClass(), "componentSerializedDataVersion", 0);
        term151087 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$MemberExhibitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term151087;
        callMethod(klass, "appendNewMember", argTypes, term151024, args);
    }

};


