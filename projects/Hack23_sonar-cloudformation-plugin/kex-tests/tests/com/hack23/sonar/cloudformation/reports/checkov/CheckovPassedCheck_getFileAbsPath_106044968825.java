package com.hack23.sonar.cloudformation.reports.checkov;

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
import static com.hack23.sonar.cloudformation.reports.checkov.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class CheckovPassedCheck_getFileAbsPath_106044968825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7949;

    public CheckovPassedCheck_getFileAbsPath_106044968825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7989 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term7987 = new ArrayList();
        ((ArrayList) term7987).add(term7989);
        Integer term8018 = new Integer(-1945706126);
        Integer term8020 = new Integer(1152356969);
        Integer term8022 = new Integer(-1667990367);
        Integer term8024 = new Integer(-1214628358);
        ArrayList term8016 = new ArrayList();
        ((ArrayList) term8016).add(term8018);
        ((ArrayList) term8016).add(term8020);
        ((ArrayList) term8016).add(term8022);
        ((ArrayList) term8016).add(term8024);
        Integer term8079 = new Integer(1102721075);
        ArrayList term8077 = new ArrayList();
        ((ArrayList) term8077).add(term8079);
        term7949 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term7974 = newInstance(Class.forName("java.lang.Object"));
        Object term8052 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term8095 = newInstance(Class.forName("java.lang.Object"));
        setField(term7949, term7949.getClass(), "checkId", "IlvgFINwIa");
        setField(term7949, term7949.getClass(), "checkName", "GEJABPlHSI");
        setField(term7949, term7949.getClass(), "checkResult", term7974);
        setField(term7949, term7949.getClass(), "bcCheckId", "aQFUvuaYxd");
        setField(term7949, term7949.getClass(), "codeBlock", term7987);
        setField(term7949, term7949.getClass(), "filePath", "zNFLXMifnS");
        setField(term7949, term7949.getClass(), "repoFilePath", "HHQcYMSBVc");
        setField(term7949, term7949.getClass(), "fileLineRange", term8016);
        setField(term7949, term7949.getClass(), "resource", "wdoqITnaAP");
        setField(term7949, term7949.getClass(), "fileAbsPath", "rIPMBcrNqB");
        setField(term8052, term8052.getClass(), "name", "UDaboHZHhz");
        setField(term7949, term7949.getClass(), "entityTags", term8052);
        setField(term7949, term7949.getClass(), "callerFilePath", "nRvKihUSPj");
        setField(term7949, term7949.getClass(), "callerFileLineRange", term8077);
        setField(term7949, term7949.getClass(), "fixedDefinition", "BbNeQJpYPr");
        setField(term7949, term7949.getClass(), "evaluations", term8095);
        setField(term7949, term7949.getClass(), "checkClass", "riMtzCoxNj");
        setField(term7949, term7949.getClass(), "guideline", "YAXkVjQZcV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileAbsPath", argTypes, term7949, args);
    }

};


