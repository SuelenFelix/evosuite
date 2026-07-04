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

public class UserDTO_setUsername_149328934715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5110;

    public UserDTO_setUsername_149328934715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5125 = new Integer(229204365);
        Integer term5127 = new Integer(-461771056);
        ArrayList term5123 = new ArrayList();
        ((ArrayList) term5123).add(term5125);
        ((ArrayList) term5123).add(term5127);
        Integer term5131 = new Integer(-243422082);
        term5110 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term5110, term5110.getClass(), "Type", "QduALnDSVo");
        setField(term5110, term5110.getClass(), "idList", term5123);
        setField(term5110, term5110.getClass(), "meetingid", term5131);
        setField(term5110, term5110.getClass(), "email", "izPpKDErnQ");
        setField(term5110, term5110.getClass(), "username", "NnpwZBUTvx");
        setField(term5110, term5110.getClass(), "base64Face", "tlQSNgTkQX");
        setField(term5110, term5110.getClass(), "oldpassword", "PCipZnmBOF");
        setField(term5110, term5110.getClass(), "newpassword", "zcorEihhLK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GrqozDKFOk";
        callMethod(klass, "setUsername", argTypes, term5110, args);
    }

};


