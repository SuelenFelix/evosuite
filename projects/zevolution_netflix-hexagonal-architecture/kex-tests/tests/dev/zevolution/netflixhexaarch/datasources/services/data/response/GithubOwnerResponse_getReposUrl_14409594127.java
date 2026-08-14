package dev.zevolution.netflixhexaarch.datasources.services.data.response;

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
import static dev.zevolution.netflixhexaarch.datasources.services.data.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class GithubOwnerResponse_getReposUrl_14409594127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11893;

    public GithubOwnerResponse_getReposUrl_14409594127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11906 = new Integer(97029295);
        Boolean term12088 = new Boolean(false);
        term11893 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term11893, term11893.getClass(), "login", "DGRqjjdhzy");
        setField(term11893, term11893.getClass(), "id", term11906);
        setField(term11893, term11893.getClass(), "nodeId", "lQFkjJUPAR");
        setField(term11893, term11893.getClass(), "avatarUrl", "BsuVlGUUjV");
        setField(term11893, term11893.getClass(), "gravatarId", "bHHjfDCntT");
        setField(term11893, term11893.getClass(), "url", "sEphiduvkv");
        setField(term11893, term11893.getClass(), "htmlUrl", "PbLgCSAHce");
        setField(term11893, term11893.getClass(), "followersUrl", "NWldOLAbqk");
        setField(term11893, term11893.getClass(), "followingUrl", "qnYaYSpDwO");
        setField(term11893, term11893.getClass(), "gistsUrl", "dgbFDCdHtj");
        setField(term11893, term11893.getClass(), "starredUrl", "EKpdCBubDE");
        setField(term11893, term11893.getClass(), "subscriptionsUrl", "zMsSLTfGhl");
        setField(term11893, term11893.getClass(), "organizationsUrl", "bEmHScVZaQ");
        setField(term11893, term11893.getClass(), "reposUrl", "TcuXODkzBV");
        setField(term11893, term11893.getClass(), "eventsUrl", "coJPjrBZNe");
        setField(term11893, term11893.getClass(), "receivedEventsUrl", "vMsWjuPTnO");
        setField(term11893, term11893.getClass(), "type", "zHvfKaOstO");
        setField(term11893, term11893.getClass(), "siteAdmin", term12088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReposUrl", argTypes, term11893, args);
    }

};


