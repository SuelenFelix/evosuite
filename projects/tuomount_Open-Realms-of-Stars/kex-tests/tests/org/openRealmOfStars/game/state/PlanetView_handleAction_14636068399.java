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

public class PlanetView_handleAction_14636068399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1536941;

    public PlanetView_handleAction_14636068399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1536941 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetView"));
        setField(term1536941, term1536941.getClass(), "farmPanel", null);
        setField(term1536941, term1536941.getClass(), "minePanel", null);
        setField(term1536941, term1536941.getClass(), "factoryPanel", null);
        setField(term1536941, term1536941.getClass(), "resePanel", null);
        setField(term1536941, term1536941.getClass(), "taxPanel", null);
        setField(term1536941, term1536941.getClass(), "cultureLabel", null);
        setField(term1536941, term1536941.getClass(), "totalPeople", null);
        setField(term1536941, term1536941.getClass(), "peopleGrowth", null);
        setField(term1536941, term1536941.getClass(), "farmProd", null);
        setField(term1536941, term1536941.getClass(), "mineProd", null);
        setField(term1536941, term1536941.getClass(), "prodProd", null);
        setField(term1536941, term1536941.getClass(), "reseProd", null);
        setField(term1536941, term1536941.getClass(), "cultProd", null);
        setField(term1536941, term1536941.getClass(), "credProd", null);
        setField(term1536941, term1536941.getClass(), "maintenance", null);
        setField(term1536941, term1536941.getClass(), "metal", null);
        setField(term1536941, term1536941.getClass(), "metalOre", null);
        setField(term1536941, term1536941.getClass(), "happiness", null);
        setField(term1536941, term1536941.getClass(), "constructionSelect", null);
        setField(term1536941, term1536941.getClass(), "buildingLabel", null);
        setField(term1536941, term1536941.getClass(), "buildingEstimate", null);
        setField(term1536941, term1536941.getClass(), "governorLabel", null);
        setField(term1536941, term1536941.getClass(), "leaderViewBtn", null);
        setField(term1536941, term1536941.getClass(), "productionInfo", null);
        setField(term1536941, term1536941.getClass(), "buildingInfo", null);
        setField(term1536941, term1536941.getClass(), "buildingList", null);
        setField(term1536941, term1536941.getClass(), "demolishBuildingBtn", null);
        setField(term1536941, term1536941.getClass(), "rushWithCreditsBtn", null);
        setField(term1536941, term1536941.getClass(), "rushWithPopulationBtn", null);
        setField(term1536941, term1536941.getClass(), "planet", null);
        setBooleanField(term1536941, term1536941.getClass(), "allowHandling", false);
        setField(term1536941, term1536941.getClass(), "info", null);
        setField(term1536941, term1536941.getClass(), "imgBase", null);
        setField(term1536941, term1536941.getClass(), "governorGuideSelect", null);
        setField(term1536941, term1536941.getClass(), "map", null);
        setBooleanField(term1536941, term1536941.getClass(), "isAlignmentXSet", false);
        setFloatField(term1536941, term1536941.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1536941, term1536941.getClass(), "isAlignmentYSet", false);
        setFloatField(term1536941, term1536941.getClass(), "alignmentY", 0.0F);
        setField(term1536941, term1536941.getClass(), "ui", null);
        setField(term1536941, term1536941.getClass(), "listenerList", null);
        setField(term1536941, term1536941.getClass(), "clientProperties", null);
        setField(term1536941, term1536941.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1536941, term1536941.getClass(), "autoscrolls", false);
        setField(term1536941, term1536941.getClass(), "border", null);
        setIntField(term1536941, term1536941.getClass(), "flags", 0);
        setField(term1536941, term1536941.getClass(), "inputVerifier", null);
        setBooleanField(term1536941, term1536941.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1536941, term1536941.getClass(), "paintingChild", null);
        setField(term1536941, term1536941.getClass(), "popupMenu", null);
        setField(term1536941, term1536941.getClass(), "revalidateRunnableScheduled", null);
        setField(term1536941, term1536941.getClass(), "focusInputMap", null);
        setField(term1536941, term1536941.getClass(), "ancestorInputMap", null);
        setField(term1536941, term1536941.getClass(), "windowInputMap", null);
        setField(term1536941, term1536941.getClass(), "actionMap", null);
        setField(term1536941, term1536941.getClass(), "aaHint", null);
        setField(term1536941, term1536941.getClass(), "lcdRenderingHint", null);
        setField(term1536941, term1536941.getClass(), "component", null);
        setField(term1536941, term1536941.getClass(), "layoutMgr", null);
        setField(term1536941, term1536941.getClass(), "dispatcher", null);
        setField(term1536941, term1536941.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1536941, term1536941.getClass(), "focusCycleRoot", false);
        setBooleanField(term1536941, term1536941.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1536941, term1536941.getClass(), "printingThreads", null);
        setBooleanField(term1536941, term1536941.getClass(), "printing", false);
        setField(term1536941, term1536941.getClass(), "containerListener", null);
        setIntField(term1536941, term1536941.getClass(), "listeningChildren", 0);
        setIntField(term1536941, term1536941.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1536941, term1536941.getClass(), "descendantsCount", 0);
        setField(term1536941, term1536941.getClass(), "preserveBackgroundColor", null);
        setIntField(term1536941, term1536941.getClass(), "numOfHWComponents", 0);
        setIntField(term1536941, term1536941.getClass(), "numOfLWComponents", 0);
        setField(term1536941, term1536941.getClass(), "modalComp", null);
        setField(term1536941, term1536941.getClass(), "modalAppContext", null);
        setIntField(term1536941, term1536941.getClass(), "containerSerializedDataVersion", 0);
        setField(term1536941, term1536941.getClass(), "peer", null);
        setField(term1536941, term1536941.getClass(), "parent", null);
        setField(term1536941, term1536941.getClass(), "appContext", null);
        setIntField(term1536941, term1536941.getClass(), "x", 0);
        setIntField(term1536941, term1536941.getClass(), "y", 0);
        setIntField(term1536941, term1536941.getClass(), "width", 0);
        setIntField(term1536941, term1536941.getClass(), "height", 0);
        setField(term1536941, term1536941.getClass(), "foreground", null);
        setField(term1536941, term1536941.getClass(), "background", null);
        setField(term1536941, term1536941.getClass(), "font", null);
        setField(term1536941, term1536941.getClass(), "peerFont", null);
        setField(term1536941, term1536941.getClass(), "cursor", null);
        setField(term1536941, term1536941.getClass(), "locale", null);
        setField(term1536941, term1536941.getClass(), "graphicsConfig", null);
        setField(term1536941, term1536941.getClass(), "bufferStrategy", null);
        setBooleanField(term1536941, term1536941.getClass(), "ignoreRepaint", false);
        setBooleanField(term1536941, term1536941.getClass(), "visible", false);
        setBooleanField(term1536941, term1536941.getClass(), "enabled", false);
        setBooleanField(term1536941, term1536941.getClass(), "valid", false);
        setField(term1536941, term1536941.getClass(), "dropTarget", null);
        setField(term1536941, term1536941.getClass(), "popups", null);
        setField(term1536941, term1536941.getClass(), "name", null);
        setBooleanField(term1536941, term1536941.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1536941, term1536941.getClass(), "focusable", false);
        setIntField(term1536941, term1536941.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1536941, term1536941.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1536941, term1536941.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1536941, term1536941.getClass(), "acc", null);
        setField(term1536941, term1536941.getClass(), "minSize", null);
        setBooleanField(term1536941, term1536941.getClass(), "minSizeSet", false);
        setField(term1536941, term1536941.getClass(), "prefSize", null);
        setBooleanField(term1536941, term1536941.getClass(), "prefSizeSet", false);
        setField(term1536941, term1536941.getClass(), "maxSize", null);
        setBooleanField(term1536941, term1536941.getClass(), "maxSizeSet", false);
        setField(term1536941, term1536941.getClass(), "componentOrientation", null);
        setBooleanField(term1536941, term1536941.getClass(), "newEventsOnly", false);
        setField(term1536941, term1536941.getClass(), "componentListener", null);
        setField(term1536941, term1536941.getClass(), "focusListener", null);
        setField(term1536941, term1536941.getClass(), "hierarchyListener", null);
        setField(term1536941, term1536941.getClass(), "hierarchyBoundsListener", null);
        setField(term1536941, term1536941.getClass(), "keyListener", null);
        setField(term1536941, term1536941.getClass(), "mouseListener", null);
        setField(term1536941, term1536941.getClass(), "mouseMotionListener", null);
        setField(term1536941, term1536941.getClass(), "mouseWheelListener", null);
        setField(term1536941, term1536941.getClass(), "inputMethodListener", null);
        setLongField(term1536941, term1536941.getClass(), "eventMask", 0L);
        setField(term1536941, term1536941.getClass(), "changeSupport", null);
        setField(term1536941, term1536941.getClass(), "objectLock", null);
        setBooleanField(term1536941, term1536941.getClass(), "isPacked", false);
        setIntField(term1536941, term1536941.getClass(), "boundsOp", 0);
        setField(term1536941, term1536941.getClass(), "compoundShape", null);
        setField(term1536941, term1536941.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1536941, term1536941.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1536941, term1536941.getClass(), "backgroundEraseDisabled", false);
        setField(term1536941, term1536941.getClass(), "eventCache", null);
        setBooleanField(term1536941, term1536941.getClass(), "coalescingEnabled", false);
        setBooleanField(term1536941, term1536941.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1536941, term1536941.getClass(), "componentSerializedDataVersion", 0);
        setField(term1536941, term1536941.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term1536941, args);
    }

};


