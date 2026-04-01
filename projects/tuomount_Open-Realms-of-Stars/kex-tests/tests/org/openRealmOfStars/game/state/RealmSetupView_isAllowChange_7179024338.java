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

public class RealmSetupView_isAllowChange_7179024338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350915;

    public RealmSetupView_isAllowChange_7179024338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350915 = newInstance(Class.forName("org.openRealmOfStars.game.state.RealmSetupView"));
        setField(term350915, term350915.getClass(), "comboRaceSelect", null);
        setField(term350915, term350915.getClass(), "comboGovernmentSelect", null);
        setField(term350915, term350915.getClass(), "checkElderRealm", null);
        setField(term350915, term350915.getClass(), "realmName", null);
        setField(term350915, term350915.getClass(), "raceImgs", null);
        setField(term350915, term350915.getClass(), "comboRealmColor", null);
        setField(term350915, term350915.getClass(), "comboDifficult", null);
        setField(term350915, term350915.getClass(), "comboScenario", null);
        setField(term350915, term350915.getClass(), "config", null);
        setField(term350915, term350915.getClass(), "actionListener", null);
        setBooleanField(term350915, term350915.getClass(), "allowChangingRealm", false);
        setIntField(term350915, term350915.getClass(), "realmIndex", 0);
        setField(term350915, term350915.getClass(), "spaceRaceInfo", null);
        setField(term350915, term350915.getClass(), "infoPanelForSpaceRace", null);
        setField(term350915, term350915.getClass(), "governmentInfo", null);
        setField(term350915, term350915.getClass(), "fullPanel", null);
        setIntField(term350915, term350915.getClass(), "rigidSize", 0);
        setIntField(term350915, term350915.getClass(), "maxComboWidth", 0);
        setBooleanField(term350915, term350915.getClass(), "isAlignmentXSet", false);
        setFloatField(term350915, term350915.getClass(), "alignmentX", 0.0F);
        setBooleanField(term350915, term350915.getClass(), "isAlignmentYSet", false);
        setFloatField(term350915, term350915.getClass(), "alignmentY", 0.0F);
        setField(term350915, term350915.getClass(), "ui", null);
        setField(term350915, term350915.getClass(), "listenerList", null);
        setField(term350915, term350915.getClass(), "clientProperties", null);
        setField(term350915, term350915.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term350915, term350915.getClass(), "autoscrolls", false);
        setField(term350915, term350915.getClass(), "border", null);
        setIntField(term350915, term350915.getClass(), "flags", 0);
        setField(term350915, term350915.getClass(), "inputVerifier", null);
        setBooleanField(term350915, term350915.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term350915, term350915.getClass(), "paintingChild", null);
        setField(term350915, term350915.getClass(), "popupMenu", null);
        setField(term350915, term350915.getClass(), "revalidateRunnableScheduled", null);
        setField(term350915, term350915.getClass(), "focusInputMap", null);
        setField(term350915, term350915.getClass(), "ancestorInputMap", null);
        setField(term350915, term350915.getClass(), "windowInputMap", null);
        setField(term350915, term350915.getClass(), "actionMap", null);
        setField(term350915, term350915.getClass(), "aaHint", null);
        setField(term350915, term350915.getClass(), "lcdRenderingHint", null);
        setField(term350915, term350915.getClass(), "component", null);
        setField(term350915, term350915.getClass(), "layoutMgr", null);
        setField(term350915, term350915.getClass(), "dispatcher", null);
        setField(term350915, term350915.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term350915, term350915.getClass(), "focusCycleRoot", false);
        setBooleanField(term350915, term350915.getClass(), "focusTraversalPolicyProvider", false);
        setField(term350915, term350915.getClass(), "printingThreads", null);
        setBooleanField(term350915, term350915.getClass(), "printing", false);
        setField(term350915, term350915.getClass(), "containerListener", null);
        setIntField(term350915, term350915.getClass(), "listeningChildren", 0);
        setIntField(term350915, term350915.getClass(), "listeningBoundsChildren", 0);
        setIntField(term350915, term350915.getClass(), "descendantsCount", 0);
        setField(term350915, term350915.getClass(), "preserveBackgroundColor", null);
        setIntField(term350915, term350915.getClass(), "numOfHWComponents", 0);
        setIntField(term350915, term350915.getClass(), "numOfLWComponents", 0);
        setField(term350915, term350915.getClass(), "modalComp", null);
        setField(term350915, term350915.getClass(), "modalAppContext", null);
        setIntField(term350915, term350915.getClass(), "containerSerializedDataVersion", 0);
        setField(term350915, term350915.getClass(), "peer", null);
        setField(term350915, term350915.getClass(), "parent", null);
        setField(term350915, term350915.getClass(), "appContext", null);
        setIntField(term350915, term350915.getClass(), "x", 0);
        setIntField(term350915, term350915.getClass(), "y", 0);
        setIntField(term350915, term350915.getClass(), "width", 0);
        setIntField(term350915, term350915.getClass(), "height", 0);
        setField(term350915, term350915.getClass(), "foreground", null);
        setField(term350915, term350915.getClass(), "background", null);
        setField(term350915, term350915.getClass(), "font", null);
        setField(term350915, term350915.getClass(), "peerFont", null);
        setField(term350915, term350915.getClass(), "cursor", null);
        setField(term350915, term350915.getClass(), "locale", null);
        setField(term350915, term350915.getClass(), "graphicsConfig", null);
        setField(term350915, term350915.getClass(), "bufferStrategy", null);
        setBooleanField(term350915, term350915.getClass(), "ignoreRepaint", false);
        setBooleanField(term350915, term350915.getClass(), "visible", false);
        setBooleanField(term350915, term350915.getClass(), "enabled", false);
        setBooleanField(term350915, term350915.getClass(), "valid", false);
        setField(term350915, term350915.getClass(), "dropTarget", null);
        setField(term350915, term350915.getClass(), "popups", null);
        setField(term350915, term350915.getClass(), "name", null);
        setBooleanField(term350915, term350915.getClass(), "nameExplicitlySet", false);
        setBooleanField(term350915, term350915.getClass(), "focusable", false);
        setIntField(term350915, term350915.getClass(), "isFocusTraversableOverridden", 0);
        setField(term350915, term350915.getClass(), "focusTraversalKeys", null);
        setBooleanField(term350915, term350915.getClass(), "focusTraversalKeysEnabled", false);
        setField(term350915, term350915.getClass(), "acc", null);
        setField(term350915, term350915.getClass(), "minSize", null);
        setBooleanField(term350915, term350915.getClass(), "minSizeSet", false);
        setField(term350915, term350915.getClass(), "prefSize", null);
        setBooleanField(term350915, term350915.getClass(), "prefSizeSet", false);
        setField(term350915, term350915.getClass(), "maxSize", null);
        setBooleanField(term350915, term350915.getClass(), "maxSizeSet", false);
        setField(term350915, term350915.getClass(), "componentOrientation", null);
        setBooleanField(term350915, term350915.getClass(), "newEventsOnly", false);
        setField(term350915, term350915.getClass(), "componentListener", null);
        setField(term350915, term350915.getClass(), "focusListener", null);
        setField(term350915, term350915.getClass(), "hierarchyListener", null);
        setField(term350915, term350915.getClass(), "hierarchyBoundsListener", null);
        setField(term350915, term350915.getClass(), "keyListener", null);
        setField(term350915, term350915.getClass(), "mouseListener", null);
        setField(term350915, term350915.getClass(), "mouseMotionListener", null);
        setField(term350915, term350915.getClass(), "mouseWheelListener", null);
        setField(term350915, term350915.getClass(), "inputMethodListener", null);
        setLongField(term350915, term350915.getClass(), "eventMask", 0L);
        setField(term350915, term350915.getClass(), "changeSupport", null);
        setField(term350915, term350915.getClass(), "objectLock", null);
        setBooleanField(term350915, term350915.getClass(), "isPacked", false);
        setIntField(term350915, term350915.getClass(), "boundsOp", 0);
        setField(term350915, term350915.getClass(), "compoundShape", null);
        setField(term350915, term350915.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term350915, term350915.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term350915, term350915.getClass(), "backgroundEraseDisabled", false);
        setField(term350915, term350915.getClass(), "eventCache", null);
        setBooleanField(term350915, term350915.getClass(), "coalescingEnabled", false);
        setBooleanField(term350915, term350915.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term350915, term350915.getClass(), "componentSerializedDataVersion", 0);
        setField(term350915, term350915.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.RealmSetupView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllowChange", argTypes, term350915, args);
    }

};


