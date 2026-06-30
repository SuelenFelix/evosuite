package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class Comment_setCreateTimestamp_54964515810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10364;
     Object term10569;

    public Comment_setCreateTimestamp_54964515810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10365 = new Long(-278716491237139968L);
        Long term10380 = new Long(-629491722907628764L);
        Long term10443 = new Long(-5552123402871285352L);
        Long term10482 = new Long(-5587528177305224828L);
        Long term10521 = new Long(7950532649535587877L);
        Long term10562 = new Long(7799452759993694308L);
        Object term10561 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term10561, term10561.getClass(), "id", term10562);
        setField(term10561, term10561.getClass(), "body", null);
        setField(term10561, term10561.getClass(), "createdBy", null);
        setField(term10561, term10561.getClass(), "associatedNews", null);
        setField(term10561, term10561.getClass(), "createTimestamp", null);
        ArrayList term10559 = new ArrayList();
        ((ArrayList) term10559).add(term10561);
        term10364 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term10379 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term10442 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term10481 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term10520 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term10566 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term10364, term10364.getClass(), "id", term10365);
        setField(term10364, term10364.getClass(), "body", "VesRqDfjMa");
        setField(term10379, term10379.getClass(), "id", term10380);
        setField(term10379, term10379.getClass(), "firstName", "AQTTebOiZR");
        setField(term10379, term10379.getClass(), "lastName", "mgeIhswNtk");
        setField(term10379, term10379.getClass(), "email", "QwKYpiVQlL");
        setField(term10379, term10379.getClass(), "password", "kSGsHNQQoW");
        setField(term10379, term10379.getClass(), "imageUrl", "MWezlyjdaG");
        setField(term10442, term10442.getClass(), "id", term10443);
        setField(term10442, term10442.getClass(), "name", "drpBJuEKQG");
        setField(term10442, term10442.getClass(), "description", "GGpORnLrOW");
        setField(term10379, term10379.getClass(), "role", term10442);
        setField(term10379, term10379.getClass(), "token", "gDGZwlpOZx");
        setField(term10364, term10364.getClass(), "createdBy", term10379);
        setField(term10481, term10481.getClass(), "id", term10482);
        setField(term10481, term10481.getClass(), "name", "gkDpxkHPDg");
        setField(term10481, term10481.getClass(), "content", "pADwkrWiMW");
        setField(term10481, term10481.getClass(), "imageUrl", "FDORDJuAXQ");
        setField(term10520, term10520.getClass(), "id", term10521);
        setField(term10520, term10520.getClass(), "name", "yjqoDeLBLg");
        setField(term10520, term10520.getClass(), "description", "DCepDqVwas");
        setField(term10520, term10520.getClass(), "imageUrl", "wKIBUlfNCx");
        setField(term10481, term10481.getClass(), "category", term10520);
        setField(term10481, term10481.getClass(), "comments", term10559);
        setField(term10364, term10364.getClass(), "associatedNews", term10481);
        setIntField(term10566, term10566.getClass(), "nanos", 299000000);
        setLongField(term10566, term10566.getClass(), "fastTime", 1762136641000L);
        setField(term10566, term10566.getClass(), "cdate", null);
        setField(term10364, term10364.getClass(), "createTimestamp", term10566);
        term10569 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term10569, term10569.getClass(), "nanos", 666000000);
        setLongField(term10569, term10569.getClass(), "fastTime", 1395468691000L);
        setField(term10569, term10569.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Comment");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term10569;
        callMethod(klass, "setCreateTimestamp", argTypes, term10364, args);
    }

};


