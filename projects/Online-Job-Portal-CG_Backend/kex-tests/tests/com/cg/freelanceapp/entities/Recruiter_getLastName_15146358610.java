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
import java.lang.Integer;

public class Recruiter_getLastName_15146358610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16525;

    public Recruiter_getLastName_15146358610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16526 = new Long(6171188519299774487L);
        ArrayList term16576 = new ArrayList();
        Long term16583 = new Long(8409252889039339447L);
        Integer term16585 = new Integer(-1867239125);
        Long term16589 = new Long(6113018989695983183L);
        Object term16582 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        Object term16588 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term16591 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term16582, term16582.getClass(), "id", term16583);
        setField(term16582, term16582.getClass(), "ranges", term16585);
        setField(term16582, term16582.getClass(), "comments", "");
        setField(term16588, term16588.getClass(), "id", term16589);
        setField(term16588, term16588.getClass(), "userName", null);
        setField(term16588, term16588.getClass(), "firstName", null);
        setField(term16588, term16588.getClass(), "lastName", null);
        setField(term16588, term16588.getClass(), "password", null);
        setField(term16588, term16588.getClass(), "postedJobs", null);
        setField(term16588, term16588.getClass(), "feedbacks", null);
        setField(term16588, term16588.getClass(), "freelancers", null);
        setField(term16582, term16582.getClass(), "createdBy", term16588);
        setField(term16591, term16591.getClass(), "id", null);
        setField(term16591, term16591.getClass(), "userName", null);
        setField(term16591, term16591.getClass(), "firstName", null);
        setField(term16591, term16591.getClass(), "lastName", null);
        setField(term16591, term16591.getClass(), "password", null);
        setField(term16591, term16591.getClass(), "appliedJobs", null);
        setField(term16591, term16591.getClass(), "feedbacks", null);
        setField(term16591, term16591.getClass(), "skills", null);
        setField(term16591, term16591.getClass(), "bookmarkedJobs", null);
        setField(term16582, term16582.getClass(), "createdFor", term16591);
        Long term16593 = new Long(-330187935331339969L);
        Integer term16595 = new Integer(76650923);
        Object term16592 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        Object term16598 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term16599 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term16592, term16592.getClass(), "id", term16593);
        setField(term16592, term16592.getClass(), "ranges", term16595);
        setField(term16592, term16592.getClass(), "comments", "");
        setField(term16598, term16598.getClass(), "id", null);
        setField(term16598, term16598.getClass(), "userName", null);
        setField(term16598, term16598.getClass(), "firstName", null);
        setField(term16598, term16598.getClass(), "lastName", null);
        setField(term16598, term16598.getClass(), "password", null);
        setField(term16598, term16598.getClass(), "postedJobs", null);
        setField(term16598, term16598.getClass(), "feedbacks", null);
        setField(term16598, term16598.getClass(), "freelancers", null);
        setField(term16592, term16592.getClass(), "createdBy", term16598);
        setField(term16599, term16599.getClass(), "id", null);
        setField(term16599, term16599.getClass(), "userName", null);
        setField(term16599, term16599.getClass(), "firstName", null);
        setField(term16599, term16599.getClass(), "lastName", null);
        setField(term16599, term16599.getClass(), "password", null);
        setField(term16599, term16599.getClass(), "appliedJobs", null);
        setField(term16599, term16599.getClass(), "feedbacks", null);
        setField(term16599, term16599.getClass(), "skills", null);
        setField(term16599, term16599.getClass(), "bookmarkedJobs", null);
        setField(term16592, term16592.getClass(), "createdFor", term16599);
        Long term16601 = new Long(7008972996434680296L);
        Integer term16603 = new Integer(952869601);
        Long term16607 = new Long(678000773176130475L);
        Object term16600 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        Object term16606 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term16609 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term16600, term16600.getClass(), "id", term16601);
        setField(term16600, term16600.getClass(), "ranges", term16603);
        setField(term16600, term16600.getClass(), "comments", "");
        setField(term16606, term16606.getClass(), "id", term16607);
        setField(term16606, term16606.getClass(), "userName", null);
        setField(term16606, term16606.getClass(), "firstName", null);
        setField(term16606, term16606.getClass(), "lastName", null);
        setField(term16606, term16606.getClass(), "password", null);
        setField(term16606, term16606.getClass(), "postedJobs", null);
        setField(term16606, term16606.getClass(), "feedbacks", null);
        setField(term16606, term16606.getClass(), "freelancers", null);
        setField(term16600, term16600.getClass(), "createdBy", term16606);
        setField(term16609, term16609.getClass(), "id", null);
        setField(term16609, term16609.getClass(), "userName", null);
        setField(term16609, term16609.getClass(), "firstName", null);
        setField(term16609, term16609.getClass(), "lastName", null);
        setField(term16609, term16609.getClass(), "password", null);
        setField(term16609, term16609.getClass(), "appliedJobs", null);
        setField(term16609, term16609.getClass(), "feedbacks", null);
        setField(term16609, term16609.getClass(), "skills", null);
        setField(term16609, term16609.getClass(), "bookmarkedJobs", null);
        setField(term16600, term16600.getClass(), "createdFor", term16609);
        Long term16611 = new Long(-2060623851955948674L);
        Integer term16613 = new Integer(644154104);
        Object term16610 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        Object term16616 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term16610, term16610.getClass(), "id", term16611);
        setField(term16610, term16610.getClass(), "ranges", term16613);
        setField(term16610, term16610.getClass(), "comments", "");
        setField(term16610, term16610.getClass(), "createdBy", term16598);
        setField(term16616, term16616.getClass(), "id", null);
        setField(term16616, term16616.getClass(), "userName", null);
        setField(term16616, term16616.getClass(), "firstName", null);
        setField(term16616, term16616.getClass(), "lastName", null);
        setField(term16616, term16616.getClass(), "password", null);
        setField(term16616, term16616.getClass(), "appliedJobs", null);
        setField(term16616, term16616.getClass(), "feedbacks", null);
        setField(term16616, term16616.getClass(), "skills", null);
        setField(term16616, term16616.getClass(), "bookmarkedJobs", null);
        setField(term16610, term16610.getClass(), "createdFor", term16616);
        ArrayList term16580 = new ArrayList();
        ((ArrayList) term16580).add(term16582);
        ((ArrayList) term16580).add(term16592);
        ((ArrayList) term16580).add(term16600);
        ((ArrayList) term16580).add(term16610);
        Long term16622 = new Long(1440127173650606212L);
        Object term16621 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedFreelancer"));
        Object term16624 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term16625 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        setField(term16621, term16621.getClass(), "id", term16622);
        setField(term16624, term16624.getClass(), "id", null);
        setField(term16624, term16624.getClass(), "userName", null);
        setField(term16624, term16624.getClass(), "firstName", null);
        setField(term16624, term16624.getClass(), "lastName", null);
        setField(term16624, term16624.getClass(), "password", null);
        setField(term16624, term16624.getClass(), "appliedJobs", null);
        setField(term16624, term16624.getClass(), "feedbacks", null);
        setField(term16624, term16624.getClass(), "skills", null);
        setField(term16624, term16624.getClass(), "bookmarkedJobs", null);
        setField(term16621, term16621.getClass(), "freelancer", term16624);
        setField(term16625, term16625.getClass(), "id", null);
        setField(term16625, term16625.getClass(), "userName", null);
        setField(term16625, term16625.getClass(), "firstName", null);
        setField(term16625, term16625.getClass(), "lastName", null);
        setField(term16625, term16625.getClass(), "password", null);
        setField(term16625, term16625.getClass(), "postedJobs", null);
        setField(term16625, term16625.getClass(), "feedbacks", null);
        setField(term16625, term16625.getClass(), "freelancers", null);
        setField(term16621, term16621.getClass(), "bookmarkedBy", term16625);
        ArrayList term16619 = new ArrayList();
        ((ArrayList) term16619).add(term16621);
        term16525 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        setField(term16525, term16525.getClass(), "id", term16526);
        setField(term16525, term16525.getClass(), "userName", "rJpPoVDPxO");
        setField(term16525, term16525.getClass(), "firstName", "wAzHMzePqz");
        setField(term16525, term16525.getClass(), "lastName", "apDIHttQkF");
        setField(term16525, term16525.getClass(), "password", "JnkpKxjKwX");
        setField(term16525, term16525.getClass(), "postedJobs", term16576);
        setField(term16525, term16525.getClass(), "feedbacks", term16580);
        setField(term16525, term16525.getClass(), "freelancers", term16619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Recruiter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term16525, args);
    }

};


