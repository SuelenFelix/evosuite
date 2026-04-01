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

public class ResearchView_valueChanged_2861025520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81815;

    public ResearchView_valueChanged_2861025520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81815 = newInstance(Class.forName("org.openRealmOfStars.game.state.ResearchView"));
        setField(term81815, term81815.getClass(), "player", null);
        setIntField(term81815, term81815.getClass(), "totalResearch", 0);
        setField(term81815, term81815.getClass(), "combatRese", null);
        setField(term81815, term81815.getClass(), "defenseRese", null);
        setField(term81815, term81815.getClass(), "hullRese", null);
        setField(term81815, term81815.getClass(), "improvementRese", null);
        setField(term81815, term81815.getClass(), "propulsionRese", null);
        setField(term81815, term81815.getClass(), "electronicsRese", null);
        setField(term81815, term81815.getClass(), "techList", null);
        setField(term81815, term81815.getClass(), "artifactList", null);
        setField(term81815, term81815.getClass(), "infoText", null);
        setIntField(term81815, term81815.getClass(), "maximumGameLength", 0);
        setIntField(term81815, term81815.getClass(), "playSoundFromSliders", 0);
        setBooleanField(term81815, term81815.getClass(), "isAlignmentXSet", false);
        setFloatField(term81815, term81815.getClass(), "alignmentX", 0.0F);
        setBooleanField(term81815, term81815.getClass(), "isAlignmentYSet", false);
        setFloatField(term81815, term81815.getClass(), "alignmentY", 0.0F);
        setField(term81815, term81815.getClass(), "ui", null);
        setField(term81815, term81815.getClass(), "listenerList", null);
        setField(term81815, term81815.getClass(), "clientProperties", null);
        setField(term81815, term81815.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term81815, term81815.getClass(), "autoscrolls", false);
        setField(term81815, term81815.getClass(), "border", null);
        setIntField(term81815, term81815.getClass(), "flags", 0);
        setField(term81815, term81815.getClass(), "inputVerifier", null);
        setBooleanField(term81815, term81815.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term81815, term81815.getClass(), "paintingChild", null);
        setField(term81815, term81815.getClass(), "popupMenu", null);
        setField(term81815, term81815.getClass(), "revalidateRunnableScheduled", null);
        setField(term81815, term81815.getClass(), "focusInputMap", null);
        setField(term81815, term81815.getClass(), "ancestorInputMap", null);
        setField(term81815, term81815.getClass(), "windowInputMap", null);
        setField(term81815, term81815.getClass(), "actionMap", null);
        setField(term81815, term81815.getClass(), "aaHint", null);
        setField(term81815, term81815.getClass(), "lcdRenderingHint", null);
        setField(term81815, term81815.getClass(), "component", null);
        setField(term81815, term81815.getClass(), "layoutMgr", null);
        setField(term81815, term81815.getClass(), "dispatcher", null);
        setField(term81815, term81815.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term81815, term81815.getClass(), "focusCycleRoot", false);
        setBooleanField(term81815, term81815.getClass(), "focusTraversalPolicyProvider", false);
        setField(term81815, term81815.getClass(), "printingThreads", null);
        setBooleanField(term81815, term81815.getClass(), "printing", false);
        setField(term81815, term81815.getClass(), "containerListener", null);
        setIntField(term81815, term81815.getClass(), "listeningChildren", 0);
        setIntField(term81815, term81815.getClass(), "listeningBoundsChildren", 0);
        setIntField(term81815, term81815.getClass(), "descendantsCount", 0);
        setField(term81815, term81815.getClass(), "preserveBackgroundColor", null);
        setIntField(term81815, term81815.getClass(), "numOfHWComponents", 0);
        setIntField(term81815, term81815.getClass(), "numOfLWComponents", 0);
        setField(term81815, term81815.getClass(), "modalComp", null);
        setField(term81815, term81815.getClass(), "modalAppContext", null);
        setIntField(term81815, term81815.getClass(), "containerSerializedDataVersion", 0);
        setField(term81815, term81815.getClass(), "peer", null);
        setField(term81815, term81815.getClass(), "parent", null);
        setField(term81815, term81815.getClass(), "appContext", null);
        setIntField(term81815, term81815.getClass(), "x", 0);
        setIntField(term81815, term81815.getClass(), "y", 0);
        setIntField(term81815, term81815.getClass(), "width", 0);
        setIntField(term81815, term81815.getClass(), "height", 0);
        setField(term81815, term81815.getClass(), "foreground", null);
        setField(term81815, term81815.getClass(), "background", null);
        setField(term81815, term81815.getClass(), "font", null);
        setField(term81815, term81815.getClass(), "peerFont", null);
        setField(term81815, term81815.getClass(), "cursor", null);
        setField(term81815, term81815.getClass(), "locale", null);
        setField(term81815, term81815.getClass(), "graphicsConfig", null);
        setField(term81815, term81815.getClass(), "bufferStrategy", null);
        setBooleanField(term81815, term81815.getClass(), "ignoreRepaint", false);
        setBooleanField(term81815, term81815.getClass(), "visible", false);
        setBooleanField(term81815, term81815.getClass(), "enabled", false);
        setBooleanField(term81815, term81815.getClass(), "valid", false);
        setField(term81815, term81815.getClass(), "dropTarget", null);
        setField(term81815, term81815.getClass(), "popups", null);
        setField(term81815, term81815.getClass(), "name", null);
        setBooleanField(term81815, term81815.getClass(), "nameExplicitlySet", false);
        setBooleanField(term81815, term81815.getClass(), "focusable", false);
        setIntField(term81815, term81815.getClass(), "isFocusTraversableOverridden", 0);
        setField(term81815, term81815.getClass(), "focusTraversalKeys", null);
        setBooleanField(term81815, term81815.getClass(), "focusTraversalKeysEnabled", false);
        setField(term81815, term81815.getClass(), "acc", null);
        setField(term81815, term81815.getClass(), "minSize", null);
        setBooleanField(term81815, term81815.getClass(), "minSizeSet", false);
        setField(term81815, term81815.getClass(), "prefSize", null);
        setBooleanField(term81815, term81815.getClass(), "prefSizeSet", false);
        setField(term81815, term81815.getClass(), "maxSize", null);
        setBooleanField(term81815, term81815.getClass(), "maxSizeSet", false);
        setField(term81815, term81815.getClass(), "componentOrientation", null);
        setBooleanField(term81815, term81815.getClass(), "newEventsOnly", false);
        setField(term81815, term81815.getClass(), "componentListener", null);
        setField(term81815, term81815.getClass(), "focusListener", null);
        setField(term81815, term81815.getClass(), "hierarchyListener", null);
        setField(term81815, term81815.getClass(), "hierarchyBoundsListener", null);
        setField(term81815, term81815.getClass(), "keyListener", null);
        setField(term81815, term81815.getClass(), "mouseListener", null);
        setField(term81815, term81815.getClass(), "mouseMotionListener", null);
        setField(term81815, term81815.getClass(), "mouseWheelListener", null);
        setField(term81815, term81815.getClass(), "inputMethodListener", null);
        setLongField(term81815, term81815.getClass(), "eventMask", 0L);
        setField(term81815, term81815.getClass(), "changeSupport", null);
        setField(term81815, term81815.getClass(), "objectLock", null);
        setBooleanField(term81815, term81815.getClass(), "isPacked", false);
        setIntField(term81815, term81815.getClass(), "boundsOp", 0);
        setField(term81815, term81815.getClass(), "compoundShape", null);
        setField(term81815, term81815.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term81815, term81815.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term81815, term81815.getClass(), "backgroundEraseDisabled", false);
        setField(term81815, term81815.getClass(), "eventCache", null);
        setBooleanField(term81815, term81815.getClass(), "coalescingEnabled", false);
        setBooleanField(term81815, term81815.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term81815, term81815.getClass(), "componentSerializedDataVersion", 0);
        setField(term81815, term81815.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ResearchView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.TreeSelectionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "valueChanged", argTypes, term81815, args);
    }

};


