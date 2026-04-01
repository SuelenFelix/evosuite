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

public class SpaceRaceEditorView_initSpaceRaceImages_204352213919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1574828;

    public SpaceRaceEditorView_initSpaceRaceImages_204352213919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1574828 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView"));
        setIntField(term1574828, term1574828.getClass(), "screenWidth", 0);
        setIntField(term1574828, term1574828.getClass(), "screenHeight", 0);
        setIntField(term1574828, term1574828.getClass(), "gapY", 0);
        setField(term1574828, term1574828.getClass(), "spaceRaceNameField", null);
        setField(term1574828, term1574828.getClass(), "spaceRaceNameSingleField", null);
        setField(term1574828, term1574828.getClass(), "shipTimer", null);
        setField(term1574828, term1574828.getClass(), "bridgeIdCombo", null);
        setField(term1574828, term1574828.getClass(), "attitudeCombo", null);
        setField(term1574828, term1574828.getClass(), "socialCombo", null);
        setField(term1574828, term1574828.getClass(), "genderCombo", null);
        setField(term1574828, term1574828.getClass(), "speechCombo", null);
        setField(term1574828, term1574828.getClass(), "nameGenCombo", null);
        setField(term1574828, term1574828.getClass(), "interiorPanel", null);
        setField(term1574828, term1574828.getClass(), "interiorPanel2", null);
        setField(term1574828, term1574828.getClass(), "raceImages", null);
        setIntField(term1574828, term1574828.getClass(), "customImageIndex", 0);
        setField(term1574828, term1574828.getClass(), "diplomacyMusics", null);
        setIntField(term1574828, term1574828.getClass(), "customMusicIndex", 0);
        setField(term1574828, term1574828.getClass(), "spaceRaceImageCombo", null);
        setField(term1574828, term1574828.getClass(), "browseButton", null);
        setField(term1574828, term1574828.getClass(), "browseMusicButton", null);
        setField(term1574828, term1574828.getClass(), "bridgeEffectCombo", null);
        setField(term1574828, term1574828.getClass(), "spaceShipIdCombo", null);
        setField(term1574828, term1574828.getClass(), "diplomacyMusicCombo", null);
        setIntField(term1574828, term1574828.getClass(), "hullImageCount", 0);
        setField(term1574828, term1574828.getClass(), "hullImage", null);
        setField(term1574828, term1574828.getClass(), "hullNameLabel", null);
        setField(term1574828, term1574828.getClass(), "descriptionText", null);
        setField(term1574828, term1574828.getClass(), "newRace", null);
        setField(term1574828, term1574828.getClass(), "traitPanel", null);
        setBooleanField(term1574828, term1574828.getClass(), "conflictWithId", false);
        setField(term1574828, term1574828.getClass(), "game", null);
        setBooleanField(term1574828, term1574828.getClass(), "isAlignmentXSet", false);
        setFloatField(term1574828, term1574828.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1574828, term1574828.getClass(), "isAlignmentYSet", false);
        setFloatField(term1574828, term1574828.getClass(), "alignmentY", 0.0F);
        setField(term1574828, term1574828.getClass(), "ui", null);
        setField(term1574828, term1574828.getClass(), "listenerList", null);
        setField(term1574828, term1574828.getClass(), "clientProperties", null);
        setField(term1574828, term1574828.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1574828, term1574828.getClass(), "autoscrolls", false);
        setField(term1574828, term1574828.getClass(), "border", null);
        setIntField(term1574828, term1574828.getClass(), "flags", 0);
        setField(term1574828, term1574828.getClass(), "inputVerifier", null);
        setBooleanField(term1574828, term1574828.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1574828, term1574828.getClass(), "paintingChild", null);
        setField(term1574828, term1574828.getClass(), "popupMenu", null);
        setField(term1574828, term1574828.getClass(), "revalidateRunnableScheduled", null);
        setField(term1574828, term1574828.getClass(), "focusInputMap", null);
        setField(term1574828, term1574828.getClass(), "ancestorInputMap", null);
        setField(term1574828, term1574828.getClass(), "windowInputMap", null);
        setField(term1574828, term1574828.getClass(), "actionMap", null);
        setField(term1574828, term1574828.getClass(), "aaHint", null);
        setField(term1574828, term1574828.getClass(), "lcdRenderingHint", null);
        setField(term1574828, term1574828.getClass(), "component", null);
        setField(term1574828, term1574828.getClass(), "layoutMgr", null);
        setField(term1574828, term1574828.getClass(), "dispatcher", null);
        setField(term1574828, term1574828.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1574828, term1574828.getClass(), "focusCycleRoot", false);
        setBooleanField(term1574828, term1574828.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1574828, term1574828.getClass(), "printingThreads", null);
        setBooleanField(term1574828, term1574828.getClass(), "printing", false);
        setField(term1574828, term1574828.getClass(), "containerListener", null);
        setIntField(term1574828, term1574828.getClass(), "listeningChildren", 0);
        setIntField(term1574828, term1574828.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1574828, term1574828.getClass(), "descendantsCount", 0);
        setField(term1574828, term1574828.getClass(), "preserveBackgroundColor", null);
        setIntField(term1574828, term1574828.getClass(), "numOfHWComponents", 0);
        setIntField(term1574828, term1574828.getClass(), "numOfLWComponents", 0);
        setField(term1574828, term1574828.getClass(), "modalComp", null);
        setField(term1574828, term1574828.getClass(), "modalAppContext", null);
        setIntField(term1574828, term1574828.getClass(), "containerSerializedDataVersion", 0);
        setField(term1574828, term1574828.getClass(), "peer", null);
        setField(term1574828, term1574828.getClass(), "parent", null);
        setField(term1574828, term1574828.getClass(), "appContext", null);
        setIntField(term1574828, term1574828.getClass(), "x", 0);
        setIntField(term1574828, term1574828.getClass(), "y", 0);
        setIntField(term1574828, term1574828.getClass(), "width", 0);
        setIntField(term1574828, term1574828.getClass(), "height", 0);
        setField(term1574828, term1574828.getClass(), "foreground", null);
        setField(term1574828, term1574828.getClass(), "background", null);
        setField(term1574828, term1574828.getClass(), "font", null);
        setField(term1574828, term1574828.getClass(), "peerFont", null);
        setField(term1574828, term1574828.getClass(), "cursor", null);
        setField(term1574828, term1574828.getClass(), "locale", null);
        setField(term1574828, term1574828.getClass(), "graphicsConfig", null);
        setField(term1574828, term1574828.getClass(), "bufferStrategy", null);
        setBooleanField(term1574828, term1574828.getClass(), "ignoreRepaint", false);
        setBooleanField(term1574828, term1574828.getClass(), "visible", false);
        setBooleanField(term1574828, term1574828.getClass(), "enabled", false);
        setBooleanField(term1574828, term1574828.getClass(), "valid", false);
        setField(term1574828, term1574828.getClass(), "dropTarget", null);
        setField(term1574828, term1574828.getClass(), "popups", null);
        setField(term1574828, term1574828.getClass(), "name", null);
        setBooleanField(term1574828, term1574828.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1574828, term1574828.getClass(), "focusable", false);
        setIntField(term1574828, term1574828.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1574828, term1574828.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1574828, term1574828.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1574828, term1574828.getClass(), "acc", null);
        setField(term1574828, term1574828.getClass(), "minSize", null);
        setBooleanField(term1574828, term1574828.getClass(), "minSizeSet", false);
        setField(term1574828, term1574828.getClass(), "prefSize", null);
        setBooleanField(term1574828, term1574828.getClass(), "prefSizeSet", false);
        setField(term1574828, term1574828.getClass(), "maxSize", null);
        setBooleanField(term1574828, term1574828.getClass(), "maxSizeSet", false);
        setField(term1574828, term1574828.getClass(), "componentOrientation", null);
        setBooleanField(term1574828, term1574828.getClass(), "newEventsOnly", false);
        setField(term1574828, term1574828.getClass(), "componentListener", null);
        setField(term1574828, term1574828.getClass(), "focusListener", null);
        setField(term1574828, term1574828.getClass(), "hierarchyListener", null);
        setField(term1574828, term1574828.getClass(), "hierarchyBoundsListener", null);
        setField(term1574828, term1574828.getClass(), "keyListener", null);
        setField(term1574828, term1574828.getClass(), "mouseListener", null);
        setField(term1574828, term1574828.getClass(), "mouseMotionListener", null);
        setField(term1574828, term1574828.getClass(), "mouseWheelListener", null);
        setField(term1574828, term1574828.getClass(), "inputMethodListener", null);
        setLongField(term1574828, term1574828.getClass(), "eventMask", 0L);
        setField(term1574828, term1574828.getClass(), "changeSupport", null);
        setField(term1574828, term1574828.getClass(), "objectLock", null);
        setBooleanField(term1574828, term1574828.getClass(), "isPacked", false);
        setIntField(term1574828, term1574828.getClass(), "boundsOp", 0);
        setField(term1574828, term1574828.getClass(), "compoundShape", null);
        setField(term1574828, term1574828.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1574828, term1574828.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1574828, term1574828.getClass(), "backgroundEraseDisabled", false);
        setField(term1574828, term1574828.getClass(), "eventCache", null);
        setBooleanField(term1574828, term1574828.getClass(), "coalescingEnabled", false);
        setBooleanField(term1574828, term1574828.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1574828, term1574828.getClass(), "componentSerializedDataVersion", 0);
        setField(term1574828, term1574828.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initSpaceRaceImages", argTypes, term1574828, args);
    }

};


