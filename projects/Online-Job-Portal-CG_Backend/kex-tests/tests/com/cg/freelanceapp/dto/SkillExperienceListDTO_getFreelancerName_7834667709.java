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
import java.lang.Integer;

public class SkillExperienceListDTO_getFreelancerName_7834667709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9379;

    public SkillExperienceListDTO_getFreelancerName_7834667709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9380 = new Long(-8338004844694486146L);
        Long term9382 = new Long(6426732259596412988L);
        Integer term9396 = new Integer(-655067527);
        Long term9398 = new Long(185793058502220865L);
        term9379 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO"));
        setField(term9379, term9379.getClass(), "id", term9380);
        setField(term9379, term9379.getClass(), "skillId", term9382);
        setField(term9379, term9379.getClass(), "skillName", "WXcZEtUKlI");
        setField(term9379, term9379.getClass(), "experience", term9396);
        setField(term9379, term9379.getClass(), "freelancerId", term9398);
        setField(term9379, term9379.getClass(), "freelancerName", "IkpjUOuWQU");
        setField(term9379, term9379.getClass(), "freelancerUName", "boSSpezHeU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerName", argTypes, term9379, args);
    }

};


