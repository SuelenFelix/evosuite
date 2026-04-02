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

public class UpdateCommentUseCase_update_5937866330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public UpdateCommentUseCase_update_5937866330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.alkemy.ong.application.service.comment.UpdateCommentUseCase"));
        setField(term1, term1.getClass(), "commentRepository", null);
        setField(term1, term1.getClass(), "operationAllowed", null);
        Long term3 = new Long(2442117782898005296L);
        Long term18 = new Long(6375119433582206027L);
        Long term81 = new Long(-8257434502486459194L);
        Long term120 = new Long(-8400487765614892086L);
        Long term159 = new Long(5270370404989704783L);
        Long term200 = new Long(7411271909051562686L);
        Object term199 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term199, term199.getClass(), "id", term200);
        setField(term199, term199.getClass(), "body", null);
        setField(term199, term199.getClass(), "createdBy", null);
        setField(term199, term199.getClass(), "associatedNews", null);
        setField(term199, term199.getClass(), "createTimestamp", null);
        Long term203 = new Long(8428634514691209827L);
        Object term202 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term202, term202.getClass(), "id", term203);
        setField(term202, term202.getClass(), "body", null);
        setField(term202, term202.getClass(), "createdBy", null);
        setField(term202, term202.getClass(), "associatedNews", null);
        setField(term202, term202.getClass(), "createTimestamp", null);
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
        Object term207 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term207, term207.getClass(), "id", null);
        setField(term207, term207.getClass(), "body", null);
        setField(term207, term207.getClass(), "createdBy", null);
        setField(term207, term207.getClass(), "associatedNews", null);
        setField(term207, term207.getClass(), "createTimestamp", null);
        ArrayList term197 = new ArrayList();
        ((ArrayList) term197).add(term199);
        ((ArrayList) term197).add(term202);
        ((ArrayList) term197).add(term205);
        ((ArrayList) term197).add(term206);
        ((ArrayList) term197).add(term207);
        term2 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term17 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term80 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term119 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term158 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term210 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term2, term2.getClass(), "id", term3);
        setField(term2, term2.getClass(), "body", "PAEBtnZtTD");
        setField(term17, term17.getClass(), "id", term18);
        setField(term17, term17.getClass(), "firstName", "sjlJAEtRrb");
        setField(term17, term17.getClass(), "lastName", "MuLcgQHgqz");
        setField(term17, term17.getClass(), "email", "xxtlPwDYFs");
        setField(term17, term17.getClass(), "password", "jJCZpVmanW");
        setField(term17, term17.getClass(), "imageUrl", "EGtDIRbSSb");
        setField(term80, term80.getClass(), "id", term81);
        setField(term80, term80.getClass(), "name", "SzjVpOQTyS");
        setField(term80, term80.getClass(), "description", "MjGYSRKTNF");
        setField(term17, term17.getClass(), "role", term80);
        setField(term17, term17.getClass(), "token", "hRNSzYYIrc");
        setField(term2, term2.getClass(), "createdBy", term17);
        setField(term119, term119.getClass(), "id", term120);
        setField(term119, term119.getClass(), "name", "RMFIsYGgne");
        setField(term119, term119.getClass(), "content", "NRdvgJlhkX");
        setField(term119, term119.getClass(), "imageUrl", "uuaPigETmJ");
        setField(term158, term158.getClass(), "id", term159);
        setField(term158, term158.getClass(), "name", "MxlszYVzRf");
        setField(term158, term158.getClass(), "description", "LQFpaHEwXR");
        setField(term158, term158.getClass(), "imageUrl", "oVcInYnLWB");
        setField(term119, term119.getClass(), "category", term158);
        setField(term119, term119.getClass(), "comments", term197);
        setField(term2, term2.getClass(), "associatedNews", term119);
        setIntField(term210, term210.getClass(), "nanos", 18000000);
        setLongField(term210, term210.getClass(), "fastTime", 1515879330000L);
        setField(term210, term210.getClass(), "cdate", null);
        setField(term2, term2.getClass(), "createTimestamp", term210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.comment.UpdateCommentUseCase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Comment");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "update", argTypes, term1, args);
    }

};


