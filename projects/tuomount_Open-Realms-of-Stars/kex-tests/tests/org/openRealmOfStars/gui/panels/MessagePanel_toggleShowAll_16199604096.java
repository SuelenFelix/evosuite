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

public class MessagePanel_toggleShowAll_16199604096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69150;

    public MessagePanel_toggleShowAll_16199604096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69150 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.MessagePanel"));
        setField(term69150, term69150.getClass(), "btnPrev", null);
        setField(term69150, term69150.getClass(), "btnNext", null);
        setField(term69150, term69150.getClass(), "btnFilter", null);
        setField(term69150, term69150.getClass(), "btnShowAll", null);
        setField(term69150, term69150.getClass(), "msgText", null);
        setField(term69150, term69150.getClass(), "countLabel", null);
        setField(term69150, term69150.getClass(), "titleLabel", null);
        setField(term69150, term69150.getClass(), "btnFocus", null);
        setBooleanField(term69150, term69150.getClass(), "showAll", false);
        setBooleanField(term69150, term69150.getClass(), "isAlignmentXSet", false);
        setFloatField(term69150, term69150.getClass(), "alignmentX", 0.0F);
        setBooleanField(term69150, term69150.getClass(), "isAlignmentYSet", false);
        setFloatField(term69150, term69150.getClass(), "alignmentY", 0.0F);
        setField(term69150, term69150.getClass(), "ui", null);
        setField(term69150, term69150.getClass(), "listenerList", null);
        setField(term69150, term69150.getClass(), "clientProperties", null);
        setField(term69150, term69150.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term69150, term69150.getClass(), "autoscrolls", false);
        setField(term69150, term69150.getClass(), "border", null);
        setIntField(term69150, term69150.getClass(), "flags", 0);
        setField(term69150, term69150.getClass(), "inputVerifier", null);
        setBooleanField(term69150, term69150.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term69150, term69150.getClass(), "paintingChild", null);
        setField(term69150, term69150.getClass(), "popupMenu", null);
        setField(term69150, term69150.getClass(), "revalidateRunnableScheduled", null);
        setField(term69150, term69150.getClass(), "focusInputMap", null);
        setField(term69150, term69150.getClass(), "ancestorInputMap", null);
        setField(term69150, term69150.getClass(), "windowInputMap", null);
        setField(term69150, term69150.getClass(), "actionMap", null);
        setField(term69150, term69150.getClass(), "aaHint", null);
        setField(term69150, term69150.getClass(), "lcdRenderingHint", null);
        setField(term69150, term69150.getClass(), "component", null);
        setField(term69150, term69150.getClass(), "layoutMgr", null);
        setField(term69150, term69150.getClass(), "dispatcher", null);
        setField(term69150, term69150.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term69150, term69150.getClass(), "focusCycleRoot", false);
        setBooleanField(term69150, term69150.getClass(), "focusTraversalPolicyProvider", false);
        setField(term69150, term69150.getClass(), "printingThreads", null);
        setBooleanField(term69150, term69150.getClass(), "printing", false);
        setField(term69150, term69150.getClass(), "containerListener", null);
        setIntField(term69150, term69150.getClass(), "listeningChildren", 0);
        setIntField(term69150, term69150.getClass(), "listeningBoundsChildren", 0);
        setIntField(term69150, term69150.getClass(), "descendantsCount", 0);
        setField(term69150, term69150.getClass(), "preserveBackgroundColor", null);
        setIntField(term69150, term69150.getClass(), "numOfHWComponents", 0);
        setIntField(term69150, term69150.getClass(), "numOfLWComponents", 0);
        setField(term69150, term69150.getClass(), "modalComp", null);
        setField(term69150, term69150.getClass(), "modalAppContext", null);
        setIntField(term69150, term69150.getClass(), "containerSerializedDataVersion", 0);
        setField(term69150, term69150.getClass(), "peer", null);
        setField(term69150, term69150.getClass(), "parent", null);
        setField(term69150, term69150.getClass(), "appContext", null);
        setIntField(term69150, term69150.getClass(), "x", 0);
        setIntField(term69150, term69150.getClass(), "y", 0);
        setIntField(term69150, term69150.getClass(), "width", 0);
        setIntField(term69150, term69150.getClass(), "height", 0);
        setField(term69150, term69150.getClass(), "foreground", null);
        setField(term69150, term69150.getClass(), "background", null);
        setField(term69150, term69150.getClass(), "font", null);
        setField(term69150, term69150.getClass(), "peerFont", null);
        setField(term69150, term69150.getClass(), "cursor", null);
        setField(term69150, term69150.getClass(), "locale", null);
        setField(term69150, term69150.getClass(), "graphicsConfig", null);
        setField(term69150, term69150.getClass(), "bufferStrategy", null);
        setBooleanField(term69150, term69150.getClass(), "ignoreRepaint", false);
        setBooleanField(term69150, term69150.getClass(), "visible", false);
        setBooleanField(term69150, term69150.getClass(), "enabled", false);
        setBooleanField(term69150, term69150.getClass(), "valid", false);
        setField(term69150, term69150.getClass(), "dropTarget", null);
        setField(term69150, term69150.getClass(), "popups", null);
        setField(term69150, term69150.getClass(), "name", null);
        setBooleanField(term69150, term69150.getClass(), "nameExplicitlySet", false);
        setBooleanField(term69150, term69150.getClass(), "focusable", false);
        setIntField(term69150, term69150.getClass(), "isFocusTraversableOverridden", 0);
        setField(term69150, term69150.getClass(), "focusTraversalKeys", null);
        setBooleanField(term69150, term69150.getClass(), "focusTraversalKeysEnabled", false);
        setField(term69150, term69150.getClass(), "acc", null);
        setField(term69150, term69150.getClass(), "minSize", null);
        setBooleanField(term69150, term69150.getClass(), "minSizeSet", false);
        setField(term69150, term69150.getClass(), "prefSize", null);
        setBooleanField(term69150, term69150.getClass(), "prefSizeSet", false);
        setField(term69150, term69150.getClass(), "maxSize", null);
        setBooleanField(term69150, term69150.getClass(), "maxSizeSet", false);
        setField(term69150, term69150.getClass(), "componentOrientation", null);
        setBooleanField(term69150, term69150.getClass(), "newEventsOnly", false);
        setField(term69150, term69150.getClass(), "componentListener", null);
        setField(term69150, term69150.getClass(), "focusListener", null);
        setField(term69150, term69150.getClass(), "hierarchyListener", null);
        setField(term69150, term69150.getClass(), "hierarchyBoundsListener", null);
        setField(term69150, term69150.getClass(), "keyListener", null);
        setField(term69150, term69150.getClass(), "mouseListener", null);
        setField(term69150, term69150.getClass(), "mouseMotionListener", null);
        setField(term69150, term69150.getClass(), "mouseWheelListener", null);
        setField(term69150, term69150.getClass(), "inputMethodListener", null);
        setLongField(term69150, term69150.getClass(), "eventMask", 0L);
        setField(term69150, term69150.getClass(), "changeSupport", null);
        setField(term69150, term69150.getClass(), "objectLock", null);
        setBooleanField(term69150, term69150.getClass(), "isPacked", false);
        setIntField(term69150, term69150.getClass(), "boundsOp", 0);
        setField(term69150, term69150.getClass(), "compoundShape", null);
        setField(term69150, term69150.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term69150, term69150.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term69150, term69150.getClass(), "backgroundEraseDisabled", false);
        setField(term69150, term69150.getClass(), "eventCache", null);
        setBooleanField(term69150, term69150.getClass(), "coalescingEnabled", false);
        setBooleanField(term69150, term69150.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term69150, term69150.getClass(), "componentSerializedDataVersion", 0);
        setField(term69150, term69150.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.MessagePanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toggleShowAll", argTypes, term69150, args);
    }

};


