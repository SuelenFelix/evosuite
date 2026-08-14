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

public class UserDTO_toString_149006136528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14038;

    public UserDTO_toString_149006136528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14053 = new Integer(-1858425735);
        Integer term14055 = new Integer(1818274550);
        Integer term14057 = new Integer(1044519085);
        Integer term14059 = new Integer(2095699770);
        Integer term14061 = new Integer(-1365904757);
        Integer term14063 = new Integer(-1487263349);
        Integer term14065 = new Integer(-1009732764);
        Integer term14067 = new Integer(950783153);
        Integer term14069 = new Integer(-801175078);
        ArrayList term14051 = new ArrayList();
        ((ArrayList) term14051).add(term14053);
        ((ArrayList) term14051).add(term14055);
        ((ArrayList) term14051).add(term14057);
        ((ArrayList) term14051).add(term14059);
        ((ArrayList) term14051).add(term14061);
        ((ArrayList) term14051).add(term14063);
        ((ArrayList) term14051).add(term14065);
        ((ArrayList) term14051).add(term14067);
        ((ArrayList) term14051).add(term14069);
        Integer term14073 = new Integer(2085098404);
        term14038 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term14038, term14038.getClass(), "Type", "biviUUSgfC");
        setField(term14038, term14038.getClass(), "idList", term14051);
        setField(term14038, term14038.getClass(), "meetingid", term14073);
        setField(term14038, term14038.getClass(), "email", "aooyFRcKhG");
        setField(term14038, term14038.getClass(), "username", "XKnXDRejrp");
        setField(term14038, term14038.getClass(), "base64Face", "KXuRaoGXpO");
        setField(term14038, term14038.getClass(), "oldpassword", "dvVcvTQRwf");
        setField(term14038, term14038.getClass(), "newpassword", "MmpIaMLtIl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term14038, args);
    }

};


