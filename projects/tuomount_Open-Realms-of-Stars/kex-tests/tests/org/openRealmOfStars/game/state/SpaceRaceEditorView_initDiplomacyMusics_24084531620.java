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

public class SpaceRaceEditorView_initDiplomacyMusics_24084531620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1574876;

    public SpaceRaceEditorView_initDiplomacyMusics_24084531620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1574876 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView"));
        setIntField(term1574876, term1574876.getClass(), "screenWidth", 0);
        setIntField(term1574876, term1574876.getClass(), "screenHeight", 0);
        setIntField(term1574876, term1574876.getClass(), "gapY", 0);
        setField(term1574876, term1574876.getClass(), "spaceRaceNameField", null);
        setField(term1574876, term1574876.getClass(), "spaceRaceNameSingleField", null);
        setField(term1574876, term1574876.getClass(), "shipTimer", null);
        setField(term1574876, term1574876.getClass(), "bridgeIdCombo", null);
        setField(term1574876, term1574876.getClass(), "attitudeCombo", null);
        setField(term1574876, term1574876.getClass(), "socialCombo", null);
        setField(term1574876, term1574876.getClass(), "genderCombo", null);
        setField(term1574876, term1574876.getClass(), "speechCombo", null);
        setField(term1574876, term1574876.getClass(), "nameGenCombo", null);
        setField(term1574876, term1574876.getClass(), "interiorPanel", null);
        setField(term1574876, term1574876.getClass(), "interiorPanel2", null);
        setField(term1574876, term1574876.getClass(), "raceImages", null);
        setIntField(term1574876, term1574876.getClass(), "customImageIndex", 0);
        setField(term1574876, term1574876.getClass(), "diplomacyMusics", null);
        setIntField(term1574876, term1574876.getClass(), "customMusicIndex", 0);
        setField(term1574876, term1574876.getClass(), "spaceRaceImageCombo", null);
        setField(term1574876, term1574876.getClass(), "browseButton", null);
        setField(term1574876, term1574876.getClass(), "browseMusicButton", null);
        setField(term1574876, term1574876.getClass(), "bridgeEffectCombo", null);
        setField(term1574876, term1574876.getClass(), "spaceShipIdCombo", null);
        setField(term1574876, term1574876.getClass(), "diplomacyMusicCombo", null);
        setIntField(term1574876, term1574876.getClass(), "hullImageCount", 0);
        setField(term1574876, term1574876.getClass(), "hullImage", null);
        setField(term1574876, term1574876.getClass(), "hullNameLabel", null);
        setField(term1574876, term1574876.getClass(), "descriptionText", null);
        setField(term1574876, term1574876.getClass(), "newRace", null);
        setField(term1574876, term1574876.getClass(), "traitPanel", null);
        setBooleanField(term1574876, term1574876.getClass(), "conflictWithId", false);
        setField(term1574876, term1574876.getClass(), "game", null);
        setBooleanField(term1574876, term1574876.getClass(), "isAlignmentXSet", false);
        setFloatField(term1574876, term1574876.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1574876, term1574876.getClass(), "isAlignmentYSet", false);
        setFloatField(term1574876, term1574876.getClass(), "alignmentY", 0.0F);
        setField(term1574876, term1574876.getClass(), "ui", null);
        setField(term1574876, term1574876.getClass(), "listenerList", null);
        setField(term1574876, term1574876.getClass(), "clientProperties", null);
        setField(term1574876, term1574876.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1574876, term1574876.getClass(), "autoscrolls", false);
        setField(term1574876, term1574876.getClass(), "border", null);
        setIntField(term1574876, term1574876.getClass(), "flags", 0);
        setField(term1574876, term1574876.getClass(), "inputVerifier", null);
        setBooleanField(term1574876, term1574876.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1574876, term1574876.getClass(), "paintingChild", null);
        setField(term1574876, term1574876.getClass(), "popupMenu", null);
        setField(term1574876, term1574876.getClass(), "revalidateRunnableScheduled", null);
        setField(term1574876, term1574876.getClass(), "focusInputMap", null);
        setField(term1574876, term1574876.getClass(), "ancestorInputMap", null);
        setField(term1574876, term1574876.getClass(), "windowInputMap", null);
        setField(term1574876, term1574876.getClass(), "actionMap", null);
        setField(term1574876, term1574876.getClass(), "aaHint", null);
        setField(term1574876, term1574876.getClass(), "lcdRenderingHint", null);
        setField(term1574876, term1574876.getClass(), "component", null);
        setField(term1574876, term1574876.getClass(), "layoutMgr", null);
        setField(term1574876, term1574876.getClass(), "dispatcher", null);
        setField(term1574876, term1574876.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1574876, term1574876.getClass(), "focusCycleRoot", false);
        setBooleanField(term1574876, term1574876.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1574876, term1574876.getClass(), "printingThreads", null);
        setBooleanField(term1574876, term1574876.getClass(), "printing", false);
        setField(term1574876, term1574876.getClass(), "containerListener", null);
        setIntField(term1574876, term1574876.getClass(), "listeningChildren", 0);
        setIntField(term1574876, term1574876.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1574876, term1574876.getClass(), "descendantsCount", 0);
        setField(term1574876, term1574876.getClass(), "preserveBackgroundColor", null);
        setIntField(term1574876, term1574876.getClass(), "numOfHWComponents", 0);
        setIntField(term1574876, term1574876.getClass(), "numOfLWComponents", 0);
        setField(term1574876, term1574876.getClass(), "modalComp", null);
        setField(term1574876, term1574876.getClass(), "modalAppContext", null);
        setIntField(term1574876, term1574876.getClass(), "containerSerializedDataVersion", 0);
        setField(term1574876, term1574876.getClass(), "peer", null);
        setField(term1574876, term1574876.getClass(), "parent", null);
        setField(term1574876, term1574876.getClass(), "appContext", null);
        setIntField(term1574876, term1574876.getClass(), "x", 0);
        setIntField(term1574876, term1574876.getClass(), "y", 0);
        setIntField(term1574876, term1574876.getClass(), "width", 0);
        setIntField(term1574876, term1574876.getClass(), "height", 0);
        setField(term1574876, term1574876.getClass(), "foreground", null);
        setField(term1574876, term1574876.getClass(), "background", null);
        setField(term1574876, term1574876.getClass(), "font", null);
        setField(term1574876, term1574876.getClass(), "peerFont", null);
        setField(term1574876, term1574876.getClass(), "cursor", null);
        setField(term1574876, term1574876.getClass(), "locale", null);
        setField(term1574876, term1574876.getClass(), "graphicsConfig", null);
        setField(term1574876, term1574876.getClass(), "bufferStrategy", null);
        setBooleanField(term1574876, term1574876.getClass(), "ignoreRepaint", false);
        setBooleanField(term1574876, term1574876.getClass(), "visible", false);
        setBooleanField(term1574876, term1574876.getClass(), "enabled", false);
        setBooleanField(term1574876, term1574876.getClass(), "valid", false);
        setField(term1574876, term1574876.getClass(), "dropTarget", null);
        setField(term1574876, term1574876.getClass(), "popups", null);
        setField(term1574876, term1574876.getClass(), "name", null);
        setBooleanField(term1574876, term1574876.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1574876, term1574876.getClass(), "focusable", false);
        setIntField(term1574876, term1574876.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1574876, term1574876.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1574876, term1574876.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1574876, term1574876.getClass(), "acc", null);
        setField(term1574876, term1574876.getClass(), "minSize", null);
        setBooleanField(term1574876, term1574876.getClass(), "minSizeSet", false);
        setField(term1574876, term1574876.getClass(), "prefSize", null);
        setBooleanField(term1574876, term1574876.getClass(), "prefSizeSet", false);
        setField(term1574876, term1574876.getClass(), "maxSize", null);
        setBooleanField(term1574876, term1574876.getClass(), "maxSizeSet", false);
        setField(term1574876, term1574876.getClass(), "componentOrientation", null);
        setBooleanField(term1574876, term1574876.getClass(), "newEventsOnly", false);
        setField(term1574876, term1574876.getClass(), "componentListener", null);
        setField(term1574876, term1574876.getClass(), "focusListener", null);
        setField(term1574876, term1574876.getClass(), "hierarchyListener", null);
        setField(term1574876, term1574876.getClass(), "hierarchyBoundsListener", null);
        setField(term1574876, term1574876.getClass(), "keyListener", null);
        setField(term1574876, term1574876.getClass(), "mouseListener", null);
        setField(term1574876, term1574876.getClass(), "mouseMotionListener", null);
        setField(term1574876, term1574876.getClass(), "mouseWheelListener", null);
        setField(term1574876, term1574876.getClass(), "inputMethodListener", null);
        setLongField(term1574876, term1574876.getClass(), "eventMask", 0L);
        setField(term1574876, term1574876.getClass(), "changeSupport", null);
        setField(term1574876, term1574876.getClass(), "objectLock", null);
        setBooleanField(term1574876, term1574876.getClass(), "isPacked", false);
        setIntField(term1574876, term1574876.getClass(), "boundsOp", 0);
        setField(term1574876, term1574876.getClass(), "compoundShape", null);
        setField(term1574876, term1574876.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1574876, term1574876.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1574876, term1574876.getClass(), "backgroundEraseDisabled", false);
        setField(term1574876, term1574876.getClass(), "eventCache", null);
        setBooleanField(term1574876, term1574876.getClass(), "coalescingEnabled", false);
        setBooleanField(term1574876, term1574876.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1574876, term1574876.getClass(), "componentSerializedDataVersion", 0);
        setField(term1574876, term1574876.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initDiplomacyMusics", argTypes, term1574876, args);
    }

};


