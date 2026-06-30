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

public class Freelancer_getAppliedJobs_11730294815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26293;

    public Freelancer_getAppliedJobs_11730294815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26294 = new Long(-8807920657748272707L);
        Long term26347 = new Long(-5145493255578520084L);
        Long term26350 = new Long(-3030102582715798903L);
        Boolean term26352 = new Boolean(true);
        Long term26355 = new Long(3768946271590447122L);
        Object term26346 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term26349 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term26354 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term26357 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term26346, term26346.getClass(), "id", term26347);
        setField(term26349, term26349.getClass(), "id", term26350);
        setField(term26349, term26349.getClass(), "jobTitle", null);
        setField(term26349, term26349.getClass(), "jobDescription", null);
        setField(term26349, term26349.getClass(), "skill", null);
        setField(term26349, term26349.getClass(), "postedBy", null);
        setField(term26349, term26349.getClass(), "postedDate", null);
        setField(term26349, term26349.getClass(), "awardedTo", null);
        setField(term26349, term26349.getClass(), "jobApplications", null);
        setField(term26349, term26349.getClass(), "active", term26352);
        setField(term26346, term26346.getClass(), "job", term26349);
        setField(term26354, term26354.getClass(), "id", term26355);
        setField(term26354, term26354.getClass(), "userName", null);
        setField(term26354, term26354.getClass(), "firstName", null);
        setField(term26354, term26354.getClass(), "lastName", null);
        setField(term26354, term26354.getClass(), "password", null);
        setField(term26354, term26354.getClass(), "appliedJobs", null);
        setField(term26354, term26354.getClass(), "feedbacks", null);
        setField(term26354, term26354.getClass(), "skills", null);
        setField(term26354, term26354.getClass(), "bookmarkedJobs", null);
        setField(term26346, term26346.getClass(), "freelancer", term26354);
        setField(term26357, term26357.getClass(), "date", null);
        setField(term26357, term26357.getClass(), "time", null);
        setField(term26346, term26346.getClass(), "appliedDate", term26357);
        setField(term26346, term26346.getClass(), "coverLetter", "");
        Long term26360 = new Long(5044780614134795929L);
        Object term26359 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term26362 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term26363 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term26364 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term26359, term26359.getClass(), "id", term26360);
        setField(term26362, term26362.getClass(), "id", null);
        setField(term26362, term26362.getClass(), "jobTitle", null);
        setField(term26362, term26362.getClass(), "jobDescription", null);
        setField(term26362, term26362.getClass(), "skill", null);
        setField(term26362, term26362.getClass(), "postedBy", null);
        setField(term26362, term26362.getClass(), "postedDate", null);
        setField(term26362, term26362.getClass(), "awardedTo", null);
        setField(term26362, term26362.getClass(), "jobApplications", null);
        setField(term26362, term26362.getClass(), "active", null);
        setField(term26359, term26359.getClass(), "job", term26362);
        setField(term26363, term26363.getClass(), "id", null);
        setField(term26363, term26363.getClass(), "userName", null);
        setField(term26363, term26363.getClass(), "firstName", null);
        setField(term26363, term26363.getClass(), "lastName", null);
        setField(term26363, term26363.getClass(), "password", null);
        setField(term26363, term26363.getClass(), "appliedJobs", null);
        setField(term26363, term26363.getClass(), "feedbacks", null);
        setField(term26363, term26363.getClass(), "skills", null);
        setField(term26363, term26363.getClass(), "bookmarkedJobs", null);
        setField(term26359, term26359.getClass(), "freelancer", term26363);
        setField(term26364, term26364.getClass(), "date", null);
        setField(term26364, term26364.getClass(), "time", null);
        setField(term26359, term26359.getClass(), "appliedDate", term26364);
        setField(term26359, term26359.getClass(), "coverLetter", "");
        ArrayList term26344 = new ArrayList();
        ((ArrayList) term26344).add(term26346);
        ((ArrayList) term26344).add(term26359);
        Object term26370 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term26370, term26370.getClass(), "id", null);
        setField(term26370, term26370.getClass(), "ranges", null);
        setField(term26370, term26370.getClass(), "comments", null);
        setField(term26370, term26370.getClass(), "createdBy", null);
        setField(term26370, term26370.getClass(), "createdFor", null);
        Object term26371 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term26371, term26371.getClass(), "id", null);
        setField(term26371, term26371.getClass(), "ranges", null);
        setField(term26371, term26371.getClass(), "comments", null);
        setField(term26371, term26371.getClass(), "createdBy", null);
        setField(term26371, term26371.getClass(), "createdFor", null);
        Object term26372 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term26372, term26372.getClass(), "id", null);
        setField(term26372, term26372.getClass(), "ranges", null);
        setField(term26372, term26372.getClass(), "comments", null);
        setField(term26372, term26372.getClass(), "createdBy", null);
        setField(term26372, term26372.getClass(), "createdFor", null);
        Object term26373 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term26373, term26373.getClass(), "id", null);
        setField(term26373, term26373.getClass(), "ranges", null);
        setField(term26373, term26373.getClass(), "comments", null);
        setField(term26373, term26373.getClass(), "createdBy", null);
        setField(term26373, term26373.getClass(), "createdFor", null);
        ArrayList term26368 = new ArrayList();
        ((ArrayList) term26368).add(term26370);
        ((ArrayList) term26368).add(term26371);
        ((ArrayList) term26368).add(term26372);
        ((ArrayList) term26368).add(term26373);
        ((ArrayList) term26368).add(term26370);
        ((ArrayList) term26368).add(term26370);
        Object term26378 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term26378, term26378.getClass(), "id", null);
        setField(term26378, term26378.getClass(), "skill", null);
        setField(term26378, term26378.getClass(), "years", null);
        setField(term26378, term26378.getClass(), "freelancer", null);
        Object term26379 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term26379, term26379.getClass(), "id", null);
        setField(term26379, term26379.getClass(), "skill", null);
        setField(term26379, term26379.getClass(), "years", null);
        setField(term26379, term26379.getClass(), "freelancer", null);
        Object term26380 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term26380, term26380.getClass(), "id", null);
        setField(term26380, term26380.getClass(), "skill", null);
        setField(term26380, term26380.getClass(), "years", null);
        setField(term26380, term26380.getClass(), "freelancer", null);
        Object term26381 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term26381, term26381.getClass(), "id", null);
        setField(term26381, term26381.getClass(), "skill", null);
        setField(term26381, term26381.getClass(), "years", null);
        setField(term26381, term26381.getClass(), "freelancer", null);
        Object term26382 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term26382, term26382.getClass(), "id", null);
        setField(term26382, term26382.getClass(), "skill", null);
        setField(term26382, term26382.getClass(), "years", null);
        setField(term26382, term26382.getClass(), "freelancer", null);
        Object term26383 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term26383, term26383.getClass(), "id", null);
        setField(term26383, term26383.getClass(), "skill", null);
        setField(term26383, term26383.getClass(), "years", null);
        setField(term26383, term26383.getClass(), "freelancer", null);
        ArrayList term26376 = new ArrayList();
        ((ArrayList) term26376).add(term26378);
        ((ArrayList) term26376).add(term26378);
        ((ArrayList) term26376).add(term26379);
        ((ArrayList) term26376).add(term26380);
        ((ArrayList) term26376).add(term26379);
        ((ArrayList) term26376).add(term26381);
        ((ArrayList) term26376).add(term26382);
        ((ArrayList) term26376).add(term26383);
        ((ArrayList) term26376).add(term26382);
        Object term26388 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term26388, term26388.getClass(), "id", null);
        setField(term26388, term26388.getClass(), "skill", null);
        setField(term26388, term26388.getClass(), "job", null);
        setField(term26388, term26388.getClass(), "freelancer", null);
        ArrayList term26386 = new ArrayList();
        ((ArrayList) term26386).add(term26388);
        term26293 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term26293, term26293.getClass(), "id", term26294);
        setField(term26293, term26293.getClass(), "userName", "LrNiWJYyTG");
        setField(term26293, term26293.getClass(), "firstName", "ELrjumEBLg");
        setField(term26293, term26293.getClass(), "lastName", "xbmZKVroup");
        setField(term26293, term26293.getClass(), "password", "LZMAvggNMe");
        setField(term26293, term26293.getClass(), "appliedJobs", term26344);
        setField(term26293, term26293.getClass(), "feedbacks", term26368);
        setField(term26293, term26293.getClass(), "skills", term26376);
        setField(term26293, term26293.getClass(), "bookmarkedJobs", term26386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAppliedJobs", argTypes, term26293, args);
    }

};


