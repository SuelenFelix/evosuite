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
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Boolean;

public class Feedback_getComments_12816291574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term678;

    public Feedback_getComments_12816291574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term679 = new Long(-3936701866695933852L);
        Integer term681 = new Integer(1048535127);
        Long term696 = new Long(1215116475929634177L);
        Long term749 = new Long(1597484336218508869L);
        Boolean term751 = new Boolean(true);
        Object term748 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        setField(term748, term748.getClass(), "id", term749);
        setField(term748, term748.getClass(), "jobTitle", null);
        setField(term748, term748.getClass(), "jobDescription", null);
        setField(term748, term748.getClass(), "skill", null);
        setField(term748, term748.getClass(), "postedBy", null);
        setField(term748, term748.getClass(), "postedDate", null);
        setField(term748, term748.getClass(), "awardedTo", null);
        setField(term748, term748.getClass(), "jobApplications", null);
        setField(term748, term748.getClass(), "active", term751);
        Object term753 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        setField(term753, term753.getClass(), "id", null);
        setField(term753, term753.getClass(), "jobTitle", null);
        setField(term753, term753.getClass(), "jobDescription", null);
        setField(term753, term753.getClass(), "skill", null);
        setField(term753, term753.getClass(), "postedBy", null);
        setField(term753, term753.getClass(), "postedDate", null);
        setField(term753, term753.getClass(), "awardedTo", null);
        setField(term753, term753.getClass(), "jobApplications", null);
        setField(term753, term753.getClass(), "active", null);
        Long term755 = new Long(-4393710401270724527L);
        Boolean term757 = new Boolean(false);
        Object term754 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        setField(term754, term754.getClass(), "id", term755);
        setField(term754, term754.getClass(), "jobTitle", null);
        setField(term754, term754.getClass(), "jobDescription", null);
        setField(term754, term754.getClass(), "skill", null);
        setField(term754, term754.getClass(), "postedBy", null);
        setField(term754, term754.getClass(), "postedDate", null);
        setField(term754, term754.getClass(), "awardedTo", null);
        setField(term754, term754.getClass(), "jobApplications", null);
        setField(term754, term754.getClass(), "active", term757);
        Object term759 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        setField(term759, term759.getClass(), "id", null);
        setField(term759, term759.getClass(), "jobTitle", null);
        setField(term759, term759.getClass(), "jobDescription", null);
        setField(term759, term759.getClass(), "skill", null);
        setField(term759, term759.getClass(), "postedBy", null);
        setField(term759, term759.getClass(), "postedDate", null);
        setField(term759, term759.getClass(), "awardedTo", null);
        setField(term759, term759.getClass(), "jobApplications", null);
        setField(term759, term759.getClass(), "active", null);
        ArrayList term746 = new ArrayList();
        ((ArrayList) term746).add(term748);
        ((ArrayList) term746).add(term753);
        ((ArrayList) term746).add(term754);
        ((ArrayList) term746).add(term759);
        ((ArrayList) term746).add(term759);
        Object term764 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term764, term764.getClass(), "id", null);
        setField(term764, term764.getClass(), "ranges", null);
        setField(term764, term764.getClass(), "comments", null);
        setField(term764, term764.getClass(), "createdBy", null);
        setField(term764, term764.getClass(), "createdFor", null);
        Object term765 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term765, term765.getClass(), "id", null);
        setField(term765, term765.getClass(), "ranges", null);
        setField(term765, term765.getClass(), "comments", null);
        setField(term765, term765.getClass(), "createdBy", null);
        setField(term765, term765.getClass(), "createdFor", null);
        Object term766 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term766, term766.getClass(), "id", null);
        setField(term766, term766.getClass(), "ranges", null);
        setField(term766, term766.getClass(), "comments", null);
        setField(term766, term766.getClass(), "createdBy", null);
        setField(term766, term766.getClass(), "createdFor", null);
        Object term767 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term767, term767.getClass(), "id", null);
        setField(term767, term767.getClass(), "ranges", null);
        setField(term767, term767.getClass(), "comments", null);
        setField(term767, term767.getClass(), "createdBy", null);
        setField(term767, term767.getClass(), "createdFor", null);
        ArrayList term762 = new ArrayList();
        ((ArrayList) term762).add(term764);
        ((ArrayList) term762).add(term765);
        ((ArrayList) term762).add(term766);
        ((ArrayList) term762).add(term767);
        ((ArrayList) term762).add(term764);
        Long term773 = new Long(-1214968196781083707L);
        Object term772 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedFreelancer"));
        setField(term772, term772.getClass(), "id", term773);
        setField(term772, term772.getClass(), "freelancer", null);
        setField(term772, term772.getClass(), "bookmarkedBy", null);
        Object term775 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedFreelancer"));
        setField(term775, term775.getClass(), "id", null);
        setField(term775, term775.getClass(), "freelancer", null);
        setField(term775, term775.getClass(), "bookmarkedBy", null);
        ArrayList term770 = new ArrayList();
        ((ArrayList) term770).add(term772);
        ((ArrayList) term770).add(term775);
        Long term779 = new Long(-1616722610139554082L);
        ArrayList term829 = new ArrayList();
        Object term835 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term835, term835.getClass(), "id", null);
        setField(term835, term835.getClass(), "ranges", null);
        setField(term835, term835.getClass(), "comments", null);
        setField(term835, term835.getClass(), "createdBy", null);
        setField(term835, term835.getClass(), "createdFor", null);
        ArrayList term833 = new ArrayList();
        ((ArrayList) term833).add(term765);
        ((ArrayList) term833).add(term765);
        ((ArrayList) term833).add(term835);
        ((ArrayList) term833).add(term766);
        ((ArrayList) term833).add(term767);
        ((ArrayList) term833).add(term766);
        ((ArrayList) term833).add(term678);
        Object term840 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term840, term840.getClass(), "id", null);
        setField(term840, term840.getClass(), "skill", null);
        setField(term840, term840.getClass(), "years", null);
        setField(term840, term840.getClass(), "freelancer", null);
        Object term841 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term841, term841.getClass(), "id", null);
        setField(term841, term841.getClass(), "skill", null);
        setField(term841, term841.getClass(), "years", null);
        setField(term841, term841.getClass(), "freelancer", null);
        ArrayList term838 = new ArrayList();
        ((ArrayList) term838).add(term840);
        ((ArrayList) term838).add(term841);
        ArrayList term844 = new ArrayList();
        term678 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        Object term695 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term778 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term678, term678.getClass(), "id", term679);
        setField(term678, term678.getClass(), "ranges", term681);
        setField(term678, term678.getClass(), "comments", "FwPbDZcHmB");
        setField(term695, term695.getClass(), "id", term696);
        setField(term695, term695.getClass(), "userName", "hOncybyCAH");
        setField(term695, term695.getClass(), "firstName", "QduALnDSVo");
        setField(term695, term695.getClass(), "lastName", "izPpKDErnQ");
        setField(term695, term695.getClass(), "password", "NnpwZBUTvx");
        setField(term695, term695.getClass(), "postedJobs", term746);
        setField(term695, term695.getClass(), "feedbacks", term762);
        setField(term695, term695.getClass(), "freelancers", term770);
        setField(term678, term678.getClass(), "createdBy", term695);
        setField(term778, term778.getClass(), "id", term779);
        setField(term778, term778.getClass(), "userName", "GJVkUrCVdD");
        setField(term778, term778.getClass(), "firstName", "zNdorvdUgu");
        setField(term778, term778.getClass(), "lastName", "oPxuZbkYio");
        setField(term778, term778.getClass(), "password", "vKitydDVnM");
        setField(term778, term778.getClass(), "appliedJobs", term829);
        setField(term778, term778.getClass(), "feedbacks", term833);
        setField(term778, term778.getClass(), "skills", term838);
        setField(term778, term778.getClass(), "bookmarkedJobs", term844);
        setField(term678, term678.getClass(), "createdFor", term778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Feedback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComments", argTypes, term678, args);
    }

};


