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

public class Freelancer_getLastName_212089179812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27014;

    public Freelancer_getLastName_212089179812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27015 = new Long(5086155553765900107L);
        Long term27068 = new Long(702321277312675442L);
        Long term27071 = new Long(-4022765571441236178L);
        Boolean term27073 = new Boolean(false);
        Long term27076 = new Long(-7535007912999518533L);
        Object term27067 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term27070 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term27075 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term27078 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term27067, term27067.getClass(), "id", term27068);
        setField(term27070, term27070.getClass(), "id", term27071);
        setField(term27070, term27070.getClass(), "jobTitle", null);
        setField(term27070, term27070.getClass(), "jobDescription", null);
        setField(term27070, term27070.getClass(), "skill", null);
        setField(term27070, term27070.getClass(), "postedBy", null);
        setField(term27070, term27070.getClass(), "postedDate", null);
        setField(term27070, term27070.getClass(), "awardedTo", null);
        setField(term27070, term27070.getClass(), "jobApplications", null);
        setField(term27070, term27070.getClass(), "active", term27073);
        setField(term27067, term27067.getClass(), "job", term27070);
        setField(term27075, term27075.getClass(), "id", term27076);
        setField(term27075, term27075.getClass(), "userName", null);
        setField(term27075, term27075.getClass(), "firstName", null);
        setField(term27075, term27075.getClass(), "lastName", null);
        setField(term27075, term27075.getClass(), "password", null);
        setField(term27075, term27075.getClass(), "appliedJobs", null);
        setField(term27075, term27075.getClass(), "feedbacks", null);
        setField(term27075, term27075.getClass(), "skills", null);
        setField(term27075, term27075.getClass(), "bookmarkedJobs", null);
        setField(term27067, term27067.getClass(), "freelancer", term27075);
        setField(term27078, term27078.getClass(), "date", null);
        setField(term27078, term27078.getClass(), "time", null);
        setField(term27067, term27067.getClass(), "appliedDate", term27078);
        setField(term27067, term27067.getClass(), "coverLetter", "");
        Object term27080 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term27081 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term27080, term27080.getClass(), "id", null);
        setField(term27080, term27080.getClass(), "job", null);
        setField(term27080, term27080.getClass(), "freelancer", null);
        setField(term27081, term27081.getClass(), "date", null);
        setField(term27081, term27081.getClass(), "time", null);
        setField(term27080, term27080.getClass(), "appliedDate", term27081);
        setField(term27080, term27080.getClass(), "coverLetter", null);
        Object term27082 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term27083 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term27082, term27082.getClass(), "id", null);
        setField(term27082, term27082.getClass(), "job", null);
        setField(term27082, term27082.getClass(), "freelancer", null);
        setField(term27083, term27083.getClass(), "date", null);
        setField(term27083, term27083.getClass(), "time", null);
        setField(term27082, term27082.getClass(), "appliedDate", term27083);
        setField(term27082, term27082.getClass(), "coverLetter", null);
        ArrayList term27065 = new ArrayList();
        ((ArrayList) term27065).add(term27067);
        ((ArrayList) term27065).add(term27080);
        ((ArrayList) term27065).add(term27082);
        ((ArrayList) term27065).add(term27067);
        Object term27088 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term27088, term27088.getClass(), "id", null);
        setField(term27088, term27088.getClass(), "ranges", null);
        setField(term27088, term27088.getClass(), "comments", null);
        setField(term27088, term27088.getClass(), "createdBy", null);
        setField(term27088, term27088.getClass(), "createdFor", null);
        Object term27089 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term27089, term27089.getClass(), "id", null);
        setField(term27089, term27089.getClass(), "ranges", null);
        setField(term27089, term27089.getClass(), "comments", null);
        setField(term27089, term27089.getClass(), "createdBy", null);
        setField(term27089, term27089.getClass(), "createdFor", null);
        Object term27090 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term27090, term27090.getClass(), "id", null);
        setField(term27090, term27090.getClass(), "ranges", null);
        setField(term27090, term27090.getClass(), "comments", null);
        setField(term27090, term27090.getClass(), "createdBy", null);
        setField(term27090, term27090.getClass(), "createdFor", null);
        Object term27091 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term27091, term27091.getClass(), "id", null);
        setField(term27091, term27091.getClass(), "ranges", null);
        setField(term27091, term27091.getClass(), "comments", null);
        setField(term27091, term27091.getClass(), "createdBy", null);
        setField(term27091, term27091.getClass(), "createdFor", null);
        Object term27092 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term27092, term27092.getClass(), "id", null);
        setField(term27092, term27092.getClass(), "ranges", null);
        setField(term27092, term27092.getClass(), "comments", null);
        setField(term27092, term27092.getClass(), "createdBy", null);
        setField(term27092, term27092.getClass(), "createdFor", null);
        ArrayList term27086 = new ArrayList();
        ((ArrayList) term27086).add(term27088);
        ((ArrayList) term27086).add(term27089);
        ((ArrayList) term27086).add(term27090);
        ((ArrayList) term27086).add(term27091);
        ((ArrayList) term27086).add(term27091);
        ((ArrayList) term27086).add(term27092);
        Object term27097 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term27097, term27097.getClass(), "id", null);
        setField(term27097, term27097.getClass(), "skill", null);
        setField(term27097, term27097.getClass(), "years", null);
        setField(term27097, term27097.getClass(), "freelancer", null);
        Object term27098 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term27098, term27098.getClass(), "id", null);
        setField(term27098, term27098.getClass(), "skill", null);
        setField(term27098, term27098.getClass(), "years", null);
        setField(term27098, term27098.getClass(), "freelancer", null);
        Long term27100 = new Long(-1557774302244970809L);
        Long term27103 = new Long(8311133892224081946L);
        Integer term27105 = new Integer(-1368173231);
        Long term27108 = new Long(-9001085857985006197L);
        Object term27099 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        Object term27102 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term27107 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term27099, term27099.getClass(), "id", term27100);
        setField(term27102, term27102.getClass(), "id", term27103);
        setField(term27102, term27102.getClass(), "name", null);
        setField(term27102, term27102.getClass(), "description", null);
        setField(term27099, term27099.getClass(), "skill", term27102);
        setField(term27099, term27099.getClass(), "years", term27105);
        setField(term27107, term27107.getClass(), "id", term27108);
        setField(term27107, term27107.getClass(), "userName", null);
        setField(term27107, term27107.getClass(), "firstName", null);
        setField(term27107, term27107.getClass(), "lastName", null);
        setField(term27107, term27107.getClass(), "password", null);
        setField(term27107, term27107.getClass(), "appliedJobs", null);
        setField(term27107, term27107.getClass(), "feedbacks", null);
        setField(term27107, term27107.getClass(), "skills", null);
        setField(term27107, term27107.getClass(), "bookmarkedJobs", null);
        setField(term27099, term27099.getClass(), "freelancer", term27107);
        Object term27110 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term27110, term27110.getClass(), "id", null);
        setField(term27110, term27110.getClass(), "skill", null);
        setField(term27110, term27110.getClass(), "years", null);
        setField(term27110, term27110.getClass(), "freelancer", null);
        ArrayList term27095 = new ArrayList();
        ((ArrayList) term27095).add(term27097);
        ((ArrayList) term27095).add(term27098);
        ((ArrayList) term27095).add(term27098);
        ((ArrayList) term27095).add(term27099);
        ((ArrayList) term27095).add(term27110);
        ArrayList term27113 = new ArrayList();
        term27014 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term27014, term27014.getClass(), "id", term27015);
        setField(term27014, term27014.getClass(), "userName", "CnRIdcAMwJ");
        setField(term27014, term27014.getClass(), "firstName", "hVsgDLbwcE");
        setField(term27014, term27014.getClass(), "lastName", "CBdRPBQREL");
        setField(term27014, term27014.getClass(), "password", "vJNoxagfjT");
        setField(term27014, term27014.getClass(), "appliedJobs", term27065);
        setField(term27014, term27014.getClass(), "feedbacks", term27086);
        setField(term27014, term27014.getClass(), "skills", term27095);
        setField(term27014, term27014.getClass(), "bookmarkedJobs", term27113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term27014, args);
    }

};


