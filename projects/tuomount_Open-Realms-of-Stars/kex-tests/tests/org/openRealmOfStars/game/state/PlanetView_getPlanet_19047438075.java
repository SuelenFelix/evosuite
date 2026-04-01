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

public class PlanetView_getPlanet_19047438075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1522649;

    public PlanetView_getPlanet_19047438075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1522649 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetView"));
        setField(term1522649, term1522649.getClass(), "farmPanel", null);
        setField(term1522649, term1522649.getClass(), "minePanel", null);
        setField(term1522649, term1522649.getClass(), "factoryPanel", null);
        setField(term1522649, term1522649.getClass(), "resePanel", null);
        setField(term1522649, term1522649.getClass(), "taxPanel", null);
        setField(term1522649, term1522649.getClass(), "cultureLabel", null);
        setField(term1522649, term1522649.getClass(), "totalPeople", null);
        setField(term1522649, term1522649.getClass(), "peopleGrowth", null);
        setField(term1522649, term1522649.getClass(), "farmProd", null);
        setField(term1522649, term1522649.getClass(), "mineProd", null);
        setField(term1522649, term1522649.getClass(), "prodProd", null);
        setField(term1522649, term1522649.getClass(), "reseProd", null);
        setField(term1522649, term1522649.getClass(), "cultProd", null);
        setField(term1522649, term1522649.getClass(), "credProd", null);
        setField(term1522649, term1522649.getClass(), "maintenance", null);
        setField(term1522649, term1522649.getClass(), "metal", null);
        setField(term1522649, term1522649.getClass(), "metalOre", null);
        setField(term1522649, term1522649.getClass(), "happiness", null);
        setField(term1522649, term1522649.getClass(), "constructionSelect", null);
        setField(term1522649, term1522649.getClass(), "buildingLabel", null);
        setField(term1522649, term1522649.getClass(), "buildingEstimate", null);
        setField(term1522649, term1522649.getClass(), "governorLabel", null);
        setField(term1522649, term1522649.getClass(), "leaderViewBtn", null);
        setField(term1522649, term1522649.getClass(), "productionInfo", null);
        setField(term1522649, term1522649.getClass(), "buildingInfo", null);
        setField(term1522649, term1522649.getClass(), "buildingList", null);
        setField(term1522649, term1522649.getClass(), "demolishBuildingBtn", null);
        setField(term1522649, term1522649.getClass(), "rushWithCreditsBtn", null);
        setField(term1522649, term1522649.getClass(), "rushWithPopulationBtn", null);
        setField(term1522649, term1522649.getClass(), "planet", null);
        setBooleanField(term1522649, term1522649.getClass(), "allowHandling", false);
        setField(term1522649, term1522649.getClass(), "info", null);
        setField(term1522649, term1522649.getClass(), "imgBase", null);
        setField(term1522649, term1522649.getClass(), "governorGuideSelect", null);
        setField(term1522649, term1522649.getClass(), "map", null);
        setBooleanField(term1522649, term1522649.getClass(), "isAlignmentXSet", false);
        setFloatField(term1522649, term1522649.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1522649, term1522649.getClass(), "isAlignmentYSet", false);
        setFloatField(term1522649, term1522649.getClass(), "alignmentY", 0.0F);
        setField(term1522649, term1522649.getClass(), "ui", null);
        setField(term1522649, term1522649.getClass(), "listenerList", null);
        setField(term1522649, term1522649.getClass(), "clientProperties", null);
        setField(term1522649, term1522649.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1522649, term1522649.getClass(), "autoscrolls", false);
        setField(term1522649, term1522649.getClass(), "border", null);
        setIntField(term1522649, term1522649.getClass(), "flags", 0);
        setField(term1522649, term1522649.getClass(), "inputVerifier", null);
        setBooleanField(term1522649, term1522649.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1522649, term1522649.getClass(), "paintingChild", null);
        setField(term1522649, term1522649.getClass(), "popupMenu", null);
        setField(term1522649, term1522649.getClass(), "revalidateRunnableScheduled", null);
        setField(term1522649, term1522649.getClass(), "focusInputMap", null);
        setField(term1522649, term1522649.getClass(), "ancestorInputMap", null);
        setField(term1522649, term1522649.getClass(), "windowInputMap", null);
        setField(term1522649, term1522649.getClass(), "actionMap", null);
        setField(term1522649, term1522649.getClass(), "aaHint", null);
        setField(term1522649, term1522649.getClass(), "lcdRenderingHint", null);
        setField(term1522649, term1522649.getClass(), "component", null);
        setField(term1522649, term1522649.getClass(), "layoutMgr", null);
        setField(term1522649, term1522649.getClass(), "dispatcher", null);
        setField(term1522649, term1522649.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1522649, term1522649.getClass(), "focusCycleRoot", false);
        setBooleanField(term1522649, term1522649.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1522649, term1522649.getClass(), "printingThreads", null);
        setBooleanField(term1522649, term1522649.getClass(), "printing", false);
        setField(term1522649, term1522649.getClass(), "containerListener", null);
        setIntField(term1522649, term1522649.getClass(), "listeningChildren", 0);
        setIntField(term1522649, term1522649.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1522649, term1522649.getClass(), "descendantsCount", 0);
        setField(term1522649, term1522649.getClass(), "preserveBackgroundColor", null);
        setIntField(term1522649, term1522649.getClass(), "numOfHWComponents", 0);
        setIntField(term1522649, term1522649.getClass(), "numOfLWComponents", 0);
        setField(term1522649, term1522649.getClass(), "modalComp", null);
        setField(term1522649, term1522649.getClass(), "modalAppContext", null);
        setIntField(term1522649, term1522649.getClass(), "containerSerializedDataVersion", 0);
        setField(term1522649, term1522649.getClass(), "peer", null);
        setField(term1522649, term1522649.getClass(), "parent", null);
        setField(term1522649, term1522649.getClass(), "appContext", null);
        setIntField(term1522649, term1522649.getClass(), "x", 0);
        setIntField(term1522649, term1522649.getClass(), "y", 0);
        setIntField(term1522649, term1522649.getClass(), "width", 0);
        setIntField(term1522649, term1522649.getClass(), "height", 0);
        setField(term1522649, term1522649.getClass(), "foreground", null);
        setField(term1522649, term1522649.getClass(), "background", null);
        setField(term1522649, term1522649.getClass(), "font", null);
        setField(term1522649, term1522649.getClass(), "peerFont", null);
        setField(term1522649, term1522649.getClass(), "cursor", null);
        setField(term1522649, term1522649.getClass(), "locale", null);
        setField(term1522649, term1522649.getClass(), "graphicsConfig", null);
        setField(term1522649, term1522649.getClass(), "bufferStrategy", null);
        setBooleanField(term1522649, term1522649.getClass(), "ignoreRepaint", false);
        setBooleanField(term1522649, term1522649.getClass(), "visible", false);
        setBooleanField(term1522649, term1522649.getClass(), "enabled", false);
        setBooleanField(term1522649, term1522649.getClass(), "valid", false);
        setField(term1522649, term1522649.getClass(), "dropTarget", null);
        setField(term1522649, term1522649.getClass(), "popups", null);
        setField(term1522649, term1522649.getClass(), "name", null);
        setBooleanField(term1522649, term1522649.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1522649, term1522649.getClass(), "focusable", false);
        setIntField(term1522649, term1522649.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1522649, term1522649.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1522649, term1522649.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1522649, term1522649.getClass(), "acc", null);
        setField(term1522649, term1522649.getClass(), "minSize", null);
        setBooleanField(term1522649, term1522649.getClass(), "minSizeSet", false);
        setField(term1522649, term1522649.getClass(), "prefSize", null);
        setBooleanField(term1522649, term1522649.getClass(), "prefSizeSet", false);
        setField(term1522649, term1522649.getClass(), "maxSize", null);
        setBooleanField(term1522649, term1522649.getClass(), "maxSizeSet", false);
        setField(term1522649, term1522649.getClass(), "componentOrientation", null);
        setBooleanField(term1522649, term1522649.getClass(), "newEventsOnly", false);
        setField(term1522649, term1522649.getClass(), "componentListener", null);
        setField(term1522649, term1522649.getClass(), "focusListener", null);
        setField(term1522649, term1522649.getClass(), "hierarchyListener", null);
        setField(term1522649, term1522649.getClass(), "hierarchyBoundsListener", null);
        setField(term1522649, term1522649.getClass(), "keyListener", null);
        setField(term1522649, term1522649.getClass(), "mouseListener", null);
        setField(term1522649, term1522649.getClass(), "mouseMotionListener", null);
        setField(term1522649, term1522649.getClass(), "mouseWheelListener", null);
        setField(term1522649, term1522649.getClass(), "inputMethodListener", null);
        setLongField(term1522649, term1522649.getClass(), "eventMask", 0L);
        setField(term1522649, term1522649.getClass(), "changeSupport", null);
        setField(term1522649, term1522649.getClass(), "objectLock", null);
        setBooleanField(term1522649, term1522649.getClass(), "isPacked", false);
        setIntField(term1522649, term1522649.getClass(), "boundsOp", 0);
        setField(term1522649, term1522649.getClass(), "compoundShape", null);
        setField(term1522649, term1522649.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1522649, term1522649.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1522649, term1522649.getClass(), "backgroundEraseDisabled", false);
        setField(term1522649, term1522649.getClass(), "eventCache", null);
        setBooleanField(term1522649, term1522649.getClass(), "coalescingEnabled", false);
        setBooleanField(term1522649, term1522649.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1522649, term1522649.getClass(), "componentSerializedDataVersion", 0);
        setField(term1522649, term1522649.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanet", argTypes, term1522649, args);
    }

};


