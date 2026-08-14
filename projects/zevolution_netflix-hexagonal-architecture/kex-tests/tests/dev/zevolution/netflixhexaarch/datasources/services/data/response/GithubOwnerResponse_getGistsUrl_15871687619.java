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

public class GithubOwnerResponse_getGistsUrl_15871687619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8949;

    public GithubOwnerResponse_getGistsUrl_15871687619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8962 = new Integer(2055867847);
        Boolean term9144 = new Boolean(false);
        term8949 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term8949, term8949.getClass(), "login", "sOdkipUKRu");
        setField(term8949, term8949.getClass(), "id", term8962);
        setField(term8949, term8949.getClass(), "nodeId", "oKwCDqywym");
        setField(term8949, term8949.getClass(), "avatarUrl", "zjZYTddemL");
        setField(term8949, term8949.getClass(), "gravatarId", "QtrylgCLiF");
        setField(term8949, term8949.getClass(), "url", "orEuhCStGM");
        setField(term8949, term8949.getClass(), "htmlUrl", "HhEaSXWvrY");
        setField(term8949, term8949.getClass(), "followersUrl", "CVRGEomOth");
        setField(term8949, term8949.getClass(), "followingUrl", "vSeruUyNWX");
        setField(term8949, term8949.getClass(), "gistsUrl", "UkKvaeJfEC");
        setField(term8949, term8949.getClass(), "starredUrl", "WPxXsahPRq");
        setField(term8949, term8949.getClass(), "subscriptionsUrl", "IENRuqmwUU");
        setField(term8949, term8949.getClass(), "organizationsUrl", "GsWxOwXvSu");
        setField(term8949, term8949.getClass(), "reposUrl", "bKBSncrMEZ");
        setField(term8949, term8949.getClass(), "eventsUrl", "yeSXGqQExb");
        setField(term8949, term8949.getClass(), "receivedEventsUrl", "uXYcXVYJZM");
        setField(term8949, term8949.getClass(), "type", "BJhjdJUhkz");
        setField(term8949, term8949.getClass(), "siteAdmin", term9144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGistsUrl", argTypes, term8949, args);
    }

};


