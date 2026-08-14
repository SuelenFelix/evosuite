package com.scaleguard.server.http.reverse;

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
import static com.scaleguard.server.http.reverse.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ScaleGuardKeyManager_chooseClientAlias_6381907662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4234;
     Object term4247;
     Object term4344;
     Object term4345;

    public ScaleGuardKeyManager_chooseClientAlias_6381907662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4234 = newInstance(Class.forName("com.scaleguard.server.http.reverse.ScaleGuardKeyManager"));
        setField(term4234, term4234.getClass(), "keyManager", null);
        setField(term4234, term4234.getClass(), "defaultAlias", "XPKmummaqg");
        term4247 = (Object[]) newArray("java.lang.String", 8);
        setElement(term4247, 0, "BKLfkLiZTH");
        setElement(term4247, 1, "SPpkrGcPRr");
        setElement(term4247, 2, "sEccwbJKYE");
        setElement(term4247, 3, "AWRooQKkdW");
        setElement(term4247, 4, "vjxIhXHxGR");
        setElement(term4247, 5, "QXzGXbEXMu");
        setElement(term4247, 6, "qxSDVejjiY");
        setElement(term4247, 7, "xBsXSDjXYK");
        term4344 = (Object[]) newArray("java.security.Principal", 6);
        term4345 = newInstance(Class.forName("java.net.Socket"));
        Object term4350 = newInstance(Class.forName("java.lang.Object"));
        Object term4353 = newInstance(Class.forName("java.net.SocksSocketImpl"));
        Object term4362 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term4345, term4345.getClass(), "created", false);
        setBooleanField(term4345, term4345.getClass(), "bound", true);
        setBooleanField(term4345, term4345.getClass(), "connected", false);
        setBooleanField(term4345, term4345.getClass(), "closed", false);
        setField(term4345, term4345.getClass(), "closeLock", term4350);
        setBooleanField(term4345, term4345.getClass(), "shutIn", true);
        setBooleanField(term4345, term4345.getClass(), "shutOut", true);
        setField(term4353, term4353.getClass(), "server", null);
        setIntField(term4353, term4353.getClass(), "serverPort", 1080);
        setField(term4353, term4353.getClass(), "external_address", null);
        setBooleanField(term4353, term4353.getClass(), "useV4", false);
        setField(term4353, term4353.getClass(), "cmdsock", null);
        setField(term4353, term4353.getClass(), "cmdIn", null);
        setField(term4353, term4353.getClass(), "cmdOut", null);
        setBooleanField(term4353, term4353.getClass(), "applicationSetProxy", false);
        setIntField(term4353, term4353.getClass(), "timeout", 0);
        setIntField(term4353, term4353.getClass(), "trafficClass", 0);
        setBooleanField(term4353, term4353.getClass(), "shut_rd", false);
        setBooleanField(term4353, term4353.getClass(), "shut_wr", false);
        setField(term4353, term4353.getClass(), "socketInputStream", null);
        setField(term4353, term4353.getClass(), "socketOutputStream", null);
        setIntField(term4353, term4353.getClass(), "fdUseCount", 0);
        setField(term4353, term4353.getClass(), "fdLock", term4362);
        setBooleanField(term4353, term4353.getClass(), "closePending", false);
        setBooleanField(term4353, term4353.getClass(), "connectionReset", false);
        setBooleanField(term4353, term4353.getClass(), "stream", false);
        setField(term4353, term4353.getClass(), "socket", term4345);
        setField(term4353, term4353.getClass(), "serverSocket", null);
        setField(term4353, term4353.getClass(), "fd", null);
        setField(term4353, term4353.getClass(), "address", null);
        setIntField(term4353, term4353.getClass(), "port", 0);
        setIntField(term4353, term4353.getClass(), "localport", 0);
        setField(term4345, term4345.getClass(), "impl", term4353);
        setBooleanField(term4345, term4345.getClass(), "oldImpl", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.reverse.ScaleGuardKeyManager");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.security.Principal"), 0).getClass();
        argTypes[2] = Class.forName("java.net.Socket");
        Object[] args = new Object[3];
        args[0] = term4247;
        args[1] = term4344;
        args[2] = term4345;
        callMethod(klass, "chooseClientAlias", argTypes, term4234, args);
    }

};


