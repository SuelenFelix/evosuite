package zowe.client.sdk.zosmfinfo.response;

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
import static zowe.client.sdk.zosmfinfo.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZosmfInfoResponse_toString_47312739310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4173;

    public ZosmfInfoResponse_toString_47312739310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4173 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse"));
        Object[] term4258 = (Object[]) newArray("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin", 6);
        Object term4259 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term4296 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term4333 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term4370 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term4407 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term4444 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        setField(term4173, term4173.getClass(), "zosVersion", "iljANwuEjk");
        setField(term4173, term4173.getClass(), "zosmfPort", "kNqaJKIATy");
        setField(term4173, term4173.getClass(), "zosmfVersion", "vKQukfbJUd");
        setField(term4173, term4173.getClass(), "zosmfHostName", "lFRJFUMVbx");
        setField(term4173, term4173.getClass(), "zosmfSafRealm", "sZdUNdggUW");
        setField(term4173, term4173.getClass(), "zosmfFullVersion", "OqbwYQfvAe");
        setField(term4173, term4173.getClass(), "apiVersion", "tRxZafjqIx");
        setField(term4259, term4259.getClass(), "pluginVersion", "DhjNLmRMCu");
        setField(term4259, term4259.getClass(), "pluginDefaultName", "PgPzMSEjjX");
        setField(term4259, term4259.getClass(), "pluginStatus", "wzsPSPcRdj");
        setElement(term4258, 0, term4259);
        setField(term4296, term4296.getClass(), "pluginVersion", "kGMQdqJYyB");
        setField(term4296, term4296.getClass(), "pluginDefaultName", "XJJNClzHRf");
        setField(term4296, term4296.getClass(), "pluginStatus", "HDaezxQfQR");
        setElement(term4258, 1, term4296);
        setField(term4333, term4333.getClass(), "pluginVersion", "iikZEapDlu");
        setField(term4333, term4333.getClass(), "pluginDefaultName", "nhoHrZfnIN");
        setField(term4333, term4333.getClass(), "pluginStatus", "ZkMALXpEAZ");
        setElement(term4258, 2, term4333);
        setField(term4370, term4370.getClass(), "pluginVersion", "tXfQjSqDzN");
        setField(term4370, term4370.getClass(), "pluginDefaultName", "BjugTaMcxJ");
        setField(term4370, term4370.getClass(), "pluginStatus", "vGiuZVPJNH");
        setElement(term4258, 3, term4370);
        setField(term4407, term4407.getClass(), "pluginVersion", "tlzpzIjMib");
        setField(term4407, term4407.getClass(), "pluginDefaultName", "AZdLeSugwv");
        setField(term4407, term4407.getClass(), "pluginStatus", "RMsXuyzKJV");
        setElement(term4258, 4, term4407);
        setField(term4444, term4444.getClass(), "pluginVersion", "FwPbDZcHmB");
        setField(term4444, term4444.getClass(), "pluginDefaultName", "hOncybyCAH");
        setField(term4444, term4444.getClass(), "pluginStatus", "QduALnDSVo");
        setElement(term4258, 5, term4444);
        setField(term4173, term4173.getClass(), "zosmfPluginsInfo", term4258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4173, args);
    }

};


