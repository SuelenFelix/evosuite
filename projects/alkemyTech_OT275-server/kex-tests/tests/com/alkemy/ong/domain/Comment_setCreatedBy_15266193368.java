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

public class Comment_setCreatedBy_15266193368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9265;
     Object term9471;

    public Comment_setCreatedBy_15266193368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9266 = new Long(3713624957161771816L);
        Long term9281 = new Long(6130232388739280211L);
        Long term9344 = new Long(3423965054378869855L);
        Long term9383 = new Long(-593735869267672817L);
        Long term9422 = new Long(6041374912351843923L);
        Long term9463 = new Long(2535970782317488741L);
        Object term9462 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term9462, term9462.getClass(), "id", term9463);
        setField(term9462, term9462.getClass(), "body", null);
        setField(term9462, term9462.getClass(), "createdBy", null);
        setField(term9462, term9462.getClass(), "associatedNews", null);
        setField(term9462, term9462.getClass(), "createTimestamp", null);
        Object term9465 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term9465, term9465.getClass(), "id", null);
        setField(term9465, term9465.getClass(), "body", null);
        setField(term9465, term9465.getClass(), "createdBy", null);
        setField(term9465, term9465.getClass(), "associatedNews", null);
        setField(term9465, term9465.getClass(), "createTimestamp", null);
        ArrayList term9460 = new ArrayList();
        ((ArrayList) term9460).add(term9462);
        ((ArrayList) term9460).add(term9465);
        term9265 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term9280 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term9343 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term9382 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term9421 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term9468 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term9265, term9265.getClass(), "id", term9266);
        setField(term9265, term9265.getClass(), "body", "iSPirUEhXs");
        setField(term9280, term9280.getClass(), "id", term9281);
        setField(term9280, term9280.getClass(), "firstName", "WWyLFmYpAy");
        setField(term9280, term9280.getClass(), "lastName", "vbSWeJWOQh");
        setField(term9280, term9280.getClass(), "email", "hyvFdAvkOr");
        setField(term9280, term9280.getClass(), "password", "ewbQRtustW");
        setField(term9280, term9280.getClass(), "imageUrl", "cABEHYBnys");
        setField(term9343, term9343.getClass(), "id", term9344);
        setField(term9343, term9343.getClass(), "name", "EhlWSobaco");
        setField(term9343, term9343.getClass(), "description", "hEuycunsSe");
        setField(term9280, term9280.getClass(), "role", term9343);
        setField(term9280, term9280.getClass(), "token", "IMFzXhpNCx");
        setField(term9265, term9265.getClass(), "createdBy", term9280);
        setField(term9382, term9382.getClass(), "id", term9383);
        setField(term9382, term9382.getClass(), "name", "xAtFmANjwD");
        setField(term9382, term9382.getClass(), "content", "ICysuFllEZ");
        setField(term9382, term9382.getClass(), "imageUrl", "cGQJTTxcXr");
        setField(term9421, term9421.getClass(), "id", term9422);
        setField(term9421, term9421.getClass(), "name", "aKaqvssiby");
        setField(term9421, term9421.getClass(), "description", "tTVbtBVAfo");
        setField(term9421, term9421.getClass(), "imageUrl", "cjaaJUnNCR");
        setField(term9382, term9382.getClass(), "category", term9421);
        setField(term9382, term9382.getClass(), "comments", term9460);
        setField(term9265, term9265.getClass(), "associatedNews", term9382);
        setIntField(term9468, term9468.getClass(), "nanos", 842000000);
        setLongField(term9468, term9468.getClass(), "fastTime", 1595506783000L);
        setField(term9468, term9468.getClass(), "cdate", null);
        setField(term9265, term9265.getClass(), "createTimestamp", term9468);
        Long term9472 = new Long(4689907154423223972L);
        Long term9535 = new Long(8512025621149521819L);
        term9471 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term9534 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term9471, term9471.getClass(), "id", term9472);
        setField(term9471, term9471.getClass(), "firstName", "qBcAJgrABE");
        setField(term9471, term9471.getClass(), "lastName", "JKdZuLFRwC");
        setField(term9471, term9471.getClass(), "email", "hfhLLoWnRU");
        setField(term9471, term9471.getClass(), "password", "RpofnOPYha");
        setField(term9471, term9471.getClass(), "imageUrl", "CQYmAsjvPU");
        setField(term9534, term9534.getClass(), "id", term9535);
        setField(term9534, term9534.getClass(), "name", "NNkIIFpxiB");
        setField(term9534, term9534.getClass(), "description", "sBmtvFPDso");
        setField(term9471, term9471.getClass(), "role", term9534);
        setField(term9471, term9471.getClass(), "token", "qsUIxrLolr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Comment");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.User");
        Object[] args = new Object[1];
        args[0] = term9471;
        callMethod(klass, "setCreatedBy", argTypes, term9265, args);
    }

};


