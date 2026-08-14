package com.scaleguard.server.application;

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
import static com.scaleguard.server.application.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Application_WrappeApplicationRecord_setDescription_19213681277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3619;

    public Application_WrappeApplicationRecord_setDescription_19213681277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3646 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3646, term3646.getClass(), "id", "");
        setField(term3646, term3646.getClass(), "name", "");
        setField(term3646, term3646.getClass(), "description", "");
        setField(term3646, term3646.getClass(), "appid", "");
        setField(term3646, term3646.getClass(), "clientid", "");
        setField(term3646, term3646.getClass(), "clientsecret", "");
        setLongField(term3646, term3646.getClass(), "expiry", -7612550318181586304L);
        Object term3654 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3654, term3654.getClass(), "id", "");
        setField(term3654, term3654.getClass(), "name", "");
        setField(term3654, term3654.getClass(), "description", "");
        setField(term3654, term3654.getClass(), "appid", "");
        setField(term3654, term3654.getClass(), "clientid", "");
        setField(term3654, term3654.getClass(), "clientsecret", "");
        setLongField(term3654, term3654.getClass(), "expiry", -2170847986967241072L);
        Object term3662 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3662, term3662.getClass(), "id", "");
        setField(term3662, term3662.getClass(), "name", "");
        setField(term3662, term3662.getClass(), "description", "");
        setField(term3662, term3662.getClass(), "appid", "");
        setField(term3662, term3662.getClass(), "clientid", "");
        setField(term3662, term3662.getClass(), "clientsecret", "");
        setLongField(term3662, term3662.getClass(), "expiry", 4044358158040652353L);
        Object term3670 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3670, term3670.getClass(), "id", "");
        setField(term3670, term3670.getClass(), "name", "");
        setField(term3670, term3670.getClass(), "description", "");
        setField(term3670, term3670.getClass(), "appid", "");
        setField(term3670, term3670.getClass(), "clientid", "");
        setField(term3670, term3670.getClass(), "clientsecret", "");
        setLongField(term3670, term3670.getClass(), "expiry", -4443169559037975007L);
        Object term3678 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3678, term3678.getClass(), "id", "");
        setField(term3678, term3678.getClass(), "name", "");
        setField(term3678, term3678.getClass(), "description", "");
        setField(term3678, term3678.getClass(), "appid", "");
        setField(term3678, term3678.getClass(), "clientid", "");
        setField(term3678, term3678.getClass(), "clientsecret", "");
        setLongField(term3678, term3678.getClass(), "expiry", -3842548265506930260L);
        Object term3686 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3686, term3686.getClass(), "id", "");
        setField(term3686, term3686.getClass(), "name", "");
        setField(term3686, term3686.getClass(), "description", "");
        setField(term3686, term3686.getClass(), "appid", "");
        setField(term3686, term3686.getClass(), "clientid", "");
        setField(term3686, term3686.getClass(), "clientsecret", "");
        setLongField(term3686, term3686.getClass(), "expiry", -5788180182343976541L);
        Object term3694 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3694, term3694.getClass(), "id", "");
        setField(term3694, term3694.getClass(), "name", "");
        setField(term3694, term3694.getClass(), "description", "");
        setField(term3694, term3694.getClass(), "appid", "");
        setField(term3694, term3694.getClass(), "clientid", "");
        setField(term3694, term3694.getClass(), "clientsecret", "");
        setLongField(term3694, term3694.getClass(), "expiry", 2936323121573284007L);
        Object term3702 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3702, term3702.getClass(), "id", "");
        setField(term3702, term3702.getClass(), "name", "");
        setField(term3702, term3702.getClass(), "description", "");
        setField(term3702, term3702.getClass(), "appid", "");
        setField(term3702, term3702.getClass(), "clientid", "");
        setField(term3702, term3702.getClass(), "clientsecret", "");
        setLongField(term3702, term3702.getClass(), "expiry", -1154553077993834885L);
        Object term3710 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3710, term3710.getClass(), "id", "");
        setField(term3710, term3710.getClass(), "name", "");
        setField(term3710, term3710.getClass(), "description", "");
        setField(term3710, term3710.getClass(), "appid", "");
        setField(term3710, term3710.getClass(), "clientid", "");
        setField(term3710, term3710.getClass(), "clientsecret", "");
        setLongField(term3710, term3710.getClass(), "expiry", -2850532706972744550L);
        ArrayList term3644 = new ArrayList();
        ((ArrayList) term3644).add(term3646);
        ((ArrayList) term3644).add(term3654);
        ((ArrayList) term3644).add(term3662);
        ((ArrayList) term3644).add(term3670);
        ((ArrayList) term3644).add(term3678);
        ((ArrayList) term3644).add(term3686);
        ((ArrayList) term3644).add(term3694);
        ((ArrayList) term3644).add(term3702);
        ((ArrayList) term3644).add(term3710);
        term3619 = newInstance(Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord"));
        setField(term3619, term3619.getClass(), "name", "OeQLvhVERT");
        setField(term3619, term3619.getClass(), "description", "IlvgFINwIa");
        setField(term3619, term3619.getClass(), "clients", term3644);
        setField(term3619, term3619.getClass(), "id", "JOqQxuzRuZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RSaoipUlsg";
        callMethod(klass, "setDescription", argTypes, term3619, args);
    }

};


