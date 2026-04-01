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

public class ResearchView_makeTechTree_125428469121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81859;

    public ResearchView_makeTechTree_125428469121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81859 = newInstance(Class.forName("org.openRealmOfStars.game.state.ResearchView"));
        setField(term81859, term81859.getClass(), "player", null);
        setIntField(term81859, term81859.getClass(), "totalResearch", 0);
        setField(term81859, term81859.getClass(), "combatRese", null);
        setField(term81859, term81859.getClass(), "defenseRese", null);
        setField(term81859, term81859.getClass(), "hullRese", null);
        setField(term81859, term81859.getClass(), "improvementRese", null);
        setField(term81859, term81859.getClass(), "propulsionRese", null);
        setField(term81859, term81859.getClass(), "electronicsRese", null);
        setField(term81859, term81859.getClass(), "techList", null);
        setField(term81859, term81859.getClass(), "artifactList", null);
        setField(term81859, term81859.getClass(), "infoText", null);
        setIntField(term81859, term81859.getClass(), "maximumGameLength", 0);
        setIntField(term81859, term81859.getClass(), "playSoundFromSliders", 0);
        setBooleanField(term81859, term81859.getClass(), "isAlignmentXSet", false);
        setFloatField(term81859, term81859.getClass(), "alignmentX", 0.0F);
        setBooleanField(term81859, term81859.getClass(), "isAlignmentYSet", false);
        setFloatField(term81859, term81859.getClass(), "alignmentY", 0.0F);
        setField(term81859, term81859.getClass(), "ui", null);
        setField(term81859, term81859.getClass(), "listenerList", null);
        setField(term81859, term81859.getClass(), "clientProperties", null);
        setField(term81859, term81859.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term81859, term81859.getClass(), "autoscrolls", false);
        setField(term81859, term81859.getClass(), "border", null);
        setIntField(term81859, term81859.getClass(), "flags", 0);
        setField(term81859, term81859.getClass(), "inputVerifier", null);
        setBooleanField(term81859, term81859.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term81859, term81859.getClass(), "paintingChild", null);
        setField(term81859, term81859.getClass(), "popupMenu", null);
        setField(term81859, term81859.getClass(), "revalidateRunnableScheduled", null);
        setField(term81859, term81859.getClass(), "focusInputMap", null);
        setField(term81859, term81859.getClass(), "ancestorInputMap", null);
        setField(term81859, term81859.getClass(), "windowInputMap", null);
        setField(term81859, term81859.getClass(), "actionMap", null);
        setField(term81859, term81859.getClass(), "aaHint", null);
        setField(term81859, term81859.getClass(), "lcdRenderingHint", null);
        setField(term81859, term81859.getClass(), "component", null);
        setField(term81859, term81859.getClass(), "layoutMgr", null);
        setField(term81859, term81859.getClass(), "dispatcher", null);
        setField(term81859, term81859.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term81859, term81859.getClass(), "focusCycleRoot", false);
        setBooleanField(term81859, term81859.getClass(), "focusTraversalPolicyProvider", false);
        setField(term81859, term81859.getClass(), "printingThreads", null);
        setBooleanField(term81859, term81859.getClass(), "printing", false);
        setField(term81859, term81859.getClass(), "containerListener", null);
        setIntField(term81859, term81859.getClass(), "listeningChildren", 0);
        setIntField(term81859, term81859.getClass(), "listeningBoundsChildren", 0);
        setIntField(term81859, term81859.getClass(), "descendantsCount", 0);
        setField(term81859, term81859.getClass(), "preserveBackgroundColor", null);
        setIntField(term81859, term81859.getClass(), "numOfHWComponents", 0);
        setIntField(term81859, term81859.getClass(), "numOfLWComponents", 0);
        setField(term81859, term81859.getClass(), "modalComp", null);
        setField(term81859, term81859.getClass(), "modalAppContext", null);
        setIntField(term81859, term81859.getClass(), "containerSerializedDataVersion", 0);
        setField(term81859, term81859.getClass(), "peer", null);
        setField(term81859, term81859.getClass(), "parent", null);
        setField(term81859, term81859.getClass(), "appContext", null);
        setIntField(term81859, term81859.getClass(), "x", 0);
        setIntField(term81859, term81859.getClass(), "y", 0);
        setIntField(term81859, term81859.getClass(), "width", 0);
        setIntField(term81859, term81859.getClass(), "height", 0);
        setField(term81859, term81859.getClass(), "foreground", null);
        setField(term81859, term81859.getClass(), "background", null);
        setField(term81859, term81859.getClass(), "font", null);
        setField(term81859, term81859.getClass(), "peerFont", null);
        setField(term81859, term81859.getClass(), "cursor", null);
        setField(term81859, term81859.getClass(), "locale", null);
        setField(term81859, term81859.getClass(), "graphicsConfig", null);
        setField(term81859, term81859.getClass(), "bufferStrategy", null);
        setBooleanField(term81859, term81859.getClass(), "ignoreRepaint", false);
        setBooleanField(term81859, term81859.getClass(), "visible", false);
        setBooleanField(term81859, term81859.getClass(), "enabled", false);
        setBooleanField(term81859, term81859.getClass(), "valid", false);
        setField(term81859, term81859.getClass(), "dropTarget", null);
        setField(term81859, term81859.getClass(), "popups", null);
        setField(term81859, term81859.getClass(), "name", null);
        setBooleanField(term81859, term81859.getClass(), "nameExplicitlySet", false);
        setBooleanField(term81859, term81859.getClass(), "focusable", false);
        setIntField(term81859, term81859.getClass(), "isFocusTraversableOverridden", 0);
        setField(term81859, term81859.getClass(), "focusTraversalKeys", null);
        setBooleanField(term81859, term81859.getClass(), "focusTraversalKeysEnabled", false);
        setField(term81859, term81859.getClass(), "acc", null);
        setField(term81859, term81859.getClass(), "minSize", null);
        setBooleanField(term81859, term81859.getClass(), "minSizeSet", false);
        setField(term81859, term81859.getClass(), "prefSize", null);
        setBooleanField(term81859, term81859.getClass(), "prefSizeSet", false);
        setField(term81859, term81859.getClass(), "maxSize", null);
        setBooleanField(term81859, term81859.getClass(), "maxSizeSet", false);
        setField(term81859, term81859.getClass(), "componentOrientation", null);
        setBooleanField(term81859, term81859.getClass(), "newEventsOnly", false);
        setField(term81859, term81859.getClass(), "componentListener", null);
        setField(term81859, term81859.getClass(), "focusListener", null);
        setField(term81859, term81859.getClass(), "hierarchyListener", null);
        setField(term81859, term81859.getClass(), "hierarchyBoundsListener", null);
        setField(term81859, term81859.getClass(), "keyListener", null);
        setField(term81859, term81859.getClass(), "mouseListener", null);
        setField(term81859, term81859.getClass(), "mouseMotionListener", null);
        setField(term81859, term81859.getClass(), "mouseWheelListener", null);
        setField(term81859, term81859.getClass(), "inputMethodListener", null);
        setLongField(term81859, term81859.getClass(), "eventMask", 0L);
        setField(term81859, term81859.getClass(), "changeSupport", null);
        setField(term81859, term81859.getClass(), "objectLock", null);
        setBooleanField(term81859, term81859.getClass(), "isPacked", false);
        setIntField(term81859, term81859.getClass(), "boundsOp", 0);
        setField(term81859, term81859.getClass(), "compoundShape", null);
        setField(term81859, term81859.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term81859, term81859.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term81859, term81859.getClass(), "backgroundEraseDisabled", false);
        setField(term81859, term81859.getClass(), "eventCache", null);
        setBooleanField(term81859, term81859.getClass(), "coalescingEnabled", false);
        setBooleanField(term81859, term81859.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term81859, term81859.getClass(), "componentSerializedDataVersion", 0);
        setField(term81859, term81859.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ResearchView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "makeTechTree", argTypes, term81859, args);
    }

};


