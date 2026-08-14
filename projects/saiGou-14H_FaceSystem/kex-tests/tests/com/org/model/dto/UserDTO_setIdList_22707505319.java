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
import java.util.LinkedList;

public class UserDTO_setIdList_22707505319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12802;
     Object term12887;

    public UserDTO_setIdList_22707505319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12817 = new Integer(472580433);
        Integer term12819 = new Integer(1189049164);
        Integer term12821 = new Integer(-673413879);
        ArrayList term12815 = new ArrayList();
        ((ArrayList) term12815).add(term12817);
        ((ArrayList) term12815).add(term12819);
        ((ArrayList) term12815).add(term12821);
        Integer term12825 = new Integer(1609778442);
        term12802 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term12802, term12802.getClass(), "Type", "fYRcUEKErh");
        setField(term12802, term12802.getClass(), "idList", term12815);
        setField(term12802, term12802.getClass(), "meetingid", term12825);
        setField(term12802, term12802.getClass(), "email", "ObBNcwkdKb");
        setField(term12802, term12802.getClass(), "username", "bbKtLbiXSm");
        setField(term12802, term12802.getClass(), "base64Face", "AYcehuoFwZ");
        setField(term12802, term12802.getClass(), "oldpassword", "MkKeGpajFk");
        setField(term12802, term12802.getClass(), "newpassword", "JhIjEseRRP");
        Integer term12890 = new Integer(524850421);
        Integer term12893 = new Integer(-1833121756);
        term12887 = new LinkedList();
        ((LinkedList) term12887).add(term12890);
        ((LinkedList) term12887).add(term12893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term12887;
        callMethod(klass, "setIdList", argTypes, term12802, args);
    }

};


