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

public class GithubOwnerResponse_setUrl_64841282312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6362;

    public GithubOwnerResponse_setUrl_64841282312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6375 = new Integer(-1016503459);
        Boolean term6557 = new Boolean(true);
        term6362 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term6362, term6362.getClass(), "login", "iCCsaLHohG");
        setField(term6362, term6362.getClass(), "id", term6375);
        setField(term6362, term6362.getClass(), "nodeId", "NJhGgctbdj");
        setField(term6362, term6362.getClass(), "avatarUrl", "MYWYUeLGOp");
        setField(term6362, term6362.getClass(), "gravatarId", "tsTGdgQYUL");
        setField(term6362, term6362.getClass(), "url", "TtGbVmKcnX");
        setField(term6362, term6362.getClass(), "htmlUrl", "GJVkUrCVdD");
        setField(term6362, term6362.getClass(), "followersUrl", "zNdorvdUgu");
        setField(term6362, term6362.getClass(), "followingUrl", "oPxuZbkYio");
        setField(term6362, term6362.getClass(), "gistsUrl", "vKitydDVnM");
        setField(term6362, term6362.getClass(), "starredUrl", "urCiQnUFBM");
        setField(term6362, term6362.getClass(), "subscriptionsUrl", "EKjQdtKxAM");
        setField(term6362, term6362.getClass(), "organizationsUrl", "TXZAIPQJHt");
        setField(term6362, term6362.getClass(), "reposUrl", "DIbeDHICho");
        setField(term6362, term6362.getClass(), "eventsUrl", "dJGPlmSRnz");
        setField(term6362, term6362.getClass(), "receivedEventsUrl", "DPskuFUobI");
        setField(term6362, term6362.getClass(), "type", "wBGfLpNNiZ");
        setField(term6362, term6362.getClass(), "siteAdmin", term6557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yUGCjlqgJE";
        callMethod(klass, "setUrl", argTypes, term6362, args);
    }

};


