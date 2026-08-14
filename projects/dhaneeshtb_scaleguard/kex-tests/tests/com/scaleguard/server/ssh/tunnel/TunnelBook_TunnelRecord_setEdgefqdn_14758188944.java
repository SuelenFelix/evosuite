package com.scaleguard.server.ssh.tunnel;

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
import static com.scaleguard.server.ssh.tunnel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TunnelBook_TunnelRecord_setEdgefqdn_14758188944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477;

    public TunnelBook_TunnelRecord_setEdgefqdn_14758188944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term477 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term477, term477.getClass(), "name", "RkybSrpybU");
        setIntField(term477, term477.getClass(), "port", 1725571209);
        setField(term477, term477.getClass(), "localIp", "xOEqzGAmDU");
        setField(term477, term477.getClass(), "username", "eZFUvlxvGV");
        setField(term477, term477.getClass(), "password", "BYqFIqCKAV");
        setIntField(term477, term477.getClass(), "systemPort", -522618178);
        setIntField(term477, term477.getClass(), "ttl", 1134449235);
        setField(term477, term477.getClass(), "fqdn", "vrQLuWIDJX");
        setField(term477, term477.getClass(), "edgefqdn", "flxyYxBRtu");
        setField(term477, term477.getClass(), "lfqdn", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IoAlmYsBwc";
        callMethod(klass, "setEdgefqdn", argTypes, term477, args);
    }

};


