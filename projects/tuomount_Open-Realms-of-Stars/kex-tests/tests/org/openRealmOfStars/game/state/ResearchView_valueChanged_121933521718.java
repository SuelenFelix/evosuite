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

public class ResearchView_valueChanged_121933521718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72927;

    public ResearchView_valueChanged_121933521718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72927 = newInstance(Class.forName("org.openRealmOfStars.game.state.ResearchView"));
        setField(term72927, term72927.getClass(), "player", null);
        setIntField(term72927, term72927.getClass(), "totalResearch", 0);
        setField(term72927, term72927.getClass(), "combatRese", null);
        setField(term72927, term72927.getClass(), "defenseRese", null);
        setField(term72927, term72927.getClass(), "hullRese", null);
        setField(term72927, term72927.getClass(), "improvementRese", null);
        setField(term72927, term72927.getClass(), "propulsionRese", null);
        setField(term72927, term72927.getClass(), "electronicsRese", null);
        setField(term72927, term72927.getClass(), "techList", null);
        setField(term72927, term72927.getClass(), "artifactList", null);
        setField(term72927, term72927.getClass(), "infoText", null);
        setIntField(term72927, term72927.getClass(), "maximumGameLength", 0);
        setIntField(term72927, term72927.getClass(), "playSoundFromSliders", 0);
        setBooleanField(term72927, term72927.getClass(), "isAlignmentXSet", false);
        setFloatField(term72927, term72927.getClass(), "alignmentX", 0.0F);
        setBooleanField(term72927, term72927.getClass(), "isAlignmentYSet", false);
        setFloatField(term72927, term72927.getClass(), "alignmentY", 0.0F);
        setField(term72927, term72927.getClass(), "ui", null);
        setField(term72927, term72927.getClass(), "listenerList", null);
        setField(term72927, term72927.getClass(), "clientProperties", null);
        setField(term72927, term72927.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term72927, term72927.getClass(), "autoscrolls", false);
        setField(term72927, term72927.getClass(), "border", null);
        setIntField(term72927, term72927.getClass(), "flags", 0);
        setField(term72927, term72927.getClass(), "inputVerifier", null);
        setBooleanField(term72927, term72927.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term72927, term72927.getClass(), "paintingChild", null);
        setField(term72927, term72927.getClass(), "popupMenu", null);
        setField(term72927, term72927.getClass(), "revalidateRunnableScheduled", null);
        setField(term72927, term72927.getClass(), "focusInputMap", null);
        setField(term72927, term72927.getClass(), "ancestorInputMap", null);
        setField(term72927, term72927.getClass(), "windowInputMap", null);
        setField(term72927, term72927.getClass(), "actionMap", null);
        setField(term72927, term72927.getClass(), "aaHint", null);
        setField(term72927, term72927.getClass(), "lcdRenderingHint", null);
        setField(term72927, term72927.getClass(), "component", null);
        setField(term72927, term72927.getClass(), "layoutMgr", null);
        setField(term72927, term72927.getClass(), "dispatcher", null);
        setField(term72927, term72927.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term72927, term72927.getClass(), "focusCycleRoot", false);
        setBooleanField(term72927, term72927.getClass(), "focusTraversalPolicyProvider", false);
        setField(term72927, term72927.getClass(), "printingThreads", null);
        setBooleanField(term72927, term72927.getClass(), "printing", false);
        setField(term72927, term72927.getClass(), "containerListener", null);
        setIntField(term72927, term72927.getClass(), "listeningChildren", 0);
        setIntField(term72927, term72927.getClass(), "listeningBoundsChildren", 0);
        setIntField(term72927, term72927.getClass(), "descendantsCount", 0);
        setField(term72927, term72927.getClass(), "preserveBackgroundColor", null);
        setIntField(term72927, term72927.getClass(), "numOfHWComponents", 0);
        setIntField(term72927, term72927.getClass(), "numOfLWComponents", 0);
        setField(term72927, term72927.getClass(), "modalComp", null);
        setField(term72927, term72927.getClass(), "modalAppContext", null);
        setIntField(term72927, term72927.getClass(), "containerSerializedDataVersion", 0);
        setField(term72927, term72927.getClass(), "peer", null);
        setField(term72927, term72927.getClass(), "parent", null);
        setField(term72927, term72927.getClass(), "appContext", null);
        setIntField(term72927, term72927.getClass(), "x", 0);
        setIntField(term72927, term72927.getClass(), "y", 0);
        setIntField(term72927, term72927.getClass(), "width", 0);
        setIntField(term72927, term72927.getClass(), "height", 0);
        setField(term72927, term72927.getClass(), "foreground", null);
        setField(term72927, term72927.getClass(), "background", null);
        setField(term72927, term72927.getClass(), "font", null);
        setField(term72927, term72927.getClass(), "peerFont", null);
        setField(term72927, term72927.getClass(), "cursor", null);
        setField(term72927, term72927.getClass(), "locale", null);
        setField(term72927, term72927.getClass(), "graphicsConfig", null);
        setField(term72927, term72927.getClass(), "bufferStrategy", null);
        setBooleanField(term72927, term72927.getClass(), "ignoreRepaint", false);
        setBooleanField(term72927, term72927.getClass(), "visible", false);
        setBooleanField(term72927, term72927.getClass(), "enabled", false);
        setBooleanField(term72927, term72927.getClass(), "valid", false);
        setField(term72927, term72927.getClass(), "dropTarget", null);
        setField(term72927, term72927.getClass(), "popups", null);
        setField(term72927, term72927.getClass(), "name", null);
        setBooleanField(term72927, term72927.getClass(), "nameExplicitlySet", false);
        setBooleanField(term72927, term72927.getClass(), "focusable", false);
        setIntField(term72927, term72927.getClass(), "isFocusTraversableOverridden", 0);
        setField(term72927, term72927.getClass(), "focusTraversalKeys", null);
        setBooleanField(term72927, term72927.getClass(), "focusTraversalKeysEnabled", false);
        setField(term72927, term72927.getClass(), "acc", null);
        setField(term72927, term72927.getClass(), "minSize", null);
        setBooleanField(term72927, term72927.getClass(), "minSizeSet", false);
        setField(term72927, term72927.getClass(), "prefSize", null);
        setBooleanField(term72927, term72927.getClass(), "prefSizeSet", false);
        setField(term72927, term72927.getClass(), "maxSize", null);
        setBooleanField(term72927, term72927.getClass(), "maxSizeSet", false);
        setField(term72927, term72927.getClass(), "componentOrientation", null);
        setBooleanField(term72927, term72927.getClass(), "newEventsOnly", false);
        setField(term72927, term72927.getClass(), "componentListener", null);
        setField(term72927, term72927.getClass(), "focusListener", null);
        setField(term72927, term72927.getClass(), "hierarchyListener", null);
        setField(term72927, term72927.getClass(), "hierarchyBoundsListener", null);
        setField(term72927, term72927.getClass(), "keyListener", null);
        setField(term72927, term72927.getClass(), "mouseListener", null);
        setField(term72927, term72927.getClass(), "mouseMotionListener", null);
        setField(term72927, term72927.getClass(), "mouseWheelListener", null);
        setField(term72927, term72927.getClass(), "inputMethodListener", null);
        setLongField(term72927, term72927.getClass(), "eventMask", 0L);
        setField(term72927, term72927.getClass(), "changeSupport", null);
        setField(term72927, term72927.getClass(), "objectLock", null);
        setBooleanField(term72927, term72927.getClass(), "isPacked", false);
        setIntField(term72927, term72927.getClass(), "boundsOp", 0);
        setField(term72927, term72927.getClass(), "compoundShape", null);
        setField(term72927, term72927.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term72927, term72927.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term72927, term72927.getClass(), "backgroundEraseDisabled", false);
        setField(term72927, term72927.getClass(), "eventCache", null);
        setBooleanField(term72927, term72927.getClass(), "coalescingEnabled", false);
        setBooleanField(term72927, term72927.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term72927, term72927.getClass(), "componentSerializedDataVersion", 0);
        setField(term72927, term72927.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ResearchView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.ListSelectionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "valueChanged", argTypes, term72927, args);
    }

};


