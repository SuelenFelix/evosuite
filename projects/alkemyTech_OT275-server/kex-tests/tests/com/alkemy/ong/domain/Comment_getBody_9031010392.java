package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class Comment_getBody_9031010392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7079;

    public Comment_getBody_9031010392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7080 = new Long(-3948863953565024517L);
        Long term7095 = new Long(-6587807377747738663L);
        Long term7158 = new Long(-6301101997917060727L);
        Long term7197 = new Long(8166095254618543564L);
        Long term7236 = new Long(-4598158870068953328L);
        Long term7277 = new Long(138235087558060686L);
        Object term7276 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term7276, term7276.getClass(), "id", term7277);
        setField(term7276, term7276.getClass(), "body", null);
        setField(term7276, term7276.getClass(), "createdBy", null);
        setField(term7276, term7276.getClass(), "associatedNews", null);
        setField(term7276, term7276.getClass(), "createTimestamp", null);
        Long term7280 = new Long(-7291742736502427077L);
        Object term7279 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term7279, term7279.getClass(), "id", term7280);
        setField(term7279, term7279.getClass(), "body", null);
        setField(term7279, term7279.getClass(), "createdBy", null);
        setField(term7279, term7279.getClass(), "associatedNews", null);
        setField(term7279, term7279.getClass(), "createTimestamp", null);
        Object term7282 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term7282, term7282.getClass(), "id", null);
        setField(term7282, term7282.getClass(), "body", null);
        setField(term7282, term7282.getClass(), "createdBy", null);
        setField(term7282, term7282.getClass(), "associatedNews", null);
        setField(term7282, term7282.getClass(), "createTimestamp", null);
        Object term7283 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term7283, term7283.getClass(), "id", null);
        setField(term7283, term7283.getClass(), "body", null);
        setField(term7283, term7283.getClass(), "createdBy", null);
        setField(term7283, term7283.getClass(), "associatedNews", null);
        setField(term7283, term7283.getClass(), "createTimestamp", null);
        Object term7284 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term7284, term7284.getClass(), "id", null);
        setField(term7284, term7284.getClass(), "body", null);
        setField(term7284, term7284.getClass(), "createdBy", null);
        setField(term7284, term7284.getClass(), "associatedNews", null);
        setField(term7284, term7284.getClass(), "createTimestamp", null);
        ArrayList term7274 = new ArrayList();
        ((ArrayList) term7274).add(term7276);
        ((ArrayList) term7274).add(term7279);
        ((ArrayList) term7274).add(term7282);
        ((ArrayList) term7274).add(term7283);
        ((ArrayList) term7274).add(term7284);
        term7079 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term7094 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term7157 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term7196 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term7235 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term7287 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term7079, term7079.getClass(), "id", term7080);
        setField(term7079, term7079.getClass(), "body", "XZkOUcbfFg");
        setField(term7094, term7094.getClass(), "id", term7095);
        setField(term7094, term7094.getClass(), "firstName", "TGiJfagfky");
        setField(term7094, term7094.getClass(), "lastName", "BJklinBmhN");
        setField(term7094, term7094.getClass(), "email", "IOddzvEWcl");
        setField(term7094, term7094.getClass(), "password", "bIrtpkYJWT");
        setField(term7094, term7094.getClass(), "imageUrl", "VuLLXpvPpZ");
        setField(term7157, term7157.getClass(), "id", term7158);
        setField(term7157, term7157.getClass(), "name", "UEdzEKEEEV");
        setField(term7157, term7157.getClass(), "description", "BcENaQFYSd");
        setField(term7094, term7094.getClass(), "role", term7157);
        setField(term7094, term7094.getClass(), "token", "POPYycoDBy");
        setField(term7079, term7079.getClass(), "createdBy", term7094);
        setField(term7196, term7196.getClass(), "id", term7197);
        setField(term7196, term7196.getClass(), "name", "LuWMOXdAPA");
        setField(term7196, term7196.getClass(), "content", "blSffTnsOv");
        setField(term7196, term7196.getClass(), "imageUrl", "qbUMcIvEXH");
        setField(term7235, term7235.getClass(), "id", term7236);
        setField(term7235, term7235.getClass(), "name", "TVxGTjeDcu");
        setField(term7235, term7235.getClass(), "description", "ABPtcyCzkR");
        setField(term7235, term7235.getClass(), "imageUrl", "QgHhxMyKvr");
        setField(term7196, term7196.getClass(), "category", term7235);
        setField(term7196, term7196.getClass(), "comments", term7274);
        setField(term7079, term7079.getClass(), "associatedNews", term7196);
        setIntField(term7287, term7287.getClass(), "nanos", 23000000);
        setLongField(term7287, term7287.getClass(), "fastTime", 1500710268000L);
        setField(term7287, term7287.getClass(), "cdate", null);
        setField(term7079, term7079.getClass(), "createTimestamp", term7287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBody", argTypes, term7079, args);
    }

};


