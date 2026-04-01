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

public class SpaceRaceEditorView_clearTimer_40485766218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1574780;

    public SpaceRaceEditorView_clearTimer_40485766218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1574780 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView"));
        setIntField(term1574780, term1574780.getClass(), "screenWidth", 0);
        setIntField(term1574780, term1574780.getClass(), "screenHeight", 0);
        setIntField(term1574780, term1574780.getClass(), "gapY", 0);
        setField(term1574780, term1574780.getClass(), "spaceRaceNameField", null);
        setField(term1574780, term1574780.getClass(), "spaceRaceNameSingleField", null);
        setField(term1574780, term1574780.getClass(), "shipTimer", null);
        setField(term1574780, term1574780.getClass(), "bridgeIdCombo", null);
        setField(term1574780, term1574780.getClass(), "attitudeCombo", null);
        setField(term1574780, term1574780.getClass(), "socialCombo", null);
        setField(term1574780, term1574780.getClass(), "genderCombo", null);
        setField(term1574780, term1574780.getClass(), "speechCombo", null);
        setField(term1574780, term1574780.getClass(), "nameGenCombo", null);
        setField(term1574780, term1574780.getClass(), "interiorPanel", null);
        setField(term1574780, term1574780.getClass(), "interiorPanel2", null);
        setField(term1574780, term1574780.getClass(), "raceImages", null);
        setIntField(term1574780, term1574780.getClass(), "customImageIndex", 0);
        setField(term1574780, term1574780.getClass(), "diplomacyMusics", null);
        setIntField(term1574780, term1574780.getClass(), "customMusicIndex", 0);
        setField(term1574780, term1574780.getClass(), "spaceRaceImageCombo", null);
        setField(term1574780, term1574780.getClass(), "browseButton", null);
        setField(term1574780, term1574780.getClass(), "browseMusicButton", null);
        setField(term1574780, term1574780.getClass(), "bridgeEffectCombo", null);
        setField(term1574780, term1574780.getClass(), "spaceShipIdCombo", null);
        setField(term1574780, term1574780.getClass(), "diplomacyMusicCombo", null);
        setIntField(term1574780, term1574780.getClass(), "hullImageCount", 0);
        setField(term1574780, term1574780.getClass(), "hullImage", null);
        setField(term1574780, term1574780.getClass(), "hullNameLabel", null);
        setField(term1574780, term1574780.getClass(), "descriptionText", null);
        setField(term1574780, term1574780.getClass(), "newRace", null);
        setField(term1574780, term1574780.getClass(), "traitPanel", null);
        setBooleanField(term1574780, term1574780.getClass(), "conflictWithId", false);
        setField(term1574780, term1574780.getClass(), "game", null);
        setBooleanField(term1574780, term1574780.getClass(), "isAlignmentXSet", false);
        setFloatField(term1574780, term1574780.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1574780, term1574780.getClass(), "isAlignmentYSet", false);
        setFloatField(term1574780, term1574780.getClass(), "alignmentY", 0.0F);
        setField(term1574780, term1574780.getClass(), "ui", null);
        setField(term1574780, term1574780.getClass(), "listenerList", null);
        setField(term1574780, term1574780.getClass(), "clientProperties", null);
        setField(term1574780, term1574780.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1574780, term1574780.getClass(), "autoscrolls", false);
        setField(term1574780, term1574780.getClass(), "border", null);
        setIntField(term1574780, term1574780.getClass(), "flags", 0);
        setField(term1574780, term1574780.getClass(), "inputVerifier", null);
        setBooleanField(term1574780, term1574780.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1574780, term1574780.getClass(), "paintingChild", null);
        setField(term1574780, term1574780.getClass(), "popupMenu", null);
        setField(term1574780, term1574780.getClass(), "revalidateRunnableScheduled", null);
        setField(term1574780, term1574780.getClass(), "focusInputMap", null);
        setField(term1574780, term1574780.getClass(), "ancestorInputMap", null);
        setField(term1574780, term1574780.getClass(), "windowInputMap", null);
        setField(term1574780, term1574780.getClass(), "actionMap", null);
        setField(term1574780, term1574780.getClass(), "aaHint", null);
        setField(term1574780, term1574780.getClass(), "lcdRenderingHint", null);
        setField(term1574780, term1574780.getClass(), "component", null);
        setField(term1574780, term1574780.getClass(), "layoutMgr", null);
        setField(term1574780, term1574780.getClass(), "dispatcher", null);
        setField(term1574780, term1574780.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1574780, term1574780.getClass(), "focusCycleRoot", false);
        setBooleanField(term1574780, term1574780.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1574780, term1574780.getClass(), "printingThreads", null);
        setBooleanField(term1574780, term1574780.getClass(), "printing", false);
        setField(term1574780, term1574780.getClass(), "containerListener", null);
        setIntField(term1574780, term1574780.getClass(), "listeningChildren", 0);
        setIntField(term1574780, term1574780.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1574780, term1574780.getClass(), "descendantsCount", 0);
        setField(term1574780, term1574780.getClass(), "preserveBackgroundColor", null);
        setIntField(term1574780, term1574780.getClass(), "numOfHWComponents", 0);
        setIntField(term1574780, term1574780.getClass(), "numOfLWComponents", 0);
        setField(term1574780, term1574780.getClass(), "modalComp", null);
        setField(term1574780, term1574780.getClass(), "modalAppContext", null);
        setIntField(term1574780, term1574780.getClass(), "containerSerializedDataVersion", 0);
        setField(term1574780, term1574780.getClass(), "peer", null);
        setField(term1574780, term1574780.getClass(), "parent", null);
        setField(term1574780, term1574780.getClass(), "appContext", null);
        setIntField(term1574780, term1574780.getClass(), "x", 0);
        setIntField(term1574780, term1574780.getClass(), "y", 0);
        setIntField(term1574780, term1574780.getClass(), "width", 0);
        setIntField(term1574780, term1574780.getClass(), "height", 0);
        setField(term1574780, term1574780.getClass(), "foreground", null);
        setField(term1574780, term1574780.getClass(), "background", null);
        setField(term1574780, term1574780.getClass(), "font", null);
        setField(term1574780, term1574780.getClass(), "peerFont", null);
        setField(term1574780, term1574780.getClass(), "cursor", null);
        setField(term1574780, term1574780.getClass(), "locale", null);
        setField(term1574780, term1574780.getClass(), "graphicsConfig", null);
        setField(term1574780, term1574780.getClass(), "bufferStrategy", null);
        setBooleanField(term1574780, term1574780.getClass(), "ignoreRepaint", false);
        setBooleanField(term1574780, term1574780.getClass(), "visible", false);
        setBooleanField(term1574780, term1574780.getClass(), "enabled", false);
        setBooleanField(term1574780, term1574780.getClass(), "valid", false);
        setField(term1574780, term1574780.getClass(), "dropTarget", null);
        setField(term1574780, term1574780.getClass(), "popups", null);
        setField(term1574780, term1574780.getClass(), "name", null);
        setBooleanField(term1574780, term1574780.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1574780, term1574780.getClass(), "focusable", false);
        setIntField(term1574780, term1574780.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1574780, term1574780.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1574780, term1574780.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1574780, term1574780.getClass(), "acc", null);
        setField(term1574780, term1574780.getClass(), "minSize", null);
        setBooleanField(term1574780, term1574780.getClass(), "minSizeSet", false);
        setField(term1574780, term1574780.getClass(), "prefSize", null);
        setBooleanField(term1574780, term1574780.getClass(), "prefSizeSet", false);
        setField(term1574780, term1574780.getClass(), "maxSize", null);
        setBooleanField(term1574780, term1574780.getClass(), "maxSizeSet", false);
        setField(term1574780, term1574780.getClass(), "componentOrientation", null);
        setBooleanField(term1574780, term1574780.getClass(), "newEventsOnly", false);
        setField(term1574780, term1574780.getClass(), "componentListener", null);
        setField(term1574780, term1574780.getClass(), "focusListener", null);
        setField(term1574780, term1574780.getClass(), "hierarchyListener", null);
        setField(term1574780, term1574780.getClass(), "hierarchyBoundsListener", null);
        setField(term1574780, term1574780.getClass(), "keyListener", null);
        setField(term1574780, term1574780.getClass(), "mouseListener", null);
        setField(term1574780, term1574780.getClass(), "mouseMotionListener", null);
        setField(term1574780, term1574780.getClass(), "mouseWheelListener", null);
        setField(term1574780, term1574780.getClass(), "inputMethodListener", null);
        setLongField(term1574780, term1574780.getClass(), "eventMask", 0L);
        setField(term1574780, term1574780.getClass(), "changeSupport", null);
        setField(term1574780, term1574780.getClass(), "objectLock", null);
        setBooleanField(term1574780, term1574780.getClass(), "isPacked", false);
        setIntField(term1574780, term1574780.getClass(), "boundsOp", 0);
        setField(term1574780, term1574780.getClass(), "compoundShape", null);
        setField(term1574780, term1574780.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1574780, term1574780.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1574780, term1574780.getClass(), "backgroundEraseDisabled", false);
        setField(term1574780, term1574780.getClass(), "eventCache", null);
        setBooleanField(term1574780, term1574780.getClass(), "coalescingEnabled", false);
        setBooleanField(term1574780, term1574780.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1574780, term1574780.getClass(), "componentSerializedDataVersion", 0);
        setField(term1574780, term1574780.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearTimer", argTypes, term1574780, args);
    }

};


