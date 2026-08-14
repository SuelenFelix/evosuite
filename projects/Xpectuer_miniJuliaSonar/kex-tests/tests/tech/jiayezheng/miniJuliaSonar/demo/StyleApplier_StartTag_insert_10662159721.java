package tech.jiayezheng.miniJuliaSonar.demo;

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
import static tech.jiayezheng.miniJuliaSonar.demo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class StyleApplier_StartTag_insert_10662159721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6166;

    public StyleApplier_StartTag_insert_10662159721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6230 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term6229 = ((Class) term6230).getDeclaredField((String) "ATTRIBUTE");
        ((Field) term6229).setAccessible(true);
        Object enum20 = ((Field) term6229).get((Object) null);
        ArrayList term6220 = new ArrayList();
        ((ArrayList) term6220).add("");
        ((ArrayList) term6220).add("");
        ((ArrayList) term6220).add("");
        ((ArrayList) term6220).add("");
        ((ArrayList) term6220).add("");
        term6166 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier$StartTag"));
        Object term6168 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term6166, term6166.getClass(), "this$0", null);
        setIntField(term6166, term6166.getClass(), "offset", 1240914516);
        setField(term6168, term6168.getClass(), "type", enum20);
        setIntField(term6168, term6168.getClass(), "start", -1465035361);
        setIntField(term6168, term6168.getClass(), "end", 1090617576);
        setField(term6168, term6168.getClass(), "message", "PHvxnGHptP");
        setField(term6168, term6168.getClass(), "url", "TimdotUuNC");
        setField(term6168, term6168.getClass(), "id", "PkWMRdJcBb");
        setField(term6168, term6168.getClass(), "highlight", term6220);
        setField(term6166, term6166.getClass(), "style", term6168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier$StartTag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "insert", argTypes, term6166, args);
    }

};


