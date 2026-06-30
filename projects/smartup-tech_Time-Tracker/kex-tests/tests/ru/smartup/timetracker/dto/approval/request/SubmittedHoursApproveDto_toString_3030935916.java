package ru.smartup.timetracker.dto.approval.request;

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
import static ru.smartup.timetracker.dto.approval.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;

public class SubmittedHoursApproveDto_toString_3030935916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;

    public SubmittedHoursApproveDto_toString_3030935916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term70 = new Long(-6573104506744284592L);
        Long term72 = new Long(-4920224193275732920L);
        Long term74 = new Long(8428634514691209827L);
        Long term76 = new Long(-2585684163342970173L);
        Long term78 = new Long(8059786003080744426L);
        Long term80 = new Long(-4365849114644724155L);
        Long term82 = new Long(2486810210675247493L);
        Long term84 = new Long(7009926388951271268L);
        Long term86 = new Long(-7672528020740371001L);
        ArrayList term68 = new ArrayList();
        ((ArrayList) term68).add(term70);
        ((ArrayList) term68).add(term72);
        ((ArrayList) term68).add(term74);
        ((ArrayList) term68).add(term76);
        ((ArrayList) term68).add(term78);
        ((ArrayList) term68).add(term80);
        ((ArrayList) term68).add(term82);
        ((ArrayList) term68).add(term84);
        ((ArrayList) term68).add(term86);
        term67 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursApproveDto"));
        setField(term67, term67.getClass(), "trackUnitIds", term68);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursApproveDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term67, args);
    }

};


