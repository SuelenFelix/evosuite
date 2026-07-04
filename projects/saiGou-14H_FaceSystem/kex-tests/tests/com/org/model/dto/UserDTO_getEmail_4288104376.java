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

public class UserDTO_getEmail_4288104376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3742;

    public UserDTO_getEmail_4288104376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3757 = new Integer(1045657203);
        Integer term3759 = new Integer(1386130016);
        Integer term3761 = new Integer(1072005683);
        Integer term3763 = new Integer(1861318859);
        Integer term3765 = new Integer(1474524152);
        Integer term3767 = new Integer(568954359);
        ArrayList term3755 = new ArrayList();
        ((ArrayList) term3755).add(term3757);
        ((ArrayList) term3755).add(term3759);
        ((ArrayList) term3755).add(term3761);
        ((ArrayList) term3755).add(term3763);
        ((ArrayList) term3755).add(term3765);
        ((ArrayList) term3755).add(term3767);
        Integer term3771 = new Integer(53410913);
        term3742 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term3742, term3742.getClass(), "Type", "aNWLJdrZMq");
        setField(term3742, term3742.getClass(), "idList", term3755);
        setField(term3742, term3742.getClass(), "meetingid", term3771);
        setField(term3742, term3742.getClass(), "email", "HHmNoYxIGj");
        setField(term3742, term3742.getClass(), "username", "PtirvZmsGt");
        setField(term3742, term3742.getClass(), "base64Face", "HWkpTmtlrc");
        setField(term3742, term3742.getClass(), "oldpassword", "hMmaoREuCK");
        setField(term3742, term3742.getClass(), "newpassword", "VeDtgDzGAN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term3742, args);
    }

};


