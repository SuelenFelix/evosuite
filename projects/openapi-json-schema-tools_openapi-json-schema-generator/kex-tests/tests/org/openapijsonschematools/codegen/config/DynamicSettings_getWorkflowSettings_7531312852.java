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

public class DynamicSettings_getWorkflowSettings_7531312852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35040;

    public DynamicSettings_getWorkflowSettings_7531312852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term35168 = new HashMap();
        HashMap term35307 = new HashMap();
        HashMap term35402 = new HashMap();
        Boolean term35408 = new Boolean(true);
        Boolean term35410 = new Boolean(false);
        HashMap term35412 = new HashMap();
        term35040 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.DynamicSettings"));
        Object term35041 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term35102 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term35147 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term35150 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term35153 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term35155 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term35163 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term35164 = newInstance(Class.forName("java.lang.Object"));
        Object[] term35165 = (Object[]) newArray("java.lang.Object", 4);
        Object term35173 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term35306 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        Object term35376 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term35401 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term35041, term35041.getClass(), "name", "org.openapijsonschematools.codegen.config.DynamicSettings");
        setField(term35041, term35041.getClass(), "level", null);
        setIntField(term35041, term35041.getClass(), "effectiveLevelInt", -2147483648);
        setField(term35102, term35102.getClass(), "name", "org.openapijsonschematools.codegen.config");
        setField(term35102, term35102.getClass(), "level", null);
        setIntField(term35102, term35102.getClass(), "effectiveLevelInt", -2147483648);
        setField(term35147, term35147.getClass(), "name", "");
        setField(term35147, term35147.getClass(), "level", null);
        setIntField(term35147, term35147.getClass(), "effectiveLevelInt", -2147483648);
        setField(term35150, term35150.getClass(), "name", null);
        setField(term35150, term35150.getClass(), "level", null);
        setIntField(term35150, term35150.getClass(), "effectiveLevelInt", -2147483648);
        setField(term35150, term35150.getClass(), "parent", null);
        setField(term35150, term35150.getClass(), "childrenList", null);
        setField(term35150, term35150.getClass(), "aai", null);
        setBooleanField(term35150, term35150.getClass(), "additive", true);
        setField(term35150, term35150.getClass(), "loggerContext", null);
        setField(term35147, term35147.getClass(), "parent", term35150);
        setField(term35153, term35153.getClass(), "lock", null);
        setField(term35153, term35153.getClass(), "array", null);
        setField(term35147, term35147.getClass(), "childrenList", term35153);
        setField(term35147, term35147.getClass(), "aai", null);
        setBooleanField(term35147, term35147.getClass(), "additive", true);
        setField(term35155, term35155.getClass(), "root", null);
        setIntField(term35155, term35155.getClass(), "size", 35);
        setIntField(term35155, term35155.getClass(), "noAppenderWarning", 0);
        setField(term35155, term35155.getClass(), "loggerContextListenerList", null);
        setField(term35155, term35155.getClass(), "loggerCache", null);
        setField(term35155, term35155.getClass(), "loggerContextRemoteView", null);
        setField(term35155, term35155.getClass(), "turboFilterList", null);
        setBooleanField(term35155, term35155.getClass(), "packagingDataEnabled", false);
        setIntField(term35155, term35155.getClass(), "maxCallerDataDepth", 8);
        setIntField(term35155, term35155.getClass(), "resetCount", 0);
        setField(term35155, term35155.getClass(), "frameworkPackages", null);
        setLongField(term35155, term35155.getClass(), "birthTime", 1786449700210L);
        setField(term35155, term35155.getClass(), "name", null);
        setField(term35155, term35155.getClass(), "sm", null);
        setField(term35155, term35155.getClass(), "propertyMap", null);
        setField(term35155, term35155.getClass(), "objectMap", null);
        setField(term35155, term35155.getClass(), "configurationLock", null);
        setField(term35155, term35155.getClass(), "scheduledExecutorService", null);
        setField(term35155, term35155.getClass(), "scheduledFutures", null);
        setField(term35155, term35155.getClass(), "lifeCycleManager", null);
        setBooleanField(term35155, term35155.getClass(), "started", false);
        setField(term35147, term35147.getClass(), "loggerContext", term35155);
        setField(term35102, term35102.getClass(), "parent", term35147);
        setField(term35163, term35163.getClass(), "lock", term35164);
        setElement(term35165, 3, term35041);
        setField(term35163, term35163.getClass(), "array", term35165);
        setField(term35102, term35102.getClass(), "childrenList", term35163);
        setField(term35102, term35102.getClass(), "aai", null);
        setBooleanField(term35102, term35102.getClass(), "additive", true);
        setField(term35102, term35102.getClass(), "loggerContext", term35155);
        setField(term35041, term35041.getClass(), "parent", term35102);
        setField(term35041, term35041.getClass(), "childrenList", null);
        setField(term35041, term35041.getClass(), "aai", null);
        setBooleanField(term35041, term35041.getClass(), "additive", true);
        setField(term35041, term35041.getClass(), "loggerContext", term35155);
        setField(term35040, term35040.getClass(), "LOGGER", term35041);
        setField(term35040, term35040.getClass(), "dynamicProperties", term35168);
        setField(term35173, term35173.getClass(), "generatorName", "FlHzxEfFzI");
        setField(term35173, term35173.getClass(), "apiPackage", "aSATgQUpoe");
        setField(term35173, term35173.getClass(), "modelPackage", "VkPSXewZfB");
        setField(term35173, term35173.getClass(), "invokerPackage", "ubodzJoMGW");
        setField(term35173, term35173.getClass(), "packageName", "weddIktxOA");
        setField(term35173, term35173.getClass(), "apiNameSuffix", "uSlMeISsDD");
        setField(term35173, term35173.getClass(), "modelNamePrefix", "WdCiTDUKqn");
        setField(term35173, term35173.getClass(), "modelNameSuffix", "PSizQDoxxe");
        setField(term35173, term35173.getClass(), "groupId", "mKaHyMybrK");
        setField(term35173, term35173.getClass(), "artifactId", "AyrEXuGrEj");
        setField(term35173, term35173.getClass(), "artifactVersion", "yevIIoVYHq");
        setField(term35306, term35306.getClass(), "m", term35307);
        setField(term35306, term35306.getClass(), "keySet", null);
        setField(term35306, term35306.getClass(), "entrySet", null);
        setField(term35306, term35306.getClass(), "values", null);
        setField(term35173, term35173.getClass(), "additionalProperties", term35306);
        setField(term35173, term35173.getClass(), "gitHost", "github.com");
        setField(term35173, term35173.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term35173, term35173.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term35173, term35173.getClass(), "releaseNote", "Minor update");
        setField(term35173, term35173.getClass(), "httpUserAgent", "UuYWMTqWTV");
        setField(term35040, term35040.getClass(), "generatorSettings", term35173);
        setField(term35376, term35376.getClass(), "inputSpec", null);
        setField(term35376, term35376.getClass(), "outputDir", ".");
        setBooleanField(term35376, term35376.getClass(), "verbose", false);
        setBooleanField(term35376, term35376.getClass(), "skipOverwrite", false);
        setBooleanField(term35376, term35376.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term35376, term35376.getClass(), "skipOperationExample", false);
        setBooleanField(term35376, term35376.getClass(), "logToStderr", false);
        setBooleanField(term35376, term35376.getClass(), "validateSpec", true);
        setBooleanField(term35376, term35376.getClass(), "enablePostProcessFile", false);
        setBooleanField(term35376, term35376.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term35376, term35376.getClass(), "strictSpecBehavior", true);
        setField(term35376, term35376.getClass(), "templateDir", null);
        setField(term35376, term35376.getClass(), "templatingEngineName", "handlebars");
        setField(term35376, term35376.getClass(), "ignoreFileOverride", null);
        setField(term35401, term35401.getClass(), "m", term35402);
        setField(term35401, term35401.getClass(), "keySet", null);
        setField(term35401, term35401.getClass(), "entrySet", null);
        setField(term35401, term35401.getClass(), "values", null);
        setField(term35376, term35376.getClass(), "globalProperties", term35401);
        setBooleanField(term35376, term35376.getClass(), "removeEnumValuePrefix", false);
        setField(term35376, term35376.getClass(), "hideGenerationTimestamp", term35408);
        setField(term35376, term35376.getClass(), "intsAllowedForFloatDoubleFormats", term35410);
        setField(term35040, term35040.getClass(), "workflowSettings", term35376);
        setField(term35040, term35040.getClass(), "files", term35412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.DynamicSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowSettings", argTypes, term35040, args);
    }

};


