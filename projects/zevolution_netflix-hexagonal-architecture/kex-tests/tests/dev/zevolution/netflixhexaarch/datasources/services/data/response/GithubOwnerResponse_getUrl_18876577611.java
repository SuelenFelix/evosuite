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

public class GithubOwnerResponse_getUrl_18876577611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6005;

    public GithubOwnerResponse_getUrl_18876577611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6018 = new Integer(-817164822);
        Boolean term6200 = new Boolean(false);
        term6005 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term6005, term6005.getClass(), "login", "SOrEHbcbmn");
        setField(term6005, term6005.getClass(), "id", term6018);
        setField(term6005, term6005.getClass(), "nodeId", "bnsyeQXFdu");
        setField(term6005, term6005.getClass(), "avatarUrl", "BwtdjiefJn");
        setField(term6005, term6005.getClass(), "gravatarId", "jDmhBrIoDa");
        setField(term6005, term6005.getClass(), "url", "SPtPatHeOm");
        setField(term6005, term6005.getClass(), "htmlUrl", "ywmcuThdfL");
        setField(term6005, term6005.getClass(), "followersUrl", "GBOEuByOfr");
        setField(term6005, term6005.getClass(), "followingUrl", "NHbOFFjyVK");
        setField(term6005, term6005.getClass(), "gistsUrl", "zaloBqlrSo");
        setField(term6005, term6005.getClass(), "starredUrl", "vvoLrMGCoN");
        setField(term6005, term6005.getClass(), "subscriptionsUrl", "pXdglvyrQe");
        setField(term6005, term6005.getClass(), "organizationsUrl", "OcfNzHYdki");
        setField(term6005, term6005.getClass(), "reposUrl", "uPuCVuZYOI");
        setField(term6005, term6005.getClass(), "eventsUrl", "TweMFhxNdj");
        setField(term6005, term6005.getClass(), "receivedEventsUrl", "NBrvVzvQHe");
        setField(term6005, term6005.getClass(), "type", "FjOiNAfBOc");
        setField(term6005, term6005.getClass(), "siteAdmin", term6200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUrl", argTypes, term6005, args);
    }

};


