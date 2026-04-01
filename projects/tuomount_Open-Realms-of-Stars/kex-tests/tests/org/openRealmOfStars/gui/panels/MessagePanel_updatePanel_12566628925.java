package org.openRealmOfStars.gui.panels;

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
import static org.openRealmOfStars.gui.panels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class MessagePanel_updatePanel_12566628925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69102;
     Object term69144;
     Object term69146;
     Object term69148;

    public MessagePanel_updatePanel_12566628925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69102 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.MessagePanel"));
        setField(term69102, term69102.getClass(), "btnPrev", null);
        setField(term69102, term69102.getClass(), "btnNext", null);
        setField(term69102, term69102.getClass(), "btnFilter", null);
        setField(term69102, term69102.getClass(), "btnShowAll", null);
        setField(term69102, term69102.getClass(), "msgText", null);
        setField(term69102, term69102.getClass(), "countLabel", null);
        setField(term69102, term69102.getClass(), "titleLabel", null);
        setField(term69102, term69102.getClass(), "btnFocus", null);
        setBooleanField(term69102, term69102.getClass(), "showAll", false);
        setBooleanField(term69102, term69102.getClass(), "isAlignmentXSet", false);
        setFloatField(term69102, term69102.getClass(), "alignmentX", 0.0F);
        setBooleanField(term69102, term69102.getClass(), "isAlignmentYSet", false);
        setFloatField(term69102, term69102.getClass(), "alignmentY", 0.0F);
        setField(term69102, term69102.getClass(), "ui", null);
        setField(term69102, term69102.getClass(), "listenerList", null);
        setField(term69102, term69102.getClass(), "clientProperties", null);
        setField(term69102, term69102.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term69102, term69102.getClass(), "autoscrolls", false);
        setField(term69102, term69102.getClass(), "border", null);
        setIntField(term69102, term69102.getClass(), "flags", 0);
        setField(term69102, term69102.getClass(), "inputVerifier", null);
        setBooleanField(term69102, term69102.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term69102, term69102.getClass(), "paintingChild", null);
        setField(term69102, term69102.getClass(), "popupMenu", null);
        setField(term69102, term69102.getClass(), "revalidateRunnableScheduled", null);
        setField(term69102, term69102.getClass(), "focusInputMap", null);
        setField(term69102, term69102.getClass(), "ancestorInputMap", null);
        setField(term69102, term69102.getClass(), "windowInputMap", null);
        setField(term69102, term69102.getClass(), "actionMap", null);
        setField(term69102, term69102.getClass(), "aaHint", null);
        setField(term69102, term69102.getClass(), "lcdRenderingHint", null);
        setField(term69102, term69102.getClass(), "component", null);
        setField(term69102, term69102.getClass(), "layoutMgr", null);
        setField(term69102, term69102.getClass(), "dispatcher", null);
        setField(term69102, term69102.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term69102, term69102.getClass(), "focusCycleRoot", false);
        setBooleanField(term69102, term69102.getClass(), "focusTraversalPolicyProvider", false);
        setField(term69102, term69102.getClass(), "printingThreads", null);
        setBooleanField(term69102, term69102.getClass(), "printing", false);
        setField(term69102, term69102.getClass(), "containerListener", null);
        setIntField(term69102, term69102.getClass(), "listeningChildren", 0);
        setIntField(term69102, term69102.getClass(), "listeningBoundsChildren", 0);
        setIntField(term69102, term69102.getClass(), "descendantsCount", 0);
        setField(term69102, term69102.getClass(), "preserveBackgroundColor", null);
        setIntField(term69102, term69102.getClass(), "numOfHWComponents", 0);
        setIntField(term69102, term69102.getClass(), "numOfLWComponents", 0);
        setField(term69102, term69102.getClass(), "modalComp", null);
        setField(term69102, term69102.getClass(), "modalAppContext", null);
        setIntField(term69102, term69102.getClass(), "containerSerializedDataVersion", 0);
        setField(term69102, term69102.getClass(), "peer", null);
        setField(term69102, term69102.getClass(), "parent", null);
        setField(term69102, term69102.getClass(), "appContext", null);
        setIntField(term69102, term69102.getClass(), "x", 0);
        setIntField(term69102, term69102.getClass(), "y", 0);
        setIntField(term69102, term69102.getClass(), "width", 0);
        setIntField(term69102, term69102.getClass(), "height", 0);
        setField(term69102, term69102.getClass(), "foreground", null);
        setField(term69102, term69102.getClass(), "background", null);
        setField(term69102, term69102.getClass(), "font", null);
        setField(term69102, term69102.getClass(), "peerFont", null);
        setField(term69102, term69102.getClass(), "cursor", null);
        setField(term69102, term69102.getClass(), "locale", null);
        setField(term69102, term69102.getClass(), "graphicsConfig", null);
        setField(term69102, term69102.getClass(), "bufferStrategy", null);
        setBooleanField(term69102, term69102.getClass(), "ignoreRepaint", false);
        setBooleanField(term69102, term69102.getClass(), "visible", false);
        setBooleanField(term69102, term69102.getClass(), "enabled", false);
        setBooleanField(term69102, term69102.getClass(), "valid", false);
        setField(term69102, term69102.getClass(), "dropTarget", null);
        setField(term69102, term69102.getClass(), "popups", null);
        setField(term69102, term69102.getClass(), "name", null);
        setBooleanField(term69102, term69102.getClass(), "nameExplicitlySet", false);
        setBooleanField(term69102, term69102.getClass(), "focusable", false);
        setIntField(term69102, term69102.getClass(), "isFocusTraversableOverridden", 0);
        setField(term69102, term69102.getClass(), "focusTraversalKeys", null);
        setBooleanField(term69102, term69102.getClass(), "focusTraversalKeysEnabled", false);
        setField(term69102, term69102.getClass(), "acc", null);
        setField(term69102, term69102.getClass(), "minSize", null);
        setBooleanField(term69102, term69102.getClass(), "minSizeSet", false);
        setField(term69102, term69102.getClass(), "prefSize", null);
        setBooleanField(term69102, term69102.getClass(), "prefSizeSet", false);
        setField(term69102, term69102.getClass(), "maxSize", null);
        setBooleanField(term69102, term69102.getClass(), "maxSizeSet", false);
        setField(term69102, term69102.getClass(), "componentOrientation", null);
        setBooleanField(term69102, term69102.getClass(), "newEventsOnly", false);
        setField(term69102, term69102.getClass(), "componentListener", null);
        setField(term69102, term69102.getClass(), "focusListener", null);
        setField(term69102, term69102.getClass(), "hierarchyListener", null);
        setField(term69102, term69102.getClass(), "hierarchyBoundsListener", null);
        setField(term69102, term69102.getClass(), "keyListener", null);
        setField(term69102, term69102.getClass(), "mouseListener", null);
        setField(term69102, term69102.getClass(), "mouseMotionListener", null);
        setField(term69102, term69102.getClass(), "mouseWheelListener", null);
        setField(term69102, term69102.getClass(), "inputMethodListener", null);
        setLongField(term69102, term69102.getClass(), "eventMask", 0L);
        setField(term69102, term69102.getClass(), "changeSupport", null);
        setField(term69102, term69102.getClass(), "objectLock", null);
        setBooleanField(term69102, term69102.getClass(), "isPacked", false);
        setIntField(term69102, term69102.getClass(), "boundsOp", 0);
        setField(term69102, term69102.getClass(), "compoundShape", null);
        setField(term69102, term69102.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term69102, term69102.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term69102, term69102.getClass(), "backgroundEraseDisabled", false);
        setField(term69102, term69102.getClass(), "eventCache", null);
        setBooleanField(term69102, term69102.getClass(), "coalescingEnabled", false);
        setBooleanField(term69102, term69102.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term69102, term69102.getClass(), "componentSerializedDataVersion", 0);
        setField(term69102, term69102.getClass(), "accessibleContext", null);
        term69144 = new Integer(0);
        term69146 = new Integer(0);
        term69148 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.MessagePanel");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.message.Message");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term69144;
        args[2] = term69146;
        args[3] = term69148;
        callMethod(klass, "updatePanel", argTypes, term69102, args);
    }

};


