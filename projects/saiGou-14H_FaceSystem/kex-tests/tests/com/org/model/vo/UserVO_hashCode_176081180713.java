package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class UserVO_hashCode_176081180713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6720;

    public UserVO_hashCode_176081180713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6721 = new Integer(1466373988);
        Integer term6762 = new Integer(-358526505);
        Integer term6766 = new Integer(1843268026);
        ArrayList term6770 = new ArrayList();
        ((ArrayList) term6770).add((Object)null);
        ((ArrayList) term6770).add((Object)null);
        ((ArrayList) term6770).add((Object)null);
        ((ArrayList) term6770).add((Object)null);
        ((ArrayList) term6770).add((Object)null);
        Object term6761 = newInstance(Class.forName("com.org.model.Menu"));
        Object term6773 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term6761, term6761.getClass(), "id", term6762);
        setField(term6761, term6761.getClass(), "name", "");
        setField(term6761, term6761.getClass(), "path", "");
        setField(term6761, term6761.getClass(), "parentId", term6766);
        setField(term6761, term6761.getClass(), "icon", "");
        setField(term6761, term6761.getClass(), "introduce", "");
        setField(term6761, term6761.getClass(), "children", term6770);
        setField(term6773, term6773.getClass(), "title", null);
        setField(term6773, term6773.getClass(), "icon", null);
        setField(term6761, term6761.getClass(), "meta", term6773);
        Integer term6775 = new Integer(993388358);
        Integer term6779 = new Integer(-765191335);
        ArrayList term6783 = new ArrayList();
        Object term6774 = newInstance(Class.forName("com.org.model.Menu"));
        Object term6786 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term6774, term6774.getClass(), "id", term6775);
        setField(term6774, term6774.getClass(), "name", "");
        setField(term6774, term6774.getClass(), "path", "");
        setField(term6774, term6774.getClass(), "parentId", term6779);
        setField(term6774, term6774.getClass(), "icon", "");
        setField(term6774, term6774.getClass(), "introduce", "");
        setField(term6774, term6774.getClass(), "children", term6783);
        setField(term6786, term6786.getClass(), "title", null);
        setField(term6786, term6786.getClass(), "icon", null);
        setField(term6774, term6774.getClass(), "meta", term6786);
        ArrayList term6759 = new ArrayList();
        ((ArrayList) term6759).add(term6761);
        ((ArrayList) term6759).add(term6774);
        term6720 = newInstance(Class.forName("com.org.model.vo.UserVO"));
        setField(term6720, term6720.getClass(), "id", term6721);
        setField(term6720, term6720.getClass(), "email", "GqTBOhQBgV");
        setField(term6720, term6720.getClass(), "username", "DQhxOWqEyi");
        setField(term6720, term6720.getClass(), "power", "dSszYGDwAk");
        setField(term6720, term6720.getClass(), "menus", term6759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.UserVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6720, args);
    }

};


