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
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class Recruiter_getFirstName_8281571326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24659;

    public Recruiter_getFirstName_8281571326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24660 = new Long(-1244149061151367736L);
        ArrayList term24710 = new ArrayList();
        Long term24717 = new Long(985346718698079792L);
        Integer term24719 = new Integer(-1284825282);
        Long term24723 = new Long(4787080389628135236L);
        Object term24716 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        Object term24722 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term24725 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term24716, term24716.getClass(), "id", term24717);
        setField(term24716, term24716.getClass(), "ranges", term24719);
        setField(term24716, term24716.getClass(), "comments", "");
        setField(term24722, term24722.getClass(), "id", term24723);
        setField(term24722, term24722.getClass(), "userName", null);
        setField(term24722, term24722.getClass(), "firstName", null);
        setField(term24722, term24722.getClass(), "lastName", null);
        setField(term24722, term24722.getClass(), "password", null);
        setField(term24722, term24722.getClass(), "postedJobs", null);
        setField(term24722, term24722.getClass(), "feedbacks", null);
        setField(term24722, term24722.getClass(), "freelancers", null);
        setField(term24716, term24716.getClass(), "createdBy", term24722);
        setField(term24725, term24725.getClass(), "id", null);
        setField(term24725, term24725.getClass(), "userName", null);
        setField(term24725, term24725.getClass(), "firstName", null);
        setField(term24725, term24725.getClass(), "lastName", null);
        setField(term24725, term24725.getClass(), "password", null);
        setField(term24725, term24725.getClass(), "appliedJobs", null);
        setField(term24725, term24725.getClass(), "feedbacks", null);
        setField(term24725, term24725.getClass(), "skills", null);
        setField(term24725, term24725.getClass(), "bookmarkedJobs", null);
        setField(term24716, term24716.getClass(), "createdFor", term24725);
        Long term24727 = new Long(1814900684861511674L);
        Integer term24729 = new Integer(-1792504217);
        Object term24726 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        Object term24732 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term24733 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term24726, term24726.getClass(), "id", term24727);
        setField(term24726, term24726.getClass(), "ranges", term24729);
        setField(term24726, term24726.getClass(), "comments", "");
        setField(term24732, term24732.getClass(), "id", null);
        setField(term24732, term24732.getClass(), "userName", null);
        setField(term24732, term24732.getClass(), "firstName", null);
        setField(term24732, term24732.getClass(), "lastName", null);
        setField(term24732, term24732.getClass(), "password", null);
        setField(term24732, term24732.getClass(), "postedJobs", null);
        setField(term24732, term24732.getClass(), "feedbacks", null);
        setField(term24732, term24732.getClass(), "freelancers", null);
        setField(term24726, term24726.getClass(), "createdBy", term24732);
        setField(term24733, term24733.getClass(), "id", null);
        setField(term24733, term24733.getClass(), "userName", null);
        setField(term24733, term24733.getClass(), "firstName", null);
        setField(term24733, term24733.getClass(), "lastName", null);
        setField(term24733, term24733.getClass(), "password", null);
        setField(term24733, term24733.getClass(), "appliedJobs", null);
        setField(term24733, term24733.getClass(), "feedbacks", null);
        setField(term24733, term24733.getClass(), "skills", null);
        setField(term24733, term24733.getClass(), "bookmarkedJobs", null);
        setField(term24726, term24726.getClass(), "createdFor", term24733);
        Long term24735 = new Long(5234836956955605304L);
        Integer term24737 = new Integer(1824538861);
        Object term24734 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        Object term24740 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term24741 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term24734, term24734.getClass(), "id", term24735);
        setField(term24734, term24734.getClass(), "ranges", term24737);
        setField(term24734, term24734.getClass(), "comments", "");
        setField(term24740, term24740.getClass(), "id", null);
        setField(term24740, term24740.getClass(), "userName", null);
        setField(term24740, term24740.getClass(), "firstName", null);
        setField(term24740, term24740.getClass(), "lastName", null);
        setField(term24740, term24740.getClass(), "password", null);
        setField(term24740, term24740.getClass(), "postedJobs", null);
        setField(term24740, term24740.getClass(), "feedbacks", null);
        setField(term24740, term24740.getClass(), "freelancers", null);
        setField(term24734, term24734.getClass(), "createdBy", term24740);
        setField(term24741, term24741.getClass(), "id", null);
        setField(term24741, term24741.getClass(), "userName", null);
        setField(term24741, term24741.getClass(), "firstName", null);
        setField(term24741, term24741.getClass(), "lastName", null);
        setField(term24741, term24741.getClass(), "password", null);
        setField(term24741, term24741.getClass(), "appliedJobs", null);
        setField(term24741, term24741.getClass(), "feedbacks", null);
        setField(term24741, term24741.getClass(), "skills", null);
        setField(term24741, term24741.getClass(), "bookmarkedJobs", null);
        setField(term24734, term24734.getClass(), "createdFor", term24741);
        Long term24743 = new Long(2662948409033106270L);
        Integer term24745 = new Integer(-1748391876);
        Long term24749 = new Long(562794068928395674L);
        Object term24742 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        Object term24748 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term24751 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term24742, term24742.getClass(), "id", term24743);
        setField(term24742, term24742.getClass(), "ranges", term24745);
        setField(term24742, term24742.getClass(), "comments", "");
        setField(term24748, term24748.getClass(), "id", term24749);
        setField(term24748, term24748.getClass(), "userName", null);
        setField(term24748, term24748.getClass(), "firstName", null);
        setField(term24748, term24748.getClass(), "lastName", null);
        setField(term24748, term24748.getClass(), "password", null);
        setField(term24748, term24748.getClass(), "postedJobs", null);
        setField(term24748, term24748.getClass(), "feedbacks", null);
        setField(term24748, term24748.getClass(), "freelancers", null);
        setField(term24742, term24742.getClass(), "createdBy", term24748);
        setField(term24751, term24751.getClass(), "id", null);
        setField(term24751, term24751.getClass(), "userName", null);
        setField(term24751, term24751.getClass(), "firstName", null);
        setField(term24751, term24751.getClass(), "lastName", null);
        setField(term24751, term24751.getClass(), "password", null);
        setField(term24751, term24751.getClass(), "appliedJobs", null);
        setField(term24751, term24751.getClass(), "feedbacks", null);
        setField(term24751, term24751.getClass(), "skills", null);
        setField(term24751, term24751.getClass(), "bookmarkedJobs", null);
        setField(term24742, term24742.getClass(), "createdFor", term24751);
        Long term24753 = new Long(1617580635228094061L);
        Integer term24755 = new Integer(1707220033);
        Object term24752 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        Object term24758 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term24752, term24752.getClass(), "id", term24753);
        setField(term24752, term24752.getClass(), "ranges", term24755);
        setField(term24752, term24752.getClass(), "comments", "");
        setField(term24752, term24752.getClass(), "createdBy", term24722);
        setField(term24758, term24758.getClass(), "id", null);
        setField(term24758, term24758.getClass(), "userName", null);
        setField(term24758, term24758.getClass(), "firstName", null);
        setField(term24758, term24758.getClass(), "lastName", null);
        setField(term24758, term24758.getClass(), "password", null);
        setField(term24758, term24758.getClass(), "appliedJobs", null);
        setField(term24758, term24758.getClass(), "feedbacks", null);
        setField(term24758, term24758.getClass(), "skills", null);
        setField(term24758, term24758.getClass(), "bookmarkedJobs", null);
        setField(term24752, term24752.getClass(), "createdFor", term24758);
        ArrayList term24714 = new ArrayList();
        ((ArrayList) term24714).add(term24716);
        ((ArrayList) term24714).add(term24726);
        ((ArrayList) term24714).add(term24734);
        ((ArrayList) term24714).add(term24742);
        ((ArrayList) term24714).add(term24752);
        ArrayList term24761 = new ArrayList();
        term24659 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        setField(term24659, term24659.getClass(), "id", term24660);
        setField(term24659, term24659.getClass(), "userName", "kPOlNDAMrn");
        setField(term24659, term24659.getClass(), "firstName", "gXVfxiKYXy");
        setField(term24659, term24659.getClass(), "lastName", "wDXGaloUxi");
        setField(term24659, term24659.getClass(), "password", "QZpJmHsqng");
        setField(term24659, term24659.getClass(), "postedJobs", term24710);
        setField(term24659, term24659.getClass(), "feedbacks", term24714);
        setField(term24659, term24659.getClass(), "freelancers", term24761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Recruiter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term24659, args);
    }

};


