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
import java.util.LinkedList;

public class Freelancer_setFeedbacks_66275745418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27901;
     Object term27994;

    public Freelancer_setFeedbacks_66275745418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27902 = new Long(292806100126951541L);
        Long term27955 = new Long(8210060061385705911L);
        Long term27958 = new Long(-1937271832570903690L);
        Boolean term27960 = new Boolean(true);
        Long term27963 = new Long(-4598806486146386887L);
        Object term27954 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term27957 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term27962 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term27965 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term27954, term27954.getClass(), "id", term27955);
        setField(term27957, term27957.getClass(), "id", term27958);
        setField(term27957, term27957.getClass(), "jobTitle", null);
        setField(term27957, term27957.getClass(), "jobDescription", null);
        setField(term27957, term27957.getClass(), "skill", null);
        setField(term27957, term27957.getClass(), "postedBy", null);
        setField(term27957, term27957.getClass(), "postedDate", null);
        setField(term27957, term27957.getClass(), "awardedTo", null);
        setField(term27957, term27957.getClass(), "jobApplications", null);
        setField(term27957, term27957.getClass(), "active", term27960);
        setField(term27954, term27954.getClass(), "job", term27957);
        setField(term27962, term27962.getClass(), "id", term27963);
        setField(term27962, term27962.getClass(), "userName", null);
        setField(term27962, term27962.getClass(), "firstName", null);
        setField(term27962, term27962.getClass(), "lastName", null);
        setField(term27962, term27962.getClass(), "password", null);
        setField(term27962, term27962.getClass(), "appliedJobs", null);
        setField(term27962, term27962.getClass(), "feedbacks", null);
        setField(term27962, term27962.getClass(), "skills", null);
        setField(term27962, term27962.getClass(), "bookmarkedJobs", null);
        setField(term27954, term27954.getClass(), "freelancer", term27962);
        setField(term27965, term27965.getClass(), "date", null);
        setField(term27965, term27965.getClass(), "time", null);
        setField(term27954, term27954.getClass(), "appliedDate", term27965);
        setField(term27954, term27954.getClass(), "coverLetter", "");
        Object term27967 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term27968 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term27967, term27967.getClass(), "id", null);
        setField(term27967, term27967.getClass(), "job", null);
        setField(term27967, term27967.getClass(), "freelancer", null);
        setField(term27968, term27968.getClass(), "date", null);
        setField(term27968, term27968.getClass(), "time", null);
        setField(term27967, term27967.getClass(), "appliedDate", term27968);
        setField(term27967, term27967.getClass(), "coverLetter", null);
        Object term27969 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term27970 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term27969, term27969.getClass(), "id", null);
        setField(term27969, term27969.getClass(), "job", null);
        setField(term27969, term27969.getClass(), "freelancer", null);
        setField(term27970, term27970.getClass(), "date", null);
        setField(term27970, term27970.getClass(), "time", null);
        setField(term27969, term27969.getClass(), "appliedDate", term27970);
        setField(term27969, term27969.getClass(), "coverLetter", null);
        ArrayList term27952 = new ArrayList();
        ((ArrayList) term27952).add(term27954);
        ((ArrayList) term27952).add(term27967);
        ((ArrayList) term27952).add(term27969);
        Object term27975 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term27975, term27975.getClass(), "id", null);
        setField(term27975, term27975.getClass(), "ranges", null);
        setField(term27975, term27975.getClass(), "comments", null);
        setField(term27975, term27975.getClass(), "createdBy", null);
        setField(term27975, term27975.getClass(), "createdFor", null);
        Object term27976 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term27976, term27976.getClass(), "id", null);
        setField(term27976, term27976.getClass(), "ranges", null);
        setField(term27976, term27976.getClass(), "comments", null);
        setField(term27976, term27976.getClass(), "createdBy", null);
        setField(term27976, term27976.getClass(), "createdFor", null);
        Object term27977 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term27977, term27977.getClass(), "id", null);
        setField(term27977, term27977.getClass(), "ranges", null);
        setField(term27977, term27977.getClass(), "comments", null);
        setField(term27977, term27977.getClass(), "createdBy", null);
        setField(term27977, term27977.getClass(), "createdFor", null);
        ArrayList term27973 = new ArrayList();
        ((ArrayList) term27973).add(term27975);
        ((ArrayList) term27973).add(term27976);
        ((ArrayList) term27973).add(term27975);
        ((ArrayList) term27973).add(term27976);
        ((ArrayList) term27973).add(term27976);
        ((ArrayList) term27973).add(term27977);
        ArrayList term27980 = new ArrayList();
        Object term27986 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term27986, term27986.getClass(), "id", null);
        setField(term27986, term27986.getClass(), "skill", null);
        setField(term27986, term27986.getClass(), "job", null);
        setField(term27986, term27986.getClass(), "freelancer", null);
        Object term27987 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term27987, term27987.getClass(), "id", null);
        setField(term27987, term27987.getClass(), "skill", null);
        setField(term27987, term27987.getClass(), "job", null);
        setField(term27987, term27987.getClass(), "freelancer", null);
        Object term27988 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term27988, term27988.getClass(), "id", null);
        setField(term27988, term27988.getClass(), "skill", null);
        setField(term27988, term27988.getClass(), "job", null);
        setField(term27988, term27988.getClass(), "freelancer", null);
        Object term27989 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term27989, term27989.getClass(), "id", null);
        setField(term27989, term27989.getClass(), "skill", null);
        setField(term27989, term27989.getClass(), "job", null);
        setField(term27989, term27989.getClass(), "freelancer", null);
        Object term27990 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term27990, term27990.getClass(), "id", null);
        setField(term27990, term27990.getClass(), "skill", null);
        setField(term27990, term27990.getClass(), "job", null);
        setField(term27990, term27990.getClass(), "freelancer", null);
        Object term27991 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term27991, term27991.getClass(), "id", null);
        setField(term27991, term27991.getClass(), "skill", null);
        setField(term27991, term27991.getClass(), "job", null);
        setField(term27991, term27991.getClass(), "freelancer", null);
        ArrayList term27984 = new ArrayList();
        ((ArrayList) term27984).add(term27986);
        ((ArrayList) term27984).add(term27987);
        ((ArrayList) term27984).add(term27988);
        ((ArrayList) term27984).add(term27989);
        ((ArrayList) term27984).add(term27986);
        ((ArrayList) term27984).add(term27988);
        ((ArrayList) term27984).add(term27989);
        ((ArrayList) term27984).add(term27990);
        ((ArrayList) term27984).add(term27991);
        term27901 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term27901, term27901.getClass(), "id", term27902);
        setField(term27901, term27901.getClass(), "userName", "TDwsNJKaql");
        setField(term27901, term27901.getClass(), "firstName", "OuxgUlcbAs");
        setField(term27901, term27901.getClass(), "lastName", "ZTSRAqJUkK");
        setField(term27901, term27901.getClass(), "password", "hnHAGEsrzw");
        setField(term27901, term27901.getClass(), "appliedJobs", term27952);
        setField(term27901, term27901.getClass(), "feedbacks", term27973);
        setField(term27901, term27901.getClass(), "skills", term27980);
        setField(term27901, term27901.getClass(), "bookmarkedJobs", term27984);
        term27994 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term27994;
        callMethod(klass, "setFeedbacks", argTypes, term27901, args);
    }

};


