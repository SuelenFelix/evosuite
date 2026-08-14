package io.github.moacirrf.netbeans.markdown.ui.preview;

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
import static io.github.moacirrf.netbeans.markdown.ui.preview.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MarkdownPreviewPane_FillEditorPaneWorker_doInBackground_13079561371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4908;

    public MarkdownPreviewPane_FillEditorPaneWorker_doInBackground_13079561371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4908 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$FillEditorPaneWorker"));
        Object term4922 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$ScrollState"));
        Object term4925 = newInstance(Class.forName("javax.swing.SwingWorker$StateValue"));
        Object term4936 = newInstance(Class.forName("java.util.concurrent.FutureTask"));
        Object term4938 = newInstance(Class.forName("java.lang.Object"));
        Object term4939 = newInstance(Class.forName("java.util.concurrent.FutureTask$WaitNode"));
        Object term4940 = newInstance(Class.forName("java.lang.Thread"));
        Object term4946 = newInstance(Class.forName("org.vorpal.research.kex.util.MDCWrappedRunnable"));
        Object term4947 = newInstance(Class.forName("java.lang.ThreadGroup"));
        Object term4954 = newInstance(Class.forName("jdk.internal.loader.ClassLoaders$AppClassLoader"));
        Object term4957 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term4962 = newInstance(Class.forName("java.lang.ThreadLocal$ThreadLocalMap"));
        Object term4968 = newInstance(Class.forName("java.lang.Object"));
        Object term4972 = newInstance(Class.forName("java.util.concurrent.FutureTask$WaitNode"));
        Object term4973 = newInstance(Class.forName("java.util.concurrent.FutureTask$WaitNode"));
        Object term4974 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term4975 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term4976 = newInstance(Class.forName("java.lang.Object"));
        setField(term4908, term4908.getClass(), "markdownText", "aNWLJdrZMq");
        setIntField(term4908, term4908.getClass(), "version", -1888585309);
        setFloatField(term4922, term4922.getClass(), "ratio", 0.7467328F);
        setField(term4908, term4908.getClass(), "scrollState", term4922);
        setField(term4908, term4908.getClass(), "this$0", null);
        setIntField(term4908, term4908.getClass(), "progress", 683666002);
        setField(term4925, term4925.getClass(), "name", "STARTED");
        setIntField(term4925, term4925.getClass(), "ordinal", 1);
        setField(term4908, term4908.getClass(), "state", term4925);
        setIntField(term4936, term4936.getClass(), "state", 1596213415);
        setField(term4936, term4936.getClass(), "callable", null);
        setField(term4936, term4936.getClass(), "outcome", term4938);
        setField(term4936, term4936.getClass(), "runner", null);
        setField(term4940, term4940.getClass(), "name", "");
        setIntField(term4940, term4940.getClass(), "priority", 5);
        setBooleanField(term4940, term4940.getClass(), "daemon", true);
        setBooleanField(term4940, term4940.getClass(), "stillborn", false);
        setLongField(term4940, term4940.getClass(), "eetop", 135317516976128L);
        setField(term4946, term4946.getClass(), "context", null);
        setField(term4946, term4946.getClass(), "runnable", null);
        setField(term4940, term4940.getClass(), "target", term4946);
        setField(term4947, term4947.getClass(), "parent", null);
        setField(term4947, term4947.getClass(), "name", null);
        setIntField(term4947, term4947.getClass(), "maxPriority", 10);
        setBooleanField(term4947, term4947.getClass(), "destroyed", false);
        setBooleanField(term4947, term4947.getClass(), "daemon", false);
        setIntField(term4947, term4947.getClass(), "nUnstartedThreads", 2);
        setIntField(term4947, term4947.getClass(), "nthreads", 12);
        setField(term4947, term4947.getClass(), "threads", null);
        setIntField(term4947, term4947.getClass(), "ngroups", 0);
        setField(term4947, term4947.getClass(), "groups", null);
        setField(term4940, term4940.getClass(), "group", term4947);
        setField(term4954, term4954.getClass(), "ucp", null);
        setField(term4954, term4954.getClass(), "parent", null);
        setField(term4954, term4954.getClass(), "nameToModule", null);
        setField(term4954, term4954.getClass(), "moduleToReader", null);
        setField(term4954, term4954.getClass(), "resourceCache", null);
        setBooleanField(term4954, term4954.getClass(), "initialized", true);
        setField(term4954, term4954.getClass(), "pdcache", null);
        setField(term4954, term4954.getClass(), "parent", null);
        setField(term4954, term4954.getClass(), "name", null);
        setField(term4954, term4954.getClass(), "unnamedModule", null);
        setField(term4954, term4954.getClass(), "nameAndId", null);
        setField(term4954, term4954.getClass(), "parallelLockMap", null);
        setField(term4954, term4954.getClass(), "package2certs", null);
        setField(term4954, term4954.getClass(), "classes", null);
        setField(term4954, term4954.getClass(), "defaultDomain", null);
        setField(term4954, term4954.getClass(), "packages", null);
        setField(term4954, term4954.getClass(), "nativeLibraries", null);
        setField(term4954, term4954.getClass(), "assertionLock", null);
        setBooleanField(term4954, term4954.getClass(), "defaultAssertionStatus", false);
        setField(term4954, term4954.getClass(), "packageAssertionStatus", null);
        setField(term4954, term4954.getClass(), "classAssertionStatus", null);
        setField(term4954, term4954.getClass(), "classLoaderValueMap", null);
        setField(term4940, term4940.getClass(), "contextClassLoader", term4954);
        setField(term4957, term4957.getClass(), "context", null);
        setBooleanField(term4957, term4957.getClass(), "isPrivileged", false);
        setBooleanField(term4957, term4957.getClass(), "isAuthorized", true);
        setField(term4957, term4957.getClass(), "privilegedContext", null);
        setField(term4957, term4957.getClass(), "combiner", null);
        setField(term4957, term4957.getClass(), "permissions", null);
        setField(term4957, term4957.getClass(), "parent", null);
        setBooleanField(term4957, term4957.getClass(), "isWrapped", false);
        setBooleanField(term4957, term4957.getClass(), "isLimited", false);
        setField(term4957, term4957.getClass(), "limitedContext", null);
        setField(term4940, term4940.getClass(), "inheritedAccessControlContext", term4957);
        setField(term4962, term4962.getClass(), "table", null);
        setIntField(term4962, term4962.getClass(), "size", 12);
        setIntField(term4962, term4962.getClass(), "threshold", 21);
        setField(term4940, term4940.getClass(), "threadLocals", term4962);
        setField(term4940, term4940.getClass(), "inheritableThreadLocals", null);
        setLongField(term4940, term4940.getClass(), "stackSize", 0L);
        setLongField(term4940, term4940.getClass(), "tid", 29L);
        setIntField(term4940, term4940.getClass(), "threadStatus", 5);
        setField(term4940, term4940.getClass(), "parkBlocker", null);
        setField(term4940, term4940.getClass(), "blocker", null);
        setField(term4940, term4940.getClass(), "blockerLock", term4968);
        setField(term4940, term4940.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term4940, term4940.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term4940, term4940.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term4940, term4940.getClass(), "threadLocalRandomSecondarySeed", 0);
        setField(term4939, term4939.getClass(), "thread", term4940);
        setField(term4972, term4972.getClass(), "thread", term4940);
        setField(term4973, term4973.getClass(), "thread", term4940);
        setField(term4973, term4973.getClass(), "next", null);
        setField(term4972, term4972.getClass(), "next", term4973);
        setField(term4939, term4939.getClass(), "next", term4972);
        setField(term4936, term4936.getClass(), "waiters", term4939);
        setField(term4908, term4908.getClass(), "future", term4936);
        setField(term4975, term4975.getClass(), "map", null);
        setField(term4974, term4974.getClass(), "map", term4975);
        setField(term4974, term4974.getClass(), "source", term4976);
        setField(term4908, term4908.getClass(), "propertyChangeSupport", term4974);
        setField(term4908, term4908.getClass(), "doProcess", null);
        setField(term4908, term4908.getClass(), "doNotifyProgressChange", null);
        setField(term4908, term4908.getClass(), "doSubmit", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$FillEditorPaneWorker");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doInBackground", argTypes, term4908, args);
    }

};


