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

public class SpaceRaceEditorView_setAmbientEffect_100200120724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1575068;

    public SpaceRaceEditorView_setAmbientEffect_100200120724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1575068 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView"));
        setIntField(term1575068, term1575068.getClass(), "screenWidth", 0);
        setIntField(term1575068, term1575068.getClass(), "screenHeight", 0);
        setIntField(term1575068, term1575068.getClass(), "gapY", 0);
        setField(term1575068, term1575068.getClass(), "spaceRaceNameField", null);
        setField(term1575068, term1575068.getClass(), "spaceRaceNameSingleField", null);
        setField(term1575068, term1575068.getClass(), "shipTimer", null);
        setField(term1575068, term1575068.getClass(), "bridgeIdCombo", null);
        setField(term1575068, term1575068.getClass(), "attitudeCombo", null);
        setField(term1575068, term1575068.getClass(), "socialCombo", null);
        setField(term1575068, term1575068.getClass(), "genderCombo", null);
        setField(term1575068, term1575068.getClass(), "speechCombo", null);
        setField(term1575068, term1575068.getClass(), "nameGenCombo", null);
        setField(term1575068, term1575068.getClass(), "interiorPanel", null);
        setField(term1575068, term1575068.getClass(), "interiorPanel2", null);
        setField(term1575068, term1575068.getClass(), "raceImages", null);
        setIntField(term1575068, term1575068.getClass(), "customImageIndex", 0);
        setField(term1575068, term1575068.getClass(), "diplomacyMusics", null);
        setIntField(term1575068, term1575068.getClass(), "customMusicIndex", 0);
        setField(term1575068, term1575068.getClass(), "spaceRaceImageCombo", null);
        setField(term1575068, term1575068.getClass(), "browseButton", null);
        setField(term1575068, term1575068.getClass(), "browseMusicButton", null);
        setField(term1575068, term1575068.getClass(), "bridgeEffectCombo", null);
        setField(term1575068, term1575068.getClass(), "spaceShipIdCombo", null);
        setField(term1575068, term1575068.getClass(), "diplomacyMusicCombo", null);
        setIntField(term1575068, term1575068.getClass(), "hullImageCount", 0);
        setField(term1575068, term1575068.getClass(), "hullImage", null);
        setField(term1575068, term1575068.getClass(), "hullNameLabel", null);
        setField(term1575068, term1575068.getClass(), "descriptionText", null);
        setField(term1575068, term1575068.getClass(), "newRace", null);
        setField(term1575068, term1575068.getClass(), "traitPanel", null);
        setBooleanField(term1575068, term1575068.getClass(), "conflictWithId", false);
        setField(term1575068, term1575068.getClass(), "game", null);
        setBooleanField(term1575068, term1575068.getClass(), "isAlignmentXSet", false);
        setFloatField(term1575068, term1575068.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1575068, term1575068.getClass(), "isAlignmentYSet", false);
        setFloatField(term1575068, term1575068.getClass(), "alignmentY", 0.0F);
        setField(term1575068, term1575068.getClass(), "ui", null);
        setField(term1575068, term1575068.getClass(), "listenerList", null);
        setField(term1575068, term1575068.getClass(), "clientProperties", null);
        setField(term1575068, term1575068.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1575068, term1575068.getClass(), "autoscrolls", false);
        setField(term1575068, term1575068.getClass(), "border", null);
        setIntField(term1575068, term1575068.getClass(), "flags", 0);
        setField(term1575068, term1575068.getClass(), "inputVerifier", null);
        setBooleanField(term1575068, term1575068.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1575068, term1575068.getClass(), "paintingChild", null);
        setField(term1575068, term1575068.getClass(), "popupMenu", null);
        setField(term1575068, term1575068.getClass(), "revalidateRunnableScheduled", null);
        setField(term1575068, term1575068.getClass(), "focusInputMap", null);
        setField(term1575068, term1575068.getClass(), "ancestorInputMap", null);
        setField(term1575068, term1575068.getClass(), "windowInputMap", null);
        setField(term1575068, term1575068.getClass(), "actionMap", null);
        setField(term1575068, term1575068.getClass(), "aaHint", null);
        setField(term1575068, term1575068.getClass(), "lcdRenderingHint", null);
        setField(term1575068, term1575068.getClass(), "component", null);
        setField(term1575068, term1575068.getClass(), "layoutMgr", null);
        setField(term1575068, term1575068.getClass(), "dispatcher", null);
        setField(term1575068, term1575068.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1575068, term1575068.getClass(), "focusCycleRoot", false);
        setBooleanField(term1575068, term1575068.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1575068, term1575068.getClass(), "printingThreads", null);
        setBooleanField(term1575068, term1575068.getClass(), "printing", false);
        setField(term1575068, term1575068.getClass(), "containerListener", null);
        setIntField(term1575068, term1575068.getClass(), "listeningChildren", 0);
        setIntField(term1575068, term1575068.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1575068, term1575068.getClass(), "descendantsCount", 0);
        setField(term1575068, term1575068.getClass(), "preserveBackgroundColor", null);
        setIntField(term1575068, term1575068.getClass(), "numOfHWComponents", 0);
        setIntField(term1575068, term1575068.getClass(), "numOfLWComponents", 0);
        setField(term1575068, term1575068.getClass(), "modalComp", null);
        setField(term1575068, term1575068.getClass(), "modalAppContext", null);
        setIntField(term1575068, term1575068.getClass(), "containerSerializedDataVersion", 0);
        setField(term1575068, term1575068.getClass(), "peer", null);
        setField(term1575068, term1575068.getClass(), "parent", null);
        setField(term1575068, term1575068.getClass(), "appContext", null);
        setIntField(term1575068, term1575068.getClass(), "x", 0);
        setIntField(term1575068, term1575068.getClass(), "y", 0);
        setIntField(term1575068, term1575068.getClass(), "width", 0);
        setIntField(term1575068, term1575068.getClass(), "height", 0);
        setField(term1575068, term1575068.getClass(), "foreground", null);
        setField(term1575068, term1575068.getClass(), "background", null);
        setField(term1575068, term1575068.getClass(), "font", null);
        setField(term1575068, term1575068.getClass(), "peerFont", null);
        setField(term1575068, term1575068.getClass(), "cursor", null);
        setField(term1575068, term1575068.getClass(), "locale", null);
        setField(term1575068, term1575068.getClass(), "graphicsConfig", null);
        setField(term1575068, term1575068.getClass(), "bufferStrategy", null);
        setBooleanField(term1575068, term1575068.getClass(), "ignoreRepaint", false);
        setBooleanField(term1575068, term1575068.getClass(), "visible", false);
        setBooleanField(term1575068, term1575068.getClass(), "enabled", false);
        setBooleanField(term1575068, term1575068.getClass(), "valid", false);
        setField(term1575068, term1575068.getClass(), "dropTarget", null);
        setField(term1575068, term1575068.getClass(), "popups", null);
        setField(term1575068, term1575068.getClass(), "name", null);
        setBooleanField(term1575068, term1575068.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1575068, term1575068.getClass(), "focusable", false);
        setIntField(term1575068, term1575068.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1575068, term1575068.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1575068, term1575068.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1575068, term1575068.getClass(), "acc", null);
        setField(term1575068, term1575068.getClass(), "minSize", null);
        setBooleanField(term1575068, term1575068.getClass(), "minSizeSet", false);
        setField(term1575068, term1575068.getClass(), "prefSize", null);
        setBooleanField(term1575068, term1575068.getClass(), "prefSizeSet", false);
        setField(term1575068, term1575068.getClass(), "maxSize", null);
        setBooleanField(term1575068, term1575068.getClass(), "maxSizeSet", false);
        setField(term1575068, term1575068.getClass(), "componentOrientation", null);
        setBooleanField(term1575068, term1575068.getClass(), "newEventsOnly", false);
        setField(term1575068, term1575068.getClass(), "componentListener", null);
        setField(term1575068, term1575068.getClass(), "focusListener", null);
        setField(term1575068, term1575068.getClass(), "hierarchyListener", null);
        setField(term1575068, term1575068.getClass(), "hierarchyBoundsListener", null);
        setField(term1575068, term1575068.getClass(), "keyListener", null);
        setField(term1575068, term1575068.getClass(), "mouseListener", null);
        setField(term1575068, term1575068.getClass(), "mouseMotionListener", null);
        setField(term1575068, term1575068.getClass(), "mouseWheelListener", null);
        setField(term1575068, term1575068.getClass(), "inputMethodListener", null);
        setLongField(term1575068, term1575068.getClass(), "eventMask", 0L);
        setField(term1575068, term1575068.getClass(), "changeSupport", null);
        setField(term1575068, term1575068.getClass(), "objectLock", null);
        setBooleanField(term1575068, term1575068.getClass(), "isPacked", false);
        setIntField(term1575068, term1575068.getClass(), "boundsOp", 0);
        setField(term1575068, term1575068.getClass(), "compoundShape", null);
        setField(term1575068, term1575068.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1575068, term1575068.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1575068, term1575068.getClass(), "backgroundEraseDisabled", false);
        setField(term1575068, term1575068.getClass(), "eventCache", null);
        setBooleanField(term1575068, term1575068.getClass(), "coalescingEnabled", false);
        setBooleanField(term1575068, term1575068.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1575068, term1575068.getClass(), "componentSerializedDataVersion", 0);
        setField(term1575068, term1575068.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.ambient.BridgeCommandType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAmbientEffect", argTypes, term1575068, args);
    }

};


