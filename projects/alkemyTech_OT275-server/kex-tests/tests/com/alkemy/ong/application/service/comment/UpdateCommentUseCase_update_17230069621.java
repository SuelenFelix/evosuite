package com.alkemy.ong.application.service.comment;

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
import static com.alkemy.ong.application.service.comment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class UpdateCommentUseCase_update_17230069621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363;
     Object term364;
     Object term570;

    public UpdateCommentUseCase_update_17230069621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363 = newInstance(Class.forName("com.alkemy.ong.application.service.comment.UpdateCommentUseCase"));
        setField(term363, term363.getClass(), "commentRepository", null);
        setField(term363, term363.getClass(), "operationAllowed", null);
        Long term365 = new Long(-7672528020740371001L);
        Long term380 = new Long(-4502405999831680926L);
        Long term443 = new Long(1967728129628047933L);
        Long term482 = new Long(2120084523938730454L);
        Long term521 = new Long(6855071767938501807L);
        Long term562 = new Long(-5892135042702373494L);
        Object term561 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term561, term561.getClass(), "id", term562);
        setField(term561, term561.getClass(), "body", null);
        setField(term561, term561.getClass(), "createdBy", null);
        setField(term561, term561.getClass(), "associatedNews", null);
        setField(term561, term561.getClass(), "createTimestamp", null);
        Object term564 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term564, term564.getClass(), "id", null);
        setField(term564, term564.getClass(), "body", null);
        setField(term564, term564.getClass(), "createdBy", null);
        setField(term564, term564.getClass(), "associatedNews", null);
        setField(term564, term564.getClass(), "createTimestamp", null);
        ArrayList term559 = new ArrayList();
        ((ArrayList) term559).add(term561);
        ((ArrayList) term559).add(term564);
        term364 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term379 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term442 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term481 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term520 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term567 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term364, term364.getClass(), "id", term365);
        setField(term364, term364.getClass(), "body", "idgaQsnJpQ");
        setField(term379, term379.getClass(), "id", term380);
        setField(term379, term379.getClass(), "firstName", "VgZnGoIFwQ");
        setField(term379, term379.getClass(), "lastName", "jUbSRrkrYZ");
        setField(term379, term379.getClass(), "email", "bWWfajKbEX");
        setField(term379, term379.getClass(), "password", "cAPeiZHKGJ");
        setField(term379, term379.getClass(), "imageUrl", "LvJFtLBaxj");
        setField(term442, term442.getClass(), "id", term443);
        setField(term442, term442.getClass(), "name", "PHvxnGHptP");
        setField(term442, term442.getClass(), "description", "TimdotUuNC");
        setField(term379, term379.getClass(), "role", term442);
        setField(term379, term379.getClass(), "token", "PkWMRdJcBb");
        setField(term364, term364.getClass(), "createdBy", term379);
        setField(term481, term481.getClass(), "id", term482);
        setField(term481, term481.getClass(), "name", "jSpAteRute");
        setField(term481, term481.getClass(), "content", "swZVeJAxjt");
        setField(term481, term481.getClass(), "imageUrl", "xOcJIiQQDu");
        setField(term520, term520.getClass(), "id", term521);
        setField(term520, term520.getClass(), "name", "GVizqqzXpy");
        setField(term520, term520.getClass(), "description", "JqXGgAhZPl");
        setField(term520, term520.getClass(), "imageUrl", "jiKYgYHqIS");
        setField(term481, term481.getClass(), "category", term520);
        setField(term481, term481.getClass(), "comments", term559);
        setField(term364, term364.getClass(), "associatedNews", term481);
        setIntField(term567, term567.getClass(), "nanos", 25000000);
        setLongField(term567, term567.getClass(), "fastTime", 1797192828000L);
        setField(term567, term567.getClass(), "cdate", null);
        setField(term364, term364.getClass(), "createTimestamp", term567);
        Long term571 = new Long(-3842548265506930260L);
        Long term586 = new Long(-5788180182343976541L);
        Long term649 = new Long(2936323121573284007L);
        Long term688 = new Long(-1154553077993834885L);
        Long term727 = new Long(-2850532706972744550L);
        Long term768 = new Long(-2644215923136513282L);
        Object term767 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term767, term767.getClass(), "id", term768);
        setField(term767, term767.getClass(), "body", null);
        setField(term767, term767.getClass(), "createdBy", null);
        setField(term767, term767.getClass(), "associatedNews", null);
        setField(term767, term767.getClass(), "createTimestamp", null);
        Object term770 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term770, term770.getClass(), "id", null);
        setField(term770, term770.getClass(), "body", null);
        setField(term770, term770.getClass(), "createdBy", null);
        setField(term770, term770.getClass(), "associatedNews", null);
        setField(term770, term770.getClass(), "createTimestamp", null);
        Long term772 = new Long(-7291743527973326814L);
        Object term771 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term771, term771.getClass(), "id", term772);
        setField(term771, term771.getClass(), "body", null);
        setField(term771, term771.getClass(), "createdBy", null);
        setField(term771, term771.getClass(), "associatedNews", null);
        setField(term771, term771.getClass(), "createTimestamp", null);
        ArrayList term765 = new ArrayList();
        ((ArrayList) term765).add(term767);
        ((ArrayList) term765).add(term767);
        ((ArrayList) term765).add(term767);
        ((ArrayList) term765).add(term770);
        ((ArrayList) term765).add(term771);
        term570 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term585 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term648 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term687 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term726 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term776 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term570, term570.getClass(), "id", term571);
        setField(term570, term570.getClass(), "body", "jwsfVjMoJT");
        setField(term585, term585.getClass(), "id", term586);
        setField(term585, term585.getClass(), "firstName", "ZfdXfCCFDf");
        setField(term585, term585.getClass(), "lastName", "MwwjNtdOFT");
        setField(term585, term585.getClass(), "email", "VYkqXKVlAJ");
        setField(term585, term585.getClass(), "password", "XkIoWJRNwN");
        setField(term585, term585.getClass(), "imageUrl", "aNWLJdrZMq");
        setField(term648, term648.getClass(), "id", term649);
        setField(term648, term648.getClass(), "name", "HHmNoYxIGj");
        setField(term648, term648.getClass(), "description", "PtirvZmsGt");
        setField(term585, term585.getClass(), "role", term648);
        setField(term585, term585.getClass(), "token", "HWkpTmtlrc");
        setField(term570, term570.getClass(), "createdBy", term585);
        setField(term687, term687.getClass(), "id", term688);
        setField(term687, term687.getClass(), "name", "hMmaoREuCK");
        setField(term687, term687.getClass(), "content", "VeDtgDzGAN");
        setField(term687, term687.getClass(), "imageUrl", "aWYOWZFyaX");
        setField(term726, term726.getClass(), "id", term727);
        setField(term726, term726.getClass(), "name", "BRIVNtfUWU");
        setField(term726, term726.getClass(), "description", "DbiCVtPPCT");
        setField(term726, term726.getClass(), "imageUrl", "WzFopsaDuG");
        setField(term687, term687.getClass(), "category", term726);
        setField(term687, term687.getClass(), "comments", term765);
        setField(term570, term570.getClass(), "associatedNews", term687);
        setIntField(term776, term776.getClass(), "nanos", 580000000);
        setLongField(term776, term776.getClass(), "fastTime", 1437746523000L);
        setField(term776, term776.getClass(), "cdate", null);
        setField(term570, term570.getClass(), "createTimestamp", term776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.comment.UpdateCommentUseCase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Comment");
        argTypes[1] = Class.forName("com.alkemy.ong.domain.Comment");
        Object[] args = new Object[2];
        args[0] = term364;
        args[1] = term570;
        callMethod(klass, "update", argTypes, term363, args);
    }

};


