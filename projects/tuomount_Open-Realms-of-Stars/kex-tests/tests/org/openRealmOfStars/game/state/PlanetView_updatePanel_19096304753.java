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

public class PlanetView_updatePanel_19096304753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1519959;

    public PlanetView_updatePanel_19096304753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1519959 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetView"));
        setField(term1519959, term1519959.getClass(), "farmPanel", null);
        setField(term1519959, term1519959.getClass(), "minePanel", null);
        setField(term1519959, term1519959.getClass(), "factoryPanel", null);
        setField(term1519959, term1519959.getClass(), "resePanel", null);
        setField(term1519959, term1519959.getClass(), "taxPanel", null);
        setField(term1519959, term1519959.getClass(), "cultureLabel", null);
        setField(term1519959, term1519959.getClass(), "totalPeople", null);
        setField(term1519959, term1519959.getClass(), "peopleGrowth", null);
        setField(term1519959, term1519959.getClass(), "farmProd", null);
        setField(term1519959, term1519959.getClass(), "mineProd", null);
        setField(term1519959, term1519959.getClass(), "prodProd", null);
        setField(term1519959, term1519959.getClass(), "reseProd", null);
        setField(term1519959, term1519959.getClass(), "cultProd", null);
        setField(term1519959, term1519959.getClass(), "credProd", null);
        setField(term1519959, term1519959.getClass(), "maintenance", null);
        setField(term1519959, term1519959.getClass(), "metal", null);
        setField(term1519959, term1519959.getClass(), "metalOre", null);
        setField(term1519959, term1519959.getClass(), "happiness", null);
        setField(term1519959, term1519959.getClass(), "constructionSelect", null);
        setField(term1519959, term1519959.getClass(), "buildingLabel", null);
        setField(term1519959, term1519959.getClass(), "buildingEstimate", null);
        setField(term1519959, term1519959.getClass(), "governorLabel", null);
        setField(term1519959, term1519959.getClass(), "leaderViewBtn", null);
        setField(term1519959, term1519959.getClass(), "productionInfo", null);
        setField(term1519959, term1519959.getClass(), "buildingInfo", null);
        setField(term1519959, term1519959.getClass(), "buildingList", null);
        setField(term1519959, term1519959.getClass(), "demolishBuildingBtn", null);
        setField(term1519959, term1519959.getClass(), "rushWithCreditsBtn", null);
        setField(term1519959, term1519959.getClass(), "rushWithPopulationBtn", null);
        setField(term1519959, term1519959.getClass(), "planet", null);
        setBooleanField(term1519959, term1519959.getClass(), "allowHandling", false);
        setField(term1519959, term1519959.getClass(), "info", null);
        setField(term1519959, term1519959.getClass(), "imgBase", null);
        setField(term1519959, term1519959.getClass(), "governorGuideSelect", null);
        setField(term1519959, term1519959.getClass(), "map", null);
        setBooleanField(term1519959, term1519959.getClass(), "isAlignmentXSet", false);
        setFloatField(term1519959, term1519959.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1519959, term1519959.getClass(), "isAlignmentYSet", false);
        setFloatField(term1519959, term1519959.getClass(), "alignmentY", 0.0F);
        setField(term1519959, term1519959.getClass(), "ui", null);
        setField(term1519959, term1519959.getClass(), "listenerList", null);
        setField(term1519959, term1519959.getClass(), "clientProperties", null);
        setField(term1519959, term1519959.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1519959, term1519959.getClass(), "autoscrolls", false);
        setField(term1519959, term1519959.getClass(), "border", null);
        setIntField(term1519959, term1519959.getClass(), "flags", 0);
        setField(term1519959, term1519959.getClass(), "inputVerifier", null);
        setBooleanField(term1519959, term1519959.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1519959, term1519959.getClass(), "paintingChild", null);
        setField(term1519959, term1519959.getClass(), "popupMenu", null);
        setField(term1519959, term1519959.getClass(), "revalidateRunnableScheduled", null);
        setField(term1519959, term1519959.getClass(), "focusInputMap", null);
        setField(term1519959, term1519959.getClass(), "ancestorInputMap", null);
        setField(term1519959, term1519959.getClass(), "windowInputMap", null);
        setField(term1519959, term1519959.getClass(), "actionMap", null);
        setField(term1519959, term1519959.getClass(), "aaHint", null);
        setField(term1519959, term1519959.getClass(), "lcdRenderingHint", null);
        setField(term1519959, term1519959.getClass(), "component", null);
        setField(term1519959, term1519959.getClass(), "layoutMgr", null);
        setField(term1519959, term1519959.getClass(), "dispatcher", null);
        setField(term1519959, term1519959.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1519959, term1519959.getClass(), "focusCycleRoot", false);
        setBooleanField(term1519959, term1519959.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1519959, term1519959.getClass(), "printingThreads", null);
        setBooleanField(term1519959, term1519959.getClass(), "printing", false);
        setField(term1519959, term1519959.getClass(), "containerListener", null);
        setIntField(term1519959, term1519959.getClass(), "listeningChildren", 0);
        setIntField(term1519959, term1519959.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1519959, term1519959.getClass(), "descendantsCount", 0);
        setField(term1519959, term1519959.getClass(), "preserveBackgroundColor", null);
        setIntField(term1519959, term1519959.getClass(), "numOfHWComponents", 0);
        setIntField(term1519959, term1519959.getClass(), "numOfLWComponents", 0);
        setField(term1519959, term1519959.getClass(), "modalComp", null);
        setField(term1519959, term1519959.getClass(), "modalAppContext", null);
        setIntField(term1519959, term1519959.getClass(), "containerSerializedDataVersion", 0);
        setField(term1519959, term1519959.getClass(), "peer", null);
        setField(term1519959, term1519959.getClass(), "parent", null);
        setField(term1519959, term1519959.getClass(), "appContext", null);
        setIntField(term1519959, term1519959.getClass(), "x", 0);
        setIntField(term1519959, term1519959.getClass(), "y", 0);
        setIntField(term1519959, term1519959.getClass(), "width", 0);
        setIntField(term1519959, term1519959.getClass(), "height", 0);
        setField(term1519959, term1519959.getClass(), "foreground", null);
        setField(term1519959, term1519959.getClass(), "background", null);
        setField(term1519959, term1519959.getClass(), "font", null);
        setField(term1519959, term1519959.getClass(), "peerFont", null);
        setField(term1519959, term1519959.getClass(), "cursor", null);
        setField(term1519959, term1519959.getClass(), "locale", null);
        setField(term1519959, term1519959.getClass(), "graphicsConfig", null);
        setField(term1519959, term1519959.getClass(), "bufferStrategy", null);
        setBooleanField(term1519959, term1519959.getClass(), "ignoreRepaint", false);
        setBooleanField(term1519959, term1519959.getClass(), "visible", false);
        setBooleanField(term1519959, term1519959.getClass(), "enabled", false);
        setBooleanField(term1519959, term1519959.getClass(), "valid", false);
        setField(term1519959, term1519959.getClass(), "dropTarget", null);
        setField(term1519959, term1519959.getClass(), "popups", null);
        setField(term1519959, term1519959.getClass(), "name", null);
        setBooleanField(term1519959, term1519959.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1519959, term1519959.getClass(), "focusable", false);
        setIntField(term1519959, term1519959.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1519959, term1519959.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1519959, term1519959.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1519959, term1519959.getClass(), "acc", null);
        setField(term1519959, term1519959.getClass(), "minSize", null);
        setBooleanField(term1519959, term1519959.getClass(), "minSizeSet", false);
        setField(term1519959, term1519959.getClass(), "prefSize", null);
        setBooleanField(term1519959, term1519959.getClass(), "prefSizeSet", false);
        setField(term1519959, term1519959.getClass(), "maxSize", null);
        setBooleanField(term1519959, term1519959.getClass(), "maxSizeSet", false);
        setField(term1519959, term1519959.getClass(), "componentOrientation", null);
        setBooleanField(term1519959, term1519959.getClass(), "newEventsOnly", false);
        setField(term1519959, term1519959.getClass(), "componentListener", null);
        setField(term1519959, term1519959.getClass(), "focusListener", null);
        setField(term1519959, term1519959.getClass(), "hierarchyListener", null);
        setField(term1519959, term1519959.getClass(), "hierarchyBoundsListener", null);
        setField(term1519959, term1519959.getClass(), "keyListener", null);
        setField(term1519959, term1519959.getClass(), "mouseListener", null);
        setField(term1519959, term1519959.getClass(), "mouseMotionListener", null);
        setField(term1519959, term1519959.getClass(), "mouseWheelListener", null);
        setField(term1519959, term1519959.getClass(), "inputMethodListener", null);
        setLongField(term1519959, term1519959.getClass(), "eventMask", 0L);
        setField(term1519959, term1519959.getClass(), "changeSupport", null);
        setField(term1519959, term1519959.getClass(), "objectLock", null);
        setBooleanField(term1519959, term1519959.getClass(), "isPacked", false);
        setIntField(term1519959, term1519959.getClass(), "boundsOp", 0);
        setField(term1519959, term1519959.getClass(), "compoundShape", null);
        setField(term1519959, term1519959.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1519959, term1519959.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1519959, term1519959.getClass(), "backgroundEraseDisabled", false);
        setField(term1519959, term1519959.getClass(), "eventCache", null);
        setBooleanField(term1519959, term1519959.getClass(), "coalescingEnabled", false);
        setBooleanField(term1519959, term1519959.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1519959, term1519959.getClass(), "componentSerializedDataVersion", 0);
        setField(term1519959, term1519959.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updatePanel", argTypes, term1519959, args);
    }

};


