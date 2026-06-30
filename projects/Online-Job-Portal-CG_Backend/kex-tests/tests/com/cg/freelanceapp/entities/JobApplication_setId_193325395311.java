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
import java.lang.Boolean;

public class JobApplication_setId_193325395311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44034;
     Object term44191;

    public JobApplication_setId_193325395311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term44035 = new Long(-6617693381241289068L);
        Long term44038 = new Long(-4638865229187525010L);
        Long term44065 = new Long(-7661181241933749873L);
        Long term44092 = new Long(4515262739708705481L);
        ArrayList term44142 = new ArrayList();
        ((ArrayList) term44142).add((Object)null);
        ((ArrayList) term44142).add((Object)null);
        ((ArrayList) term44142).add((Object)null);
        ((ArrayList) term44142).add((Object)null);
        ((ArrayList) term44142).add((Object)null);
        ((ArrayList) term44142).add((Object)null);
        ((ArrayList) term44142).add((Object)null);
        ArrayList term44146 = new ArrayList();
        ((ArrayList) term44146).add((Object)null);
        ((ArrayList) term44146).add((Object)null);
        ((ArrayList) term44146).add((Object)null);
        ((ArrayList) term44146).add((Object)null);
        ArrayList term44150 = new ArrayList();
        ((ArrayList) term44150).add((Object)null);
        ((ArrayList) term44150).add((Object)null);
        ((ArrayList) term44150).add((Object)null);
        ((ArrayList) term44150).add((Object)null);
        ((ArrayList) term44150).add((Object)null);
        Object term44161 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term44161, term44161.getClass(), "id", null);
        setField(term44161, term44161.getClass(), "job", null);
        setField(term44161, term44161.getClass(), "freelancer", null);
        setField(term44161, term44161.getClass(), "appliedDate", null);
        setField(term44161, term44161.getClass(), "coverLetter", null);
        Object term44162 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term44162, term44162.getClass(), "id", null);
        setField(term44162, term44162.getClass(), "job", null);
        setField(term44162, term44162.getClass(), "freelancer", null);
        setField(term44162, term44162.getClass(), "appliedDate", null);
        setField(term44162, term44162.getClass(), "coverLetter", null);
        Object term44163 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term44163, term44163.getClass(), "id", null);
        setField(term44163, term44163.getClass(), "job", null);
        setField(term44163, term44163.getClass(), "freelancer", null);
        setField(term44163, term44163.getClass(), "appliedDate", null);
        setField(term44163, term44163.getClass(), "coverLetter", null);
        ArrayList term44159 = new ArrayList();
        ((ArrayList) term44159).add(term44161);
        ((ArrayList) term44159).add(term44162);
        ((ArrayList) term44159).add(term44163);
        Boolean term44166 = new Boolean(false);
        term44034 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term44037 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term44064 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term44091 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term44154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44158 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term44168 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term44169 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44170 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44174 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term44034, term44034.getClass(), "id", term44035);
        setField(term44037, term44037.getClass(), "id", term44038);
        setField(term44037, term44037.getClass(), "jobTitle", "UjlZvHchZX");
        setField(term44037, term44037.getClass(), "jobDescription", "ZoGOphtbMj");
        setField(term44064, term44064.getClass(), "id", term44065);
        setField(term44064, term44064.getClass(), "name", "FxtuMMZTnJ");
        setField(term44064, term44064.getClass(), "description", "xqcrleZqqU");
        setField(term44037, term44037.getClass(), "skill", term44064);
        setField(term44091, term44091.getClass(), "id", term44092);
        setField(term44091, term44091.getClass(), "userName", "GZfyTlJvPo");
        setField(term44091, term44091.getClass(), "firstName", "ErykqtSHSR");
        setField(term44091, term44091.getClass(), "lastName", "cYBIjKvbtm");
        setField(term44091, term44091.getClass(), "password", "BEvLYxGdKf");
        setField(term44091, term44091.getClass(), "postedJobs", term44142);
        setField(term44091, term44091.getClass(), "feedbacks", term44146);
        setField(term44091, term44091.getClass(), "freelancers", term44150);
        setField(term44037, term44037.getClass(), "postedBy", term44091);
        setIntField(term44154, term44154.getClass(), "year", 2026);
        setShortField(term44154, term44154.getClass(), "month", (short) 6);
        setShortField(term44154, term44154.getClass(), "day", (short) 29);
        setField(term44037, term44037.getClass(), "postedDate", term44154);
        setField(term44158, term44158.getClass(), "id", null);
        setField(term44158, term44158.getClass(), "userName", null);
        setField(term44158, term44158.getClass(), "firstName", null);
        setField(term44158, term44158.getClass(), "lastName", null);
        setField(term44158, term44158.getClass(), "password", null);
        setField(term44158, term44158.getClass(), "appliedJobs", null);
        setField(term44158, term44158.getClass(), "feedbacks", null);
        setField(term44158, term44158.getClass(), "skills", null);
        setField(term44158, term44158.getClass(), "bookmarkedJobs", null);
        setField(term44037, term44037.getClass(), "awardedTo", term44158);
        setField(term44037, term44037.getClass(), "jobApplications", term44159);
        setField(term44037, term44037.getClass(), "active", term44166);
        setField(term44034, term44034.getClass(), "job", term44037);
        setField(term44168, term44168.getClass(), "id", null);
        setField(term44168, term44168.getClass(), "userName", null);
        setField(term44168, term44168.getClass(), "firstName", null);
        setField(term44168, term44168.getClass(), "lastName", null);
        setField(term44168, term44168.getClass(), "password", null);
        setField(term44168, term44168.getClass(), "appliedJobs", null);
        setField(term44168, term44168.getClass(), "feedbacks", null);
        setField(term44168, term44168.getClass(), "skills", null);
        setField(term44168, term44168.getClass(), "bookmarkedJobs", null);
        setField(term44034, term44034.getClass(), "freelancer", term44168);
        setIntField(term44170, term44170.getClass(), "year", 2026);
        setShortField(term44170, term44170.getClass(), "month", (short) 6);
        setShortField(term44170, term44170.getClass(), "day", (short) 28);
        setField(term44169, term44169.getClass(), "date", term44170);
        setByteField(term44174, term44174.getClass(), "hour", (byte) 22);
        setByteField(term44174, term44174.getClass(), "minute", (byte) 18);
        setByteField(term44174, term44174.getClass(), "second", (byte) 45);
        setIntField(term44174, term44174.getClass(), "nano", 380790000);
        setField(term44169, term44169.getClass(), "time", term44174);
        setField(term44034, term44034.getClass(), "appliedDate", term44169);
        setField(term44034, term44034.getClass(), "coverLetter", "VCSuECypfF");
        term44191 = new Long(3921884426788904908L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.JobApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term44191;
        callMethod(klass, "setId", argTypes, term44034, args);
    }

};


