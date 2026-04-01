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

public class PlanetView_valueChanged_136049749211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1539732;

    public PlanetView_valueChanged_136049749211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1539732 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetView"));
        setField(term1539732, term1539732.getClass(), "farmPanel", null);
        setField(term1539732, term1539732.getClass(), "minePanel", null);
        setField(term1539732, term1539732.getClass(), "factoryPanel", null);
        setField(term1539732, term1539732.getClass(), "resePanel", null);
        setField(term1539732, term1539732.getClass(), "taxPanel", null);
        setField(term1539732, term1539732.getClass(), "cultureLabel", null);
        setField(term1539732, term1539732.getClass(), "totalPeople", null);
        setField(term1539732, term1539732.getClass(), "peopleGrowth", null);
        setField(term1539732, term1539732.getClass(), "farmProd", null);
        setField(term1539732, term1539732.getClass(), "mineProd", null);
        setField(term1539732, term1539732.getClass(), "prodProd", null);
        setField(term1539732, term1539732.getClass(), "reseProd", null);
        setField(term1539732, term1539732.getClass(), "cultProd", null);
        setField(term1539732, term1539732.getClass(), "credProd", null);
        setField(term1539732, term1539732.getClass(), "maintenance", null);
        setField(term1539732, term1539732.getClass(), "metal", null);
        setField(term1539732, term1539732.getClass(), "metalOre", null);
        setField(term1539732, term1539732.getClass(), "happiness", null);
        setField(term1539732, term1539732.getClass(), "constructionSelect", null);
        setField(term1539732, term1539732.getClass(), "buildingLabel", null);
        setField(term1539732, term1539732.getClass(), "buildingEstimate", null);
        setField(term1539732, term1539732.getClass(), "governorLabel", null);
        setField(term1539732, term1539732.getClass(), "leaderViewBtn", null);
        setField(term1539732, term1539732.getClass(), "productionInfo", null);
        setField(term1539732, term1539732.getClass(), "buildingInfo", null);
        setField(term1539732, term1539732.getClass(), "buildingList", null);
        setField(term1539732, term1539732.getClass(), "demolishBuildingBtn", null);
        setField(term1539732, term1539732.getClass(), "rushWithCreditsBtn", null);
        setField(term1539732, term1539732.getClass(), "rushWithPopulationBtn", null);
        setField(term1539732, term1539732.getClass(), "planet", null);
        setBooleanField(term1539732, term1539732.getClass(), "allowHandling", false);
        setField(term1539732, term1539732.getClass(), "info", null);
        setField(term1539732, term1539732.getClass(), "imgBase", null);
        setField(term1539732, term1539732.getClass(), "governorGuideSelect", null);
        setField(term1539732, term1539732.getClass(), "map", null);
        setBooleanField(term1539732, term1539732.getClass(), "isAlignmentXSet", false);
        setFloatField(term1539732, term1539732.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1539732, term1539732.getClass(), "isAlignmentYSet", false);
        setFloatField(term1539732, term1539732.getClass(), "alignmentY", 0.0F);
        setField(term1539732, term1539732.getClass(), "ui", null);
        setField(term1539732, term1539732.getClass(), "listenerList", null);
        setField(term1539732, term1539732.getClass(), "clientProperties", null);
        setField(term1539732, term1539732.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1539732, term1539732.getClass(), "autoscrolls", false);
        setField(term1539732, term1539732.getClass(), "border", null);
        setIntField(term1539732, term1539732.getClass(), "flags", 0);
        setField(term1539732, term1539732.getClass(), "inputVerifier", null);
        setBooleanField(term1539732, term1539732.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1539732, term1539732.getClass(), "paintingChild", null);
        setField(term1539732, term1539732.getClass(), "popupMenu", null);
        setField(term1539732, term1539732.getClass(), "revalidateRunnableScheduled", null);
        setField(term1539732, term1539732.getClass(), "focusInputMap", null);
        setField(term1539732, term1539732.getClass(), "ancestorInputMap", null);
        setField(term1539732, term1539732.getClass(), "windowInputMap", null);
        setField(term1539732, term1539732.getClass(), "actionMap", null);
        setField(term1539732, term1539732.getClass(), "aaHint", null);
        setField(term1539732, term1539732.getClass(), "lcdRenderingHint", null);
        setField(term1539732, term1539732.getClass(), "component", null);
        setField(term1539732, term1539732.getClass(), "layoutMgr", null);
        setField(term1539732, term1539732.getClass(), "dispatcher", null);
        setField(term1539732, term1539732.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1539732, term1539732.getClass(), "focusCycleRoot", false);
        setBooleanField(term1539732, term1539732.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1539732, term1539732.getClass(), "printingThreads", null);
        setBooleanField(term1539732, term1539732.getClass(), "printing", false);
        setField(term1539732, term1539732.getClass(), "containerListener", null);
        setIntField(term1539732, term1539732.getClass(), "listeningChildren", 0);
        setIntField(term1539732, term1539732.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1539732, term1539732.getClass(), "descendantsCount", 0);
        setField(term1539732, term1539732.getClass(), "preserveBackgroundColor", null);
        setIntField(term1539732, term1539732.getClass(), "numOfHWComponents", 0);
        setIntField(term1539732, term1539732.getClass(), "numOfLWComponents", 0);
        setField(term1539732, term1539732.getClass(), "modalComp", null);
        setField(term1539732, term1539732.getClass(), "modalAppContext", null);
        setIntField(term1539732, term1539732.getClass(), "containerSerializedDataVersion", 0);
        setField(term1539732, term1539732.getClass(), "peer", null);
        setField(term1539732, term1539732.getClass(), "parent", null);
        setField(term1539732, term1539732.getClass(), "appContext", null);
        setIntField(term1539732, term1539732.getClass(), "x", 0);
        setIntField(term1539732, term1539732.getClass(), "y", 0);
        setIntField(term1539732, term1539732.getClass(), "width", 0);
        setIntField(term1539732, term1539732.getClass(), "height", 0);
        setField(term1539732, term1539732.getClass(), "foreground", null);
        setField(term1539732, term1539732.getClass(), "background", null);
        setField(term1539732, term1539732.getClass(), "font", null);
        setField(term1539732, term1539732.getClass(), "peerFont", null);
        setField(term1539732, term1539732.getClass(), "cursor", null);
        setField(term1539732, term1539732.getClass(), "locale", null);
        setField(term1539732, term1539732.getClass(), "graphicsConfig", null);
        setField(term1539732, term1539732.getClass(), "bufferStrategy", null);
        setBooleanField(term1539732, term1539732.getClass(), "ignoreRepaint", false);
        setBooleanField(term1539732, term1539732.getClass(), "visible", false);
        setBooleanField(term1539732, term1539732.getClass(), "enabled", false);
        setBooleanField(term1539732, term1539732.getClass(), "valid", false);
        setField(term1539732, term1539732.getClass(), "dropTarget", null);
        setField(term1539732, term1539732.getClass(), "popups", null);
        setField(term1539732, term1539732.getClass(), "name", null);
        setBooleanField(term1539732, term1539732.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1539732, term1539732.getClass(), "focusable", false);
        setIntField(term1539732, term1539732.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1539732, term1539732.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1539732, term1539732.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1539732, term1539732.getClass(), "acc", null);
        setField(term1539732, term1539732.getClass(), "minSize", null);
        setBooleanField(term1539732, term1539732.getClass(), "minSizeSet", false);
        setField(term1539732, term1539732.getClass(), "prefSize", null);
        setBooleanField(term1539732, term1539732.getClass(), "prefSizeSet", false);
        setField(term1539732, term1539732.getClass(), "maxSize", null);
        setBooleanField(term1539732, term1539732.getClass(), "maxSizeSet", false);
        setField(term1539732, term1539732.getClass(), "componentOrientation", null);
        setBooleanField(term1539732, term1539732.getClass(), "newEventsOnly", false);
        setField(term1539732, term1539732.getClass(), "componentListener", null);
        setField(term1539732, term1539732.getClass(), "focusListener", null);
        setField(term1539732, term1539732.getClass(), "hierarchyListener", null);
        setField(term1539732, term1539732.getClass(), "hierarchyBoundsListener", null);
        setField(term1539732, term1539732.getClass(), "keyListener", null);
        setField(term1539732, term1539732.getClass(), "mouseListener", null);
        setField(term1539732, term1539732.getClass(), "mouseMotionListener", null);
        setField(term1539732, term1539732.getClass(), "mouseWheelListener", null);
        setField(term1539732, term1539732.getClass(), "inputMethodListener", null);
        setLongField(term1539732, term1539732.getClass(), "eventMask", 0L);
        setField(term1539732, term1539732.getClass(), "changeSupport", null);
        setField(term1539732, term1539732.getClass(), "objectLock", null);
        setBooleanField(term1539732, term1539732.getClass(), "isPacked", false);
        setIntField(term1539732, term1539732.getClass(), "boundsOp", 0);
        setField(term1539732, term1539732.getClass(), "compoundShape", null);
        setField(term1539732, term1539732.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1539732, term1539732.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1539732, term1539732.getClass(), "backgroundEraseDisabled", false);
        setField(term1539732, term1539732.getClass(), "eventCache", null);
        setBooleanField(term1539732, term1539732.getClass(), "coalescingEnabled", false);
        setBooleanField(term1539732, term1539732.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1539732, term1539732.getClass(), "componentSerializedDataVersion", 0);
        setField(term1539732, term1539732.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.ListSelectionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "valueChanged", argTypes, term1539732, args);
    }

};


