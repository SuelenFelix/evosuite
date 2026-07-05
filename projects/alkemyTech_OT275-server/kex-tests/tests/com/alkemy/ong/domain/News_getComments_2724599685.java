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

public class News_getComments_2724599685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18024;

    public News_getComments_2724599685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18025 = new Long(5160033404788124731L);
        Long term18064 = new Long(5071015720043054072L);
        Long term18105 = new Long(-7006877527579112761L);
        Long term18109 = new Long(-8699693633047465617L);
        Long term18112 = new Long(6978548804004471804L);
        Object term18104 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term18108 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term18111 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term18114 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term18104, term18104.getClass(), "id", term18105);
        setField(term18104, term18104.getClass(), "body", "");
        setField(term18108, term18108.getClass(), "id", term18109);
        setField(term18108, term18108.getClass(), "firstName", null);
        setField(term18108, term18108.getClass(), "lastName", null);
        setField(term18108, term18108.getClass(), "email", null);
        setField(term18108, term18108.getClass(), "password", null);
        setField(term18108, term18108.getClass(), "imageUrl", null);
        setField(term18108, term18108.getClass(), "role", null);
        setField(term18108, term18108.getClass(), "token", null);
        setField(term18104, term18104.getClass(), "createdBy", term18108);
        setField(term18111, term18111.getClass(), "id", term18112);
        setField(term18111, term18111.getClass(), "name", null);
        setField(term18111, term18111.getClass(), "content", null);
        setField(term18111, term18111.getClass(), "imageUrl", null);
        setField(term18111, term18111.getClass(), "category", null);
        setField(term18111, term18111.getClass(), "comments", null);
        setField(term18104, term18104.getClass(), "associatedNews", term18111);
        setIntField(term18114, term18114.getClass(), "nanos", 357000000);
        setLongField(term18114, term18114.getClass(), "fastTime", 1830742277000L);
        setField(term18114, term18114.getClass(), "cdate", null);
        setField(term18104, term18104.getClass(), "createTimestamp", term18114);
        Long term18118 = new Long(5498944509671266637L);
        Long term18122 = new Long(-6838909359433858599L);
        Long term18125 = new Long(4548576710115075073L);
        Object term18117 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term18121 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term18124 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term18127 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term18117, term18117.getClass(), "id", term18118);
        setField(term18117, term18117.getClass(), "body", "");
        setField(term18121, term18121.getClass(), "id", term18122);
        setField(term18121, term18121.getClass(), "firstName", null);
        setField(term18121, term18121.getClass(), "lastName", null);
        setField(term18121, term18121.getClass(), "email", null);
        setField(term18121, term18121.getClass(), "password", null);
        setField(term18121, term18121.getClass(), "imageUrl", null);
        setField(term18121, term18121.getClass(), "role", null);
        setField(term18121, term18121.getClass(), "token", null);
        setField(term18117, term18117.getClass(), "createdBy", term18121);
        setField(term18124, term18124.getClass(), "id", term18125);
        setField(term18124, term18124.getClass(), "name", null);
        setField(term18124, term18124.getClass(), "content", null);
        setField(term18124, term18124.getClass(), "imageUrl", null);
        setField(term18124, term18124.getClass(), "category", null);
        setField(term18124, term18124.getClass(), "comments", null);
        setField(term18117, term18117.getClass(), "associatedNews", term18124);
        setIntField(term18127, term18127.getClass(), "nanos", 295000000);
        setLongField(term18127, term18127.getClass(), "fastTime", 1303878982000L);
        setField(term18127, term18127.getClass(), "cdate", null);
        setField(term18117, term18117.getClass(), "createTimestamp", term18127);
        Long term18131 = new Long(-5304831679802174866L);
        Object term18130 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term18134 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term18135 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term18136 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term18130, term18130.getClass(), "id", term18131);
        setField(term18130, term18130.getClass(), "body", "");
        setField(term18134, term18134.getClass(), "id", null);
        setField(term18134, term18134.getClass(), "firstName", null);
        setField(term18134, term18134.getClass(), "lastName", null);
        setField(term18134, term18134.getClass(), "email", null);
        setField(term18134, term18134.getClass(), "password", null);
        setField(term18134, term18134.getClass(), "imageUrl", null);
        setField(term18134, term18134.getClass(), "role", null);
        setField(term18134, term18134.getClass(), "token", null);
        setField(term18130, term18130.getClass(), "createdBy", term18134);
        setField(term18135, term18135.getClass(), "id", null);
        setField(term18135, term18135.getClass(), "name", null);
        setField(term18135, term18135.getClass(), "content", null);
        setField(term18135, term18135.getClass(), "imageUrl", null);
        setField(term18135, term18135.getClass(), "category", null);
        setField(term18135, term18135.getClass(), "comments", null);
        setField(term18130, term18130.getClass(), "associatedNews", term18135);
        setIntField(term18136, term18136.getClass(), "nanos", 249000000);
        setLongField(term18136, term18136.getClass(), "fastTime", 1695459581000L);
        setField(term18136, term18136.getClass(), "cdate", null);
        setField(term18130, term18130.getClass(), "createTimestamp", term18136);
        Long term18140 = new Long(3535528164828723056L);
        Object term18139 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term18143 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term18144 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term18145 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term18139, term18139.getClass(), "id", term18140);
        setField(term18139, term18139.getClass(), "body", "");
        setField(term18143, term18143.getClass(), "id", null);
        setField(term18143, term18143.getClass(), "firstName", null);
        setField(term18143, term18143.getClass(), "lastName", null);
        setField(term18143, term18143.getClass(), "email", null);
        setField(term18143, term18143.getClass(), "password", null);
        setField(term18143, term18143.getClass(), "imageUrl", null);
        setField(term18143, term18143.getClass(), "role", null);
        setField(term18143, term18143.getClass(), "token", null);
        setField(term18139, term18139.getClass(), "createdBy", term18143);
        setField(term18144, term18144.getClass(), "id", null);
        setField(term18144, term18144.getClass(), "name", null);
        setField(term18144, term18144.getClass(), "content", null);
        setField(term18144, term18144.getClass(), "imageUrl", null);
        setField(term18144, term18144.getClass(), "category", null);
        setField(term18144, term18144.getClass(), "comments", null);
        setField(term18139, term18139.getClass(), "associatedNews", term18144);
        setIntField(term18145, term18145.getClass(), "nanos", 305000000);
        setLongField(term18145, term18145.getClass(), "fastTime", 1584125791000L);
        setField(term18145, term18145.getClass(), "cdate", null);
        setField(term18139, term18139.getClass(), "createTimestamp", term18145);
        ArrayList term18102 = new ArrayList();
        ((ArrayList) term18102).add(term18104);
        ((ArrayList) term18102).add(term18117);
        ((ArrayList) term18102).add(term18130);
        ((ArrayList) term18102).add(term18139);
        term18024 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term18063 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term18024, term18024.getClass(), "id", term18025);
        setField(term18024, term18024.getClass(), "name", "lOIEIGbwPj");
        setField(term18024, term18024.getClass(), "content", "TvmWaJWmLY");
        setField(term18024, term18024.getClass(), "imageUrl", "TSUdwgvHgU");
        setField(term18063, term18063.getClass(), "id", term18064);
        setField(term18063, term18063.getClass(), "name", "YBQxTjzIrN");
        setField(term18063, term18063.getClass(), "description", "xfqaJVcHGx");
        setField(term18063, term18063.getClass(), "imageUrl", "bANxpqKESI");
        setField(term18024, term18024.getClass(), "category", term18063);
        setField(term18024, term18024.getClass(), "comments", term18102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.News");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComments", argTypes, term18024, args);
    }

};


