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

public class Comment_getAssociatedNews_16628147944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7800;

    public Comment_getAssociatedNews_16628147944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7801 = new Long(-433040798405298080L);
        Long term7816 = new Long(-1505191021111100819L);
        Long term7879 = new Long(-1000830646340880796L);
        Long term7918 = new Long(5973526439563541711L);
        Long term7957 = new Long(5246058710498845622L);
        Long term7998 = new Long(4394651392080968777L);
        Object term7997 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term7997, term7997.getClass(), "id", term7998);
        setField(term7997, term7997.getClass(), "body", null);
        setField(term7997, term7997.getClass(), "createdBy", null);
        setField(term7997, term7997.getClass(), "associatedNews", null);
        setField(term7997, term7997.getClass(), "createTimestamp", null);
        Long term8001 = new Long(3580984732036213717L);
        Object term8000 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term8000, term8000.getClass(), "id", term8001);
        setField(term8000, term8000.getClass(), "body", null);
        setField(term8000, term8000.getClass(), "createdBy", null);
        setField(term8000, term8000.getClass(), "associatedNews", null);
        setField(term8000, term8000.getClass(), "createTimestamp", null);
        Long term8004 = new Long(-8338004844694486146L);
        Object term8003 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term8003, term8003.getClass(), "id", term8004);
        setField(term8003, term8003.getClass(), "body", null);
        setField(term8003, term8003.getClass(), "createdBy", null);
        setField(term8003, term8003.getClass(), "associatedNews", null);
        setField(term8003, term8003.getClass(), "createTimestamp", null);
        Long term8007 = new Long(-4043093655001688454L);
        Object term8006 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term8006, term8006.getClass(), "id", term8007);
        setField(term8006, term8006.getClass(), "body", null);
        setField(term8006, term8006.getClass(), "createdBy", null);
        setField(term8006, term8006.getClass(), "associatedNews", null);
        setField(term8006, term8006.getClass(), "createTimestamp", null);
        ArrayList term7995 = new ArrayList();
        ((ArrayList) term7995).add(term7997);
        ((ArrayList) term7995).add(term8000);
        ((ArrayList) term7995).add(term8003);
        ((ArrayList) term7995).add(term7997);
        ((ArrayList) term7995).add(term8006);
        term7800 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term7815 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term7878 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term7917 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term7956 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term8011 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term7800, term7800.getClass(), "id", term7801);
        setField(term7800, term7800.getClass(), "body", "PoTZjDuBHa");
        setField(term7815, term7815.getClass(), "id", term7816);
        setField(term7815, term7815.getClass(), "firstName", "MIwvgVrhzP");
        setField(term7815, term7815.getClass(), "lastName", "HcUUieXdep");
        setField(term7815, term7815.getClass(), "email", "AbonCTtbef");
        setField(term7815, term7815.getClass(), "password", "maXrGOGoKA");
        setField(term7815, term7815.getClass(), "imageUrl", "zAkgWQVCpM");
        setField(term7878, term7878.getClass(), "id", term7879);
        setField(term7878, term7878.getClass(), "name", "yQUDyOroXU");
        setField(term7878, term7878.getClass(), "description", "xweqkPdyJH");
        setField(term7815, term7815.getClass(), "role", term7878);
        setField(term7815, term7815.getClass(), "token", "kwteHWzwcc");
        setField(term7800, term7800.getClass(), "createdBy", term7815);
        setField(term7917, term7917.getClass(), "id", term7918);
        setField(term7917, term7917.getClass(), "name", "uMsWXqNhln");
        setField(term7917, term7917.getClass(), "content", "MAnhIPOtHL");
        setField(term7917, term7917.getClass(), "imageUrl", "dikKjYjmRO");
        setField(term7956, term7956.getClass(), "id", term7957);
        setField(term7956, term7956.getClass(), "name", "GJnnMDVnEP");
        setField(term7956, term7956.getClass(), "description", "zSMVllDpfk");
        setField(term7956, term7956.getClass(), "imageUrl", "iptRXVDoYE");
        setField(term7917, term7917.getClass(), "category", term7956);
        setField(term7917, term7917.getClass(), "comments", term7995);
        setField(term7800, term7800.getClass(), "associatedNews", term7917);
        setIntField(term8011, term8011.getClass(), "nanos", 131000000);
        setLongField(term8011, term8011.getClass(), "fastTime", 1804987287000L);
        setField(term8011, term8011.getClass(), "cdate", null);
        setField(term7800, term7800.getClass(), "createTimestamp", term8011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAssociatedNews", argTypes, term7800, args);
    }

};


