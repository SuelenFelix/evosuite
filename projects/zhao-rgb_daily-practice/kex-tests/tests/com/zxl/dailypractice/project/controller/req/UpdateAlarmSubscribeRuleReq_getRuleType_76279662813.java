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

public class UpdateAlarmSubscribeRuleReq_getRuleType_76279662813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2759;

    public UpdateAlarmSubscribeRuleReq_getRuleType_76279662813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2808 = new Integer(1141317871);
        Integer term2865 = new Integer(890669485);
        Integer term2867 = new Integer(691577392);
        Object term2860 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term2860, term2860.getClass(), "filterName", "");
        setField(term2860, term2860.getClass(), "filterType", "");
        setField(term2860, term2860.getClass(), "filterExpr", "");
        setField(term2860, term2860.getClass(), "alarmType", "");
        setField(term2860, term2860.getClass(), "isDelay", term2865);
        setField(term2860, term2860.getClass(), "delayTime", term2867);
        Integer term2874 = new Integer(-893623680);
        Integer term2876 = new Integer(-1963434938);
        Object term2869 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term2869, term2869.getClass(), "filterName", "");
        setField(term2869, term2869.getClass(), "filterType", "");
        setField(term2869, term2869.getClass(), "filterExpr", "");
        setField(term2869, term2869.getClass(), "alarmType", "");
        setField(term2869, term2869.getClass(), "isDelay", term2874);
        setField(term2869, term2869.getClass(), "delayTime", term2876);
        Integer term2883 = new Integer(906181092);
        Integer term2885 = new Integer(1045657203);
        Object term2878 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term2878, term2878.getClass(), "filterName", "");
        setField(term2878, term2878.getClass(), "filterType", "");
        setField(term2878, term2878.getClass(), "filterExpr", "");
        setField(term2878, term2878.getClass(), "alarmType", "");
        setField(term2878, term2878.getClass(), "isDelay", term2883);
        setField(term2878, term2878.getClass(), "delayTime", term2885);
        Integer term2892 = new Integer(1386130016);
        Integer term2894 = new Integer(1072005683);
        Object term2887 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term2887, term2887.getClass(), "filterName", "");
        setField(term2887, term2887.getClass(), "filterType", "");
        setField(term2887, term2887.getClass(), "filterExpr", "");
        setField(term2887, term2887.getClass(), "alarmType", "");
        setField(term2887, term2887.getClass(), "isDelay", term2892);
        setField(term2887, term2887.getClass(), "delayTime", term2894);
        Integer term2901 = new Integer(1861318859);
        Integer term2903 = new Integer(1474524152);
        Object term2896 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term2896, term2896.getClass(), "filterName", "");
        setField(term2896, term2896.getClass(), "filterType", "");
        setField(term2896, term2896.getClass(), "filterExpr", "");
        setField(term2896, term2896.getClass(), "alarmType", "");
        setField(term2896, term2896.getClass(), "isDelay", term2901);
        setField(term2896, term2896.getClass(), "delayTime", term2903);
        ArrayList term2858 = new ArrayList();
        ((ArrayList) term2858).add(term2860);
        ((ArrayList) term2858).add(term2869);
        ((ArrayList) term2858).add(term2878);
        ((ArrayList) term2858).add(term2887);
        ((ArrayList) term2858).add(term2896);
        term2759 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term2759, term2759.getClass(), "operType", "qnvxzwuGKX");
        setField(term2759, term2759.getClass(), "ruleId", "EdPAvpluZg");
        setField(term2759, term2759.getClass(), "ruleName", "DzHVBMqWtE");
        setField(term2759, term2759.getClass(), "ruleDesc", "THZSpzBRYP");
        setField(term2759, term2759.getClass(), "ruleStatus", term2808);
        setField(term2759, term2759.getClass(), "ruleType", "ZfBIVGBQOE");
        setField(term2759, term2759.getClass(), "activeTemplId", "QSrDQfEsTR");
        setField(term2759, term2759.getClass(), "clearTemplId", "PsqusYmejD");
        setField(term2759, term2759.getClass(), "modTemplId", "NTWMiBEaDF");
        setField(term2759, term2759.getClass(), "filterList", term2858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRuleType", argTypes, term2759, args);
    }

};


