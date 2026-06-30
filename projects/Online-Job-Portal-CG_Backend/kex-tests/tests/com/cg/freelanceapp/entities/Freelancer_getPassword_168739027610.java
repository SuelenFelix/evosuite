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

public class Freelancer_getPassword_168739027610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48891;

    public Freelancer_getPassword_168739027610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term48892 = new Long(4720708725577833050L);
        Long term48945 = new Long(-3565222130882328172L);
        Long term48948 = new Long(8512315473040189557L);
        Boolean term48950 = new Boolean(true);
        Long term48953 = new Long(-3184779567383070184L);
        Object term48944 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term48947 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term48952 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term48955 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term48944, term48944.getClass(), "id", term48945);
        setField(term48947, term48947.getClass(), "id", term48948);
        setField(term48947, term48947.getClass(), "jobTitle", null);
        setField(term48947, term48947.getClass(), "jobDescription", null);
        setField(term48947, term48947.getClass(), "skill", null);
        setField(term48947, term48947.getClass(), "postedBy", null);
        setField(term48947, term48947.getClass(), "postedDate", null);
        setField(term48947, term48947.getClass(), "awardedTo", null);
        setField(term48947, term48947.getClass(), "jobApplications", null);
        setField(term48947, term48947.getClass(), "active", term48950);
        setField(term48944, term48944.getClass(), "job", term48947);
        setField(term48952, term48952.getClass(), "id", term48953);
        setField(term48952, term48952.getClass(), "userName", null);
        setField(term48952, term48952.getClass(), "firstName", null);
        setField(term48952, term48952.getClass(), "lastName", null);
        setField(term48952, term48952.getClass(), "password", null);
        setField(term48952, term48952.getClass(), "appliedJobs", null);
        setField(term48952, term48952.getClass(), "feedbacks", null);
        setField(term48952, term48952.getClass(), "skills", null);
        setField(term48952, term48952.getClass(), "bookmarkedJobs", null);
        setField(term48944, term48944.getClass(), "freelancer", term48952);
        setField(term48955, term48955.getClass(), "date", null);
        setField(term48955, term48955.getClass(), "time", null);
        setField(term48944, term48944.getClass(), "appliedDate", term48955);
        setField(term48944, term48944.getClass(), "coverLetter", "");
        Object term48957 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term48958 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term48957, term48957.getClass(), "id", null);
        setField(term48957, term48957.getClass(), "job", null);
        setField(term48957, term48957.getClass(), "freelancer", null);
        setField(term48958, term48958.getClass(), "date", null);
        setField(term48958, term48958.getClass(), "time", null);
        setField(term48957, term48957.getClass(), "appliedDate", term48958);
        setField(term48957, term48957.getClass(), "coverLetter", null);
        Object term48959 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term48960 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term48959, term48959.getClass(), "id", null);
        setField(term48959, term48959.getClass(), "job", null);
        setField(term48959, term48959.getClass(), "freelancer", null);
        setField(term48960, term48960.getClass(), "date", null);
        setField(term48960, term48960.getClass(), "time", null);
        setField(term48959, term48959.getClass(), "appliedDate", term48960);
        setField(term48959, term48959.getClass(), "coverLetter", null);
        ArrayList term48942 = new ArrayList();
        ((ArrayList) term48942).add(term48944);
        ((ArrayList) term48942).add(term48957);
        ((ArrayList) term48942).add(term48957);
        ((ArrayList) term48942).add(term48944);
        ((ArrayList) term48942).add(term48959);
        ((ArrayList) term48942).add(term48957);
        ((ArrayList) term48942).add(term48944);
        Object term48965 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term48965, term48965.getClass(), "id", null);
        setField(term48965, term48965.getClass(), "ranges", null);
        setField(term48965, term48965.getClass(), "comments", null);
        setField(term48965, term48965.getClass(), "createdBy", null);
        setField(term48965, term48965.getClass(), "createdFor", null);
        Object term48966 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term48966, term48966.getClass(), "id", null);
        setField(term48966, term48966.getClass(), "ranges", null);
        setField(term48966, term48966.getClass(), "comments", null);
        setField(term48966, term48966.getClass(), "createdBy", null);
        setField(term48966, term48966.getClass(), "createdFor", null);
        Object term48967 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term48967, term48967.getClass(), "id", null);
        setField(term48967, term48967.getClass(), "ranges", null);
        setField(term48967, term48967.getClass(), "comments", null);
        setField(term48967, term48967.getClass(), "createdBy", null);
        setField(term48967, term48967.getClass(), "createdFor", null);
        ArrayList term48963 = new ArrayList();
        ((ArrayList) term48963).add(term48965);
        ((ArrayList) term48963).add(term48966);
        ((ArrayList) term48963).add(term48965);
        ((ArrayList) term48963).add(term48967);
        ArrayList term48970 = new ArrayList();
        Object term48976 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term48976, term48976.getClass(), "id", null);
        setField(term48976, term48976.getClass(), "skill", null);
        setField(term48976, term48976.getClass(), "job", null);
        setField(term48976, term48976.getClass(), "freelancer", null);
        Object term48977 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term48977, term48977.getClass(), "id", null);
        setField(term48977, term48977.getClass(), "skill", null);
        setField(term48977, term48977.getClass(), "job", null);
        setField(term48977, term48977.getClass(), "freelancer", null);
        Object term48978 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term48978, term48978.getClass(), "id", null);
        setField(term48978, term48978.getClass(), "skill", null);
        setField(term48978, term48978.getClass(), "job", null);
        setField(term48978, term48978.getClass(), "freelancer", null);
        ArrayList term48974 = new ArrayList();
        ((ArrayList) term48974).add(term48976);
        ((ArrayList) term48974).add(term48977);
        ((ArrayList) term48974).add(term48978);
        ((ArrayList) term48974).add(term48977);
        ((ArrayList) term48974).add(term48977);
        term48891 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term48891, term48891.getClass(), "id", term48892);
        setField(term48891, term48891.getClass(), "userName", "luuujjjCiB");
        setField(term48891, term48891.getClass(), "firstName", "NmhbsBItoX");
        setField(term48891, term48891.getClass(), "lastName", "mhLgHXafNK");
        setField(term48891, term48891.getClass(), "password", "CTpcEYMWUA");
        setField(term48891, term48891.getClass(), "appliedJobs", term48942);
        setField(term48891, term48891.getClass(), "feedbacks", term48963);
        setField(term48891, term48891.getClass(), "skills", term48970);
        setField(term48891, term48891.getClass(), "bookmarkedJobs", term48974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term48891, args);
    }

};


