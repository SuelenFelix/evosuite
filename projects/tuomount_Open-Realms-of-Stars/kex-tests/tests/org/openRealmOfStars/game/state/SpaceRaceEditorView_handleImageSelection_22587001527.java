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

public class SpaceRaceEditorView_handleImageSelection_22587001527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1575212;

    public SpaceRaceEditorView_handleImageSelection_22587001527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1575212 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView"));
        setIntField(term1575212, term1575212.getClass(), "screenWidth", 0);
        setIntField(term1575212, term1575212.getClass(), "screenHeight", 0);
        setIntField(term1575212, term1575212.getClass(), "gapY", 0);
        setField(term1575212, term1575212.getClass(), "spaceRaceNameField", null);
        setField(term1575212, term1575212.getClass(), "spaceRaceNameSingleField", null);
        setField(term1575212, term1575212.getClass(), "shipTimer", null);
        setField(term1575212, term1575212.getClass(), "bridgeIdCombo", null);
        setField(term1575212, term1575212.getClass(), "attitudeCombo", null);
        setField(term1575212, term1575212.getClass(), "socialCombo", null);
        setField(term1575212, term1575212.getClass(), "genderCombo", null);
        setField(term1575212, term1575212.getClass(), "speechCombo", null);
        setField(term1575212, term1575212.getClass(), "nameGenCombo", null);
        setField(term1575212, term1575212.getClass(), "interiorPanel", null);
        setField(term1575212, term1575212.getClass(), "interiorPanel2", null);
        setField(term1575212, term1575212.getClass(), "raceImages", null);
        setIntField(term1575212, term1575212.getClass(), "customImageIndex", 0);
        setField(term1575212, term1575212.getClass(), "diplomacyMusics", null);
        setIntField(term1575212, term1575212.getClass(), "customMusicIndex", 0);
        setField(term1575212, term1575212.getClass(), "spaceRaceImageCombo", null);
        setField(term1575212, term1575212.getClass(), "browseButton", null);
        setField(term1575212, term1575212.getClass(), "browseMusicButton", null);
        setField(term1575212, term1575212.getClass(), "bridgeEffectCombo", null);
        setField(term1575212, term1575212.getClass(), "spaceShipIdCombo", null);
        setField(term1575212, term1575212.getClass(), "diplomacyMusicCombo", null);
        setIntField(term1575212, term1575212.getClass(), "hullImageCount", 0);
        setField(term1575212, term1575212.getClass(), "hullImage", null);
        setField(term1575212, term1575212.getClass(), "hullNameLabel", null);
        setField(term1575212, term1575212.getClass(), "descriptionText", null);
        setField(term1575212, term1575212.getClass(), "newRace", null);
        setField(term1575212, term1575212.getClass(), "traitPanel", null);
        setBooleanField(term1575212, term1575212.getClass(), "conflictWithId", false);
        setField(term1575212, term1575212.getClass(), "game", null);
        setBooleanField(term1575212, term1575212.getClass(), "isAlignmentXSet", false);
        setFloatField(term1575212, term1575212.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1575212, term1575212.getClass(), "isAlignmentYSet", false);
        setFloatField(term1575212, term1575212.getClass(), "alignmentY", 0.0F);
        setField(term1575212, term1575212.getClass(), "ui", null);
        setField(term1575212, term1575212.getClass(), "listenerList", null);
        setField(term1575212, term1575212.getClass(), "clientProperties", null);
        setField(term1575212, term1575212.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1575212, term1575212.getClass(), "autoscrolls", false);
        setField(term1575212, term1575212.getClass(), "border", null);
        setIntField(term1575212, term1575212.getClass(), "flags", 0);
        setField(term1575212, term1575212.getClass(), "inputVerifier", null);
        setBooleanField(term1575212, term1575212.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1575212, term1575212.getClass(), "paintingChild", null);
        setField(term1575212, term1575212.getClass(), "popupMenu", null);
        setField(term1575212, term1575212.getClass(), "revalidateRunnableScheduled", null);
        setField(term1575212, term1575212.getClass(), "focusInputMap", null);
        setField(term1575212, term1575212.getClass(), "ancestorInputMap", null);
        setField(term1575212, term1575212.getClass(), "windowInputMap", null);
        setField(term1575212, term1575212.getClass(), "actionMap", null);
        setField(term1575212, term1575212.getClass(), "aaHint", null);
        setField(term1575212, term1575212.getClass(), "lcdRenderingHint", null);
        setField(term1575212, term1575212.getClass(), "component", null);
        setField(term1575212, term1575212.getClass(), "layoutMgr", null);
        setField(term1575212, term1575212.getClass(), "dispatcher", null);
        setField(term1575212, term1575212.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1575212, term1575212.getClass(), "focusCycleRoot", false);
        setBooleanField(term1575212, term1575212.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1575212, term1575212.getClass(), "printingThreads", null);
        setBooleanField(term1575212, term1575212.getClass(), "printing", false);
        setField(term1575212, term1575212.getClass(), "containerListener", null);
        setIntField(term1575212, term1575212.getClass(), "listeningChildren", 0);
        setIntField(term1575212, term1575212.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1575212, term1575212.getClass(), "descendantsCount", 0);
        setField(term1575212, term1575212.getClass(), "preserveBackgroundColor", null);
        setIntField(term1575212, term1575212.getClass(), "numOfHWComponents", 0);
        setIntField(term1575212, term1575212.getClass(), "numOfLWComponents", 0);
        setField(term1575212, term1575212.getClass(), "modalComp", null);
        setField(term1575212, term1575212.getClass(), "modalAppContext", null);
        setIntField(term1575212, term1575212.getClass(), "containerSerializedDataVersion", 0);
        setField(term1575212, term1575212.getClass(), "peer", null);
        setField(term1575212, term1575212.getClass(), "parent", null);
        setField(term1575212, term1575212.getClass(), "appContext", null);
        setIntField(term1575212, term1575212.getClass(), "x", 0);
        setIntField(term1575212, term1575212.getClass(), "y", 0);
        setIntField(term1575212, term1575212.getClass(), "width", 0);
        setIntField(term1575212, term1575212.getClass(), "height", 0);
        setField(term1575212, term1575212.getClass(), "foreground", null);
        setField(term1575212, term1575212.getClass(), "background", null);
        setField(term1575212, term1575212.getClass(), "font", null);
        setField(term1575212, term1575212.getClass(), "peerFont", null);
        setField(term1575212, term1575212.getClass(), "cursor", null);
        setField(term1575212, term1575212.getClass(), "locale", null);
        setField(term1575212, term1575212.getClass(), "graphicsConfig", null);
        setField(term1575212, term1575212.getClass(), "bufferStrategy", null);
        setBooleanField(term1575212, term1575212.getClass(), "ignoreRepaint", false);
        setBooleanField(term1575212, term1575212.getClass(), "visible", false);
        setBooleanField(term1575212, term1575212.getClass(), "enabled", false);
        setBooleanField(term1575212, term1575212.getClass(), "valid", false);
        setField(term1575212, term1575212.getClass(), "dropTarget", null);
        setField(term1575212, term1575212.getClass(), "popups", null);
        setField(term1575212, term1575212.getClass(), "name", null);
        setBooleanField(term1575212, term1575212.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1575212, term1575212.getClass(), "focusable", false);
        setIntField(term1575212, term1575212.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1575212, term1575212.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1575212, term1575212.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1575212, term1575212.getClass(), "acc", null);
        setField(term1575212, term1575212.getClass(), "minSize", null);
        setBooleanField(term1575212, term1575212.getClass(), "minSizeSet", false);
        setField(term1575212, term1575212.getClass(), "prefSize", null);
        setBooleanField(term1575212, term1575212.getClass(), "prefSizeSet", false);
        setField(term1575212, term1575212.getClass(), "maxSize", null);
        setBooleanField(term1575212, term1575212.getClass(), "maxSizeSet", false);
        setField(term1575212, term1575212.getClass(), "componentOrientation", null);
        setBooleanField(term1575212, term1575212.getClass(), "newEventsOnly", false);
        setField(term1575212, term1575212.getClass(), "componentListener", null);
        setField(term1575212, term1575212.getClass(), "focusListener", null);
        setField(term1575212, term1575212.getClass(), "hierarchyListener", null);
        setField(term1575212, term1575212.getClass(), "hierarchyBoundsListener", null);
        setField(term1575212, term1575212.getClass(), "keyListener", null);
        setField(term1575212, term1575212.getClass(), "mouseListener", null);
        setField(term1575212, term1575212.getClass(), "mouseMotionListener", null);
        setField(term1575212, term1575212.getClass(), "mouseWheelListener", null);
        setField(term1575212, term1575212.getClass(), "inputMethodListener", null);
        setLongField(term1575212, term1575212.getClass(), "eventMask", 0L);
        setField(term1575212, term1575212.getClass(), "changeSupport", null);
        setField(term1575212, term1575212.getClass(), "objectLock", null);
        setBooleanField(term1575212, term1575212.getClass(), "isPacked", false);
        setIntField(term1575212, term1575212.getClass(), "boundsOp", 0);
        setField(term1575212, term1575212.getClass(), "compoundShape", null);
        setField(term1575212, term1575212.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1575212, term1575212.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1575212, term1575212.getClass(), "backgroundEraseDisabled", false);
        setField(term1575212, term1575212.getClass(), "eventCache", null);
        setBooleanField(term1575212, term1575212.getClass(), "coalescingEnabled", false);
        setBooleanField(term1575212, term1575212.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1575212, term1575212.getClass(), "componentSerializedDataVersion", 0);
        setField(term1575212, term1575212.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleImageSelection", argTypes, term1575212, args);
    }

};


