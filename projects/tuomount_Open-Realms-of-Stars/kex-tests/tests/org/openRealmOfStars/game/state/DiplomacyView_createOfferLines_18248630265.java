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

public class DiplomacyView_createOfferLines_18248630265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1616452;
     Object term1616499;

    public DiplomacyView_createOfferLines_18248630265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1616452 = newInstance(Class.forName("org.openRealmOfStars.game.state.DiplomacyView"));
        setField(term1616452, term1616452.getClass(), "human", null);
        setField(term1616452, term1616452.getClass(), "borderCrossedFleet", null);
        setField(term1616452, term1616452.getClass(), "ai", null);
        setField(term1616452, term1616452.getClass(), "starMap", null);
        setField(term1616452, term1616452.getClass(), "trade", null);
        setField(term1616452, term1616452.getClass(), "humanTechListOffer", null);
        setField(term1616452, term1616452.getClass(), "aiTechListOffer", null);
        setField(term1616452, term1616452.getClass(), "humanFleetListOffer", null);
        setField(term1616452, term1616452.getClass(), "aiFleetListOffer", null);
        setField(term1616452, term1616452.getClass(), "humanPlanetListOffer", null);
        setField(term1616452, term1616452.getClass(), "aiPlanetListOffer", null);
        setField(term1616452, term1616452.getClass(), "humanCreditOffer", null);
        setIntField(term1616452, term1616452.getClass(), "humanCredits", 0);
        setField(term1616452, term1616452.getClass(), "humanArtifactOffer", null);
        setIntField(term1616452, term1616452.getClass(), "humanArtifacts", 0);
        setField(term1616452, term1616452.getClass(), "aiCreditOffer", null);
        setIntField(term1616452, term1616452.getClass(), "aiCredits", 0);
        setField(term1616452, term1616452.getClass(), "aiArtifactOffer", null);
        setIntField(term1616452, term1616452.getClass(), "aiArtifacts", 0);
        setField(term1616452, term1616452.getClass(), "humanLines", null);
        setField(term1616452, term1616452.getClass(), "humanMapPlanetsOffer", null);
        setField(term1616452, term1616452.getClass(), "aiMapPlanetsOffer", null);
        setField(term1616452, term1616452.getClass(), "humanMapWarPlanetsOffer", null);
        setField(term1616452, term1616452.getClass(), "aiMapWarPlanetsOffer", null);
        setField(term1616452, term1616452.getClass(), "humanMapOffer", null);
        setField(term1616452, term1616452.getClass(), "aiMapOffer", null);
        setField(term1616452, term1616452.getClass(), "humanVoteYes", null);
        setField(term1616452, term1616452.getClass(), "humanVoteNo", null);
        setField(term1616452, term1616452.getClass(), "aiVoteYes", null);
        setField(term1616452, term1616452.getClass(), "aiVoteNo", null);
        setField(term1616452, term1616452.getClass(), "infoText", null);
        setField(term1616452, term1616452.getClass(), "likenessLabel", null);
        setField(term1616452, term1616452.getClass(), "endBtn", null);
        setField(term1616452, term1616452.getClass(), "meetingPlace", null);
        setBooleanField(term1616452, term1616452.getClass(), "tradeHappened", false);
        setField(term1616452, term1616452.getClass(), "aiImg", null);
        setIntField(term1616452, term1616452.getClass(), "textCounter", 0);
        setField(term1616452, term1616452.getClass(), "lastSpeechType", null);
        setField(term1616452, term1616452.getClass(), "embargoLine", null);
        setField(term1616452, term1616452.getClass(), "game", null);
        setBooleanField(term1616452, term1616452.getClass(), "isAlignmentXSet", false);
        setFloatField(term1616452, term1616452.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1616452, term1616452.getClass(), "isAlignmentYSet", false);
        setFloatField(term1616452, term1616452.getClass(), "alignmentY", 0.0F);
        setField(term1616452, term1616452.getClass(), "ui", null);
        setField(term1616452, term1616452.getClass(), "listenerList", null);
        setField(term1616452, term1616452.getClass(), "clientProperties", null);
        setField(term1616452, term1616452.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1616452, term1616452.getClass(), "autoscrolls", false);
        setField(term1616452, term1616452.getClass(), "border", null);
        setIntField(term1616452, term1616452.getClass(), "flags", 0);
        setField(term1616452, term1616452.getClass(), "inputVerifier", null);
        setBooleanField(term1616452, term1616452.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1616452, term1616452.getClass(), "paintingChild", null);
        setField(term1616452, term1616452.getClass(), "popupMenu", null);
        setField(term1616452, term1616452.getClass(), "revalidateRunnableScheduled", null);
        setField(term1616452, term1616452.getClass(), "focusInputMap", null);
        setField(term1616452, term1616452.getClass(), "ancestorInputMap", null);
        setField(term1616452, term1616452.getClass(), "windowInputMap", null);
        setField(term1616452, term1616452.getClass(), "actionMap", null);
        setField(term1616452, term1616452.getClass(), "aaHint", null);
        setField(term1616452, term1616452.getClass(), "lcdRenderingHint", null);
        setField(term1616452, term1616452.getClass(), "component", null);
        setField(term1616452, term1616452.getClass(), "layoutMgr", null);
        setField(term1616452, term1616452.getClass(), "dispatcher", null);
        setField(term1616452, term1616452.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1616452, term1616452.getClass(), "focusCycleRoot", false);
        setBooleanField(term1616452, term1616452.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1616452, term1616452.getClass(), "printingThreads", null);
        setBooleanField(term1616452, term1616452.getClass(), "printing", false);
        setField(term1616452, term1616452.getClass(), "containerListener", null);
        setIntField(term1616452, term1616452.getClass(), "listeningChildren", 0);
        setIntField(term1616452, term1616452.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1616452, term1616452.getClass(), "descendantsCount", 0);
        setField(term1616452, term1616452.getClass(), "preserveBackgroundColor", null);
        setIntField(term1616452, term1616452.getClass(), "numOfHWComponents", 0);
        setIntField(term1616452, term1616452.getClass(), "numOfLWComponents", 0);
        setField(term1616452, term1616452.getClass(), "modalComp", null);
        setField(term1616452, term1616452.getClass(), "modalAppContext", null);
        setIntField(term1616452, term1616452.getClass(), "containerSerializedDataVersion", 0);
        setField(term1616452, term1616452.getClass(), "peer", null);
        setField(term1616452, term1616452.getClass(), "parent", null);
        setField(term1616452, term1616452.getClass(), "appContext", null);
        setIntField(term1616452, term1616452.getClass(), "x", 0);
        setIntField(term1616452, term1616452.getClass(), "y", 0);
        setIntField(term1616452, term1616452.getClass(), "width", 0);
        setIntField(term1616452, term1616452.getClass(), "height", 0);
        setField(term1616452, term1616452.getClass(), "foreground", null);
        setField(term1616452, term1616452.getClass(), "background", null);
        setField(term1616452, term1616452.getClass(), "font", null);
        setField(term1616452, term1616452.getClass(), "peerFont", null);
        setField(term1616452, term1616452.getClass(), "cursor", null);
        setField(term1616452, term1616452.getClass(), "locale", null);
        setField(term1616452, term1616452.getClass(), "graphicsConfig", null);
        setField(term1616452, term1616452.getClass(), "bufferStrategy", null);
        setBooleanField(term1616452, term1616452.getClass(), "ignoreRepaint", false);
        setBooleanField(term1616452, term1616452.getClass(), "visible", false);
        setBooleanField(term1616452, term1616452.getClass(), "enabled", false);
        setBooleanField(term1616452, term1616452.getClass(), "valid", false);
        setField(term1616452, term1616452.getClass(), "dropTarget", null);
        setField(term1616452, term1616452.getClass(), "popups", null);
        setField(term1616452, term1616452.getClass(), "name", null);
        setBooleanField(term1616452, term1616452.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1616452, term1616452.getClass(), "focusable", false);
        setIntField(term1616452, term1616452.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1616452, term1616452.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1616452, term1616452.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1616452, term1616452.getClass(), "acc", null);
        setField(term1616452, term1616452.getClass(), "minSize", null);
        setBooleanField(term1616452, term1616452.getClass(), "minSizeSet", false);
        setField(term1616452, term1616452.getClass(), "prefSize", null);
        setBooleanField(term1616452, term1616452.getClass(), "prefSizeSet", false);
        setField(term1616452, term1616452.getClass(), "maxSize", null);
        setBooleanField(term1616452, term1616452.getClass(), "maxSizeSet", false);
        setField(term1616452, term1616452.getClass(), "componentOrientation", null);
        setBooleanField(term1616452, term1616452.getClass(), "newEventsOnly", false);
        setField(term1616452, term1616452.getClass(), "componentListener", null);
        setField(term1616452, term1616452.getClass(), "focusListener", null);
        setField(term1616452, term1616452.getClass(), "hierarchyListener", null);
        setField(term1616452, term1616452.getClass(), "hierarchyBoundsListener", null);
        setField(term1616452, term1616452.getClass(), "keyListener", null);
        setField(term1616452, term1616452.getClass(), "mouseListener", null);
        setField(term1616452, term1616452.getClass(), "mouseMotionListener", null);
        setField(term1616452, term1616452.getClass(), "mouseWheelListener", null);
        setField(term1616452, term1616452.getClass(), "inputMethodListener", null);
        setLongField(term1616452, term1616452.getClass(), "eventMask", 0L);
        setField(term1616452, term1616452.getClass(), "changeSupport", null);
        setField(term1616452, term1616452.getClass(), "objectLock", null);
        setBooleanField(term1616452, term1616452.getClass(), "isPacked", false);
        setIntField(term1616452, term1616452.getClass(), "boundsOp", 0);
        setField(term1616452, term1616452.getClass(), "compoundShape", null);
        setField(term1616452, term1616452.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1616452, term1616452.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1616452, term1616452.getClass(), "backgroundEraseDisabled", false);
        setField(term1616452, term1616452.getClass(), "eventCache", null);
        setBooleanField(term1616452, term1616452.getClass(), "coalescingEnabled", false);
        setBooleanField(term1616452, term1616452.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1616452, term1616452.getClass(), "componentSerializedDataVersion", 0);
        setField(term1616452, term1616452.getClass(), "accessibleContext", null);
        term1616499 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.DiplomacyView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1616499;
        callMethod(klass, "createOfferLines", argTypes, term1616452, args);
    }

};


