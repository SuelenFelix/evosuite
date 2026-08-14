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

public class CheckovPassedCheck_getBcCheckId_9429224173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1173;

    public CheckovPassedCheck_getBcCheckId_9429224173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1213 = newInstance(Class.forName("java.lang.Object"));
        Object term1214 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term1211 = new ArrayList();
        ((ArrayList) term1211).add(term1213);
        ((ArrayList) term1211).add(term1214);
        Integer term1243 = new Integer(1585847225);
        Integer term1245 = new Integer(597278769);
        Integer term1247 = new Integer(-1685132342);
        Integer term1249 = new Integer(-1456670397);
        Integer term1251 = new Integer(1622346318);
        Integer term1253 = new Integer(1048535127);
        ArrayList term1241 = new ArrayList();
        ((ArrayList) term1241).add(term1243);
        ((ArrayList) term1241).add(term1245);
        ((ArrayList) term1241).add(term1247);
        ((ArrayList) term1241).add(term1249);
        ((ArrayList) term1241).add(term1251);
        ((ArrayList) term1241).add(term1253);
        Integer term1308 = new Integer(-655067527);
        Integer term1310 = new Integer(-6029667);
        Integer term1312 = new Integer(-2068769794);
        Integer term1314 = new Integer(-117576464);
        Integer term1316 = new Integer(-1007160944);
        Integer term1318 = new Integer(1135664017);
        Integer term1320 = new Integer(590364439);
        ArrayList term1306 = new ArrayList();
        ((ArrayList) term1306).add(term1308);
        ((ArrayList) term1306).add(term1310);
        ((ArrayList) term1306).add(term1312);
        ((ArrayList) term1306).add(term1314);
        ((ArrayList) term1306).add(term1316);
        ((ArrayList) term1306).add(term1318);
        ((ArrayList) term1306).add(term1320);
        term1173 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term1198 = newInstance(Class.forName("java.lang.Object"));
        Object term1281 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term1336 = newInstance(Class.forName("java.lang.Object"));
        setField(term1173, term1173.getClass(), "checkId", "UlajhuVLaP");
        setField(term1173, term1173.getClass(), "checkName", "gGSMzuGICf");
        setField(term1173, term1173.getClass(), "checkResult", term1198);
        setField(term1173, term1173.getClass(), "bcCheckId", "hxCBltsObl");
        setField(term1173, term1173.getClass(), "codeBlock", term1211);
        setField(term1173, term1173.getClass(), "filePath", "BndsHwAFMv");
        setField(term1173, term1173.getClass(), "repoFilePath", "GzFkzHGYFt");
        setField(term1173, term1173.getClass(), "fileLineRange", term1241);
        setField(term1173, term1173.getClass(), "resource", "tShwQLRGNe");
        setField(term1173, term1173.getClass(), "fileAbsPath", "LvtrsXUliU");
        setField(term1281, term1281.getClass(), "name", "xLbjWUgOIL");
        setField(term1173, term1173.getClass(), "entityTags", term1281);
        setField(term1173, term1173.getClass(), "callerFilePath", "jDtqGUpnZN");
        setField(term1173, term1173.getClass(), "callerFileLineRange", term1306);
        setField(term1173, term1173.getClass(), "fixedDefinition", "nGKItKLYNC");
        setField(term1173, term1173.getClass(), "evaluations", term1336);
        setField(term1173, term1173.getClass(), "checkClass", "UiUYnPrcCi");
        setField(term1173, term1173.getClass(), "guideline", "UoYtihxVaS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBcCheckId", argTypes, term1173, args);
    }

};


