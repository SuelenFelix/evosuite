package org.openRealmOfStars.ai.mission;

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
import static org.openRealmOfStars.ai.mission.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class MissionList_saveMissionList_7459071963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572703;
     Object term572708;

    public MissionList_saveMissionList_7459071963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term572704 = new ArrayList();
        term572703 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.MissionList"));
        setField(term572703, term572703.getClass(), "missions", term572704);
        term572708 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term572710 = (byte[]) newByteArray(2);
        byte[] term572713 = (byte[]) newByteArray(0);
        Object term572715 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term572708, term572708.getClass(), "written", 359514248);
        setByteElement(term572710, 0, (byte) 50);
        setByteElement(term572710, 1, (byte) 19);
        setField(term572708, term572708.getClass(), "bytearr", term572710);
        setField(term572708, term572708.getClass(), "writeBuffer", term572713);
        setField(term572708, term572708.getClass(), "out", null);
        setBooleanField(term572708, term572708.getClass(), "closed", false);
        setField(term572708, term572708.getClass(), "closeLock", term572715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.MissionList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term572708;
        callMethod(klass, "saveMissionList", argTypes, term572703, args);
    }

};


