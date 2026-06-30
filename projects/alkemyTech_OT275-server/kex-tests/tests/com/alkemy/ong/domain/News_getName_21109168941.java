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

public class News_getName_21109168941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17282;

    public News_getName_21109168941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17283 = new Long(-4562564710769146498L);
        Long term17322 = new Long(-6254265799185295775L);
        Long term17363 = new Long(3831994970480278159L);
        Long term17367 = new Long(-5714578622746827780L);
        Long term17370 = new Long(6269054578518955349L);
        Object term17362 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term17366 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term17369 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term17372 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term17362, term17362.getClass(), "id", term17363);
        setField(term17362, term17362.getClass(), "body", "");
        setField(term17366, term17366.getClass(), "id", term17367);
        setField(term17366, term17366.getClass(), "firstName", null);
        setField(term17366, term17366.getClass(), "lastName", null);
        setField(term17366, term17366.getClass(), "email", null);
        setField(term17366, term17366.getClass(), "password", null);
        setField(term17366, term17366.getClass(), "imageUrl", null);
        setField(term17366, term17366.getClass(), "role", null);
        setField(term17366, term17366.getClass(), "token", null);
        setField(term17362, term17362.getClass(), "createdBy", term17366);
        setField(term17369, term17369.getClass(), "id", term17370);
        setField(term17369, term17369.getClass(), "name", null);
        setField(term17369, term17369.getClass(), "content", null);
        setField(term17369, term17369.getClass(), "imageUrl", null);
        setField(term17369, term17369.getClass(), "category", null);
        setField(term17369, term17369.getClass(), "comments", null);
        setField(term17362, term17362.getClass(), "associatedNews", term17369);
        setIntField(term17372, term17372.getClass(), "nanos", 343000000);
        setLongField(term17372, term17372.getClass(), "fastTime", 1264027000000L);
        setField(term17372, term17372.getClass(), "cdate", null);
        setField(term17362, term17362.getClass(), "createTimestamp", term17372);
        Long term17376 = new Long(2018084438165711668L);
        Long term17380 = new Long(-8705953038984862378L);
        Long term17383 = new Long(8847748922379375307L);
        Object term17375 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term17379 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term17382 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term17385 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term17375, term17375.getClass(), "id", term17376);
        setField(term17375, term17375.getClass(), "body", "");
        setField(term17379, term17379.getClass(), "id", term17380);
        setField(term17379, term17379.getClass(), "firstName", null);
        setField(term17379, term17379.getClass(), "lastName", null);
        setField(term17379, term17379.getClass(), "email", null);
        setField(term17379, term17379.getClass(), "password", null);
        setField(term17379, term17379.getClass(), "imageUrl", null);
        setField(term17379, term17379.getClass(), "role", null);
        setField(term17379, term17379.getClass(), "token", null);
        setField(term17375, term17375.getClass(), "createdBy", term17379);
        setField(term17382, term17382.getClass(), "id", term17383);
        setField(term17382, term17382.getClass(), "name", null);
        setField(term17382, term17382.getClass(), "content", null);
        setField(term17382, term17382.getClass(), "imageUrl", null);
        setField(term17382, term17382.getClass(), "category", null);
        setField(term17382, term17382.getClass(), "comments", null);
        setField(term17375, term17375.getClass(), "associatedNews", term17382);
        setIntField(term17385, term17385.getClass(), "nanos", 263000000);
        setLongField(term17385, term17385.getClass(), "fastTime", 1713880355000L);
        setField(term17385, term17385.getClass(), "cdate", null);
        setField(term17375, term17375.getClass(), "createTimestamp", term17385);
        Long term17389 = new Long(3447455321955655601L);
        Object term17388 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term17392 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term17393 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term17394 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term17388, term17388.getClass(), "id", term17389);
        setField(term17388, term17388.getClass(), "body", "");
        setField(term17392, term17392.getClass(), "id", null);
        setField(term17392, term17392.getClass(), "firstName", null);
        setField(term17392, term17392.getClass(), "lastName", null);
        setField(term17392, term17392.getClass(), "email", null);
        setField(term17392, term17392.getClass(), "password", null);
        setField(term17392, term17392.getClass(), "imageUrl", null);
        setField(term17392, term17392.getClass(), "role", null);
        setField(term17392, term17392.getClass(), "token", null);
        setField(term17388, term17388.getClass(), "createdBy", term17392);
        setField(term17393, term17393.getClass(), "id", null);
        setField(term17393, term17393.getClass(), "name", null);
        setField(term17393, term17393.getClass(), "content", null);
        setField(term17393, term17393.getClass(), "imageUrl", null);
        setField(term17393, term17393.getClass(), "category", null);
        setField(term17393, term17393.getClass(), "comments", null);
        setField(term17388, term17388.getClass(), "associatedNews", term17393);
        setIntField(term17394, term17394.getClass(), "nanos", 294000000);
        setLongField(term17394, term17394.getClass(), "fastTime", 1263733356000L);
        setField(term17394, term17394.getClass(), "cdate", null);
        setField(term17388, term17388.getClass(), "createTimestamp", term17394);
        Long term17398 = new Long(-7574091101944828886L);
        Object term17397 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term17401 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term17402 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term17403 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term17397, term17397.getClass(), "id", term17398);
        setField(term17397, term17397.getClass(), "body", "");
        setField(term17401, term17401.getClass(), "id", null);
        setField(term17401, term17401.getClass(), "firstName", null);
        setField(term17401, term17401.getClass(), "lastName", null);
        setField(term17401, term17401.getClass(), "email", null);
        setField(term17401, term17401.getClass(), "password", null);
        setField(term17401, term17401.getClass(), "imageUrl", null);
        setField(term17401, term17401.getClass(), "role", null);
        setField(term17401, term17401.getClass(), "token", null);
        setField(term17397, term17397.getClass(), "createdBy", term17401);
        setField(term17402, term17402.getClass(), "id", null);
        setField(term17402, term17402.getClass(), "name", null);
        setField(term17402, term17402.getClass(), "content", null);
        setField(term17402, term17402.getClass(), "imageUrl", null);
        setField(term17402, term17402.getClass(), "category", null);
        setField(term17402, term17402.getClass(), "comments", null);
        setField(term17397, term17397.getClass(), "associatedNews", term17402);
        setIntField(term17403, term17403.getClass(), "nanos", 273000000);
        setLongField(term17403, term17403.getClass(), "fastTime", 1285650698000L);
        setField(term17403, term17403.getClass(), "cdate", null);
        setField(term17397, term17397.getClass(), "createTimestamp", term17403);
        Long term17407 = new Long(-6792339614909987294L);
        Object term17406 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term17410 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term17411 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term17406, term17406.getClass(), "id", term17407);
        setField(term17406, term17406.getClass(), "body", "");
        setField(term17410, term17410.getClass(), "id", null);
        setField(term17410, term17410.getClass(), "firstName", null);
        setField(term17410, term17410.getClass(), "lastName", null);
        setField(term17410, term17410.getClass(), "email", null);
        setField(term17410, term17410.getClass(), "password", null);
        setField(term17410, term17410.getClass(), "imageUrl", null);
        setField(term17410, term17410.getClass(), "role", null);
        setField(term17410, term17410.getClass(), "token", null);
        setField(term17406, term17406.getClass(), "createdBy", term17410);
        setField(term17406, term17406.getClass(), "associatedNews", term17393);
        setIntField(term17411, term17411.getClass(), "nanos", 575000000);
        setLongField(term17411, term17411.getClass(), "fastTime", 1643970313000L);
        setField(term17411, term17411.getClass(), "cdate", null);
        setField(term17406, term17406.getClass(), "createTimestamp", term17411);
        ArrayList term17360 = new ArrayList();
        ((ArrayList) term17360).add(term17362);
        ((ArrayList) term17360).add(term17375);
        ((ArrayList) term17360).add(term17388);
        ((ArrayList) term17360).add(term17388);
        ((ArrayList) term17360).add(term17397);
        ((ArrayList) term17360).add(term17406);
        term17282 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term17321 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term17282, term17282.getClass(), "id", term17283);
        setField(term17282, term17282.getClass(), "name", "IoRhBfdSuN");
        setField(term17282, term17282.getClass(), "content", "JGdxVjQzts");
        setField(term17282, term17282.getClass(), "imageUrl", "jEdjRikQtN");
        setField(term17321, term17321.getClass(), "id", term17322);
        setField(term17321, term17321.getClass(), "name", "fSNUaokVWs");
        setField(term17321, term17321.getClass(), "description", "dTxnMmHoVm");
        setField(term17321, term17321.getClass(), "imageUrl", "iswxaQUQgT");
        setField(term17282, term17282.getClass(), "category", term17321);
        setField(term17282, term17282.getClass(), "comments", term17360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.News");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term17282, args);
    }

};


