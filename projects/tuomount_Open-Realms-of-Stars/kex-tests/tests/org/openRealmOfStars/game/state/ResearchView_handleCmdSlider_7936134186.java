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

public class ResearchView_handleCmdSlider_7936134186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30146;

    public ResearchView_handleCmdSlider_7936134186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30146 = newInstance(Class.forName("org.openRealmOfStars.game.state.ResearchView"));
        setField(term30146, term30146.getClass(), "player", null);
        setIntField(term30146, term30146.getClass(), "totalResearch", 0);
        setField(term30146, term30146.getClass(), "combatRese", null);
        setField(term30146, term30146.getClass(), "defenseRese", null);
        setField(term30146, term30146.getClass(), "hullRese", null);
        setField(term30146, term30146.getClass(), "improvementRese", null);
        setField(term30146, term30146.getClass(), "propulsionRese", null);
        setField(term30146, term30146.getClass(), "electronicsRese", null);
        setField(term30146, term30146.getClass(), "techList", null);
        setField(term30146, term30146.getClass(), "artifactList", null);
        setField(term30146, term30146.getClass(), "infoText", null);
        setIntField(term30146, term30146.getClass(), "maximumGameLength", 0);
        setIntField(term30146, term30146.getClass(), "playSoundFromSliders", 0);
        setBooleanField(term30146, term30146.getClass(), "isAlignmentXSet", false);
        setFloatField(term30146, term30146.getClass(), "alignmentX", 0.0F);
        setBooleanField(term30146, term30146.getClass(), "isAlignmentYSet", false);
        setFloatField(term30146, term30146.getClass(), "alignmentY", 0.0F);
        setField(term30146, term30146.getClass(), "ui", null);
        setField(term30146, term30146.getClass(), "listenerList", null);
        setField(term30146, term30146.getClass(), "clientProperties", null);
        setField(term30146, term30146.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term30146, term30146.getClass(), "autoscrolls", false);
        setField(term30146, term30146.getClass(), "border", null);
        setIntField(term30146, term30146.getClass(), "flags", 0);
        setField(term30146, term30146.getClass(), "inputVerifier", null);
        setBooleanField(term30146, term30146.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term30146, term30146.getClass(), "paintingChild", null);
        setField(term30146, term30146.getClass(), "popupMenu", null);
        setField(term30146, term30146.getClass(), "revalidateRunnableScheduled", null);
        setField(term30146, term30146.getClass(), "focusInputMap", null);
        setField(term30146, term30146.getClass(), "ancestorInputMap", null);
        setField(term30146, term30146.getClass(), "windowInputMap", null);
        setField(term30146, term30146.getClass(), "actionMap", null);
        setField(term30146, term30146.getClass(), "aaHint", null);
        setField(term30146, term30146.getClass(), "lcdRenderingHint", null);
        setField(term30146, term30146.getClass(), "component", null);
        setField(term30146, term30146.getClass(), "layoutMgr", null);
        setField(term30146, term30146.getClass(), "dispatcher", null);
        setField(term30146, term30146.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term30146, term30146.getClass(), "focusCycleRoot", false);
        setBooleanField(term30146, term30146.getClass(), "focusTraversalPolicyProvider", false);
        setField(term30146, term30146.getClass(), "printingThreads", null);
        setBooleanField(term30146, term30146.getClass(), "printing", false);
        setField(term30146, term30146.getClass(), "containerListener", null);
        setIntField(term30146, term30146.getClass(), "listeningChildren", 0);
        setIntField(term30146, term30146.getClass(), "listeningBoundsChildren", 0);
        setIntField(term30146, term30146.getClass(), "descendantsCount", 0);
        setField(term30146, term30146.getClass(), "preserveBackgroundColor", null);
        setIntField(term30146, term30146.getClass(), "numOfHWComponents", 0);
        setIntField(term30146, term30146.getClass(), "numOfLWComponents", 0);
        setField(term30146, term30146.getClass(), "modalComp", null);
        setField(term30146, term30146.getClass(), "modalAppContext", null);
        setIntField(term30146, term30146.getClass(), "containerSerializedDataVersion", 0);
        setField(term30146, term30146.getClass(), "peer", null);
        setField(term30146, term30146.getClass(), "parent", null);
        setField(term30146, term30146.getClass(), "appContext", null);
        setIntField(term30146, term30146.getClass(), "x", 0);
        setIntField(term30146, term30146.getClass(), "y", 0);
        setIntField(term30146, term30146.getClass(), "width", 0);
        setIntField(term30146, term30146.getClass(), "height", 0);
        setField(term30146, term30146.getClass(), "foreground", null);
        setField(term30146, term30146.getClass(), "background", null);
        setField(term30146, term30146.getClass(), "font", null);
        setField(term30146, term30146.getClass(), "peerFont", null);
        setField(term30146, term30146.getClass(), "cursor", null);
        setField(term30146, term30146.getClass(), "locale", null);
        setField(term30146, term30146.getClass(), "graphicsConfig", null);
        setField(term30146, term30146.getClass(), "bufferStrategy", null);
        setBooleanField(term30146, term30146.getClass(), "ignoreRepaint", false);
        setBooleanField(term30146, term30146.getClass(), "visible", false);
        setBooleanField(term30146, term30146.getClass(), "enabled", false);
        setBooleanField(term30146, term30146.getClass(), "valid", false);
        setField(term30146, term30146.getClass(), "dropTarget", null);
        setField(term30146, term30146.getClass(), "popups", null);
        setField(term30146, term30146.getClass(), "name", null);
        setBooleanField(term30146, term30146.getClass(), "nameExplicitlySet", false);
        setBooleanField(term30146, term30146.getClass(), "focusable", false);
        setIntField(term30146, term30146.getClass(), "isFocusTraversableOverridden", 0);
        setField(term30146, term30146.getClass(), "focusTraversalKeys", null);
        setBooleanField(term30146, term30146.getClass(), "focusTraversalKeysEnabled", false);
        setField(term30146, term30146.getClass(), "acc", null);
        setField(term30146, term30146.getClass(), "minSize", null);
        setBooleanField(term30146, term30146.getClass(), "minSizeSet", false);
        setField(term30146, term30146.getClass(), "prefSize", null);
        setBooleanField(term30146, term30146.getClass(), "prefSizeSet", false);
        setField(term30146, term30146.getClass(), "maxSize", null);
        setBooleanField(term30146, term30146.getClass(), "maxSizeSet", false);
        setField(term30146, term30146.getClass(), "componentOrientation", null);
        setBooleanField(term30146, term30146.getClass(), "newEventsOnly", false);
        setField(term30146, term30146.getClass(), "componentListener", null);
        setField(term30146, term30146.getClass(), "focusListener", null);
        setField(term30146, term30146.getClass(), "hierarchyListener", null);
        setField(term30146, term30146.getClass(), "hierarchyBoundsListener", null);
        setField(term30146, term30146.getClass(), "keyListener", null);
        setField(term30146, term30146.getClass(), "mouseListener", null);
        setField(term30146, term30146.getClass(), "mouseMotionListener", null);
        setField(term30146, term30146.getClass(), "mouseWheelListener", null);
        setField(term30146, term30146.getClass(), "inputMethodListener", null);
        setLongField(term30146, term30146.getClass(), "eventMask", 0L);
        setField(term30146, term30146.getClass(), "changeSupport", null);
        setField(term30146, term30146.getClass(), "objectLock", null);
        setBooleanField(term30146, term30146.getClass(), "isPacked", false);
        setIntField(term30146, term30146.getClass(), "boundsOp", 0);
        setField(term30146, term30146.getClass(), "compoundShape", null);
        setField(term30146, term30146.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term30146, term30146.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term30146, term30146.getClass(), "backgroundEraseDisabled", false);
        setField(term30146, term30146.getClass(), "eventCache", null);
        setBooleanField(term30146, term30146.getClass(), "coalescingEnabled", false);
        setBooleanField(term30146, term30146.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term30146, term30146.getClass(), "componentSerializedDataVersion", 0);
        setField(term30146, term30146.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ResearchView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "handleCmdSlider", argTypes, term30146, args);
    }

};


