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

public class UserDTO_getMeetingid_9826345009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11734;

    public UserDTO_getMeetingid_9826345009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11749 = new Integer(346714653);
        Integer term11751 = new Integer(2121928697);
        Integer term11753 = new Integer(-1741056571);
        Integer term11755 = new Integer(522501050);
        Integer term11757 = new Integer(125432890);
        ArrayList term11747 = new ArrayList();
        ((ArrayList) term11747).add(term11749);
        ((ArrayList) term11747).add(term11751);
        ((ArrayList) term11747).add(term11753);
        ((ArrayList) term11747).add(term11755);
        ((ArrayList) term11747).add(term11757);
        Integer term11761 = new Integer(-197740561);
        term11734 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term11734, term11734.getClass(), "Type", "fdRVcZbqUf");
        setField(term11734, term11734.getClass(), "idList", term11747);
        setField(term11734, term11734.getClass(), "meetingid", term11761);
        setField(term11734, term11734.getClass(), "email", "aSUSvETRSv");
        setField(term11734, term11734.getClass(), "username", "daQciREiuI");
        setField(term11734, term11734.getClass(), "base64Face", "AFRfAPZdqf");
        setField(term11734, term11734.getClass(), "oldpassword", "cZrxYHSQhL");
        setField(term11734, term11734.getClass(), "newpassword", "fhPRWcwAlA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeetingid", argTypes, term11734, args);
    }

};


