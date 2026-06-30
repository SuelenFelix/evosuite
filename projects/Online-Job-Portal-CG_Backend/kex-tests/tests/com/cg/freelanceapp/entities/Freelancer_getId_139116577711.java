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

public class Freelancer_getId_139116577711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26879;

    public Freelancer_getId_139116577711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26880 = new Long(7459242265957184087L);
        Long term26933 = new Long(-650292226426573604L);
        Long term26936 = new Long(6666616792740026161L);
        Boolean term26938 = new Boolean(true);
        Long term26941 = new Long(-1377911535187205603L);
        Object term26932 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term26935 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term26940 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term26943 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term26932, term26932.getClass(), "id", term26933);
        setField(term26935, term26935.getClass(), "id", term26936);
        setField(term26935, term26935.getClass(), "jobTitle", null);
        setField(term26935, term26935.getClass(), "jobDescription", null);
        setField(term26935, term26935.getClass(), "skill", null);
        setField(term26935, term26935.getClass(), "postedBy", null);
        setField(term26935, term26935.getClass(), "postedDate", null);
        setField(term26935, term26935.getClass(), "awardedTo", null);
        setField(term26935, term26935.getClass(), "jobApplications", null);
        setField(term26935, term26935.getClass(), "active", term26938);
        setField(term26932, term26932.getClass(), "job", term26935);
        setField(term26940, term26940.getClass(), "id", term26941);
        setField(term26940, term26940.getClass(), "userName", null);
        setField(term26940, term26940.getClass(), "firstName", null);
        setField(term26940, term26940.getClass(), "lastName", null);
        setField(term26940, term26940.getClass(), "password", null);
        setField(term26940, term26940.getClass(), "appliedJobs", null);
        setField(term26940, term26940.getClass(), "feedbacks", null);
        setField(term26940, term26940.getClass(), "skills", null);
        setField(term26940, term26940.getClass(), "bookmarkedJobs", null);
        setField(term26932, term26932.getClass(), "freelancer", term26940);
        setField(term26943, term26943.getClass(), "date", null);
        setField(term26943, term26943.getClass(), "time", null);
        setField(term26932, term26932.getClass(), "appliedDate", term26943);
        setField(term26932, term26932.getClass(), "coverLetter", "");
        Object term26945 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term26946 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term26945, term26945.getClass(), "id", null);
        setField(term26945, term26945.getClass(), "job", null);
        setField(term26945, term26945.getClass(), "freelancer", null);
        setField(term26946, term26946.getClass(), "date", null);
        setField(term26946, term26946.getClass(), "time", null);
        setField(term26945, term26945.getClass(), "appliedDate", term26946);
        setField(term26945, term26945.getClass(), "coverLetter", null);
        Object term26947 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term26948 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term26947, term26947.getClass(), "id", null);
        setField(term26947, term26947.getClass(), "job", null);
        setField(term26947, term26947.getClass(), "freelancer", null);
        setField(term26948, term26948.getClass(), "date", null);
        setField(term26948, term26948.getClass(), "time", null);
        setField(term26947, term26947.getClass(), "appliedDate", term26948);
        setField(term26947, term26947.getClass(), "coverLetter", null);
        ArrayList term26930 = new ArrayList();
        ((ArrayList) term26930).add(term26932);
        ((ArrayList) term26930).add(term26945);
        ((ArrayList) term26930).add(term26947);
        Object term26953 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term26953, term26953.getClass(), "id", null);
        setField(term26953, term26953.getClass(), "ranges", null);
        setField(term26953, term26953.getClass(), "comments", null);
        setField(term26953, term26953.getClass(), "createdBy", null);
        setField(term26953, term26953.getClass(), "createdFor", null);
        Object term26954 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term26954, term26954.getClass(), "id", null);
        setField(term26954, term26954.getClass(), "ranges", null);
        setField(term26954, term26954.getClass(), "comments", null);
        setField(term26954, term26954.getClass(), "createdBy", null);
        setField(term26954, term26954.getClass(), "createdFor", null);
        ArrayList term26951 = new ArrayList();
        ((ArrayList) term26951).add(term26953);
        ((ArrayList) term26951).add(term26954);
        Object term26959 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term26959, term26959.getClass(), "id", null);
        setField(term26959, term26959.getClass(), "skill", null);
        setField(term26959, term26959.getClass(), "years", null);
        setField(term26959, term26959.getClass(), "freelancer", null);
        Object term26960 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term26960, term26960.getClass(), "id", null);
        setField(term26960, term26960.getClass(), "skill", null);
        setField(term26960, term26960.getClass(), "years", null);
        setField(term26960, term26960.getClass(), "freelancer", null);
        Object term26961 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term26961, term26961.getClass(), "id", null);
        setField(term26961, term26961.getClass(), "skill", null);
        setField(term26961, term26961.getClass(), "years", null);
        setField(term26961, term26961.getClass(), "freelancer", null);
        Object term26962 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term26962, term26962.getClass(), "id", null);
        setField(term26962, term26962.getClass(), "skill", null);
        setField(term26962, term26962.getClass(), "years", null);
        setField(term26962, term26962.getClass(), "freelancer", null);
        Object term26963 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term26963, term26963.getClass(), "id", null);
        setField(term26963, term26963.getClass(), "skill", null);
        setField(term26963, term26963.getClass(), "years", null);
        setField(term26963, term26963.getClass(), "freelancer", null);
        Object term26964 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term26964, term26964.getClass(), "id", null);
        setField(term26964, term26964.getClass(), "skill", null);
        setField(term26964, term26964.getClass(), "years", null);
        setField(term26964, term26964.getClass(), "freelancer", null);
        Object term26965 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term26965, term26965.getClass(), "id", null);
        setField(term26965, term26965.getClass(), "skill", null);
        setField(term26965, term26965.getClass(), "years", null);
        setField(term26965, term26965.getClass(), "freelancer", null);
        Object term26966 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term26966, term26966.getClass(), "id", null);
        setField(term26966, term26966.getClass(), "skill", null);
        setField(term26966, term26966.getClass(), "years", null);
        setField(term26966, term26966.getClass(), "freelancer", null);
        ArrayList term26957 = new ArrayList();
        ((ArrayList) term26957).add(term26959);
        ((ArrayList) term26957).add(term26960);
        ((ArrayList) term26957).add(term26961);
        ((ArrayList) term26957).add(term26960);
        ((ArrayList) term26957).add(term26962);
        ((ArrayList) term26957).add(term26963);
        ((ArrayList) term26957).add(term26964);
        ((ArrayList) term26957).add(term26965);
        ((ArrayList) term26957).add(term26966);
        Object term26971 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term26971, term26971.getClass(), "id", null);
        setField(term26971, term26971.getClass(), "skill", null);
        setField(term26971, term26971.getClass(), "job", null);
        setField(term26971, term26971.getClass(), "freelancer", null);
        ArrayList term26969 = new ArrayList();
        ((ArrayList) term26969).add(term26971);
        term26879 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term26879, term26879.getClass(), "id", term26880);
        setField(term26879, term26879.getClass(), "userName", "iLylbwIxgL");
        setField(term26879, term26879.getClass(), "firstName", "GdxqsdOdeY");
        setField(term26879, term26879.getClass(), "lastName", "ZkgLXzqSzZ");
        setField(term26879, term26879.getClass(), "password", "zoketwSPjK");
        setField(term26879, term26879.getClass(), "appliedJobs", term26930);
        setField(term26879, term26879.getClass(), "feedbacks", term26951);
        setField(term26879, term26879.getClass(), "skills", term26957);
        setField(term26879, term26879.getClass(), "bookmarkedJobs", term26969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term26879, args);
    }

};


