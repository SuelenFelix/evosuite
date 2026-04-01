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

public class SpaceRaceEditorView_createBehaviourTab_5586416017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1574732;

    public SpaceRaceEditorView_createBehaviourTab_5586416017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1574732 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView"));
        setIntField(term1574732, term1574732.getClass(), "screenWidth", 0);
        setIntField(term1574732, term1574732.getClass(), "screenHeight", 0);
        setIntField(term1574732, term1574732.getClass(), "gapY", 0);
        setField(term1574732, term1574732.getClass(), "spaceRaceNameField", null);
        setField(term1574732, term1574732.getClass(), "spaceRaceNameSingleField", null);
        setField(term1574732, term1574732.getClass(), "shipTimer", null);
        setField(term1574732, term1574732.getClass(), "bridgeIdCombo", null);
        setField(term1574732, term1574732.getClass(), "attitudeCombo", null);
        setField(term1574732, term1574732.getClass(), "socialCombo", null);
        setField(term1574732, term1574732.getClass(), "genderCombo", null);
        setField(term1574732, term1574732.getClass(), "speechCombo", null);
        setField(term1574732, term1574732.getClass(), "nameGenCombo", null);
        setField(term1574732, term1574732.getClass(), "interiorPanel", null);
        setField(term1574732, term1574732.getClass(), "interiorPanel2", null);
        setField(term1574732, term1574732.getClass(), "raceImages", null);
        setIntField(term1574732, term1574732.getClass(), "customImageIndex", 0);
        setField(term1574732, term1574732.getClass(), "diplomacyMusics", null);
        setIntField(term1574732, term1574732.getClass(), "customMusicIndex", 0);
        setField(term1574732, term1574732.getClass(), "spaceRaceImageCombo", null);
        setField(term1574732, term1574732.getClass(), "browseButton", null);
        setField(term1574732, term1574732.getClass(), "browseMusicButton", null);
        setField(term1574732, term1574732.getClass(), "bridgeEffectCombo", null);
        setField(term1574732, term1574732.getClass(), "spaceShipIdCombo", null);
        setField(term1574732, term1574732.getClass(), "diplomacyMusicCombo", null);
        setIntField(term1574732, term1574732.getClass(), "hullImageCount", 0);
        setField(term1574732, term1574732.getClass(), "hullImage", null);
        setField(term1574732, term1574732.getClass(), "hullNameLabel", null);
        setField(term1574732, term1574732.getClass(), "descriptionText", null);
        setField(term1574732, term1574732.getClass(), "newRace", null);
        setField(term1574732, term1574732.getClass(), "traitPanel", null);
        setBooleanField(term1574732, term1574732.getClass(), "conflictWithId", false);
        setField(term1574732, term1574732.getClass(), "game", null);
        setBooleanField(term1574732, term1574732.getClass(), "isAlignmentXSet", false);
        setFloatField(term1574732, term1574732.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1574732, term1574732.getClass(), "isAlignmentYSet", false);
        setFloatField(term1574732, term1574732.getClass(), "alignmentY", 0.0F);
        setField(term1574732, term1574732.getClass(), "ui", null);
        setField(term1574732, term1574732.getClass(), "listenerList", null);
        setField(term1574732, term1574732.getClass(), "clientProperties", null);
        setField(term1574732, term1574732.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1574732, term1574732.getClass(), "autoscrolls", false);
        setField(term1574732, term1574732.getClass(), "border", null);
        setIntField(term1574732, term1574732.getClass(), "flags", 0);
        setField(term1574732, term1574732.getClass(), "inputVerifier", null);
        setBooleanField(term1574732, term1574732.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1574732, term1574732.getClass(), "paintingChild", null);
        setField(term1574732, term1574732.getClass(), "popupMenu", null);
        setField(term1574732, term1574732.getClass(), "revalidateRunnableScheduled", null);
        setField(term1574732, term1574732.getClass(), "focusInputMap", null);
        setField(term1574732, term1574732.getClass(), "ancestorInputMap", null);
        setField(term1574732, term1574732.getClass(), "windowInputMap", null);
        setField(term1574732, term1574732.getClass(), "actionMap", null);
        setField(term1574732, term1574732.getClass(), "aaHint", null);
        setField(term1574732, term1574732.getClass(), "lcdRenderingHint", null);
        setField(term1574732, term1574732.getClass(), "component", null);
        setField(term1574732, term1574732.getClass(), "layoutMgr", null);
        setField(term1574732, term1574732.getClass(), "dispatcher", null);
        setField(term1574732, term1574732.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1574732, term1574732.getClass(), "focusCycleRoot", false);
        setBooleanField(term1574732, term1574732.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1574732, term1574732.getClass(), "printingThreads", null);
        setBooleanField(term1574732, term1574732.getClass(), "printing", false);
        setField(term1574732, term1574732.getClass(), "containerListener", null);
        setIntField(term1574732, term1574732.getClass(), "listeningChildren", 0);
        setIntField(term1574732, term1574732.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1574732, term1574732.getClass(), "descendantsCount", 0);
        setField(term1574732, term1574732.getClass(), "preserveBackgroundColor", null);
        setIntField(term1574732, term1574732.getClass(), "numOfHWComponents", 0);
        setIntField(term1574732, term1574732.getClass(), "numOfLWComponents", 0);
        setField(term1574732, term1574732.getClass(), "modalComp", null);
        setField(term1574732, term1574732.getClass(), "modalAppContext", null);
        setIntField(term1574732, term1574732.getClass(), "containerSerializedDataVersion", 0);
        setField(term1574732, term1574732.getClass(), "peer", null);
        setField(term1574732, term1574732.getClass(), "parent", null);
        setField(term1574732, term1574732.getClass(), "appContext", null);
        setIntField(term1574732, term1574732.getClass(), "x", 0);
        setIntField(term1574732, term1574732.getClass(), "y", 0);
        setIntField(term1574732, term1574732.getClass(), "width", 0);
        setIntField(term1574732, term1574732.getClass(), "height", 0);
        setField(term1574732, term1574732.getClass(), "foreground", null);
        setField(term1574732, term1574732.getClass(), "background", null);
        setField(term1574732, term1574732.getClass(), "font", null);
        setField(term1574732, term1574732.getClass(), "peerFont", null);
        setField(term1574732, term1574732.getClass(), "cursor", null);
        setField(term1574732, term1574732.getClass(), "locale", null);
        setField(term1574732, term1574732.getClass(), "graphicsConfig", null);
        setField(term1574732, term1574732.getClass(), "bufferStrategy", null);
        setBooleanField(term1574732, term1574732.getClass(), "ignoreRepaint", false);
        setBooleanField(term1574732, term1574732.getClass(), "visible", false);
        setBooleanField(term1574732, term1574732.getClass(), "enabled", false);
        setBooleanField(term1574732, term1574732.getClass(), "valid", false);
        setField(term1574732, term1574732.getClass(), "dropTarget", null);
        setField(term1574732, term1574732.getClass(), "popups", null);
        setField(term1574732, term1574732.getClass(), "name", null);
        setBooleanField(term1574732, term1574732.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1574732, term1574732.getClass(), "focusable", false);
        setIntField(term1574732, term1574732.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1574732, term1574732.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1574732, term1574732.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1574732, term1574732.getClass(), "acc", null);
        setField(term1574732, term1574732.getClass(), "minSize", null);
        setBooleanField(term1574732, term1574732.getClass(), "minSizeSet", false);
        setField(term1574732, term1574732.getClass(), "prefSize", null);
        setBooleanField(term1574732, term1574732.getClass(), "prefSizeSet", false);
        setField(term1574732, term1574732.getClass(), "maxSize", null);
        setBooleanField(term1574732, term1574732.getClass(), "maxSizeSet", false);
        setField(term1574732, term1574732.getClass(), "componentOrientation", null);
        setBooleanField(term1574732, term1574732.getClass(), "newEventsOnly", false);
        setField(term1574732, term1574732.getClass(), "componentListener", null);
        setField(term1574732, term1574732.getClass(), "focusListener", null);
        setField(term1574732, term1574732.getClass(), "hierarchyListener", null);
        setField(term1574732, term1574732.getClass(), "hierarchyBoundsListener", null);
        setField(term1574732, term1574732.getClass(), "keyListener", null);
        setField(term1574732, term1574732.getClass(), "mouseListener", null);
        setField(term1574732, term1574732.getClass(), "mouseMotionListener", null);
        setField(term1574732, term1574732.getClass(), "mouseWheelListener", null);
        setField(term1574732, term1574732.getClass(), "inputMethodListener", null);
        setLongField(term1574732, term1574732.getClass(), "eventMask", 0L);
        setField(term1574732, term1574732.getClass(), "changeSupport", null);
        setField(term1574732, term1574732.getClass(), "objectLock", null);
        setBooleanField(term1574732, term1574732.getClass(), "isPacked", false);
        setIntField(term1574732, term1574732.getClass(), "boundsOp", 0);
        setField(term1574732, term1574732.getClass(), "compoundShape", null);
        setField(term1574732, term1574732.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1574732, term1574732.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1574732, term1574732.getClass(), "backgroundEraseDisabled", false);
        setField(term1574732, term1574732.getClass(), "eventCache", null);
        setBooleanField(term1574732, term1574732.getClass(), "coalescingEnabled", false);
        setBooleanField(term1574732, term1574732.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1574732, term1574732.getClass(), "componentSerializedDataVersion", 0);
        setField(term1574732, term1574732.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createBehaviourTab", argTypes, term1574732, args);
    }

};


