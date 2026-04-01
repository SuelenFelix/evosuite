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

public class SpaceRaceEditorView_handleMusicSelection_29912107728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1575260;

    public SpaceRaceEditorView_handleMusicSelection_29912107728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1575260 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView"));
        setIntField(term1575260, term1575260.getClass(), "screenWidth", 0);
        setIntField(term1575260, term1575260.getClass(), "screenHeight", 0);
        setIntField(term1575260, term1575260.getClass(), "gapY", 0);
        setField(term1575260, term1575260.getClass(), "spaceRaceNameField", null);
        setField(term1575260, term1575260.getClass(), "spaceRaceNameSingleField", null);
        setField(term1575260, term1575260.getClass(), "shipTimer", null);
        setField(term1575260, term1575260.getClass(), "bridgeIdCombo", null);
        setField(term1575260, term1575260.getClass(), "attitudeCombo", null);
        setField(term1575260, term1575260.getClass(), "socialCombo", null);
        setField(term1575260, term1575260.getClass(), "genderCombo", null);
        setField(term1575260, term1575260.getClass(), "speechCombo", null);
        setField(term1575260, term1575260.getClass(), "nameGenCombo", null);
        setField(term1575260, term1575260.getClass(), "interiorPanel", null);
        setField(term1575260, term1575260.getClass(), "interiorPanel2", null);
        setField(term1575260, term1575260.getClass(), "raceImages", null);
        setIntField(term1575260, term1575260.getClass(), "customImageIndex", 0);
        setField(term1575260, term1575260.getClass(), "diplomacyMusics", null);
        setIntField(term1575260, term1575260.getClass(), "customMusicIndex", 0);
        setField(term1575260, term1575260.getClass(), "spaceRaceImageCombo", null);
        setField(term1575260, term1575260.getClass(), "browseButton", null);
        setField(term1575260, term1575260.getClass(), "browseMusicButton", null);
        setField(term1575260, term1575260.getClass(), "bridgeEffectCombo", null);
        setField(term1575260, term1575260.getClass(), "spaceShipIdCombo", null);
        setField(term1575260, term1575260.getClass(), "diplomacyMusicCombo", null);
        setIntField(term1575260, term1575260.getClass(), "hullImageCount", 0);
        setField(term1575260, term1575260.getClass(), "hullImage", null);
        setField(term1575260, term1575260.getClass(), "hullNameLabel", null);
        setField(term1575260, term1575260.getClass(), "descriptionText", null);
        setField(term1575260, term1575260.getClass(), "newRace", null);
        setField(term1575260, term1575260.getClass(), "traitPanel", null);
        setBooleanField(term1575260, term1575260.getClass(), "conflictWithId", false);
        setField(term1575260, term1575260.getClass(), "game", null);
        setBooleanField(term1575260, term1575260.getClass(), "isAlignmentXSet", false);
        setFloatField(term1575260, term1575260.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1575260, term1575260.getClass(), "isAlignmentYSet", false);
        setFloatField(term1575260, term1575260.getClass(), "alignmentY", 0.0F);
        setField(term1575260, term1575260.getClass(), "ui", null);
        setField(term1575260, term1575260.getClass(), "listenerList", null);
        setField(term1575260, term1575260.getClass(), "clientProperties", null);
        setField(term1575260, term1575260.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1575260, term1575260.getClass(), "autoscrolls", false);
        setField(term1575260, term1575260.getClass(), "border", null);
        setIntField(term1575260, term1575260.getClass(), "flags", 0);
        setField(term1575260, term1575260.getClass(), "inputVerifier", null);
        setBooleanField(term1575260, term1575260.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1575260, term1575260.getClass(), "paintingChild", null);
        setField(term1575260, term1575260.getClass(), "popupMenu", null);
        setField(term1575260, term1575260.getClass(), "revalidateRunnableScheduled", null);
        setField(term1575260, term1575260.getClass(), "focusInputMap", null);
        setField(term1575260, term1575260.getClass(), "ancestorInputMap", null);
        setField(term1575260, term1575260.getClass(), "windowInputMap", null);
        setField(term1575260, term1575260.getClass(), "actionMap", null);
        setField(term1575260, term1575260.getClass(), "aaHint", null);
        setField(term1575260, term1575260.getClass(), "lcdRenderingHint", null);
        setField(term1575260, term1575260.getClass(), "component", null);
        setField(term1575260, term1575260.getClass(), "layoutMgr", null);
        setField(term1575260, term1575260.getClass(), "dispatcher", null);
        setField(term1575260, term1575260.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1575260, term1575260.getClass(), "focusCycleRoot", false);
        setBooleanField(term1575260, term1575260.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1575260, term1575260.getClass(), "printingThreads", null);
        setBooleanField(term1575260, term1575260.getClass(), "printing", false);
        setField(term1575260, term1575260.getClass(), "containerListener", null);
        setIntField(term1575260, term1575260.getClass(), "listeningChildren", 0);
        setIntField(term1575260, term1575260.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1575260, term1575260.getClass(), "descendantsCount", 0);
        setField(term1575260, term1575260.getClass(), "preserveBackgroundColor", null);
        setIntField(term1575260, term1575260.getClass(), "numOfHWComponents", 0);
        setIntField(term1575260, term1575260.getClass(), "numOfLWComponents", 0);
        setField(term1575260, term1575260.getClass(), "modalComp", null);
        setField(term1575260, term1575260.getClass(), "modalAppContext", null);
        setIntField(term1575260, term1575260.getClass(), "containerSerializedDataVersion", 0);
        setField(term1575260, term1575260.getClass(), "peer", null);
        setField(term1575260, term1575260.getClass(), "parent", null);
        setField(term1575260, term1575260.getClass(), "appContext", null);
        setIntField(term1575260, term1575260.getClass(), "x", 0);
        setIntField(term1575260, term1575260.getClass(), "y", 0);
        setIntField(term1575260, term1575260.getClass(), "width", 0);
        setIntField(term1575260, term1575260.getClass(), "height", 0);
        setField(term1575260, term1575260.getClass(), "foreground", null);
        setField(term1575260, term1575260.getClass(), "background", null);
        setField(term1575260, term1575260.getClass(), "font", null);
        setField(term1575260, term1575260.getClass(), "peerFont", null);
        setField(term1575260, term1575260.getClass(), "cursor", null);
        setField(term1575260, term1575260.getClass(), "locale", null);
        setField(term1575260, term1575260.getClass(), "graphicsConfig", null);
        setField(term1575260, term1575260.getClass(), "bufferStrategy", null);
        setBooleanField(term1575260, term1575260.getClass(), "ignoreRepaint", false);
        setBooleanField(term1575260, term1575260.getClass(), "visible", false);
        setBooleanField(term1575260, term1575260.getClass(), "enabled", false);
        setBooleanField(term1575260, term1575260.getClass(), "valid", false);
        setField(term1575260, term1575260.getClass(), "dropTarget", null);
        setField(term1575260, term1575260.getClass(), "popups", null);
        setField(term1575260, term1575260.getClass(), "name", null);
        setBooleanField(term1575260, term1575260.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1575260, term1575260.getClass(), "focusable", false);
        setIntField(term1575260, term1575260.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1575260, term1575260.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1575260, term1575260.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1575260, term1575260.getClass(), "acc", null);
        setField(term1575260, term1575260.getClass(), "minSize", null);
        setBooleanField(term1575260, term1575260.getClass(), "minSizeSet", false);
        setField(term1575260, term1575260.getClass(), "prefSize", null);
        setBooleanField(term1575260, term1575260.getClass(), "prefSizeSet", false);
        setField(term1575260, term1575260.getClass(), "maxSize", null);
        setBooleanField(term1575260, term1575260.getClass(), "maxSizeSet", false);
        setField(term1575260, term1575260.getClass(), "componentOrientation", null);
        setBooleanField(term1575260, term1575260.getClass(), "newEventsOnly", false);
        setField(term1575260, term1575260.getClass(), "componentListener", null);
        setField(term1575260, term1575260.getClass(), "focusListener", null);
        setField(term1575260, term1575260.getClass(), "hierarchyListener", null);
        setField(term1575260, term1575260.getClass(), "hierarchyBoundsListener", null);
        setField(term1575260, term1575260.getClass(), "keyListener", null);
        setField(term1575260, term1575260.getClass(), "mouseListener", null);
        setField(term1575260, term1575260.getClass(), "mouseMotionListener", null);
        setField(term1575260, term1575260.getClass(), "mouseWheelListener", null);
        setField(term1575260, term1575260.getClass(), "inputMethodListener", null);
        setLongField(term1575260, term1575260.getClass(), "eventMask", 0L);
        setField(term1575260, term1575260.getClass(), "changeSupport", null);
        setField(term1575260, term1575260.getClass(), "objectLock", null);
        setBooleanField(term1575260, term1575260.getClass(), "isPacked", false);
        setIntField(term1575260, term1575260.getClass(), "boundsOp", 0);
        setField(term1575260, term1575260.getClass(), "compoundShape", null);
        setField(term1575260, term1575260.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1575260, term1575260.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1575260, term1575260.getClass(), "backgroundEraseDisabled", false);
        setField(term1575260, term1575260.getClass(), "eventCache", null);
        setBooleanField(term1575260, term1575260.getClass(), "coalescingEnabled", false);
        setBooleanField(term1575260, term1575260.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1575260, term1575260.getClass(), "componentSerializedDataVersion", 0);
        setField(term1575260, term1575260.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleMusicSelection", argTypes, term1575260, args);
    }

};


