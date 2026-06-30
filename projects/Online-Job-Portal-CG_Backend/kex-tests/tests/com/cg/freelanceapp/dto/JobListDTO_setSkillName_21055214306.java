package com.cg.freelanceapp.dto;

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
import static com.cg.freelanceapp.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class JobListDTO_setSkillName_21055214306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10693;

    public JobListDTO_setSkillName_21055214306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10694 = new Long(-8514728180792822493L);
        Long term10696 = new Long(5315236285592892506L);
        Long term10710 = new Long(-6969704322644192945L);
        Long term10724 = new Long(-6685235643232255177L);
        term10693 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term10693, term10693.getClass(), "jobId", term10694);
        setField(term10693, term10693.getClass(), "freelancerId", term10696);
        setField(term10693, term10693.getClass(), "freelancerName", "ubodzJoMGW");
        setField(term10693, term10693.getClass(), "skillId", term10710);
        setField(term10693, term10693.getClass(), "skillName", "weddIktxOA");
        setField(term10693, term10693.getClass(), "recruiterId", term10724);
        setField(term10693, term10693.getClass(), "recruiterName", "uSlMeISsDD");
        setField(term10693, term10693.getClass(), "jobTitle", "WdCiTDUKqn");
        setField(term10693, term10693.getClass(), "jobDescription", "PSizQDoxxe");
        setBooleanField(term10693, term10693.getClass(), "jobStatus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mKaHyMybrK";
        callMethod(klass, "setSkillName", argTypes, term10693, args);
    }

};


