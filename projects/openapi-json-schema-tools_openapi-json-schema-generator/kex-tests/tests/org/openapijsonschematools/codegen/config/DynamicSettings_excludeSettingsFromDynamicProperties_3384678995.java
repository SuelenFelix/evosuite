package org.openapijsonschematools.codegen.config;

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
import static org.openapijsonschematools.codegen.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;

public class DynamicSettings_excludeSettingsFromDynamicProperties_3384678995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36350;

    public DynamicSettings_excludeSettingsFromDynamicProperties_3384678995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term36478 = new HashMap();
        HashMap term36617 = new HashMap();
        HashMap term36712 = new HashMap();
        Boolean term36718 = new Boolean(true);
        Boolean term36720 = new Boolean(false);
        HashMap term36722 = new HashMap();
        term36350 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.DynamicSettings"));
        Object term36351 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term36412 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term36457 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term36460 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term36463 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term36465 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term36473 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term36474 = newInstance(Class.forName("java.lang.Object"));
        Object[] term36475 = (Object[]) newArray("java.lang.Object", 4);
        Object term36483 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term36616 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        Object term36686 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term36711 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term36351, term36351.getClass(), "name", "org.openapijsonschematools.codegen.config.DynamicSettings");
        setField(term36351, term36351.getClass(), "level", null);
        setIntField(term36351, term36351.getClass(), "effectiveLevelInt", -2147483648);
        setField(term36412, term36412.getClass(), "name", "org.openapijsonschematools.codegen.config");
        setField(term36412, term36412.getClass(), "level", null);
        setIntField(term36412, term36412.getClass(), "effectiveLevelInt", -2147483648);
        setField(term36457, term36457.getClass(), "name", "");
        setField(term36457, term36457.getClass(), "level", null);
        setIntField(term36457, term36457.getClass(), "effectiveLevelInt", -2147483648);
        setField(term36460, term36460.getClass(), "name", null);
        setField(term36460, term36460.getClass(), "level", null);
        setIntField(term36460, term36460.getClass(), "effectiveLevelInt", -2147483648);
        setField(term36460, term36460.getClass(), "parent", null);
        setField(term36460, term36460.getClass(), "childrenList", null);
        setField(term36460, term36460.getClass(), "aai", null);
        setBooleanField(term36460, term36460.getClass(), "additive", true);
        setField(term36460, term36460.getClass(), "loggerContext", null);
        setField(term36457, term36457.getClass(), "parent", term36460);
        setField(term36463, term36463.getClass(), "lock", null);
        setField(term36463, term36463.getClass(), "array", null);
        setField(term36457, term36457.getClass(), "childrenList", term36463);
        setField(term36457, term36457.getClass(), "aai", null);
        setBooleanField(term36457, term36457.getClass(), "additive", true);
        setField(term36465, term36465.getClass(), "root", null);
        setIntField(term36465, term36465.getClass(), "size", 35);
        setIntField(term36465, term36465.getClass(), "noAppenderWarning", 0);
        setField(term36465, term36465.getClass(), "loggerContextListenerList", null);
        setField(term36465, term36465.getClass(), "loggerCache", null);
        setField(term36465, term36465.getClass(), "loggerContextRemoteView", null);
        setField(term36465, term36465.getClass(), "turboFilterList", null);
        setBooleanField(term36465, term36465.getClass(), "packagingDataEnabled", false);
        setIntField(term36465, term36465.getClass(), "maxCallerDataDepth", 8);
        setIntField(term36465, term36465.getClass(), "resetCount", 0);
        setField(term36465, term36465.getClass(), "frameworkPackages", null);
        setLongField(term36465, term36465.getClass(), "birthTime", 1786449700210L);
        setField(term36465, term36465.getClass(), "name", null);
        setField(term36465, term36465.getClass(), "sm", null);
        setField(term36465, term36465.getClass(), "propertyMap", null);
        setField(term36465, term36465.getClass(), "objectMap", null);
        setField(term36465, term36465.getClass(), "configurationLock", null);
        setField(term36465, term36465.getClass(), "scheduledExecutorService", null);
        setField(term36465, term36465.getClass(), "scheduledFutures", null);
        setField(term36465, term36465.getClass(), "lifeCycleManager", null);
        setBooleanField(term36465, term36465.getClass(), "started", false);
        setField(term36457, term36457.getClass(), "loggerContext", term36465);
        setField(term36412, term36412.getClass(), "parent", term36457);
        setField(term36473, term36473.getClass(), "lock", term36474);
        setElement(term36475, 3, term36351);
        setField(term36473, term36473.getClass(), "array", term36475);
        setField(term36412, term36412.getClass(), "childrenList", term36473);
        setField(term36412, term36412.getClass(), "aai", null);
        setBooleanField(term36412, term36412.getClass(), "additive", true);
        setField(term36412, term36412.getClass(), "loggerContext", term36465);
        setField(term36351, term36351.getClass(), "parent", term36412);
        setField(term36351, term36351.getClass(), "childrenList", null);
        setField(term36351, term36351.getClass(), "aai", null);
        setBooleanField(term36351, term36351.getClass(), "additive", true);
        setField(term36351, term36351.getClass(), "loggerContext", term36465);
        setField(term36350, term36350.getClass(), "LOGGER", term36351);
        setField(term36350, term36350.getClass(), "dynamicProperties", term36478);
        setField(term36483, term36483.getClass(), "generatorName", "fIZsWucfXz");
        setField(term36483, term36483.getClass(), "apiPackage", "IApvtmfhnq");
        setField(term36483, term36483.getClass(), "modelPackage", "VSaNnhMpRc");
        setField(term36483, term36483.getClass(), "invokerPackage", "QNjNTLlUaV");
        setField(term36483, term36483.getClass(), "packageName", "hIYsRyOZxk");
        setField(term36483, term36483.getClass(), "apiNameSuffix", "RjNoEywJbC");
        setField(term36483, term36483.getClass(), "modelNamePrefix", "RTTvrwwhou");
        setField(term36483, term36483.getClass(), "modelNameSuffix", "lRORwXipuk");
        setField(term36483, term36483.getClass(), "groupId", "fVdTcjgHdw");
        setField(term36483, term36483.getClass(), "artifactId", "wwAwLLcLPp");
        setField(term36483, term36483.getClass(), "artifactVersion", "nHpMKOmlpQ");
        setField(term36616, term36616.getClass(), "m", term36617);
        setField(term36616, term36616.getClass(), "keySet", null);
        setField(term36616, term36616.getClass(), "entrySet", null);
        setField(term36616, term36616.getClass(), "values", null);
        setField(term36483, term36483.getClass(), "additionalProperties", term36616);
        setField(term36483, term36483.getClass(), "gitHost", "github.com");
        setField(term36483, term36483.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term36483, term36483.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term36483, term36483.getClass(), "releaseNote", "Minor update");
        setField(term36483, term36483.getClass(), "httpUserAgent", "fKhrQsJToZ");
        setField(term36350, term36350.getClass(), "generatorSettings", term36483);
        setField(term36686, term36686.getClass(), "inputSpec", null);
        setField(term36686, term36686.getClass(), "outputDir", ".");
        setBooleanField(term36686, term36686.getClass(), "verbose", false);
        setBooleanField(term36686, term36686.getClass(), "skipOverwrite", false);
        setBooleanField(term36686, term36686.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term36686, term36686.getClass(), "skipOperationExample", false);
        setBooleanField(term36686, term36686.getClass(), "logToStderr", false);
        setBooleanField(term36686, term36686.getClass(), "validateSpec", true);
        setBooleanField(term36686, term36686.getClass(), "enablePostProcessFile", false);
        setBooleanField(term36686, term36686.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term36686, term36686.getClass(), "strictSpecBehavior", true);
        setField(term36686, term36686.getClass(), "templateDir", null);
        setField(term36686, term36686.getClass(), "templatingEngineName", "handlebars");
        setField(term36686, term36686.getClass(), "ignoreFileOverride", null);
        setField(term36711, term36711.getClass(), "m", term36712);
        setField(term36711, term36711.getClass(), "keySet", null);
        setField(term36711, term36711.getClass(), "entrySet", null);
        setField(term36711, term36711.getClass(), "values", null);
        setField(term36686, term36686.getClass(), "globalProperties", term36711);
        setBooleanField(term36686, term36686.getClass(), "removeEnumValuePrefix", false);
        setField(term36686, term36686.getClass(), "hideGenerationTimestamp", term36718);
        setField(term36686, term36686.getClass(), "intsAllowedForFloatDoubleFormats", term36720);
        setField(term36350, term36350.getClass(), "workflowSettings", term36686);
        setField(term36350, term36350.getClass(), "files", term36722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.DynamicSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "excludeSettingsFromDynamicProperties", argTypes, term36350, args);
    }

};


