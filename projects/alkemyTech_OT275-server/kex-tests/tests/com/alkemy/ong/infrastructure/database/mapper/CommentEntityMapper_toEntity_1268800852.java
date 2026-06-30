package com.alkemy.ong.infrastructure.database.mapper;

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
import static com.alkemy.ong.infrastructure.database.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class CommentEntityMapper_toEntity_1268800852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1595;
     Object term1596;

    public CommentEntityMapper_toEntity_1268800852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1595 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.CommentEntityMapper"));
        setField(term1595, term1595.getClass(), "userEntityMapper", null);
        setField(term1595, term1595.getClass(), "newsEntityMapper", null);
        Long term1597 = new Long(-7672528020740371001L);
        Long term1612 = new Long(-4502405999831680926L);
        Long term1675 = new Long(1967728129628047933L);
        Long term1714 = new Long(2120084523938730454L);
        Long term1753 = new Long(6855071767938501807L);
        Long term1794 = new Long(-5892135042702373494L);
        Object term1793 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term1793, term1793.getClass(), "id", term1794);
        setField(term1793, term1793.getClass(), "body", null);
        setField(term1793, term1793.getClass(), "createdBy", null);
        setField(term1793, term1793.getClass(), "associatedNews", null);
        setField(term1793, term1793.getClass(), "createTimestamp", null);
        Long term1797 = new Long(-7738503207562305297L);
        Object term1796 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term1796, term1796.getClass(), "id", term1797);
        setField(term1796, term1796.getClass(), "body", null);
        setField(term1796, term1796.getClass(), "createdBy", null);
        setField(term1796, term1796.getClass(), "associatedNews", null);
        setField(term1796, term1796.getClass(), "createTimestamp", null);
        Object term1799 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term1799, term1799.getClass(), "id", null);
        setField(term1799, term1799.getClass(), "body", null);
        setField(term1799, term1799.getClass(), "createdBy", null);
        setField(term1799, term1799.getClass(), "associatedNews", null);
        setField(term1799, term1799.getClass(), "createTimestamp", null);
        Object term1800 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term1800, term1800.getClass(), "id", null);
        setField(term1800, term1800.getClass(), "body", null);
        setField(term1800, term1800.getClass(), "createdBy", null);
        setField(term1800, term1800.getClass(), "associatedNews", null);
        setField(term1800, term1800.getClass(), "createTimestamp", null);
        ArrayList term1791 = new ArrayList();
        ((ArrayList) term1791).add(term1793);
        ((ArrayList) term1791).add(term1796);
        ((ArrayList) term1791).add(term1799);
        ((ArrayList) term1791).add(term1800);
        term1596 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term1611 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term1674 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term1713 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term1752 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term1803 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1596, term1596.getClass(), "id", term1597);
        setField(term1596, term1596.getClass(), "body", "AWRooQKkdW");
        setField(term1611, term1611.getClass(), "id", term1612);
        setField(term1611, term1611.getClass(), "firstName", "vjxIhXHxGR");
        setField(term1611, term1611.getClass(), "lastName", "QXzGXbEXMu");
        setField(term1611, term1611.getClass(), "email", "qxSDVejjiY");
        setField(term1611, term1611.getClass(), "password", "xBsXSDjXYK");
        setField(term1611, term1611.getClass(), "imageUrl", "sEnIVFtZuQ");
        setField(term1674, term1674.getClass(), "id", term1675);
        setField(term1674, term1674.getClass(), "name", "ZVecLZMLHF");
        setField(term1674, term1674.getClass(), "description", "fztQhjqwdP");
        setField(term1611, term1611.getClass(), "role", term1674);
        setField(term1611, term1611.getClass(), "token", "eVpkWxjuki");
        setField(term1596, term1596.getClass(), "createdBy", term1611);
        setField(term1713, term1713.getClass(), "id", term1714);
        setField(term1713, term1713.getClass(), "name", "SJiQaLvSKv");
        setField(term1713, term1713.getClass(), "content", "OEXDRUKcFl");
        setField(term1713, term1713.getClass(), "imageUrl", "RYdKCNNMBR");
        setField(term1752, term1752.getClass(), "id", term1753);
        setField(term1752, term1752.getClass(), "name", "yGtHPyvYiQ");
        setField(term1752, term1752.getClass(), "description", "MvRIxilFMJ");
        setField(term1752, term1752.getClass(), "imageUrl", "iNwOJRBEjp");
        setField(term1713, term1713.getClass(), "category", term1752);
        setField(term1713, term1713.getClass(), "comments", term1791);
        setField(term1596, term1596.getClass(), "associatedNews", term1713);
        setIntField(term1803, term1803.getClass(), "nanos", 25000000);
        setLongField(term1803, term1803.getClass(), "fastTime", 1797192828000L);
        setField(term1803, term1803.getClass(), "cdate", null);
        setField(term1596, term1596.getClass(), "createTimestamp", term1803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.CommentEntityMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Comment");
        Object[] args = new Object[1];
        args[0] = term1596;
        callMethod(klass, "toEntity", argTypes, term1595, args);
    }

};


