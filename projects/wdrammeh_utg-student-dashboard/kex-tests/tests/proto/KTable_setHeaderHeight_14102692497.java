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
import java.lang.Integer;

public class KTable_setHeaderHeight_14102692497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33334;
     Object term33396;

    public KTable_setHeaderHeight_14102692497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33334 = newInstance(Class.forName("proto.KTable"));
        setField(term33334, term33334.getClass(), "dataModel", null);
        setField(term33334, term33334.getClass(), "columnModel", null);
        setField(term33334, term33334.getClass(), "selectionModel", null);
        setField(term33334, term33334.getClass(), "tableHeader", null);
        setIntField(term33334, term33334.getClass(), "rowHeight", 0);
        setIntField(term33334, term33334.getClass(), "rowMargin", 0);
        setField(term33334, term33334.getClass(), "gridColor", null);
        setBooleanField(term33334, term33334.getClass(), "showHorizontalLines", false);
        setBooleanField(term33334, term33334.getClass(), "showVerticalLines", false);
        setIntField(term33334, term33334.getClass(), "autoResizeMode", 0);
        setBooleanField(term33334, term33334.getClass(), "autoCreateColumnsFromModel", false);
        setField(term33334, term33334.getClass(), "preferredViewportSize", null);
        setBooleanField(term33334, term33334.getClass(), "rowSelectionAllowed", false);
        setBooleanField(term33334, term33334.getClass(), "cellSelectionEnabled", false);
        setField(term33334, term33334.getClass(), "editorComp", null);
        setField(term33334, term33334.getClass(), "cellEditor", null);
        setIntField(term33334, term33334.getClass(), "editingColumn", 0);
        setIntField(term33334, term33334.getClass(), "editingRow", 0);
        setField(term33334, term33334.getClass(), "defaultRenderersByColumnClass", null);
        setField(term33334, term33334.getClass(), "defaultEditorsByColumnClass", null);
        setField(term33334, term33334.getClass(), "selectionForeground", null);
        setField(term33334, term33334.getClass(), "selectionBackground", null);
        setField(term33334, term33334.getClass(), "rowModel", null);
        setBooleanField(term33334, term33334.getClass(), "dragEnabled", false);
        setBooleanField(term33334, term33334.getClass(), "surrendersFocusOnKeystroke", false);
        setField(term33334, term33334.getClass(), "editorRemover", null);
        setBooleanField(term33334, term33334.getClass(), "columnSelectionAdjusting", false);
        setBooleanField(term33334, term33334.getClass(), "rowSelectionAdjusting", false);
        setField(term33334, term33334.getClass(), "printError", null);
        setBooleanField(term33334, term33334.getClass(), "isRowHeightSet", false);
        setBooleanField(term33334, term33334.getClass(), "updateSelectionOnSort", false);
        setField(term33334, term33334.getClass(), "sortManager", null);
        setBooleanField(term33334, term33334.getClass(), "ignoreSortChange", false);
        setBooleanField(term33334, term33334.getClass(), "sorterChanged", false);
        setBooleanField(term33334, term33334.getClass(), "autoCreateRowSorter", false);
        setBooleanField(term33334, term33334.getClass(), "fillsViewportHeight", false);
        setField(term33334, term33334.getClass(), "dropMode", null);
        setField(term33334, term33334.getClass(), "dropLocation", null);
        setBooleanField(term33334, term33334.getClass(), "updateInProgress", false);
        setBooleanField(term33334, term33334.getClass(), "isAlignmentXSet", false);
        setFloatField(term33334, term33334.getClass(), "alignmentX", 0.0F);
        setBooleanField(term33334, term33334.getClass(), "isAlignmentYSet", false);
        setFloatField(term33334, term33334.getClass(), "alignmentY", 0.0F);
        setField(term33334, term33334.getClass(), "ui", null);
        setField(term33334, term33334.getClass(), "listenerList", null);
        setField(term33334, term33334.getClass(), "clientProperties", null);
        setField(term33334, term33334.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term33334, term33334.getClass(), "autoscrolls", false);
        setField(term33334, term33334.getClass(), "border", null);
        setIntField(term33334, term33334.getClass(), "flags", 0);
        setField(term33334, term33334.getClass(), "inputVerifier", null);
        setBooleanField(term33334, term33334.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term33334, term33334.getClass(), "paintingChild", null);
        setField(term33334, term33334.getClass(), "popupMenu", null);
        setField(term33334, term33334.getClass(), "revalidateRunnableScheduled", null);
        setField(term33334, term33334.getClass(), "focusInputMap", null);
        setField(term33334, term33334.getClass(), "ancestorInputMap", null);
        setField(term33334, term33334.getClass(), "windowInputMap", null);
        setField(term33334, term33334.getClass(), "actionMap", null);
        setField(term33334, term33334.getClass(), "aaHint", null);
        setField(term33334, term33334.getClass(), "lcdRenderingHint", null);
        setField(term33334, term33334.getClass(), "component", null);
        setField(term33334, term33334.getClass(), "layoutMgr", null);
        setField(term33334, term33334.getClass(), "dispatcher", null);
        setField(term33334, term33334.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term33334, term33334.getClass(), "focusCycleRoot", false);
        setBooleanField(term33334, term33334.getClass(), "focusTraversalPolicyProvider", false);
        setField(term33334, term33334.getClass(), "printingThreads", null);
        setBooleanField(term33334, term33334.getClass(), "printing", false);
        setField(term33334, term33334.getClass(), "containerListener", null);
        setIntField(term33334, term33334.getClass(), "listeningChildren", 0);
        setIntField(term33334, term33334.getClass(), "listeningBoundsChildren", 0);
        setIntField(term33334, term33334.getClass(), "descendantsCount", 0);
        setField(term33334, term33334.getClass(), "preserveBackgroundColor", null);
        setIntField(term33334, term33334.getClass(), "numOfHWComponents", 0);
        setIntField(term33334, term33334.getClass(), "numOfLWComponents", 0);
        setField(term33334, term33334.getClass(), "modalComp", null);
        setField(term33334, term33334.getClass(), "modalAppContext", null);
        setIntField(term33334, term33334.getClass(), "containerSerializedDataVersion", 0);
        setField(term33334, term33334.getClass(), "peer", null);
        setField(term33334, term33334.getClass(), "parent", null);
        setField(term33334, term33334.getClass(), "appContext", null);
        setIntField(term33334, term33334.getClass(), "x", 0);
        setIntField(term33334, term33334.getClass(), "y", 0);
        setIntField(term33334, term33334.getClass(), "width", 0);
        setIntField(term33334, term33334.getClass(), "height", 0);
        setField(term33334, term33334.getClass(), "foreground", null);
        setField(term33334, term33334.getClass(), "background", null);
        setField(term33334, term33334.getClass(), "font", null);
        setField(term33334, term33334.getClass(), "peerFont", null);
        setField(term33334, term33334.getClass(), "cursor", null);
        setField(term33334, term33334.getClass(), "locale", null);
        setField(term33334, term33334.getClass(), "graphicsConfig", null);
        setField(term33334, term33334.getClass(), "bufferStrategy", null);
        setBooleanField(term33334, term33334.getClass(), "ignoreRepaint", false);
        setBooleanField(term33334, term33334.getClass(), "visible", false);
        setBooleanField(term33334, term33334.getClass(), "enabled", false);
        setBooleanField(term33334, term33334.getClass(), "valid", false);
        setField(term33334, term33334.getClass(), "dropTarget", null);
        setField(term33334, term33334.getClass(), "popups", null);
        setField(term33334, term33334.getClass(), "name", null);
        setBooleanField(term33334, term33334.getClass(), "nameExplicitlySet", false);
        setBooleanField(term33334, term33334.getClass(), "focusable", false);
        setIntField(term33334, term33334.getClass(), "isFocusTraversableOverridden", 0);
        setField(term33334, term33334.getClass(), "focusTraversalKeys", null);
        setBooleanField(term33334, term33334.getClass(), "focusTraversalKeysEnabled", false);
        setField(term33334, term33334.getClass(), "acc", null);
        setField(term33334, term33334.getClass(), "minSize", null);
        setBooleanField(term33334, term33334.getClass(), "minSizeSet", false);
        setField(term33334, term33334.getClass(), "prefSize", null);
        setBooleanField(term33334, term33334.getClass(), "prefSizeSet", false);
        setField(term33334, term33334.getClass(), "maxSize", null);
        setBooleanField(term33334, term33334.getClass(), "maxSizeSet", false);
        setField(term33334, term33334.getClass(), "componentOrientation", null);
        setBooleanField(term33334, term33334.getClass(), "newEventsOnly", false);
        setField(term33334, term33334.getClass(), "componentListener", null);
        setField(term33334, term33334.getClass(), "focusListener", null);
        setField(term33334, term33334.getClass(), "hierarchyListener", null);
        setField(term33334, term33334.getClass(), "hierarchyBoundsListener", null);
        setField(term33334, term33334.getClass(), "keyListener", null);
        setField(term33334, term33334.getClass(), "mouseListener", null);
        setField(term33334, term33334.getClass(), "mouseMotionListener", null);
        setField(term33334, term33334.getClass(), "mouseWheelListener", null);
        setField(term33334, term33334.getClass(), "inputMethodListener", null);
        setLongField(term33334, term33334.getClass(), "eventMask", 0L);
        setField(term33334, term33334.getClass(), "changeSupport", null);
        setField(term33334, term33334.getClass(), "objectLock", null);
        setBooleanField(term33334, term33334.getClass(), "isPacked", false);
        setIntField(term33334, term33334.getClass(), "boundsOp", 0);
        setField(term33334, term33334.getClass(), "compoundShape", null);
        setField(term33334, term33334.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term33334, term33334.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term33334, term33334.getClass(), "backgroundEraseDisabled", false);
        setField(term33334, term33334.getClass(), "eventCache", null);
        setBooleanField(term33334, term33334.getClass(), "coalescingEnabled", false);
        setBooleanField(term33334, term33334.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term33334, term33334.getClass(), "componentSerializedDataVersion", 0);
        setField(term33334, term33334.getClass(), "accessibleContext", null);
        term33396 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term33396;
        callMethod(klass, "setHeaderHeight", argTypes, term33334, args);
    }

};


