package com.alkemy.ong.infrastructure.database.repository;

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
import static com.alkemy.ong.infrastructure.database.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class CommentRepository_create_11534761984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public CommentRepository_create_11534761984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Long term17 = new Long(6375119433582206027L);
        Long term80 = new Long(-8257434502486459194L);
        Long term119 = new Long(-8400487765614892086L);
        Long term158 = new Long(5270370404989704783L);
        Long term199 = new Long(7411271909051562686L);
        Object term198 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term198, term198.getClass(), "id", term199);
        setField(term198, term198.getClass(), "body", null);
        setField(term198, term198.getClass(), "createdBy", null);
        setField(term198, term198.getClass(), "associatedNews", null);
        setField(term198, term198.getClass(), "createTimestamp", null);
        Long term202 = new Long(8428634514691209827L);
        Object term201 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term201, term201.getClass(), "id", term202);
        setField(term201, term201.getClass(), "body", null);
        setField(term201, term201.getClass(), "createdBy", null);
        setField(term201, term201.getClass(), "associatedNews", null);
        setField(term201, term201.getClass(), "createTimestamp", null);
        Object term204 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term204, term204.getClass(), "id", null);
        setField(term204, term204.getClass(), "body", null);
        setField(term204, term204.getClass(), "createdBy", null);
        setField(term204, term204.getClass(), "associatedNews", null);
        setField(term204, term204.getClass(), "createTimestamp", null);
        Object term205 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term205, term205.getClass(), "id", null);
        setField(term205, term205.getClass(), "body", null);
        setField(term205, term205.getClass(), "createdBy", null);
        setField(term205, term205.getClass(), "associatedNews", null);
        setField(term205, term205.getClass(), "createTimestamp", null);
        Object term206 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term206, term206.getClass(), "id", null);
        setField(term206, term206.getClass(), "body", null);
        setField(term206, term206.getClass(), "createdBy", null);
        setField(term206, term206.getClass(), "associatedNews", null);
        setField(term206, term206.getClass(), "createTimestamp", null);
        ArrayList term196 = new ArrayList();
        ((ArrayList) term196).add(term198);
        ((ArrayList) term196).add(term201);
        ((ArrayList) term196).add(term204);
        ((ArrayList) term196).add(term205);
        ((ArrayList) term196).add(term206);
        term1 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term16 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term79 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term118 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term157 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term209 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "body", "PAEBtnZtTD");
        setField(term16, term16.getClass(), "id", term17);
        setField(term16, term16.getClass(), "firstName", "sjlJAEtRrb");
        setField(term16, term16.getClass(), "lastName", "MuLcgQHgqz");
        setField(term16, term16.getClass(), "email", "xxtlPwDYFs");
        setField(term16, term16.getClass(), "password", "jJCZpVmanW");
        setField(term16, term16.getClass(), "imageUrl", "EGtDIRbSSb");
        setField(term79, term79.getClass(), "id", term80);
        setField(term79, term79.getClass(), "name", "SzjVpOQTyS");
        setField(term79, term79.getClass(), "description", "MjGYSRKTNF");
        setField(term16, term16.getClass(), "role", term79);
        setField(term16, term16.getClass(), "token", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "createdBy", term16);
        setField(term118, term118.getClass(), "id", term119);
        setField(term118, term118.getClass(), "name", "RMFIsYGgne");
        setField(term118, term118.getClass(), "content", "NRdvgJlhkX");
        setField(term118, term118.getClass(), "imageUrl", "uuaPigETmJ");
        setField(term157, term157.getClass(), "id", term158);
        setField(term157, term157.getClass(), "name", "MxlszYVzRf");
        setField(term157, term157.getClass(), "description", "LQFpaHEwXR");
        setField(term157, term157.getClass(), "imageUrl", "oVcInYnLWB");
        setField(term118, term118.getClass(), "category", term157);
        setField(term118, term118.getClass(), "comments", term196);
        setField(term1, term1.getClass(), "associatedNews", term118);
        setIntField(term209, term209.getClass(), "nanos", 18000000);
        setLongField(term209, term209.getClass(), "fastTime", 1515879330000L);
        setField(term209, term209.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "createTimestamp", term209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.repository.CommentRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Comment");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "create", argTypes, null, args);
    }

};


