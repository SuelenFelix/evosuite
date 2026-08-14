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

public class UserDTO_canEqual_27354762925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13748;
     Object term13835;

    public UserDTO_canEqual_27354762925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13763 = new Integer(1226377461);
        Integer term13765 = new Integer(-1540486514);
        Integer term13767 = new Integer(1471031478);
        Integer term13769 = new Integer(-334716487);
        ArrayList term13761 = new ArrayList();
        ((ArrayList) term13761).add(term13763);
        ((ArrayList) term13761).add(term13765);
        ((ArrayList) term13761).add(term13767);
        ((ArrayList) term13761).add(term13769);
        Integer term13773 = new Integer(-1739012814);
        term13748 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term13748, term13748.getClass(), "Type", "bwXWpCUaun");
        setField(term13748, term13748.getClass(), "idList", term13761);
        setField(term13748, term13748.getClass(), "meetingid", term13773);
        setField(term13748, term13748.getClass(), "email", "bNhvwOrXoC");
        setField(term13748, term13748.getClass(), "username", "QHwFfYSCNm");
        setField(term13748, term13748.getClass(), "base64Face", "TDpWaJHRZc");
        setField(term13748, term13748.getClass(), "oldpassword", "nsydNohggs");
        setField(term13748, term13748.getClass(), "newpassword", "NwQXMulIlF");
        term13835 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13835;
        callMethod(klass, "canEqual", argTypes, term13748, args);
    }

};


