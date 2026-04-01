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

public class ResearchView_updateTechInfo_192793067616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64601;

    public ResearchView_updateTechInfo_192793067616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64601 = newInstance(Class.forName("org.openRealmOfStars.game.state.ResearchView"));
        setField(term64601, term64601.getClass(), "player", null);
        setIntField(term64601, term64601.getClass(), "totalResearch", 0);
        setField(term64601, term64601.getClass(), "combatRese", null);
        setField(term64601, term64601.getClass(), "defenseRese", null);
        setField(term64601, term64601.getClass(), "hullRese", null);
        setField(term64601, term64601.getClass(), "improvementRese", null);
        setField(term64601, term64601.getClass(), "propulsionRese", null);
        setField(term64601, term64601.getClass(), "electronicsRese", null);
        setField(term64601, term64601.getClass(), "techList", null);
        setField(term64601, term64601.getClass(), "artifactList", null);
        setField(term64601, term64601.getClass(), "infoText", null);
        setIntField(term64601, term64601.getClass(), "maximumGameLength", 0);
        setIntField(term64601, term64601.getClass(), "playSoundFromSliders", 0);
        setBooleanField(term64601, term64601.getClass(), "isAlignmentXSet", false);
        setFloatField(term64601, term64601.getClass(), "alignmentX", 0.0F);
        setBooleanField(term64601, term64601.getClass(), "isAlignmentYSet", false);
        setFloatField(term64601, term64601.getClass(), "alignmentY", 0.0F);
        setField(term64601, term64601.getClass(), "ui", null);
        setField(term64601, term64601.getClass(), "listenerList", null);
        setField(term64601, term64601.getClass(), "clientProperties", null);
        setField(term64601, term64601.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term64601, term64601.getClass(), "autoscrolls", false);
        setField(term64601, term64601.getClass(), "border", null);
        setIntField(term64601, term64601.getClass(), "flags", 0);
        setField(term64601, term64601.getClass(), "inputVerifier", null);
        setBooleanField(term64601, term64601.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term64601, term64601.getClass(), "paintingChild", null);
        setField(term64601, term64601.getClass(), "popupMenu", null);
        setField(term64601, term64601.getClass(), "revalidateRunnableScheduled", null);
        setField(term64601, term64601.getClass(), "focusInputMap", null);
        setField(term64601, term64601.getClass(), "ancestorInputMap", null);
        setField(term64601, term64601.getClass(), "windowInputMap", null);
        setField(term64601, term64601.getClass(), "actionMap", null);
        setField(term64601, term64601.getClass(), "aaHint", null);
        setField(term64601, term64601.getClass(), "lcdRenderingHint", null);
        setField(term64601, term64601.getClass(), "component", null);
        setField(term64601, term64601.getClass(), "layoutMgr", null);
        setField(term64601, term64601.getClass(), "dispatcher", null);
        setField(term64601, term64601.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term64601, term64601.getClass(), "focusCycleRoot", false);
        setBooleanField(term64601, term64601.getClass(), "focusTraversalPolicyProvider", false);
        setField(term64601, term64601.getClass(), "printingThreads", null);
        setBooleanField(term64601, term64601.getClass(), "printing", false);
        setField(term64601, term64601.getClass(), "containerListener", null);
        setIntField(term64601, term64601.getClass(), "listeningChildren", 0);
        setIntField(term64601, term64601.getClass(), "listeningBoundsChildren", 0);
        setIntField(term64601, term64601.getClass(), "descendantsCount", 0);
        setField(term64601, term64601.getClass(), "preserveBackgroundColor", null);
        setIntField(term64601, term64601.getClass(), "numOfHWComponents", 0);
        setIntField(term64601, term64601.getClass(), "numOfLWComponents", 0);
        setField(term64601, term64601.getClass(), "modalComp", null);
        setField(term64601, term64601.getClass(), "modalAppContext", null);
        setIntField(term64601, term64601.getClass(), "containerSerializedDataVersion", 0);
        setField(term64601, term64601.getClass(), "peer", null);
        setField(term64601, term64601.getClass(), "parent", null);
        setField(term64601, term64601.getClass(), "appContext", null);
        setIntField(term64601, term64601.getClass(), "x", 0);
        setIntField(term64601, term64601.getClass(), "y", 0);
        setIntField(term64601, term64601.getClass(), "width", 0);
        setIntField(term64601, term64601.getClass(), "height", 0);
        setField(term64601, term64601.getClass(), "foreground", null);
        setField(term64601, term64601.getClass(), "background", null);
        setField(term64601, term64601.getClass(), "font", null);
        setField(term64601, term64601.getClass(), "peerFont", null);
        setField(term64601, term64601.getClass(), "cursor", null);
        setField(term64601, term64601.getClass(), "locale", null);
        setField(term64601, term64601.getClass(), "graphicsConfig", null);
        setField(term64601, term64601.getClass(), "bufferStrategy", null);
        setBooleanField(term64601, term64601.getClass(), "ignoreRepaint", false);
        setBooleanField(term64601, term64601.getClass(), "visible", false);
        setBooleanField(term64601, term64601.getClass(), "enabled", false);
        setBooleanField(term64601, term64601.getClass(), "valid", false);
        setField(term64601, term64601.getClass(), "dropTarget", null);
        setField(term64601, term64601.getClass(), "popups", null);
        setField(term64601, term64601.getClass(), "name", null);
        setBooleanField(term64601, term64601.getClass(), "nameExplicitlySet", false);
        setBooleanField(term64601, term64601.getClass(), "focusable", false);
        setIntField(term64601, term64601.getClass(), "isFocusTraversableOverridden", 0);
        setField(term64601, term64601.getClass(), "focusTraversalKeys", null);
        setBooleanField(term64601, term64601.getClass(), "focusTraversalKeysEnabled", false);
        setField(term64601, term64601.getClass(), "acc", null);
        setField(term64601, term64601.getClass(), "minSize", null);
        setBooleanField(term64601, term64601.getClass(), "minSizeSet", false);
        setField(term64601, term64601.getClass(), "prefSize", null);
        setBooleanField(term64601, term64601.getClass(), "prefSizeSet", false);
        setField(term64601, term64601.getClass(), "maxSize", null);
        setBooleanField(term64601, term64601.getClass(), "maxSizeSet", false);
        setField(term64601, term64601.getClass(), "componentOrientation", null);
        setBooleanField(term64601, term64601.getClass(), "newEventsOnly", false);
        setField(term64601, term64601.getClass(), "componentListener", null);
        setField(term64601, term64601.getClass(), "focusListener", null);
        setField(term64601, term64601.getClass(), "hierarchyListener", null);
        setField(term64601, term64601.getClass(), "hierarchyBoundsListener", null);
        setField(term64601, term64601.getClass(), "keyListener", null);
        setField(term64601, term64601.getClass(), "mouseListener", null);
        setField(term64601, term64601.getClass(), "mouseMotionListener", null);
        setField(term64601, term64601.getClass(), "mouseWheelListener", null);
        setField(term64601, term64601.getClass(), "inputMethodListener", null);
        setLongField(term64601, term64601.getClass(), "eventMask", 0L);
        setField(term64601, term64601.getClass(), "changeSupport", null);
        setField(term64601, term64601.getClass(), "objectLock", null);
        setBooleanField(term64601, term64601.getClass(), "isPacked", false);
        setIntField(term64601, term64601.getClass(), "boundsOp", 0);
        setField(term64601, term64601.getClass(), "compoundShape", null);
        setField(term64601, term64601.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term64601, term64601.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term64601, term64601.getClass(), "backgroundEraseDisabled", false);
        setField(term64601, term64601.getClass(), "eventCache", null);
        setBooleanField(term64601, term64601.getClass(), "coalescingEnabled", false);
        setBooleanField(term64601, term64601.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term64601, term64601.getClass(), "componentSerializedDataVersion", 0);
        setField(term64601, term64601.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ResearchView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "updateTechInfo", argTypes, term64601, args);
    }

};


