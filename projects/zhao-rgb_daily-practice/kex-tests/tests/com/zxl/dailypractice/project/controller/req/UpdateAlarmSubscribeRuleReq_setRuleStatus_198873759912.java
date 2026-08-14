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

public class UpdateAlarmSubscribeRuleReq_setRuleStatus_198873759912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2529;
     Object term2677;

    public UpdateAlarmSubscribeRuleReq_setRuleStatus_198873759912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2578 = new Integer(-1888585309);
        Integer term2635 = new Integer(683666002);
        Integer term2637 = new Integer(1596213415);
        Object term2630 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term2630, term2630.getClass(), "filterName", "");
        setField(term2630, term2630.getClass(), "filterType", "");
        setField(term2630, term2630.getClass(), "filterExpr", "");
        setField(term2630, term2630.getClass(), "alarmType", "");
        setField(term2630, term2630.getClass(), "isDelay", term2635);
        setField(term2630, term2630.getClass(), "delayTime", term2637);
        Integer term2644 = new Integer(-268815336);
        Integer term2646 = new Integer(-1210583429);
        Object term2639 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term2639, term2639.getClass(), "filterName", "");
        setField(term2639, term2639.getClass(), "filterType", "");
        setField(term2639, term2639.getClass(), "filterExpr", "");
        setField(term2639, term2639.getClass(), "alarmType", "");
        setField(term2639, term2639.getClass(), "isDelay", term2644);
        setField(term2639, term2639.getClass(), "delayTime", term2646);
        Integer term2653 = new Integer(-663691365);
        Integer term2655 = new Integer(339854490);
        Object term2648 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term2648, term2648.getClass(), "filterName", "");
        setField(term2648, term2648.getClass(), "filterType", "");
        setField(term2648, term2648.getClass(), "filterExpr", "");
        setField(term2648, term2648.getClass(), "alarmType", "");
        setField(term2648, term2648.getClass(), "isDelay", term2653);
        setField(term2648, term2648.getClass(), "delayTime", term2655);
        Integer term2662 = new Integer(-615654495);
        Integer term2664 = new Integer(-1476117762);
        Object term2657 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term2657, term2657.getClass(), "filterName", "");
        setField(term2657, term2657.getClass(), "filterType", "");
        setField(term2657, term2657.getClass(), "filterExpr", "");
        setField(term2657, term2657.getClass(), "alarmType", "");
        setField(term2657, term2657.getClass(), "isDelay", term2662);
        setField(term2657, term2657.getClass(), "delayTime", term2664);
        Integer term2671 = new Integer(-341962980);
        Integer term2673 = new Integer(1532716628);
        Object term2666 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term2666, term2666.getClass(), "filterName", "");
        setField(term2666, term2666.getClass(), "filterType", "");
        setField(term2666, term2666.getClass(), "filterExpr", "");
        setField(term2666, term2666.getClass(), "alarmType", "");
        setField(term2666, term2666.getClass(), "isDelay", term2671);
        setField(term2666, term2666.getClass(), "delayTime", term2673);
        ArrayList term2628 = new ArrayList();
        ((ArrayList) term2628).add(term2630);
        ((ArrayList) term2628).add(term2639);
        ((ArrayList) term2628).add(term2648);
        ((ArrayList) term2628).add(term2657);
        ((ArrayList) term2628).add(term2666);
        term2529 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term2529, term2529.getClass(), "operType", "NHbOFFjyVK");
        setField(term2529, term2529.getClass(), "ruleId", "zaloBqlrSo");
        setField(term2529, term2529.getClass(), "ruleName", "vvoLrMGCoN");
        setField(term2529, term2529.getClass(), "ruleDesc", "pXdglvyrQe");
        setField(term2529, term2529.getClass(), "ruleStatus", term2578);
        setField(term2529, term2529.getClass(), "ruleType", "OcfNzHYdki");
        setField(term2529, term2529.getClass(), "activeTemplId", "uPuCVuZYOI");
        setField(term2529, term2529.getClass(), "clearTemplId", "TweMFhxNdj");
        setField(term2529, term2529.getClass(), "modTemplId", "NBrvVzvQHe");
        setField(term2529, term2529.getClass(), "filterList", term2628);
        term2677 = new Integer(-1801760683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2677;
        callMethod(klass, "setRuleStatus", argTypes, term2529, args);
    }

};


