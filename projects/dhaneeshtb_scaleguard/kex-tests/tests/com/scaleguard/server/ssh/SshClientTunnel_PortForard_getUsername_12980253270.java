package com.scaleguard.server.ssh;

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
import static com.scaleguard.server.ssh.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SshClientTunnel_PortForard_getUsername_12980253270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SshClientTunnel_PortForard_getUsername_12980253270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.scaleguard.server.ssh.SshClientTunnel$PortForard"));
        setField(term1, term1.getClass(), "username", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "password", "sjlJAEtRrb");
        setIntField(term1, term1.getClass(), "remotePort", 568599855);
        setField(term1, term1.getClass(), "remoteHost", "MuLcgQHgqz");
        setIntField(term1, term1.getClass(), "localPort", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.SshClientTunnel$PortForard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term1, args);
    }

};


