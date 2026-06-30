package com.sachett.samosa.samosac.codegen.function;

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
import static com.sachett.samosa.samosac.codegen.function.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class FunctionGenerationContext_init_7013751601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1116;
     Object term1196;
     Object term1234;

    public FunctionGenerationContext_init_7013751601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1116 = newInstance(Class.forName("org.objectweb.asm.util.TraceClassVisitor"));
        Object term1117 = newInstance(Class.forName("java.io.PrintWriter"));
        Object term1120 = newInstance(Class.forName("java.util.Formatter"));
        Object term1121 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1122 = (byte[]) newByteArray(16);
        Object term1141 = newInstance(Class.forName("java.util.Locale"));
        Object term1142 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1146 = newInstance(Class.forName("java.io.IOException"));
        Object[] term1147 = (Object[]) newArray("java.lang.Object", 5);
        Object[] term1149 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term1151 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term1154 = newInstance(Class.forName("java.io.PrintStream"));
        Object term1157 = newInstance(Class.forName("java.util.Formatter"));
        Object term1158 = newInstance(Class.forName("java.lang.StringBuilder"));
        Object term1161 = newInstance(Class.forName("java.io.IOException"));
        Object term1164 = newInstance(Class.forName("java.io.BufferedWriter"));
        char[] term1165 = (char[]) newCharArray(5);
        char[] term1173 = (char[]) newCharArray(3);
        Object term1177 = newInstance(Class.forName("java.lang.Object"));
        Object term1178 = newInstance(Class.forName("java.io.OutputStreamWriter"));
        char[] term1179 = (char[]) newCharArray(7);
        Object term1187 = newInstance(Class.forName("java.lang.Object"));
        Object term1190 = newInstance(Class.forName("java.lang.Object"));
        char[] term1191 = (char[]) newCharArray(2);
        Object term1194 = newInstance(Class.forName("java.lang.Object"));
        setField(term1117, term1117.getClass(), "out", null);
        setBooleanField(term1117, term1117.getClass(), "autoFlush", false);
        setBooleanField(term1117, term1117.getClass(), "trouble", false);
        setField(term1121, term1121.getClass(), "value", term1122);
        setByteField(term1121, term1121.getClass(), "coder", (byte) 0);
        setIntField(term1121, term1121.getClass(), "count", 0);
        setField(term1120, term1120.getClass(), "a", term1121);
        setField(term1142, term1142.getClass(), "language", null);
        setField(term1142, term1142.getClass(), "script", null);
        setField(term1142, term1142.getClass(), "region", null);
        setField(term1142, term1142.getClass(), "variant", null);
        setIntField(term1142, term1142.getClass(), "hash", 106956076);
        setField(term1141, term1141.getClass(), "baseLocale", term1142);
        setField(term1141, term1141.getClass(), "localeExtensions", null);
        setIntField(term1141, term1141.getClass(), "hashCodeValue", 106956076);
        setField(term1141, term1141.getClass(), "languageTag", "");
        setField(term1120, term1120.getClass(), "l", term1141);
        setField(term1146, term1146.getClass(), "backtrace", term1147);
        setField(term1146, term1146.getClass(), "detailMessage", "");
        setField(term1146, term1146.getClass(), "cause", term1146);
        setField(term1146, term1146.getClass(), "stackTrace", term1149);
        setIntField(term1146, term1146.getClass(), "depth", 49);
        setIntField(term1151, term1151.getClass(), "modCount", 0);
        setField(term1146, term1146.getClass(), "suppressedExceptions", term1151);
        setField(term1120, term1120.getClass(), "lastException", term1146);
        setCharField(term1120, term1120.getClass(), "zero", (char) 48);
        setField(term1117, term1117.getClass(), "formatter", term1120);
        setBooleanField(term1154, term1154.getClass(), "autoFlush", false);
        setBooleanField(term1154, term1154.getClass(), "trouble", false);
        setField(term1158, term1158.getClass(), "value", null);
        setByteField(term1158, term1158.getClass(), "coder", (byte) 0);
        setIntField(term1158, term1158.getClass(), "count", 0);
        setField(term1157, term1157.getClass(), "a", term1158);
        setField(term1157, term1157.getClass(), "l", term1141);
        setField(term1161, term1161.getClass(), "backtrace", null);
        setField(term1161, term1161.getClass(), "detailMessage", null);
        setField(term1161, term1161.getClass(), "cause", term1161);
        setField(term1161, term1161.getClass(), "stackTrace", null);
        setIntField(term1161, term1161.getClass(), "depth", 54);
        setField(term1161, term1161.getClass(), "suppressedExceptions", term1151);
        setField(term1157, term1157.getClass(), "lastException", term1161);
        setCharField(term1157, term1157.getClass(), "zero", (char) 48);
        setField(term1154, term1154.getClass(), "formatter", term1157);
        setField(term1164, term1164.getClass(), "out", null);
        setCharElement(term1165, 0, 'P');
        setCharElement(term1165, 1, 'A');
        setCharElement(term1165, 2, 'E');
        setCharElement(term1165, 3, 'B');
        setCharElement(term1165, 4, 't');
        setField(term1164, term1164.getClass(), "cb", term1165);
        setIntField(term1164, term1164.getClass(), "nChars", -227365013);
        setIntField(term1164, term1164.getClass(), "nextChar", 11724947);
        setCharElement(term1173, 0, 'n');
        setCharElement(term1173, 1, 'Z');
        setCharElement(term1173, 2, 't');
        setField(term1164, term1164.getClass(), "writeBuffer", term1173);
        setField(term1164, term1164.getClass(), "lock", term1177);
        setField(term1154, term1154.getClass(), "textOut", term1164);
        setField(term1178, term1178.getClass(), "se", null);
        setCharElement(term1179, 0, 'T');
        setCharElement(term1179, 1, 'D');
        setCharElement(term1179, 2, 's');
        setCharElement(term1179, 3, 'j');
        setCharElement(term1179, 4, 'l');
        setCharElement(term1179, 5, 'J');
        setCharElement(term1179, 6, 'A');
        setField(term1178, term1178.getClass(), "writeBuffer", term1179);
        setField(term1178, term1178.getClass(), "lock", term1187);
        setField(term1154, term1154.getClass(), "charOut", term1178);
        setBooleanField(term1154, term1154.getClass(), "closing", true);
        setField(term1154, term1154.getClass(), "out", null);
        setBooleanField(term1154, term1154.getClass(), "closed", true);
        setField(term1154, term1154.getClass(), "closeLock", term1190);
        setField(term1117, term1117.getClass(), "psOut", term1154);
        setCharElement(term1191, 0, 'E');
        setCharElement(term1191, 1, 't');
        setField(term1117, term1117.getClass(), "writeBuffer", term1191);
        setField(term1117, term1117.getClass(), "lock", term1194);
        setField(term1116, term1116.getClass(), "printWriter", term1117);
        setField(term1116, term1116.getClass(), "p", null);
        setIntField(term1116, term1116.getClass(), "api", 1953277050);
        setField(term1116, term1116.getClass(), "cv", null);
        term1196 = new Integer(1283079251);
        term1234 = (Object[]) newArray("java.lang.String", 6);
        setElement(term1234, 0, "pCTimMblYc");
        setElement(term1234, 1, "hNxWaHcfhY");
        setElement(term1234, 2, "RkybSrpybU");
        setElement(term1234, 3, "xOEqzGAmDU");
        setElement(term1234, 4, "eZFUvlxvGV");
        setElement(term1234, 5, "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.codegen.function.FunctionGenerationContext");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.objectweb.asm.util.TraceClassVisitor");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[6];
        args[0] = term1116;
        args[1] = term1196;
        args[2] = "ZiaGIbnzTs";
        args[3] = "tbcdzjIfER";
        args[4] = "HyxfbSQYBe";
        args[5] = term1234;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


