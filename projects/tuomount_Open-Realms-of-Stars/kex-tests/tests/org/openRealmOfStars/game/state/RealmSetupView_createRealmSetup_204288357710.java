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
import java.lang.Integer;

public class RealmSetupView_createRealmSetup_204288357710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351005;
     Object term351050;

    public RealmSetupView_createRealmSetup_204288357710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351005 = newInstance(Class.forName("org.openRealmOfStars.game.state.RealmSetupView"));
        setField(term351005, term351005.getClass(), "comboRaceSelect", null);
        setField(term351005, term351005.getClass(), "comboGovernmentSelect", null);
        setField(term351005, term351005.getClass(), "checkElderRealm", null);
        setField(term351005, term351005.getClass(), "realmName", null);
        setField(term351005, term351005.getClass(), "raceImgs", null);
        setField(term351005, term351005.getClass(), "comboRealmColor", null);
        setField(term351005, term351005.getClass(), "comboDifficult", null);
        setField(term351005, term351005.getClass(), "comboScenario", null);
        setField(term351005, term351005.getClass(), "config", null);
        setField(term351005, term351005.getClass(), "actionListener", null);
        setBooleanField(term351005, term351005.getClass(), "allowChangingRealm", false);
        setIntField(term351005, term351005.getClass(), "realmIndex", 0);
        setField(term351005, term351005.getClass(), "spaceRaceInfo", null);
        setField(term351005, term351005.getClass(), "infoPanelForSpaceRace", null);
        setField(term351005, term351005.getClass(), "governmentInfo", null);
        setField(term351005, term351005.getClass(), "fullPanel", null);
        setIntField(term351005, term351005.getClass(), "rigidSize", 0);
        setIntField(term351005, term351005.getClass(), "maxComboWidth", 0);
        setBooleanField(term351005, term351005.getClass(), "isAlignmentXSet", false);
        setFloatField(term351005, term351005.getClass(), "alignmentX", 0.0F);
        setBooleanField(term351005, term351005.getClass(), "isAlignmentYSet", false);
        setFloatField(term351005, term351005.getClass(), "alignmentY", 0.0F);
        setField(term351005, term351005.getClass(), "ui", null);
        setField(term351005, term351005.getClass(), "listenerList", null);
        setField(term351005, term351005.getClass(), "clientProperties", null);
        setField(term351005, term351005.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term351005, term351005.getClass(), "autoscrolls", false);
        setField(term351005, term351005.getClass(), "border", null);
        setIntField(term351005, term351005.getClass(), "flags", 0);
        setField(term351005, term351005.getClass(), "inputVerifier", null);
        setBooleanField(term351005, term351005.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term351005, term351005.getClass(), "paintingChild", null);
        setField(term351005, term351005.getClass(), "popupMenu", null);
        setField(term351005, term351005.getClass(), "revalidateRunnableScheduled", null);
        setField(term351005, term351005.getClass(), "focusInputMap", null);
        setField(term351005, term351005.getClass(), "ancestorInputMap", null);
        setField(term351005, term351005.getClass(), "windowInputMap", null);
        setField(term351005, term351005.getClass(), "actionMap", null);
        setField(term351005, term351005.getClass(), "aaHint", null);
        setField(term351005, term351005.getClass(), "lcdRenderingHint", null);
        setField(term351005, term351005.getClass(), "component", null);
        setField(term351005, term351005.getClass(), "layoutMgr", null);
        setField(term351005, term351005.getClass(), "dispatcher", null);
        setField(term351005, term351005.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term351005, term351005.getClass(), "focusCycleRoot", false);
        setBooleanField(term351005, term351005.getClass(), "focusTraversalPolicyProvider", false);
        setField(term351005, term351005.getClass(), "printingThreads", null);
        setBooleanField(term351005, term351005.getClass(), "printing", false);
        setField(term351005, term351005.getClass(), "containerListener", null);
        setIntField(term351005, term351005.getClass(), "listeningChildren", 0);
        setIntField(term351005, term351005.getClass(), "listeningBoundsChildren", 0);
        setIntField(term351005, term351005.getClass(), "descendantsCount", 0);
        setField(term351005, term351005.getClass(), "preserveBackgroundColor", null);
        setIntField(term351005, term351005.getClass(), "numOfHWComponents", 0);
        setIntField(term351005, term351005.getClass(), "numOfLWComponents", 0);
        setField(term351005, term351005.getClass(), "modalComp", null);
        setField(term351005, term351005.getClass(), "modalAppContext", null);
        setIntField(term351005, term351005.getClass(), "containerSerializedDataVersion", 0);
        setField(term351005, term351005.getClass(), "peer", null);
        setField(term351005, term351005.getClass(), "parent", null);
        setField(term351005, term351005.getClass(), "appContext", null);
        setIntField(term351005, term351005.getClass(), "x", 0);
        setIntField(term351005, term351005.getClass(), "y", 0);
        setIntField(term351005, term351005.getClass(), "width", 0);
        setIntField(term351005, term351005.getClass(), "height", 0);
        setField(term351005, term351005.getClass(), "foreground", null);
        setField(term351005, term351005.getClass(), "background", null);
        setField(term351005, term351005.getClass(), "font", null);
        setField(term351005, term351005.getClass(), "peerFont", null);
        setField(term351005, term351005.getClass(), "cursor", null);
        setField(term351005, term351005.getClass(), "locale", null);
        setField(term351005, term351005.getClass(), "graphicsConfig", null);
        setField(term351005, term351005.getClass(), "bufferStrategy", null);
        setBooleanField(term351005, term351005.getClass(), "ignoreRepaint", false);
        setBooleanField(term351005, term351005.getClass(), "visible", false);
        setBooleanField(term351005, term351005.getClass(), "enabled", false);
        setBooleanField(term351005, term351005.getClass(), "valid", false);
        setField(term351005, term351005.getClass(), "dropTarget", null);
        setField(term351005, term351005.getClass(), "popups", null);
        setField(term351005, term351005.getClass(), "name", null);
        setBooleanField(term351005, term351005.getClass(), "nameExplicitlySet", false);
        setBooleanField(term351005, term351005.getClass(), "focusable", false);
        setIntField(term351005, term351005.getClass(), "isFocusTraversableOverridden", 0);
        setField(term351005, term351005.getClass(), "focusTraversalKeys", null);
        setBooleanField(term351005, term351005.getClass(), "focusTraversalKeysEnabled", false);
        setField(term351005, term351005.getClass(), "acc", null);
        setField(term351005, term351005.getClass(), "minSize", null);
        setBooleanField(term351005, term351005.getClass(), "minSizeSet", false);
        setField(term351005, term351005.getClass(), "prefSize", null);
        setBooleanField(term351005, term351005.getClass(), "prefSizeSet", false);
        setField(term351005, term351005.getClass(), "maxSize", null);
        setBooleanField(term351005, term351005.getClass(), "maxSizeSet", false);
        setField(term351005, term351005.getClass(), "componentOrientation", null);
        setBooleanField(term351005, term351005.getClass(), "newEventsOnly", false);
        setField(term351005, term351005.getClass(), "componentListener", null);
        setField(term351005, term351005.getClass(), "focusListener", null);
        setField(term351005, term351005.getClass(), "hierarchyListener", null);
        setField(term351005, term351005.getClass(), "hierarchyBoundsListener", null);
        setField(term351005, term351005.getClass(), "keyListener", null);
        setField(term351005, term351005.getClass(), "mouseListener", null);
        setField(term351005, term351005.getClass(), "mouseMotionListener", null);
        setField(term351005, term351005.getClass(), "mouseWheelListener", null);
        setField(term351005, term351005.getClass(), "inputMethodListener", null);
        setLongField(term351005, term351005.getClass(), "eventMask", 0L);
        setField(term351005, term351005.getClass(), "changeSupport", null);
        setField(term351005, term351005.getClass(), "objectLock", null);
        setBooleanField(term351005, term351005.getClass(), "isPacked", false);
        setIntField(term351005, term351005.getClass(), "boundsOp", 0);
        setField(term351005, term351005.getClass(), "compoundShape", null);
        setField(term351005, term351005.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term351005, term351005.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term351005, term351005.getClass(), "backgroundEraseDisabled", false);
        setField(term351005, term351005.getClass(), "eventCache", null);
        setBooleanField(term351005, term351005.getClass(), "coalescingEnabled", false);
        setBooleanField(term351005, term351005.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term351005, term351005.getClass(), "componentSerializedDataVersion", 0);
        setField(term351005, term351005.getClass(), "accessibleContext", null);
        term351050 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.RealmSetupView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[2];
        args[0] = term351050;
        args[1] = null;
        callMethod(klass, "createRealmSetup", argTypes, term351005, args);
    }

};


