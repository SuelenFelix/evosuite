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
     Object term33367;
     Object term33429;

    public KTable_setHeaderHeight_14102692497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33367 = newInstance(Class.forName("proto.KTable"));
        setField(term33367, term33367.getClass(), "dataModel", null);
        setField(term33367, term33367.getClass(), "columnModel", null);
        setField(term33367, term33367.getClass(), "selectionModel", null);
        setField(term33367, term33367.getClass(), "tableHeader", null);
        setIntField(term33367, term33367.getClass(), "rowHeight", 0);
        setIntField(term33367, term33367.getClass(), "rowMargin", 0);
        setField(term33367, term33367.getClass(), "gridColor", null);
        setBooleanField(term33367, term33367.getClass(), "showHorizontalLines", false);
        setBooleanField(term33367, term33367.getClass(), "showVerticalLines", false);
        setIntField(term33367, term33367.getClass(), "autoResizeMode", 0);
        setBooleanField(term33367, term33367.getClass(), "autoCreateColumnsFromModel", false);
        setField(term33367, term33367.getClass(), "preferredViewportSize", null);
        setBooleanField(term33367, term33367.getClass(), "rowSelectionAllowed", false);
        setBooleanField(term33367, term33367.getClass(), "cellSelectionEnabled", false);
        setField(term33367, term33367.getClass(), "editorComp", null);
        setField(term33367, term33367.getClass(), "cellEditor", null);
        setIntField(term33367, term33367.getClass(), "editingColumn", 0);
        setIntField(term33367, term33367.getClass(), "editingRow", 0);
        setField(term33367, term33367.getClass(), "defaultRenderersByColumnClass", null);
        setField(term33367, term33367.getClass(), "defaultEditorsByColumnClass", null);
        setField(term33367, term33367.getClass(), "selectionForeground", null);
        setField(term33367, term33367.getClass(), "selectionBackground", null);
        setField(term33367, term33367.getClass(), "rowModel", null);
        setBooleanField(term33367, term33367.getClass(), "dragEnabled", false);
        setBooleanField(term33367, term33367.getClass(), "surrendersFocusOnKeystroke", false);
        setField(term33367, term33367.getClass(), "editorRemover", null);
        setBooleanField(term33367, term33367.getClass(), "columnSelectionAdjusting", false);
        setBooleanField(term33367, term33367.getClass(), "rowSelectionAdjusting", false);
        setField(term33367, term33367.getClass(), "printError", null);
        setBooleanField(term33367, term33367.getClass(), "isRowHeightSet", false);
        setBooleanField(term33367, term33367.getClass(), "updateSelectionOnSort", false);
        setField(term33367, term33367.getClass(), "sortManager", null);
        setBooleanField(term33367, term33367.getClass(), "ignoreSortChange", false);
        setBooleanField(term33367, term33367.getClass(), "sorterChanged", false);
        setBooleanField(term33367, term33367.getClass(), "autoCreateRowSorter", false);
        setBooleanField(term33367, term33367.getClass(), "fillsViewportHeight", false);
        setField(term33367, term33367.getClass(), "dropMode", null);
        setField(term33367, term33367.getClass(), "dropLocation", null);
        setBooleanField(term33367, term33367.getClass(), "updateInProgress", false);
        setBooleanField(term33367, term33367.getClass(), "isAlignmentXSet", false);
        setFloatField(term33367, term33367.getClass(), "alignmentX", 0.0F);
        setBooleanField(term33367, term33367.getClass(), "isAlignmentYSet", false);
        setFloatField(term33367, term33367.getClass(), "alignmentY", 0.0F);
        setField(term33367, term33367.getClass(), "ui", null);
        setField(term33367, term33367.getClass(), "listenerList", null);
        setField(term33367, term33367.getClass(), "clientProperties", null);
        setField(term33367, term33367.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term33367, term33367.getClass(), "autoscrolls", false);
        setField(term33367, term33367.getClass(), "border", null);
        setIntField(term33367, term33367.getClass(), "flags", 0);
        setField(term33367, term33367.getClass(), "inputVerifier", null);
        setBooleanField(term33367, term33367.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term33367, term33367.getClass(), "paintingChild", null);
        setField(term33367, term33367.getClass(), "popupMenu", null);
        setField(term33367, term33367.getClass(), "revalidateRunnableScheduled", null);
        setField(term33367, term33367.getClass(), "focusInputMap", null);
        setField(term33367, term33367.getClass(), "ancestorInputMap", null);
        setField(term33367, term33367.getClass(), "windowInputMap", null);
        setField(term33367, term33367.getClass(), "actionMap", null);
        setField(term33367, term33367.getClass(), "aaHint", null);
        setField(term33367, term33367.getClass(), "lcdRenderingHint", null);
        setField(term33367, term33367.getClass(), "component", null);
        setField(term33367, term33367.getClass(), "layoutMgr", null);
        setField(term33367, term33367.getClass(), "dispatcher", null);
        setField(term33367, term33367.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term33367, term33367.getClass(), "focusCycleRoot", false);
        setBooleanField(term33367, term33367.getClass(), "focusTraversalPolicyProvider", false);
        setField(term33367, term33367.getClass(), "printingThreads", null);
        setBooleanField(term33367, term33367.getClass(), "printing", false);
        setField(term33367, term33367.getClass(), "containerListener", null);
        setIntField(term33367, term33367.getClass(), "listeningChildren", 0);
        setIntField(term33367, term33367.getClass(), "listeningBoundsChildren", 0);
        setIntField(term33367, term33367.getClass(), "descendantsCount", 0);
        setField(term33367, term33367.getClass(), "preserveBackgroundColor", null);
        setIntField(term33367, term33367.getClass(), "numOfHWComponents", 0);
        setIntField(term33367, term33367.getClass(), "numOfLWComponents", 0);
        setField(term33367, term33367.getClass(), "modalComp", null);
        setField(term33367, term33367.getClass(), "modalAppContext", null);
        setIntField(term33367, term33367.getClass(), "containerSerializedDataVersion", 0);
        setField(term33367, term33367.getClass(), "peer", null);
        setField(term33367, term33367.getClass(), "parent", null);
        setField(term33367, term33367.getClass(), "appContext", null);
        setIntField(term33367, term33367.getClass(), "x", 0);
        setIntField(term33367, term33367.getClass(), "y", 0);
        setIntField(term33367, term33367.getClass(), "width", 0);
        setIntField(term33367, term33367.getClass(), "height", 0);
        setField(term33367, term33367.getClass(), "foreground", null);
        setField(term33367, term33367.getClass(), "background", null);
        setField(term33367, term33367.getClass(), "font", null);
        setField(term33367, term33367.getClass(), "peerFont", null);
        setField(term33367, term33367.getClass(), "cursor", null);
        setField(term33367, term33367.getClass(), "locale", null);
        setField(term33367, term33367.getClass(), "graphicsConfig", null);
        setField(term33367, term33367.getClass(), "bufferStrategy", null);
        setBooleanField(term33367, term33367.getClass(), "ignoreRepaint", false);
        setBooleanField(term33367, term33367.getClass(), "visible", false);
        setBooleanField(term33367, term33367.getClass(), "enabled", false);
        setBooleanField(term33367, term33367.getClass(), "valid", false);
        setField(term33367, term33367.getClass(), "dropTarget", null);
        setField(term33367, term33367.getClass(), "popups", null);
        setField(term33367, term33367.getClass(), "name", null);
        setBooleanField(term33367, term33367.getClass(), "nameExplicitlySet", false);
        setBooleanField(term33367, term33367.getClass(), "focusable", false);
        setIntField(term33367, term33367.getClass(), "isFocusTraversableOverridden", 0);
        setField(term33367, term33367.getClass(), "focusTraversalKeys", null);
        setBooleanField(term33367, term33367.getClass(), "focusTraversalKeysEnabled", false);
        setField(term33367, term33367.getClass(), "acc", null);
        setField(term33367, term33367.getClass(), "minSize", null);
        setBooleanField(term33367, term33367.getClass(), "minSizeSet", false);
        setField(term33367, term33367.getClass(), "prefSize", null);
        setBooleanField(term33367, term33367.getClass(), "prefSizeSet", false);
        setField(term33367, term33367.getClass(), "maxSize", null);
        setBooleanField(term33367, term33367.getClass(), "maxSizeSet", false);
        setField(term33367, term33367.getClass(), "componentOrientation", null);
        setBooleanField(term33367, term33367.getClass(), "newEventsOnly", false);
        setField(term33367, term33367.getClass(), "componentListener", null);
        setField(term33367, term33367.getClass(), "focusListener", null);
        setField(term33367, term33367.getClass(), "hierarchyListener", null);
        setField(term33367, term33367.getClass(), "hierarchyBoundsListener", null);
        setField(term33367, term33367.getClass(), "keyListener", null);
        setField(term33367, term33367.getClass(), "mouseListener", null);
        setField(term33367, term33367.getClass(), "mouseMotionListener", null);
        setField(term33367, term33367.getClass(), "mouseWheelListener", null);
        setField(term33367, term33367.getClass(), "inputMethodListener", null);
        setLongField(term33367, term33367.getClass(), "eventMask", 0L);
        setField(term33367, term33367.getClass(), "changeSupport", null);
        setField(term33367, term33367.getClass(), "objectLock", null);
        setBooleanField(term33367, term33367.getClass(), "isPacked", false);
        setIntField(term33367, term33367.getClass(), "boundsOp", 0);
        setField(term33367, term33367.getClass(), "compoundShape", null);
        setField(term33367, term33367.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term33367, term33367.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term33367, term33367.getClass(), "backgroundEraseDisabled", false);
        setField(term33367, term33367.getClass(), "eventCache", null);
        setBooleanField(term33367, term33367.getClass(), "coalescingEnabled", false);
        setBooleanField(term33367, term33367.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term33367, term33367.getClass(), "componentSerializedDataVersion", 0);
        setField(term33367, term33367.getClass(), "accessibleContext", null);
        term33429 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term33429;
        callMethod(klass, "setHeaderHeight", argTypes, term33367, args);
    }

};


