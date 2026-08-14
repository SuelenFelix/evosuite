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

public class GithubOwnerResponse_setOrganizationsUrl_72440190126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11514;

    public GithubOwnerResponse_setOrganizationsUrl_72440190126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11527 = new Integer(1596070772);
        Boolean term11709 = new Boolean(false);
        term11514 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term11514, term11514.getClass(), "login", "XtiurrVYKw");
        setField(term11514, term11514.getClass(), "id", term11527);
        setField(term11514, term11514.getClass(), "nodeId", "rsumfoDNHa");
        setField(term11514, term11514.getClass(), "avatarUrl", "ceCWHUTQUM");
        setField(term11514, term11514.getClass(), "gravatarId", "LrqwfrKKtS");
        setField(term11514, term11514.getClass(), "url", "ZUdnQXfzCI");
        setField(term11514, term11514.getClass(), "htmlUrl", "EULDrUNQvw");
        setField(term11514, term11514.getClass(), "followersUrl", "BtvAvsJSei");
        setField(term11514, term11514.getClass(), "followingUrl", "vqnBkkxoIa");
        setField(term11514, term11514.getClass(), "gistsUrl", "bycpZjxXFn");
        setField(term11514, term11514.getClass(), "starredUrl", "jQWttOAiwL");
        setField(term11514, term11514.getClass(), "subscriptionsUrl", "DzKFxEuEEC");
        setField(term11514, term11514.getClass(), "organizationsUrl", "CAMnvfDLJL");
        setField(term11514, term11514.getClass(), "reposUrl", "mfHtgSbdjD");
        setField(term11514, term11514.getClass(), "eventsUrl", "cmuaUiHMVL");
        setField(term11514, term11514.getClass(), "receivedEventsUrl", "xjoSGPWUgu");
        setField(term11514, term11514.getClass(), "type", "uzmqjnOUXu");
        setField(term11514, term11514.getClass(), "siteAdmin", term11709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xeyjTOCOJb";
        callMethod(klass, "setOrganizationsUrl", argTypes, term11514, args);
    }

};


