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

public class UserDTO_hashCode_97930167519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5742;

    public UserDTO_hashCode_97930167519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5757 = new Integer(1358829571);
        Integer term5759 = new Integer(991356662);
        Integer term5761 = new Integer(-506958186);
        Integer term5763 = new Integer(-507387516);
        Integer term5765 = new Integer(-1970452551);
        ArrayList term5755 = new ArrayList();
        ((ArrayList) term5755).add(term5757);
        ((ArrayList) term5755).add(term5759);
        ((ArrayList) term5755).add(term5761);
        ((ArrayList) term5755).add(term5763);
        ((ArrayList) term5755).add(term5765);
        Integer term5769 = new Integer(-1896376975);
        term5742 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term5742, term5742.getClass(), "Type", "ShIELyuULw");
        setField(term5742, term5742.getClass(), "idList", term5755);
        setField(term5742, term5742.getClass(), "meetingid", term5769);
        setField(term5742, term5742.getClass(), "email", "IpQuOGMgmj");
        setField(term5742, term5742.getClass(), "username", "pJbnHTYrxn");
        setField(term5742, term5742.getClass(), "base64Face", "iIRsCSYqXH");
        setField(term5742, term5742.getClass(), "oldpassword", "nghfqDXyCG");
        setField(term5742, term5742.getClass(), "newpassword", "WBAOTqErtm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5742, args);
    }

};


