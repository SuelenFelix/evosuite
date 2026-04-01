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

public class PlanetView_setPlanet_21219499417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1534135;

    public PlanetView_setPlanet_21219499417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1534135 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetView"));
        setField(term1534135, term1534135.getClass(), "farmPanel", null);
        setField(term1534135, term1534135.getClass(), "minePanel", null);
        setField(term1534135, term1534135.getClass(), "factoryPanel", null);
        setField(term1534135, term1534135.getClass(), "resePanel", null);
        setField(term1534135, term1534135.getClass(), "taxPanel", null);
        setField(term1534135, term1534135.getClass(), "cultureLabel", null);
        setField(term1534135, term1534135.getClass(), "totalPeople", null);
        setField(term1534135, term1534135.getClass(), "peopleGrowth", null);
        setField(term1534135, term1534135.getClass(), "farmProd", null);
        setField(term1534135, term1534135.getClass(), "mineProd", null);
        setField(term1534135, term1534135.getClass(), "prodProd", null);
        setField(term1534135, term1534135.getClass(), "reseProd", null);
        setField(term1534135, term1534135.getClass(), "cultProd", null);
        setField(term1534135, term1534135.getClass(), "credProd", null);
        setField(term1534135, term1534135.getClass(), "maintenance", null);
        setField(term1534135, term1534135.getClass(), "metal", null);
        setField(term1534135, term1534135.getClass(), "metalOre", null);
        setField(term1534135, term1534135.getClass(), "happiness", null);
        setField(term1534135, term1534135.getClass(), "constructionSelect", null);
        setField(term1534135, term1534135.getClass(), "buildingLabel", null);
        setField(term1534135, term1534135.getClass(), "buildingEstimate", null);
        setField(term1534135, term1534135.getClass(), "governorLabel", null);
        setField(term1534135, term1534135.getClass(), "leaderViewBtn", null);
        setField(term1534135, term1534135.getClass(), "productionInfo", null);
        setField(term1534135, term1534135.getClass(), "buildingInfo", null);
        setField(term1534135, term1534135.getClass(), "buildingList", null);
        setField(term1534135, term1534135.getClass(), "demolishBuildingBtn", null);
        setField(term1534135, term1534135.getClass(), "rushWithCreditsBtn", null);
        setField(term1534135, term1534135.getClass(), "rushWithPopulationBtn", null);
        setField(term1534135, term1534135.getClass(), "planet", null);
        setBooleanField(term1534135, term1534135.getClass(), "allowHandling", false);
        setField(term1534135, term1534135.getClass(), "info", null);
        setField(term1534135, term1534135.getClass(), "imgBase", null);
        setField(term1534135, term1534135.getClass(), "governorGuideSelect", null);
        setField(term1534135, term1534135.getClass(), "map", null);
        setBooleanField(term1534135, term1534135.getClass(), "isAlignmentXSet", false);
        setFloatField(term1534135, term1534135.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1534135, term1534135.getClass(), "isAlignmentYSet", false);
        setFloatField(term1534135, term1534135.getClass(), "alignmentY", 0.0F);
        setField(term1534135, term1534135.getClass(), "ui", null);
        setField(term1534135, term1534135.getClass(), "listenerList", null);
        setField(term1534135, term1534135.getClass(), "clientProperties", null);
        setField(term1534135, term1534135.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1534135, term1534135.getClass(), "autoscrolls", false);
        setField(term1534135, term1534135.getClass(), "border", null);
        setIntField(term1534135, term1534135.getClass(), "flags", 0);
        setField(term1534135, term1534135.getClass(), "inputVerifier", null);
        setBooleanField(term1534135, term1534135.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1534135, term1534135.getClass(), "paintingChild", null);
        setField(term1534135, term1534135.getClass(), "popupMenu", null);
        setField(term1534135, term1534135.getClass(), "revalidateRunnableScheduled", null);
        setField(term1534135, term1534135.getClass(), "focusInputMap", null);
        setField(term1534135, term1534135.getClass(), "ancestorInputMap", null);
        setField(term1534135, term1534135.getClass(), "windowInputMap", null);
        setField(term1534135, term1534135.getClass(), "actionMap", null);
        setField(term1534135, term1534135.getClass(), "aaHint", null);
        setField(term1534135, term1534135.getClass(), "lcdRenderingHint", null);
        setField(term1534135, term1534135.getClass(), "component", null);
        setField(term1534135, term1534135.getClass(), "layoutMgr", null);
        setField(term1534135, term1534135.getClass(), "dispatcher", null);
        setField(term1534135, term1534135.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1534135, term1534135.getClass(), "focusCycleRoot", false);
        setBooleanField(term1534135, term1534135.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1534135, term1534135.getClass(), "printingThreads", null);
        setBooleanField(term1534135, term1534135.getClass(), "printing", false);
        setField(term1534135, term1534135.getClass(), "containerListener", null);
        setIntField(term1534135, term1534135.getClass(), "listeningChildren", 0);
        setIntField(term1534135, term1534135.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1534135, term1534135.getClass(), "descendantsCount", 0);
        setField(term1534135, term1534135.getClass(), "preserveBackgroundColor", null);
        setIntField(term1534135, term1534135.getClass(), "numOfHWComponents", 0);
        setIntField(term1534135, term1534135.getClass(), "numOfLWComponents", 0);
        setField(term1534135, term1534135.getClass(), "modalComp", null);
        setField(term1534135, term1534135.getClass(), "modalAppContext", null);
        setIntField(term1534135, term1534135.getClass(), "containerSerializedDataVersion", 0);
        setField(term1534135, term1534135.getClass(), "peer", null);
        setField(term1534135, term1534135.getClass(), "parent", null);
        setField(term1534135, term1534135.getClass(), "appContext", null);
        setIntField(term1534135, term1534135.getClass(), "x", 0);
        setIntField(term1534135, term1534135.getClass(), "y", 0);
        setIntField(term1534135, term1534135.getClass(), "width", 0);
        setIntField(term1534135, term1534135.getClass(), "height", 0);
        setField(term1534135, term1534135.getClass(), "foreground", null);
        setField(term1534135, term1534135.getClass(), "background", null);
        setField(term1534135, term1534135.getClass(), "font", null);
        setField(term1534135, term1534135.getClass(), "peerFont", null);
        setField(term1534135, term1534135.getClass(), "cursor", null);
        setField(term1534135, term1534135.getClass(), "locale", null);
        setField(term1534135, term1534135.getClass(), "graphicsConfig", null);
        setField(term1534135, term1534135.getClass(), "bufferStrategy", null);
        setBooleanField(term1534135, term1534135.getClass(), "ignoreRepaint", false);
        setBooleanField(term1534135, term1534135.getClass(), "visible", false);
        setBooleanField(term1534135, term1534135.getClass(), "enabled", false);
        setBooleanField(term1534135, term1534135.getClass(), "valid", false);
        setField(term1534135, term1534135.getClass(), "dropTarget", null);
        setField(term1534135, term1534135.getClass(), "popups", null);
        setField(term1534135, term1534135.getClass(), "name", null);
        setBooleanField(term1534135, term1534135.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1534135, term1534135.getClass(), "focusable", false);
        setIntField(term1534135, term1534135.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1534135, term1534135.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1534135, term1534135.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1534135, term1534135.getClass(), "acc", null);
        setField(term1534135, term1534135.getClass(), "minSize", null);
        setBooleanField(term1534135, term1534135.getClass(), "minSizeSet", false);
        setField(term1534135, term1534135.getClass(), "prefSize", null);
        setBooleanField(term1534135, term1534135.getClass(), "prefSizeSet", false);
        setField(term1534135, term1534135.getClass(), "maxSize", null);
        setBooleanField(term1534135, term1534135.getClass(), "maxSizeSet", false);
        setField(term1534135, term1534135.getClass(), "componentOrientation", null);
        setBooleanField(term1534135, term1534135.getClass(), "newEventsOnly", false);
        setField(term1534135, term1534135.getClass(), "componentListener", null);
        setField(term1534135, term1534135.getClass(), "focusListener", null);
        setField(term1534135, term1534135.getClass(), "hierarchyListener", null);
        setField(term1534135, term1534135.getClass(), "hierarchyBoundsListener", null);
        setField(term1534135, term1534135.getClass(), "keyListener", null);
        setField(term1534135, term1534135.getClass(), "mouseListener", null);
        setField(term1534135, term1534135.getClass(), "mouseMotionListener", null);
        setField(term1534135, term1534135.getClass(), "mouseWheelListener", null);
        setField(term1534135, term1534135.getClass(), "inputMethodListener", null);
        setLongField(term1534135, term1534135.getClass(), "eventMask", 0L);
        setField(term1534135, term1534135.getClass(), "changeSupport", null);
        setField(term1534135, term1534135.getClass(), "objectLock", null);
        setBooleanField(term1534135, term1534135.getClass(), "isPacked", false);
        setIntField(term1534135, term1534135.getClass(), "boundsOp", 0);
        setField(term1534135, term1534135.getClass(), "compoundShape", null);
        setField(term1534135, term1534135.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1534135, term1534135.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1534135, term1534135.getClass(), "backgroundEraseDisabled", false);
        setField(term1534135, term1534135.getClass(), "eventCache", null);
        setBooleanField(term1534135, term1534135.getClass(), "coalescingEnabled", false);
        setBooleanField(term1534135, term1534135.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1534135, term1534135.getClass(), "componentSerializedDataVersion", 0);
        setField(term1534135, term1534135.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlanet", argTypes, term1534135, args);
    }

};


