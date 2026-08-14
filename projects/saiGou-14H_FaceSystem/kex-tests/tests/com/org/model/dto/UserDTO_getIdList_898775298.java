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

public class UserDTO_getIdList_898775298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11579;

    public UserDTO_getIdList_898775298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11594 = new Integer(-919022885);
        Integer term11596 = new Integer(-1836286878);
        Integer term11598 = new Integer(276336694);
        Integer term11600 = new Integer(1627938506);
        Integer term11602 = new Integer(386284750);
        Integer term11604 = new Integer(906856023);
        Integer term11606 = new Integer(198857801);
        Integer term11608 = new Integer(1342884142);
        ArrayList term11592 = new ArrayList();
        ((ArrayList) term11592).add(term11594);
        ((ArrayList) term11592).add(term11596);
        ((ArrayList) term11592).add(term11598);
        ((ArrayList) term11592).add(term11600);
        ((ArrayList) term11592).add(term11602);
        ((ArrayList) term11592).add(term11604);
        ((ArrayList) term11592).add(term11606);
        ((ArrayList) term11592).add(term11608);
        Integer term11612 = new Integer(-1454325068);
        term11579 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term11579, term11579.getClass(), "Type", "JxjbIphmRX");
        setField(term11579, term11579.getClass(), "idList", term11592);
        setField(term11579, term11579.getClass(), "meetingid", term11612);
        setField(term11579, term11579.getClass(), "email", "igspPNkvLc");
        setField(term11579, term11579.getClass(), "username", "BaRcksFiYp");
        setField(term11579, term11579.getClass(), "base64Face", "qCsUoglQjM");
        setField(term11579, term11579.getClass(), "oldpassword", "BVcWJbDXrQ");
        setField(term11579, term11579.getClass(), "newpassword", "PNxbmyThZc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdList", argTypes, term11579, args);
    }

};


