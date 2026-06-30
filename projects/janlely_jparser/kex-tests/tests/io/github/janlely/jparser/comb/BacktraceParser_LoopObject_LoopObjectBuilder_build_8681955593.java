package io.github.janlely.jparser.comb;

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
import static io.github.janlely.jparser.comb.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class BacktraceParser_LoopObject_LoopObjectBuilder_build_8681955593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94;

    public BacktraceParser_LoopObject_LoopObjectBuilder_build_8681955593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term97 = new ArrayList();
        term94 = newInstance(Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject$LoopObjectBuilder"));
        Object term96 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setIntField(term94, term94.getClass(), "idx", -1339778481);
        setField(term96, term96.getClass(), "result", term97);
        setField(term96, term96.getClass(), "errorMsg", "xxtlPwDYFs");
        setIntField(term96, term96.getClass(), "length", 1725571209);
        setIntField(term96, term96.getClass(), "pos", -522618178);
        setField(term94, term94.getClass(), "best", term96);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.comb.BacktraceParser$LoopObject$LoopObjectBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term94, args);
    }

};


