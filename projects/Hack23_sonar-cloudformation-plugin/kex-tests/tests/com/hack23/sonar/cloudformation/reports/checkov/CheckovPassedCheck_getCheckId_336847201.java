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

public class CheckovPassedCheck_getCheckId_336847201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term554;

    public CheckovPassedCheck_getCheckId_336847201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term594 = newInstance(Class.forName("java.lang.Object"));
        Object term595 = newInstance(Class.forName("java.lang.Object"));
        Object term596 = newInstance(Class.forName("java.lang.Object"));
        Object term597 = newInstance(Class.forName("java.lang.Object"));
        Object term598 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term592 = new ArrayList();
        ((ArrayList) term592).add(term594);
        ((ArrayList) term592).add(term595);
        ((ArrayList) term592).add(term596);
        ((ArrayList) term592).add(term597);
        ((ArrayList) term592).add(term598);
        Integer term627 = new Integer(568599855);
        Integer term629 = new Integer(1162663216);
        Integer term631 = new Integer(1484323161);
        Integer term633 = new Integer(391863371);
        ArrayList term625 = new ArrayList();
        ((ArrayList) term625).add(term627);
        ((ArrayList) term625).add(term629);
        ((ArrayList) term625).add(term631);
        ((ArrayList) term625).add(term633);
        Integer term688 = new Integer(-1922583790);
        Integer term690 = new Integer(-616727354);
        Integer term692 = new Integer(-1955890973);
        ArrayList term686 = new ArrayList();
        ((ArrayList) term686).add(term688);
        ((ArrayList) term686).add(term690);
        ((ArrayList) term686).add(term692);
        term554 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term579 = newInstance(Class.forName("java.lang.Object"));
        Object term661 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term708 = newInstance(Class.forName("java.lang.Object"));
        setField(term554, term554.getClass(), "checkId", "ZiaGIbnzTs");
        setField(term554, term554.getClass(), "checkName", "tbcdzjIfER");
        setField(term554, term554.getClass(), "checkResult", term579);
        setField(term554, term554.getClass(), "bcCheckId", "HyxfbSQYBe");
        setField(term554, term554.getClass(), "codeBlock", term592);
        setField(term554, term554.getClass(), "filePath", "pCTimMblYc");
        setField(term554, term554.getClass(), "repoFilePath", "hNxWaHcfhY");
        setField(term554, term554.getClass(), "fileLineRange", term625);
        setField(term554, term554.getClass(), "resource", "RkybSrpybU");
        setField(term554, term554.getClass(), "fileAbsPath", "xOEqzGAmDU");
        setField(term661, term661.getClass(), "name", "eZFUvlxvGV");
        setField(term554, term554.getClass(), "entityTags", term661);
        setField(term554, term554.getClass(), "callerFilePath", "BYqFIqCKAV");
        setField(term554, term554.getClass(), "callerFileLineRange", term686);
        setField(term554, term554.getClass(), "fixedDefinition", "vrQLuWIDJX");
        setField(term554, term554.getClass(), "evaluations", term708);
        setField(term554, term554.getClass(), "checkClass", "flxyYxBRtu");
        setField(term554, term554.getClass(), "guideline", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCheckId", argTypes, term554, args);
    }

};


