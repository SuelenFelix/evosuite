package proto;

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
import static proto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KTable_setPreferences_5024009513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36020;

    public KTable_setPreferences_5024009513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36020 = newInstance(Class.forName("proto.KTable"));
        setField(term36020, term36020.getClass(), "dataModel", null);
        setField(term36020, term36020.getClass(), "columnModel", null);
        setField(term36020, term36020.getClass(), "selectionModel", null);
        setField(term36020, term36020.getClass(), "tableHeader", null);
        setIntField(term36020, term36020.getClass(), "rowHeight", 0);
        setIntField(term36020, term36020.getClass(), "rowMargin", 0);
        setField(term36020, term36020.getClass(), "gridColor", null);
        setBooleanField(term36020, term36020.getClass(), "showHorizontalLines", false);
        setBooleanField(term36020, term36020.getClass(), "showVerticalLines", false);
        setIntField(term36020, term36020.getClass(), "autoResizeMode", 0);
        setBooleanField(term36020, term36020.getClass(), "autoCreateColumnsFromModel", false);
        setField(term36020, term36020.getClass(), "preferredViewportSize", null);
        setBooleanField(term36020, term36020.getClass(), "rowSelectionAllowed", false);
        setBooleanField(term36020, term36020.getClass(), "cellSelectionEnabled", false);
        setField(term36020, term36020.getClass(), "editorComp", null);
        setField(term36020, term36020.getClass(), "cellEditor", null);
        setIntField(term36020, term36020.getClass(), "editingColumn", 0);
        setIntField(term36020, term36020.getClass(), "editingRow", 0);
        setField(term36020, term36020.getClass(), "defaultRenderersByColumnClass", null);
        setField(term36020, term36020.getClass(), "defaultEditorsByColumnClass", null);
        setField(term36020, term36020.getClass(), "selectionForeground", null);
        setField(term36020, term36020.getClass(), "selectionBackground", null);
        setField(term36020, term36020.getClass(), "rowModel", null);
        setBooleanField(term36020, term36020.getClass(), "dragEnabled", false);
        setBooleanField(term36020, term36020.getClass(), "surrendersFocusOnKeystroke", false);
        setField(term36020, term36020.getClass(), "editorRemover", null);
        setBooleanField(term36020, term36020.getClass(), "columnSelectionAdjusting", false);
        setBooleanField(term36020, term36020.getClass(), "rowSelectionAdjusting", false);
        setField(term36020, term36020.getClass(), "printError", null);
        setBooleanField(term36020, term36020.getClass(), "isRowHeightSet", false);
        setBooleanField(term36020, term36020.getClass(), "updateSelectionOnSort", false);
        setField(term36020, term36020.getClass(), "sortManager", null);
        setBooleanField(term36020, term36020.getClass(), "ignoreSortChange", false);
        setBooleanField(term36020, term36020.getClass(), "sorterChanged", false);
        setBooleanField(term36020, term36020.getClass(), "autoCreateRowSorter", false);
        setBooleanField(term36020, term36020.getClass(), "fillsViewportHeight", false);
        setField(term36020, term36020.getClass(), "dropMode", null);
        setField(term36020, term36020.getClass(), "dropLocation", null);
        setBooleanField(term36020, term36020.getClass(), "updateInProgress", false);
        setBooleanField(term36020, term36020.getClass(), "isAlignmentXSet", false);
        setFloatField(term36020, term36020.getClass(), "alignmentX", 0.0F);
        setBooleanField(term36020, term36020.getClass(), "isAlignmentYSet", false);
        setFloatField(term36020, term36020.getClass(), "alignmentY", 0.0F);
        setField(term36020, term36020.getClass(), "ui", null);
        setField(term36020, term36020.getClass(), "listenerList", null);
        setField(term36020, term36020.getClass(), "clientProperties", null);
        setField(term36020, term36020.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term36020, term36020.getClass(), "autoscrolls", false);
        setField(term36020, term36020.getClass(), "border", null);
        setIntField(term36020, term36020.getClass(), "flags", 0);
        setField(term36020, term36020.getClass(), "inputVerifier", null);
        setBooleanField(term36020, term36020.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term36020, term36020.getClass(), "paintingChild", null);
        setField(term36020, term36020.getClass(), "popupMenu", null);
        setField(term36020, term36020.getClass(), "revalidateRunnableScheduled", null);
        setField(term36020, term36020.getClass(), "focusInputMap", null);
        setField(term36020, term36020.getClass(), "ancestorInputMap", null);
        setField(term36020, term36020.getClass(), "windowInputMap", null);
        setField(term36020, term36020.getClass(), "actionMap", null);
        setField(term36020, term36020.getClass(), "aaHint", null);
        setField(term36020, term36020.getClass(), "lcdRenderingHint", null);
        setField(term36020, term36020.getClass(), "component", null);
        setField(term36020, term36020.getClass(), "layoutMgr", null);
        setField(term36020, term36020.getClass(), "dispatcher", null);
        setField(term36020, term36020.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term36020, term36020.getClass(), "focusCycleRoot", false);
        setBooleanField(term36020, term36020.getClass(), "focusTraversalPolicyProvider", false);
        setField(term36020, term36020.getClass(), "printingThreads", null);
        setBooleanField(term36020, term36020.getClass(), "printing", false);
        setField(term36020, term36020.getClass(), "containerListener", null);
        setIntField(term36020, term36020.getClass(), "listeningChildren", 0);
        setIntField(term36020, term36020.getClass(), "listeningBoundsChildren", 0);
        setIntField(term36020, term36020.getClass(), "descendantsCount", 0);
        setField(term36020, term36020.getClass(), "preserveBackgroundColor", null);
        setIntField(term36020, term36020.getClass(), "numOfHWComponents", 0);
        setIntField(term36020, term36020.getClass(), "numOfLWComponents", 0);
        setField(term36020, term36020.getClass(), "modalComp", null);
        setField(term36020, term36020.getClass(), "modalAppContext", null);
        setIntField(term36020, term36020.getClass(), "containerSerializedDataVersion", 0);
        setField(term36020, term36020.getClass(), "peer", null);
        setField(term36020, term36020.getClass(), "parent", null);
        setField(term36020, term36020.getClass(), "appContext", null);
        setIntField(term36020, term36020.getClass(), "x", 0);
        setIntField(term36020, term36020.getClass(), "y", 0);
        setIntField(term36020, term36020.getClass(), "width", 0);
        setIntField(term36020, term36020.getClass(), "height", 0);
        setField(term36020, term36020.getClass(), "foreground", null);
        setField(term36020, term36020.getClass(), "background", null);
        setField(term36020, term36020.getClass(), "font", null);
        setField(term36020, term36020.getClass(), "peerFont", null);
        setField(term36020, term36020.getClass(), "cursor", null);
        setField(term36020, term36020.getClass(), "locale", null);
        setField(term36020, term36020.getClass(), "graphicsConfig", null);
        setField(term36020, term36020.getClass(), "bufferStrategy", null);
        setBooleanField(term36020, term36020.getClass(), "ignoreRepaint", false);
        setBooleanField(term36020, term36020.getClass(), "visible", false);
        setBooleanField(term36020, term36020.getClass(), "enabled", false);
        setBooleanField(term36020, term36020.getClass(), "valid", false);
        setField(term36020, term36020.getClass(), "dropTarget", null);
        setField(term36020, term36020.getClass(), "popups", null);
        setField(term36020, term36020.getClass(), "name", null);
        setBooleanField(term36020, term36020.getClass(), "nameExplicitlySet", false);
        setBooleanField(term36020, term36020.getClass(), "focusable", false);
        setIntField(term36020, term36020.getClass(), "isFocusTraversableOverridden", 0);
        setField(term36020, term36020.getClass(), "focusTraversalKeys", null);
        setBooleanField(term36020, term36020.getClass(), "focusTraversalKeysEnabled", false);
        setField(term36020, term36020.getClass(), "acc", null);
        setField(term36020, term36020.getClass(), "minSize", null);
        setBooleanField(term36020, term36020.getClass(), "minSizeSet", false);
        setField(term36020, term36020.getClass(), "prefSize", null);
        setBooleanField(term36020, term36020.getClass(), "prefSizeSet", false);
        setField(term36020, term36020.getClass(), "maxSize", null);
        setBooleanField(term36020, term36020.getClass(), "maxSizeSet", false);
        setField(term36020, term36020.getClass(), "componentOrientation", null);
        setBooleanField(term36020, term36020.getClass(), "newEventsOnly", false);
        setField(term36020, term36020.getClass(), "componentListener", null);
        setField(term36020, term36020.getClass(), "focusListener", null);
        setField(term36020, term36020.getClass(), "hierarchyListener", null);
        setField(term36020, term36020.getClass(), "hierarchyBoundsListener", null);
        setField(term36020, term36020.getClass(), "keyListener", null);
        setField(term36020, term36020.getClass(), "mouseListener", null);
        setField(term36020, term36020.getClass(), "mouseMotionListener", null);
        setField(term36020, term36020.getClass(), "mouseWheelListener", null);
        setField(term36020, term36020.getClass(), "inputMethodListener", null);
        setLongField(term36020, term36020.getClass(), "eventMask", 0L);
        setField(term36020, term36020.getClass(), "changeSupport", null);
        setField(term36020, term36020.getClass(), "objectLock", null);
        setBooleanField(term36020, term36020.getClass(), "isPacked", false);
        setIntField(term36020, term36020.getClass(), "boundsOp", 0);
        setField(term36020, term36020.getClass(), "compoundShape", null);
        setField(term36020, term36020.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term36020, term36020.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term36020, term36020.getClass(), "backgroundEraseDisabled", false);
        setField(term36020, term36020.getClass(), "eventCache", null);
        setBooleanField(term36020, term36020.getClass(), "coalescingEnabled", false);
        setBooleanField(term36020, term36020.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term36020, term36020.getClass(), "componentSerializedDataVersion", 0);
        setField(term36020, term36020.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term36020, args);
    }

};


