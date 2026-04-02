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

public class Freelancer_setAppliedJobs_25288093716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27517;
     Object term27611;

    public Freelancer_setAppliedJobs_25288093716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27518 = new Long(-6620150753372646285L);
        Long term27571 = new Long(1852152909570858002L);
        Long term27574 = new Long(-7508661649392926519L);
        Boolean term27576 = new Boolean(true);
        Long term27579 = new Long(-6617910489517703572L);
        Object term27570 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term27573 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term27578 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term27581 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term27570, term27570.getClass(), "id", term27571);
        setField(term27573, term27573.getClass(), "id", term27574);
        setField(term27573, term27573.getClass(), "jobTitle", null);
        setField(term27573, term27573.getClass(), "jobDescription", null);
        setField(term27573, term27573.getClass(), "skill", null);
        setField(term27573, term27573.getClass(), "postedBy", null);
        setField(term27573, term27573.getClass(), "postedDate", null);
        setField(term27573, term27573.getClass(), "awardedTo", null);
        setField(term27573, term27573.getClass(), "jobApplications", null);
        setField(term27573, term27573.getClass(), "active", term27576);
        setField(term27570, term27570.getClass(), "job", term27573);
        setField(term27578, term27578.getClass(), "id", term27579);
        setField(term27578, term27578.getClass(), "userName", null);
        setField(term27578, term27578.getClass(), "firstName", null);
        setField(term27578, term27578.getClass(), "lastName", null);
        setField(term27578, term27578.getClass(), "password", null);
        setField(term27578, term27578.getClass(), "appliedJobs", null);
        setField(term27578, term27578.getClass(), "feedbacks", null);
        setField(term27578, term27578.getClass(), "skills", null);
        setField(term27578, term27578.getClass(), "bookmarkedJobs", null);
        setField(term27570, term27570.getClass(), "freelancer", term27578);
        setField(term27581, term27581.getClass(), "date", null);
        setField(term27581, term27581.getClass(), "time", null);
        setField(term27570, term27570.getClass(), "appliedDate", term27581);
        setField(term27570, term27570.getClass(), "coverLetter", "");
        Object term27583 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term27584 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term27583, term27583.getClass(), "id", null);
        setField(term27583, term27583.getClass(), "job", null);
        setField(term27583, term27583.getClass(), "freelancer", null);
        setField(term27584, term27584.getClass(), "date", null);
        setField(term27584, term27584.getClass(), "time", null);
        setField(term27583, term27583.getClass(), "appliedDate", term27584);
        setField(term27583, term27583.getClass(), "coverLetter", null);
        Object term27585 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term27586 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term27585, term27585.getClass(), "id", null);
        setField(term27585, term27585.getClass(), "job", null);
        setField(term27585, term27585.getClass(), "freelancer", null);
        setField(term27586, term27586.getClass(), "date", null);
        setField(term27586, term27586.getClass(), "time", null);
        setField(term27585, term27585.getClass(), "appliedDate", term27586);
        setField(term27585, term27585.getClass(), "coverLetter", null);
        Object term27587 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term27588 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term27587, term27587.getClass(), "id", null);
        setField(term27587, term27587.getClass(), "job", null);
        setField(term27587, term27587.getClass(), "freelancer", null);
        setField(term27588, term27588.getClass(), "date", null);
        setField(term27588, term27588.getClass(), "time", null);
        setField(term27587, term27587.getClass(), "appliedDate", term27588);
        setField(term27587, term27587.getClass(), "coverLetter", null);
        ArrayList term27568 = new ArrayList();
        ((ArrayList) term27568).add(term27570);
        ((ArrayList) term27568).add(term27583);
        ((ArrayList) term27568).add(term27585);
        ((ArrayList) term27568).add(term27587);
        ((ArrayList) term27568).add(term27585);
        ((ArrayList) term27568).add(term27570);
        Object term27593 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term27593, term27593.getClass(), "id", null);
        setField(term27593, term27593.getClass(), "ranges", null);
        setField(term27593, term27593.getClass(), "comments", null);
        setField(term27593, term27593.getClass(), "createdBy", null);
        setField(term27593, term27593.getClass(), "createdFor", null);
        ArrayList term27591 = new ArrayList();
        ((ArrayList) term27591).add(term27593);
        Object term27598 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term27598, term27598.getClass(), "id", null);
        setField(term27598, term27598.getClass(), "skill", null);
        setField(term27598, term27598.getClass(), "years", null);
        setField(term27598, term27598.getClass(), "freelancer", null);
        Object term27599 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term27599, term27599.getClass(), "id", null);
        setField(term27599, term27599.getClass(), "skill", null);
        setField(term27599, term27599.getClass(), "years", null);
        setField(term27599, term27599.getClass(), "freelancer", null);
        Object term27600 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term27600, term27600.getClass(), "id", null);
        setField(term27600, term27600.getClass(), "skill", null);
        setField(term27600, term27600.getClass(), "years", null);
        setField(term27600, term27600.getClass(), "freelancer", null);
        Object term27601 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term27601, term27601.getClass(), "id", null);
        setField(term27601, term27601.getClass(), "skill", null);
        setField(term27601, term27601.getClass(), "years", null);
        setField(term27601, term27601.getClass(), "freelancer", null);
        Object term27602 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term27602, term27602.getClass(), "id", null);
        setField(term27602, term27602.getClass(), "skill", null);
        setField(term27602, term27602.getClass(), "years", null);
        setField(term27602, term27602.getClass(), "freelancer", null);
        Object term27603 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term27603, term27603.getClass(), "id", null);
        setField(term27603, term27603.getClass(), "skill", null);
        setField(term27603, term27603.getClass(), "years", null);
        setField(term27603, term27603.getClass(), "freelancer", null);
        Object term27604 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term27604, term27604.getClass(), "id", null);
        setField(term27604, term27604.getClass(), "skill", null);
        setField(term27604, term27604.getClass(), "years", null);
        setField(term27604, term27604.getClass(), "freelancer", null);
        ArrayList term27596 = new ArrayList();
        ((ArrayList) term27596).add(term27598);
        ((ArrayList) term27596).add(term27599);
        ((ArrayList) term27596).add(term27600);
        ((ArrayList) term27596).add(term27601);
        ((ArrayList) term27596).add(term27602);
        ((ArrayList) term27596).add(term27603);
        ((ArrayList) term27596).add(term27604);
        ((ArrayList) term27596).add(term27599);
        ArrayList term27607 = new ArrayList();
        term27517 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term27517, term27517.getClass(), "id", term27518);
        setField(term27517, term27517.getClass(), "userName", "GsImRxMdRi");
        setField(term27517, term27517.getClass(), "firstName", "RLnxTNAFPq");
        setField(term27517, term27517.getClass(), "lastName", "miSpbnDlto");
        setField(term27517, term27517.getClass(), "password", "iRmuWkEEGn");
        setField(term27517, term27517.getClass(), "appliedJobs", term27568);
        setField(term27517, term27517.getClass(), "feedbacks", term27591);
        setField(term27517, term27517.getClass(), "skills", term27596);
        setField(term27517, term27517.getClass(), "bookmarkedJobs", term27607);
        term27611 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term27611;
        callMethod(klass, "setAppliedJobs", argTypes, term27517, args);
    }

};


