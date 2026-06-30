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
import java.util.LinkedList;
import java.lang.Object;

public class SubmittedHoursRejectDto_setTrackUnitIds_9665890973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168;
     Object term203;

    public SubmittedHoursRejectDto_setTrackUnitIds_9665890973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term171 = new Long(6617340557564669657L);
        Long term173 = new Long(1439298019805881866L);
        Long term175 = new Long(-8708192233349544946L);
        Long term177 = new Long(5907001541142728739L);
        Long term179 = new Long(4178434741742309755L);
        Long term181 = new Long(-2068172595987555756L);
        Long term183 = new Long(-6292278961887936280L);
        Long term185 = new Long(-6645965768855543712L);
        Long term187 = new Long(4784595517102746672L);
        ArrayList term169 = new ArrayList();
        ((ArrayList) term169).add(term171);
        ((ArrayList) term169).add(term173);
        ((ArrayList) term169).add(term175);
        ((ArrayList) term169).add(term177);
        ((ArrayList) term169).add(term179);
        ((ArrayList) term169).add(term181);
        ((ArrayList) term169).add(term183);
        ((ArrayList) term169).add(term185);
        ((ArrayList) term169).add(term187);
        term168 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto"));
        setField(term168, term168.getClass(), "trackUnitIds", term169);
        setField(term168, term168.getClass(), "rejectReason", "MuLcgQHgqz");
        Long term206 = new Long(-7612550318181586304L);
        Long term209 = new Long(-2170847986967241072L);
        Long term212 = new Long(4044358158040652353L);
        Long term215 = new Long(-4443169559037975007L);
        term203 = new LinkedList();
        ((LinkedList) term203).add(term206);
        ((LinkedList) term203).add(term209);
        ((LinkedList) term203).add(term212);
        ((LinkedList) term203).add(term215);
        ((LinkedList) term203).add((Object)null);
        ((LinkedList) term203).add((Object)null);
        ((LinkedList) term203).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term203;
        callMethod(klass, "setTrackUnitIds", argTypes, term168, args);
    }

};


