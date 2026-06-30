package com.zxl.dailypractice.project.controller.req;

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
import static com.zxl.dailypractice.project.controller.req.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class UpdateAlarmSubscribeRuleReq_setClearTemplId_122351562018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3817;

    public UpdateAlarmSubscribeRuleReq_setClearTemplId_122351562018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3866 = new Integer(-1222006000);
        Integer term3923 = new Integer(2095798786);
        Integer term3925 = new Integer(-1565502840);
        Object term3918 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term3918, term3918.getClass(), "filterName", "");
        setField(term3918, term3918.getClass(), "filterType", "");
        setField(term3918, term3918.getClass(), "filterExpr", "");
        setField(term3918, term3918.getClass(), "alarmType", "");
        setField(term3918, term3918.getClass(), "isDelay", term3923);
        setField(term3918, term3918.getClass(), "delayTime", term3925);
        Integer term3932 = new Integer(344323424);
        Integer term3934 = new Integer(9726679);
        Object term3927 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term3927, term3927.getClass(), "filterName", "");
        setField(term3927, term3927.getClass(), "filterType", "");
        setField(term3927, term3927.getClass(), "filterExpr", "");
        setField(term3927, term3927.getClass(), "alarmType", "");
        setField(term3927, term3927.getClass(), "isDelay", term3932);
        setField(term3927, term3927.getClass(), "delayTime", term3934);
        ArrayList term3916 = new ArrayList();
        ((ArrayList) term3916).add(term3918);
        ((ArrayList) term3916).add(term3927);
        term3817 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term3817, term3817.getClass(), "operType", "zLMTXDQHYH");
        setField(term3817, term3817.getClass(), "ruleId", "PqywFWJlpE");
        setField(term3817, term3817.getClass(), "ruleName", "OzXRsFGTIp");
        setField(term3817, term3817.getClass(), "ruleDesc", "TjWpyghUWN");
        setField(term3817, term3817.getClass(), "ruleStatus", term3866);
        setField(term3817, term3817.getClass(), "ruleType", "dkZFDZxcde");
        setField(term3817, term3817.getClass(), "activeTemplId", "WXcZEtUKlI");
        setField(term3817, term3817.getClass(), "clearTemplId", "IkpjUOuWQU");
        setField(term3817, term3817.getClass(), "modTemplId", "boSSpezHeU");
        setField(term3817, term3817.getClass(), "filterList", term3916);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HhEaSXWvrY";
        callMethod(klass, "setClearTemplId", argTypes, term3817, args);
    }

};


