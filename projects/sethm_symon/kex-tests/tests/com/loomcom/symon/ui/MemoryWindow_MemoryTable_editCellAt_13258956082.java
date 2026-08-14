package com.loomcom.symon.ui;

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
import static com.loomcom.symon.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class MemoryWindow_MemoryTable_editCellAt_13258956082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18016;
     Object term18078;
     Object term18080;

    public MemoryWindow_MemoryTable_editCellAt_13258956082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18016 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTable"));
        setField(term18016, term18016.getClass(), "dataModel", null);
        setField(term18016, term18016.getClass(), "columnModel", null);
        setField(term18016, term18016.getClass(), "selectionModel", null);
        setField(term18016, term18016.getClass(), "tableHeader", null);
        setIntField(term18016, term18016.getClass(), "rowHeight", 0);
        setIntField(term18016, term18016.getClass(), "rowMargin", 0);
        setField(term18016, term18016.getClass(), "gridColor", null);
        setBooleanField(term18016, term18016.getClass(), "showHorizontalLines", false);
        setBooleanField(term18016, term18016.getClass(), "showVerticalLines", false);
        setIntField(term18016, term18016.getClass(), "autoResizeMode", 0);
        setBooleanField(term18016, term18016.getClass(), "autoCreateColumnsFromModel", false);
        setField(term18016, term18016.getClass(), "preferredViewportSize", null);
        setBooleanField(term18016, term18016.getClass(), "rowSelectionAllowed", false);
        setBooleanField(term18016, term18016.getClass(), "cellSelectionEnabled", false);
        setField(term18016, term18016.getClass(), "editorComp", null);
        setField(term18016, term18016.getClass(), "cellEditor", null);
        setIntField(term18016, term18016.getClass(), "editingColumn", 0);
        setIntField(term18016, term18016.getClass(), "editingRow", 0);
        setField(term18016, term18016.getClass(), "defaultRenderersByColumnClass", null);
        setField(term18016, term18016.getClass(), "defaultEditorsByColumnClass", null);
        setField(term18016, term18016.getClass(), "selectionForeground", null);
        setField(term18016, term18016.getClass(), "selectionBackground", null);
        setField(term18016, term18016.getClass(), "rowModel", null);
        setBooleanField(term18016, term18016.getClass(), "dragEnabled", false);
        setBooleanField(term18016, term18016.getClass(), "surrendersFocusOnKeystroke", false);
        setField(term18016, term18016.getClass(), "editorRemover", null);
        setBooleanField(term18016, term18016.getClass(), "columnSelectionAdjusting", false);
        setBooleanField(term18016, term18016.getClass(), "rowSelectionAdjusting", false);
        setField(term18016, term18016.getClass(), "printError", null);
        setBooleanField(term18016, term18016.getClass(), "isRowHeightSet", false);
        setBooleanField(term18016, term18016.getClass(), "updateSelectionOnSort", false);
        setField(term18016, term18016.getClass(), "sortManager", null);
        setBooleanField(term18016, term18016.getClass(), "ignoreSortChange", false);
        setBooleanField(term18016, term18016.getClass(), "sorterChanged", false);
        setBooleanField(term18016, term18016.getClass(), "autoCreateRowSorter", false);
        setBooleanField(term18016, term18016.getClass(), "fillsViewportHeight", false);
        setField(term18016, term18016.getClass(), "dropMode", null);
        setField(term18016, term18016.getClass(), "dropLocation", null);
        setBooleanField(term18016, term18016.getClass(), "updateInProgress", false);
        setBooleanField(term18016, term18016.getClass(), "isAlignmentXSet", false);
        setFloatField(term18016, term18016.getClass(), "alignmentX", 0.0F);
        setBooleanField(term18016, term18016.getClass(), "isAlignmentYSet", false);
        setFloatField(term18016, term18016.getClass(), "alignmentY", 0.0F);
        setField(term18016, term18016.getClass(), "ui", null);
        setField(term18016, term18016.getClass(), "listenerList", null);
        setField(term18016, term18016.getClass(), "clientProperties", null);
        setField(term18016, term18016.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term18016, term18016.getClass(), "autoscrolls", false);
        setField(term18016, term18016.getClass(), "border", null);
        setIntField(term18016, term18016.getClass(), "flags", 0);
        setField(term18016, term18016.getClass(), "inputVerifier", null);
        setBooleanField(term18016, term18016.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term18016, term18016.getClass(), "paintingChild", null);
        setField(term18016, term18016.getClass(), "popupMenu", null);
        setField(term18016, term18016.getClass(), "revalidateRunnableScheduled", null);
        setField(term18016, term18016.getClass(), "focusInputMap", null);
        setField(term18016, term18016.getClass(), "ancestorInputMap", null);
        setField(term18016, term18016.getClass(), "windowInputMap", null);
        setField(term18016, term18016.getClass(), "actionMap", null);
        setField(term18016, term18016.getClass(), "aaHint", null);
        setField(term18016, term18016.getClass(), "lcdRenderingHint", null);
        setField(term18016, term18016.getClass(), "component", null);
        setField(term18016, term18016.getClass(), "layoutMgr", null);
        setField(term18016, term18016.getClass(), "dispatcher", null);
        setField(term18016, term18016.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term18016, term18016.getClass(), "focusCycleRoot", false);
        setBooleanField(term18016, term18016.getClass(), "focusTraversalPolicyProvider", false);
        setField(term18016, term18016.getClass(), "printingThreads", null);
        setBooleanField(term18016, term18016.getClass(), "printing", false);
        setField(term18016, term18016.getClass(), "containerListener", null);
        setIntField(term18016, term18016.getClass(), "listeningChildren", 0);
        setIntField(term18016, term18016.getClass(), "listeningBoundsChildren", 0);
        setIntField(term18016, term18016.getClass(), "descendantsCount", 0);
        setField(term18016, term18016.getClass(), "preserveBackgroundColor", null);
        setIntField(term18016, term18016.getClass(), "numOfHWComponents", 0);
        setIntField(term18016, term18016.getClass(), "numOfLWComponents", 0);
        setField(term18016, term18016.getClass(), "modalComp", null);
        setField(term18016, term18016.getClass(), "modalAppContext", null);
        setIntField(term18016, term18016.getClass(), "containerSerializedDataVersion", 0);
        setField(term18016, term18016.getClass(), "peer", null);
        setField(term18016, term18016.getClass(), "parent", null);
        setField(term18016, term18016.getClass(), "appContext", null);
        setIntField(term18016, term18016.getClass(), "x", 0);
        setIntField(term18016, term18016.getClass(), "y", 0);
        setIntField(term18016, term18016.getClass(), "width", 0);
        setIntField(term18016, term18016.getClass(), "height", 0);
        setField(term18016, term18016.getClass(), "foreground", null);
        setField(term18016, term18016.getClass(), "background", null);
        setField(term18016, term18016.getClass(), "font", null);
        setField(term18016, term18016.getClass(), "peerFont", null);
        setField(term18016, term18016.getClass(), "cursor", null);
        setField(term18016, term18016.getClass(), "locale", null);
        setField(term18016, term18016.getClass(), "graphicsConfig", null);
        setField(term18016, term18016.getClass(), "bufferStrategy", null);
        setBooleanField(term18016, term18016.getClass(), "ignoreRepaint", false);
        setBooleanField(term18016, term18016.getClass(), "visible", false);
        setBooleanField(term18016, term18016.getClass(), "enabled", false);
        setBooleanField(term18016, term18016.getClass(), "valid", false);
        setField(term18016, term18016.getClass(), "dropTarget", null);
        setField(term18016, term18016.getClass(), "popups", null);
        setField(term18016, term18016.getClass(), "name", null);
        setBooleanField(term18016, term18016.getClass(), "nameExplicitlySet", false);
        setBooleanField(term18016, term18016.getClass(), "focusable", false);
        setIntField(term18016, term18016.getClass(), "isFocusTraversableOverridden", 0);
        setField(term18016, term18016.getClass(), "focusTraversalKeys", null);
        setBooleanField(term18016, term18016.getClass(), "focusTraversalKeysEnabled", false);
        setField(term18016, term18016.getClass(), "acc", null);
        setField(term18016, term18016.getClass(), "minSize", null);
        setBooleanField(term18016, term18016.getClass(), "minSizeSet", false);
        setField(term18016, term18016.getClass(), "prefSize", null);
        setBooleanField(term18016, term18016.getClass(), "prefSizeSet", false);
        setField(term18016, term18016.getClass(), "maxSize", null);
        setBooleanField(term18016, term18016.getClass(), "maxSizeSet", false);
        setField(term18016, term18016.getClass(), "componentOrientation", null);
        setBooleanField(term18016, term18016.getClass(), "newEventsOnly", false);
        setField(term18016, term18016.getClass(), "componentListener", null);
        setField(term18016, term18016.getClass(), "focusListener", null);
        setField(term18016, term18016.getClass(), "hierarchyListener", null);
        setField(term18016, term18016.getClass(), "hierarchyBoundsListener", null);
        setField(term18016, term18016.getClass(), "keyListener", null);
        setField(term18016, term18016.getClass(), "mouseListener", null);
        setField(term18016, term18016.getClass(), "mouseMotionListener", null);
        setField(term18016, term18016.getClass(), "mouseWheelListener", null);
        setField(term18016, term18016.getClass(), "inputMethodListener", null);
        setLongField(term18016, term18016.getClass(), "eventMask", 0L);
        setField(term18016, term18016.getClass(), "changeSupport", null);
        setField(term18016, term18016.getClass(), "objectLock", null);
        setBooleanField(term18016, term18016.getClass(), "isPacked", false);
        setIntField(term18016, term18016.getClass(), "boundsOp", 0);
        setField(term18016, term18016.getClass(), "compoundShape", null);
        setField(term18016, term18016.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term18016, term18016.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term18016, term18016.getClass(), "backgroundEraseDisabled", false);
        setField(term18016, term18016.getClass(), "eventCache", null);
        setBooleanField(term18016, term18016.getClass(), "coalescingEnabled", false);
        setBooleanField(term18016, term18016.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term18016, term18016.getClass(), "componentSerializedDataVersion", 0);
        setField(term18016, term18016.getClass(), "accessibleContext", null);
        term18078 = new Integer(0);
        term18080 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTable");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.EventObject");
        Object[] args = new Object[3];
        args[0] = term18078;
        args[1] = term18080;
        args[2] = null;
        callMethod(klass, "editCellAt", argTypes, term18016, args);
    }

};


