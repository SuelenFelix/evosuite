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
import java.lang.Boolean;
import java.lang.Integer;

public class Freelancer_setId_182120753516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49917;
     Object term50011;

    public Freelancer_setId_182120753516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term49918 = new Long(-6651844343111330638L);
        Long term49971 = new Long(-5817879048746989326L);
        Long term49974 = new Long(2228896102662979446L);
        Boolean term49976 = new Boolean(false);
        Object term49970 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term49973 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term49978 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term49979 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term49970, term49970.getClass(), "id", term49971);
        setField(term49973, term49973.getClass(), "id", term49974);
        setField(term49973, term49973.getClass(), "jobTitle", null);
        setField(term49973, term49973.getClass(), "jobDescription", null);
        setField(term49973, term49973.getClass(), "skill", null);
        setField(term49973, term49973.getClass(), "postedBy", null);
        setField(term49973, term49973.getClass(), "postedDate", null);
        setField(term49973, term49973.getClass(), "awardedTo", null);
        setField(term49973, term49973.getClass(), "jobApplications", null);
        setField(term49973, term49973.getClass(), "active", term49976);
        setField(term49970, term49970.getClass(), "job", term49973);
        setField(term49978, term49978.getClass(), "id", null);
        setField(term49978, term49978.getClass(), "userName", null);
        setField(term49978, term49978.getClass(), "firstName", null);
        setField(term49978, term49978.getClass(), "lastName", null);
        setField(term49978, term49978.getClass(), "password", null);
        setField(term49978, term49978.getClass(), "appliedJobs", null);
        setField(term49978, term49978.getClass(), "feedbacks", null);
        setField(term49978, term49978.getClass(), "skills", null);
        setField(term49978, term49978.getClass(), "bookmarkedJobs", null);
        setField(term49970, term49970.getClass(), "freelancer", term49978);
        setField(term49979, term49979.getClass(), "date", null);
        setField(term49979, term49979.getClass(), "time", null);
        setField(term49970, term49970.getClass(), "appliedDate", term49979);
        setField(term49970, term49970.getClass(), "coverLetter", "");
        ArrayList term49968 = new ArrayList();
        ((ArrayList) term49968).add(term49970);
        Object term49985 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term49985, term49985.getClass(), "id", null);
        setField(term49985, term49985.getClass(), "ranges", null);
        setField(term49985, term49985.getClass(), "comments", null);
        setField(term49985, term49985.getClass(), "createdBy", null);
        setField(term49985, term49985.getClass(), "createdFor", null);
        Object term49986 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term49986, term49986.getClass(), "id", null);
        setField(term49986, term49986.getClass(), "ranges", null);
        setField(term49986, term49986.getClass(), "comments", null);
        setField(term49986, term49986.getClass(), "createdBy", null);
        setField(term49986, term49986.getClass(), "createdFor", null);
        Object term49987 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term49987, term49987.getClass(), "id", null);
        setField(term49987, term49987.getClass(), "ranges", null);
        setField(term49987, term49987.getClass(), "comments", null);
        setField(term49987, term49987.getClass(), "createdBy", null);
        setField(term49987, term49987.getClass(), "createdFor", null);
        Object term49988 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term49988, term49988.getClass(), "id", null);
        setField(term49988, term49988.getClass(), "ranges", null);
        setField(term49988, term49988.getClass(), "comments", null);
        setField(term49988, term49988.getClass(), "createdBy", null);
        setField(term49988, term49988.getClass(), "createdFor", null);
        ArrayList term49983 = new ArrayList();
        ((ArrayList) term49983).add(term49985);
        ((ArrayList) term49983).add(term49986);
        ((ArrayList) term49983).add(term49985);
        ((ArrayList) term49983).add(term49987);
        ((ArrayList) term49983).add(term49988);
        Long term49994 = new Long(1225890311764636256L);
        Long term49997 = new Long(1618551564796004962L);
        Integer term49999 = new Integer(805176809);
        Object term49993 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        Object term49996 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term50001 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term49993, term49993.getClass(), "id", term49994);
        setField(term49996, term49996.getClass(), "id", term49997);
        setField(term49996, term49996.getClass(), "name", null);
        setField(term49996, term49996.getClass(), "description", null);
        setField(term49993, term49993.getClass(), "skill", term49996);
        setField(term49993, term49993.getClass(), "years", term49999);
        setField(term50001, term50001.getClass(), "id", null);
        setField(term50001, term50001.getClass(), "userName", null);
        setField(term50001, term50001.getClass(), "firstName", null);
        setField(term50001, term50001.getClass(), "lastName", null);
        setField(term50001, term50001.getClass(), "password", null);
        setField(term50001, term50001.getClass(), "appliedJobs", null);
        setField(term50001, term50001.getClass(), "feedbacks", null);
        setField(term50001, term50001.getClass(), "skills", null);
        setField(term50001, term50001.getClass(), "bookmarkedJobs", null);
        setField(term49993, term49993.getClass(), "freelancer", term50001);
        ArrayList term49991 = new ArrayList();
        ((ArrayList) term49991).add(term49993);
        Object term50006 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term50006, term50006.getClass(), "id", null);
        setField(term50006, term50006.getClass(), "skill", null);
        setField(term50006, term50006.getClass(), "job", null);
        setField(term50006, term50006.getClass(), "freelancer", null);
        Object term50007 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term50007, term50007.getClass(), "id", null);
        setField(term50007, term50007.getClass(), "skill", null);
        setField(term50007, term50007.getClass(), "job", null);
        setField(term50007, term50007.getClass(), "freelancer", null);
        Object term50008 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term50008, term50008.getClass(), "id", null);
        setField(term50008, term50008.getClass(), "skill", null);
        setField(term50008, term50008.getClass(), "job", null);
        setField(term50008, term50008.getClass(), "freelancer", null);
        ArrayList term50004 = new ArrayList();
        ((ArrayList) term50004).add(term50006);
        ((ArrayList) term50004).add(term50007);
        ((ArrayList) term50004).add(term50008);
        ((ArrayList) term50004).add(term50006);
        term49917 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term49917, term49917.getClass(), "id", term49918);
        setField(term49917, term49917.getClass(), "userName", "CpvhjniKFZ");
        setField(term49917, term49917.getClass(), "firstName", "nantHBTafl");
        setField(term49917, term49917.getClass(), "lastName", "IplLGmulHb");
        setField(term49917, term49917.getClass(), "password", "IOOirhBOLW");
        setField(term49917, term49917.getClass(), "appliedJobs", term49968);
        setField(term49917, term49917.getClass(), "feedbacks", term49983);
        setField(term49917, term49917.getClass(), "skills", term49991);
        setField(term49917, term49917.getClass(), "bookmarkedJobs", term50004);
        term50011 = new Long(7886428173666895304L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term50011;
        callMethod(klass, "setId", argTypes, term49917, args);
    }

};


