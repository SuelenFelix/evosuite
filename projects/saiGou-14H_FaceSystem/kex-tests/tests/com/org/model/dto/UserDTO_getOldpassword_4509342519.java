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

public class UserDTO_getOldpassword_4509342519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4187;

    public UserDTO_getOldpassword_4509342519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4202 = new Integer(71190297);
        Integer term4204 = new Integer(1202361360);
        Integer term4206 = new Integer(-2015048153);
        Integer term4208 = new Integer(-2063457669);
        Integer term4210 = new Integer(-1222006000);
        Integer term4212 = new Integer(2095798786);
        Integer term4214 = new Integer(-1565502840);
        ArrayList term4200 = new ArrayList();
        ((ArrayList) term4200).add(term4202);
        ((ArrayList) term4200).add(term4204);
        ((ArrayList) term4200).add(term4206);
        ((ArrayList) term4200).add(term4208);
        ((ArrayList) term4200).add(term4210);
        ((ArrayList) term4200).add(term4212);
        ((ArrayList) term4200).add(term4214);
        Integer term4218 = new Integer(344323424);
        term4187 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term4187, term4187.getClass(), "Type", "vwbEQQNQrx");
        setField(term4187, term4187.getClass(), "idList", term4200);
        setField(term4187, term4187.getClass(), "meetingid", term4218);
        setField(term4187, term4187.getClass(), "email", "xtftXXMbem");
        setField(term4187, term4187.getClass(), "username", "cudZvLMQon");
        setField(term4187, term4187.getClass(), "base64Face", "lihXWlGDxk");
        setField(term4187, term4187.getClass(), "oldpassword", "JmcmxoGhIK");
        setField(term4187, term4187.getClass(), "newpassword", "jXzmYyrnnT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOldpassword", argTypes, term4187, args);
    }

};


