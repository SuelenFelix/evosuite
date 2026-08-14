package io.github.moacirrf.netbeans.markdown.ui.export;

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
import static io.github.moacirrf.netbeans.markdown.ui.export.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExportPane_isDestinyFolderValid_73723024711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20408;

    public ExportPane_isDestinyFolderValid_73723024711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20408 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane"));
        setField(term20408, term20408.getClass(), "exporterConfig", null);
        setField(term20408, term20408.getClass(), "onExportedFile", null);
        setField(term20408, term20408.getClass(), "buttonsPane", null);
        setField(term20408, term20408.getClass(), "destinyFolderErrorMessage", null);
        setField(term20408, term20408.getClass(), "destinyPane", null);
        setField(term20408, term20408.getClass(), "docxExport", null);
        setField(term20408, term20408.getClass(), "htmlExport", null);
        setField(term20408, term20408.getClass(), "jButton1", null);
        setField(term20408, term20408.getClass(), "jLabel1", null);
        setField(term20408, term20408.getClass(), "jPanel1", null);
        setField(term20408, term20408.getClass(), "jScrollPane1", null);
        setField(term20408, term20408.getClass(), "joinFiles", null);
        setField(term20408, term20408.getClass(), "newUniqueName", null);
        setField(term20408, term20408.getClass(), "pathDestiny", null);
        setField(term20408, term20408.getClass(), "pdfExport", null);
        setField(term20408, term20408.getClass(), "progressBar", null);
        setField(term20408, term20408.getClass(), "progressPane", null);
        setField(term20408, term20408.getClass(), "tableFiles", null);
        setField(term20408, term20408.getClass(), "uniqueFilePane", null);
        setField(term20408, term20408.getClass(), "uniqueNameErrorLabel", null);
        setBooleanField(term20408, term20408.getClass(), "isAlignmentXSet", false);
        setFloatField(term20408, term20408.getClass(), "alignmentX", 0.0F);
        setBooleanField(term20408, term20408.getClass(), "isAlignmentYSet", false);
        setFloatField(term20408, term20408.getClass(), "alignmentY", 0.0F);
        setField(term20408, term20408.getClass(), "ui", null);
        setField(term20408, term20408.getClass(), "listenerList", null);
        setField(term20408, term20408.getClass(), "clientProperties", null);
        setField(term20408, term20408.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term20408, term20408.getClass(), "autoscrolls", false);
        setField(term20408, term20408.getClass(), "border", null);
        setIntField(term20408, term20408.getClass(), "flags", 0);
        setField(term20408, term20408.getClass(), "inputVerifier", null);
        setBooleanField(term20408, term20408.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term20408, term20408.getClass(), "paintingChild", null);
        setField(term20408, term20408.getClass(), "popupMenu", null);
        setField(term20408, term20408.getClass(), "revalidateRunnableScheduled", null);
        setField(term20408, term20408.getClass(), "focusInputMap", null);
        setField(term20408, term20408.getClass(), "ancestorInputMap", null);
        setField(term20408, term20408.getClass(), "windowInputMap", null);
        setField(term20408, term20408.getClass(), "actionMap", null);
        setField(term20408, term20408.getClass(), "aaHint", null);
        setField(term20408, term20408.getClass(), "lcdRenderingHint", null);
        setField(term20408, term20408.getClass(), "component", null);
        setField(term20408, term20408.getClass(), "layoutMgr", null);
        setField(term20408, term20408.getClass(), "dispatcher", null);
        setField(term20408, term20408.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term20408, term20408.getClass(), "focusCycleRoot", false);
        setBooleanField(term20408, term20408.getClass(), "focusTraversalPolicyProvider", false);
        setField(term20408, term20408.getClass(), "printingThreads", null);
        setBooleanField(term20408, term20408.getClass(), "printing", false);
        setField(term20408, term20408.getClass(), "containerListener", null);
        setIntField(term20408, term20408.getClass(), "listeningChildren", 0);
        setIntField(term20408, term20408.getClass(), "listeningBoundsChildren", 0);
        setIntField(term20408, term20408.getClass(), "descendantsCount", 0);
        setField(term20408, term20408.getClass(), "preserveBackgroundColor", null);
        setIntField(term20408, term20408.getClass(), "numOfHWComponents", 0);
        setIntField(term20408, term20408.getClass(), "numOfLWComponents", 0);
        setField(term20408, term20408.getClass(), "modalComp", null);
        setField(term20408, term20408.getClass(), "modalAppContext", null);
        setIntField(term20408, term20408.getClass(), "containerSerializedDataVersion", 0);
        setField(term20408, term20408.getClass(), "peer", null);
        setField(term20408, term20408.getClass(), "parent", null);
        setField(term20408, term20408.getClass(), "appContext", null);
        setIntField(term20408, term20408.getClass(), "x", 0);
        setIntField(term20408, term20408.getClass(), "y", 0);
        setIntField(term20408, term20408.getClass(), "width", 0);
        setIntField(term20408, term20408.getClass(), "height", 0);
        setField(term20408, term20408.getClass(), "foreground", null);
        setField(term20408, term20408.getClass(), "background", null);
        setField(term20408, term20408.getClass(), "font", null);
        setField(term20408, term20408.getClass(), "peerFont", null);
        setField(term20408, term20408.getClass(), "cursor", null);
        setField(term20408, term20408.getClass(), "locale", null);
        setField(term20408, term20408.getClass(), "graphicsConfig", null);
        setField(term20408, term20408.getClass(), "bufferStrategy", null);
        setBooleanField(term20408, term20408.getClass(), "ignoreRepaint", false);
        setBooleanField(term20408, term20408.getClass(), "visible", false);
        setBooleanField(term20408, term20408.getClass(), "enabled", false);
        setBooleanField(term20408, term20408.getClass(), "valid", false);
        setField(term20408, term20408.getClass(), "dropTarget", null);
        setField(term20408, term20408.getClass(), "popups", null);
        setField(term20408, term20408.getClass(), "name", null);
        setBooleanField(term20408, term20408.getClass(), "nameExplicitlySet", false);
        setBooleanField(term20408, term20408.getClass(), "focusable", false);
        setIntField(term20408, term20408.getClass(), "isFocusTraversableOverridden", 0);
        setField(term20408, term20408.getClass(), "focusTraversalKeys", null);
        setBooleanField(term20408, term20408.getClass(), "focusTraversalKeysEnabled", false);
        setField(term20408, term20408.getClass(), "acc", null);
        setField(term20408, term20408.getClass(), "minSize", null);
        setBooleanField(term20408, term20408.getClass(), "minSizeSet", false);
        setField(term20408, term20408.getClass(), "prefSize", null);
        setBooleanField(term20408, term20408.getClass(), "prefSizeSet", false);
        setField(term20408, term20408.getClass(), "maxSize", null);
        setBooleanField(term20408, term20408.getClass(), "maxSizeSet", false);
        setField(term20408, term20408.getClass(), "componentOrientation", null);
        setBooleanField(term20408, term20408.getClass(), "newEventsOnly", false);
        setField(term20408, term20408.getClass(), "componentListener", null);
        setField(term20408, term20408.getClass(), "focusListener", null);
        setField(term20408, term20408.getClass(), "hierarchyListener", null);
        setField(term20408, term20408.getClass(), "hierarchyBoundsListener", null);
        setField(term20408, term20408.getClass(), "keyListener", null);
        setField(term20408, term20408.getClass(), "mouseListener", null);
        setField(term20408, term20408.getClass(), "mouseMotionListener", null);
        setField(term20408, term20408.getClass(), "mouseWheelListener", null);
        setField(term20408, term20408.getClass(), "inputMethodListener", null);
        setLongField(term20408, term20408.getClass(), "eventMask", 0L);
        setField(term20408, term20408.getClass(), "changeSupport", null);
        setField(term20408, term20408.getClass(), "objectLock", null);
        setBooleanField(term20408, term20408.getClass(), "isPacked", false);
        setIntField(term20408, term20408.getClass(), "boundsOp", 0);
        setField(term20408, term20408.getClass(), "compoundShape", null);
        setField(term20408, term20408.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term20408, term20408.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term20408, term20408.getClass(), "backgroundEraseDisabled", false);
        setField(term20408, term20408.getClass(), "eventCache", null);
        setBooleanField(term20408, term20408.getClass(), "coalescingEnabled", false);
        setBooleanField(term20408, term20408.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term20408, term20408.getClass(), "componentSerializedDataVersion", 0);
        setField(term20408, term20408.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDestinyFolderValid", argTypes, term20408, args);
    }

};


