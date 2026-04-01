package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IntelligenceView_updatePanel_3758884307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691984;

    public IntelligenceView_updatePanel_3758884307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term691984 = newInstance(Class.forName("org.openRealmOfStars.game.state.IntelligenceView"));
        setField(term691984, term691984.getClass(), "player", null);
        setField(term691984, term691984.getClass(), "fakeMilitarySlider", null);
        setField(term691984, term691984.getClass(), "fakeMilitaryText", null);
        setIntField(term691984, term691984.getClass(), "humanNewsMilitarySize", 0);
        setBooleanField(term691984, term691984.getClass(), "isAlignmentXSet", false);
        setFloatField(term691984, term691984.getClass(), "alignmentX", 0.0F);
        setBooleanField(term691984, term691984.getClass(), "isAlignmentYSet", false);
        setFloatField(term691984, term691984.getClass(), "alignmentY", 0.0F);
        setField(term691984, term691984.getClass(), "ui", null);
        setField(term691984, term691984.getClass(), "listenerList", null);
        setField(term691984, term691984.getClass(), "clientProperties", null);
        setField(term691984, term691984.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term691984, term691984.getClass(), "autoscrolls", false);
        setField(term691984, term691984.getClass(), "border", null);
        setIntField(term691984, term691984.getClass(), "flags", 0);
        setField(term691984, term691984.getClass(), "inputVerifier", null);
        setBooleanField(term691984, term691984.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term691984, term691984.getClass(), "paintingChild", null);
        setField(term691984, term691984.getClass(), "popupMenu", null);
        setField(term691984, term691984.getClass(), "revalidateRunnableScheduled", null);
        setField(term691984, term691984.getClass(), "focusInputMap", null);
        setField(term691984, term691984.getClass(), "ancestorInputMap", null);
        setField(term691984, term691984.getClass(), "windowInputMap", null);
        setField(term691984, term691984.getClass(), "actionMap", null);
        setField(term691984, term691984.getClass(), "aaHint", null);
        setField(term691984, term691984.getClass(), "lcdRenderingHint", null);
        setField(term691984, term691984.getClass(), "component", null);
        setField(term691984, term691984.getClass(), "layoutMgr", null);
        setField(term691984, term691984.getClass(), "dispatcher", null);
        setField(term691984, term691984.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term691984, term691984.getClass(), "focusCycleRoot", false);
        setBooleanField(term691984, term691984.getClass(), "focusTraversalPolicyProvider", false);
        setField(term691984, term691984.getClass(), "printingThreads", null);
        setBooleanField(term691984, term691984.getClass(), "printing", false);
        setField(term691984, term691984.getClass(), "containerListener", null);
        setIntField(term691984, term691984.getClass(), "listeningChildren", 0);
        setIntField(term691984, term691984.getClass(), "listeningBoundsChildren", 0);
        setIntField(term691984, term691984.getClass(), "descendantsCount", 0);
        setField(term691984, term691984.getClass(), "preserveBackgroundColor", null);
        setIntField(term691984, term691984.getClass(), "numOfHWComponents", 0);
        setIntField(term691984, term691984.getClass(), "numOfLWComponents", 0);
        setField(term691984, term691984.getClass(), "modalComp", null);
        setField(term691984, term691984.getClass(), "modalAppContext", null);
        setIntField(term691984, term691984.getClass(), "containerSerializedDataVersion", 0);
        setField(term691984, term691984.getClass(), "peer", null);
        setField(term691984, term691984.getClass(), "parent", null);
        setField(term691984, term691984.getClass(), "appContext", null);
        setIntField(term691984, term691984.getClass(), "x", 0);
        setIntField(term691984, term691984.getClass(), "y", 0);
        setIntField(term691984, term691984.getClass(), "width", 0);
        setIntField(term691984, term691984.getClass(), "height", 0);
        setField(term691984, term691984.getClass(), "foreground", null);
        setField(term691984, term691984.getClass(), "background", null);
        setField(term691984, term691984.getClass(), "font", null);
        setField(term691984, term691984.getClass(), "peerFont", null);
        setField(term691984, term691984.getClass(), "cursor", null);
        setField(term691984, term691984.getClass(), "locale", null);
        setField(term691984, term691984.getClass(), "graphicsConfig", null);
        setField(term691984, term691984.getClass(), "bufferStrategy", null);
        setBooleanField(term691984, term691984.getClass(), "ignoreRepaint", false);
        setBooleanField(term691984, term691984.getClass(), "visible", false);
        setBooleanField(term691984, term691984.getClass(), "enabled", false);
        setBooleanField(term691984, term691984.getClass(), "valid", false);
        setField(term691984, term691984.getClass(), "dropTarget", null);
        setField(term691984, term691984.getClass(), "popups", null);
        setField(term691984, term691984.getClass(), "name", null);
        setBooleanField(term691984, term691984.getClass(), "nameExplicitlySet", false);
        setBooleanField(term691984, term691984.getClass(), "focusable", false);
        setIntField(term691984, term691984.getClass(), "isFocusTraversableOverridden", 0);
        setField(term691984, term691984.getClass(), "focusTraversalKeys", null);
        setBooleanField(term691984, term691984.getClass(), "focusTraversalKeysEnabled", false);
        setField(term691984, term691984.getClass(), "acc", null);
        setField(term691984, term691984.getClass(), "minSize", null);
        setBooleanField(term691984, term691984.getClass(), "minSizeSet", false);
        setField(term691984, term691984.getClass(), "prefSize", null);
        setBooleanField(term691984, term691984.getClass(), "prefSizeSet", false);
        setField(term691984, term691984.getClass(), "maxSize", null);
        setBooleanField(term691984, term691984.getClass(), "maxSizeSet", false);
        setField(term691984, term691984.getClass(), "componentOrientation", null);
        setBooleanField(term691984, term691984.getClass(), "newEventsOnly", false);
        setField(term691984, term691984.getClass(), "componentListener", null);
        setField(term691984, term691984.getClass(), "focusListener", null);
        setField(term691984, term691984.getClass(), "hierarchyListener", null);
        setField(term691984, term691984.getClass(), "hierarchyBoundsListener", null);
        setField(term691984, term691984.getClass(), "keyListener", null);
        setField(term691984, term691984.getClass(), "mouseListener", null);
        setField(term691984, term691984.getClass(), "mouseMotionListener", null);
        setField(term691984, term691984.getClass(), "mouseWheelListener", null);
        setField(term691984, term691984.getClass(), "inputMethodListener", null);
        setLongField(term691984, term691984.getClass(), "eventMask", 0L);
        setField(term691984, term691984.getClass(), "changeSupport", null);
        setField(term691984, term691984.getClass(), "objectLock", null);
        setBooleanField(term691984, term691984.getClass(), "isPacked", false);
        setIntField(term691984, term691984.getClass(), "boundsOp", 0);
        setField(term691984, term691984.getClass(), "compoundShape", null);
        setField(term691984, term691984.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term691984, term691984.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term691984, term691984.getClass(), "backgroundEraseDisabled", false);
        setField(term691984, term691984.getClass(), "eventCache", null);
        setBooleanField(term691984, term691984.getClass(), "coalescingEnabled", false);
        setBooleanField(term691984, term691984.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term691984, term691984.getClass(), "componentSerializedDataVersion", 0);
        setField(term691984, term691984.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.IntelligenceView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updatePanel", argTypes, term691984, args);
    }

};


