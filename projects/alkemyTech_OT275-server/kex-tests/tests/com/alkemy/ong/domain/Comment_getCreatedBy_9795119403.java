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

public class Comment_getCreatedBy_9795119403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7440;

    public Comment_getCreatedBy_9795119403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7441 = new Long(-8471550651709805183L);
        Long term7456 = new Long(-948292411727204525L);
        Long term7519 = new Long(-8892586408602479513L);
        Long term7558 = new Long(4616440478358528406L);
        Long term7597 = new Long(3427570961451840069L);
        Long term7638 = new Long(4502292577098212311L);
        Object term7637 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term7637, term7637.getClass(), "id", term7638);
        setField(term7637, term7637.getClass(), "body", null);
        setField(term7637, term7637.getClass(), "createdBy", null);
        setField(term7637, term7637.getClass(), "associatedNews", null);
        setField(term7637, term7637.getClass(), "createTimestamp", null);
        Object term7640 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term7640, term7640.getClass(), "id", null);
        setField(term7640, term7640.getClass(), "body", null);
        setField(term7640, term7640.getClass(), "createdBy", null);
        setField(term7640, term7640.getClass(), "associatedNews", null);
        setField(term7640, term7640.getClass(), "createTimestamp", null);
        Object term7641 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term7641, term7641.getClass(), "id", null);
        setField(term7641, term7641.getClass(), "body", null);
        setField(term7641, term7641.getClass(), "createdBy", null);
        setField(term7641, term7641.getClass(), "associatedNews", null);
        setField(term7641, term7641.getClass(), "createTimestamp", null);
        Long term7643 = new Long(3412644969878030772L);
        Object term7642 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term7642, term7642.getClass(), "id", term7643);
        setField(term7642, term7642.getClass(), "body", null);
        setField(term7642, term7642.getClass(), "createdBy", null);
        setField(term7642, term7642.getClass(), "associatedNews", null);
        setField(term7642, term7642.getClass(), "createTimestamp", null);
        ArrayList term7635 = new ArrayList();
        ((ArrayList) term7635).add(term7637);
        ((ArrayList) term7635).add(term7640);
        ((ArrayList) term7635).add(term7641);
        ((ArrayList) term7635).add(term7641);
        ((ArrayList) term7635).add(term7642);
        ((ArrayList) term7635).add(term7640);
        term7440 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term7455 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term7518 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term7557 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term7596 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term7647 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term7440, term7440.getClass(), "id", term7441);
        setField(term7440, term7440.getClass(), "body", "utCuuVCKqE");
        setField(term7455, term7455.getClass(), "id", term7456);
        setField(term7455, term7455.getClass(), "firstName", "zSfoqzJbPT");
        setField(term7455, term7455.getClass(), "lastName", "QUymMnsCIj");
        setField(term7455, term7455.getClass(), "email", "ikTtOgdVYS");
        setField(term7455, term7455.getClass(), "password", "JptuwlirlS");
        setField(term7455, term7455.getClass(), "imageUrl", "TKOMaGswbU");
        setField(term7518, term7518.getClass(), "id", term7519);
        setField(term7518, term7518.getClass(), "name", "YcTbglHiUq");
        setField(term7518, term7518.getClass(), "description", "TiUqHrjoEU");
        setField(term7455, term7455.getClass(), "role", term7518);
        setField(term7455, term7455.getClass(), "token", "eoEvZbdLjL");
        setField(term7440, term7440.getClass(), "createdBy", term7455);
        setField(term7557, term7557.getClass(), "id", term7558);
        setField(term7557, term7557.getClass(), "name", "BkIxsyPkGy");
        setField(term7557, term7557.getClass(), "content", "mrMGwoRgVY");
        setField(term7557, term7557.getClass(), "imageUrl", "mxVLTgCwki");
        setField(term7596, term7596.getClass(), "id", term7597);
        setField(term7596, term7596.getClass(), "name", "wCurppnDSA");
        setField(term7596, term7596.getClass(), "description", "JydxSNTMYt");
        setField(term7596, term7596.getClass(), "imageUrl", "KpurAcrHYT");
        setField(term7557, term7557.getClass(), "category", term7596);
        setField(term7557, term7557.getClass(), "comments", term7635);
        setField(term7440, term7440.getClass(), "associatedNews", term7557);
        setIntField(term7647, term7647.getClass(), "nanos", 457000000);
        setLongField(term7647, term7647.getClass(), "fastTime", 1706067372000L);
        setField(term7647, term7647.getClass(), "cdate", null);
        setField(term7440, term7440.getClass(), "createTimestamp", term7647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedBy", argTypes, term7440, args);
    }

};


