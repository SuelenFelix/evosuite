package com.cg.freelanceapp.entities;

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
import static com.cg.freelanceapp.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;
import java.util.ArrayList;

public class Freelancer_init_17368988681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25712;
     Object term25715;
     Object term25718;
     Object term25819;

    public Freelancer_init_17368988681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25712 = new LinkedList();
        term25715 = new LinkedList();
        Long term25722 = new Long(-6203733697011665719L);
        Long term25725 = new Long(4013144018451677763L);
        Integer term25729 = new Integer(162113491);
        Long term25732 = new Long(-6089031270216011230L);
        ArrayList term25738 = new ArrayList();
        ((ArrayList) term25738).add((Object)null);
        ((ArrayList) term25738).add((Object)null);
        ((ArrayList) term25738).add((Object)null);
        ArrayList term25741 = new ArrayList();
        ((ArrayList) term25741).add((Object)null);
        ((ArrayList) term25741).add((Object)null);
        ((ArrayList) term25741).add((Object)null);
        ((ArrayList) term25741).add((Object)null);
        ((ArrayList) term25741).add((Object)null);
        ((ArrayList) term25741).add((Object)null);
        ((ArrayList) term25741).add((Object)null);
        ((ArrayList) term25741).add((Object)null);
        ((ArrayList) term25741).add((Object)null);
        ArrayList term25744 = new ArrayList();
        ((ArrayList) term25744).add((Object)null);
        ((ArrayList) term25744).add((Object)null);
        ((ArrayList) term25744).add((Object)null);
        ((ArrayList) term25744).add((Object)null);
        ((ArrayList) term25744).add((Object)null);
        ((ArrayList) term25744).add((Object)null);
        ArrayList term25747 = new ArrayList();
        ((ArrayList) term25747).add((Object)null);
        Object term25721 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        Object term25724 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term25731 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term25721, term25721.getClass(), "id", term25722);
        setField(term25724, term25724.getClass(), "id", term25725);
        setField(term25724, term25724.getClass(), "name", "");
        setField(term25724, term25724.getClass(), "description", "");
        setField(term25721, term25721.getClass(), "skill", term25724);
        setField(term25721, term25721.getClass(), "years", term25729);
        setField(term25731, term25731.getClass(), "id", term25732);
        setField(term25731, term25731.getClass(), "userName", "");
        setField(term25731, term25731.getClass(), "firstName", "");
        setField(term25731, term25731.getClass(), "lastName", "");
        setField(term25731, term25731.getClass(), "password", "");
        setField(term25731, term25731.getClass(), "appliedJobs", term25738);
        setField(term25731, term25731.getClass(), "feedbacks", term25741);
        setField(term25731, term25731.getClass(), "skills", term25744);
        setField(term25731, term25731.getClass(), "bookmarkedJobs", term25747);
        setField(term25721, term25721.getClass(), "freelancer", term25731);
        Long term25752 = new Long(-109641936297719200L);
        Long term25755 = new Long(7805361335309542211L);
        Integer term25757 = new Integer(-1911972560);
        Long term25760 = new Long(-3947409235127058867L);
        Object term25751 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        Object term25754 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term25759 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term25751, term25751.getClass(), "id", term25752);
        setField(term25754, term25754.getClass(), "id", term25755);
        setField(term25754, term25754.getClass(), "name", null);
        setField(term25754, term25754.getClass(), "description", null);
        setField(term25751, term25751.getClass(), "skill", term25754);
        setField(term25751, term25751.getClass(), "years", term25757);
        setField(term25759, term25759.getClass(), "id", term25760);
        setField(term25759, term25759.getClass(), "userName", null);
        setField(term25759, term25759.getClass(), "firstName", null);
        setField(term25759, term25759.getClass(), "lastName", null);
        setField(term25759, term25759.getClass(), "password", null);
        setField(term25759, term25759.getClass(), "appliedJobs", null);
        setField(term25759, term25759.getClass(), "feedbacks", null);
        setField(term25759, term25759.getClass(), "skills", null);
        setField(term25759, term25759.getClass(), "bookmarkedJobs", null);
        setField(term25751, term25751.getClass(), "freelancer", term25759);
        Long term25764 = new Long(-3585886572555403047L);
        Integer term25766 = new Integer(-1728316609);
        Object term25763 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term25763, term25763.getClass(), "id", term25764);
        setField(term25763, term25763.getClass(), "skill", null);
        setField(term25763, term25763.getClass(), "years", term25766);
        setField(term25763, term25763.getClass(), "freelancer", null);
        term25718 = new LinkedList();
        ((LinkedList) term25718).add(term25721);
        ((LinkedList) term25718).add(term25751);
        ((LinkedList) term25718).add(term25763);
        ((LinkedList) term25718).add((Object)null);
        ((LinkedList) term25718).add((Object)null);
        ((LinkedList) term25718).add((Object)null);
        ((LinkedList) term25718).add((Object)null);
        ((LinkedList) term25718).add((Object)null);
        ((LinkedList) term25718).add((Object)null);
        term25819 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("java.util.List");
        argTypes[6] = Class.forName("java.util.List");
        argTypes[7] = Class.forName("java.util.List");
        Object[] args = new Object[8];
        args[0] = "xMPmjpkCtD";
        args[1] = "YGhSawJoTE";
        args[2] = "AGCkqlfRlT";
        args[3] = "FtACxNMFtP";
        args[4] = term25712;
        args[5] = term25715;
        args[6] = term25718;
        args[7] = term25819;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


