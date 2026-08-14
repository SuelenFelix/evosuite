package com.org.model.dto;

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
import static com.org.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDTO_getEmail_42881043711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11884;

    public UserDTO_getEmail_42881043711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11899 = new Integer(-1811706962);
        Integer term11901 = new Integer(-1242133071);
        Integer term11903 = new Integer(-455052015);
        Integer term11905 = new Integer(-1322797287);
        Integer term11907 = new Integer(-615198242);
        Integer term11909 = new Integer(-491132382);
        Integer term11911 = new Integer(918882916);
        Integer term11913 = new Integer(1544012770);
        Integer term11915 = new Integer(1922068039);
        ArrayList term11897 = new ArrayList();
        ((ArrayList) term11897).add(term11899);
        ((ArrayList) term11897).add(term11901);
        ((ArrayList) term11897).add(term11903);
        ((ArrayList) term11897).add(term11905);
        ((ArrayList) term11897).add(term11907);
        ((ArrayList) term11897).add(term11909);
        ((ArrayList) term11897).add(term11911);
        ((ArrayList) term11897).add(term11913);
        ((ArrayList) term11897).add(term11915);
        Integer term11919 = new Integer(-410564443);
        term11884 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term11884, term11884.getClass(), "Type", "hNoRxfoxPM");
        setField(term11884, term11884.getClass(), "idList", term11897);
        setField(term11884, term11884.getClass(), "meetingid", term11919);
        setField(term11884, term11884.getClass(), "email", "AkemusjkVp");
        setField(term11884, term11884.getClass(), "username", "rqjMeNBTEM");
        setField(term11884, term11884.getClass(), "base64Face", "WNUzKkDpZX");
        setField(term11884, term11884.getClass(), "oldpassword", "aduqofSIXN");
        setField(term11884, term11884.getClass(), "newpassword", "oDCJeRRdBM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term11884, args);
    }

};


