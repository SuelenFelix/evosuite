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

public class ResearchView_handleCmdPlus_20867892698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37944;

    public ResearchView_handleCmdPlus_20867892698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37944 = newInstance(Class.forName("org.openRealmOfStars.game.state.ResearchView"));
        setField(term37944, term37944.getClass(), "player", null);
        setIntField(term37944, term37944.getClass(), "totalResearch", 0);
        setField(term37944, term37944.getClass(), "combatRese", null);
        setField(term37944, term37944.getClass(), "defenseRese", null);
        setField(term37944, term37944.getClass(), "hullRese", null);
        setField(term37944, term37944.getClass(), "improvementRese", null);
        setField(term37944, term37944.getClass(), "propulsionRese", null);
        setField(term37944, term37944.getClass(), "electronicsRese", null);
        setField(term37944, term37944.getClass(), "techList", null);
        setField(term37944, term37944.getClass(), "artifactList", null);
        setField(term37944, term37944.getClass(), "infoText", null);
        setIntField(term37944, term37944.getClass(), "maximumGameLength", 0);
        setIntField(term37944, term37944.getClass(), "playSoundFromSliders", 0);
        setBooleanField(term37944, term37944.getClass(), "isAlignmentXSet", false);
        setFloatField(term37944, term37944.getClass(), "alignmentX", 0.0F);
        setBooleanField(term37944, term37944.getClass(), "isAlignmentYSet", false);
        setFloatField(term37944, term37944.getClass(), "alignmentY", 0.0F);
        setField(term37944, term37944.getClass(), "ui", null);
        setField(term37944, term37944.getClass(), "listenerList", null);
        setField(term37944, term37944.getClass(), "clientProperties", null);
        setField(term37944, term37944.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term37944, term37944.getClass(), "autoscrolls", false);
        setField(term37944, term37944.getClass(), "border", null);
        setIntField(term37944, term37944.getClass(), "flags", 0);
        setField(term37944, term37944.getClass(), "inputVerifier", null);
        setBooleanField(term37944, term37944.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term37944, term37944.getClass(), "paintingChild", null);
        setField(term37944, term37944.getClass(), "popupMenu", null);
        setField(term37944, term37944.getClass(), "revalidateRunnableScheduled", null);
        setField(term37944, term37944.getClass(), "focusInputMap", null);
        setField(term37944, term37944.getClass(), "ancestorInputMap", null);
        setField(term37944, term37944.getClass(), "windowInputMap", null);
        setField(term37944, term37944.getClass(), "actionMap", null);
        setField(term37944, term37944.getClass(), "aaHint", null);
        setField(term37944, term37944.getClass(), "lcdRenderingHint", null);
        setField(term37944, term37944.getClass(), "component", null);
        setField(term37944, term37944.getClass(), "layoutMgr", null);
        setField(term37944, term37944.getClass(), "dispatcher", null);
        setField(term37944, term37944.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term37944, term37944.getClass(), "focusCycleRoot", false);
        setBooleanField(term37944, term37944.getClass(), "focusTraversalPolicyProvider", false);
        setField(term37944, term37944.getClass(), "printingThreads", null);
        setBooleanField(term37944, term37944.getClass(), "printing", false);
        setField(term37944, term37944.getClass(), "containerListener", null);
        setIntField(term37944, term37944.getClass(), "listeningChildren", 0);
        setIntField(term37944, term37944.getClass(), "listeningBoundsChildren", 0);
        setIntField(term37944, term37944.getClass(), "descendantsCount", 0);
        setField(term37944, term37944.getClass(), "preserveBackgroundColor", null);
        setIntField(term37944, term37944.getClass(), "numOfHWComponents", 0);
        setIntField(term37944, term37944.getClass(), "numOfLWComponents", 0);
        setField(term37944, term37944.getClass(), "modalComp", null);
        setField(term37944, term37944.getClass(), "modalAppContext", null);
        setIntField(term37944, term37944.getClass(), "containerSerializedDataVersion", 0);
        setField(term37944, term37944.getClass(), "peer", null);
        setField(term37944, term37944.getClass(), "parent", null);
        setField(term37944, term37944.getClass(), "appContext", null);
        setIntField(term37944, term37944.getClass(), "x", 0);
        setIntField(term37944, term37944.getClass(), "y", 0);
        setIntField(term37944, term37944.getClass(), "width", 0);
        setIntField(term37944, term37944.getClass(), "height", 0);
        setField(term37944, term37944.getClass(), "foreground", null);
        setField(term37944, term37944.getClass(), "background", null);
        setField(term37944, term37944.getClass(), "font", null);
        setField(term37944, term37944.getClass(), "peerFont", null);
        setField(term37944, term37944.getClass(), "cursor", null);
        setField(term37944, term37944.getClass(), "locale", null);
        setField(term37944, term37944.getClass(), "graphicsConfig", null);
        setField(term37944, term37944.getClass(), "bufferStrategy", null);
        setBooleanField(term37944, term37944.getClass(), "ignoreRepaint", false);
        setBooleanField(term37944, term37944.getClass(), "visible", false);
        setBooleanField(term37944, term37944.getClass(), "enabled", false);
        setBooleanField(term37944, term37944.getClass(), "valid", false);
        setField(term37944, term37944.getClass(), "dropTarget", null);
        setField(term37944, term37944.getClass(), "popups", null);
        setField(term37944, term37944.getClass(), "name", null);
        setBooleanField(term37944, term37944.getClass(), "nameExplicitlySet", false);
        setBooleanField(term37944, term37944.getClass(), "focusable", false);
        setIntField(term37944, term37944.getClass(), "isFocusTraversableOverridden", 0);
        setField(term37944, term37944.getClass(), "focusTraversalKeys", null);
        setBooleanField(term37944, term37944.getClass(), "focusTraversalKeysEnabled", false);
        setField(term37944, term37944.getClass(), "acc", null);
        setField(term37944, term37944.getClass(), "minSize", null);
        setBooleanField(term37944, term37944.getClass(), "minSizeSet", false);
        setField(term37944, term37944.getClass(), "prefSize", null);
        setBooleanField(term37944, term37944.getClass(), "prefSizeSet", false);
        setField(term37944, term37944.getClass(), "maxSize", null);
        setBooleanField(term37944, term37944.getClass(), "maxSizeSet", false);
        setField(term37944, term37944.getClass(), "componentOrientation", null);
        setBooleanField(term37944, term37944.getClass(), "newEventsOnly", false);
        setField(term37944, term37944.getClass(), "componentListener", null);
        setField(term37944, term37944.getClass(), "focusListener", null);
        setField(term37944, term37944.getClass(), "hierarchyListener", null);
        setField(term37944, term37944.getClass(), "hierarchyBoundsListener", null);
        setField(term37944, term37944.getClass(), "keyListener", null);
        setField(term37944, term37944.getClass(), "mouseListener", null);
        setField(term37944, term37944.getClass(), "mouseMotionListener", null);
        setField(term37944, term37944.getClass(), "mouseWheelListener", null);
        setField(term37944, term37944.getClass(), "inputMethodListener", null);
        setLongField(term37944, term37944.getClass(), "eventMask", 0L);
        setField(term37944, term37944.getClass(), "changeSupport", null);
        setField(term37944, term37944.getClass(), "objectLock", null);
        setBooleanField(term37944, term37944.getClass(), "isPacked", false);
        setIntField(term37944, term37944.getClass(), "boundsOp", 0);
        setField(term37944, term37944.getClass(), "compoundShape", null);
        setField(term37944, term37944.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term37944, term37944.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term37944, term37944.getClass(), "backgroundEraseDisabled", false);
        setField(term37944, term37944.getClass(), "eventCache", null);
        setBooleanField(term37944, term37944.getClass(), "coalescingEnabled", false);
        setBooleanField(term37944, term37944.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term37944, term37944.getClass(), "componentSerializedDataVersion", 0);
        setField(term37944, term37944.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ResearchView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleCmdPlus", argTypes, term37944, args);
    }

};


