package com.alkemy.ong.infrastructure.rest.mapper.comment;

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
import static com.alkemy.ong.infrastructure.rest.mapper.comment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class CreateCommentMapper_toResponse_13400576632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;
     Object term57;

    public CreateCommentMapper_toResponse_13400576632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.CreateCommentMapper"));
        Long term58 = new Long(-8400487765614892086L);
        Long term73 = new Long(5270370404989704783L);
        Long term136 = new Long(7411271909051562686L);
        Long term175 = new Long(4872422362414183754L);
        Long term214 = new Long(6811161968424632369L);
        Long term255 = new Long(-7237588299778557629L);
        Object term254 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term254, term254.getClass(), "id", term255);
        setField(term254, term254.getClass(), "body", null);
        setField(term254, term254.getClass(), "createdBy", null);
        setField(term254, term254.getClass(), "associatedNews", null);
        setField(term254, term254.getClass(), "createTimestamp", null);
        Long term258 = new Long(-4365849114644724155L);
        Object term257 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term257, term257.getClass(), "id", term258);
        setField(term257, term257.getClass(), "body", null);
        setField(term257, term257.getClass(), "createdBy", null);
        setField(term257, term257.getClass(), "associatedNews", null);
        setField(term257, term257.getClass(), "createTimestamp", null);
        Object term260 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term260, term260.getClass(), "id", null);
        setField(term260, term260.getClass(), "body", null);
        setField(term260, term260.getClass(), "createdBy", null);
        setField(term260, term260.getClass(), "associatedNews", null);
        setField(term260, term260.getClass(), "createTimestamp", null);
        Object term261 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term261, term261.getClass(), "id", null);
        setField(term261, term261.getClass(), "body", null);
        setField(term261, term261.getClass(), "createdBy", null);
        setField(term261, term261.getClass(), "associatedNews", null);
        setField(term261, term261.getClass(), "createTimestamp", null);
        Object term262 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term262, term262.getClass(), "id", null);
        setField(term262, term262.getClass(), "body", null);
        setField(term262, term262.getClass(), "createdBy", null);
        setField(term262, term262.getClass(), "associatedNews", null);
        setField(term262, term262.getClass(), "createTimestamp", null);
        ArrayList term252 = new ArrayList();
        ((ArrayList) term252).add(term254);
        ((ArrayList) term252).add(term257);
        ((ArrayList) term252).add(term260);
        ((ArrayList) term252).add(term261);
        ((ArrayList) term252).add(term262);
        term57 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term72 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term135 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term174 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term213 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term265 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term57, term57.getClass(), "id", term58);
        setField(term57, term57.getClass(), "body", "MuLcgQHgqz");
        setField(term72, term72.getClass(), "id", term73);
        setField(term72, term72.getClass(), "firstName", "xxtlPwDYFs");
        setField(term72, term72.getClass(), "lastName", "jJCZpVmanW");
        setField(term72, term72.getClass(), "email", "EGtDIRbSSb");
        setField(term72, term72.getClass(), "password", "SzjVpOQTyS");
        setField(term72, term72.getClass(), "imageUrl", "MjGYSRKTNF");
        setField(term135, term135.getClass(), "id", term136);
        setField(term135, term135.getClass(), "name", "hRNSzYYIrc");
        setField(term135, term135.getClass(), "description", "RMFIsYGgne");
        setField(term72, term72.getClass(), "role", term135);
        setField(term72, term72.getClass(), "token", "NRdvgJlhkX");
        setField(term57, term57.getClass(), "createdBy", term72);
        setField(term174, term174.getClass(), "id", term175);
        setField(term174, term174.getClass(), "name", "uuaPigETmJ");
        setField(term174, term174.getClass(), "content", "MxlszYVzRf");
        setField(term174, term174.getClass(), "imageUrl", "LQFpaHEwXR");
        setField(term213, term213.getClass(), "id", term214);
        setField(term213, term213.getClass(), "name", "oVcInYnLWB");
        setField(term213, term213.getClass(), "description", "aJlieCFVtF");
        setField(term213, term213.getClass(), "imageUrl", "ZiaGIbnzTs");
        setField(term174, term174.getClass(), "category", term213);
        setField(term174, term174.getClass(), "comments", term252);
        setField(term57, term57.getClass(), "associatedNews", term174);
        setIntField(term265, term265.getClass(), "nanos", 18000000);
        setLongField(term265, term265.getClass(), "fastTime", 1515879330000L);
        setField(term265, term265.getClass(), "cdate", null);
        setField(term57, term57.getClass(), "createTimestamp", term265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.CreateCommentMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Comment");
        Object[] args = new Object[1];
        args[0] = term57;
        callMethod(klass, "toResponse", argTypes, term56, args);
    }

};


