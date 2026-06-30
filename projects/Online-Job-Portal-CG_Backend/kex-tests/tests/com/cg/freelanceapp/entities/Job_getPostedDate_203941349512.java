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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Boolean;

public class Job_getPostedDate_203941349512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5863;

    public Job_getPostedDate_203941349512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5864 = new Long(-1721083210597101555L);
        Long term5891 = new Long(937792282597213200L);
        Long term5918 = new Long(-6096027338784768449L);
        ArrayList term5968 = new ArrayList();
        Long term5975 = new Long(6338971839666144092L);
        Integer term5977 = new Integer(-268815336);
        Object term5974 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term5974, term5974.getClass(), "id", term5975);
        setField(term5974, term5974.getClass(), "ranges", term5977);
        setField(term5974, term5974.getClass(), "comments", null);
        setField(term5974, term5974.getClass(), "createdBy", null);
        setField(term5974, term5974.getClass(), "createdFor", null);
        Object term5979 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term5979, term5979.getClass(), "id", null);
        setField(term5979, term5979.getClass(), "ranges", null);
        setField(term5979, term5979.getClass(), "comments", null);
        setField(term5979, term5979.getClass(), "createdBy", null);
        setField(term5979, term5979.getClass(), "createdFor", null);
        Object term5980 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term5980, term5980.getClass(), "id", null);
        setField(term5980, term5980.getClass(), "ranges", null);
        setField(term5980, term5980.getClass(), "comments", null);
        setField(term5980, term5980.getClass(), "createdBy", null);
        setField(term5980, term5980.getClass(), "createdFor", null);
        ArrayList term5972 = new ArrayList();
        ((ArrayList) term5972).add(term5974);
        ((ArrayList) term5972).add(term5979);
        ((ArrayList) term5972).add(term5980);
        Long term5986 = new Long(-6523933176535405885L);
        Object term5985 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedFreelancer"));
        setField(term5985, term5985.getClass(), "id", term5986);
        setField(term5985, term5985.getClass(), "freelancer", null);
        setField(term5985, term5985.getClass(), "bookmarkedBy", null);
        Object term5988 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedFreelancer"));
        setField(term5988, term5988.getClass(), "id", null);
        setField(term5988, term5988.getClass(), "freelancer", null);
        setField(term5988, term5988.getClass(), "bookmarkedBy", null);
        Object term5989 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedFreelancer"));
        setField(term5989, term5989.getClass(), "id", null);
        setField(term5989, term5989.getClass(), "freelancer", null);
        setField(term5989, term5989.getClass(), "bookmarkedBy", null);
        Object term5990 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedFreelancer"));
        setField(term5990, term5990.getClass(), "id", null);
        setField(term5990, term5990.getClass(), "freelancer", null);
        setField(term5990, term5990.getClass(), "bookmarkedBy", null);
        Object term5991 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedFreelancer"));
        setField(term5991, term5991.getClass(), "id", null);
        setField(term5991, term5991.getClass(), "freelancer", null);
        setField(term5991, term5991.getClass(), "bookmarkedBy", null);
        ArrayList term5983 = new ArrayList();
        ((ArrayList) term5983).add(term5985);
        ((ArrayList) term5983).add(term5988);
        ((ArrayList) term5983).add(term5989);
        ((ArrayList) term5983).add(term5985);
        ((ArrayList) term5983).add(term5990);
        ((ArrayList) term5983).add(term5991);
        Long term5999 = new Long(165312735504471081L);
        ArrayList term6049 = new ArrayList();
        Object term6055 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term6055, term6055.getClass(), "id", null);
        setField(term6055, term6055.getClass(), "ranges", null);
        setField(term6055, term6055.getClass(), "comments", null);
        setField(term6055, term6055.getClass(), "createdBy", null);
        setField(term6055, term6055.getClass(), "createdFor", null);
        Object term6056 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term6056, term6056.getClass(), "id", null);
        setField(term6056, term6056.getClass(), "ranges", null);
        setField(term6056, term6056.getClass(), "comments", null);
        setField(term6056, term6056.getClass(), "createdBy", null);
        setField(term6056, term6056.getClass(), "createdFor", null);
        Object term6057 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term6057, term6057.getClass(), "id", null);
        setField(term6057, term6057.getClass(), "ranges", null);
        setField(term6057, term6057.getClass(), "comments", null);
        setField(term6057, term6057.getClass(), "createdBy", null);
        setField(term6057, term6057.getClass(), "createdFor", null);
        ArrayList term6053 = new ArrayList();
        ((ArrayList) term6053).add(term6055);
        ((ArrayList) term6053).add(term6056);
        ((ArrayList) term6053).add(term5979);
        ((ArrayList) term6053).add(term6057);
        Object term6062 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term6062, term6062.getClass(), "id", null);
        setField(term6062, term6062.getClass(), "skill", null);
        setField(term6062, term6062.getClass(), "years", null);
        setField(term6062, term6062.getClass(), "freelancer", null);
        ArrayList term6060 = new ArrayList();
        ((ArrayList) term6060).add(term6062);
        Object term6067 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term6067, term6067.getClass(), "id", null);
        setField(term6067, term6067.getClass(), "skill", null);
        setField(term6067, term6067.getClass(), "job", null);
        setField(term6067, term6067.getClass(), "freelancer", null);
        Object term6068 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term6068, term6068.getClass(), "id", null);
        setField(term6068, term6068.getClass(), "skill", null);
        setField(term6068, term6068.getClass(), "job", null);
        setField(term6068, term6068.getClass(), "freelancer", null);
        Object term6069 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term6069, term6069.getClass(), "id", null);
        setField(term6069, term6069.getClass(), "skill", null);
        setField(term6069, term6069.getClass(), "job", null);
        setField(term6069, term6069.getClass(), "freelancer", null);
        ArrayList term6065 = new ArrayList();
        ((ArrayList) term6065).add(term6067);
        ((ArrayList) term6065).add(term6068);
        ((ArrayList) term6065).add(term6069);
        Object term6074 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term6075 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term6074, term6074.getClass(), "id", null);
        setField(term6074, term6074.getClass(), "job", null);
        setField(term6074, term6074.getClass(), "freelancer", null);
        setField(term6075, term6075.getClass(), "date", null);
        setField(term6075, term6075.getClass(), "time", null);
        setField(term6074, term6074.getClass(), "appliedDate", term6075);
        setField(term6074, term6074.getClass(), "coverLetter", null);
        ArrayList term6072 = new ArrayList();
        ((ArrayList) term6072).add(term6074);
        Boolean term6078 = new Boolean(false);
        term5863 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term5890 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term5917 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term5994 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5998 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term5863, term5863.getClass(), "id", term5864);
        setField(term5863, term5863.getClass(), "jobTitle", "UgvuvUxKed");
        setField(term5863, term5863.getClass(), "jobDescription", "ljBBMsQpaM");
        setField(term5890, term5890.getClass(), "id", term5891);
        setField(term5890, term5890.getClass(), "name", "hHNIOlOzJc");
        setField(term5890, term5890.getClass(), "description", "ALRSeULyWV");
        setField(term5863, term5863.getClass(), "skill", term5890);
        setField(term5917, term5917.getClass(), "id", term5918);
        setField(term5917, term5917.getClass(), "userName", "WVhzXHdyFF");
        setField(term5917, term5917.getClass(), "firstName", "GLAWYoxkyw");
        setField(term5917, term5917.getClass(), "lastName", "cfpPTNNVnW");
        setField(term5917, term5917.getClass(), "password", "VPkEFShMUB");
        setField(term5917, term5917.getClass(), "postedJobs", term5968);
        setField(term5917, term5917.getClass(), "feedbacks", term5972);
        setField(term5917, term5917.getClass(), "freelancers", term5983);
        setField(term5863, term5863.getClass(), "postedBy", term5917);
        setIntField(term5994, term5994.getClass(), "year", 2026);
        setShortField(term5994, term5994.getClass(), "month", (short) 6);
        setShortField(term5994, term5994.getClass(), "day", (short) 29);
        setField(term5863, term5863.getClass(), "postedDate", term5994);
        setField(term5998, term5998.getClass(), "id", term5999);
        setField(term5998, term5998.getClass(), "userName", "SSqIrPwJXd");
        setField(term5998, term5998.getClass(), "firstName", "jAxYagPvcV");
        setField(term5998, term5998.getClass(), "lastName", "ZXLgGUqgyW");
        setField(term5998, term5998.getClass(), "password", "PdeSzTcBgY");
        setField(term5998, term5998.getClass(), "appliedJobs", term6049);
        setField(term5998, term5998.getClass(), "feedbacks", term6053);
        setField(term5998, term5998.getClass(), "skills", term6060);
        setField(term5998, term5998.getClass(), "bookmarkedJobs", term6065);
        setField(term5863, term5863.getClass(), "awardedTo", term5998);
        setField(term5863, term5863.getClass(), "jobApplications", term6072);
        setField(term5863, term5863.getClass(), "active", term6078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPostedDate", argTypes, term5863, args);
    }

};


