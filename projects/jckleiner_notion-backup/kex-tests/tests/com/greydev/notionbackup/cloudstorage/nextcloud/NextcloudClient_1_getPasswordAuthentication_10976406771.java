package com.greydev.notionbackup.cloudstorage.nextcloud;

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
import static com.greydev.notionbackup.cloudstorage.nextcloud.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NextcloudClient_1_getPasswordAuthentication_10976406771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68;

    public NextcloudClient_1_getPasswordAuthentication_10976406771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68 = newInstance(Class.forName("com.greydev.notionbackup.cloudstorage.nextcloud.NextcloudClient$1"));
        Object term81 = newInstance(Class.forName("java.net.InetAddress"));
        Object term82 = newInstance(Class.forName("java.net.InetAddress$InetAddressHolder"));
        Object term134 = newInstance(Class.forName("java.net.URL"));
        Object term178 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        Object term180 = newInstance(Class.forName("java.net.Authenticator$RequestorType"));
        setField(term68, term68.getClass(), "this$0", null);
        setField(term68, term68.getClass(), "requestingHost", "xxtlPwDYFs");
        setField(term82, term82.getClass(), "originalHostName", null);
        setField(term82, term82.getClass(), "hostName", null);
        setIntField(term82, term82.getClass(), "address", 0);
        setIntField(term82, term82.getClass(), "family", 0);
        setField(term81, term81.getClass(), "holder", term82);
        setField(term81, term81.getClass(), "canonicalHostName", "jJCZpVmanW");
        setField(term68, term68.getClass(), "requestingSite", term81);
        setIntField(term68, term68.getClass(), "requestingPort", -1922583790);
        setField(term68, term68.getClass(), "requestingProtocol", "hRNSzYYIrc");
        setField(term68, term68.getClass(), "requestingPrompt", "RMFIsYGgne");
        setField(term68, term68.getClass(), "requestingScheme", "NRdvgJlhkX");
        setField(term134, term134.getClass(), "protocol", "http");
        setField(term134, term134.getClass(), "host", "www.oracle.com");
        setIntField(term134, term134.getClass(), "port", -1);
        setField(term134, term134.getClass(), "file", "");
        setField(term134, term134.getClass(), "query", null);
        setField(term134, term134.getClass(), "authority", "www.oracle.com");
        setField(term134, term134.getClass(), "path", "");
        setField(term134, term134.getClass(), "userInfo", null);
        setField(term134, term134.getClass(), "ref", null);
        setField(term134, term134.getClass(), "hostAddress", null);
        setField(term178, term178.getClass(), "proxy", null);
        setIntField(term178, term178.getClass(), "proxyPort", -1);
        setField(term134, term134.getClass(), "handler", term178);
        setField(term134, term134.getClass(), "tempState", null);
        setField(term68, term68.getClass(), "requestingURL", term134);
        setField(term180, term180.getClass(), "name", "PROXY");
        setIntField(term180, term180.getClass(), "ordinal", 0);
        setField(term68, term68.getClass(), "requestingAuthType", term180);
        setField(term68, term68.getClass(), "key", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.greydev.notionbackup.cloudstorage.nextcloud.NextcloudClient$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswordAuthentication", argTypes, term68, args);
    }

};


