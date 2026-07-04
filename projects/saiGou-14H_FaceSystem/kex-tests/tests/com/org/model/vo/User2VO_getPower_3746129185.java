package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class User2VO_getPower_3746129185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14975;

    public User2VO_getPower_3746129185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14976 = new Integer(514511037);
        Integer term15050 = new Integer(1713573821);
        Class<? extends Object> term15234 = Class.forName((String) "java.io.File$PathStatus");
        Field term15233 = ((Class) term15234).getDeclaredField((String) "CHECKED");
        ((Field) term15233).setAccessible(true);
        Object enum4 = ((Field) term15233).get((Object) null);
        ArrayList term15137 = new ArrayList();
        ((ArrayList) term15137).add("VVfwcKWfYk");
        term14975 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term15064 = newInstance(Class.forName("java.io.File"));
        setField(term14975, term14975.getClass(), "id", term14976);
        setField(term14975, term14975.getClass(), "email", "saKRDpPnGD");
        setField(term14975, term14975.getClass(), "password", "UesGweYSco");
        setField(term14975, term14975.getClass(), "username", "uVnPUUZHSY");
        setField(term14975, term14975.getClass(), "power", "LaWPqdDqyl");
        setField(term14975, term14975.getClass(), "nickname", "BGDjrSZTJY");
        setField(term14975, term14975.getClass(), "sex", "VUVCEVItic");
        setField(term14975, term14975.getClass(), "age", term15050);
        setField(term14975, term14975.getClass(), "phone", "tloEDDASGy");
        setField(term15064, term15064.getClass(), "path", "CQMdMBIICe");
        setField(term15064, term15064.getClass(), "status", enum4);
        setIntField(term15064, term15064.getClass(), "prefixLength", -1922583790);
        setField(term15064, term15064.getClass(), "filePath", null);
        setField(term14975, term14975.getClass(), "facePic", term15064);
        setField(term14975, term14975.getClass(), "faceUrl", "rbJaIkrSnM");
        setField(term14975, term14975.getClass(), "headUrl", "EAKcPFEKbX");
        setField(term14975, term14975.getClass(), "introduce", "uPdAMNFhdG");
        setField(term14975, term14975.getClass(), "ip", "VjXPlvOnMK");
        setField(term14975, term14975.getClass(), "partnames", term15137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPower", argTypes, term14975, args);
    }

};


