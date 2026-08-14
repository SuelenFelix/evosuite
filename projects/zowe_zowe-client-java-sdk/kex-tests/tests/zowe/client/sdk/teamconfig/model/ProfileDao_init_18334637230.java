package zowe.client.sdk.teamconfig.model;

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
import static zowe.client.sdk.teamconfig.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.ArrayList;

public class ProfileDao_init_18334637230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1886;

    public ProfileDao_init_18334637230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1911 = new HashMap();
        ArrayList term1921 = new ArrayList();
        ((ArrayList) term1921).add("nJnRIRiLZK");
        ((ArrayList) term1921).add("eWnrMSbYbT");
        ((ArrayList) term1921).add("AjoFvDFyCY");
        ((ArrayList) term1921).add("OFTJwdPiTG");
        ((ArrayList) term1921).add("QiUprSEluR");
        ((ArrayList) term1921).add("cDOXXottZh");
        term1886 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1886, term1886.getClass(), "name", "YupgKTSEiI");
        setField(term1886, term1886.getClass(), "type", "HuOUlaFmvJ");
        setField(term1886, term1886.getClass(), "properties", term1911);
        setField(term1886, term1886.getClass(), "secure", term1921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("zowe.client.sdk.teamconfig.model.Profile");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term1886;
        args[1] = "rfqJDkDppz";
        args[2] = "MGorMVGauT";
        args[3] = "jXKxUGTuEF";
        args[4] = "nDCcyhiTnS";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


