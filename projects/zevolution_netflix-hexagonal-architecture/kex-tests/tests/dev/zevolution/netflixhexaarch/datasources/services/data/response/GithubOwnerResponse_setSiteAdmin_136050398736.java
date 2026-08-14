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

public class GithubOwnerResponse_setSiteAdmin_136050398736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15194;
     Object term15391;

    public GithubOwnerResponse_setSiteAdmin_136050398736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term15207 = new Integer(287287233);
        Boolean term15389 = new Boolean(true);
        term15194 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term15194, term15194.getClass(), "login", "UEdzEKEEEV");
        setField(term15194, term15194.getClass(), "id", term15207);
        setField(term15194, term15194.getClass(), "nodeId", "BcENaQFYSd");
        setField(term15194, term15194.getClass(), "avatarUrl", "POPYycoDBy");
        setField(term15194, term15194.getClass(), "gravatarId", "LuWMOXdAPA");
        setField(term15194, term15194.getClass(), "url", "blSffTnsOv");
        setField(term15194, term15194.getClass(), "htmlUrl", "qbUMcIvEXH");
        setField(term15194, term15194.getClass(), "followersUrl", "TVxGTjeDcu");
        setField(term15194, term15194.getClass(), "followingUrl", "ABPtcyCzkR");
        setField(term15194, term15194.getClass(), "gistsUrl", "QgHhxMyKvr");
        setField(term15194, term15194.getClass(), "starredUrl", "VGiXZZTWRO");
        setField(term15194, term15194.getClass(), "subscriptionsUrl", "MlPtwXnJOJ");
        setField(term15194, term15194.getClass(), "organizationsUrl", "DbfiyFeaTe");
        setField(term15194, term15194.getClass(), "reposUrl", "dQxXGBtDLZ");
        setField(term15194, term15194.getClass(), "eventsUrl", "EgSgEFIyyN");
        setField(term15194, term15194.getClass(), "receivedEventsUrl", "iAOFcXaLSf");
        setField(term15194, term15194.getClass(), "type", "EHoNUaeyvT");
        setField(term15194, term15194.getClass(), "siteAdmin", term15389);
        term15391 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term15391;
        callMethod(klass, "setSiteAdmin", argTypes, term15194, args);
    }

};


